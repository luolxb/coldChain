package com.coldchain.controller;

import com.lly835.bestpay.enums.BestPayPlatformEnum;
import com.lly835.bestpay.model.PayResponse;
import com.coldchain.common.constant.Constants;
import com.coldchain.common.exception.NtsException;
import com.coldchain.common.utils.RestResponse;
import com.coldchain.common.validator.NtsAssert;
import com.coldchain.framework.aspectj.lang.annotation.IgnoreAuth;
import com.coldchain.framework.aspectj.lang.annotation.LoginUser;
import com.coldchain.project.business.pay.IPayService;
import com.coldchain.project.business.user.domain.NtsUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import springfox.documentation.annotations.ApiIgnore;

/**
 * 支付管理
 */
@Api(tags = "07.支付管理")
@Slf4j
@Controller
@RequestMapping("/api")
public class ApiPayController extends ApiBaseController {

    @Autowired
    private IPayService payService;

    @ApiOperation("微信支付-流量购买订单【客户端】")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "orderCode", value = "订单编号", required = true, dataType = "String", paramType = "query", example = "DF_20191201235325448490355")
    })
    @ResponseBody
    @GetMapping("wxPay/flowOrder")
    public RestResponse wxPayForFlowOrder(String orderCode, @ApiIgnore @LoginUser NtsUser loginUser) {
        NtsAssert.isBlank(orderCode, "订单编号不能为空");
        if (orderCode.startsWith(Constants.DF_TAG) || orderCode.startsWith(Constants.CF_TAG)) {
            String[] TAG = orderCode.split("_");
            if (Constants.DF_TAG.equals(TAG[0])) { // 设备流量订单
                return payService.wxPayForDeviceFlowOrder(orderCode, loginUser);
            } else if (Constants.CF_TAG.equals(TAG[0])) { // 企业流量订单
                return payService.wxPayForCompanyFlowOrder(orderCode, loginUser);
            }
        }
        throw new NtsException("订单编号格式错误");
    }


//    @ApiOperation("阿里支付-流量购买订单")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "orderCode", value = "订单编号", required = true, dataType = "String", paramType = "query", example = "DF_20191201235325448490355")
//    })
//    @GetMapping("aliPay/flowOrder")
//    public Object aliPayForFlowOrder(String orderCode, @ApiIgnore @LoginUser NtsUser loginUser) {
//        NtsAssert.isBlank(orderCode, "订单编号不能为空");
//        return payService.aliPayForFlowOrder(orderCode, loginUser);
//    }

//    @ApiOperation("测试微信支付")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "amount", value = "金额", required = true, dataType = "Double", paramType = "query", example = "0.1")
//    })
//    @ResponseBody
//    @IgnoreAuth
//    @GetMapping("wxPay/test")
//    public PayResponse testPay(Double amount) {
//        return payService.testWxPay(amount);
//    }


    /**
     * 异步回调
     */
    @IgnoreAuth
    @PostMapping("pay/notify")
    public ModelAndView notify(@RequestBody String notifyData) {

        PayResponse response = payService.payNotify(notifyData);

        //返回成功信息给支付平台，否则会不停的异步通知
        if (response.getPayPlatformEnum() == BestPayPlatformEnum.WX) {
            return new ModelAndView("pay/responseSuccessForWx");
        } else if (response.getPayPlatformEnum() == BestPayPlatformEnum.ALIPAY) {
            return new ModelAndView("pay/responseSuccessForAlipay");
        }
        throw new NtsException("错误的支付平台");
    }

    @ApiOperation("支付结果【客户端】")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "orderCode", value = "订单编号", required = true, dataType = "String", paramType = "query", example = "DF_20191201235325448490355")
    })
    @ResponseBody
    @GetMapping("pay/end")
    public RestResponse payEnd(String orderCode, @ApiIgnore @LoginUser NtsUser loginUser) {
        NtsAssert.isBlank(orderCode, "订单编号不能为空");
        return payService.payEnd(orderCode);
    }
}
