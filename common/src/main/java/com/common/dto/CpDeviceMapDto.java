package com.common.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 设备表(CpDevice)实体类
 *
 * @author chenqingshan
 * @since 2020-10-10 11:39:41
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("设备mapdto")
public class CpDeviceMapDto implements Serializable {

    @ApiModelProperty("全部设备数组")
    private List<CpDeviceDto> allDeviceList;
    @ApiModelProperty("在线设备")
    private List<CpDeviceDto> inLineDeviceList;
    @ApiModelProperty("离线设备")
    private List<CpDeviceDto> offDeviceList;

}