package com.coldchain.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * 触发器报警记录表(CpTriggerData)实体类
 *
 * @author chenqingshan
 * @since 2020-10-12 11:16:27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("cp_trigger_data")
public class CpTriggerData {

    /**
    * 主键ID
    */
    @TableId
    private String id;
    /**
    * 触发器主键ID
    */
    private String triggerId;
    /**
    * 设备主键ID
    */
    private String deviceId;
    /**
    * 传感器主键ID
    */
    private String sensorId;
    /**
    * 传感器名称
    */
    private String sensorName;
    /**
    * 消息发送状态 0 正常 1失败
    */
    private Integer smgStatus;

    /**
     * 消息发送结果
     */
    private String msgSendResult;

    /**
    * 触发内容
    */
    private String triggerContent;
    /**
    * 触发时间
    */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date trggerDate;
    /**
    * 触发值
    */
    private String triggerVal;
    /**
    * 报警消息接收人邮箱
    */
    private String triggerEmail;
    /**
    * 报警消息接收人电话
    */
    private String triggerMobile;
    /**
    * 报警消息接收人微信
    */
    private String triggerWechat;
    /**
    * 用户ID
    */
    private String userId;
    /**
    * 创建时间
    */
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    private Date createDate;
    /**
    * 创建者
    */
    private String createBy;



}