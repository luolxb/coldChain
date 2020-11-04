package com.coldchain.project.business.flow.domain;

import com.coldchain.framework.aspectj.lang.annotation.Excel;
import com.coldchain.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;

/**
 * 流量价格套餐对象 nts_flow_plans
 *
 * @author flows
 * @date 2019-11-29
 */
public class FlowPlans extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    private Long flowPlansId;

    /**
     * 套餐名称
     */
    @Excel(name = "套餐名称")
    private String plansName;

    /**
     * 套餐类型 0-自定义流量 1-流量阶梯 2-按月缴费
     */
    @Excel(name = "套餐类型 0-自定义流量 1-流量阶梯 2-按月缴费")
    private Integer plansType;

    /**
     * 套餐描述
     */
    @Excel(name = "套餐描述")
    private String plansDesc;

    /**
     * 流量单价 ?/kb
     */
    @Excel(name = "流量单价 ?/kb")
    private BigDecimal unitPrice;

    /**
     * 流量总价
     */
    @Excel(name = "流量总价")
    private BigDecimal totalPrice;

    /**
     * 流量数量 单位：kb
     */
    @Excel(name = "流量数量 单位：kb")
    private Double flowNumber;

    /**
     * 月收费：1月，3月，6月
     */
    @Excel(name = "月收费：1月，3月，6月")
    private Integer months;

    public void setFlowPlansId(Long flowPlansId) {
        this.flowPlansId = flowPlansId;
    }

    public Long getFlowPlansId() {
        return flowPlansId;
    }

    public void setPlansName(String plansName) {
        this.plansName = plansName;
    }

    public String getPlansName() {
        return plansName;
    }

    public void setPlansType(Integer plansType) {
        this.plansType = plansType;
    }

    public Integer getPlansType() {
        return plansType;
    }

    public void setPlansDesc(String plansDesc) {
        this.plansDesc = plansDesc;
    }

    public String getPlansDesc() {
        return plansDesc;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setFlowNumber(Double flowNumber) {
        this.flowNumber = flowNumber;
    }

    public Double getFlowNumber() {
        return flowNumber;
    }

    public void setMonths(Integer months) {
        this.months = months;
    }

    public Integer getMonths() {
        return months;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("flowPlansId", getFlowPlansId())
                .append("plansName", getPlansName())
                .append("plansType", getPlansType())
                .append("plansDesc", getPlansDesc())
                .append("unitPrice", getUnitPrice())
                .append("totalPrice", getTotalPrice())
                .append("flowNumber", getFlowNumber())
                .append("months", getMonths())
                .append("createTime", getCreateTime())
                .append("updateTime", getUpdateTime())
                .toString();
    }
}
