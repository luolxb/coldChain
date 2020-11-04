package com.coldchain.project.business.company.domain;

import com.coldchain.framework.aspectj.lang.annotation.Excel;
import com.coldchain.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 企业流量池对象 nts_company_flow_pool
 *
 * @author nts
 * @date 2020-03-23
 */
public class CompanyFlowPool extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    private Long companyFlowPoolId;

    /**
     * 企业ID
     */
    @Excel(name = "企业ID")
    private Long companyId;

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

    public void setCompanyFlowPoolId(Long companyFlowPoolId) {
        this.companyFlowPoolId = companyFlowPoolId;
    }

    public Long getCompanyFlowPoolId() {
        return companyFlowPoolId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getCompanyId() {
        return companyId;
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
                .append("companyFlowPoolId", getCompanyFlowPoolId())
                .append("companyId", getCompanyId())
                .append("surplusFlow", getSurplusFlow())
                .append("usedFlow", getUsedFlow())
                .append("deleteFlag", getDeleteFlag())
                .append("createTime", getCreateTime())
                .append("updateTime", getUpdateTime())
                .toString();
    }
}
