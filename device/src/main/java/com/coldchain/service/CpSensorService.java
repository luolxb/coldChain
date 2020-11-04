package com.coldchain.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.coldchain.entity.CpDevice;
import com.coldchain.entity.CpSensor;
import com.coldchain.entity.vo.SensorHistroyDto;
import com.coldchain.entity.vo.SingleDeviceDatasDto;
import com.coldchain.entity.vo.SingleSensorDatasDto;
import com.common.dto.CpSensorDataDto;
import com.common.vo.SBApi;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 传感器表(CpSensor)表服务接口
 *
 * @author chenqingshan
 * @since 2020-10-10 11:49:30
 */
public interface CpSensorService extends IService<CpSensor> {

    SBApi getSingleDeviceDatas(SingleDeviceDatasDto singleDeviceDatasDto);

    SBApi getSingleSensorDatas(SingleSensorDatasDto singleSensorDatasDto);

    SBApi addDeviceSensor(CpDevice cpDeviceRq);

    SBApi modifyDeviceSensor(CpDevice cpDeviceRq);

    SBApi getSensorHistroy(SensorHistroyDto sensorHistroyDto);

    Integer deleteCpSensorByDeviceId(String deviceId);


    List<CpSensorDataDto> getSensorDataList(String deviceId, Long start, Long end);
}