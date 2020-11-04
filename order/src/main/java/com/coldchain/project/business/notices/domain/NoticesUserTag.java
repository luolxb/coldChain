package com.coldchain.project.business.notices.domain;

import com.coldchain.framework.aspectj.lang.annotation.Excel;
import com.coldchain.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 通告用户标记对象 nts_notice_user_tag
 * 
 * @author nts
 * @date 2020-03-25
 */
public class NoticesUserTag extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long id;

    /** 通告编号 */
    @Excel(name = "通告编号")
    private Long noticeId;

    /** 用户编号 */
    @Excel(name = "用户编号")
    private Long userId;

    /** 是否阅读 0-未阅读 1-已阅读 */
    @Excel(name = "是否阅读 0-未阅读 1-已阅读")
    private Integer isRead;

    /** 阅读时间 */
    @Excel(name = "阅读时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date readTime;

    /** 用户类型 */
    @Excel(name = "用户类型")
    private Integer accountType;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setNoticeId(Long noticeId) 
    {
        this.noticeId = noticeId;
    }

    public Long getNoticeId() 
    {
        return noticeId;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setIsRead(Integer isRead) 
    {
        this.isRead = isRead;
    }

    public Integer getIsRead() 
    {
        return isRead;
    }
    public void setReadTime(Date readTime) 
    {
        this.readTime = readTime;
    }

    public Date getReadTime() 
    {
        return readTime;
    }
    public void setAccountType(Integer accountType) 
    {
        this.accountType = accountType;
    }

    public Integer getAccountType() 
    {
        return accountType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("noticeId", getNoticeId())
            .append("userId", getUserId())
            .append("isRead", getIsRead())
            .append("readTime", getReadTime())
            .append("accountType", getAccountType())
            .toString();
    }
}
