package com.coldchain.callback.entity;

import lombok.Data;

import java.util.List;

@Data
public class DeviceSensorAlertEntity {

    /**
     * 代表成功
     */
    private String flag;
    /**
     * 用户ID
     */
    private String deviceUserid;
    /**
     * 企业ID
     */
    private String parentUserId;

    /**
     * 发送时间
     */
    private String time;
    /**
     * 原始数据
     */
    private String rawData;
    /**
     * 设备ID
     */
    private Integer deviceId;

    /**
     * 传感器数据
     */
    private List<CpSensorDataEntityDo> sensorsDates;
}
