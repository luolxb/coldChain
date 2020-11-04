package com.coldchain.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "部门")
public class SysDeptVo {

    /** 部门ID */
    @ApiModelProperty(name = "deptId", value = "部门ID", required = false, dataType = "Long")
    private Long deptId;

    /** 父部门ID */
    @ApiModelProperty(name = "parentId", value = "父部门ID,企业添加parentId=0", required = false, dataType = "Long")
    private Long parentId;

    /** 祖级列表 */
    @ApiModelProperty(name = "ancestors", value = "祖级列表", required = false, dataType = "String")
    private String ancestors;


    /** 部门名称 */
    @ApiModelProperty(name = "deptName", value = "部门名称", required = false, dataType = "String")
    private String deptName;

    /** 部门职责 */
    @ApiModelProperty(name = "responsibility", value = "部门职责", required = false, dataType = "String")
    private String responsibility;

    /** 企业地址 */
    @ApiModelProperty(name = "enterpriseLocation", value = "企业地址", required = false, dataType = "String")
    private String enterpriseLocation;

    /** 显示顺序 */
    @ApiModelProperty(name = "orderNum", value = "显示顺序", required = false, dataType = "String")
    private String orderNum;

    /** 负责人 */
    @ApiModelProperty(name = "leader", value = "负责人", required = false, dataType = "String")
    private String leader;

    /** 联系电话 */
    @ApiModelProperty(name = "phone", value = "联系电话", required = false, dataType = "String")
    private String phone;

    /** 邮箱 */
    @ApiModelProperty(name = "email", value = "邮箱", required = false, dataType = "String")
    private String email;

    /** 部门状态:0正常,1停用 */
    @ApiModelProperty(name = "status", value = "门状态:0正常,1停用 ", required = false, dataType = "String")
    private String status;


    /** 父部门名称 */
    @ApiModelProperty(name = "parentName", value = "父部门名称", required = false, dataType = "String")
    private String parentName;
}
