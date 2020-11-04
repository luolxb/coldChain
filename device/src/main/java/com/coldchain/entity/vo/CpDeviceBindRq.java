package com.coldchain.entity.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.coldchain.entity.CpSensor;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CpDeviceBindRq {
    /**
     * 登陆用户ID
     */
    private Integer Uid;
    /**
     * 设备序列号
     */
    @JsonProperty("deviceSn")
    private String deviceSn;
    /**
     * 设备类型
     */
    @JsonProperty("deviceType")
    private String deviceType;
    /**
     * 设备厂商
     */
    @JsonProperty("deviceManufacturer")
    private String deviceManufacturer;
    /**
     * 所属企业
     */
    @JsonProperty("deviceCompany")
    private String deviceCompany;
    /**
     * 所属项目
     */
    @JsonProperty("deviceProject")
    private String deviceProject;
    /**
     * 设备分组
     */
    @JsonProperty("deviceGroup")
    private String deviceGroup;
    /**
     * 状态
     */
    @JsonProperty("isLine")
    private String isLine;
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
     * 经度
     */
    @JsonProperty("lat")
    private String lat;
    /**
     * 纬度
     */
    @JsonProperty("lng")
    private String lng;
    /**
     * 经销商ID
     */
    @JsonProperty("oemId")
    private String oemId;
    /**
     * 管理员ID
     */
    @JsonProperty("adminId")
    private String adminId;

    /**
     * 用户ID
     */
    @JsonProperty("userId")
    private Integer userId;
    /**
     * 设备名称
     */
    @JsonProperty("deviceName")
    private String deviceName;
    /**
     * 设备名称
     */
    @JsonProperty("deviceId")
    private Long deviceId;

    private Integer uId;
    /**
     * 设备序列号
     */
    @JsonProperty("deviceNo")
    private String deviceNo;
    /**
     * sim卡
     */
    @JsonProperty("simCard")
    private String simCard;
    /**
     * 定位模式
     */
    @JsonProperty("positioningMode")
    private String positioningMode;

    /**
     * 设备接入时间
     */
    @JsonProperty("createTime")
    private String createTime;

    /**
     * 设备协议
     */
    @JsonProperty("linkType")
    private String linkType;
    /**
     * 状态
     */
    @JsonProperty("isOn")
    private String isOn;

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
     * 是否报警
     */
    @JsonProperty("isAlarms")
    private Integer isAlarms;
    /**
     * 是否删除
     */
    @JsonProperty("isDelete")
    private Integer isDelete;

    /**
     * 掉线延时 单位：秒
     */
    @JsonProperty("defaultTimescale")
    private String defaultTimescale;


    @JsonProperty("timescale")
    private Integer timescale;

    @TableField(exist = false)
    @JsonProperty("sensorsList")
    private List<CpSensor> sensorsList;
    @TableField(exist = false)
    @JsonProperty("sensorList")
    private List<CpSensorReq> sensorList;

}