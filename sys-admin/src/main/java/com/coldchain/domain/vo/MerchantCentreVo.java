package com.coldchain.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.Map;

@Data
@ApiModel(value = "商户")
public class MerchantCentreVo {


    /** 商户ID */
    @ApiModelProperty(name = "deptId", value = "商户ID", required = false, dataType = "Long")
    private Long deptId;


    /** 企业名称 */
    @ApiModelProperty(name = "deptName", value = "企业名称", required = false, dataType = "String")
    private String deptName;

    /** 负责人 */
    @ApiModelProperty(name = "leader", value = "负责人", required = false, dataType = "String")
    private String leader;

    /** 负责人电话 */
    @ApiModelProperty(name = "phone", value = "负责人电话", required = false, dataType = "String")
    private String phone;


    /** 邮箱 */
    @ApiModelProperty(name = "email", value = "邮箱", required = false, dataType = "String")
    private String email;

    /** 企业地址 */
    @ApiModelProperty(name = "enterpriseLocation", value = "企业地址", required = false, dataType = "String")
    private String enterpriseLocation;

    /** 企业状态:0正常,1停用 */
    @ApiModelProperty(name = "status", value = "状态:0正常,1停用 ", required = false, dataType = "String")
    private String status;

    /** 套餐类型 */
    @ApiModelProperty(name = "mealType", value = "套餐类型", required = false, dataType = "String")
    private String mealType;

    /** 企业账号 */
    @ApiModelProperty(name = "loginName", value = "企业账号（仅用于查询和展示） ", required = false, dataType = "String")
    private String loginName;

    /** 创建时间 */
    @ApiModelProperty(name = "createTime", value = "创建时间(用于列表展示)", required = false, dataType = "String")
    private Date createTime;


    /** 请求参数 */
    private Map<String, Object> params;


}
