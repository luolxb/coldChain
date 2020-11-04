package com.coldchain.project.business.device.domain;

import com.coldchain.framework.aspectj.lang.annotation.Excel;
import com.coldchain.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 设备数据上报对象 nts_device_data_report
 * 
 * @author nts
 * @date 2019-11-23
 */
public class DeviceDataReport extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long deviceDataReportId;

    /** 账号 */
    @Excel(name = "账号")
    private String account;

    /** 组织 */
    @Excel(name = "组织")
    private String organization;

    /** 时区 */
    @Excel(name = "时区")
    private String timeZone;

    /** 设备SN */
    @Excel(name = "设备SN")
    private String deviceSn;

    /** 设备事件 */
    @Excel(name = "设备事件")
    private String deviceEvent;

    /** 设备时间 */
    @Excel(name = "设备时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date deviceTime;

    /** 设备本地时间 */
    @Excel(name = "设备本地时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date deviceTimeLocal;

    /** 设备类型 */
    @Excel(name = "设备类型")
    private String deviceType;

    /** 设备速度 */
    @Excel(name = "设备速度")
    private String deviceSpeed;

    /** GPS地址 */
    @Excel(name = "GPS地址")
    private String gpsAddress;

    /** GPS模式 */
    @Excel(name = "GPS模式")
    private String gpsMode;

    /** GPS维度 */
    @Excel(name = "GPS维度")
    private String latitude;

    /** GPS经度 */
    @Excel(name = "GPS经度")
    private String longitude;

    /** 是否使用卫星 */
    @Excel(name = "是否使用卫星")
    private String satellitesUsed;

    /** 温度 */
    @Excel(name = "温度")
    private String temperature;

    /** 电池电压 */
    @Excel(name = "电池电压")
    private String batteryVoltage;

    /** 固件版本 */
    @Excel(name = "固件版本")
    private String firmwareVersion;

    /** 读取ID */
    @Excel(name = "读取ID")
    private String readId;

    public void setDeviceDataReportId(Long deviceDataReportId) 
    {
        this.deviceDataReportId = deviceDataReportId;
    }

    public Long getDeviceDataReportId() 
    {
        return deviceDataReportId;
    }
    public void setAccount(String account) 
    {
        this.account = account;
    }

    public String getAccount() 
    {
        return account;
    }
    public void setOrganization(String organization) 
    {
        this.organization = organization;
    }

    public String getOrganization() 
    {
        return organization;
    }
    public void setTimeZone(String timeZone) 
    {
        this.timeZone = timeZone;
    }

    public String getTimeZone() 
    {
        return timeZone;
    }
    public void setDeviceSn(String deviceSn) 
    {
        this.deviceSn = deviceSn;
    }

    public String getDeviceSn() 
    {
        return deviceSn;
    }
    public void setDeviceEvent(String deviceEvent) 
    {
        this.deviceEvent = deviceEvent;
    }

    public String getDeviceEvent() 
    {
        return deviceEvent;
    }
    public void setDeviceTime(Date deviceTime) 
    {
        this.deviceTime = deviceTime;
    }

    public Date getDeviceTime() 
    {
        return deviceTime;
    }
    public void setDeviceTimeLocal(Date deviceTimeLocal) 
    {
        this.deviceTimeLocal = deviceTimeLocal;
    }

    public Date getDeviceTimeLocal() 
    {
        return deviceTimeLocal;
    }
    public void setDeviceType(String deviceType) 
    {
        this.deviceType = deviceType;
    }

    public String getDeviceType() 
    {
        return deviceType;
    }
    public void setDeviceSpeed(String deviceSpeed) 
    {
        this.deviceSpeed = deviceSpeed;
    }

    public String getDeviceSpeed() 
    {
        return deviceSpeed;
    }
    public void setGpsAddress(String gpsAddress) 
    {
        this.gpsAddress = gpsAddress;
    }

    public String getGpsAddress() 
    {
        return gpsAddress;
    }
    public void setGpsMode(String gpsMode) 
    {
        this.gpsMode = gpsMode;
    }

    public String getGpsMode() 
    {
        return gpsMode;
    }
    public void setLatitude(String latitude) 
    {
        this.latitude = latitude;
    }

    public String getLatitude() 
    {
        return latitude;
    }
    public void setLongitude(String longitude) 
    {
        this.longitude = longitude;
    }

    public String getLongitude() 
    {
        return longitude;
    }
    public void setSatellitesUsed(String satellitesUsed) 
    {
        this.satellitesUsed = satellitesUsed;
    }

    public String getSatellitesUsed() 
    {
        return satellitesUsed;
    }
    public void setTemperature(String temperature) 
    {
        this.temperature = temperature;
    }

    public String getTemperature() 
    {
        return temperature;
    }
    public void setBatteryVoltage(String batteryVoltage) 
    {
        this.batteryVoltage = batteryVoltage;
    }

    public String getBatteryVoltage() 
    {
        return batteryVoltage;
    }
    public void setFirmwareVersion(String firmwareVersion) 
    {
        this.firmwareVersion = firmwareVersion;
    }

    public String getFirmwareVersion() 
    {
        return firmwareVersion;
    }
    public void setReadId(String readId) 
    {
        this.readId = readId;
    }

    public String getReadId() 
    {
        return readId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("deviceDataReportId", getDeviceDataReportId())
            .append("account", getAccount())
            .append("organization", getOrganization())
            .append("timeZone", getTimeZone())
            .append("deviceSn", getDeviceSn())
            .append("deviceEvent", getDeviceEvent())
            .append("deviceTime", getDeviceTime())
            .append("deviceTimeLocal", getDeviceTimeLocal())
            .append("deviceType", getDeviceType())
            .append("deviceSpeed", getDeviceSpeed())
            .append("gpsAddress", getGpsAddress())
            .append("gpsMode", getGpsMode())
            .append("latitude", getLatitude())
            .append("longitude", getLongitude())
            .append("satellitesUsed", getSatellitesUsed())
            .append("temperature", getTemperature())
            .append("batteryVoltage", getBatteryVoltage())
            .append("firmwareVersion", getFirmwareVersion())
            .append("readId", getReadId())
            .append("createTime", getCreateTime())
            .toString();
    }
}
