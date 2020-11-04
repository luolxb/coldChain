package com.coldchain.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPObject;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coldchain.dao.CpSensorDataMapper;
import com.coldchain.entity.CpDevice;
import com.coldchain.entity.CpSensor;
import com.coldchain.dao.CpSensorMapper;
import com.coldchain.entity.CpSensorData;
import com.coldchain.entity.vo.CpDeviceRq;
import com.coldchain.entity.vo.SensorHistroyDto;
import com.coldchain.entity.vo.SingleDeviceDatasDto;
import com.coldchain.entity.vo.SingleSensorDatasDto;
import com.coldchain.service.CpDeviceService;
import com.coldchain.service.CpSensorService;
import com.common.dto.CpSensorDataDto;
import com.common.utils.HttpClientUtil;
import com.common.utils.StringUtil;
import com.common.utils.TLinkUtil;
import com.common.vo.SBApi;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 传感器表(CpSensor)表服务实现类
 *
 * @author chenqingshan
 * @since 2020-10-10 11:49:30
 */
@Service("cpSensorService")
public class CpSensorServiceImpl extends ServiceImpl<CpSensorMapper, CpSensor> implements CpSensorService {


    @Autowired
    private CpDeviceService cpDeviceService;

    @Override
    public SBApi getSingleDeviceDatas(SingleDeviceDatasDto singleDeviceDatasDto) {
        SBApi sbApi = new SBApi();
        String uri = "https://app.dtuip.com/api/device/getSingleDeviceDatas";
        JSONObject paramBody = new JSONObject();
        paramBody.put("deviceId", singleDeviceDatasDto.getDeviceId());
        paramBody.put("deviceNo", singleDeviceDatasDto.getDeviceNo());
        paramBody.put("currPage", singleDeviceDatasDto.getPage());
        paramBody.put("pageSize", singleDeviceDatasDto.getSize());
        paramBody.put("userId", singleDeviceDatasDto.getUserId());
        String res = HttpClientUtil.doPost(uri, TLinkUtil.getHeader(), paramBody);
        com.alibaba.fastjson.JSONObject jsonRes = JSONObject.parseObject(res);
        if (TLinkUtil.SUCCESS_FLAG.equals(jsonRes.get(TLinkUtil.FLAG).toString())) {
            JSONArray dataList = (JSONArray) jsonRes.get("dataList");
            List<CpDevice> deviceList = JSONObject.parseArray(dataList.toJSONString(), CpDevice.class);

            deviceList.forEach(cpDevice -> {
                cpDevice.setDeviceId(Long.parseLong(cpDevice.getId() + ""));
                cpDevice.setId(null);
                UpdateWrapper<CpDevice> wrapper = new UpdateWrapper<>();
                wrapper.eq("device_id", cpDevice.getDeviceId());
                cpDeviceService.update(cpDevice, wrapper);
                List<CpSensor> sensorsList = cpDevice.getSensorsList();
                for (CpSensor cpSensor : sensorsList) {
                    UpdateWrapper<CpSensor> wrapper2 = new UpdateWrapper<>();
                    wrapper2.eq("sensor_id", cpSensor.getSensorId());
                    update(cpSensor, wrapper2);
                }
            });

            sbApi.setResult(res);
            return sbApi;
        } else {
            sbApi.setStatus(-1);
            sbApi.setResult(res);
            return sbApi;
        }

    }

    @Override
    public SBApi getSingleSensorDatas(SingleSensorDatasDto singleSensorDatasDto) {
        SBApi sbApi = new SBApi();
        String uri = "https://app.dtuip.com/api/device/getSingleSensorDatas";
        JSONObject paramBody = new JSONObject();
        paramBody.put("sensorId", singleSensorDatasDto.getSensorId());
        paramBody.put("userId", singleSensorDatasDto.getUserId());
        String res = HttpClientUtil.doPost(uri, TLinkUtil.getHeader(), paramBody);
        com.alibaba.fastjson.JSONObject jsonRes = JSONObject.parseObject(res);
        if (TLinkUtil.SUCCESS_FLAG.equals(jsonRes.get(TLinkUtil.FLAG).toString())) {
            CpSensor cpSensor = new CpSensor();
            cpSensor.setSensorName(jsonRes.getString("sensorName"));
            cpSensor.setSensorId(jsonRes.getInteger("sensorId"));
            cpSensor.setUnit(jsonRes.getString("unit"));
            cpSensor.setSensorType(jsonRes.getString("sensorType"));
            cpSensor.setValue(jsonRes.getString("value"));
            UpdateWrapper<CpSensor> wrapper2 = new UpdateWrapper<>();
            wrapper2.eq("sensor_id", cpSensor.getSensorId());
            update(cpSensor, wrapper2);
            sbApi.setResult(res);
            return sbApi;
        } else {
            sbApi.setStatus(-1);
            sbApi.setResult(res);
            return sbApi;
        }
    }

