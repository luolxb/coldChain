package com.coldchain.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.coldchain.entity.Admin;
import com.coldchain.vo.LoginAdminVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author dyr
 * @since 2019-11-04
 */
@FeignClient(name ="admin")
public interface AdminService {

    @PostMapping("login")
    String login(@RequestBody LoginAdminVo loginAdminVo);


    @GetMapping("/credential")
    Admin credential(@RequestParam("user_name") String userName);

}
