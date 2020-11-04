package com.coldchain.framework.config.pay;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 微信支付
 */
@Data
@ConfigurationProperties(prefix = "wechat")
@Component
public class WeChatAccountConfig {

    /**
     * 公众账号appId
     * 获取地址 https://mp.weixin.qq.com
     */
    private String mpAppId;

    /**
     * 小程序appId
     * 获取地址 https://mp.weixin.qq.com
     */
    private String miniAppId;

    /**
     * 小程序appSecret
     */
    private String miniAppSecret;

    /**
     * 商户号
     * 获取地址 https://pay.weixin.qq.com
     */
    private String mchId;

    /**
     * 商户密钥
     */
    private String mchKey;

    /**
     * 商户证书路径
     */
    private String keyPath;

    /**
     * 微信支付异步通知地址
     */
    private String notifyUrl;

    /**
     * app应用appid
     * 获取地址 https://open.weixin.qq.com
     */
    private String appAppId;
}
