package com.common.config;

import com.common.properties.ColdChainProperties;
import com.common.service.ColdChainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;

@Configuration
@EnableConfigurationProperties(ColdChainProperties.class)
@ConditionalOnProperty(
        prefix = "coldchain",
        name = "isopen",
        havingValue = "true"
)
public class ColdChainConfig {
    @Autowired
    private ColdChainProperties coldChainProperties;

    @Bean(name = "coldchain")
    public ColdChainService demoService(){
        return new ColdChainService(coldChainProperties.getSayWhat(), coldChainProperties.getToWho());
    }


    @Bean
    public RestTemplate restTemplate(ClientHttpRequestFactory ff) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setRequestFactory(ff);
        restTemplate.getMessageConverters().set(1,new StringHttpMessageConverter(Charset.forName("UTF-8")));
        return restTemplate;
    }

    @Bean
    public ClientHttpRequestFactory clientHttpRequestFactory(){
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        factory.setReadTimeout(15000);
        factory.setConnectTimeout(15000);
        return factory;
    }
}
