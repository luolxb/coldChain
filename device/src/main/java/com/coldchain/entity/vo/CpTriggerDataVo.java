package com.coldchain.entity.vo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 触发器报警记录实体类
 *
 * @author chenqingshan
 * @since 2020-10-13 11:16:27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("触发器报警记录实体类")
public class CpTriggerDataVo {

    /**
    * 主键ID
    */
    @ApiModelProperty("触发器报警记录id")
    private String id;
    /**
    * 触发器主键ID
    */
    @ApiModelProperty("触发器主键id")
    private String triggerId;
    /**
    * 设备主键ID
    */
    @ApiModelProperty("设备主键id")
    private String deviceId;
    /**
    * 传感器主键ID
    */
    @ApiModelProperty("传感器主键id")
    private String sensorId;
    /**
    * 传感器名称
    */
    @ApiModelProperty("传感器名称")
    private String sensorName;
    /**
    * 消息发送状态 0 正常 1失败
    */
    @ApiModelProperty("消息发送状态 0 正常 1失败")
    private Integer smgStatus;

    /**
     * 消息发送结果
     */
    @ApiModelProperty("消息发送结果")
    private String msgSendResult;

    /**
    * 触发内容
    */
    @ApiModelProperty("触发内容")
    private String triggerContent;
    /**
    * 触发时间
    */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty("触发时间")
    private Date trggerDate;
    /**
    * 触发值
    */
    @ApiModelProperty("触发值")
    private String triggerVal;
    /**
    * 报警消息接收人邮箱
    */
    @ApiModelProperty("报警消息接收人邮箱")
    private String triggerEmail;
    /**
    * 报警消息接收人电话
    */
    @ApiModelProperty("报警消息接收人电话")
    private String triggerMobile;
    /**
    * 报警消息接收人微信
    */
    @ApiModelProperty("报警消息接收人微信")
    private String triggerWechat;
    /**
    * 用户ID
    */
    @ApiModelProperty("用户ID")
    private String userId;
    /**
    * 创建时间
    */
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    @ApiModelProperty("创建时间")
    private Date createDate;



}