package com.coldchain.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.coldchain.entity.CpSensor;
import com.coldchain.entity.NtsProjectDevice;
import com.common.dto.CpSensorDataDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 传感器表(CpSensor)表数据库访问层
 *
 * @author chenqingshan
 * @since 2020-10-10 11:49:30
 */
public interface CpSensorMapper extends BaseMapper<CpSensor> {

    Integer deleteCpSensorByDeviceId(@Param("deviceId") String deviceId);

    List<CpSensorDataDto> getSensorDataList(@Param("deviceId") String deviceId,
                                            @Param("start") Long start,
                                            @Param("end") Long end);
}