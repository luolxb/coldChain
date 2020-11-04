package com.coldchain.project.business.device.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 设备
 */
@Data
public class DeviceVo {

    /**
     * 企业ID
     */
    @ApiModelProperty(name = "companyId", value = "企业ID(可选)", dataType = "Long", example = "1")
    private Long companyId;

    /**
     * 设备名称
     */
    @ApiModelProperty(name = "deviceName", value = "设备名称(不显)", dataType = "String", example = "GT1100-200")
    private String deviceName;


    /**
     * 设备类型ID
     */
    @ApiModelProperty(name = "deviceTypeId", value = "设备类型ID(必选)", dataType = "Integer", example = "1", required = true)
    private Integer deviceTypeId;

    /**
     * 设备描述
     */
    @ApiModelProperty(name = "deviceDesc", value = "设备描述(不显)", dataType = "String", example = "GT1100设备")
    private String deviceDesc;

    /**
     * 设备制造商ID
     */
    @ApiModelProperty(name = "deviceVendorId", value = "设备制造商ID(不显)", dataType = "Integer", example = "1")
    private Integer deviceVendorId;

    /**
     * 卫星SN
     */
    @ApiModelProperty(name = "deviceSn", value = "卫星SN(可选)", dataType = "String", example = "SN12345678")
    private String deviceSn;

    /**
     * 服务商ID
     */
    @ApiModelProperty(name = "carrierId", value = "服务商ID(可选)", dataType = "Integer", example = "1")
    private Integer carrierId;

    /**
     * 账号ID
     */
    @ApiModelProperty(name = "account", value = "账号ID(不显)", dataType = "String", example = "NTS")
    private String account;

    /**
     * 子账号ID
     */
    @ApiModelProperty(name = "subaccount", value = "子账号ID(不显)", dataType = "String", example = "NTS-1")
    private String subaccount;

    /**
     * 价格计划
     */
    @ApiModelProperty(name = "pricePlan", value = "价格计划(不显)", dataType = "String", example = "NTS-PRICE")
    private String pricePlan;

    /**
     * 网关账号
     */
    @ApiModelProperty(name = "gatewayAccount", value = "网关账号(不显)", dataType = "String", example = "NTS")
    private String gatewayAccount;

    /**
     * 卫星模块：1-OGI 2-OG2
     */
    @ApiModelProperty(name = "satelliteModule", value = "卫星模块：1-OGI 2-OG2(可选)", dataType = "Integer", example = "1")
    private Integer satelliteModule;

    /**
     * 卫星模块SN
     */
    @ApiModelProperty(name = "satelliteSn", value = "卫星模块SN(不显)", dataType = "String", example = "SN12345678")
    private String satelliteSn;

    /**
     * SIM运营商：1-中国电信 2-中国移动 3-中国联通
     */
    @ApiModelProperty(name = "simOperator", value = "SIM运营商：1-中国电信 2-中国移动 3-中国联通(不显)", dataType = "Integer", example = "1")
    private Integer simOperator;

    /**
     * SIM唯一SN
     */
    @ApiModelProperty(name = "simSn", value = "SIM唯一SN(不显)", dataType = "String", example = "SIM12345678")
    private String simSn;

    /**
     * 物联卡iccId
     */
    @ApiModelProperty(name = "iccId", value = "物联卡iccId(可选)", dataType = "String", example = "898607B8101980021585")
    private String cardIccId;
}
