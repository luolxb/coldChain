package com.coldchain.controller;

import com.coldchain.entity.CpTrigger;
import com.coldchain.entity.vo.*;
import com.coldchain.service.CpDeviceService;
import com.coldchain.service.CpTriggerService;
import com.common.exception.ShopException;
import com.common.vo.SBApi;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.BindingResult;


import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * (CpTrigger)表控制层
 *
 * @author chenqingshan
 * @since 2020-10-12 09:11:47
 */
@RestController
@RequestMapping("/cpTrigger")
@Api(value = "设备管理", tags = {"设备中心-触发器相关接口"})
public class CpTriggerController {

    @Autowired
    private CpTriggerService cpTriggerService;
    /**
     * 添加触发器
     * @return
     */
    @ApiOperation("添加触发器")
    @PostMapping("/addAlarms")
    public SBApi addAlarms(@Valid @RequestBody TriggerVo alarmInfoVo) {
        return cpTriggerService.addAlarms(alarmInfoVo);
    }
    /**
     * 修改触发器
     * @return
     */
    @ApiOperation("修改触发器")
    @PostMapping("/updateAlarms")
    SBApi updateAlarms(@Valid @RequestBody TriggerVo alarmInfoVo) {
        return cpTriggerService.updateAlarms(alarmInfoVo);
    }
    /**
     * 删除触发器
     * @return
     */
    @ApiOperation("删除触发器")
    @PostMapping("/deleteAlarms")
    SBApi deleteAlarms(@Valid @RequestParam String alarmId,@RequestParam String userId) {
        return cpTriggerService.deleteAlarms(alarmId,userId);
    }
    /**
     * 启动触发器
     * @return
     */
    @ApiOperation("启动/停止触发器")
    @PostMapping("/activeAlarms")
    SBApi activeAlarms(@Valid @RequestBody ActiveAlarmVo activeAlarmVo) {
        return cpTriggerService.activeAlarms(activeAlarmVo);
    }
    /**
     * 获取触发器
     * @return
     */
    @ApiOperation("分页获取触发器列表")
    @PostMapping("/getAlarms")
    SBApi getAlarms(@Valid @RequestBody AlarmInfoDto alarmInfoDto) {
        SBApi sbApi = cpTriggerService.getLocalAlarms(alarmInfoDto);
        if (sbApi.getResult() == null) {
            sbApi = cpTriggerService.getAlarms(alarmInfoDto);
        }
        return sbApi;
    }
    /**
     * 获取触发器报警历史
     * @return
     */
    @ApiOperation("获取触发器报警历史")
    @PostMapping("/getAlarmsHistory")
    SBApi getAlarmsHistory(@Valid @RequestBody AlarmHistoryInfoDto alarmHistoryInfoDto) {
        return cpTriggerService.getAlarmsHistory(alarmHistoryInfoDto);
    }




}