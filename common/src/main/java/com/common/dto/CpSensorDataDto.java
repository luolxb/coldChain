package com.common.dto;

import com.common.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 传感器数据实体类
 *
 * @author chenqingshan
 * @since 2020-10-10 11:49:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("传感器数据实体类")
public class CpSensorDataDto {
    /**
    * 主键
    */
    @ApiModelProperty("传感器数据id")
    private String id;

    /**
     * 传感器主键ID
     */
    @ApiModelProperty("传感器主键id")
    private String cpSensorId;

    /**
     * 消息
     */
    @ApiModelProperty("消息")
    private String msg;
    /**
    * 数据更新的时间
    */
    @Excel(name = "时间")
    @ApiModelProperty("数据更新的时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")
    private Date updateDate;
    /**
    * 00表示请求成功01表示请求失败
    */
    private String flag;
    /**
    * 传感器名称
    */
    @ApiModelProperty("传感器名称")
    private String sensorName;
    /**
    * 用户名
    */
    @ApiModelProperty("用户名")
    private String userName;
    /**
    * 第三方平台设备ID
    */
    @ApiModelProperty("第三方平台设备ID")
    private Integer deviceId;

    @ApiModelProperty("设备名称")
    private String deviceName;

    @ApiModelProperty("设备序列号")
    private String DeviceSn;
    /**
    * 用户ID
    */
    @ApiModelProperty("用户ID")
    private Integer userId;
    /**
    * 第三方平台传感器ID
    */
    @ApiModelProperty("第三方平台传感器ID")
    private Integer sensorId;
    /**
    * 数值单位
    */
    @ApiModelProperty("数值单位")
    private String unit;
    /**
    * 传感器类型 数值类型
    */
    @ApiModelProperty("传感器类型")
    private String sensorType;
    /**
    * 是否在线
    */
    @ApiModelProperty("是否在线")
    private String isLine;
    /**
    * 数值
    */
    @Excel(name = "数值")
    @ApiModelProperty("数值")
    private String value;
    /**
    * 是否报警
    */
    @ApiModelProperty("是否报警")
    private String isAlarms;
    /**
    * 经度
    */
    @ApiModelProperty("经度")
    private String lat;
    /**
    * 纬度
    */
    @ApiModelProperty("纬度")
    private String lng;
    /**
    * 开关值 0表示关 1表示开
    */
    @ApiModelProperty("开关值 0表示关 1表示开")
    private String switcher;



}