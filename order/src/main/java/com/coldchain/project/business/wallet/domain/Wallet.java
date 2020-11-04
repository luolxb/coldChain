package com.coldchain.project.business.wallet.domain;

import com.coldchain.framework.aspectj.lang.annotation.Excel;
import com.coldchain.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;

/**
 * 企业钱包对象 nts_wallet
 * 
 * @author nts
 * @date 2019-11-23
 */
public class Wallet extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long walletId;

    /** 企业ID */
    @Excel(name = "企业ID")
    private Long companyId;

    /** 金额 */
    @Excel(name = "金额")
    private BigDecimal money;

    /** 支付密码 */
    @Excel(name = "支付密码")
    private String payPassword;

    /** 盐加密 */
    @Excel(name = "盐加密")
    private String salt;

    /** 创建用户ID */
    @Excel(name = "创建用户ID")
    private Long createUserId;

    /** 修改用户ID */
    @Excel(name = "修改用户ID")
    private Long updateUserId;

    public void setWalletId(Long walletId) 
    {
        this.walletId = walletId;
    }

    public Long getWalletId() 
    {
        return walletId;
    }
    public void setCompanyId(Long companyId) 
    {
        this.companyId = companyId;
    }

    public Long getCompanyId() 
    {
        return companyId;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public void setPayPassword(String payPassword)
    {
        this.payPassword = payPassword;
    }

    public String getPayPassword() 
    {
        return payPassword;
    }
    public void setSalt(String salt) 
    {
        this.salt = salt;
    }

    public String getSalt() 
    {
        return salt;
    }
    public void setCreateUserId(Long createUserId) 
    {
        this.createUserId = createUserId;
    }

    public Long getCreateUserId() 
    {
        return createUserId;
    }
    public void setUpdateUserId(Long updateUserId) 
    {
        this.updateUserId = updateUserId;
    }

    public Long getUpdateUserId() 
    {
        return updateUserId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("walletId", getWalletId())
            .append("companyId", getCompanyId())
            .append("money", getMoney())
            .append("payPassword", getPayPassword())
            .append("salt", getSalt())
            .append("createUserId", getCreateUserId())
            .append("updateUserId", getUpdateUserId())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
