package com.coldchain.project.business.pay;

import com.lly835.bestpay.enums.BestPayPlatformEnum;
import com.lly835.bestpay.enums.BestPayTypeEnum;
import com.lly835.bestpay.model.PayRequest;
import com.lly835.bestpay.model.PayResponse;
import com.lly835.bestpay.service.impl.BestPayServiceImpl;
import com.lly835.bestpay.utils.JsonUtil;
import com.coldchain.common.constant.Constants;
import com.coldchain.common.exception.NtsException;
import com.coldchain.common.utils.NtsUtil;
import com.coldchain.common.utils.RestResponse;
import com.coldchain.common.utils.StringUtils;
import com.coldchain.common.validator.NtsAssert;
import com.coldchain.project.business.order.domain.OrderCompanyFlow;
import com.coldchain.project.business.order.domain.OrderDeviceFlow;
import com.coldchain.project.business.order.service.IOrderCompanyFlowService;
import com.coldchain.project.business.order.service.IOrderDeviceFlowService;
import com.coldchain.project.business.user.domain.NtsUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

/**
 * 企业支付Service业务层处理
 */
@Slf4j
@Service
public class PayServiceImpl implements IPayService {

    @Autowired
    private IOrderDeviceFlowService orderDeviceFlowService;

    @Autowired
    private IOrderCompanyFlowService orderCompanyFlowService;

    @Autowired
    private BestPayServiceImpl bestPayService;


    /**
     * 微信支付-设备流量订单
     *
     * @param orderCode 订单编号
     * @param loginUser 登录用户
     * @return
     */
    @Transactional
    @Override
    public RestResponse wxPayForDeviceFlowOrder(String orderCode, NtsUser loginUser) {
        OrderDeviceFlow orderDeviceFlow = orderDeviceFlowService.queryOrderDeviceFlowByOrderCode(orderCode);
        NtsAssert.isNull(orderDeviceFlow, "此订单不存在，不能进行支付");

        switch (orderDeviceFlow.getOrderStatus()) {
            case 1: //1-处理中
                return RestResponse.error(4, "订单付款中，无需再操作！");
            case 2: //2-已完成
                return RestResponse.error(4, "订单已完成，无需再操作！");
            case 3: //3-取消
                return RestResponse.error(4, "订单已取消，无需再操作！");
        }

        //支付请求参数
        PayRequest request = new PayRequest();
        request.setOrderId(orderDeviceFlow.getOrderCode());
        request.setPayTypeEnum(BestPayTypeEnum.WXPAY_NATIVE);
        request.setOrderName("新时空智能系统");
        request.setOrderAmount(orderDeviceFlow.getActualPrice().doubleValue());
        request.setAttach("新时空智能系统-设备流量购买");
        //log.info("【发起支付】request={}", JsonUtil.toJson(request));

        PayResponse payResponse = bestPayService.pay(request);
        //log.info("【发起支付】response={}", JsonUtil.toJson(payResponse));
        NtsAssert.isNull(payResponse, "【发起支付】微信支付出错了！");

        //业务处理
        orderDeviceFlow.setOrderStatus(1);  //处理中
        orderDeviceFlow.setPayCode(payResponse.getPackAge().substring(10)); //支付流水号
        orderDeviceFlow.setPayModelId(1); //微信支付
        orderDeviceFlow.setCurrencyTypeId(1); //货币种类：1-默认人民币
        orderDeviceFlow.setPayName("新时空智能系统-设备流量购买");
        orderDeviceFlow.setPayStatus(1); //支付中
        //更新设备流量订单
        orderDeviceFlowService.updateOrderDeviceFlow(orderDeviceFlow);

        Map<String, String> resultMap = new HashMap<>();
        resultMap.put("codeUrl", payResponse.getCodeUrl());
        return RestResponse.success(resultMap);
    }

