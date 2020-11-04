package com.coldchain.project.business.wallet.domain;

import com.coldchain.framework.aspectj.lang.annotation.Excel;
import com.coldchain.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 钱包交易记录对象 nts_wallet_record
 *
 * @author nts
 * @date 2019-11-23
 */
public class WalletRecord extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    private Long walletRecordId;

    /**
     * 企业ID
     */
    @Excel(name = "企业ID")
    private Long companyId;

    /**
     * 用户ID
     */
    @Excel(name = "用户ID")
    private Long userId;

    /**
     * 交易流水sn，ymdHis+2位随机数
     */
    @Excel(name = "交易流水sn，ymdHis+2位随机数")
    private String walletRecordSn;

    /**
     * 支付方UID，0-系统充值
     */
    @Excel(name = "支付方UID，0-系统充值")
    private String fromUid;

    /**
     * 接收方UID，0-系统提现
     */
    @Excel(name = "接收方UID，0-系统提现")
    private String toUid;

    /**
     * 交易类型 1-充值 2-提现 3-交易
     */
    @Excel(name = "交易类型 1-充值 2-提现 3-交易")
    private Integer type;

    /**
     * 交易金额
     */
    @Excel(name = "交易金额")
    private BigDecimal money;

    /**
     * 支付方式ID 0-待定 支付宝|微信|银行卡|余额
     */
    @Excel(name = "支付方式ID 0-待定 支付宝|微信|银行卡|余额")
    private Integer payModelId;

    /**
     * 支付状态 0-待支付 -1-失败 1-成功
     */
    @Excel(name = "支付状态 0-待支付 -1-失败 1-成功")
    private Integer payStatus;

    /**
     * 交易时间
     */
    @Excel(name = "交易时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date payTime;

    /**
     * 收款状态 0-待收款 -1-失败 1-成功
     */
    @Excel(name = "收款状态 0-待收款 -1-失败 1-成功")
    private Integer fetchStatus;

    /**
     * 收款时间
     */
    @Excel(name = "收款时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date fetchTime;

    /**
     * 对账状态 0-未对账 1-已对账
     */
    @Excel(name = "对账状态 0-未对账 1-已对账")
    private Integer checkStatus;

    /**
     * 对账时间
     */
    @Excel(name = "对账时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date checkTime;

    public void setWalletRecordId(Long walletRecordId) {
        this.walletRecordId = walletRecordId;
    }

    public Long getWalletRecordId() {
        return walletRecordId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setWalletRecordSn(String walletRecordSn) {
        this.walletRecordSn = walletRecordSn;
    }

    public String getWalletRecordSn() {
        return walletRecordSn;
    }

    public void setFromUid(String fromUid) {
        this.fromUid = fromUid;
    }

    public String getFromUid() {
        return fromUid;
    }

    public void setToUid(String toUid) {
        this.toUid = toUid;
    }

    public String getToUid() {
        return toUid;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return type;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public void setPayModelId(Integer payModelId) {
        this.payModelId = payModelId;
    }

    public Integer getPayModelId() {
        return payModelId;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setFetchStatus(Integer fetchStatus) {
        this.fetchStatus = fetchStatus;
    }

    public Integer getFetchStatus() {
        return fetchStatus;
    }

    public void setFetchTime(Date fetchTime) {
        this.fetchTime = fetchTime;
    }

    public Date getFetchTime() {
        return fetchTime;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("walletRecordId", getWalletRecordId())
                .append("companyId", getCompanyId())
                .append("userId", getUserId())
                .append("walletRecordSn", getWalletRecordSn())
                .append("fromUid", getFromUid())
                .append("toUid", getToUid())
                .append("type", getType())
                .append("money", getMoney())
                .append("payModelId", getPayModelId())
                .append("remark", getRemark())
                .append("payStatus", getPayStatus())
                .append("payTime", getPayTime())
                .append("fetchStatus", getFetchStatus())
                .append("fetchTime", getFetchTime())
                .append("checkStatus", getCheckStatus())
                .append("checkTime", getCheckTime())
                .append("createTime", getCreateTime())
                .toString();
    }
}
