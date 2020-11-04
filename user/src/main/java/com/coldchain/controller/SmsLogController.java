package com.coldchain.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.coldchain.entity.SmsLog;
import com.coldchain.service.MallService;
import com.coldchain.service.SmsLogService;
import com.common.vo.SBApi;
import com.coldchain.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author dyr
 * @since 2019-09-11
 */
@Api(value = "用户短信日志", tags = {"短信日志相关接口"},hidden = true)
@RestController
@RequestMapping("/sms")
public class SmsLogController {
    @Autowired
    private SmsLogService smsLogService;
    @Autowired
    private MallService mallService;
    @Autowired
    private UserService userService;

    @ApiOperation("获取手机短信验证码，最新一条")
    @GetMapping
    public SmsLog getOne(
            @ApiParam("手机号码") @RequestParam("mobile") String mobile,
            @ApiParam("发送场景") @RequestParam("scene") Integer scene) {
        return smsLogService.getOne((new QueryWrapper<SmsLog>()).eq("mobile", mobile).eq("scene", scene)
                .orderByDesc("id").last("limit 1"));
    }

    @ApiOperation(value = "发送短信")
    @PostMapping("/log")
    public SBApi sendMobileCode(@RequestBody SmsLog smsLog) {
        smsLogService.send(smsLog, mallService.config());
        return new SBApi();
    }

    @ApiOperation(value = "验证短信")
    @PostMapping("/verification")
    public SBApi checkCode(@RequestBody SmsLog smsLog) {
        smsLogService.verify(smsLog, mallService.config());
        return new SBApi();
    }
}
