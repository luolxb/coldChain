package com.coldchain.project.business.cardlog.domain;

import com.coldchain.framework.aspectj.lang.annotation.Excel;
import com.coldchain.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 物联网卡使用日志对象 nts_card_usaged_log
 * 
 * @author nts
 * @date 2020-04-14
 */
public class NtsCardUsagedLog extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** 物联卡id */
    @Excel(name = "物联卡id")
    private Integer cardId;

    /** 记录时间 */
    @Excel(name = "记录时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date date;

    /** 当前累计使用的数据量 */
    @Excel(name = "当前累计使用的数据量")
    private String dataUsage;

    public void setId(Integer id)
    {
        this.id = id;
    }

    public Integer getId()
    {
        return id;
    }
    public void setCardId(Integer cardId)
    {
        this.cardId = cardId;
    }

    public Integer getCardId()
    {
        return cardId;
    }
    public void setDate(Date date) 
    {
        this.date = date;
    }

    public Date getDate() 
    {
        return date;
    }
    public void setDataUsage(String dataUsage) 
    {
        this.dataUsage = dataUsage;
    }

    public String getDataUsage() 
    {
        return dataUsage;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("cardId", getCardId())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("date", getDate())
            .append("dataUsage", getDataUsage())
            .append("remark", getRemark())
            .toString();
    }
}
