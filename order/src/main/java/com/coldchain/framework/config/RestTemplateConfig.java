package com.coldchain.framework.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @PackageName: com.coldchain.framework.config
 * @program: demo
 * @author: ruosen
 * @create: 2020-04-08 08:53
 **/
@Configuration
public class RestTemplateConfig {


    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
