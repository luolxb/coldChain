package com.coldchain.controller.app;

import com.coldchain.entity.User;
import com.coldchain.entity.vo.UserRq;
import com.coldchain.service.UserService;
import com.coldchain.service.impl.AuthenticationFacade;
import com.common.dto.UserDto;
import com.common.vo.SBApi;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(value = "App用户控制器", tags = {"App用户控制器"})
@Slf4j
@RestController
@RequestMapping("app/user")
public class UserAppController {

    @Autowired
    private UserService userService;

    @Autowired
    private AuthenticationFacade authenticationFacade;

    @ApiOperation("获取用户详情")
    @GetMapping("/userInfo")
    public SBApi userInfo(){
        UserDto userDto = authenticationFacade.getUser();
        User user = userService.getById(userDto.getUserId());
        return new SBApi(user);
    }

    @ApiOperation("修改头像")
    @PostMapping("/updateHeadPic")
    public SBApi updateHeadPic(@RequestBody UserRq userRq){
        UserDto user = authenticationFacade.getUser();
        userRq.setUserId(user.getUserId());
        userService.updateHeadPic(userRq);
        return new SBApi();
    }


}
