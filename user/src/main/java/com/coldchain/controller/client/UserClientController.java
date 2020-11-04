package com.coldchain.controller.client;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coldchain.entity.vo.UserManagerLockRq;
import com.coldchain.entity.vo.UserManagerRq;
import com.coldchain.entity.vo.UserManagerVo;
import com.coldchain.entity.vo.UserRq;
import com.coldchain.service.UserService;
import com.coldchain.vo.UserChangePhoneRq;
import com.coldchain.vo.UserChangePwdVo;
import com.common.dto.UserDto;
import com.common.exception.ShopException;
import com.common.vo.SBApi;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("user/c")
@Api(tags = "用户、商户平台 用户中心")
public class UserClientController {

    @Autowired
    private UserService userService;

    @ApiOperation(("获取用户信息"))
    @GetMapping("userInfo")
    public SBApi getUserInfo(@ApiParam("用户ID") @RequestParam(value = "userId", required = false) Integer userId) {
        return new SBApi(userService.getUserInfo(userId));
    }

    @ApiOperation("修改用户图像")
    @PostMapping("headPic")
    public SBApi updateHeadPic(@RequestBody UserRq userRq) {
        userService.updateHeadPic(userRq);
        return new SBApi();
    }

    @ApiOperation("修改密码")
    @PostMapping("password")
    public SBApi password(@Valid @RequestBody UserChangePwdVo userChangePwdVo, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new ShopException(-1, bindingResult.getFieldError().getDefaultMessage());
        }
        userService.updatePassword(userChangePwdVo);
        return new SBApi();
    }

    @ApiOperation("绑定手机")
    @PostMapping("bindPhone")
    public SBApi bindPhone(@Valid @RequestBody UserChangePhoneRq userChangePhoneRq, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new ShopException(-1, bindingResult.getFieldError().getDefaultMessage());
        }
        userService.bindPhone(userChangePhoneRq);
        return new SBApi();
    }

    /****************************************用户管理**********************************************************************/

    @ApiOperation("新增用户")
    @PostMapping("add")
    public SBApi add(@Valid @RequestBody UserManagerRq userManagerRq, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new ShopException(-1, bindingResult.getFieldError().getDefaultMessage());
        }
        userService.add(userManagerRq);
        return new SBApi();
    }

    @ApiOperation("修改用户")
    @PostMapping("edit")
    public SBApi edit(@Valid @RequestBody UserManagerRq userManagerRq, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new ShopException(-1, bindingResult.getFieldError().getDefaultMessage());
        }
        userService.edit(userManagerRq);
        return new SBApi();
    }

    @ApiOperation("删除用户")
    @PostMapping("delete")
    public SBApi delete(@RequestBody String ids) {
        userService.delete(ids);
        return new SBApi();
    }

    @ApiOperation("启用/禁用用户")
    @PostMapping("lock")
    public SBApi locak(@Valid @RequestBody UserManagerLockRq userManagerLockRq, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new ShopException(-1, bindingResult.getFieldError().getDefaultMessage());
        }
        userService.lock(userManagerLockRq);
        return new SBApi();
    }

    // TODO  设备数量 短信数量 余额
    @ApiOperation("用户管理分页")
    @GetMapping("/userManagerPage")
    public SBApi userManagerPage(@ApiParam("用户名称") @RequestParam(value = "realname", required = false) String realname,
                                 @ApiParam("用户账号") @RequestParam(value = "nickname", required = false) String nickname,
                                 @ApiParam("状态 0 启用，1禁用") @RequestParam(value = "isLock", required = false) String isLock,
                                 @ApiParam("开始时间 时间戳") @RequestParam(value = "start", required = false) Long start,
                                 @ApiParam("结束时间 时间戳") @RequestParam(value = "end", required = false) Long end,
                                 @ApiParam("当前页") @RequestParam(value = "p", defaultValue = "1") Integer page,
                                 @ApiParam("每页大小") @RequestParam(value = "size", defaultValue = "10") Integer size) {
        Page<UserManagerVo> userManagerVoPage = userService.userManagerPage(realname, nickname, isLock, start, end, page, size);
        return new SBApi(userManagerVoPage);
    }

    // TODO 设备数量 短信数量 余额 语音数量 设备数据列表
    @ApiOperation("用户管理 查看")
    @GetMapping("/userManagerDetail")
    public SBApi userManagerDetail(@ApiParam("用户ID") @RequestParam("userId") Integer userId) {
        UserManagerVo userManagerVo = userService.userManagerDetail(userId);
        return new SBApi(userManagerVo);
    }


    /**
     * 根据企业ID获取用户ID
     *
     * @param companyId
     * @return
     */
    @GetMapping("/user/companyId")
    UserDto getUserByCompanyId(@RequestParam("companyId") Long companyId){
        return userService.getUserByCompanyId(companyId);
    }

}
