package com.coldchain.entity;

import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author dyr
 * @since 2019-11-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("user_address")
@ApiModel("用户收货地址")
public class UserAddress implements Serializable {

    private static final long serialVersionUID = 1L;


    @ApiModelProperty("收货地址ID")
    @TableId(value = "address_id", type = IdType.AUTO)
    private Integer addressId;

    @ApiModelProperty("所属用户ID")
    private Integer userId;

    /**
     * 收货人
     */
    @ApiModelProperty("收货人")
    private String consignee;

    /**
     * 邮箱地址
     */
    @ApiModelProperty("邮箱地址")
    private String email;

    /**
     * 国家
     */
    @ApiModelProperty("国家")
    private String country;

    /**
     * 省份
     */
    @ApiModelProperty("省份")
    private String province;

    /**
     * 城市
     */
    @ApiModelProperty("城市")
    private String city;

    /**
     * 地区
     */
    @ApiModelProperty("地区")
    private String district;

    /**
     * 乡镇
     */
    @ApiModelProperty("乡镇")
    private String twon;

    /**
     * 地址
     */
    @ApiModelProperty("地址")
    private String address;

    /**
     * 邮政编码
     */
    @ApiModelProperty("邮政编码")
    private String zipcode;

    /**
     * 手机
     */
    @ApiModelProperty("手机")
    private String mobile;

    /**
     * 默认收货地址 1:默认收货地址
     */
    @ApiModelProperty("默认收货地址")
    private Integer isDefault;

    /**
     * 地址经度
     */
    @ApiModelProperty("地址经度")
    private BigDecimal longitude;

    /**
     * 地址纬度
     */
    @ApiModelProperty("地址纬度")
    private BigDecimal latitude;


}
