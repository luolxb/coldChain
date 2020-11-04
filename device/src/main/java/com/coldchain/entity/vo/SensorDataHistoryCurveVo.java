package com.coldchain.entity.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("传感器数据历史曲线")
public class SensorDataHistoryCurveVo {
    /**
     * 第三方平台传感器ID
     */
    @ApiModelProperty("第三方平台传感器ID")
    private Integer sensorId;
    /**
     * 数值单位
     */
    @ApiModelProperty("数值单位")
    private String unit;
    /**
     * 数值
     */
    @ApiModelProperty("数值")
    private String value;

    /**
     * 经度
     */
    @ApiModelProperty("经度")
    private String lat;
    /**
     * 纬度
     */
    @ApiModelProperty("纬度")
    private String lng;
    /**
     * 数据更新的时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty("数据更新的时间")
    private Date updateDate;
}
