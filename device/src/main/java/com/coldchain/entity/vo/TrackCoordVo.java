package com.coldchain.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 轨迹坐标实体类
 *
 * @author chenqingshan
 * @since 2020-10-14 15:15:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("设备数量统计实体类")
public class TrackCoordVo {

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
    @ApiModelProperty("数据更新的时间")
    private Date updateDate;
}
