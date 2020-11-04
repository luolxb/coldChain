package com.coldchain.project.business.user.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 添加企业用户
 */
@Data
public class CompanyUserRq {

    /**
     * 公司名称
     */
    @ApiModelProperty(name = "companyId", value = "公司ID", dataType = "Long", example = "1")
    private Long companyId;

    /**
     * 用户ID
     */
    @ApiModelProperty(name = "userId", value = "用户ID", dataType = "Long", example = "1")
    private Long userId;



    /**
     * 用户名
     */
    @ApiModelProperty(name = "username", value = "用户名", dataType = "String", example = "ntsitech")
    private String username;

    /**
     * 账号类型
     */
    @ApiModelProperty(name = "accountTypeId", value = "账号类型", dataType = "Integer", example = "1")
    private Integer accountTypeId;

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

    /**
     * 业务负责人
     */
    @ApiModelProperty(name = "businessLeader", value = "业务负责人", dataType = "String", example = "业务负责人")
    private String businessLeader;

    /**
     * 负责人邮箱
     */
    @ApiModelProperty(name = "mailLeader", value = "负责人邮箱", dataType = "String", example = "负责人邮箱")
    private String mailLeader;
    /**
     * 用户名昵称
     */
    @ApiModelProperty(name = "nickName", value = "用户名昵称", dataType = "String", example = "用户名昵称")
    private String nickName;

    @ApiModelProperty(name = "primaryAccount", value = "企业主账号", dataType = "String", example = "企业主账号")
    private String primaryAccount;

    @ApiModelProperty(name = "remark", value = "备注", dataType = "String", example = "备注")
    private String remark;

    /**
     * 余额
     */
    @ApiModelProperty(name = "balance", value = "余额", dataType = "BigDecimal", example = "余额")
    private BigDecimal balance;

    /**
     * 创建时间
     */
    @ApiModelProperty(name = "createTime", value = "创建时间", dataType = "Date", example = "创建时间")
    private Date createTime;

}