    /**
     * 微信支付-企业流量订单
     *
     * @param orderCode 订单编号
     * @param loginUser 登录用户
     * @return
     */
    @Transactional
    @Override
    public RestResponse wxPayForCompanyFlowOrder(String orderCode, NtsUser loginUser) {
        OrderCompanyFlow orderCompanyFlow = orderCompanyFlowService.queryOrderCompanyFlowByOrderCode(orderCode);
        NtsAssert.isNull(orderCompanyFlow, "此订单不存在，不能进行支付");

        switch (orderCompanyFlow.getOrderStatus()) {
            case 1: //1-处理中
                return RestResponse.error(4, "订单付款中，无需再操作！");
            case 2: //2-已完成
                return RestResponse.error(4, "订单已完成，无需再操作！");
            case 3: //3-取消
                return RestResponse.error(4, "订单已取消，无需再操作！");
        }

        // 判断订单额度是否满足，微信支付支持最低额度0.01
        if (orderCompanyFlow.getActualPrice().doubleValue() < 0.01) {
            // 订单金额过小，无法支付，更改为付款失败状态
            orderCompanyFlow.setOrderStatus(5);  //订单状态 0-待付款 1-处理中 2-已完成 3-取消 4-售后 5-付款失败
            orderCompanyFlow.setPayModelId(1); //微信支付
            orderCompanyFlow.setCurrencyTypeId(1); //货币种类：1-默认人民币
            orderCompanyFlow.setPayName("新时空智能系统-企业流量购买");
            orderCompanyFlow.setPayStatus(3); //支付状态 0-初始化 1-付款中,2-支付成功,3-支付失败
            //更新设备流量订单
            orderCompanyFlowService.updateOrderCompanyFlow(orderCompanyFlow);
            return RestResponse.error("支付失败，支付金额太少");
        }

        PayRequest request = new PayRequest();
        request.setOrderId(orderCompanyFlow.getOrderCode());
        request.setPayTypeEnum(BestPayTypeEnum.WXPAY_NATIVE);
        request.setOrderName("新时空智能系统");
        request.setOrderAmount(orderCompanyFlow.getActualPrice().doubleValue());
        request.setAttach("新时空智能系统-企业流量购买");

        PayResponse payResponse = null;
        try {//支付请求参数
            //log.info("【发起支付】request={}", JsonUtil.toJson(request));
            payResponse = bestPayService.pay(request);
            //log.info("【发起支付】response={}", JsonUtil.toJson(payResponse));
        } catch (Exception ex) {
            log.error("【发起支付】" + ex.getMessage());
            throw new NtsException("【发起支付】微信支付出错了！");
        }

        NtsAssert.isNull(payResponse, "【发起支付】微信支付出错了！");

        //业务处理
        orderCompanyFlow.setOrderStatus(1);  //订单状态 0-待付款 1-处理中 2-已完成 3-取消 4-售后 5-付款失败
        orderCompanyFlow.setPayCode(payResponse.getPackAge().substring(10)); //支付流水号
        orderCompanyFlow.setPayModelId(1); //微信支付
        orderCompanyFlow.setCurrencyTypeId(1); //货币种类：1-默认人民币
        orderCompanyFlow.setPayName("新时空智能系统-企业流量购买");
        orderCompanyFlow.setPayStatus(1); //支付状态 0-初始化 1-付款中,2-支付成功,3-支付失败
        //更新设备流量订单
        orderCompanyFlowService.updateOrderCompanyFlow(orderCompanyFlow);

        Map<String, String> resultMap = new HashMap<>();
        resultMap.put("codeUrl", payResponse.getCodeUrl());
        return RestResponse.success(resultMap);
    }

    /**
     * 阿里支付-设备流量订单
     *
     * @param orderCode 订单编号
     * @param loginUser 登录用户
     * @return
     */
    @Override
    public RestResponse aliPayForFlowOrder(String orderCode, NtsUser loginUser) {
        return RestResponse.error("待接入支付宝");
    }

    /**
     * 测试微信支付
     *
     * @param amount 金额
     * @return 结果
     */
    @Override
    public PayResponse testWxPay(Double amount) {
        //支付请求参数
        PayRequest request = new PayRequest();
        request.setPayTypeEnum(BestPayTypeEnum.WXPAY_NATIVE);
        request.setOrderId(NtsUtil.generateOrderNumber());
        request.setOrderAmount(amount);
        request.setOrderName("测试支付");
        request.setAttach("测试支付");
        log.info("【发起支付】request={}", JsonUtil.toJson(request));

        PayResponse payResponse = bestPayService.pay(request);
        log.info("【发起支付】response={}", JsonUtil.toJson(payResponse));
        return payResponse;
    }

