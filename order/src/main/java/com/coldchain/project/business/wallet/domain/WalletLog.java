package com.coldchain.project.business.wallet.domain;

import com.coldchain.framework.aspectj.lang.annotation.Excel;
import com.coldchain.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;

/**
 * 钱包变动日志对象 nts_wallet_log
 *
 * @author nts
 * @date 2019-11-23
 */
public class WalletLog extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    private Long walletLogId;

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
     * 交易流水sn，关联nts_wallet_record表
     */
    @Excel(name = "交易流水sn，关联nts_wallet_record表")
    private String walletRecordSn;

    /**
     * 变动金额 增+ 减-
     */
    @Excel(name = "变动金额 增+ 减-")
    private BigDecimal changeMoney;

    /**
     * 变动后的金额
     */
    @Excel(name = "变动后的金额")
    private BigDecimal money;

    /**
     * 是否显示 0-不显示 1-显示
     */
    @Excel(name = "是否显示 0-不显示 1-显示")
    private Integer display;

    public void setWalletLogId(Long walletLogId) {
        this.walletLogId = walletLogId;
    }

    public Long getWalletLogId() {
        return walletLogId;
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

    public BigDecimal getChangeMoney() {
        return changeMoney;
    }

    public void setChangeMoney(BigDecimal changeMoney) {
        this.changeMoney = changeMoney;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public void setDisplay(Integer display) {
        this.display = display;
    }

    public Integer getDisplay() {
        return display;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("walletLogId", getWalletLogId())
                .append("companyId", getCompanyId())
                .append("userId", getUserId())
                .append("walletRecordSn", getWalletRecordSn())
                .append("changeMoney", getChangeMoney())
                .append("money", getMoney())
                .append("remark", getRemark())
                .append("display", getDisplay())
                .append("createTime", getCreateTime())
                .toString();
    }
}
