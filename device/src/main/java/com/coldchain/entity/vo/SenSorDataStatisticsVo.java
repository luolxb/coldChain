package com.coldchain.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 传感器数据统计实体类
 *
 * @author chenqingshan
 * @since 2020-10-10 11:49:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("传感器数据统计实体类")
public class SenSorDataStatisticsVo implements Serializable {

    @ApiModelProperty("最大值")
    private String maxVal;

    @ApiModelProperty("最小值")
    private String minVal;

    @ApiModelProperty("平均值")
    private String avgVal;

    @ApiModelProperty("差值")
    private String difVal;

}
