package com.coldchain.service.impl;

import cn.hutool.core.date.DateUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coldchain.dao.CpDeviceTypeMapper;
import com.coldchain.entity.CpDevice;
import com.coldchain.entity.CpDeviceType;
import com.coldchain.entity.CpSensorData;
import com.coldchain.dao.CpSensorDataMapper;
import com.coldchain.entity.vo.*;
import com.coldchain.service.CpDeviceService;
import com.coldchain.service.CpSensorDataService;
import com.coldchain.utils.FilterCoordinatesUtil;
import com.coldchain.utils.RedisUtils;
import com.common.dto.CpDeviceDto;
import com.common.dto.CpSensorDataDto;
import com.common.dto.NtsProjectDto;
import com.common.utils.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 传感器数据表(CpSensorData)表服务实现类
 *
 * @author chenqingshan
 * @since 2020-10-10 11:49:50
 */
@Service("cpSensorDataService")
public class CpSensorDataServiceImpl extends ServiceImpl<CpSensorDataMapper, CpSensorData> implements CpSensorDataService {

    @Autowired
    private CpDeviceService cpDeviceService;

    @Autowired
    private RedisUtils redisUtils;

    @Override
    public List<CpSensorDataVo> getNewSensorData(String deviceId){
        List<CpSensorDataVo> cpSensorDataVoList = this.baseMapper.getNewSensorData(deviceId);
        for(CpSensorDataVo cpSensorDataVo:cpSensorDataVoList){
            if (StringUtils.isEmpty(cpSensorDataVo.getValue()) || "null".equals(cpSensorDataVo.getValue())) {
                cpSensorDataVo.setValue("0.0");
            }
            if (StringUtils.isEmpty(cpSensorDataVo.getLat()) || "null".equals(cpSensorDataVo.getLat())) {
                cpSensorDataVo.setLat("");
            }
            if (StringUtils.isEmpty(cpSensorDataVo.getLng()) || "null".equals(cpSensorDataVo.getLng())) {
                cpSensorDataVo.setLng("");
            }
            if (StringUtils.isEmpty(cpSensorDataVo.getSwitcher()) || "null".equals(cpSensorDataVo.getSwitcher())) {
                cpSensorDataVo.setSwitcher("0");
            }
        }

        return cpSensorDataVoList;
    }

    @Override
    public CpSensorDataVo getNewSensorDataBySensorId(String cpSensorId) {

        CpSensorDataVo cpSensorDataVo = this.baseMapper.getNewSensorDataBySensorId(cpSensorId);
        if (StringUtils.isEmpty(cpSensorDataVo.getValue()) || "null".equals(cpSensorDataVo.getValue())) {
            cpSensorDataVo.setValue("0.0");
        }
        if (StringUtils.isEmpty(cpSensorDataVo.getLat()) || "null".equals(cpSensorDataVo.getLat())) {
            cpSensorDataVo.setLat("");
        }
        if (StringUtils.isEmpty(cpSensorDataVo.getLng()) || "null".equals(cpSensorDataVo.getLng())) {
            cpSensorDataVo.setLng("");
        }
        if (StringUtils.isEmpty(cpSensorDataVo.getSwitcher()) || "null".equals(cpSensorDataVo.getSwitcher())) {
            cpSensorDataVo.setSwitcher("0");
        }

        return cpSensorDataVo;
    }

    @Override
    public SenSorDataStatisticsVo getSensorDataStatisticsBySensorId(String cpSensorId) {
        SenSorDataStatisticsVo senSorDataStatisticsVo = this.baseMapper.getSensorDataStatisticsBySensorId(cpSensorId);
        if (null == senSorDataStatisticsVo) {
            senSorDataStatisticsVo.setDifVal("0");
            senSorDataStatisticsVo.setAvgVal("0");
            senSorDataStatisticsVo.setMaxVal("0");
            senSorDataStatisticsVo.setMinVal("0");
            return senSorDataStatisticsVo;
        }
        if (StringUtils.isEmpty(senSorDataStatisticsVo.getMaxVal())) {
            senSorDataStatisticsVo.setMaxVal("0");
        }
        if (StringUtils.isEmpty(senSorDataStatisticsVo.getMinVal())) {
            senSorDataStatisticsVo.setMaxVal("0");
        }
        if (StringUtils.isEmpty(senSorDataStatisticsVo.getAvgVal())) {
            senSorDataStatisticsVo.setAvgVal("0");
        }
        double maxVal = Double.parseDouble(senSorDataStatisticsVo.getMaxVal());
        double minVal = Double.parseDouble(senSorDataStatisticsVo.getMinVal());
        double difVal = maxVal - minVal;
        senSorDataStatisticsVo.setDifVal(Double.toString(difVal));
        return senSorDataStatisticsVo;
    }

