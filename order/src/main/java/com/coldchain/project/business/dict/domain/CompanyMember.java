package com.coldchain.project.business.dict.domain;

import com.coldchain.framework.aspectj.lang.annotation.Excel;
import com.coldchain.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 字典-企业会员对象 nts_dict_company_member
 * 
 * @author nts
 * @date 2019-11-23
 */
public class CompanyMember extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Integer companyMemberId;

    /** 企业会员名称 */
    @Excel(name = "企业会员名称")
    private String name;

    /** 企业会员描述 */
    @Excel(name = "企业会员描述")
    private String descr;

    /** 删除标志 1-正常状态 2-已删除 */
    @Excel(name = "删除标志 1-正常状态 2-已删除")
    private Integer deleteFlag;

    public void setCompanyMemberId(Integer companyMemberId) 
    {
        this.companyMemberId = companyMemberId;
    }

    public Integer getCompanyMemberId() 
    {
        return companyMemberId;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setDescr(String descr) 
    {
        this.descr = descr;
    }

    public String getDescr() 
    {
        return descr;
    }
    public void setDeleteFlag(Integer deleteFlag) 
    {
        this.deleteFlag = deleteFlag;
    }

    public Integer getDeleteFlag() 
    {
        return deleteFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("companyMemberId", getCompanyMemberId())
            .append("name", getName())
            .append("descr", getDescr())
            .append("deleteFlag", getDeleteFlag())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
