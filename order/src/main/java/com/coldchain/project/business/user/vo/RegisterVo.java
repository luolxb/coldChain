package com.coldchain.project.business.user.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 企业注册参数
 */
@Data
public class RegisterVo {

    /**
     * 用户名
     */
    @ApiModelProperty(name = "username", value = "用户名", dataType = "String", example = "ntsitech")
    private String username;

    /**
     * 密码
     */
    @ApiModelProperty(name = "password", value = "密码", dataType = "String", example = "123456")
    private String password;

    /**
     * 手机号
     */
    @ApiModelProperty(name = "mobile", value = "手机号", dataType = "String", example = "18027613030")
    private String mobile;

    /**
     * 短信验证码
     */
    @ApiModelProperty(name = "smsCode", value = "短信验证码", dataType = "String", example = "789678")
    private String smsCode;

    /**
     * 公司名称
     */
    @ApiModelProperty(name = "name", value = "公司名称", dataType = "String", example = "新时空智能系统有限公司")
    private String companyName;

    /**
     * 公司地址
     */
    @ApiModelProperty(name = "address", value = "公司地址", dataType = "String", example = "深圳市福田区爱地大厦21D")
    private String address;
}
