package com.coldchain.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.coldchain.entity.User;
import com.coldchain.entity.UserExtend;
import com.coldchain.service.UserExtendService;
import com.coldchain.service.impl.AuthenticationFacade;
import com.common.vo.SBApi;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

/**
 * 前端控制器
 *
 * @author dyr
 * @since 2019-09-06
 */
@Api(
        value = "用户扩展控制器",
        tags = {"用户扩展相关接口"},hidden = true)
@PreAuthorize("hasAnyRole('ROLE_USER')")
@RequestMapping("/user_extend")
@RestController
public class UserExtendController {
    @Autowired private UserExtendService userExtendService;
    @Autowired private AuthenticationFacade authenticationFacade;

    @ApiOperation(value = "获取用户发票", notes = "获取用户发票记录")
    @GetMapping
    public UserExtend invoice() {
        User user = authenticationFacade.getPrincipal(User.class);
        return userExtendService.getOne(
                new QueryWrapper<UserExtend>().eq("user_id", user.getUserId()), false);
    }

    @ApiOperation(value = "添加或者修改用户发票", notes = "修改用户发票记录")
    @PutMapping
    public SBApi saveInvoice(@RequestBody UserExtend userExtend) {
        User user = authenticationFacade.getPrincipal(User.class);
        userExtendService.saveInvoice(user, userExtend);
        return new SBApi();
    }
}
