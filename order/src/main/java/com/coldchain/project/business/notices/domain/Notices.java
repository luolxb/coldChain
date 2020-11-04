package com.coldchain.project.business.notices.domain;

import com.coldchain.framework.aspectj.lang.annotation.Excel;
import com.coldchain.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 通告对象 nts_notice
 *
 * @author nts
 * @date 2020-03-25
 */
public class Notices extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    private Long noticeId;

    /**
     * 通告标题
     */
    @Excel(name = "通告标题")
    private String title;

    /**
     * 通告内容
     */
    @Excel(name = "通告内容")
    private String content;

    /**
     * 发布时间
     */
    @Excel(name = "发布时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date releaseTime;

    /**
     * 是否撤销 0-默认 1-撤销
     */
    @Excel(name = "是否撤销 0-默认 1-撤销")
    private Integer isUndo;

    /**
     * 撤销时间
     */
    @Excel(name = "撤销时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date undoTime;

    /**
     * 是否删除 0-默认 1-删除
     */
    @Excel(name = "是否删除 0-默认 1-删除")
    private Integer isDel;

    /**
     * 删除时间
     */
    @Excel(name = "删除时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date delTime;

    /**
     * 优先级 0-默认 1-紧急 2-高 3-普通
     */
    @Excel(name = "优先级 0-默认 1-紧急 2-高 3-普通")
    private Integer priority;

    /**
     * 通告对象类型 0-默认 1-单个用户 2-多个用户 3-全部用户 4-用户类型
     */
    @Excel(name = "通告对象类型 0-默认 1-单个用户 2-多个用户 3-全部用户 4-用户类型")
    private Integer noticeObjType;

    /**
     * 用户类型
     */
    @Excel(name = "用户类型")
    private Integer accountType;

    public void setNoticeId(Long noticeId) {
        this.noticeId = noticeId;
    }

    public Long getNoticeId() {
        return noticeId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setIsUndo(Integer isUndo) {
        this.isUndo = isUndo;
    }

    public Integer getIsUndo() {
        return isUndo;
    }

    public void setUndoTime(Date undoTime) {
        this.undoTime = undoTime;
    }

    public Date getUndoTime() {
        return undoTime;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setDelTime(Date delTime) {
        this.delTime = delTime;
    }

    public Date getDelTime() {
        return delTime;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setNoticeObjType(Integer noticeObjType) {
        this.noticeObjType = noticeObjType;
    }

    public Integer getNoticeObjType() {
        return noticeObjType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public Integer getAccountType() {
        return accountType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("noticeId", getNoticeId())
                .append("title", getTitle())
                .append("content", getContent())
                .append("releaseTime", getReleaseTime())
                .append("isUndo", getIsUndo())
                .append("undoTime", getUndoTime())
                .append("isDel", getIsDel())
                .append("delTime", getDelTime())
                .append("priority", getPriority())
                .append("noticeObjType", getNoticeObjType())
                .append("accountType", getAccountType())
                .toString();
    }
}
