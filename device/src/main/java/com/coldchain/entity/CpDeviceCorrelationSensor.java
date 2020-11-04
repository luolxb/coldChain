package com.coldchain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 设备-传感器关联表(CpDeviceCorrelationSensor)实体类
 *
 * @author chenqingshan
 * @since 2020-10-10 11:50:17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("cp_device_correlation_sensor")
public class CpDeviceCorrelationSensor  {

    /**
    * 主键
    */
    @TableId(value = "id",type = IdType.ASSIGN_UUID)
    private String id;
    /**
    * 设备编号（主键）
    */
    private String deviceId;
    /**
    * 传感器编号（主键）
    */
    private String sensorId;



}