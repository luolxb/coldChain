package com.coldchain.project.business.order.domain;

import com.coldchain.framework.aspectj.lang.annotation.Excel;
import com.coldchain.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 企业流量订单对象 nts_order_company_flow
 *
 * @author nts
 * @date 2020-03-23
 */
public class OrderCompanyFlow extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    private Long orderCompanyFlowId;

    /**
     * 企业ID
     */
    @Excel(name = "企业ID")
    private Long companyId;

    /**
     * 创建者ID
     */
    @Excel(name = "创建者ID")
    private Long createUserId;

    /**
     * 更新者ID
     */
    @Excel(name = "更新者ID")
    private Long updateUserId;

    /**
     * 订单编号
     */
    @Excel(name = "订单编号")
    private String orderCode;

    /**
     * 订单状态 0-待付款 1-处理中 2-已完成 3-取消 4-售后
     */
    @Excel(name = "订单状态 0-待付款 1-处理中 2-已完成 3-取消 4-售后")
    private Integer orderStatus;

    /**
     * 流量总价
     */
    @Excel(name = "流量总价")
    private BigDecimal flowPrice;

    /**
     * 订单总价
     */
    @Excel(name = "订单总价")
    private BigDecimal orderPrice;

    /**
     * 实际需要支付的金额
     */
    @Excel(name = "实际需要支付的金额")
    private BigDecimal actualPrice;

    /**
     * 货币类别ID
     */
    @Excel(name = "货币类别ID")
    private Integer currencyTypeId;

    /**
     * 支付方式ID
     */
    @Excel(name = "支付方式ID")
    private Integer payModelId;

    /**
     * 支付名称
     */
    @Excel(name = "支付名称")
    private String payName;

    /**
     * 支付流水号
     */
    @Excel(name = "支付流水号")
    private String payCode;

    /**
     * 支付状态 0-初始化 1-付款中,2-支付成功
     */
    @Excel(name = "支付状态 0-初始化 1-付款中,2-支付成功")
    private Integer payStatus;

    /**
     * 支付人
     */
    @Excel(name = "支付人")
    private String payer;

    /**
     * 支付回调状态 0-初始化 1-成功,-1-失败
     */
    @Excel(name = "支付回调状态 0-初始化 1-成功,-1-失败")
    private Integer payCallback;

    /**
     * 支付时间
     */
    @Excel(name = "支付时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date payTime;

    /**
     * 删除标志 1-正常状态 2-已删除
     */
    @Excel(name = "删除标志 1-正常状态 2-已删除")
    private Integer deleteFlag;

    public void setOrderCompanyFlowId(Long orderCompanyFlowId) {
        this.orderCompanyFlowId = orderCompanyFlowId;
    }

    public Long getOrderCompanyFlowId() {
        return orderCompanyFlowId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    public Long getUpdateUserId() {
        return updateUserId;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public BigDecimal getFlowPrice() {
        return flowPrice;
    }

    public void setFlowPrice(BigDecimal flowPrice) {
        this.flowPrice = flowPrice;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    public BigDecimal getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(BigDecimal actualPrice) {
        this.actualPrice = actualPrice;
    }

    public Integer getCurrencyTypeId() {
        return currencyTypeId;
    }

    public void setCurrencyTypeId(Integer currencyTypeId) {
        this.currencyTypeId = currencyTypeId;
    }

    public Integer getPayModelId() {
        return payModelId;
    }

    public void setPayModelId(Integer payModelId) {
        this.payModelId = payModelId;
    }

    public void setPayName(String payName) {
        this.payName = payName;
    }

    public String getPayName() {
        return payName;
    }

    public void setPayCode(String payCode) {
        this.payCode = payCode;
    }

    public String getPayCode() {
        return payCode;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayCallback(Integer payCallback) {
        this.payCallback = payCallback;
    }

    public Integer getPayCallback() {
        return payCallback;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getPayTime() {
        return payTime;
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
                .append("orderCompanyFlowId", getOrderCompanyFlowId())
                .append("companyId", getCompanyId())
                .append("createUserId", getCreateUserId())
                .append("updateUserId", getUpdateUserId())
                .append("orderCode", getOrderCode())
                .append("orderStatus", getOrderStatus())
                .append("flowPrice", getFlowPrice())
                .append("orderPrice", getOrderPrice())
                .append("actualPrice", getActualPrice())
                .append("currencyTypeId", getCurrencyTypeId())
                .append("payModelId", getPayModelId())
                .append("payName", getPayName())
                .append("payCode", getPayCode())
                .append("payStatus", getPayStatus())
                .append("payer", getPayer())
                .append("payCallback", getPayCallback())
                .append("payTime", getPayTime())
                .append("remark", getRemark())
                .append("deleteFlag", getDeleteFlag())
                .append("createTime", getCreateTime())
                .append("updateTime", getUpdateTime())
                .toString();
    }
}
