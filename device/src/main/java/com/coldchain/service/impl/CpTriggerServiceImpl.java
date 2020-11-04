package com.coldchain.service.impl;

import cn.hutool.core.date.DateUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coldchain.dao.CpTriggerMapper;
import com.coldchain.entity.CpDevice;
import com.coldchain.entity.CpSensor;
import com.coldchain.entity.CpTrigger;
import com.coldchain.entity.vo.*;
import com.coldchain.service.CpDeviceService;
import com.coldchain.service.CpSensorService;
import com.coldchain.service.CpTriggerService;
import com.common.utils.HttpClientUtil;
import com.common.utils.StringUtil;
import com.common.utils.TLinkUtil;
import com.common.vo.SBApi;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import sun.rmi.runtime.NewThreadAction;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

/**
 * (CpTrigger)表服务实现类
 *
 * @author chenqingshan
 * @since 2020-10-12 09:11:47
 */
@Service("cpTriggerService")
public class CpTriggerServiceImpl extends ServiceImpl<CpTriggerMapper, CpTrigger> implements CpTriggerService {

    @Autowired
    private CpDeviceService cpDeviceService;
    @Autowired
    private CpSensorService cpSensorService;
    @Override
    public SBApi addAlarms(TriggerVo alarmInfoVo) {

        SBApi sbApi = new SBApi();
        //获取设备信息和传感器信息
        LinkAlarmDto linkAlarmDto = new LinkAlarmDto();
        BeanUtils.copyProperties(alarmInfoVo,linkAlarmDto);
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("device_id",alarmInfoVo.getDeviceId());
        CpDevice cpDevice = cpDeviceService.getOne(queryWrapper);
        QueryWrapper queryWrapper2 = new QueryWrapper();
        queryWrapper2.eq("sensor_id",alarmInfoVo.getSensorId());
        CpSensor cpSensor = cpSensorService.getOne(queryWrapper2);
        linkAlarmDto.setDeviceId(cpDevice.getDeviceId());
        linkAlarmDto.setSensorId(Long.parseLong(cpSensor.getSensorId().toString()));
        linkAlarmDto.setUserId(Long.parseLong(TLinkUtil.getTLinkUserId()));
        String uri = "https://app.dtuip.com/api/alarms/addAlarms";
        JSONObject paramBody=JSONObject.parseObject(JSON.toJSONString(linkAlarmDto));
        String res = HttpClientUtil.doPost(uri, TLinkUtil.getHeader(), paramBody);
        com.alibaba.fastjson.JSONObject jsonRes = JSON.parseObject(res);
        if (TLinkUtil.SUCCESS_FLAG.equals(jsonRes.get(TLinkUtil.FLAG).toString())) {

            CpTrigger cpTrigger = new CpTrigger();
            BeanUtils.copyProperties(alarmInfoVo,cpTrigger);
            cpTrigger.setId(StringUtil.createUUID());
            cpTrigger.setDeviceId(alarmInfoVo.getLocalDeviceId());
            cpTrigger.setSensorId(alarmInfoVo.getLocalSensorId());
            cpTrigger.setLinkDeviceId(cpDevice.getDeviceId());
            cpTrigger.setLinkSensorId(Long.parseLong(cpSensor.getSensorId().toString()));
            cpTrigger.setCreateDate(new Date());
            cpTrigger.setLinkUserId(Long.parseLong(TLinkUtil.getTLinkUserId()));
            this.baseMapper.insert(cpTrigger);
            sbApi.setResult(res);
            return sbApi;
        } else {
            sbApi.setStatus(-1);
            sbApi.setResult(res);
            return sbApi;
        }
    }

