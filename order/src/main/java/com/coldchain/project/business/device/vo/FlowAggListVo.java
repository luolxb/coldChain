package com.coldchain.project.business.device.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 设备流量列表
 */
@Data
public class FlowAggListVo {

    /**
     * 企业名称
     */
    private String companyAlias;

    /**
     * 设备名称
     */
    private String deviceName;

    /**
     * 设备类型
     */
    private String deviceType;

    /**
     * 设备SN
     */
    private String deviceSn;

    /**
     * 服务商
     */
    private String carrier;

    /**
     * 价格计划
     */
    private String pricePlan;

    /**
     * 卫星模块：1-OGI 2-OG2
     */
    private Integer satelliteModule;

    /**
     * 卫星模块SN
     */
    private String satelliteSn;

    /**
     * 卫星流量
     */
    private Long satelliteData;

    /**
     * SIM运营商：中国电信
     */
    private String simOperator;

    /**
     * SIM唯一SN
     */
    private String simSn;

    /**
     * SIM流量
     */
    private Long simData;

    /**
     * 时区
     */
    private String timeZone;

    /**
     * 统计时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss 'GMT'")
    private Date statisticsTime;
}
