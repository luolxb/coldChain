package com.coldchain.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.coldchain.entity.CpDeviceCorrelationSensor;
import com.coldchain.entity.NtsProjectDevice;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 设备-传感器关联表(CpDeviceCorrelationSensor)表数据库访问层
 *
 * @author chenqingshan
 * @since 2020-10-10 11:50:17
 */
public interface CpDeviceCorrelationSensorMapper extends BaseMapper<CpDeviceCorrelationSensor> {

    Integer deleteDeviceCorrelationSensorByDeviceId(@Param("deviceId")String deviceId);

}