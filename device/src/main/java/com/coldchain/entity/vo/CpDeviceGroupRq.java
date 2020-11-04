package com.coldchain.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.util.Date;

/**
 * (CpDeviceGroup)实体类
 *
 * @author chenqingshan
 * @since 2020-10-10 11:48:49
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("设备分组")
public class CpDeviceGroupRq {

    /**
    * 主键
    */
    @ApiModelProperty("设备分组ID")
    private String id;

    /**
    * 分组名称
    */
    @ApiModelProperty("分组名称")
    private String groupName;
    /**
    * 所属企业ID
    */
    @ApiModelProperty("所属企业ID")
    private String groupCompany;
    /**
    * 所属用户ID
    */
    @ApiModelProperty("所属用户ID")
    private String groupUser;
    /**
    * 备注
    */
    @ApiModelProperty("备注")
    private String remark;
    /**
    * 创建时间
    */
    private Date createDate;
    /**
    * 创建者
    */
    private String createBy;
    /**
    * 修改时间
    */
    private Date updateDate;
    /**
    * 修改者
    */
    private String updateBy;




}