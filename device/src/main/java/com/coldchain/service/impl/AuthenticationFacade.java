package com.coldchain.service.impl;

import com.alibaba.fastjson.JSON;
import com.coldchain.service.IAuthenticationFacade;
import com.common.dto.AdminDto;
import com.common.dto.SellerDto;
import com.common.dto.UserDto;
import com.common.exception.ShopException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.stereotype.Component;

import java.util.Map;

@Slf4j
@Component
public class AuthenticationFacade implements IAuthenticationFacade {

    @Override
    public Authentication getAuthentication() {
        return SecurityContextHolder.getContext().getAuthentication();
    }

    public <T> T getPrincipal(Class<T> clazz) {
        Object o = ((OAuth2Authentication) getAuthentication()).getUserAuthentication().getDetails();
        return JSON.parseObject(JSON.toJSONString(JSON.parseObject(JSON.toJSONString(o), Map.class).get("principal")), clazz);
    }

    public SellerDto getSeller(){
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        SellerDto seller = null;
        if (!"anonymousUser".equals(principal)) {
            seller = getPrincipal(SellerDto.class);
        }

        return seller;
    }

    public UserDto getUser(){
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if ("anonymousUser".equals(principal)) {
            throw new ShopException(-1,"请登录");
        }

        return getPrincipal(UserDto.class);
    }
    public AdminDto getAdmin(){
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if ("anonymousUser".equals(principal)) {
            throw new ShopException(-1,"请登录");
        }
        return getPrincipal(AdminDto.class);
    }

    public UserDetails getUserDetails(){

        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if ("anonymousUser".equals(principal)) {
            throw new ShopException(-1,"请登录");
        }
        if(null!=getPrincipal(AdminDto.class)){
            return getPrincipal(AdminDto.class);
        };
        if(null!=getPrincipal(SellerDto.class)){
            return getPrincipal(SellerDto.class);
        };
        return getPrincipal(UserDto.class);
    }

}