package com.coldchain.entity.vo;

import com.coldchain.entity.CpSensor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 设备表(CpDevice)实体类
 *
 * @author chenqingshan
 * @since 2020-10-10 11:39:41
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CpDeviceRq {
    /**
    * 主键
    */
    private String id;
    /**
    * 用户ID
    */

    private Integer userId;

    /**
    * 设备名称
    */

    private String deviceName;
    /**
    * 设备序列号
    */

    private String deviceSn;
    /**
    * 设备类型
    */

    private String deviceType;
    /**
    * sim卡
    */

    private String simCard;
    /**
    * 定位模式
    */

    private String positioningMode;
    /**
    * 设备厂商
    */

    private String deviceManufacturer;
    /**
    * 所属企业
    */

    private String deviceCompany;
    /**
    * 所属项目
    */

    private String deviceProject;
    /**
    * 设备接入时间
    */

    private String createTime;
    /**
    * 设备分组
    */

    private String deviceGroup;
    /**
    * 设备协议
    */

    private String linkType;
    /**
    * 状态
    */

    private String isOn;
    /**
    * 创建时间
    */

    private String createDate;
    /**
    * 创建人
    */

    private String founder;
    /**
    * 修改时间
    */

    private String modifyTime;
    /**
    * 修改人
    */

    private String modifier;


    private String lat;


    private List<CpSensor> sensorList;


    private String lng;


    private Integer timescale;

    private Long deviceId;

    private String deviceNo;

}