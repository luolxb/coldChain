package com.coldchain.project.business.dict.domain;

import com.coldchain.framework.aspectj.lang.annotation.Excel;
import com.coldchain.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 字典-支付方式对象 nts_dict_pay_model
 * 
 * @author nts
 * @date 2019-11-23
 */
public class PayModel extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Integer payModelId;

    /** 支付名称 */
    @Excel(name = "支付名称")
    private String name;

    /** 支付图标 */
    @Excel(name = "支付图标")
    private String image;

    /** 支付描述 */
    @Excel(name = "支付描述")
    private String descr;

    /** 删除标志 1-正常状态 2-已删除 */
    @Excel(name = "删除标志 1-正常状态 2-已删除")
    private Integer deleteFlag;

    public void setPayModelId(Integer payModelId) 
    {
        this.payModelId = payModelId;
    }

    public Integer getPayModelId() 
    {
        return payModelId;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setImage(String image) 
    {
        this.image = image;
    }

    public String getImage() 
    {
        return image;
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
            .append("payModelId", getPayModelId())
            .append("name", getName())
            .append("image", getImage())
            .append("descr", getDescr())
            .append("deleteFlag", getDeleteFlag())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
