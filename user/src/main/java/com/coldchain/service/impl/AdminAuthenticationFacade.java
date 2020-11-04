package com.coldchain.service.impl;

import com.alibaba.fastjson.JSON;
import com.coldchain.service.IAdminAuthenticationFacade;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.stereotype.Component;

import java.util.Map;


@Component
public class AdminAuthenticationFacade implements IAdminAuthenticationFacade {

    @Override
    public Authentication getAuthentication() {
        return SecurityContextHolder.getContext().getAuthentication();
    }

    public <T> T getPrincipal(Class<T> clazz) {
        Object o = ((OAuth2Authentication) getAuthentication()).getUserAuthentication().getDetails();
        return JSON.parseObject(JSON.toJSONString(JSON.parseObject(JSON.toJSONString(o), Map.class).get("principal")), clazz);
    }
}