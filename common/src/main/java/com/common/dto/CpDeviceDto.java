package com.common.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
@ApiModel("设备dto")
public class CpDeviceDto implements Serializable {
    /**
     * 主键
     */
    @ApiModelProperty("设备ID")
    private String id;
    /**
     * 用户ID
     */
    @ApiModelProperty("用户ID、慎用")
    private String userId;
    /**
     * 设备名称
     */
    @ApiModelProperty("设备名称")
    private String deviceName;
    /**
     * 设备序列号
     */
    @ApiModelProperty("设备序列号")
    private String deviceSn;
    /**
     * 设备类型
     */
    @ApiModelProperty("设备类型")
    private String deviceType;
    /**
     * sim卡
     */
    @ApiModelProperty("sim卡")
    private String simCard;
    /**
     * 定位模式
     */
    @ApiModelProperty("定位模式")
    private String positioningMode;
    /**
     * 设备厂商
     */
    @ApiModelProperty("设备厂商")
    private String deviceManufacturer;
    /**
     * 所属企业
     */
    @ApiModelProperty("所属企业")
    private String deviceCompany;
    /**
     * 所属项目
     */
    @ApiModelProperty("所属项目")
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
    @ApiModelProperty("状态")
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


    /**
     * 经度
     */
    @ApiModelProperty("经度")
    private String lat;
    /**
     * 纬度
     */
    @ApiModelProperty("纬度")
    private String lng;
    /**
     * 是否报警
     */
    @ApiModelProperty("是否报警 0 否  1是")
    private Integer isAlarms;
    /**
     * 是否删除
     */
    @ApiModelProperty("是否删除 0 否  1是")
    private Integer isDelete;
    /**
     * 是否在线
     */
    @ApiModelProperty("是否在线 0 否  1是")
    private Integer isLine;

    @ApiModelProperty("传感器")
    private List<CpSensorDataDto> sensorDataList;

}