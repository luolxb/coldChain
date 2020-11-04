package com.coldchain.entity.vo;

import com.coldchain.validation.annotation.Phone;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@ApiModel("用户对象")
public class UserManagerRq implements Serializable {


    @ApiModelProperty("用户id")
    private Integer userId;

    @Email(message = "邮件格式错误")
    @ApiModelProperty("邮件")
    private String email;

    @NotBlank(message = "密码不能为空")
    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("手机号码")
    @Phone
    private String mobile;

    @NotBlank(message = "用户名称不能为空")
    @ApiModelProperty("用户名称")
    private String realname;

    @NotBlank(message = "登录账号不能为空")
    @ApiModelProperty("登录账号")
    private String nickname;

    @NotEmpty(message = "状态不能为空")
    @ApiModelProperty("是否被锁定冻结 0 否，1 是")
    private Integer isLock;

    @NotBlank(message = "地址不能为空")
    @ApiModelProperty("地址")
    private String userAddress;


}
