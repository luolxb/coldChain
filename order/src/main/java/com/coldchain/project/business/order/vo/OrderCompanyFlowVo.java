package com.coldchain.project.business.order.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 企业流量订单
 */
@Data
public class OrderCompanyFlowVo {

    /**
     * 编号
     */
    private Long orderId;

    /**
     * 订单编号
     */
    private String orderCode;

    /**
     * 订单状态 0-待付款 1-处理中 2-已完成 3-取消 4-售后 5-付款失败
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
    private Double flowNumber;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 企业名称
     */
    private String companyName;

    /**
     * 企业地址
     */
    private String companyAddress;

    /**
     * 企业主账户
     */
    private String companyAccount;

    /**
     * 支付时间
     */
    private Date payTime;

}
