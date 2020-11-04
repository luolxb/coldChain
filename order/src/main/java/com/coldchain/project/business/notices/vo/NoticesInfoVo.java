package com.coldchain.project.business.notices.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 消息通知
 */
@Data
public class NoticesInfoVo {

    /**
     * 编号
     */
    @ApiModelProperty(name = "noticeId", value = "noticeId", dataType = "Long", example = "1")
    private Long noticeId;

    /**
     * 通告标题
     */
    @ApiModelProperty(name = "title", value = "title", dataType = "String", example = "通告标题")
    private String title;

    /**
     * 通告内容
     */
    @ApiModelProperty(name = "content", value = "content", dataType = "String", example = "通告内容")
    private String content;

    /**
     * 发布时间
     */
    @ApiModelProperty(name = "releaseTime", value = "releaseTime", dataType = "Date", example = "发布时间")
    private Date releaseTime;

    /**
     * 是否撤销 0-默认 1-撤销
     */
    @ApiModelProperty(name = "isUndo", value = "是否撤销 0-默认 1-撤销", dataType = "Integer", example = "0")
    private Integer isUndo;

    /**
     * 撤销时间
     */
    @ApiModelProperty(name = "undoTime", value = "撤销时间", dataType = "Date", example = "")
    private Date undoTime;

    /**
     * 优先级 0-默认 1-紧急 2-高 3-普通
     */
    @ApiModelProperty(name = "priority", value = "优先级 0-默认 1-紧急 2-高 3-普通", dataType = "Integer", example = "0")
    private Integer priority;

    /**
     * 通告对象类型 0-默认 1-单个用户 2-多个用户 3-全部用户 4-用户类型
     */
    @ApiModelProperty(name = "noticeObjType", value = "通告对象类型 0-默认 1-单个用户 2-多个用户 3-全部用户 4-用户类型", dataType = "Integer", example = "0")
    private Integer noticeObjType;

    /**
     * 用户类型
     */
    @ApiModelProperty(name = "accountType", value = "用户类型", dataType = "Integer", example = "0")
    private Integer accountType;

    /**
     * 是否阅读 0-未阅读 1-已阅读
     */
    @ApiModelProperty(name = "isRead", value = "是否阅读 0-未阅读 1-已阅读", dataType = "Integer", example = "0")
    private Integer isRead;

    /**
     * 阅读时间
     */
    @ApiModelProperty(name = "isRead", value = "阅读时间", dataType = "Date", example = "")
    private Date readTime;
}
