package com.coldchain.controller.app;

import com.coldchain.service.CpSensorDataService;
import com.common.vo.SBApi;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * 传感器数据表(CpSensorData)表控制层
 *
 * @author chenqingshan
 * @since 2020-10-10 11:49:50
 */

@Api(tags = "app设备传感器数据")
@RestController
@RequestMapping("app/sensorData")
public class SensorDataAppController {

    @Autowired
    private CpSensorDataService cpSensorDataService;

    @ApiOperation("设备详情包含传感器数据")
    @GetMapping("detail")
    public SBApi detail(@RequestParam("deviceId") String deviceId) {
        return new SBApi(cpSensorDataService.detailByDeviceIdApp(deviceId));
    }

    @ApiOperation("设备历史包含传感器数据")
    @GetMapping("history")
    public SBApi history(@ApiParam("开始时间 时间戳 秒") @RequestParam(value = "start",required = false) Long start,
                         @ApiParam("结束时间 时间戳 秒") @RequestParam(value = "end",required = false) Long end,
                         @ApiParam("页码") @RequestParam(value = "p", defaultValue = "1") Integer page,
                         @ApiParam("单页记录数") @RequestParam(value = "size", defaultValue = "10") Integer size,
                         @RequestParam("deviceId") String deviceId) {
        return new SBApi(cpSensorDataService.historyByDeviceIdApp(deviceId,start,end,page,size));
    }
    @ApiOperation("设备折线图传感器数据")
    @GetMapping("line_chart")
    public SBApi lineChart(@ApiParam("开始时间 时间戳 秒") @RequestParam(value = "start",required = false) Long start,
                           @ApiParam("结束时间 时间戳 秒") @RequestParam(value = "end",required = false) Long end,
                           @RequestParam("deviceId") String deviceId) {
        return new SBApi(cpSensorDataService.lineChart(deviceId,start,end));
    }



}