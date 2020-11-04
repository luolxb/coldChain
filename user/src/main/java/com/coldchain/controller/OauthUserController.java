package com.coldchain.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.coldchain.entity.OauthUser;
import com.coldchain.entity.User;
import com.coldchain.service.OauthUserService;
import com.coldchain.service.impl.AuthenticationFacade;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(hidden = true)
@RequestMapping("/oauth")
public class OauthUserController {

    @Autowired
    private OauthUserService oauthUserService;
    @Autowired
    private AuthenticationFacade authenticationFacade;

    @PreAuthorize("hasAnyRole('USER')")
    @GetMapping("/list")
    public List<OauthUser> getCurrent(){
        User user = authenticationFacade.getPrincipal(User.class);
        return oauthUserService.list((new QueryWrapper<OauthUser>()).eq("user_id", user.getUserId()));
    }

    @GetMapping
    public OauthUser getOne(@RequestParam(value = "oauth") String oauth, @RequestParam(value = "openid") String openid){
        return oauthUserService.getOne((new QueryWrapper<OauthUser>()).eq("oauth", oauth).eq("openid", openid));
    }
}
