package com.coldchain.project.business.company.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class CompanyVo {

    /**
     * 编号
     */
    @ApiModelProperty(name = "companyId", value = "主键ID", dataType = "Long", example = "1")
    private Long companyId;

    /**
     * 企业名称
     */
    @ApiModelProperty(name = "name", value = "企业名称", dataType = "String", example = "深圳新时空智能系统有限公司")
    private String name;

    /**
     * 企业别名
     */
    @ApiModelProperty(name = "alias", value = "企业别名", dataType = "String", example = "NTS")
    private String alias;

    /**
     * 企业地址
     */
    @ApiModelProperty(name = "address", value = "企业地址", dataType = "String", example = "深圳市福田区爱地大厦")
    private String address;

    /**
     * 行业ID
     */
    @ApiModelProperty(name = "industryId", value = "行业ID", dataType = "Integer", example = "1")
    private Integer industryId;


    /**
     * 企业规模ID
     */
    @ApiModelProperty(name = "companyScaleId", value = "企业规模ID", dataType = "Integer", example = "1")
    private Integer companyScaleId;


    /**
     * 企业邮箱
     */
    @ApiModelProperty(name = "email", value = "企业邮箱", dataType = "String", example = "desom@ntstiech.com")
    private String email;
}
