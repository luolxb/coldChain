package com.coldchain.entity.vo;


import com.common.dto.CpDeviceDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("项目请求实体类")
public class NtsProjectRq {

    @ApiModelProperty("项目id")
    private Long id;
    /**
     * 项目名称
     */
    @NotBlank(message = "项目名称不能为空")
    @Size(max = 16, message = "项目名称长度不符合要求")
    @ApiModelProperty("项目名称")
    private String projectName;
    /**
     * 项目地址
     */
    @NotBlank(message = "项目地址不能为空")
    @Size(max = 32, message = "项目地址长度不符合要求")
    @ApiModelProperty("项目地址")
    private String projectAddress;
    /**
     * 项目类型
     */
    @NotBlank(message = "项目类型不能为空")
    @Size(max = 16, message = "项目类型长度不符合要求")
    @ApiModelProperty("项目类型")
    private String projectType;

    /**
     * 备注
     */
    @ApiModelProperty("备注")
    private String remark;

    /**
     * 设备list
     */
    @ApiModelProperty("设备list")
    private List<CpDeviceDto> deviceList;

}
