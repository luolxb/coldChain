package com.coldchain.domain.vo;

import com.coldchain.common.enums.OnlineStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 当前在线会话 sys_user_online
 * 
 * @author nts
 */
@Data
@ApiModel(value = "当前在线会话")
public class SysUserOnlineVo {

    
    /** 用户会话id */
    @ApiModelProperty(name = "sessionId", value = "用户会话id", required = false, dataType = "String")
    private String sessionId;

    /** 部门名称 */
    @ApiModelProperty(name = "deptName", value = "部门名称", required = false, dataType = "String")
    private String deptName;

    /** 登录名称 */
    @ApiModelProperty(name = "loginName", value = "登录名称", required = false, dataType = "String")
    private String loginName;

    @ApiModelProperty(name = "deptId", value = "部门编号", required = false, dataType = "Long")
    private Long  deptId;

    /** 登录IP地址 */
    @ApiModelProperty(name = "ipaddr", value = "登录IP地址", required = false, dataType = "String")
    private String ipaddr;

    /** 登录地址 */
    @ApiModelProperty(name = "loginLocation", value = "登录地址", required = false, dataType = "String")
    private String loginLocation;

    /** 浏览器类型 */
    @ApiModelProperty(name = "browser", value = "浏览器类型", required = false, dataType = "String")
    private String browser;

    /** 操作系统 */
    @ApiModelProperty(name = "os", value = "操作系统", required = false, dataType = "String")
    private String os;

    /** session创建时间 */
    @ApiModelProperty(name = "startTimestamp", value = "session创建时间", required = false, dataType = "Date")
    private Date startTimestamp;

    /** session最后访问时间 */
    @ApiModelProperty(name = "lastAccessTime", value = "session最后访问时间", required = false, dataType = "Date")
    private Date lastAccessTime;

    /** 超时时间，单位为分钟 */
    @ApiModelProperty(name = "expireTime", value = "超时时间，单位为分钟", required = false, dataType = "Long")
    private Long expireTime;

    /** 在线状态 */
    @ApiModelProperty(name = "status", value = "在线状态", required = false, dataType = "String")
    private OnlineStatus status = OnlineStatus.on_line;


}
