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

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("nts_user_product_order")
public class NtsUserProductOrder {

    /**
     * 主键 购买产品ID
     */
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;
    /**
     * 产品版本ID
     */
    private Long productId;
    /**
     * 用户ID
     */
    private Integer userId;
    /**
     * 购买时间
     */
    private Date buyTime;
    /**
     * 购买金额
     */
    private BigDecimal buyPrice;
    /**
     * 生效时间
     */
    private Date startTime;
    /**
     * 过期时间
     */
    private Date expiredTime;
    /**
     * 是否过期
     */
    private String isExpired;
    /**
     * 产品原价
     */
    private BigDecimal originalPrice;

    private Date createTime;
    private String createBy;
    private Date updateTime;
    private String updateBy;
    /**
     * 订单code
     */
    private String productOrderCode;
    /**
     * 有效时间
     */
    private Integer effectiveTime;
    /**
     * 支付方式
     */
    private String payType;
    /**
     * 支付方式 0:未支付，1已支付，2支付失败，3取消支付
     */
    private Integer payStatus;

    /**
     * 订单内容
     */
    private String productOrderContent;

    /**
     * 设备服务数
     */
    private Integer deviceServerNum;
}
