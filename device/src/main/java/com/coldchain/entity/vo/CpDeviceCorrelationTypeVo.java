package com.coldchain.entity.vo;

import lombok.Data;

@Data
public class CpDeviceCorrelationTypeVo {
    private String deviceName;
    private String deviceSn;
    private String deviceType;
    private String deviceCompany;
    private String createTime;
    private String isLine;
    private String createDate;
    private String lat;
    private String lng;
    private String deviceTypeName;
    private Integer OemId;
}
