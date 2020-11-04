package com.coldchain.framework.config.pay;

import com.lly835.bestpay.config.AliPayConfig;
import com.lly835.bestpay.config.WxPayConfig;
import com.lly835.bestpay.service.impl.BestPayServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 支付配置
 */
@Configuration
public class PayConfig {

    @Autowired
    private WeChatAccountConfig weChatAccountConfig;

    @Autowired
    private AliPayAccountConfig aliPayAccountConfig;


    @Bean
    public WxPayConfig wxPayConfig() {
        WxPayConfig wxPayConfig = new WxPayConfig();
        wxPayConfig.setAppId(weChatAccountConfig.getMpAppId());
        wxPayConfig.setMiniAppId(weChatAccountConfig.getMiniAppId());
        wxPayConfig.setMchId(weChatAccountConfig.getMchId());
        wxPayConfig.setMchKey(weChatAccountConfig.getMchKey());
        wxPayConfig.setKeyPath(weChatAccountConfig.getKeyPath());
        wxPayConfig.setNotifyUrl(weChatAccountConfig.getNotifyUrl());
        wxPayConfig.setAppAppId(weChatAccountConfig.getAppAppId());
        return wxPayConfig;
    }

    @Bean
    public AliPayConfig aliPayConfig() {
        AliPayConfig aliPayConfig = new AliPayConfig();
        aliPayConfig.setNotifyUrl(aliPayAccountConfig.getNotifyUrl());
        aliPayConfig.setAppId(aliPayAccountConfig.getAppId());
        aliPayConfig.setPrivateKey(aliPayAccountConfig.getPrivateKey());
        aliPayConfig.setAliPayPublicKey(aliPayAccountConfig.getAliPayPublicKey());
        aliPayConfig.setSandbox(true);
        aliPayConfig.setReturnUrl(aliPayAccountConfig.getReturnUrl());
        return aliPayConfig;
    }

    @Bean
    public BestPayServiceImpl bestPayService(WxPayConfig wxPayConfig, AliPayConfig aliPayConfig) {
        BestPayServiceImpl bestPayService = new BestPayServiceImpl();
        bestPayService.setWxPayConfig(wxPayConfig);
        bestPayService.setAliPayConfig(aliPayConfig);
        return bestPayService;
    }
}
