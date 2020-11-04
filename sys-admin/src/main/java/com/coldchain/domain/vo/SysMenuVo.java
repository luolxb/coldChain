package com.coldchain.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "权限菜单")
public class SysMenuVo {

    /** 菜单ID */
    @ApiModelProperty(name = "menuId", value = "菜单ID", dataType = "Long")
    private Long menuId;

    /** 菜单名称 */
    @ApiModelProperty(name = "menuName", value = "菜单名称", dataType = "String")
    private String menuName;

    /** 父菜单名称 */
    @ApiModelProperty(name = "parentName", value = "父菜单名称", dataType = "String")
    private String parentName;

    /** 父菜单ID */
    @ApiModelProperty(name = "parentId", value = "父菜单ID", dataType = "Long")
    private Long parentId;

    /** 显示顺序 */
    @ApiModelProperty(name = "orderNum", value = "显示顺序", dataType = "Long")
    private String orderNum;

    /** 菜单URL */
    @ApiModelProperty(name = "url", value = "菜单URL", dataType = "Long")
    private String url;

    /** 打开方式：menuItem页签 menuBlank新窗口 */
    @ApiModelProperty(name = "target", value = "打开方式：menuItem页签 menuBlank新窗口 ", dataType = "String")
    private String target;

    /** 类型:0目录,1菜单,2按钮 */
    @ApiModelProperty(name = "menuType", value = "类型:0目录,1菜单,2按钮", dataType = "String")
    private String menuType;

    /** 菜单状态:0显示,1隐藏 */
    @ApiModelProperty(name = "visible", value = "菜单状态:0显示,1隐藏 ", dataType = "String")
    private String visible;

    /** 权限字符串 */
    @ApiModelProperty(name = "perms", value = "权限字符串", dataType = "String")
    private String perms;


}
