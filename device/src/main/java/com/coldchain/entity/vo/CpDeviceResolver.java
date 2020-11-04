package com.coldchain.entity.vo;

import com.coldchain.entity.CpSensor;
import lombok.Data;

import java.util.List;
@Data
public class CpDeviceResolver {
    private String createDate;
    private String defaultTimescale;
    private String deviceName;
    private String deviceNo;
    private Integer id;
    private String iocUrl;
    private String iotDeviceId;
    private String isAlarms;
    private Integer isDelete;
    private Integer isLine;
    private String lat;
    private String linktype;
    private String lng;
    private String productId;
    private String productType;
    private String protocolLabel;
    private String remark;
    private List<CpSensor> sensorsList;
}
