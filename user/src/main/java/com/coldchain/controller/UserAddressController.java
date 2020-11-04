package com.coldchain.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coldchain.entity.User;
import com.coldchain.entity.UserAddress;
import com.coldchain.entity.vo.UserAddressRq;
import com.coldchain.service.UserAddressService;
import com.coldchain.service.impl.AuthenticationFacade;
import com.common.dto.UserDto;
import com.common.exception.ShopException;
import com.common.vo.SBApi;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author dyr
 * @since 2019-11-28
 */
@RestController
@RequestMapping("address")
@Api(value = "用户地址控制器", tags = {"用户地址相关接口"})
public class UserAddressController {
    @Autowired
    private UserAddressService userAddressService;

    @Autowired
    private AuthenticationFacade authenticationFacade;

    @ApiOperation("收货地址分页")
    @GetMapping("/page")
    public SBApi page(@ApiParam("当前页") @RequestParam(value = "p", defaultValue = "1") Integer page,
                      @ApiParam("每页大小") @RequestParam(value = "size", defaultValue = "10") Integer size) {
        UserDto userDto = authenticationFacade.getUser();

        QueryWrapper<UserAddress> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_id", userDto.getUserId()).orderByDesc("is_default");
        Page<UserAddress> userAddressPage = userAddressService.page(new Page<UserAddress>(page, size), queryWrapper);
        return new SBApi(userAddressPage);

    }

//    @PreAuthorize("hasAnyRole('USER')")
    @ApiOperation(value = "添加用户地址")
    @PostMapping
    public SBApi addAddress(@RequestBody @Valid UserAddressRq userAddressRq, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new ShopException(-1,bindingResult.getFieldError().getDefaultMessage());
        }
        userAddressService.addUserAddress(userAddressRq);
        return new SBApi();
    }

//    @PreAuthorize("hasAnyRole('USER')")
    @ApiOperation(value = "修改用户地址")
    @PutMapping
    public SBApi updateAddress(@RequestBody @Valid UserAddressRq userAddressRq,BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new ShopException(-1,bindingResult.getFieldError().getDefaultMessage());
        }
        userAddressService.updateUserAddress(userAddressRq);
        return new SBApi();
    }

//    @PreAuthorize("hasAnyRole('USER')")
    @ApiOperation(value = "删除用户地址")
    @PostMapping("/delete")
    public SBApi removeUserAddress(@ApiParam("用户地址id") @RequestBody String ids) {
        userAddressService.removeUserAddress(ids);
        return new SBApi();
    }

    @ApiOperation(value = "设为默认")
    @PostMapping("/is_default")
    public SBApi isDefaultUserAddress(@ApiParam("用户地址id") @RequestBody String id) {
        userAddressService.isDefaultUserAddress(id);
        return new SBApi();
    }


}