    @Override
    public Page<CpSensorDataVo> getSensorDataHistoryBySensorId(String cpSensorId, String start, String end, Integer page, Integer size) {
        Page<CpSensorDataVo> cpSensorDataVoPage = new Page<>(page, size);
        List<CpSensorDataVo> cpSensorDataVoList = this.baseMapper.getSensorDataHistoryBySensorId(cpSensorDataVoPage, cpSensorId, start, end);
        cpSensorDataVoList.forEach(cpSensorDataVo -> {
            if (StringUtils.isEmpty(cpSensorDataVo.getValue()) || "null".equals(cpSensorDataVo.getValue())) {
                cpSensorDataVo.setValue("0.0");
            }
            if (StringUtils.isEmpty(cpSensorDataVo.getLat()) || "null".equals(cpSensorDataVo.getLat())) {
                cpSensorDataVo.setLat("");
            }
            if (StringUtils.isEmpty(cpSensorDataVo.getLng()) || "null".equals(cpSensorDataVo.getLng())) {
                cpSensorDataVo.setLng("");
            }
            if (StringUtils.isEmpty(cpSensorDataVo.getSwitcher()) || "null".equals(cpSensorDataVo.getSwitcher())) {
                cpSensorDataVo.setSwitcher("0");
            }
        });
        cpSensorDataVoPage.setRecords(cpSensorDataVoList);
        return cpSensorDataVoPage;
    }

    @Override
    public List<TrackCoordVo> getDeviceHistoryTrack(String deviceId, String start, String end) {


        return this.baseMapper.getDeviceHistoryTrack(deviceId, start, end);
    }

    @Override
    public List<SensorDataHistoryCurveVo> getSensorDataHistoryCurveBySensorId(String sensorId, String start, String end) {
        List<SensorDataHistoryCurveVo> sensorDataHistoryCurveVos = this.baseMapper.getSensorDataHistoryCurveBySensorId(sensorId, start, end);
        sensorDataHistoryCurveVos.forEach(sensorDataHistoryCurveVo -> {
            if (StringUtils.isEmpty(sensorDataHistoryCurveVo.getValue()) || "null".equals(sensorDataHistoryCurveVo.getValue())) {
                sensorDataHistoryCurveVo.setValue("0.0");
            }
            if (StringUtils.isEmpty(sensorDataHistoryCurveVo.getLat()) || "null".equals(sensorDataHistoryCurveVo.getLat())) {
                sensorDataHistoryCurveVo.setLat("");
            }
            if (StringUtils.isEmpty(sensorDataHistoryCurveVo.getLng()) || "null".equals(sensorDataHistoryCurveVo.getLng())) {
                sensorDataHistoryCurveVo.setLng("");
            }
        });
        return sensorDataHistoryCurveVos;
    }

    @Override
    public void getDeviceData() {
        List<CpDevice> cpDeviceList = cpDeviceService.list();
        //将当前时间存入redis用于筛选报警记录
        cpDeviceList.forEach(cpDevice -> {
            getSensorinfoByDevice(cpDevice);

        });

    }

    @Override
    public CpDeviceDto detailByDeviceIdApp(String deviceId) {
        CpDeviceDto cpDeviceDto = new CpDeviceDto();
        CpDevice device = cpDeviceService.getById(deviceId);
        if (device != null) {
            BeanUtils.copyProperties(device, cpDeviceDto);
            List<CpSensorDataDto> sensorDataDtoList = this.baseMapper.sensorDataList(deviceId);
            cpDeviceDto.setSensorDataList(sensorDataDtoList);
        }
        return cpDeviceDto;
    }

    /**
     * 设备历史包含传感器数据
     *
     * @param deviceId
     * @param start
     * @param end
     * @param page
     * @param size
     * @return
     */
    @Override
    public Page<CpSensorDataDto> historyByDeviceIdApp(String deviceId, Long start, Long end, Integer page, Integer size) {
        Page<CpSensorDataDto> cpSensorDataDtoPage = new Page<>(page, size);
        List<CpSensorDataDto> sensorDataDtolist = this.baseMapper.historyByDeviceIdApp(cpSensorDataDtoPage, deviceId, start, end);
        return cpSensorDataDtoPage.setRecords(sensorDataDtolist);
    }

    /**
     * APP 端 传感器折线图
     *
     * @param deviceId
     * @param start
     * @param end
     * @return
     */
    @Override
    public Map<String, List<CpSensorDataDto>> lineChart(String deviceId, Long start, Long end) {
        if (start == null) {
            end = System.currentTimeMillis() / 1000;
            start = end - 3600;
        }
        List<CpSensorDataDto> sensorDataDtoList = this.baseMapper.lineChart(deviceId, start, end);
        return sensorDataDtoList.stream().collect(Collectors.groupingBy(CpSensorDataDto::getSensorName));
    }

