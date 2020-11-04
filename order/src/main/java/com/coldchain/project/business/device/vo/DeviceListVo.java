package com.coldchain.project.business.device.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 设备列表
 */
@Data
@ApiModel(value = "设备列表")
public class DeviceListVo {

    /**
     * 设备编号
     */
    @ApiModelProperty(name = "deviceId", value = "设备编号", dataType = "Long", example = "1")
    private Long deviceId;

    /**
     * 企业名称
     */
    @ApiModelProperty(name = "company", value = "企业名称", dataType = "String", example = "新时空智能系统")
    private String company;

    /**
     * 企业主账号
     */
    @ApiModelProperty(name = "account", value = "企业主账号", dataType = "String", example = "ntsitech")
    private String account;

    /**
     * 卫星SN
     */
    @ApiModelProperty(name = "deviceSn", value = "卫星SN", dataType = "String", example = "01327681SKYBD82")
    private String deviceSn;

    /**
     * 卡ICCID
     */
    @ApiModelProperty(name = "iccid", value = "卡ICCID", dataType = "String", example = "80323912123")
    private String iccid;


    /**
     * 卫星激活状态：0-未激活 1-已激活 2-暂停 3-启用 4-禁用
     */
    @ApiModelProperty(name = "sllActivate", value = "卫星激活状态：0-未激活 1-已激活 2-暂停 3-启用 4-禁用", dataType = "Integer", example = "1")
    private Integer sllActivate;

    /**
     * 卫星激活日期
     */
    @ApiModelProperty(name = "sllActivateTime", value = "卫星激活日期", dataType = "String", example = "2020-04-18 10:55:53")
    private Date sllActivateTime;

    /**
     * 卡激活状态：0-未激活 1-已激活
     */
    @ApiModelProperty(name = "cardActivate", value = "卡激活状态：0-未激活 1-已激活", dataType = "Integer", example = "1")
    private Integer cardActivate;

    /**
     * 卡激活日期
     */
    @ApiModelProperty(name = "cardActivateTime", value = "设备编号", dataType = "String", example = "2020-04-18 10:55:53")
    private Date cardActivateTime;

    /**
     * 卫星模块：1-OGI 2-OG2
     */
    @ApiModelProperty(name = "satelliteModule", value = "卫星模块：1-OGI 2-OG2", dataType = "Integer", example = "1")
    private Integer satelliteModule;

    /**
     * 终端类型
     */
    @ApiModelProperty(name = "terminalType", value = "终端类型", dataType = "String", example = "GT1100")
    private String terminalType;

    /**
     * 创建时间
     */
    @ApiModelProperty(name = "createTime", value = "设备编号", dataType = "String", example = "2020-04-17 10:55:53")
    private Date createTime;
    /**
     * 更新时间
     */
    @ApiModelProperty(name = "updateTime", value = "更新时间", dataType = "String", example = "2020-04-17 10:55:53")
    private Date updateTime;
}
