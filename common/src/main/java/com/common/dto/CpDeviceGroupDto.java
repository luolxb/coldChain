package com.common.dto;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * (CpDeviceGroup)实体类
 *
 * @author chenqingshan
 * @since 2020-10-10 11:48:49
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CpDeviceGroupDto {

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
    @ApiModelProperty("所属用户ID")
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

    /**
     * 设备数组
     */
    private List<CpDeviceDto> deviceDtoList;



}