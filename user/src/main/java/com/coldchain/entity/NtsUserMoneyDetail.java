package com.coldchain.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 用户余额详情
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("nts_user_money_detail")
public class NtsUserMoneyDetail {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户ID
     */
    private Integer userId;
    /**
     * 创建人
     */
    private String createBy;
    /**
     * 交易时间、创建时间
     */
    private Date createTime;

    /**
     * 购买时间
     */
    private Date buyTime;
    /**
     * 交易类型
     */
    private String tType;
    /**
     * 交易金额
     */
    private BigDecimal tPrice;
    /**
     * 备注
     */
    private String remark;

    private Date updateTime;
    private String updateBy;
    /**
     * 交易编号
     */
    private String tUserMoneyCode;

    /**
     * 0：充值待支付，1：充值已支付，2：充值取消支付，3：充值支付失败，4：购买待支付，5购买已支付，6购买取消支付，7购买支付失败
     */
    private Integer tStatus;
}
