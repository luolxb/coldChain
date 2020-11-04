package com.coldchain.project.business.order.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 设备流量订单
 */
@Data
public class OrderDeviceFlowVo {

    /**
     * 编号
     */
    private Long orderId;

    /**
     * 订单编号
     */
    private String orderCode;

    /**
     * 设备SN
     */
    private String deviceSn;

    /**
     * 设备名称
     */
    private String deviceName;

    /**
     * 设备类型
     */
    private String deviceType;

    /**
     * 服务商
     */
    private String carrier;

    /**
     * 订单状态 0-待付款 1-处理中 2-已完成 3-取消 4-售后
     */
    private Integer orderStatus;

    /**
     * 实际需要支付的金额
     */
    private BigDecimal actualPrice;

    /**
     * 套餐名称
     */
    private String plansName;

    /**
     * 流量数量 单位：kb
     */
    private Long flowNumber;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}
