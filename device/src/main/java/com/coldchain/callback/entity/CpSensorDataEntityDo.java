package com.coldchain.callback.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 传感器数据表(CpSensorData)实体类
 *
 * @author chenqingshan
 * @since 2020-10-10 11:49:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CpSensorDataEntityDo {

    /**
    * 数据发送时间
    */
    private String times;
    /**
     * 数值
     */
    private String reVal;

    /**
     * 映射后数值
     */
    private String value;
    /**
     * 传感器ID
     */
    private Integer sensorsId;

    /**
     * 是否报警
     */
    private Integer isAlarm;
    /**
     * 是否在线
     */
    private Integer isLine;
    /**
     * 传感器类型
     */
    private Integer sensorsTypeId;





}