package com.coldchain.project.business.device.domain;

import com.coldchain.framework.aspectj.lang.annotation.Excel;
import com.coldchain.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 设备流量池对象 nts_device_flow_pool
 *
 * @author nts
 * @date 2019-11-23
 */
public class DeviceFlowPool extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    private Long flowPoolId;

    /**
     * 设备ID
     */
    @Excel(name = "设备ID")
    private Long deviceId;

    /**
     * 设备SN
     */
    @Excel(name = "设备SN")
    private String deviceSn;

    /**
     * 剩余流量
     */
    @Excel(name = "剩余流量")
    private Double surplusFlow;

    /**
     * 已用流量
     */
    @Excel(name = "已用流量")
    private Double usedFlow;

    /**
     * 删除标志 1-正常状态 2-已删除
     */
    @Excel(name = "删除标志 1-正常状态 2-已删除")
    private Integer deleteFlag;

    public void setFlowPoolId(Long flowPoolId) {
        this.flowPoolId = flowPoolId;
    }

    public Long getFlowPoolId() {
        return flowPoolId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
    }

    public String getDeviceSn() {
        return deviceSn;
    }

    public void setSurplusFlow(Double surplusFlow) {
        this.surplusFlow = surplusFlow;
    }

    public Double getSurplusFlow() {
        return surplusFlow;
    }

    public void setUsedFlow(Double usedFlow) {
        this.usedFlow = usedFlow;
    }

    public Double getUsedFlow() {
        return usedFlow;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("flowPoolId", getFlowPoolId())
                .append("deviceId", getDeviceId())
                .append("deviceSn", getDeviceSn())
                .append("surplusFlow", getSurplusFlow())
                .append("usedFlow", getUsedFlow())
                .append("deleteFlag", getDeleteFlag())
                .append("createTime", getCreateTime())
                .append("updateTime", getUpdateTime())
                .toString();
    }
}
