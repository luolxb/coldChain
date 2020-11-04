package com.coldchain.project.business.user.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class LoginVo {

//    /**
//     * 手机号
//     */
//    @ApiModelProperty(name = "mobile", value = "手机号", dataType = "String", example = "18027613030")
//    private String mobile;
    /**
     * 手机号
     */
    @ApiModelProperty(name = "username", value = "账号", dataType = "String", example = "ntsitech")
    private String username;

    /**
     * 密码
     */
    @ApiModelProperty(name = "password", value = "密码", dataType = "String", example = "123456")
    private String password;
}
