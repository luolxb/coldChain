package com.common.dto;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("项目表现实体类")
public class NtsProjectDto {

    @ApiModelProperty("项目id")
    private Long id;
    /**
     * 项目名称
     */
    @ApiModelProperty("项目名称")
    private String projectName;
    /**
     * 项目地址
     */
    @ApiModelProperty("项目地址")
    private String projectAddress;

    @ApiModelProperty("图片地址")
    private String image;

    /**
     * 项目类型
     */
    @ApiModelProperty("项目类型")
    private String projectType;

    /**
     * 备注
     */
    @ApiModelProperty("备注")
    private String remark;

    private Date createTime;
    private String createBy;
    private Date updateTime;
    private String updateBy;

    @ApiModelProperty("用户ID")
    private Integer userId;

    /**
     * 设备分组
     */
    @ApiModelProperty("设备")
    private Page<CpDeviceDto> deviceList;

    /**
     * 设备分组
     */
    @ApiModelProperty("设备分组")
    private Page<CpDeviceGroupDto> deviceGroupDtoPage;

}
