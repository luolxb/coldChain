package com.coldchain.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 用户和角色关联 sys_user_role
 * 
 * @author nts
 */
@Data
@ApiModel(value = "用户和角色关联")
public class SysUserRoleVo
{
    /** 用户ID */
    @ApiModelProperty(name = "userId", value = "用户ID", required = true, dataType = "Long")
    private Long userId;
    
    /** 角色ID */
    @ApiModelProperty(name = "roleId", value = "角色ID", required = true, dataType = "Long")
    private Long roleId;

}
