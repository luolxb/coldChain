package com.coldchain.dto;

import com.coldchain.validation.annotation.Phone;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@ApiModel("用户登录")
@Getter
@Setter
public class UserLoginDto {

    @ApiModelProperty("用户名")
    private String userName;
    @Phone
    @ApiModelProperty("手机")
    private String mobile;
    @NotEmpty
    @ApiModelProperty("密码")
    private String password;
    @ApiModelProperty("图形验证码")
    private String verification;
    @ApiModelProperty("短信验证码")
    private String code;
}
