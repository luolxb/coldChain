package com.coldchain.project.business.device.domain;

import com.coldchain.framework.aspectj.lang.annotation.Excel;
import com.coldchain.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 设备对象 nts_device
 * 
 * @author nts
 * @date 2019-11-23
 */
public class Device extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long deviceId;

    /** 企业ID */
    @Excel(name = "企业ID")
    private Long companyId;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Long userId;

    /** 设备名称 */
    @Excel(name = "设备名称")
    private String deviceName;

    /** 设备类型ID */
    @Excel(name = "设备类型ID")
    private Integer deviceTypeId;

    /** 设备描述 */
    @Excel(name = "设备描述")
    private String deviceDesc;

    /** 设备制造商ID */
    @Excel(name = "设备制造商ID")
    private Integer deviceVendorId;

    /** 激活状态：0-未激活 1-已激活 2-暂停 3-启用 4-禁用 */
    @Excel(name = "激活状态：0-未激活 1-已激活")
    private Integer activate;

    /** 激活时间 */
    @Excel(name = "激活时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date activateTime;

    /** 设备状态：0-离线 1-在线 2-故障 3-欠费 */
    @Excel(name = "设备状态：0-离线 1-在线 2-故障 3-欠费")
    private Integer deviceState;

    /** 设备SN */
    @Excel(name = "设备SN")
    private String deviceSn;

    /** 删除标志 1-正常状态 2-已删除 */
    @Excel(name = "删除标志 1-正常状态 2-已删除")
    private Integer deleteFlag;

    /**
     * 物联卡iccId
     */
    @Excel(name = "物联卡iccId")
    private String cardIccId;


    public void setCardIccId(String cardIccId)
    {
        this.cardIccId = cardIccId;
    }

    public String getCardIccId()
    {
        return cardIccId;
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
    public void setDeviceName(String deviceName) 
    {
        this.deviceName = deviceName;
    }

    public String getDeviceName() 
    {
        return deviceName;
    }
    public void setDeviceTypeId(Integer deviceTypeId) 
    {
        this.deviceTypeId = deviceTypeId;
    }

    public Integer getDeviceTypeId() 
    {
        return deviceTypeId;
    }
    public void setDeviceDesc(String deviceDesc) 
    {
        this.deviceDesc = deviceDesc;
    }

    public String getDeviceDesc() 
    {
        return deviceDesc;
    }
    public void setDeviceVendorId(Integer deviceVendorId) 
    {
        this.deviceVendorId = deviceVendorId;
    }

    public Integer getDeviceVendorId() 
    {
        return deviceVendorId;
    }
    public void setActivate(Integer activate) 
    {
        this.activate = activate;
    }

    public Integer getActivate() 
    {
        return activate;
    }
    public void setActivateTime(Date activateTime) 
    {
        this.activateTime = activateTime;
    }

    public Date getActivateTime() 
    {
        return activateTime;
    }
    public void setDeviceState(Integer deviceState) 
    {
        this.deviceState = deviceState;
    }

    public Integer getDeviceState() 
    {
        return deviceState;
    }
    public void setDeviceSn(String deviceSn) 
    {
        this.deviceSn = deviceSn;
    }

    public String getDeviceSn() 
    {
        return deviceSn;
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
            .append("deviceId", getDeviceId())
            .append("companyId", getCompanyId())
            .append("userId", getUserId())
            .append("deviceName", getDeviceName())
            .append("deviceTypeId", getDeviceTypeId())
            .append("deviceDesc", getDeviceDesc())
            .append("deviceVendorId", getDeviceVendorId())
            .append("activate", getActivate())
            .append("activateTime", getActivateTime())
            .append("deviceState", getDeviceState())
            .append("deviceSn", getDeviceSn())
            .append("deleteFlag", getDeleteFlag())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("cardIccId", getCardIccId())
            .toString();
    }
}
