package com.coldchain.service.impl;

import cn.hutool.core.date.DateUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coldchain.dao.CpTriggerDataMapper;
import com.coldchain.entity.CpDevice;
import com.coldchain.entity.CpSensorData;
import com.coldchain.entity.CpTriggerData;
import com.coldchain.entity.vo.AlarmInfoDto;
import com.coldchain.entity.vo.AlarmRecordVo;
import com.coldchain.entity.vo.CpTriggerDataDo;
import com.coldchain.entity.vo.CpTriggerDataVo;
import com.coldchain.service.CpDeviceService;
import com.coldchain.service.CpTriggerDataService;
import com.common.utils.*;
import com.common.vo.SBApi;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

/**
 * 触发器报警记录表(CpTriggerData)表服务实现类
 *
 * @author chenqingshan
 * @since 2020-10-12 11:16:27
 */
@Service("cpTriggerDataService")
public class CpTriggerDataServiceImpl extends ServiceImpl<CpTriggerDataMapper, CpTriggerData> implements CpTriggerDataService {

    @Autowired
    private CpDeviceService cpDeviceService;
    @Autowired
    private RedisUtil redisUtil;

    @Override
    public List<CpTriggerDataVo> getCpTriggerDataHistoryByMonth(String sensorId) {
        return this.baseMapper.getCpTriggerDataHistoryByMonth(sensorId);
    }


    @Override
    public SBApi getAlarmsHistory(AlarmInfoDto alarmInfoDto) {
        SBApi sbApi = new SBApi();
        String uri = "https://app.dtuip.com/api/device/getAlarmsHistory";
        JSONObject paramBody = JSONObject.parseObject(alarmInfoDto.toString());
        String res = HttpClientUtil.doPost(uri, TLinkUtil.getHeader(), paramBody);
        com.alibaba.fastjson.JSONObject jsonRes = JSON.parseObject(res);
        if (!jsonRes.containsKey(TLinkUtil.FLAG)) {
            sbApi.setStatus(-1);
            sbApi.setResult(res);
            return sbApi;
        }
        if (TLinkUtil.SUCCESS_FLAG.equals(jsonRes.get(TLinkUtil.FLAG).toString())) {
            JSONArray array = jsonRes.getJSONArray("dataList");
            for (int i = 0; i < array.size(); i++) {
                String id = array.getJSONObject(i).getLong("id") + "";
                CpTriggerData cpTriggerData = this.getById(id);
                if (cpTriggerData == null) {
                    cpTriggerData = new CpTriggerData();
                    cpTriggerData.setId(array.getJSONObject(i).getLong("id") + "");
                    cpTriggerData.setTriggerId(array.getJSONObject(i).getLong("alarmsId") + "");
                    cpTriggerData.setSensorId(array.getJSONObject(i).getLong("sensorId") + "");
                    cpTriggerData.setSensorName(array.getJSONObject(i).getString("sensorName"));
                    cpTriggerData.setSmgStatus(array.getJSONObject(i).getInteger("status"));
                    cpTriggerData.setTriggerContent(array.getJSONObject(i).getString("triggerContent"));
                    cpTriggerData.setTrggerDate(array.getJSONObject(i).getSqlDate("triggerDate"));
                    cpTriggerData.setTriggerEmail(array.getJSONObject(i).getString("triggerEmail"));
                    cpTriggerData.setTriggerMobile(array.getJSONObject(i).getString("triggerMobile"));
                    cpTriggerData.setTriggerWechat(array.getJSONObject(i).getString("triggerWeChat"));
                    cpTriggerData.setTriggerVal(array.getJSONObject(i).getString("triggerVal"));
                    cpTriggerData.setUserId(array.getJSONObject(i).getLong("userId") + "");
                    save(cpTriggerData);
                }

            }
            sbApi.setResult(res);
            return sbApi;
        } else {
            sbApi.setStatus(-1);
            sbApi.setResult(res);
            return sbApi;
        }
    }

