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
@TableName("nts_product_version")
public class NtsProductVersion {

    /**
     * 主键ID 产品ID
     */
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 产品内容
     */
    private String productContent;

    /**
     * 产品价格
     */
    private BigDecimal productPrice;

    /**
     * 产品原价
     */
    private BigDecimal originalPrice;

    private Date createTime;
    private String createBy;
    private String updateBy;
    private Date updateTime;

    /**
     * 设备服务数
     */
    private Integer deviceServerNum;
    /**
     * 有效时间
     */
    private Integer effectiveTime;
}