    @Transactional(rollbackFor = Exception.class)
    void getSensorinfoByDevice(CpDevice cpDevice) {

        String uri = "https://app.dtuip.com/api/device/getSingleDeviceDatas";
        JSONObject paramBody = new JSONObject();
        paramBody.put("deviceNo", cpDevice.getDeviceSn());
        paramBody.put("userId", TLinkUtil.UserId);
        paramBody.put("currPage", 1);
        paramBody.put("pageSize", 100);
        String res = HttpClientUtil.doPost(uri, TLinkUtil.getHeader(), paramBody);
        com.alibaba.fastjson.JSONObject jsonObject2 = JSONObject.parseObject(res);
        if (null == jsonObject2 || ((jsonObject2 != null) && jsonObject2.getString(TLinkUtil.FLAG) == null)) {
            log.debug("-----getSensorinfoByDevice---no-data------");
            return;
        }
        if (TLinkUtil.SUCCESS_FLAG.equals(jsonObject2.getString(TLinkUtil.FLAG))) {

            JSONObject deviceinfo = (JSONObject) jsonObject2.get("device");
            CpDevice cpDevice1 = JSONObject.parseObject(deviceinfo.toJSONString(), CpDevice.class);
            cpDevice.setDefaultTimescale(cpDevice1.getDefaultTimescale());
            cpDevice.setLinkType(cpDevice1.getLinkType());
            cpDevice.setIsAlarms(cpDevice1.getIsAlarms());
            cpDevice.setIsLine(cpDevice1.getIsLine());
            cpDevice.setIsDelete(cpDevice1.getIsDelete());
            cpDevice.setUserId(cpDevice1.getUserId());
            cpDevice.setLat(cpDevice1.getLat());
            cpDevice.setLng(cpDevice1.getLng());
            cpDevice.setModifyTime(DateUtil.now());
            cpDeviceService.update1(cpDevice);

            // 设备信息存入redis 中
            addDeviceData2Redis(cpDevice);

            JSONArray sensorsList = deviceinfo.getJSONArray("sensorsList");

            List<CpSensorData> deviceList = JSONObject.parseArray(sensorsList.toJSONString(), CpSensorData.class);

            deviceList.forEach(cpSensorData -> {
                if (!StringUtils.isEmpty(cpSensorData.getSensorName())) {
                    cpSensorData.setDeviceId(Integer.parseInt(cpDevice.getDeviceId().toString()));
                    cpSensorData.setCpSensorId(cpSensorData.getId());
                    cpSensorData.setSensorId(Integer.parseInt(cpSensorData.getId()));
                    cpSensorData.setSensorType(cpSensorData.getSensorTypeId().toString());
                    cpSensorData.setId(StringUtil.createUUID());
                    if (StringUtils.isEmpty(cpSensorData.getUpdateDate())) {
                        cpSensorData.setUpdateDate(new Date());
                    }
                    //判断是否为重复数据
                    List<CpSensorDataVo> cpSensorDataVoList = this.baseMapper.checkNowDate(cpSensorData.getSensorId(),cpSensorData.getUpdateDate());
                    if(null == cpSensorDataVoList || cpSensorDataVoList.size() < 1){
                        this.baseMapper.insert(cpSensorData);
                    }

                }

            });
        }
    }

    private void addDeviceData2Redis(CpDevice cpDevice) {
        String date = subDate(cpDevice.getModifyTime());
        if (org.apache.commons.lang3.StringUtils.isNotBlank(date)) {
            // 以设备id为key 存入redis中
            String key = RedisKey.COLD_DEVICE_TRACK + date + ":" + cpDevice.getId();
            // 判断是否是当前小时内的时间
            if (org.apache.commons.lang3.StringUtils.equals(getDate(), date)) {
                String trackInfoJson = (String) redisUtils.get(key);
                List<CpDevice> list = new ArrayList<>();

                if (org.apache.commons.lang3.StringUtils.isNotBlank(trackInfoJson)) {
                    list = JSON.parseArray(trackInfoJson, CpDevice.class);
                    // 过滤坐标
                    List<CpDevice> resultList = FilterCoordinatesUtil.filterCoordinates(list);
                    resultList.add(cpDevice);
                    redisUtils.set(key, JSON.toJSONString(resultList));
                } else {
                    // 当前小时外的新建轨迹缓存
                    list.add(cpDevice);
                    // 加入到缓存中
                    redisUtils.set(key, JSON.toJSONString(list));
                }
            }
        } else {
            log.error("时间格式错误");
        }

    }


    /**
     * 截取日期
     *
     * @param data
     * @return
     */
    private String subDate(String data) {
        String str = "";
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Long time = sdf.parse(data).getTime();
            SimpleDateFormat dataSdf = new SimpleDateFormat("yyyy-MM-dd-HH");
            str = dataSdf.format(time);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    /**
     * 获得当前时间的 YY-MM-dd-HH
     *
     * @return
     */
    private static String getDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH");
        return sdf.format(new Date(System.currentTimeMillis()));
    }

}