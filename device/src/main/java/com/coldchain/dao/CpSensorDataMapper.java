package com.coldchain.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coldchain.entity.CpSensorData;
import com.coldchain.entity.NtsProjectDevice;
import com.coldchain.entity.vo.*;
import com.common.dto.CpSensorDataDto;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * 传感器数据表(CpSensorData)表数据库访问层
 *
 * @author chenqingshan
 * @since 2020-10-10 11:49:50
 */
public interface CpSensorDataMapper extends BaseMapper<CpSensorData> {

    List<CpSensorDataVo> getNewSensorData(@Param("deviceId") String deviceId);

    CpSensorDataVo getNewSensorDataBySensorId(@Param("cpSensorId") String cpSensorId);

    SenSorDataStatisticsVo getSensorDataStatisticsBySensorId(@Param("cpSensorId") String cpSensorId);

    List<CpSensorDataVo> getSensorDataHistoryBySensorId(Page<CpSensorDataVo> cpSensorDataVo, @Param("cpSensorId") String cpSensorId, @Param("start") String start, @Param("end") String end);

    List<TrackCoordVo> getDeviceHistoryTrack(@Param("deviceId") String deviceId, @Param("start") String start, @Param("end") String end);

    List<SensorDataHistoryCurveVo> getSensorDataHistoryCurveBySensorId(@Param("sensorId") String sensorId, @Param("start") String start, @Param("end") String end);

    List<CpSensorDataDto> sensorDataList(@Param("deviceId") String deviceId);


    /**
     * sql 中加入 LIMIT 10000000000
     * 是解决mysql 5.7 以上版本 group by 问题
     *
     * @param cpSensorDataDtoPage
     * @param deviceId
     * @param start
     * @param end
     * @return
     */
    List<CpSensorDataDto> historyByDeviceIdApp(Page<CpSensorDataDto> cpSensorDataDtoPage,
                                               @Param("deviceId") String deviceId,
                                               @Param("start") Long start,
                                               @Param("end") Long end);

    List<CpSensorDataDto> lineChart(@Param("deviceId") String deviceId,
                                    @Param("start") Long start,
                                    @Param("end") Long end);

    List<CpSensorDataVo> checkNowDate(@Param("sensorId") Integer sensorId,@Param("updateDate") Date updateDate);
}