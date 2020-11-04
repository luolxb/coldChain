package com.coldchain.task;

import cn.hutool.core.date.DateUtil;
import com.alibaba.fastjson.JSON;
import com.coldchain.entity.CpDevice;
import com.coldchain.entity.CpDeviceEs;
import com.coldchain.service.CpDeviceEsService;
import com.coldchain.service.CpDeviceService;
import com.coldchain.utils.RedisUtils;
import com.common.utils.RedisKey;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Component
@EnableScheduling
public class DeviceTrackTask {

    @Autowired
    private RedisUtils redisUtils;

    @Autowired
    private CpDeviceService cpDeviceService;

    @Autowired
    private CpDeviceEsService cpDeviceEsService;

    /**
     * 每小时15分钟 将redis 中的数据保存到es中，然后删除redis数据
     */
    @Scheduled(cron = "0 15 * * * ?")
    public void execute() {
        Calendar calendar = Calendar.getInstance();
        String key;
        //获得当前的小时
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        // 当前是0点，也就意味着应该查看上一天23点的时段
        if (hour == 0) {
            key = DateUtil.yesterday().toString("yyyy-MM-dd") + "-23";
        } else {
            int date = calendar.get(Calendar.HOUR_OF_DAY) - 1;
            String dateStr;
            if (date < 10) {
                dateStr = "0" + date;
            } else {
                dateStr = String.valueOf(date);
            }
            key = DateUtil.format(calendar.getTime(), "yyyy-MM-dd") + "-" + dateStr;
        }
        log.info("将轨迹信息存储到es中key=" + key);
        // 获取所有的设备
        List<CpDevice> list = cpDeviceService.list();

        List<Long> longList = list.stream().map(CpDevice::getId).collect(Collectors.toList());
        // 根据key查询出来缓存中的记录
        List<String> keys = new ArrayList<>();
        for (Long id : longList) {
            String redisKey = RedisKey.COLD_DEVICE_TRACK + key + ":" + id;
            keys.add(redisKey);
        }

        if (!CollectionUtils.isEmpty(keys)) {
            for (String item : keys) {
                String id = item.split(":")[3];
                // 获取redis的数据
                List<CpDevice> deviceList = JSON.parseArray((String) redisUtils.get(item), CpDevice.class);
                CpDeviceEs cpDeviceEs = new CpDeviceEs();
                cpDeviceEs.setDeviceList(deviceList);
                cpDeviceEs.setId(key + "." + id);

                // 删除redis 缓存
                redisUtils.del(item);

                // 保存到es
                if (!CollectionUtils.isEmpty(deviceList)) {
                    log.info("before.将轨迹信息存储到es中key=>{},,保存信息=>{}", key, cpDeviceEs);
                    cpDeviceEsService.save(cpDeviceEs);
                    log.info("after.将轨迹信息存储到es中key=>{},,保存信息=>{}", key, cpDeviceEs);
                }
            }
        }
    }

}
