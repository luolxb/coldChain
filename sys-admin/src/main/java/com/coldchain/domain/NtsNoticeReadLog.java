package com.coldchain.domain;

import com.coldchain.common.annotation.Excel;
import com.coldchain.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 【请填写功能名称】对象 nts_notice_read_log
 * 
 * @author nts
 * @date 2020-08-14
 */
public class NtsNoticeReadLog extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 账号 */
    @Excel(name = "账号")
    private String loginName;

    /** 消息公告id */
    @Excel(name = "消息公告id")
    private Long noticeId;

    /** 阅读标识0-未阅读 1-已阅读 */
    @Excel(name = "阅读标识0-未阅读 1-已阅读")
    private Integer readFlag;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setLoginName(String loginName) 
    {
        this.loginName = loginName;
    }

    public String getLoginName() 
    {
        return loginName;
    }
    public void setNoticeId(Long noticeId) 
    {
        this.noticeId = noticeId;
    }

    public Long getNoticeId() 
    {
        return noticeId;
    }
    public void setReadFlag(Integer readFlag) 
    {
        this.readFlag = readFlag;
    }

    public Integer getReadFlag() 
    {
        return readFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("loginName", getLoginName())
            .append("noticeId", getNoticeId())
            .append("readFlag", getReadFlag())
            .toString();
    }
}
