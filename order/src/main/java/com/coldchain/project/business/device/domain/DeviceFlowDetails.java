package com.coldchain.project.business.device.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.coldchain.framework.aspectj.lang.annotation.Excel;
import com.coldchain.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 设备流量日志统计对象 nts_device_flow_details
 *
 * @author nts
 * @date 2019-11-23
 */
public class DeviceFlowDetails extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    private Long deviceFlowDetailsId;

    /**
     * 排序ID
     */
    @Excel(name = "排序ID")
    private String sortId;

    /**
     * 设备ID
     */
    @Excel(name = "设备ID")
    private String subscriberId;

    /**
     * 运营商
     */
    @Excel(name = "运营商")
    private String carrier;

    /**
     * 账号ID
     */
    @Excel(name = "账号ID")
    private String account;

    /**
     * 子账号ID
     */
    @Excel(name = "子账号ID")
    private String subaccount;

    /**
     * 价格计划
     */
    @Excel(name = "价格计划")
    private String pricePlan;

    /**
     * sms发送数据流量
     */
    @Excel(name = "sms发送数据流量")
    private Long smsMo;

    /**
     * sms接受数据流量
     */
    @Excel(name = "sms接受数据流量")
    private Long smsMt;

    /**
     * data发送数据流量
     */
    @Excel(name = "data发送数据流量")
    private Long dataMo;

    /**
     * data接受数据流量
     */
    @Excel(name = "data接受数据流量")
    private Long dataMt;

    /**
     * data发送和接受数据流量
     */
    @Excel(name = "data发送和接受数据流量")
    private Long dataBoth;

    /**
     * voice发送数据流量
     */
    @Excel(name = "voice发送数据流量")
    private Long voiceMo;

    /**
     * voice接受数据流量
     */
    @Excel(name = "voice接受数据流量")
    private Long voiceMt;

    /**
     * orbcomm报告数据流量
     */
    @Excel(name = "orbcomm报告数据流量")
    private Long orbcommReports;

    /**
     * orbcomm消息数据流量
     */
    @Excel(name = "orbcomm消息数据流量")
    private Long orbcommMessages;

    /**
     * orbcomm数据流量
     */
    @Excel(name = "orbcomm数据流量")
    private Long orbcommBytes;

    /**
     * 使用时间
     */
    @Excel(name = "使用时间", width = 30, dateFormat = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss 'GMT'")
    private Date usageTime;

    /**
     * 导入时间
     */
    @Excel(name = "导入时间", width = 30, dateFormat = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss 'GMT'")
    private Date importTime;

    /**
     * 统计时间
     */
    @Excel(name = "统计时间", width = 30, dateFormat = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss 'GMT'")
    private Date statisticsTime;

    public void setDeviceFlowDetailsId(Long deviceFlowDetailsId) {
        this.deviceFlowDetailsId = deviceFlowDetailsId;
    }

    public Long getDeviceFlowDetailsId() {
        return deviceFlowDetailsId;
    }

    public void setSortId(String sortId) {
        this.sortId = sortId;
    }

    public String getSortId() {
        return sortId;
    }

    public void setSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
    }

    public String getSubscriberId() {
        return subscriberId;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAccount() {
        return account;
    }

    public void setSubaccount(String subaccount) {
        this.subaccount = subaccount;
    }

    public String getSubaccount() {
        return subaccount;
    }

    public void setPricePlan(String pricePlan) {
        this.pricePlan = pricePlan;
    }

    public String getPricePlan() {
        return pricePlan;
    }

    public void setSmsMo(Long smsMo) {
        this.smsMo = smsMo;
    }

    public Long getSmsMo() {
        return smsMo;
    }

    public void setSmsMt(Long smsMt) {
        this.smsMt = smsMt;
    }

    public Long getSmsMt() {
        return smsMt;
    }

    public void setDataMo(Long dataMo) {
        this.dataMo = dataMo;
    }

    public Long getDataMo() {
        return dataMo;
    }

    public void setDataMt(Long dataMt) {
        this.dataMt = dataMt;
    }

    public Long getDataMt() {
        return dataMt;
    }

    public void setDataBoth(Long dataBoth) {
        this.dataBoth = dataBoth;
    }

    public Long getDataBoth() {
        return dataBoth;
    }

    public void setVoiceMo(Long voiceMo) {
        this.voiceMo = voiceMo;
    }

    public Long getVoiceMo() {
        return voiceMo;
    }

    public void setVoiceMt(Long voiceMt) {
        this.voiceMt = voiceMt;
    }

    public Long getVoiceMt() {
        return voiceMt;
    }

    public void setOrbcommReports(Long orbcommReports) {
        this.orbcommReports = orbcommReports;
    }

    public Long getOrbcommReports() {
        return orbcommReports;
    }

    public void setOrbcommMessages(Long orbcommMessages) {
        this.orbcommMessages = orbcommMessages;
    }

    public Long getOrbcommMessages() {
        return orbcommMessages;
    }

    public void setOrbcommBytes(Long orbcommBytes) {
        this.orbcommBytes = orbcommBytes;
    }

    public Long getOrbcommBytes() {
        return orbcommBytes;
    }

    public void setUsageTime(Date usageTime) {
        this.usageTime = usageTime;
    }

    public Date getUsageTime() {
        return usageTime;
    }

    public void setImportTime(Date importTime) {
        this.importTime = importTime;
    }

    public Date getImportTime() {
        return importTime;
    }

    public void setStatisticsTime(Date statisticsTime) {
        this.statisticsTime = statisticsTime;
    }

    public Date getStatisticsTime() {
        return statisticsTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("deviceFlowDetailsId", getDeviceFlowDetailsId())
                .append("sortId", getSortId())
                .append("subscriberId", getSubscriberId())
                .append("carrier", getCarrier())
                .append("account", getAccount())
                .append("subaccount", getSubaccount())
                .append("pricePlan", getPricePlan())
                .append("smsMo", getSmsMo())
                .append("smsMt", getSmsMt())
                .append("dataMo", getDataMo())
                .append("dataMt", getDataMt())
                .append("dataBoth", getDataBoth())
                .append("voiceMo", getVoiceMo())
                .append("voiceMt", getVoiceMt())
                .append("orbcommReports", getOrbcommReports())
                .append("orbcommMessages", getOrbcommMessages())
                .append("orbcommBytes", getOrbcommBytes())
                .append("usageTime", getUsageTime())
                .append("importTime", getImportTime())
                .append("statisticsTime", getStatisticsTime())
                .append("createTime", getCreateTime())
                .toString();
    }
}
