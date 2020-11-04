package com.coldchain.project.business.company.vo;

import lombok.Data;

/**
 * 设备使用产生流量
 */
@Data
public class UsageFlowVo {

    /**
     * 设备ID
     */
    private String subscriberId;

    /**
     * 使用流量
     */
    private Double usageFlow;

}