    /**
     * 支付回调通知
     *
     * @param notifyData 回调字符串
     * @return 结果
     */
    @Override
    public PayResponse payNotify(String notifyData) {
        //log.info("【异步通知】支付平台的数据request={}", notifyData);
        PayResponse response = bestPayService.asyncNotify(notifyData);
        //log.info("【异步通知】处理后的数据data={}", JsonUtil.toJson(response));

        if (response.getPayPlatformEnum() != BestPayPlatformEnum.WX
                && response.getPayPlatformEnum() != BestPayPlatformEnum.ALIPAY) {
            throw new NtsException("错误的支付平台");
        }
        String[] TAG = response.getOrderId().split("_");
        if (Constants.DF_TAG.equals(TAG[0])) {  //设备流量订单
            OrderDeviceFlow orderDeviceFlow = orderDeviceFlowService.queryOrderDeviceFlowByOrderCode(response.getOrderId());
            if (StringUtils.isNotNull(orderDeviceFlow)) {
                //更新设备流量订单/设备流量池由支付成功后
                orderDeviceFlowService.updateOrderDeviceFlowByPayOk(orderDeviceFlow);
            } else {
                log.error("【异步通知】查询不到设备流量订单！");
            }
        } else if (Constants.CF_TAG.equals(TAG[0])) { //企业流量订单
            OrderCompanyFlow orderCompanyFlow = orderCompanyFlowService.queryOrderCompanyFlowByOrderCode(response.getOrderId());
            if (StringUtils.isNotNull(orderCompanyFlow)) {
                //更新企业流量订单/企业流量池由支付成功后
                orderCompanyFlowService.updateOrderCompanyFlowByPayOk(orderCompanyFlow);
            } else {
                log.error("【异步通知】查询不到企业流量订单！");
            }
        } else {
            log.error("【异步通知】订单编号不存在！");
        }
        return response;
    }

    /**
     * 支付结果
     *
     * @param orderCode 订单编号
     * @return 结果
     */
    @Override
    public RestResponse payEnd(String orderCode) {
        String[] TAG = orderCode.split("_");
        if (Constants.DF_TAG.equals(TAG[0])) {  //设备流量订单
            OrderDeviceFlow order = orderDeviceFlowService.queryOrderDeviceFlowByOrderCode(orderCode);
            NtsAssert.isNull(order, "【支付结果】查询不到设备流量订单！");
            if (order.getOrderStatus() == 0 && order.getPayStatus() == 0) {  //待付款
                return RestResponse.error(1, "设备流量订单待付款");
            } else if (order.getOrderStatus() == 1 && order.getPayStatus() == 1) { //付款中
                return RestResponse.error(2, "设备流量订单付款中");
            } else if (order.getOrderStatus() == 2 && order.getPayStatus() == 2) { //支付完成
                return RestResponse.success("设备流量订单支付完成");
            } else {
                return RestResponse.error(3, "设备流量订单不处于支付流程");
            }
        } else if (Constants.CF_TAG.equals(TAG[0])) {
            OrderCompanyFlow order = orderCompanyFlowService.queryOrderCompanyFlowByOrderCode(orderCode);
            NtsAssert.isNull(order, "【支付结果】查询不到企业流量订单！");
            if (order.getOrderStatus() == 0 && order.getPayStatus() == 0) {  //待付款
                return RestResponse.error(1, "企业流量订单待付款");
            } else if (order.getOrderStatus() == 1 && order.getPayStatus() == 1) { //付款中
                return RestResponse.error(2, "企业流量订单付款中");
            } else if (order.getOrderStatus() == 2 && order.getPayStatus() == 2) { //支付完成
                return RestResponse.success("企业流量订单支付完成");
            } else {
                return RestResponse.error(3, "企业流量订单不处于支付流程");
            }
        } else {
            throw new NtsException("无法识别此订单编号");
        }
    }
}
