package com.common.service;

import com.alipay.api.AlipayApiException;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.Map;

public interface AlipayService {
    String tradePayRequest(String orderCode, BigDecimal price, String body, String type);

    boolean tradeRefundRequest(Map<String, ?> sParaTemp) throws AlipayApiException;

    boolean verifyNotify(HttpServletRequest request) throws AlipayApiException;

}
