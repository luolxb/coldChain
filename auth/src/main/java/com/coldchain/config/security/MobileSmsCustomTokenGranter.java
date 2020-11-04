package com.coldchain.config.security;

import com.coldchain.entity.User;
import com.coldchain.service.CustomUserDetailsService;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.OAuth2RequestFactory;
import org.springframework.security.oauth2.provider.token.AuthorizationServerTokenServices;

import java.util.Map;

public class MobileSmsCustomTokenGranter extends AbstractCustomTokenGranter {

    protected CustomUserDetailsService userDetailsService;

    public MobileSmsCustomTokenGranter(CustomUserDetailsService userDetailsService, AuthorizationServerTokenServices tokenServices, ClientDetailsService clientDetailsService, OAuth2RequestFactory requestFactory) {
        super(tokenServices, clientDetailsService, requestFactory, "sms");
        this.userDetailsService = userDetailsService;
    }

    @Override
    protected User getUser(Map<String, String> parameters) {
        String mobile = parameters.get("mobile");
        String smscode = parameters.get("smscode");
        return userDetailsService.loadUserByMobileAndSmsCode(mobile, smscode);
    }

}