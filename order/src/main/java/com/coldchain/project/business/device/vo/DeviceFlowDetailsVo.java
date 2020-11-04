package com.coldchain.project.business.device.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 设备流量日志统计对象
 */
@Data
public class DeviceFlowDetailsVo {

    /**
     * 编号
     */
    private Long deviceFlowDetailsId;

    /**
     * 公司
     */
    private String company;

    /**
     * 设备SN
     */
    private String deviceSn;

    /**
     * 设备类型
     */
    private String deviceType;

    /**
     * 激活状态：0-未激活 1-已激活 2-暂停 3-启用 4-禁用
     */
    private Integer activate;

    /**
     * 激活时间
     */
    private Date activateTime;

    /**
     * 运营商
     */
    private String carrier;

    /**
     * sms发送数据流量
     */
    private Long smsMo;

    /**
     * sms接受数据流量
     */
    private Long smsMt;

    /**
     * data发送数据流量
     */
    private Long dataMo;

    /**
     * data接受数据流量
     */
    private Long dataMt;

    /**
     * data发送和接受数据流量
     */
    private Long dataBoth;

    /**
     * voice发送数据流量
     */
    private Long voiceMo;

    /**
     * voice接受数据流量
     */
    private Long voiceMt;

    /**
     * orbcomm报告数据流量
     */
    private Long orbcommReports;

    /**
     * orbcomm消息数据流量
     */
    private Long orbcommMessages;

    /**
     * orbcomm数据流量
     */
    private Long orbcommBytes;

    /**
     * 使用时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss 'GMT'")
    private Date usageTime;

    /**
     * 导入时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss 'GMT'")
    private Date importTime;
}
