package com.coldchain.project.business.dict.domain;

import com.coldchain.framework.aspectj.lang.annotation.Excel;
import com.coldchain.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 字典-流量计价比率对象 nts_dict_flow_valuation_ratio
 * 
 * @author nts
 * @date 2019-11-23
 */
public class FlowValuationRatio extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Integer flowValuationRatioId;

    /** 流量计价比率名称 */
    @Excel(name = "流量计价比率名称")
    private String name;

    /** 流量计价比率描述 */
    @Excel(name = "流量计价比率描述")
    private String descr;

    /** 价格 */
    @Excel(name = "价格")
    private Double price;

    /** 删除标志 1-正常状态 2-已删除 */
    @Excel(name = "删除标志 1-正常状态 2-已删除")
    private Integer deleteFlag;

    public void setFlowValuationRatioId(Integer flowValuationRatioId) 
    {
        this.flowValuationRatioId = flowValuationRatioId;
    }

    public Integer getFlowValuationRatioId() 
    {
        return flowValuationRatioId;
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
    public void setPrice(Double price) 
    {
        this.price = price;
    }

    public Double getPrice() 
    {
        return price;
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
            .append("flowValuationRatioId", getFlowValuationRatioId())
            .append("name", getName())
            .append("descr", getDescr())
            .append("price", getPrice())
            .append("deleteFlag", getDeleteFlag())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
