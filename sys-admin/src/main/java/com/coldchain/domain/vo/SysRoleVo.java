package com.coldchain.domain.vo;

import com.coldchain.common.annotation.Excel;
import com.coldchain.common.annotation.Excel.ColumnType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 角色表 sys_role
 * 
 * @author nts
 */
@Data
@ApiModel("角色表")
public class SysRoleVo{


    /** 角色ID */
    @Excel(name = "角色序号", cellType = ColumnType.NUMERIC)
    @ApiModelProperty(name = "roleId", value = "角色ID", required = false, dataType = "Long")
    private Long roleId;

    /** 角色名称 */
    @Excel(name = "角色名称")
    @ApiModelProperty(name = "roleName", value = "角色名称", required = false, dataType = "String")
    private String roleName;

    /** 角色权限 */
    @Excel(name = "角色权限")
    @ApiModelProperty(name = "roleKey", value = "角色权限", required = false, dataType = "String")
    private String roleKey;

    /** 角色排序 */
    @Excel(name = "角色排序", cellType = ColumnType.NUMERIC)
    @ApiModelProperty(name = "roleSort", value = "角色排序", required = false, dataType = "String")
    private String roleSort;

    /** 数据范围（1：所有数据权限；2：自定义数据权限；3：本部门数据权限；4：本部门及以下数据权限） */
    @Excel(name = "数据范围", readConverterExp = "1=所有数据权限,2=自定义数据权限,3=本部门数据权限,4=本部门及以下数据权限")
    @ApiModelProperty(name = "dataScope", value = "数据范围", required = false, dataType = "String")
    private String dataScope;

    /** 角色状态（0正常 1停用） */
    @Excel(name = "角色状态", readConverterExp = "0=正常,1=停用")
    @ApiModelProperty(name = "status", value = "角色状态", required = false, dataType = "String", example = "0")
    private String status;


    /** 用户是否存在此角色标识 默认不存在 */
    @ApiModelProperty(name = "flag", value = "用户是否存在此角色标识", required = false, dataType = "Boolean", example = "false")
    private boolean flag = false;

    /** 菜单组 */
    @ApiModelProperty(name = "menuIds", value = "菜单组", required = false, dataType = "Array")
    private Long[] menuIds;

    /** 部门组（数据权限） */
    @ApiModelProperty(name = "deptIds", value = "部门组", required = false, dataType = "Array")
    private Long[] deptIds;

    @ApiModelProperty(name = "beginTime", value = "用于多条件查询-开始时间", required = false, dataType = "String")
    private String beginTime;
    @ApiModelProperty(name = "endTime", value = "用于多条件查询-结束时间", required = false, dataType = "String")
    private String endTime;

    public SysRoleVo()
    {

    }

    public SysRoleVo(Long roleId)
    {
        this.roleId = roleId;
    }


}
