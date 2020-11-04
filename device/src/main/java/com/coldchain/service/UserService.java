package com.coldchain.service;

import com.common.dto.NtsCompanyDto;
import com.common.dto.NtsProjectDto;
import com.common.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("user")
public interface UserService {

    /**
     * 根据用户ID 获取企业信息
     *
     * @param userId
     * @return
     */
    @GetMapping("/company/c/company/userid")
    NtsCompanyDto getGroupCompany(@RequestParam("userId") Integer userId);

    /**
     * 根据企业ID获取用户ID
     *
     * @param companyId
     * @return
     */
    @GetMapping("/user/c/user/companyId")
    UserDto getUserByCompanyId(@RequestParam("companyId") Long companyId);
}
