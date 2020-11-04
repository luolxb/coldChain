package com.coldchain.domain.vo;

import com.coldchain.common.annotation.Excel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "用户管理")
public class UserVo {


    /** 用户ID */
    @Excel(name = "用户序号", cellType = Excel.ColumnType.NUMERIC, prompt = "用户编号")
    @ApiModelProperty(name = "userId", value = "用户序号", dataType = "Long")
    private Long userId;
    /** 部门ID */
    @Excel(name = "部门编号", type = Excel.Type.IMPORT)
    @ApiModelProperty(name = "deptId", value = "部门编号", dataType = "Long")
    private Long deptId;

    /** 部门父ID */
    @ApiModelProperty(name = "parentId", value = "部门父ID", dataType = "Long")
    private Long parentId;

    /** 角色ID */
/*    @ApiModelProperty(name = "roleId", value = "角色ID", dataType = "Long")
    private Long roleId;*/

    /** 登录名称 */
    @Excel(name = "登录名称")
    @ApiModelProperty(name = "loginName", value = "登录名称", dataType = "String")
    private String loginName;

    /** 用户名称 */
    @Excel(name = "用户名称")
    @ApiModelProperty(name = "userName", value = "用户名称", dataType = "String")
    private String userName;

    /** 用户邮箱 */
    @Excel(name = "用户邮箱")
    @ApiModelProperty(name = "email", value = "用户邮箱", dataType = "String")
    private String email;

    /** 手机号码 */
    @Excel(name = "手机号码")
    @ApiModelProperty(name = "phonenumber", value = "手机号码", dataType = "String")
    private String phonenumber;

    /** 用户性别 */
    @Excel(name = "用户性别", readConverterExp = "0=男,1=女,2=未知")
    @ApiModelProperty(name = "sex", value = "用户性别", dataType = "String")
    private String sex;


    /** 密码 */
    @ApiModelProperty(name = "password", value = "密码", dataType = "String")
    private String password;

    /** 帐号状态（0正常 1停用） */
    @Excel(name = "帐号状态", readConverterExp = "0=正常,1=停用")
    @ApiModelProperty(name = "status", value = "帐号状态", dataType = "String")
    private String status;

    /** 角色组 */
    @ApiModelProperty(name = "roleIds", value = "角色组", dataType = "Array")
    private Long[] roleIds;

    /** 岗位组 */
    @ApiModelProperty(name = "postIds", value = "岗位组", dataType = "Array")
    private Long[] postIds;

    /** 备注 */
    @ApiModelProperty(name = "remark", value = "备注", dataType = "String")
    private String remark;

    /** 子账号标识 */
    @ApiModelProperty(name = "childFlag", value = "子账号标识（新增用户必填字段 0-非子账户  1-子账号(子账号用于商户端新增账号)）", dataType = "Integer",required = true)
    private Integer childFlag;


}