    @Override
    public void getDeviceData() {
        String selData = redisUtil.getData("LastQueryTime");
        if (StringUtils.isEmpty(selData)) {
            redisUtil.addRedis("LastQueryTime", DateUtil.now());
        }
        List<CpDevice> cpDeviceList = cpDeviceService.list();
        //将当前时间存入redis用于筛选报警记录
        cpDeviceList.forEach(cpDevice -> {
            getDeviceAlarmInfoByDevice(cpDevice, selData);

        });
        //执行完一次采集后更新最后一次采集时间
        if (StringUtils.isEmpty(selData)) {
            redisUtil.addRedis("LastQueryTime", DateUtil.now());
        } else {
            redisUtil.updateRedis("LastQueryTime", DateUtil.now());
        }

    }

    /**
     * 报警记录
     *
     * @param deviceId
     * @return
     */
    @Override
    public Page<AlarmRecordVo> alarmRecord(String deviceId, Integer page, Integer size) {
        Page<AlarmRecordVo> alarmRecordVoPage = new Page<>(page, size);
        List<AlarmRecordVo> alarmRecordVoList = this.baseMapper.alarmRecord(alarmRecordVoPage, deviceId);
        if (!CollectionUtils.isEmpty(alarmRecordVoList)) {
            alarmRecordVoList.forEach(alarmRecordVo -> {
                if (org.apache.commons.lang3.StringUtils.isNotBlank(alarmRecordVo.getTriggerEmail())) {
                    alarmRecordVo.setType("邮箱报警");
                } else if (org.apache.commons.lang3.StringUtils.isNotBlank(alarmRecordVo.getTriggerMobile())) {
                    alarmRecordVo.setType("短信报警");
                } else if (org.apache.commons.lang3.StringUtils.isNotBlank(alarmRecordVo.getTriggerWechat())) {
                    alarmRecordVo.setType("微信报警");
                }
            });
        }
        return alarmRecordVoPage.setRecords(alarmRecordVoList);
    }

    private void getDeviceAlarmInfoByDevice(CpDevice cpDevice, String selData) {

        String uri = "https://app.dtuip.com/api/alarms/getAlarmsHistory";
        JSONObject paramBody = new JSONObject();
        paramBody.put("deviceId", cpDevice.getDeviceId());
        paramBody.put("userId", TLinkUtil.UserId);
        paramBody.put("currPage", 1);
        paramBody.put("pageSize", 50);
        String res = HttpClientUtil.doPost(uri, TLinkUtil.getHeader(), paramBody);
        com.alibaba.fastjson.JSONObject jsonObject2 = JSONObject.parseObject(res);

        if (!jsonObject2.containsKey(TLinkUtil.FLAG)) {
            return;
        }
        if (TLinkUtil.SUCCESS_FLAG.equals(jsonObject2.get(TLinkUtil.FLAG).toString())) {
            JSONArray alarmJSONList = jsonObject2.getJSONArray("dataList");
            List<CpTriggerDataDo> cpTriggerDataList = JSONObject.parseArray(alarmJSONList.toJSONString(), CpTriggerDataDo.class);

            cpTriggerDataList.forEach(cpTriggerDataDo -> {
                try {
                    CpTriggerData cpTriggerData = new CpTriggerData();
                    BeanUtils.copyProperties(cpTriggerDataDo, cpTriggerData);
                    cpTriggerData.setId(StringUtil.createUUID());
                    cpTriggerData.setSmgStatus(cpTriggerDataDo.getStatus());
                    cpTriggerData.setTriggerId(cpTriggerDataDo.getAlarmsId());
                    cpTriggerData.setTrggerDate(DateUtils.getCheckDate(cpTriggerDataDo.getTriggerDate(), "yyyy-MM-dd HH:mm:ss"));
                    cpTriggerData.setCreateDate(new Date());
                    if (StringUtils.isEmpty(selData)) {
                        this.baseMapper.insert(cpTriggerData);
                    } else {
                        //如果采集数据的时间比最后一次采集的时间晚，则保存
                        if (!DateUtils.compare(cpTriggerDataDo.getTriggerDate(), selData)) {
                            this.baseMapper.insert(cpTriggerData);
                        }
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            });


        }
    }
}