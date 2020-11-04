package com.coldchain.entity.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.util.Date;

/**
 * 设备类型表(CpDeviceType)实体类
 *
 * @author chenqingshan
 * @since 2020-10-10 11:49:13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("设备类型表(CpDeviceType)实体类")
public class CpDeviceTypeRq {

    /**
    * 主键ID
    */
    @ApiModelProperty("主键ID")
    private String id;
    /**
    * 设备厂商
    */
    @NotBlank(message = "设备厂商不能为空")
    @ApiModelProperty("设备厂商")
    private String deviceFirm;
    /**
     * 设备类型名称
     */
    @NotBlank(message = "设备类型名称不能为空")
    @ApiModelProperty("设备类型名称")
    private String deviceTypeName;
    /**
    * 设备品牌
    */
    @NotBlank(message = "设备品牌不能为空")
    @ApiModelProperty("设备品牌")
    private String deviceBrand;
    /**
    * 备注
    */
    @ApiModelProperty("备注")
    private String remark;
    /**
    * 创建时间
    */
    @ApiModelProperty("创建时间")
    private Date createDate;
    /**
    * 创建人
    */
    @ApiModelProperty("创建人")
    private String createBy;
    /**
    * 修改时间
    */
    @ApiModelProperty("修改时间")
    private Date updateDate;
    /**
    * 修改人
    */
    @ApiModelProperty("修改人")
    private String updateBy;

    /**
     * 0：启用，1禁用
     */
    private Integer status;
    /**
     * 设备企业
     */
    private String deviceCompany;




}