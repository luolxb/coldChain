package com.coldchain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Setter
@Getter
@ApiModel("用户修改密码请求数据")
public class UserChangePwdVo {

    @ApiModelProperty("用户ID")
    private Integer userId;

    @ApiModelProperty("新密码")
    @NotBlank(message = "新密码不能为空")
    private String newPassWord;

    @ApiModelProperty("旧密码")
    @NotBlank(message = "旧密码不能为空")
    private String oldPassWord;
}
