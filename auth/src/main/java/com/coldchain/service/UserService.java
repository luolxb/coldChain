package com.coldchain.service;

import com.coldchain.entity.OauthUser;
import com.coldchain.entity.SmsLog;
import com.coldchain.entity.User;
import com.coldchain.entity.UserVo;
import com.coldchain.vo.SBApi;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author dyr
 * @since 2019-08-15
 */

@FeignClient("user")
public interface UserService {
    @GetMapping("credential")
    User getOneByMobile(@RequestParam("mobile") String mobile);

    @GetMapping("credential")
    User getOneByEmail(@RequestParam("email") String email);

    @GetMapping("credential")
    User getById(@RequestParam("user_id") Integer userId);

    @GetMapping("oauth")
    OauthUser getOauthUser(@RequestParam(value = "oauth") String oauth, @RequestParam(value = "openid") String openid);

    @GetMapping("sms")
    SmsLog getSmsByMobile(@RequestParam("mobile") String mobile, @RequestParam("scene") Integer scene);

    @PostMapping("register")
    SBApi register(@RequestBody UserVo registerUser);

    @GetMapping("credential")
    User getOneByname(@RequestParam("nickname") String nickname);
}
