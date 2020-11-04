package com.coldchain.domain.vo;

import com.coldchain.common.annotation.Excel;
import com.coldchain.common.annotation.Excel.ColumnType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 操作日志记录表 oper_log
 * 
 * @author nts
 */
@Data
@ApiModel(value = "操作日志记录")
public class SysOperLogVo{

    /** 日志主键 */
    @Excel(name = "操作序号", cellType = ColumnType.NUMERIC)
    @ApiModelProperty(name = "operId", value = "操作序号", required = false, dataType = "Long")
    private Long operId;

    /** 操作模块 */
    @Excel(name = "操作模块")
    @ApiModelProperty(name = "title", value = "操作模块", required = false, dataType = "String")
    private String title;

    /** 业务类型（0其它 1新增 2修改 3删除） */
    @Excel(name = "业务类型", readConverterExp = "0=其它,1=新增,2=修改,3=删除,4=授权,5=导出,6=导入,7=强退,8=生成代码,9=清空数据")
    @ApiModelProperty(name = "businessType", value = "业务类型（0=其它,1=新增,2=修改,3=删除,4=授权,5=导出,6=导入,7=强退,8=生成代码,9=清空数据）", required = false, dataType = "Integer")
    private Integer businessType;


    /** 请求方法 */
    @Excel(name = "请求方法")
    @ApiModelProperty(name = "method", value = "请求方法", required = false, dataType = "String")
    private String method;

    /** 请求方式 */
    @Excel(name = "请求方式")
    @ApiModelProperty(name = "requestMethod", value = "请求方式", required = false, dataType = "String")
    private String requestMethod;

    /** 操作类别（0其它 1后台用户 2手机端用户） */
    @Excel(name = "操作类别", readConverterExp = "0=其它,1=后台用户,2=手机端用户")
    @ApiModelProperty(name = "operatorType", value = "操作类别（0其它 1后台用户 2手机端用户）", required = false, dataType = "Integer")
    private Integer operatorType;

    /** 操作人员 */
    @Excel(name = "操作人员")
    @ApiModelProperty(name = "operName", value = "操作人员", required = false, dataType = "String")
    private String operName;

    /** 部门名称 */
    @Excel(name = "部门名称")
    @ApiModelProperty(name = "deptName", value = "部门名称", required = false, dataType = "String")
    private String deptName;

    /** 部门编号*/
    @Excel(name = "部门编号")
    @ApiModelProperty(name = "deptId", value = "部门编号", required = false, dataType = "Long")
    private Long deptId;

    /** 请求url */
    @Excel(name = "请求地址")
    @ApiModelProperty(name = "operUrl", value = "请求地址", required = false, dataType = "String")
    private String operUrl;

    /** 操作地址 */
    @Excel(name = "操作地址")
    @ApiModelProperty(name = "operIp", value = "操作地址", required = false, dataType = "String")
    private String operIp;

    /** 操作地点 */
    @Excel(name = "操作地点")
    @ApiModelProperty(name = "operLocation", value = "操作地点", required = false, dataType = "String")
    private String operLocation;

    /** 请求参数 */
    @Excel(name = "请求参数")
    @ApiModelProperty(name = "operParam", value = "请求参数", required = false, dataType = "String")
    private String operParam;

    /** 返回参数 */
    @Excel(name = "返回参数")
    @ApiModelProperty(name = "jsonResult", value = "返回参数", required = false, dataType = "String")
    private String jsonResult;

    /** 操作状态（0正常 1异常） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=异常")
    @ApiModelProperty(name = "status", value = "操作状态（0正常 1异常）", required = false, dataType = "Integer")
    private Integer status;

    /** 错误消息 */
    @Excel(name = "错误消息")
    @ApiModelProperty(name = "errorMsg", value = "错误消息", required = false, dataType = "String")
    private String errorMsg;


    @ApiModelProperty(name = "beginTime", value = "开始时间", required = false, dataType = "String")
    private String  beginTime;

    @ApiModelProperty(name = "endTime", value = "结束时间", required = false, dataType = "String")
    private String  endTime;
}
