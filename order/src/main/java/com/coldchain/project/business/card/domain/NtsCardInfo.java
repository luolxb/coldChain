package com.coldchain.project.business.card.domain;

import com.coldchain.framework.web.domain.BaseEntity;
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
public class NtsCardInfo extends BaseEntity {

    private static final long serialVersionUID = 1L;


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
    private Date testValidDate;
    /**
     * 沉默期起始日期
     */
    private Date silentValidDate;
    /**
     * 出库日期
     */
    private Date outboundDate;
    /**
     * 激活日期
     */
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


}
