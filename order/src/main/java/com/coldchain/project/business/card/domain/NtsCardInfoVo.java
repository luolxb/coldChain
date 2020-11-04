package com.coldchain.project.business.card.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @PackageName: com.coldchain.project.business.card
 * @program: nts
 * @author: ruosen
 * @create: 2020-04-13 16:34
 **/

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class NtsCardInfoVo {



    private Integer id;
    private String msisdn;
    private String iccId;
    private String imsi;
    /**
     * 运营商
     */
    private String carrier;
    /**
     * 短信端口号
     */
    private String spCode;
    /**
     * 套餐大小
     */
    private String dataPlan;
    /**
     * 计费结束日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date expiryDate;
    /**
     * 当月流量
     */
    private String dataUsage;
    /**
     * 卡状态： 00 - 正使用, 10 - 测试期, 02 - 停机 03 - 预销号, 04 - 销号, 11 - 沉默期 12 - 停机保号, 99 - 未知
     */
    private String accountStatus;
    /**
     * 激活/未激活
     */
    private Integer active;
    /**
     * 测试期起始日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date testValidDate;
    /**
     * 沉默期起始日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date silentValidDate;
    /**
     * 出库日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date outboundDate;
    /**
     * 激活日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date activeDate;
    /**
     * 是否支持短信
     */
    private Integer supportSms;
    /**
     * 剩余流量
     */
    private String dataBalance;
    /**
     * 测试期已用流量
     */
    private String testUsedDataUsage;

    /**
     * 企业ID
     */
    private Long companyId;

    /**
     * 设备id
     */
    private Long deviceId;
    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 更新时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    /**
     * 备注
     */
    @JsonIgnore
    private String remark;

}
