package com.coldchain.project.ocpcl.service.impl;

import lombok.Data;

/**
 * 消息
 */
@Data
public class OcpMessage {

    /**
     * 操作ID
     */
    private long operationId;

    /**
     * 操作ID
     */
    private String callbackId;

    /**
     * 操作类型
     */
    private String type;

    /**
     * 提交时间
     */
    private String submittedOn;

    /**
     * 完成时间
     */
    private String completedOn;

    /**
     * 状态
     */
    private String status;

    /**
     * 进行中
     */
    private int inProgress;

    /**
     * 成功状态
     */
    private int success;

    /**
     * 错误
     */
    private int failed;

    /**
     * 订阅ID
     */
    private String subscriberId;

    /**
     * 信息
     */
    private String message;
}
