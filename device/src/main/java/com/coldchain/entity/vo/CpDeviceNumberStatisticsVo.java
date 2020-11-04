package com.coldchain.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 设备表(CpDevice)设备数量统计实体类
 *
 * @author chenqingshan
 * @since 2020-10-14 11:39:41
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("设备数量统计实体类")
public class CpDeviceNumberStatisticsVo {

    /**
     * 设备总数
     */
    @ApiModelProperty("设备总数")
    private Integer deviceTotal;

    /**
     * 在线设备总数
     */
    @ApiModelProperty("在线设备总数")
    private Integer isLineDeviceTotal;

    /**
     * 离线设备总数
     */
    @ApiModelProperty("离线设备总数")
    private Integer isNotLineDeviceTotal;

    /**
     * 报警设备总数
     */
    @ApiModelProperty("报警设备总数")
    private Integer isAlarmsDeviceTotal;
}
