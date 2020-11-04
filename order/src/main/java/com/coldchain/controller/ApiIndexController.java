package com.coldchain.controller;

import com.coldchain.common.utils.RestResponse;
import com.coldchain.framework.aspectj.lang.annotation.LoginUser;
import com.coldchain.project.business.card.domain.Index4GStaUseDataVo;
import com.coldchain.project.business.card.domain.IndexFlowOrderDeviceCountVo;
import com.coldchain.project.business.card.service.NtsCardInfoService;
import com.coldchain.project.business.device.service.IDeviceFlowAggService;
import com.coldchain.project.business.device.service.IDeviceFlowPoolService;
import com.coldchain.project.business.device.service.IDeviceService;
import com.coldchain.project.business.user.domain.NtsUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

/**
 * @PackageName: com.coldchain.project.business.api
 * @program: nts
 * @author: ruosen
 * @create: 2020-04-10 17:14
 **/
@RestController
@Api(tags = "12.首页")
@RequestMapping("/api/index")

public class ApiIndexController {

    @Autowired
    private IDeviceFlowPoolService deviceFlowPoolService;

    @Autowired
    private IDeviceService deviceService;

    @Autowired
    private IDeviceFlowAggService deviceFlowAggService;

    @Autowired
    private NtsCardInfoService cardInfoService;

    /**
     * 获取流量信息,流量订单数，设备数量
     */
    @ApiOperation("获取流量信息,流量订单数，设备数量")
    @GetMapping("/getFlowOrderDeviceCount")
    public RestResponse getFlowOrderDeviceCount(@ApiIgnore @LoginUser NtsUser loginUser) {
        IndexFlowOrderDeviceCountVo flowOrderDeviceCount = deviceFlowPoolService.getFlowOrderDeviceCount(loginUser.getIsAdmin().equals(1) ? null : loginUser.getCompanyId());
        return RestResponse.success(flowOrderDeviceCount);
    }

    /**
     * 获取最近七天购买流量订单数量
     *
     * @return
     */
    @ApiOperation("获取最近七天购买流量订单数量")
    @GetMapping("/getBuyFlowOrder")
    public RestResponse getBuyFlowOrderCount(@ApiIgnore @LoginUser NtsUser loginUser) throws ParseException {
        List<Map<String, Object>> buyFlowOrderCount = deviceFlowPoolService.getBuyFlowOrderCount(loginUser.getIsAdmin().equals(1) ? null :Long.parseLong(loginUser.getUserId()+""));
        return RestResponse.success(buyFlowOrderCount);
    }

    /**
     * 获取设备状态
     *
     * @return
     */
    @ApiOperation("获取卫星状态")
    @GetMapping("/getSatStatus")
    public RestResponse getSatStatus(@ApiIgnore @LoginUser NtsUser loginUser) {
        Map<String, Object> satStatus = deviceService.getSatStatus(loginUser.getIsAdmin().equals(1) ? null :Long.parseLong(loginUser.getUserId()+""));
        return RestResponse.success(satStatus);
    }

    /**
     * 获取设备状态2
     *
     * @return
     */
    @ApiOperation("获取物联网卡状态")
    @GetMapping("/getCardStatus")
    public RestResponse getCardStatus(@ApiIgnore @LoginUser NtsUser loginUser) {
        Map<String, Object> cardStatus = cardInfoService.getCardStatus(loginUser.getIsAdmin().equals(1) ? null :Long.parseLong(loginUser.getUserId()+""));
        return RestResponse.success(cardStatus);
    }

    /**
     * 获取承运商用户的百分比
     *
     * @return
     */
    @ApiOperation("获取承运商用户的百分比")
    @GetMapping("/getDeviceVendorPercentage")
    public RestResponse getDeviceVendorPercentage(@ApiIgnore @LoginUser NtsUser loginUser) {
        Map<String, Object> deviceStatus = deviceService.getDeviceVendorPercentage(loginUser.getIsAdmin().equals(1) ? null :Long.parseLong(loginUser.getUserId()+""));
        return RestResponse.success(deviceStatus);
    }

    /**
     * 获取4G卫星流量使用
     *
     * @return
     */
    @ApiOperation("获取4G卫星流量使用")
    @GetMapping("/get4GStaUseData")
    public RestResponse get4GSatUseData(@ApiIgnore @LoginUser NtsUser loginUser) throws ParseException {
        List<Index4GStaUseDataVo> deviceStatus = deviceFlowAggService.get4GSatUseData(loginUser.getIsAdmin().equals(1) ? null :Long.parseLong(loginUser.getUserId()+""));
        return RestResponse.success(deviceStatus);
    }



}
