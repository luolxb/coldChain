package com.coldchain.project.ocpcl.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * OCP配置
 */
@Data
@ConfigurationProperties(prefix = "ocp")
@Component
public class OcpclConfig {

    /**
     * Token
     */
    private String token;
    /**
     * 回调地址
     */
    private String callbackEndpoint;
}
