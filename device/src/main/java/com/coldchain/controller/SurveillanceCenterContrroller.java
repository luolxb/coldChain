package com.coldchain.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coldchain.entity.vo.*;
import com.coldchain.service.CpDeviceService;
import com.coldchain.service.CpSensorDataService;
import com.coldchain.service.CpTriggerDataService;
import com.common.dto.NtsProjectDto;
import com.common.vo.SBApi;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * 监控中心接口
 * @author chenqingshan
 * @since 2020-10-10 14:50:29
 */
@Api(value = "监控中心", tags = {"监控中心相关接口"})
@RestController
@Slf4j
@RequestMapping("/sc")
public class SurveillanceCenterContrroller {

    @Autowired
    private CpSensorDataService cpSensorDataService;

    @Autowired
    private CpTriggerDataService cpTriggerDataService;

    @Autowired
    private CpDeviceService  cpDeviceService;

    /**
     * 通过设备主键ID传感器最新数据
     */
    @ApiOperation("通过设备主键ID传感器最新数据")
    @GetMapping("/getNewSensorDataByDeviceId")
    public SBApi getNewSensorDataByDeviceId( @ApiParam("设备主键ID") @RequestParam(value = "deviceId", required = true) String deviceId) {
        List<CpSensorDataVo> cpSensorDataVoList = cpSensorDataService.getNewSensorData(deviceId);
        return new SBApi(cpSensorDataVoList);
    }

    /**
     * 通过传感器ID查询近一个月的报警记录
     */
    @ApiOperation("通过传感器ID查询近一个月的报警记录")
    @GetMapping("/getAlarmListByMonth")
    public SBApi getAlarmListByMonth( @ApiParam("传感器ID") @RequestParam(value = "sensorId", required = true) String sensorId) {
        List<CpTriggerDataVo> cpTriggerDataVoList = cpTriggerDataService.getCpTriggerDataHistoryByMonth(sensorId);
        return new SBApi(cpTriggerDataVoList);
    }
    /**
     * 通过传感器ID查询单个传感器最新数据
     */
    @ApiOperation("通过传感器ID查询单个传感器最新数据")
    @GetMapping("/getNewSensorDataByCpSensorId")
    public SBApi getNewSensorDataByCpSensorId( @ApiParam("传感器主键ID") @RequestParam(value = "cpSensorId", required = true) String cpSensorId) {
        CpSensorDataVo cpSensorDataVo = cpSensorDataService.getNewSensorDataBySensorId(cpSensorId);
        return new SBApi(cpSensorDataVo);
    }
    /**
     * 通过传感器ID获取传感器统计数据
     */
    @ApiOperation("通过传感器ID获取传感器统计数据")
    @GetMapping("/getSensorDataStatisticsBySensorId")
    public SBApi getSensorDataStatisticsBySensorId( @ApiParam("传感器主键ID") @RequestParam(value = "cpSensorId", required = true) String cpSensorId) {
        SenSorDataStatisticsVo senSorDataStatisticsVo = cpSensorDataService.getSensorDataStatisticsBySensorId(cpSensorId);
        return new SBApi(senSorDataStatisticsVo);
    }
    /**
     * 通过传感器ID获取传感器历史数据
     */
    @ApiOperation("通过传感器ID获取传感器历史数据")
    @GetMapping("/getSensorDataHistoryBySensorId")
    public SBApi getSensorDataHistoryBySensorId(
            @ApiParam("传感器主键ID") @RequestParam(value = "cpSensorId", required = true) String cpSensorId,
            @ApiParam("开始时间") @RequestParam(value = "start", required = false) String start,
            @ApiParam("结束时间") @RequestParam(value = "end", required = false) String end,
            @ApiParam("页码") @RequestParam(value = "page", defaultValue = "1") Integer page,
            @ApiParam("单页记录数") @RequestParam(value = "size", defaultValue = "10") Integer size) {


        Page<CpSensorDataVo> cpSensorDataVoPage = cpSensorDataService.getSensorDataHistoryBySensorId(cpSensorId,start,end,page,size);
        return new SBApi(cpSensorDataVoPage);
    }

    /**
     * 通过传感器ID获取传感器历史曲线
     */
    @ApiOperation("通过传感器ID获取传感器历史曲线")
    @GetMapping("/getSensorDataHistoryCurveBySensorId")
    public SBApi getSensorDataHistoryCurveBySensorId(
            @ApiParam("传感器主键ID") @RequestParam(value = "cpSensorId", required = true) String cpSensorId,
            @ApiParam("开始时间") @RequestParam(value = "start", required = false) String start,
            @ApiParam("结束时间") @RequestParam(value = "end", required = false) String end) {


        List<SensorDataHistoryCurveVo> curveVoList = cpSensorDataService.getSensorDataHistoryCurveBySensorId(cpSensorId,start,end);
        return new SBApi(curveVoList);
    }
    /**
     * 设备数量统计
     */
    @ApiOperation("设备数量统计")
    @GetMapping("/getDeviceNumberTotal")
    public SBApi getDeviceNumberTotal() {
        CpDeviceNumberStatisticsVo cpDeviceNumberStatisticsVo = cpDeviceService.getDeviceNumberTotal();
        return new SBApi(cpDeviceNumberStatisticsVo);
    }

    /**
     * 设备实时位置查询
     */
    @ApiOperation("设备实时位置查询")
    @GetMapping("/getDeviceRealTimeLocation")
    public SBApi getDeviceRealTimeLocation( @ApiParam("设备序列号") @RequestParam(value = "deviceSn", required = false) String deviceSn,
                                            @ApiParam("设备序名称") @RequestParam(value = "deviceName", required = false) String deviceName,
                                            @ApiParam("状态0-在线,1-离线,2-报警,") @RequestParam(value = "status", required = false) Integer status){

        List<CpDeviceVo> cpDeviceVoList =  cpDeviceService.getDeviceRealTimeLocation(deviceName,deviceSn, status);
        return new SBApi(cpDeviceVoList);
    }
    /**
     * 设备轨迹查询
     */
    @ApiOperation("设备历史轨迹查询")
    @GetMapping("/getDeviceHistoryTrack")
    public SBApi getDeviceHistoryTrack( @ApiParam("设备主键ID") @RequestParam(value = "deviceId", required = true) String deviceId,
                                        @ApiParam("开始时间") @RequestParam(value = "start", required = false) String start,
                                        @ApiParam("结束时间") @RequestParam(value = "end", required = false) String end){
        List<TrackCoordVo> trackCoordVoList = cpSensorDataService.getDeviceHistoryTrack(deviceId,start,end);
        return new SBApi(trackCoordVoList);
    }

    /**
     * 获取设备树
     */
    @ApiOperation("根据用户获取设备树")
    @GetMapping("/getDeviceListByUser")
    public SBApi getDeviceListByUser( @ApiParam("用户ID") @RequestParam(value = "uId", required = false) Integer uId,
                                        @ApiParam("商户ID") @RequestParam(value = "oemId", required = false) Integer oemId,
                                        @ApiParam("管理员ID") @RequestParam(value = "adminId", required = false) Integer adminId){
        List<CpDeviceVo> cpDeviceVos = cpDeviceService.getDeviceByUser(adminId,oemId,uId);
        return new SBApi(cpDeviceVos);
    }


}
