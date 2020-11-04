package com.coldchain.entity.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class SensorDto implements Serializable {

    private String unit;


    private String sensorName;


    private String sensorType;


    private String ordernum;


    private String decimal;
}
