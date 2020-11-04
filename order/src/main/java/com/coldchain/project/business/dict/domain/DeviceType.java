package com.coldchain.project.business.dict.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.coldchain.framework.aspectj.lang.annotation.Excel;
import com.coldchain.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 字典-设备类别对象 nts_dict_device_type
 *
 * @author nts
 * @date 2019-11-23
 */
public class DeviceType extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    private Integer deviceTypeId;

    /**
     * 设备类别名称
     */
    @Excel(name = "设备类别名称")
    private String name;

    /**
     * 设备类别描述
     */
    @Excel(name = "设备类别描述")
    private String descr;

    /**
     * 删除标志 1-正常状态 2-已删除
     */
    @Excel(name = "删除标志 1-正常状态 2-已删除")
    @JsonIgnore
    private Integer deleteFlag;

    public void setDeviceTypeId(Integer deviceTypeId) {
        this.deviceTypeId = deviceTypeId;
    }

    public Integer getDeviceTypeId() {
        return deviceTypeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getDescr() {
        return descr;
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
                .append("deviceTypeId", getDeviceTypeId())
                .append("name", getName())
                .append("descr", getDescr())
                .append("deleteFlag", getDeleteFlag())
                .append("createTime", getCreateTime())
                .append("updateTime", getUpdateTime())
                .toString();
    }
}
