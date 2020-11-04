package com.coldchain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Setter
@Getter
@ApiModel("用户修改手机请求数据")
public class UserChangePhoneRq {

    @ApiModelProperty("用户ID")
    private Integer userId;

    @ApiModelProperty("新手机")
    @NotBlank(message = "新手机不能为空")
    private String mobile;

    @ApiModelProperty("旧手机")
    @NotBlank(message = "旧手机不能为空")
    private String oldMobile;

    @ApiModelProperty("新手机验证码")
    @NotBlank(message = "新手机验证码不能为空")
    private String code;

    @ApiModelProperty("旧手机验证码")
    @NotBlank(message = "旧手机验证码不能为空")
    private String oldCode;


}
