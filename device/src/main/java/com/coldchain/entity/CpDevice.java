package com.coldchain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.coldchain.entity.vo.CpSenSorDto;
import com.coldchain.entity.vo.CpSensorReq;
import com.coldchain.entity.vo.DelSensorIds;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

import java.io.Serializable;
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
@TableName("cp_device")
public class CpDevice implements Serializable {
    /**
    * 主键
    */
    @TableId(value = "id")
    private Long id;
    /**
    * 用户ID
    */
    @JsonProperty("userId")
    private String userId;
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
    @JsonProperty("deviceSn")
    private String deviceSn;
    /**
     * 设备序列号
     */
    @JsonProperty("deviceNo")
    private String deviceNo;
    /**
    * 设备类型
    */
    @JsonProperty("deviceType")
    private String deviceType;
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
    * 设备接入时间
    */
    @JsonProperty("createTime")
    private String createTime;
    /**
    * 设备分组
    */
    @JsonProperty("deviceGroup")
    private String deviceGroup;
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
     * 是否在线
     */
    @JsonProperty("isLine")
    private Integer isLine;
    /**
     * 掉线延时 单位：秒
     */
    @JsonProperty("defaultTimescale")
    private String defaultTimescale;

    @TableField(exist = false)
    @JsonProperty("timescale")
    private Integer timescale;

    @TableField(exist = false)
    @JsonProperty("insertSensorsList")
    private List<CpSenSorDto> insertSensorsList;

    @TableField(exist = false)
    @JsonProperty("sensorsList")
    private List<CpSensor> sensorsList;
    @TableField(exist = false)
    @JsonProperty("sensorList")
    private List<CpSensorReq> sensorList;
    /**
     * 删除的传感器ID
     */
    @JsonProperty("delSensorIds")
    private List<DelSensorIds> delSensorIds;

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
}