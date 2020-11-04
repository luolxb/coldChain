package com.common.service.impl;


import com.alibaba.fastjson.JSON;
import com.alipay.api.AlipayApiException;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradeAppPayRequest;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.alipay.api.request.AlipayTradeRefundRequest;
import com.alipay.api.request.AlipayTradeWapPayRequest;
import com.alipay.api.response.AlipayTradeRefundResponse;
import com.common.config.AlipayConfig;
import com.common.service.AlipayService;
import com.common.utils.AliSignUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Service
public class AlipayServiceImpl implements AlipayService {

    /**
     * web支付下单并支付(web支付在安卓中是可以直接唤醒支付宝APP的)
     * url https://doc.open.alipay.com/doc2/detail.htm?treeId=203&articleId=105463&docType=1#s1
     *
     * @return web支付的表单
     */
    @Override
    public String tradePayRequest(String orderCode, BigDecimal price, String body, String type) {
        String str = null;
        switch (type) {
            case "APP":
                str = alipayTradeAppPayRequest(orderCode, price, body);
                break;
            case "WEB":
                str = alipayTradeWebPayRequest(orderCode, price, body);
                break;
            case "WAP":
                str = alipayTradeWapPayRequest(orderCode, price, body);
                break;
        }
        return str;
    }

    private String alipayTradeAppPayRequest(String orderCode, BigDecimal price, String body) {
        AlipayTradeAppPayRequest alipayRequest = new AlipayTradeAppPayRequest();
        alipayRequest.setReturnUrl(AlipayConfig.RETURN_URL);
        alipayRequest.setNotifyUrl(AlipayConfig.PAY_NOTIFY);

        Map<String, Object> map = new HashMap<>();
        Map<String, Object> map1 = new HashMap<>();
        map.put("out_trade_no", orderCode);
        map.put("product_code", orderCode);
        map.put("total_amount", price);
        map.put("subject", body);
        map.put("body", body);
        map.put("passback_params", orderCode);
        map.put("extend_params", map1.put("sys_service_provider_id", System.currentTimeMillis()));

        // 待请求参数数组
//        alipayRequest.setBizContent("{" +
//                "    \"out_trade_no\":\"20200924010101003\"," +
//                "    \"product_code\":\"FAST_INSTANT_TRADE_PAY\"," +
//                "    \"total_amount\":88.88," +
//                "    \"subject\":\"Iphone11 16G\"," +
//                "    \"body\":\"Iphone6 16G\"," +
//                "    \"passback_params\":\"merchantBizType%3d3C%26merchantBizNo%3d2016010101111\"," +
//                "    \"extend_params\":{" +
//                "    \"sys_service_provider_id\":\"2188511833217846\"" +
//                "    }" +
//                "  }"); //填充业务参数
        alipayRequest.setBizContent(JSON.toJSONString(map));
        String form = "";

        try {
            form = AlipayConfig.getInstance().pageExecute(alipayRequest).getBody();
        } catch (AlipayApiException e) {
            log.error("支付宝构造表单失败", e);
        }
        log.info("支付宝支付表单构造:" + form);
        return form;
    }

    String alipayTradeWebPayRequest(String orderCode, BigDecimal price, String body) {

        AlipayTradePagePayRequest pagePayRequest = new AlipayTradePagePayRequest();
        pagePayRequest.setReturnUrl(AlipayConfig.RETURN_URL);
        pagePayRequest.setNotifyUrl(AlipayConfig.PAY_NOTIFY);

        // 待请求参数数组
//        pagePayRequest.setBizContent(); //填充业务参数
//        alipayRequest.setBizContent(JSON.toJSONString(sParaTemp));
        String form = "";

        try {
            form = AlipayConfig.getInstance().pageExecute(pagePayRequest).getBody();
        } catch (AlipayApiException e) {
            log.error("支付宝构造表单失败", e);
        }
        log.info("支付宝支付表单构造:" + form);
        return form;
    }

    String alipayTradeWapPayRequest(String orderCode, BigDecimal price, String body) {
        AlipayTradeWapPayRequest wapPayRequest = new AlipayTradeWapPayRequest();
        wapPayRequest.setReturnUrl(AlipayConfig.RETURN_URL);
        wapPayRequest.setNotifyUrl(AlipayConfig.PAY_NOTIFY);

        // 待请求参数数组
        wapPayRequest.setBizContent("{" +
                "    \"out_trade_no\":\"20200924010101003\"," +
                "    \"product_code\":\"FAST_INSTANT_TRADE_PAY\"," +
                "    \"total_amount\":88.88," +
                "    \"subject\":\"Iphone11 16G\"," +
                "    \"body\":\"Iphone6 16G\"," +
                "    \"passback_params\":\"merchantBizType%3d3C%26merchantBizNo%3d2016010101111\"," +
                "    \"extend_params\":{" +
                "    \"sys_service_provider_id\":\"2188511833217846\"" +
                "    }" +
                "  }"); //填充业务参数
//        alipayRequest.setBizContent(JSON.toJSONString(sParaTemp));
        String form = "";

        try {
            form = AlipayConfig.getInstance().pageExecute(wapPayRequest).getBody();
        } catch (AlipayApiException e) {
            log.error("支付宝构造表单失败", e);
        }
        log.info("支付宝支付表单构造:" + form);
        return form;
    }


    /**
     * 申请退款
     *
     * @param sParaTemp 退款参数
     * @return true成功, 回调中处理
     * 备注:https://doc.open.alipay.com/docs/api.htm?spm=a219a.7629065.0.0.3RjsEZ&apiId=759&docType=4
     */
    @Override
    public boolean tradeRefundRequest(Map<String, ?> sParaTemp) throws AlipayApiException {
        AlipayTradeRefundRequest request = new AlipayTradeRefundRequest();
        request.setReturnUrl(AlipayConfig.RETURN_URL);
        request.setNotifyUrl(AlipayConfig.REFUND_NOTIFY);
        // 待请求参数数组
        request.setBizContent(JSON.toJSONString(sParaTemp));
        AlipayTradeRefundResponse response = AlipayConfig.getInstance().execute(request);
        log.debug("支付宝退货结果:" + response.isSuccess());
        return response.isSuccess();
    }

    /**
     * 支付宝回调验签
     *
     * @param request 回调请求
     * @return true成功
     * 备注:验签成功后，按照支付结果异步通知中的描述(二次验签接口,貌似称为历史接口了)
     */
    @Override
    public boolean verifyNotify(HttpServletRequest request) throws AlipayApiException {
        Map<String, String> paranMap = AliSignUtil.request2Map(request);
        log.debug("支付宝回调参数:" + paranMap.toString());
        boolean isVerify = false;
        if (AlipayConfig.SUCCESS_REQUEST.equals(paranMap.get("trade_status")) || AlipayConfig.TRADE_CLOSED.equals(paranMap.get("trade_status"))) {
            isVerify = AlipaySignature.rsaCheckV1(paranMap, AlipayConfig.ALIPAY_PUBLIC_KEY, AlipayConfig.CHARSET); //调用SDK验证签名
        }
        log.debug("支付宝验签结果" + isVerify);
        return isVerify;
    }
}

