package com.coldchain.domain.vo;

import com.coldchain.common.annotation.Excel;
import com.coldchain.common.annotation.Excel.ColumnType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 系统访问记录表 sys_logininfor
 * 
 * @author nts
 */
@Data
@ApiModel(value = "系统访问记录")
public class SysLogininforVo{

    /** ID */
    @Excel(name = "序号", cellType = ColumnType.NUMERIC)
    @ApiModelProperty(name = "infoId", value = "序号", required = false, dataType = "Long")
    private Long infoId;

    /** 用户账号 */
    @Excel(name = "用户账号")
    @ApiModelProperty(name = "loginName", value = "用户账号", required = false, dataType = "String")
    private String loginName;

    /** 登录状态 0成功 1失败 */
    @Excel(name = "登录状态", readConverterExp = "0=成功,1=失败")
    @ApiModelProperty(name = "status", value = "登录状态 0=成功,1=失败", required = false, dataType = "String")
    private String status;

    /** 登录IP地址 */
    @Excel(name = "登录地址")
    @ApiModelProperty(name = "ipaddr", value = "登录IP地址", required = false, dataType = "String")
    private String ipaddr;

    /** 登录地点 */
    @Excel(name = "登录地点")
    @ApiModelProperty(name = "loginLocation", value = "登录地点", required = true, dataType = "String")
    private String loginLocation;

    /** 浏览器类型 */
    @Excel(name = "浏览器")
    @ApiModelProperty(name = "browser", value = "browser", required = false, dataType = "String")
    private String browser;

    /** 操作系统 */
    @Excel(name = "操作系统")
    @ApiModelProperty(name = "os", value = "操作系统", required = false, dataType = "String")
    private String os;

    /** 提示消息 */
    @Excel(name = "提示消息")
    @ApiModelProperty(name = "msg", value = "提示消息", required = false, dataType = "String")
    private String msg;

    /** 访问时间 */
    @Excel(name = "访问时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(name = "loginTime", value = "访问时间", required = false, dataType = "Date")
    private Date loginTime;
}