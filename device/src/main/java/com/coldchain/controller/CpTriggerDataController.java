package com.coldchain.controller;

import com.coldchain.entity.CpTriggerData;
import com.coldchain.entity.vo.AlarmHistoryInfoDto;
import com.coldchain.entity.vo.AlarmInfoDto;
import com.coldchain.service.CpTriggerDataService;
import com.coldchain.service.impl.CpTriggerDataServiceImpl;
import com.common.vo.SBApi;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * 触发器报警记录表(CpTriggerData)表控制层
 *
 * @author chenqingshan
 * @since 2020-10-12 11:16:27
 */
@RestController
@RequestMapping("cpTriggerData")
@Api(value = "设备管理", tags = {"设备中心-触发器数据相关接口"})
public class CpTriggerDataController {

}