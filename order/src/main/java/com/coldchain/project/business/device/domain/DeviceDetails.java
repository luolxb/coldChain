package com.coldchain.project.business.device.domain;

import com.coldchain.framework.aspectj.lang.annotation.Excel;
import com.coldchain.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 设备详情对象 nts_device_details
 * 
 * @author nts
 * @date 2019-11-23
 */
public class DeviceDetails extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long deviceDetailsId;

    /** 设备ID */
    @Excel(name = "设备ID")
    private Long deviceId;

    /** 企业ID */
    @Excel(name = "企业ID")
    private Long companyId;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Long userId;

    /** 设备SN */
    @Excel(name = "设备SN")
    private String deviceSn;

    /** 服务商ID */
    @Excel(name = "服务商ID")
    private Integer carrierId;

    /** 账号ID */
    @Excel(name = "账号ID")
    private String account;

    /** 子账号ID */
    @Excel(name = "子账号ID")
    private String subaccount;

    /** 价格计划 */
    @Excel(name = "价格计划")
    private String pricePlan;

    /** 网关账号 */
    @Excel(name = "网关账号")
    private String gatewayAccount;

    /** 卫星模块：1-OGI 2-OG2 */
    @Excel(name = "卫星模块：1-OGI 2-OG2")
    private Integer satelliteModule;

    /** 卫星模块SN */
    @Excel(name = "卫星模块SN")
    private String satelliteSn;

    /** SIM运营商：1-中国电信 2-中国移动 3-中国联通 */
    @Excel(name = "SIM运营商：1-中国电信 2-中国移动 3-中国联通")
    private Integer simOperator;

    /** SIM唯一SN */
    @Excel(name = "SIM唯一SN")
    private String simSn;

    /** 删除标志 1-正常状态 2-已删除 */
    @Excel(name = "删除标志 1-正常状态 2-已删除")
    private Integer deleteFlag;

    public void setDeviceDetailsId(Long deviceDetailsId) 
    {
        this.deviceDetailsId = deviceDetailsId;
    }

    public Long getDeviceDetailsId() 
    {
        return deviceDetailsId;
    }
    public void setDeviceId(Long deviceId) 
    {
        this.deviceId = deviceId;
    }

    public Long getDeviceId() 
    {
        return deviceId;
    }
    public void setCompanyId(Long companyId) 
    {
        this.companyId = companyId;
    }

    public Long getCompanyId() 
    {
        return companyId;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setCarrierId(Integer carrierId) 
    {
        this.carrierId = carrierId;
    }

    public String getDeviceSn() {
        return deviceSn;
    }

    public void setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
    }

    public Integer getCarrierId()
    {
        return carrierId;
    }
    public void setAccount(String account) 
    {
        this.account = account;
    }

    public String getAccount() 
    {
        return account;
    }
    public void setSubaccount(String subaccount) 
    {
        this.subaccount = subaccount;
    }

    public String getSubaccount() 
    {
        return subaccount;
    }
    public void setPricePlan(String pricePlan) 
    {
        this.pricePlan = pricePlan;
    }

    public String getPricePlan() 
    {
        return pricePlan;
    }
    public void setGatewayAccount(String gatewayAccount) 
    {
        this.gatewayAccount = gatewayAccount;
    }

    public String getGatewayAccount() 
    {
        return gatewayAccount;
    }
    public void setSatelliteModule(Integer satelliteModule) 
    {
        this.satelliteModule = satelliteModule;
    }

    public Integer getSatelliteModule() 
    {
        return satelliteModule;
    }
    public void setSatelliteSn(String satelliteSn) 
    {
        this.satelliteSn = satelliteSn;
    }

    public String getSatelliteSn() 
    {
        return satelliteSn;
    }
    public void setSimOperator(Integer simOperator) 
    {
        this.simOperator = simOperator;
    }

    public Integer getSimOperator() 
    {
        return simOperator;
    }
    public void setSimSn(String simSn) 
    {
        this.simSn = simSn;
    }

    public String getSimSn() 
    {
        return simSn;
    }
    public void setDeleteFlag(Integer deleteFlag) 
    {
        this.deleteFlag = deleteFlag;
    }

    public Integer getDeleteFlag() 
    {
        return deleteFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("deviceDetailsId", getDeviceDetailsId())
            .append("deviceId", getDeviceId())
            .append("companyId", getCompanyId())
            .append("deviceSn", getDeviceSn())
            .append("userId", getUserId())
            .append("carrierId", getCarrierId())
            .append("account", getAccount())
            .append("subaccount", getSubaccount())
            .append("pricePlan", getPricePlan())
            .append("gatewayAccount", getGatewayAccount())
            .append("satelliteModule", getSatelliteModule())
            .append("satelliteSn", getSatelliteSn())
            .append("simOperator", getSimOperator())
            .append("simSn", getSimSn())
            .append("deleteFlag", getDeleteFlag())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
