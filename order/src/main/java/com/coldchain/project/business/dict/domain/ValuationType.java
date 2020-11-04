package com.coldchain.project.business.dict.domain;

import com.coldchain.framework.aspectj.lang.annotation.Excel;
import com.coldchain.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 字典-计价模式对象 nts_dict_valuation_type
 * 
 * @author nts
 * @date 2019-11-23
 */
public class ValuationType extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Integer valuationTypeId;

    /** 计价模式名称 */
    @Excel(name = "计价模式名称")
    private String name;

    /** 计价模式描述 */
    @Excel(name = "计价模式描述")
    private String descr;

    /** 默认收费：1月/1次 */
    @Excel(name = "默认收费：1月/1次")
    private Integer months;

    /** 删除标志 1-正常状态 2-已删除 */
    @Excel(name = "删除标志 1-正常状态 2-已删除")
    private Integer deleteFlag;

    public void setValuationTypeId(Integer valuationTypeId) 
    {
        this.valuationTypeId = valuationTypeId;
    }

    public Integer getValuationTypeId() 
    {
        return valuationTypeId;
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
    public void setMonths(Integer months) 
    {
        this.months = months;
    }

    public Integer getMonths() 
    {
        return months;
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
            .append("valuationTypeId", getValuationTypeId())
            .append("name", getName())
            .append("descr", getDescr())
            .append("months", getMonths())
            .append("deleteFlag", getDeleteFlag())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
