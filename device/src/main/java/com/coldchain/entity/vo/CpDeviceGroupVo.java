package com.coldchain.entity.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.common.dto.CpDeviceDto;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
@ApiModel("设备分组")
public class CpDeviceGroupVo {

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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")
    private Date createDate;
    /**
    * 创建者
    */
    private String createBy;
    /**
    * 修改时间
    */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")
    private Date updateDate;
    /**
    * 修改者
    */
    private String updateBy;
    @ApiModelProperty("设备数组")
    private List<CpDeviceDto> deviceList;




}