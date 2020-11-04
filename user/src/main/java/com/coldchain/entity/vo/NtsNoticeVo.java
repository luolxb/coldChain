package com.coldchain.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("消息实体类")
public class NtsNoticeVo {

    @ApiModelProperty("消息ID")
    private Long id;

    /**
     * 接受用户ID
     */
    @ApiModelProperty("接受用户ID")
    private Integer userId;

    /**
     * 消息内容
     */
    @ApiModelProperty("消息内容")
    private String noticeContent;

    /**
     * 消息头
     */
    @ApiModelProperty("消息内容")
    private String noticeTitle;

    /**
     * 消息类型
     */
    @ApiModelProperty("消息类型")
    private String noticeType;

    /**
     * 是否发送
     */
    @ApiModelProperty("是否发送")
    private String isSend;

    private Date createTime;
    private String createBy;
    private Date updateTime;
    private String updateBy;
}
