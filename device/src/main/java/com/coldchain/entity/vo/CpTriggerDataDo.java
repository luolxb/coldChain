package com.coldchain.entity.vo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
public class CpTriggerDataDo {

    /**
     * 主键ID
     */
    private String id;
    /**
     * 触发器主键ID
     */
    private String alarmsId;
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
    private Integer status;

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
    private String triggerDate;
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
}