    @Override
    public SBApi updateAlarms(TriggerVo alarmInfoVo) {
        SBApi sbApi = new SBApi();
        String uri = "https://app.dtuip.com/api/alarms/updateAlarms";
        String s = JSON.toJSONString(alarmInfoVo);
        JSONObject paramBody = JSONObject.parseObject(s);
        paramBody.put("userId",TLinkUtil.getTLinkUserId());
        String res = HttpClientUtil.doPost(uri, TLinkUtil.getHeader(), paramBody);
        com.alibaba.fastjson.JSONObject jsonRes = JSON.parseObject(res);
        if (TLinkUtil.SUCCESS_FLAG.equals(jsonRes.get(TLinkUtil.FLAG).toString())) {
            CpTrigger trigger = baseMapper.selectById(alarmInfoVo.getId());
            trigger.setId(alarmInfoVo.getId());
            trigger.setLinkUserId(alarmInfoVo.getUserId());
            trigger.setDeviceId(alarmInfoVo.getDeviceId().toString());
            trigger.setSensorId(alarmInfoVo.getSensorId().toString());
            trigger.setAlarmType(alarmInfoVo.getAlarmType());
            trigger.setHeightValue(alarmInfoVo.getHeightValue());
            trigger.setBelowValue(alarmInfoVo.getBelowValue());
            trigger.setDuration(alarmInfoVo.getDuration());
            trigger.setTargetModel(alarmInfoVo.getTargetModel());
            trigger.setContacts(alarmInfoVo.getContacts());
            trigger.setIsForward(alarmInfoVo.getIsForward());
            trigger.setForwardDeviceId(alarmInfoVo.getForwardDeviceId());
            trigger.setForwardDataType(alarmInfoVo.getForwardDataType());
            trigger.setForwardLinkType(alarmInfoVo.getForwardLinkType());
            trigger.setForwardValue(alarmInfoVo.getForwardValue());
            trigger.setTipMsg(alarmInfoVo.getTipMsg());

            baseMapper.updateById(trigger);
            sbApi.setResult(res);
            return sbApi;
        } else {
            sbApi.setStatus(-1);
            sbApi.setResult(res);
            return sbApi;
        }
    }

    @Override
    public SBApi deleteAlarms(String alarmId,String userId) {
        SBApi sbApi = new SBApi();
        String uri = "https://app.dtuip.com/api/alarms/deleteAlarms";
        JSONObject paramBody = new JSONObject();
        paramBody.put("id", alarmId);
        paramBody.put("userId",userId);
        String res = HttpClientUtil.doPost(uri, TLinkUtil.getHeader(), paramBody);
        com.alibaba.fastjson.JSONObject jsonRes = JSON.parseObject(res);
        if (TLinkUtil.SUCCESS_FLAG.equals(jsonRes.get(TLinkUtil.FLAG).toString())) {
            baseMapper.deleteById(alarmId);
            sbApi.setResult(res);
            return sbApi;
        } else {
            sbApi.setStatus(-1);
            sbApi.setResult(res);
            return sbApi;
        }
    }

    @Override
    public SBApi activeAlarms(ActiveAlarmVo activeAlarmVo) {
        SBApi sbApi = new SBApi();
        String uri = "https://app.dtuip.com/api/alarms/activeAlarms";
        JSONObject paramBody = new JSONObject();
        paramBody.put("userId", activeAlarmVo.getUserId());
        paramBody.put("id",activeAlarmVo.getAlarmId());
        paramBody.put("active",activeAlarmVo.getActive());
        String res = HttpClientUtil.doPost(uri, TLinkUtil.getHeader(), paramBody);
        com.alibaba.fastjson.JSONObject jsonRes = JSON.parseObject(res);
        if (TLinkUtil.SUCCESS_FLAG.equals(jsonRes.get(TLinkUtil.FLAG).toString())) {
            CpTrigger trigger = this.baseMapper.selectById(activeAlarmVo.getAlarmId());
            trigger.setStatus(activeAlarmVo.getActive());
            baseMapper.updateById(trigger);
            sbApi.setResult(res);
            return sbApi;
        } else {
            sbApi.setStatus(-1);
            sbApi.setResult(res);
            return sbApi;
        }
    }

