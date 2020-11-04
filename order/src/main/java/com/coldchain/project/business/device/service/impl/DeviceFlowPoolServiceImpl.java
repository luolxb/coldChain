package com.coldchain.project.business.device.service.impl;

import com.coldchain.common.utils.date.DateUtils;
import com.coldchain.common.utils.text.Convert;
import com.coldchain.project.business.card.domain.IndexFlowOrderDeviceCountVo;
import com.coldchain.project.business.device.domain.DeviceFlowPool;
import com.coldchain.project.business.device.mapper.DeviceFlowPoolMapper;
import com.coldchain.project.business.device.service.IDeviceFlowPoolService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 设备流量池Service业务层处理
 *
 * @author nts
 * @date 2019-11-23
 */
@Service
public class DeviceFlowPoolServiceImpl implements IDeviceFlowPoolService {
    @Autowired
    private DeviceFlowPoolMapper deviceFlowPoolMapper;

    /**
     * 查询设备流量池
     *
     * @param flowPoolId 设备流量池ID
     * @return 设备流量池
     */
    @Override
    public DeviceFlowPool selectDeviceFlowPoolById(Long flowPoolId) {
        return deviceFlowPoolMapper.selectDeviceFlowPoolById(flowPoolId);
    }

    /**
     * 查询设备流量池列表
     *
     * @param deviceFlowPool 设备流量池
     * @return 设备流量池
     */
    @Override
    public List<DeviceFlowPool> selectDeviceFlowPoolList(DeviceFlowPool deviceFlowPool) {
        return deviceFlowPoolMapper.selectDeviceFlowPoolList(deviceFlowPool);
    }

    /**
     * 新增设备流量池
     *
     * @param deviceFlowPool 设备流量池
     * @return 结果
     */
    @Override
    public int insertDeviceFlowPool(DeviceFlowPool deviceFlowPool) {
        deviceFlowPool.setCreateTime(DateUtils.getNowDate());
        return deviceFlowPoolMapper.insertDeviceFlowPool(deviceFlowPool);
    }

    /**
     * 修改设备流量池
     *
     * @param deviceFlowPool 设备流量池
     * @return 结果
     */
    @Override
    public int updateDeviceFlowPool(DeviceFlowPool deviceFlowPool) {
        deviceFlowPool.setUpdateTime(DateUtils.getNowDate());
        return deviceFlowPoolMapper.updateDeviceFlowPool(deviceFlowPool);
    }

    /**
     * 删除设备流量池对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteDeviceFlowPoolByIds(String ids) {
        return deviceFlowPoolMapper.deleteDeviceFlowPoolByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除设备流量池信息
     *
     * @param flowPoolId 设备流量池ID
     * @return 结果
     */
    @Override
    public int deleteDeviceFlowPoolById(Long flowPoolId) {
        return deviceFlowPoolMapper.deleteDeviceFlowPoolById(flowPoolId);
    }

    /**
     * 根据设备ID查询
     *
     * @param deviceId 设备ID
     * @return 结果
     */
    @Override
    public DeviceFlowPool queryByDeviceId(Long deviceId) {
        return deviceFlowPoolMapper.queryByDeviceId(deviceId);
    }

    /**
     * 获取流量信息,流量订单数，设备数量
     */
    @Override
    public IndexFlowOrderDeviceCountVo getFlowOrderDeviceCount(Long companyId) {
        return deviceFlowPoolMapper.getFlowOrderDeviceCount(companyId);
    }

    /**
     * 获取最近七天购买流量订单数量
     *
     * @return
     */
    @Override
    public List<Map<String, Object>> getBuyFlowOrderCount(Long userId) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        //过去七天
        c.setTime(new Date());
        c.add(Calendar.DATE, -7);
        Date d = c.getTime();
        String startDate = format.format(d);

        List<Map<String, Object>> buyFlowOrderCount = deviceFlowPoolMapper.getBuyFlowOrderCount(userId, startDate);

        // 新建容器 存放新数据
        List<Map<String, Object>> buyFlowOrderCount1 = new ArrayList<>();
        if (buyFlowOrderCount == null || buyFlowOrderCount.size() == 0) {
            for (int i = 0; i < 8; i++) {
                Map<String, Object> map = new HashMap<>();

                Calendar calendar = Calendar.getInstance();
                Date parse = format.parse(startDate);
                calendar.setTime(parse);
                calendar.add(Calendar.DATE, i);
                Date time = calendar.getTime();
                String date1 = format.format(time);
                map.put("date", date1);
                map.put("sum", null);
                buyFlowOrderCount1.add(map);
            }
        } else {

            // 遍历 获取到数据
            for (int j = 0; j < buyFlowOrderCount.size(); j++) {
                // 计算最后一条数据到现在
                if (StringUtils.equals((String) buyFlowOrderCount.get(j).get("date"), (String) buyFlowOrderCount.get(buyFlowOrderCount.size() - 1).get("date"))) {
                    Long monthNum = getDayNum(format.parse(startDate), new Date());
                    if (monthNum <= 1) {
                        buyFlowOrderCount1.add(buyFlowOrderCount.get(j));
                        continue;
                    }

                    for (int i = 0; i < monthNum + 1; i++) {
                        Map<String, Object> map = new HashMap<>();

                        Calendar calendar = Calendar.getInstance();
                        Date parse = format.parse(startDate);
                        calendar.setTime(parse);
                        calendar.add(Calendar.DATE, i);
                        Date time = calendar.getTime();
                        String date1 = format.format(time);
                        if (StringUtils.equals(date1, startDate)) {
                            map.put("sum", buyFlowOrderCount.get(buyFlowOrderCount.size() - 1).get("sum"));
                        } else {
                            map.put("sum", null);
                        }
                        map.put("date", date1);
                        buyFlowOrderCount1.add(map);
                    }
                    break;
                }

                String date = (String) buyFlowOrderCount.get(j).get("date");
                Long monthNum = getDayNum(format.parse(startDate), format.parse(date));

                for (int i = 0; i < monthNum; i++) {
                    Map<String, Object> map = new HashMap<>();
                    Calendar calendar = Calendar.getInstance();
                    Date parse = format.parse(startDate);
                    calendar.setTime(parse);
                    calendar.add(Calendar.DATE, i);
                    Date time = calendar.getTime();
                    String date1 = format.format(time);
                    map.put("date", date1);
                    map.put("sum", null);

                    buyFlowOrderCount1.add(map);
                }
                buyFlowOrderCount1.add(buyFlowOrderCount.get(j));

                Calendar calendar = Calendar.getInstance();
                Date parse = format.parse((String) buyFlowOrderCount.get(j).get("date"));
                calendar.setTime(parse);
                calendar.add(Calendar.DATE, 1);
                Date time = calendar.getTime();
                startDate = format.format(time);
            }
        }

        return buyFlowOrderCount1;

    }

    private static Long getDayNum(Date start, Date end) {
        long diff = end.getTime() - start.getTime();
        long nd = 1000 * 24 * 60 * 60;
        return diff / nd;
    }


}
