package com.coldchain.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coldchain.dao.CpDeviceCorrelationSensorMapper;
import com.coldchain.entity.CpDeviceCorrelationSensor;
import com.coldchain.service.CpDeviceCorrelationSensorService;
import com.common.vo.SBApi;
import org.springframework.stereotype.Service;

/**
 * 设备-传感器关联表(CpDeviceCorrelationSensor)表服务实现类
 *
 * @author chenqingshan
 * @since 2020-10-10 11:50:17
 */
@Service("cpDeviceCorrelationSensorService")
public class CpDeviceCorrelationSensorServiceImpl extends ServiceImpl<CpDeviceCorrelationSensorMapper, CpDeviceCorrelationSensor> implements CpDeviceCorrelationSensorService {

    @Override
    public Integer insertCpDeviceCorrelationSensor(CpDeviceCorrelationSensor cpDeviceCorrelationSensor) {
        return this.baseMapper.insert(cpDeviceCorrelationSensor);
    }

    @Override
    public Integer deleteDeviceCorrelationSensorByDeviceId(String deviceId) {
        return this.baseMapper.deleteDeviceCorrelationSensorByDeviceId(deviceId);

    }
}