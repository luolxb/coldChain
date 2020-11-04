package com.coldchain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 传感器表(CpSensor)实体类
 *
 * @author chenqingshan
 * @since 2020-10-10 11:49:30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("cp_sensor")
public class CpSensor{
    /**
    * 主键
    */
    @TableId(value = "id",type = IdType.ASSIGN_UUID)
    @JsonProperty("id")
    private String id;
    /**
    * 传感器ID
    */
    @JsonProperty("sensorId")
    private Integer sensorId;
    /**
    * 传感器名称
    */
    @JsonProperty("sensorName")
    private String sensorName;
    /**
    * 数据类型
    */
    @JsonProperty("sensorType")
    private String sensorType;

    /**
    * 小数点
    */
    @JsonProperty("decimal")
    private String decimals;
    /**
    * 数据单位
    */
    @JsonProperty("unit")
    private String unit;
    /**
    * 数据内容
    */
    @JsonProperty("value")
    private String value;
    /**
    * 创建时间
    */
    @JsonProperty("createDate")
    private String createDate;
    /**
    * 创建人
    */
    @JsonProperty("founder")
    private String founder;
    /**
    * 修改时间
    */
    @JsonProperty("modifyTime")
    private String modifyTime;
    /**
    * 修改人
    */
    @JsonProperty("modifier")
    private String modifier;
    /**
     * 设备ID
     */
    @JsonProperty("deviceId")
    private String deviceId;
    /**
     * 设备名称
     */
    @JsonProperty("deviceName")
    private String deviceName;
    /**
     * 心跳时间
     */
    @JsonProperty("heartbeatDate")
    private String heartbeatDate;
    /**
     * 图片地址
     */
    @JsonProperty("iocUrl")
    private String iocUrl;
    /**
     * 是否报警
     */
    @JsonProperty("isAlarms")
    private String isAlarms;
    /**
     * 是否删除
     */
    @JsonProperty("isDelete")
    private String isDelete;
    /**
     * 是否在线
     */
    @JsonProperty("isLine")
    private String isLine;






}