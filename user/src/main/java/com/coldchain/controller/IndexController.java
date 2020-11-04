package com.coldchain.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.coldchain.dto.UserLoginDto;
import com.coldchain.entity.OauthUser;
import com.coldchain.entity.Seller;
import com.coldchain.entity.User;

import com.coldchain.entity.vo.UserRegisterRq;
import com.coldchain.service.*;
import com.coldchain.sms.service.SendSmsServiceImpl;
import com.coldchain.utils.RedisUtils;
import com.coldchain.vo.LoginAdminVo;
import com.common.exception.ResultEnum;
import com.common.exception.ShopException;
import com.common.utils.RedisKey;
import com.common.vo.SBApi;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;

@Api(value = "用户登录注册控制器", tags = {"用户登录注册相关"})
@Slf4j
@RestController
public class IndexController {

    @Autowired
    private UserService userService;

    @Autowired
    private AdminService adminService;

    @Autowired
    private SellerService sellerService;

    @Autowired
    private AuthService authService;
    @Autowired
    private OauthUserService oauthUserService;
    @Value("${security.oauth2.client.scope}")
    private String scope;
    @Value("${security.oauth2.client.id}")
    private String clientId;
    @Value("${security.oauth2.client.client-secret}")
    private String clientSecret;

    @Value("${nts.cold.verification}")
    private Boolean verification;

    @Autowired
    private SendSmsServiceImpl sendSmsService;

    @Autowired
    private RedisUtils redisUtils;

    @ApiOperation(value = "小程序登录接口")
    @PostMapping("login/{oauth}")
    public String thirdLogin(
            @PathVariable(value = "oauth") String oauth,//miniapp
            @NotNull @RequestParam(value = "js_code") String jsCode,
            @Validated User loginUser) {
        OauthUser oauthUser = oauthUserService.getOauthUserByCode(jsCode);
        User user = userService.loginAndGetUser(loginUser, oauthUser);
        String result = authService.getTokenByThirdAuth("third_oauth", scope, clientId,
                clientSecret, oauth, oauthUser.getOpenid());
        userService.update(new UpdateWrapper<User>().eq("user_id", user.getUserId())
                .set("last_login", System.currentTimeMillis() / 1000));
        return result;
    }

//    @ApiOperation(value = "H5注册接口")
//    @PostMapping("register")
//    public SBApi register(@RequestBody User registerUser) {
//        userService.register(registerUser);
//        return new SBApi();
//    }

    @ApiOperation("获取短信验证码")
    @GetMapping("/sendCode")
    public SBApi senCode(@RequestParam("mobile") String mobile){
         sendSmsService.getCode(mobile);
        return new SBApi();
    }

    @ApiOperation(value = "H5注册接口1")
    @PostMapping("register")
    public SBApi register(@Valid @RequestBody UserRegisterRq userRq, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new ShopException(-1,bindingResult.getFieldError().getDefaultMessage());
        }
        userService.register1(userRq);
        return new SBApi();
    }

    @ApiOperation(value = "H5登录接口")
    @PostMapping("login")
    public Map<String,String> login(@RequestBody UserLoginDto loginUser) {

        int flag = checkUserIdentity(loginUser.getUserName());
        if ( flag != 3) {
            throw new ShopException(ResultEnum.ACCOUNT_NOT_EXISTS);
        }
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//        User  user = userService.getOne(queryWrapper.eq("mobile",loginUser.getMobile()));
        String result;
        if (!StringUtils.isEmpty(loginUser.getCode())){
            //短信验证码登录
            // 判断验证码
            String code = (String)redisUtils.get(RedisKey.SMS_SEND + loginUser.getMobile());
            if (!org.apache.commons.lang3.StringUtils.equals(code,loginUser.getCode())) {
                throw new ShopException(-1,"验证码错误");
            }
            result = authService.getTokenBySms("sms", scope, clientId,
                    clientSecret, loginUser.getMobile(), loginUser.getCode());
        }else{
            //密码登录
            if (verification) {
                if (StringUtils.isEmpty(loginUser.getVerification()) || !authService.verify(loginUser.getVerification())) {
                    throw new ShopException(ResultEnum.VERIFY_CODE_ERROR);
                }
            }
            result = authService.getToken("password", scope, clientId,
                    clientSecret, "{mobile}" + loginUser.getUserName(), loginUser.getPassword());
        }
        Map<String,String> resultMap = new HashMap<>();

        User user= userService.getOne(new QueryWrapper<User>().eq("mobile",loginUser.getUserName()));
        JSONObject obj= JSONObject.parseObject(result);
        obj.put("userId",user.getUserId());
        result = obj.toJSONString();
        resultMap.put("result",result);
        resultMap.put("flag",3+"");
        // 返回到web 数据 新增用户相关信息
//        Map<String,Object> map = JSONObject.parseObject(result);
//        map.put("user_id",user.getUserId());
//        map.put("identity",user.getIdentity());
//
//        result = JSON.toJSONString(map);
        userService.update(new UpdateWrapper<User>().set("last_login", System.currentTimeMillis() / 1000).eq("mobile", loginUser.getMobile()));
        return resultMap;
    }

    @ApiOperation(value = "pc统一登录接口")
    @PostMapping("login_in")
    public Map<String,String> loginIn(@RequestBody UserLoginDto loginUser, HttpServletRequest request) {

        if(loginUser.getUserName()==null){
            loginUser.setUserName(loginUser.getMobile());
        }
        Map<String,String> resultMap = new HashMap<>();
        String res="";
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//        if(!authService.verify(loginUser.getVerification())){
//            throw new ShopException(ResultEnum.VERIFY_ERROR);
//        }
        int flag = checkUserIdentity(loginUser.getUserName());
        if(1 == flag){
            LoginAdminVo admin = new LoginAdminVo();
            admin.setUserName(loginUser.getUserName());
            admin.setPassword(loginUser.getPassword());
            res = adminService.login(admin);

        }else if (2 == flag){
            Seller seller = new Seller();
            seller.setSellerName(loginUser.getUserName());
            seller.setPassword(loginUser.getPassword());
            res = sellerService.login(seller);

        }else{
            throw new ShopException(ResultEnum.ACCOUNT_NOT_EXISTS);
        }
        resultMap.put("result",res);
        resultMap.put("flag",flag+"");
        return resultMap;
    }



    private int checkUserIdentity(String userName){

        if (null != adminService.credential(userName)) {
            return 1;
        }
        if (null != sellerService.credential(userName)) {
            return 2;
        }
        return 3;
    }

}