    @Override
    public SBApi addDeviceSensor(CpDevice cpDeviceRq) {
        SBApi sbApi = new SBApi();
        String uri = "https://app.dtuip.com/api/device/addDevice";
        JSONObject paramBody = new JSONObject();
        paramBody.put("deviceName", cpDeviceRq.getDeviceName());
        paramBody.put("linkType", cpDeviceRq.getDeviceName());
        paramBody.put("userId", cpDeviceRq.getUserId());
        paramBody.put("lat", cpDeviceRq.getLat());
        paramBody.put("lng", cpDeviceRq.getLng());
        paramBody.put("timescale", cpDeviceRq.getTimescale());
        JSONArray jsonArray = JSONArray.parseArray(JSON.toJSONString(cpDeviceRq.getSensorsList()));
        paramBody.put("sensorList", jsonArray);

        String res = HttpClientUtil.doPost(uri, TLinkUtil.getHeader(), paramBody);
        com.alibaba.fastjson.JSONObject jsonRes = JSON.parseObject(res);
        if (TLinkUtil.SUCCESS_FLAG.equals(jsonRes.get(TLinkUtil.FLAG).toString())) {
            String deviceNo = (String) jsonRes.get("deviceNo");
            Long deviceId = Long.parseLong(jsonRes.get("deviceId") + "");

            CpDevice cpDevice = new CpDevice();
            BeanUtils.copyProperties(cpDeviceRq, cpDevice);

            cpDevice.setDeviceId(deviceId);
            cpDevice.setDeviceSn(deviceNo);
            cpDeviceService.insertDevice(cpDevice);

            cpDeviceRq.getSensorsList().forEach(sensor -> {
                sensor.setId(StringUtil.createUUID());
                save(sensor);
            });

            sbApi.setResult(res);
            return sbApi;
        } else {
            sbApi.setStatus(-1);
            sbApi.setResult(res);
            return sbApi;
        }

    }

    @Override
    public SBApi modifyDeviceSensor(CpDevice cpDeviceRq) {
        SBApi sbApi = new SBApi();
        String uri = "https://app.dtuip.com/api/device/updateDevice";
        JSONObject paramBody = new JSONObject();
        paramBody.put("deviceName", cpDeviceRq.getDeviceName());
        paramBody.put("linkType", cpDeviceRq.getDeviceName());
        paramBody.put("userId", cpDeviceRq.getUserId());
        paramBody.put("lat", cpDeviceRq.getLat());
        paramBody.put("lng", cpDeviceRq.getLng());
        paramBody.put("timescale", cpDeviceRq.getTimescale());
        JSONArray jsonArray = JSONArray.parseArray(JSON.toJSONString(cpDeviceRq.getSensorsList()));
        paramBody.put("sensorList", jsonArray);

        String res = HttpClientUtil.doPost(uri, TLinkUtil.getHeader(), paramBody);
        com.alibaba.fastjson.JSONObject jsonRes = JSON.parseObject(res);
        if (TLinkUtil.SUCCESS_FLAG.equals(jsonRes.get(TLinkUtil.FLAG).toString())) {
            String deviceNo = (String) jsonRes.get("deviceNo");
            Long deviceId = Long.parseLong(jsonRes.get("deviceId") + "");

            CpDevice cpDevice = new CpDevice();
            BeanUtils.copyProperties(cpDeviceRq, cpDevice);

            cpDevice.setDeviceId(deviceId);
            cpDevice.setDeviceSn(deviceNo);
            cpDeviceService.updateById(cpDevice);

            cpDeviceRq.getSensorsList().forEach(sensor -> {
                sensor.setId(StringUtil.createUUID());
                updateById(sensor);
            });

            sbApi.setResult(res);
            return sbApi;
        } else {
            sbApi.setStatus(-1);
            sbApi.setResult(res);
            return sbApi;
        }

    }

    @Override
    public SBApi getSensorHistroy(SensorHistroyDto sensorHistroyDto) {
        SBApi sbApi = new SBApi();
        String uri = "https://app.dtuip.com/api/device/getSensorHistroy";
        String s = JSON.toJSONString(sensorHistroyDto);
        JSONObject paramBody = JSONObject.parseObject(s);
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

    @Override
    public Integer deleteCpSensorByDeviceId(String deviceId) {
        return this.baseMapper.deleteCpSensorByDeviceId(deviceId);
    }

    /**
     * 根据 设备ID 获取 传感器数据
     *
     * @param deviceId
     * @param start
     * @param end
     * @return
     */
    @Override
    public List<CpSensorDataDto> getSensorDataList(String deviceId, Long start, Long end) {
        return this.baseMapper.getSensorDataList(deviceId,start,end);
    }

}