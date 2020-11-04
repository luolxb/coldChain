package com.coldchain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("nts_notice")
public class NtsNotice {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 接受用户ID
     */
    private Integer userId;

    /**
     * 消息内容
     */
    private String noticeContent;

    /**
     * 消息头
     */
    private String noticeTitle;

    /**
     * 消息类型
     */
    private String noticeType;

    /**
     * 是否发送
     */
    private String isSend;

    private Date createTime;
    private String createBy;
    private Date updateTime;
    private String updateBy;
}
