package com.coldchain.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel("报警记录")
public class AlarmRecordVo {

    @ApiModelProperty("触发器数据ID")
    private String triggerDataId;

    @ApiModelProperty("触发器ID")
    private String triggerId;

    @ApiModelProperty("设备名称")
    private String deviceName;

    @ApiModelProperty("设备ID")
    private String deviceId;

    @ApiModelProperty("传感器名称")
    private String sensorName;

    @ApiModelProperty("传感器ID")
    private String sensorId;

    @ApiModelProperty("报警内容")
    private String triggerContent;

    @ApiModelProperty("报警方式")
    private String type;

    @ApiModelProperty("消息发送结果")
    private String msgSendResult;

    @ApiModelProperty("邮箱")
    private String triggerEmail;

    @ApiModelProperty("电话")
    private String triggerMobile;

    @ApiModelProperty("微信")
    private String triggerWechat;

    @ApiModelProperty("报警时间")
    private Date trggerDate;


}
