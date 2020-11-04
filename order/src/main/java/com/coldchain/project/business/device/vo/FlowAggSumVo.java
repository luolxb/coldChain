package com.coldchain.project.business.device.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 流量统计累计
 */
@Data
public class FlowAggSumVo {

    /**
     * 设备ID
     */
    private String subscriberId;

    /**
     * 服务商
     */
    private String carrier;

    /**
     * 账号ID
     */
    private String account;

    /**
     * 子账号ID
     */
    private String subaccount;

    /**
     * 价格计划
     */
    private String pricePlan;

    /**
     * sms发送数据流量
     * 累计 sum
     */
    private Long smsMo;

    /**
     * sms接受数据流量
     * 累计 sum
     */
    private Long smsMt;

    /**
     * data发送数据流量
     * 累计 sum
     */
    private Long dataMo;

    /**
     * data接受数据流量
     * 累计 sum
     */
    private Long dataMt;

    /**
     * data发送和接受数据流量
     * 累计 sum
     */
    private Long dataBoth;

    /**
     * voice发送数据流量
     * 累计 sum
     */
    private Long voiceMo;

    /**
     * voice接受数据流量
     * 累计 sum
     */
    private Long voiceMt;

    /**
     * orbcomm报告数据流量
     * 累计 sum
     */
    private Long orbcommReports;

    /**
     * orbcomm消息数据流量
     * 累计 sum
     */
    private Long orbcommMessages;

    /**
     * orbcomm数据流量
     * 累计 sum
     */
    private Long orbcommBytes;

    /**
     * 统计时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss 'GMT'")
    private Date statisticsTime;


    /**
     * 物联网卡数据
     */
    private String cardDataUsage;
    private String cardCarrier;
    private String cardDataPlan;
    private String cardIccid;
    private String cardActive;
    private String cardActiveDate;

}
