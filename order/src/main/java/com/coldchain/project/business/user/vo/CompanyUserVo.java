package com.coldchain.project.business.user.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @PackageName: com.coldchain.project.business.user.vo
 * @program: nts
 * @author: ruosen
 * @create: 2020-04-20 14:37
 **/
@Data
public class CompanyUserVo {

    private Integer userId;
    private Integer companyId;

    /**
     * 公司名称
     */
    @ApiModelProperty(name = "name", value = "公司名称(搜索条件)", dataType = "String", example = "新时空智能系统有限公司")
    private String companyName;

    @ApiModelProperty(name = "primaryAccount", value = "企业主账号(搜索条件)", dataType = "String", example = "企业主账号")
    private String primaryAccount;

    /**
     * 业务负责人
     */
    @ApiModelProperty(name = "businessLeader", value = "业务负责人(搜索条件)", dataType = "String", example = "业务负责人")
    private String businessLeader;

    /**
     * 手机号
     */
    @ApiModelProperty(name = "mobile", value = "手机号(搜索条件)", dataType = "String", example = "18027613030")
    private String mobile;

    /**
     * 负责人邮箱
     */
    @ApiModelProperty(name = "mailLeader", value = "负责人邮箱(搜索条件)", dataType = "String", example = "123456@163.com")
    private String mailLeader;

    /**
     * 公司地址
     */
    @ApiModelProperty(name = "address", value = "公司地址(搜索条件)", dataType = "String", example = "深圳市福田区爱地大厦21D")
    private String address;


    /**
     * 余额
     */
    private BigDecimal balance;

    /**
     * 创建时间
     */
    private Date createTime;
}
