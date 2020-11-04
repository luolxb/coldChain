package com.coldchain.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 通知公告表 sys_notice
 * 
 * @author nts
 */
@Data
@ApiModel(value = "通知公告")
public class SysNoticeVo{


    /** 公告ID */
    @ApiModelProperty(name = "noticeId", value = "公告ID", dataType = "Long")
    private Long noticeId;

    /** 公告标题 */
    @ApiModelProperty(name = "noticeTitle", value = "公告标题", dataType = "String")
    private String noticeTitle;

    /** 公告类型（1通知 2公告） */
    @ApiModelProperty(name = "noticeType", value = "公告类型（1通知 2公告）", dataType = "String")
    private String noticeType;

    /** 公告内容 */
    @ApiModelProperty(name = "noticeContent", value = "公告内容", dataType = "String")
    private String noticeContent;

    /** 公告状态（0正常 1关闭） */
    @ApiModelProperty(name = "status", value = "公告状态（0正常 1关闭）", dataType = "String")
    private String status;

    /**
     * 指定接收用户
     */
    @ApiModelProperty(name = "userLoginName", value = "指定接收用户", dataType = "String")
    private String userLoginName;

    @ApiModelProperty(name = "beginTime", value = "时间段查询-起始时间", dataType = "String")
    private String beginTime;
    @ApiModelProperty(name = "endTime", value = "时间段查询-结束时间", dataType = "String")
    private String endTime;

}
