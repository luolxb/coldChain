package com.coldchain.controller;

import com.coldchain.entity.CpSensor;
import com.coldchain.entity.vo.CpDeviceVo;
import com.coldchain.entity.vo.SensorHistroyDto;
import com.coldchain.entity.vo.SingleDeviceDatasDto;
import com.coldchain.entity.vo.SingleSensorDatasDto;
import com.coldchain.service.CpDeviceService;
import com.coldchain.service.CpSensorService;
import com.common.dto.CpSensorDataDto;
import com.common.vo.SBApi;
import com.common.dto.CpSensorDataDto;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 传感器表(CpSensor)表控制层
 *
 * @author chenqingshan
 * @since 2020-10-10 11:49:30
 */
@RestController
@RequestMapping("cpSensor")
@Api(value = "传感器管理", tags = {"设备中心-传感器相关接口"})
public class CpSensorController {

    @Autowired
    private CpSensorService cpSensorService;



    /**
     * 获取单个传感器数据
     *
     * @return
     */
    @ApiOperation("获取单个传感器数据")
    @PostMapping("/getSingleSensorDatas")
    public SBApi getSingleSensorDatas(@RequestBody SingleSensorDatasDto singleSensorDatasDto) {
        return cpSensorService.getSingleSensorDatas(singleSensorDatasDto);

    }
    /**
     * 获取传感器历史数据
     *
     * @return
     */
    @ApiOperation("获取传感器历史数据")
    @PostMapping("/getSensorHistroy")
    SBApi getSensorHistroy(@RequestBody  SensorHistroyDto sensorHistroyDto) {
        return cpSensorService.getSensorHistroy(sensorHistroyDto);

    }





    /**
     * 根据 设备ID 获取 传感器数据
     *
     * @param deviceId
     * @param start
     * @param end
     * @return
     */
    @GetMapping("/getSensorDataList")
    List<CpSensorDataDto> getSensorDataList(@RequestParam("deviceId") String deviceId,
                                            @RequestParam(value = "start", required = false) Long start,
                                            @RequestParam(value = "end", required = false) Long end) {
        return cpSensorService.getSensorDataList(deviceId,start,end);

    }
}