package com.coldchain.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 设备数据下载实体类
 * @author Administrator
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("设备数据下载")
public class DeviceDataDownVo {

    /**
     * 表主键ID
     */
    @ApiModelProperty("设备数据下载ID")
    private Long deviceDataDownId;

    /**
     * 设备ID
     */
    @ApiModelProperty("设备ID")
    private Long deviceId;

    @ApiModelProperty("设备图片")
    private String deviceImage;

    @ApiModelProperty("设备名称")
    private String deviceName;
    /**
     * 开始下载时间
     */
    @ApiModelProperty("开始下载时间")
    private Date downStart;
    /**
     * 结束下载时间
     */
    @ApiModelProperty("结束下载时间")
    private Date downEnd;
    /**
     * 接收方式
     */
    @ApiModelProperty("接收方式")
    private String receivingMethod;
    /**
     * 下载状态：0：待生成；1：已生成；2：生成失败
     */
    @ApiModelProperty("下载状态：0：待生成；1：已生成；2：生成失败")
    private Integer downStatus;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("下载地址")
    private String path;





}
