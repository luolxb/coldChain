package com.coldchain.entity.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.math.BigDecimal;

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
@ApiModel("用户收货地址")
public class UserAddressRq implements Serializable {

    private static final long serialVersionUID = 1L;


    @ApiModelProperty("收货地址ID")
    @TableId(value = "address_id", type = IdType.AUTO)
    private Integer addressId;

    @ApiModelProperty("所属用户ID")
    private Integer userId;

    /**
     * 收货人
     */
    @NotBlank(message = "收货人不能为空")
    @ApiModelProperty("收货人")
    private String consignee;

    /**
     * 邮箱地址
     */
    @NotBlank(message = "邮箱地址不能为空")
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
    @NotBlank(message = "省份不能为空")
    @ApiModelProperty("省份")
    private String province;

    /**
     * 城市
     */
    @NotBlank(message = "城市不能为空")
    @ApiModelProperty("城市")
    private String city;

    /**
     * 地区
     */
    @NotBlank(message = "地区不能为空")
    @ApiModelProperty("地区")
    private String district;

    /**
     * 乡镇
     */
    @NotBlank(message = "乡镇不能为空")
    @ApiModelProperty("乡镇")
    private String twon;

    /**
     * 地址
     */
    @NotBlank(message = "地址不能为空")
    @ApiModelProperty("地址")
    private String address;

    /**
     * 邮政编码
     */
    @NotBlank(message = "邮政编码不能为空")
    @ApiModelProperty("邮政编码")
    private String zipcode;

    /**
     * 手机
     */
    @NotBlank(message = "手机不能为空")
    @ApiModelProperty("手机")
    private String mobile;

    /**
     * 默认收货地址
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
