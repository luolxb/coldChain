package com.coldchain.project.business.company.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @PackageName: com.coldchain.project.business.company.domain
 * @program: nts
 * @author: ruosen
 * @create: 2020-04-23 16:51
 **/
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CompanyListServerVo {

    @ApiModelProperty(name = "companyId", value = "企业ID", dataType = "String", example = "1")
    private Long companyId;

    @ApiModelProperty(name = "userId", value = "用户ID", dataType = "String", example = "1")
    private Long userId;

    @ApiModelProperty(name = "userName", value = "用户名称", dataType = "String", example = "NTS")
    private String userName;

    @ApiModelProperty(name = "companyName", value = "企业名称", dataType = "String", example = "企业名称")
    private String companyName;

    @ApiModelProperty(name = "primaryAccount", value = "主账号", dataType = "String", example = "123")
    private String primaryAccount;

    @ApiModelProperty(name = "surplusFlow", value = "账户余额", dataType = "String", example = "123")
    private String surplusFlow;

    @ApiModelProperty(name = "cardSum", value = "物联卡使用流量", dataType = "String", example = "123")
    private String cardSum;

    @ApiModelProperty(name = "satSum", value = "卫星使用流量", dataType = "String", example = "123")
    private String satSum;

    @ApiModelProperty(name = "businessLeader", value = "业务负责人", dataType = "String", example = "业务负责人")
    private String businessLeader;

    @ApiModelProperty(name = "mobile", value = "负责人电话", dataType = "String", example = "负责人电话")
    private String mobile;

    @ApiModelProperty(name = "mailLeader", value = "负责人邮箱", dataType = "String", example = "负责人邮箱")
    private String mailLeader;

    @ApiModelProperty(name = "createTime", value = "创建时间", dataType = "String", example = "创建时间")
    private String createTime;

    @ApiModelProperty(name = "address", value = "企业地址", dataType = "String", example = "深圳市福田区爱地大厦21D")
    private String address;

    @ApiModelProperty(name = "isAdmin", value = "是否是管理员1：是，2：否", dataType = "Integer", example = "2")
    private Integer isAdmin;

}