    @Override
    public SBApi getAlarms(AlarmInfoDto alarmInfoDto) {
        SBApi sbApi = new SBApi();
        String uri = "https://app.dtuip.com/api/alarms/getAlarms";
        JSONObject paramBody = new JSONObject();
        paramBody.put("userId", TLinkUtil.getTLinkUserId());
        paramBody.put("deviceId", alarmInfoDto.getDeviceId());
        paramBody.put("sensorId", alarmInfoDto.getSensorId());
        paramBody.put("currPage", alarmInfoDto.getCurrPage());
        paramBody.put("pageSize", alarmInfoDto.getPageSize()) ;
        String res = HttpClientUtil.doPost(uri, TLinkUtil.getHeader(), paramBody);
        com.alibaba.fastjson.JSONObject jsonRes = JSON.parseObject(res);
        if (TLinkUtil.SUCCESS_FLAG.equals(jsonRes.get(TLinkUtil.FLAG).toString())) {
            sbApi.setResult(res);
            JSONArray array = jsonRes.getJSONArray("dataList");
            for(int i=0;i<array.size();i++) {
                String id = array.getJSONObject(i).getLong("id")+"";
                CpTrigger cpTrigger = this.getById(id);
                if(cpTrigger == null) {
                    cpTrigger = new CpTrigger();
                    cpTrigger.setId(id);
                    cpTrigger.setLinkUserId(array.getJSONObject(i).getLong("userId"));
                    cpTrigger.setLinkDeviceId(array.getJSONObject(i).getLong("deviceId"));
                    cpTrigger.setLinkSensorId(array.getJSONObject(i).getLong("sensorId"));
                    cpTrigger.setAlarmType(array.getJSONObject(i).getInteger("alarmType"));
                    cpTrigger.setHeightValue(array.getJSONObject(i).getInteger("heightValue"));
                    cpTrigger.setBelowValue(array.getJSONObject(i).getInteger("belowValue"));
                    cpTrigger.setDuration(array.getJSONObject(i).getInteger("duration"));
                    cpTrigger.setTargetModel(array.getJSONObject(i).getInteger("targetModel"));
                    cpTrigger.setContacts(array.getJSONObject(i).getString("contacts")+"");
                    cpTrigger.setIsForward(array.getJSONObject(i).getInteger("isForward"));
                    cpTrigger.setForwardDeviceId(array.getJSONObject(i).getString("forwardDeviceId"));
                    cpTrigger.setForwardSensorId(array.getJSONObject(i).getString("forwardSensorId"));
                    cpTrigger.setForwardDataType(array.getJSONObject(i).getString("forwardDataType"));
                   //cpTrigger.setForwardLinkType(array.getJSONObject(i).getString("forwardLinkType"));
                    cpTrigger.setForwardValue(array.getJSONObject(i).getString("forwardValue"));
                    cpTrigger.setTipMsg(array.getJSONObject(i).getString("tipMsg"));
                    save(cpTrigger);
                }
                return sbApi;

            }
            return sbApi;
        } else {
            sbApi.setStatus(-1);
            sbApi.setResult(res);
            return sbApi;
        }
    }

    @Override
    public SBApi getLocalAlarms(AlarmInfoDto alarmInfoDto) {
        SBApi sbApi = new SBApi();
        QueryWrapper<CpTrigger> wrapper= new QueryWrapper<CpTrigger>();
        if(null!=alarmInfoDto.getDeviceId())
             wrapper.or().eq("device_id",alarmInfoDto.getDeviceId());
        if(null!=alarmInfoDto.getSensorId())
             wrapper.or().eq("sensor_id",alarmInfoDto.getSensorId());
        List<CpTrigger> list= baseMapper.selectList(wrapper);
        if(null!=list){
            sbApi.setResult(list);
        }else{
            sbApi.setStatus(-1);
        }
        return sbApi;
    }

    @Override
    public SBApi getAlarmsHistory( AlarmHistoryInfoDto alarmHistoryInfoDto) {
        SBApi sbApi = new SBApi();
        String uri = "https://app.dtuip.com/api/alarms/getAlarms";
        JSONObject paramBody = new JSONObject();
        paramBody.put("userId", alarmHistoryInfoDto.getUserId());
        paramBody.put("deviceId", alarmHistoryInfoDto.getDeviceId());
        paramBody.put("sensorId", alarmHistoryInfoDto.getSensorId());
        paramBody.put("currPage", alarmHistoryInfoDto.getCurrPage());
        paramBody.put("pageSize", alarmHistoryInfoDto.getPageSize()) ;
        String res = HttpClientUtil.doPost(uri, TLinkUtil.getHeader(), paramBody);
        com.alibaba.fastjson.JSONObject jsonRes = JSON.parseObject(res);
        if (TLinkUtil.SUCCESS_FLAG.equals(jsonRes.get(TLinkUtil.FLAG).toString())) {
            sbApi.setResult(res);
            return sbApi;
        } else {
            sbApi.setStatus(-1);
            sbApi.setResult(res);
            return sbApi;
        }
    }

}