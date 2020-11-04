package com.coldchain.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.coldchain.entity.CpSensorData;
import com.coldchain.entity.vo.*;
import com.common.dto.CpSensorDataDto;
import org.apache.ibatis.annotations.Param;

import java.security.PrivateKey;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

/**
 * 传感器数据表(CpSensorData)表服务接口
 *
 * @author chenqingshan
 * @since 2020-10-10 11:49:50
 */
public interface CpSensorDataService extends IService<CpSensorData> {

    List<CpSensorDataVo> getNewSensorData(String deviceId);
    CpSensorDataVo getNewSensorDataBySensorId(String cpSensorId);
    SenSorDataStatisticsVo getSensorDataStatisticsBySensorId(String cpSensorId);

    Page<CpSensorDataVo> getSensorDataHistoryBySensorId(String cpSensorId,String start,String end,Integer page,Integer size);

    List<TrackCoordVo> getDeviceHistoryTrack(String deviceId, String start, String end);
    List<SensorDataHistoryCurveVo>  getSensorDataHistoryCurveBySensorId(String sensorId, String start, String end);
    void getDeviceData();

    com.common.dto.CpDeviceDto detailByDeviceIdApp(String deviceId);

    Page<CpSensorDataDto> historyByDeviceIdApp(String deviceId, Long start, Long end, Integer page, Integer size);

    Map<String, List<CpSensorDataDto>> lineChart(String deviceId, Long start, Long end);}