package com.coldchain.service;

import com.coldchain.entity.OauthUser;
import com.coldchain.entity.SmsLog;
import com.coldchain.entity.User;
import com.coldchain.entity.UserVo;
import com.coldchain.utils.Md5Util;
import com.coldchain.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.oauth2.common.exceptions.InvalidGrantException;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class CustomUserDetailsService {
    @Autowired
    private UserService userService;

    @Autowired
    private UserServiceDetail userServiceDetail;

    @Autowired
    private RedisUtil redisUtil;

    public User loadUserByMobileAndSmsCode(String mobile, String smsCode) {
//        if (StringUtils.isEmpty(mobile) || StringUtils.isEmpty(smsCode)) {
//            throw new InvalidGrantException("您输入的手机号或短信验证码不正确");
//        }
        User user = userService.getOneByMobile(mobile);
        if(user == null){
            throw new InvalidGrantException("用户不存在");
//            UserVo userVo = new UserVo();
//            String md5Pass = Md5Util.md5Encode("TPSHOP",mobile);
//            String md5Paypwd= Md5Util.md5Encode("TPSHOP",mobile.substring(5));
//            userVo.setPassword(md5Pass);
//            userVo.setPaypwd(md5Paypwd);
//            userVo.setMobile(mobile);
//            userVo.setNickname(mobile);
//            userService.register(userVo);
//            user = userService.getOneByMobile(mobile);
        }
//        SmsLog lastSmsLog = userService.getSmsByMobile(mobile, 6);
//        if(lastSmsLog == null){
//            throw new UsernameNotFoundException("请先获取验证码");
//        }
//        if((lastSmsLog.getAddTime() + Long.parseLong((String) mallService.config().get("sms_sms_time_out"))) < System.currentTimeMillis() / 1000){
//            throw new UsernameNotFoundException("验证码已超时失效");
//        }
//        if(!lastSmsLog.getCode().equals(smsCode)){
//            throw new UsernameNotFoundException("验证失败,验证码有误");
//        }
        userServiceDetail.fixUserAuthorities(user);
        return user;
    }

    public User loadUserByThirdOauth(String oauth, String openid) {
        if (StringUtils.isEmpty(openid) || StringUtils.isEmpty(oauth)) {
            throw new InvalidGrantException("您的第三方凭证不正确");
        }
        OauthUser oauthUser = userService.getOauthUser(oauth, openid);
        if(oauthUser == null){
            throw new UsernameNotFoundException("您的第三方openid："+ openid + ",不存在！");
        }
        // 判断成功后返回用户细节
        User user = userService.getById(oauthUser.getUserId());
        userServiceDetail.fixUserAuthorities(user);
        return user;
    }

}