package com.coldchain.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.coldchain.entity.CpDevice;
import com.coldchain.entity.CpDeviceCorrelationSensor;
import com.common.vo.SBApi;

import java.util.List;

/**
 * 设备-传感器关联表(CpDeviceCorrelationSensor)表服务接口
 *
 * @author makejava
 * @since 2020-10-10 11:50:17
 */
public interface CpDeviceCorrelationSensorService extends IService<CpDeviceCorrelationSensor> {

    /**
     *添加设备
     */
    Integer insertCpDeviceCorrelationSensor(CpDeviceCorrelationSensor cpDeviceCorrelationSensor);

    Integer deleteDeviceCorrelationSensorByDeviceId(String deviceId);

}