package com.coldchain.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * 传感器数据表(CpSensorData)实体类
 *
 * @author chenqingshan
 * @since 2020-10-10 11:49:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("cp_sensor_data")
public class CpSensorData{
    /**
    * 主键
    */
    @TableId
    private String id;

    /**
     * 传感器主键ID
     */
    private String cpSensorId;

    /**
     * 消息
     */
    private String msg;
    /**
    * 数据更新的时间
    */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateDate;
    /**
    * 00表示请求成功01表示请求失败
    */
    private String flag;
    /**
    * 传感器名称
    */
    private String sensorName;
    /**
    * 用户名
    */
    private String userName;
    /**
    * 第三方平台设备ID
    */
    private Integer deviceId;
    /**
    * 用户ID
    */
    private Integer userId;
    /**
    * 第三方平台传感器ID
    */
    private Integer sensorId;
    /**
    * 数值单位
    */
    private String unit;
    /**
    * 传感器类型 数值类型
    */
    private String sensorType;

    private Integer sensorTypeId;
    /**
    * 是否在线
    */
    private String isLine;
    /**
    * 数值
    */
    private String value;
    /**
    * 是否报警
    */
    private String isAlarms;
    /**
    * 经度
    */
    private String lat;
    /**
    * 纬度
    */
    private String lng;
    /**
    * 开关值 0表示关 1表示开
    */
    private String switcher;



}