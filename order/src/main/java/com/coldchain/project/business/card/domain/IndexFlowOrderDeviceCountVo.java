package com.coldchain.project.business.card.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @PackageName: com.coldchain.project.business.card.domain
 * @program: nts
 * @author: ruosen
 * @create: 2020-04-15 19:02
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class IndexFlowOrderDeviceCountVo {

    /**
     * 卫星剩余流量
     */
    private String surplusFlowSat;
    /**
     * 卫星使用流量
     */
    private String usedFlowSat;
    /**
     * 4G剩余流量
     */
    private String surplusFlow4G;
    /**
     * 4G使用流量
     */
    private String usedFlow4G;
    /**
     * 本月流量订单
     */
    private String monthOrder;
    /**
     * 本年流量订单
     */
    private String yearOrder;
    /**
     * 卫星激活
     */
    private String activateSat;
    /**
     * 卫星总数
     */
    private String allDeviceSat;
    /**
     * 4G激活
     */
    private String activate4G;
    /**
     * 4G总数
     */
    private String allDevice4G;
}
