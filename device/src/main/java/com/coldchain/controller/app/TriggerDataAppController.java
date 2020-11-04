package com.coldchain.controller.app;

import com.coldchain.entity.vo.AlarmRecordVo;
import com.coldchain.service.CpTriggerDataService;
import com.common.vo.SBApi;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 传感器数据表(CpSensorData)表控制层
 *
 * @author chenqingshan
 * @since 2020-10-10 11:49:50
 */

@Api(tags = "app触发器数据/报警数据")
@RestController
@RequestMapping("app/triggerData")
public class TriggerDataAppController {

    @Autowired
    private CpTriggerDataService cpTriggerDataService;

    @ApiOperation("报警记录")
    @GetMapping
    public SBApi alarmRecord(@ApiParam("设备ID") @RequestParam("deviceId") String deviceId,
                             @ApiParam("页码") @RequestParam(value = "page", defaultValue = "1") Integer page,
                             @ApiParam("单页记录数") @RequestParam(value = "size", defaultValue = "10") Integer size) {
        return new SBApi( cpTriggerDataService.alarmRecord(deviceId, page, size));
    }
}
