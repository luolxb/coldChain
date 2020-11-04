package com.coldchain.project.business.company.domain;

import com.coldchain.framework.aspectj.lang.annotation.Excel;
import com.coldchain.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 企业对象 nts_company
 *
 * @author nts
 * @date 2019-11-23
 */
public class Company extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    private Long companyId;

    /**
     * 企业名称
     */
    @Excel(name = "企业名称")
    private String name;

    /**
     * 企业别名
     */
    @Excel(name = "企业别名")
    private String alias;

    /**
     * 企业地址
     */
    @Excel(name = "企业地址")
    private String address;

    /**
     * 行业ID
     */
    @Excel(name = "行业ID")
    private Integer industryId;

    /**
     * 企业会员ID
     */
    @Excel(name = "企业会员ID")
    private Integer companyMemberId;

    /**
     * 企业规模ID
     */
    @Excel(name = "企业规模ID")
    private Integer companyScaleId;

    /**
     * 信用代码|注册号
     */
    @Excel(name = "信用代码|注册号")
    private String licCode;

    /**
     * 营业执照企业名称
     */
    @Excel(name = "营业执照企业名称")
    private String licName;

    /**
     * 营业执照企业地址
     */
    @Excel(name = "营业执照企业地址")
    private String licAddress;

    /**
     * 企业法人
     */
    @Excel(name = "企业法人")
    private String legalPerson;

    /**
     * 营业执照Url
     */
    @Excel(name = "营业执照Url")
    private String license;

    /**
     * 企业网站Url
     */
    @Excel(name = "企业网站Url")
    private String webUrl;

    /**
     * 企业邮箱
     */
    @Excel(name = "企业邮箱")
    private String email;

    /**
     * 座机电话
     */
    @Excel(name = "座机电话")
    private String telephone;

    /**
     * 审核状态：0-未审核 1-审核成功 2-审核失败
     */
    @Excel(name = "审核状态：0-未审核 1-审核成功 2-审核失败")
    private Integer auditStatus;

    /**
     * 删除标志 1-正常状态 2-已删除
     */
    @Excel(name = "删除标志 1-正常状态 2-已删除")
    private Integer deleteFlag;

    /**
     * 审核说明
     */
    @Excel(name = "审核说明")
    private String auditDesc;

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getAddress() {
        return address;
    }

    public void setIndustryId(Integer industryId) {
        this.industryId = industryId;
    }

    public Integer getIndustryId() {
        return industryId;
    }

    public void setCompanyMemberId(Integer companyMemberId) {
        this.companyMemberId = companyMemberId;
    }

    public Integer getCompanyMemberId() {
        return companyMemberId;
    }

    public void setCompanyScaleId(Integer companyScaleId) {
        this.companyScaleId = companyScaleId;
    }

    public Integer getCompanyScaleId() {
        return companyScaleId;
    }

    public void setLicCode(String licCode) {
        this.licCode = licCode;
    }

    public String getLicCode() {
        return licCode;
    }

    public void setLicName(String licName) {
        this.licName = licName;
    }

    public String getLicName() {
        return licName;
    }

    public void setLicAddress(String licAddress) {
        this.licAddress = licAddress;
    }

    public String getLicAddress() {
        return licAddress;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getLicense() {
        return license;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setAuditDesc(String auditDesc) {
        this.auditDesc = auditDesc;
    }

    public String getAuditDesc() {
        return auditDesc;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("companyId", getCompanyId())
                .append("name", getName())
                .append("alias", getAlias())
                .append("address", getAddress())
                .append("industryId", getIndustryId())
                .append("companyMemberId", getCompanyMemberId())
                .append("companyScaleId", getCompanyScaleId())
                .append("licCode", getLicCode())
                .append("licName", getLicName())
                .append("licAddress", getLicAddress())
                .append("legalPerson", getLegalPerson())
                .append("license", getLicense())
                .append("webUrl", getWebUrl())
                .append("email", getEmail())
                .append("telephone", getTelephone())
                .append("auditStatus", getAuditStatus())
                .append("deleteFlag", getDeleteFlag())
                .append("auditDesc", getAuditDesc())
                .append("createTime", getCreateTime())
                .append("updateTime", getUpdateTime())
                .toString();
    }
}
