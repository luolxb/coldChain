package com.coldchain.entity.vo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel(value = "触发器参数")
@AllArgsConstructor
@NoArgsConstructor
public class TriggerVo {

    /**
     * 主键ID
     */

    private String id;


    /**
     * 设备主键ID
     */
    @ApiModelProperty(name = "localDeviceId",dataType = "String",required = false,value = "设备主键ID")
    @JsonProperty("localDeviceId")
    private String localDeviceId;
    /**
     * 传感器ID
     */
    @ApiModelProperty(name = "localSensorId",dataType = "String",required = false,value = "传感器ID")
    @JsonProperty("localSensorId")
    private String localSensorId;
    /**
     * 第三方平台设备ID
     */
    @ApiModelProperty(name = "deviceId",dataType = "Long",required = false,value = "第三方平台设备ID")
    @JsonProperty("deviceId")
    private Long deviceId;
    /**
     * 第三方平台传感器ID
     */
    @ApiModelProperty(name = "sensorId",dataType = "Long",required = false,value = "第三方平台传感器ID")
    @JsonProperty("sensorId")
    private Long sensorId;
    /**
     * 第三方平台用户ID
     */
    @JsonProperty("userId")
    private Long userId;

    /**
     * 触发器类型 取值范围 1-15 分别表示,1数值高于X、2数值低于Y、3数值高于X低于Y、4数值高于X低于Y超过M分钟、5数值高于X报警低于Y恢复、6数值低于X报警高于Y恢复、7数值在X和Y之间、8数值超过M分钟高于X、9数值超过M分钟低于Y、10传感器未连接、11超过M分钟未连接、12开关ON、13开关OFF、14数值等于X、15数值不等于X 必选参数
     */

    @ApiModelProperty(name = "alarmType",dataType = "Integer",required = false,value = "触发器类型 取值范围 1-15 分别表示,1数值高于X、2数值低于Y、3数值高于X低于Y、4数值高于X低于Y超过M分钟、5数值高于X报警低于Y恢复、6数值低于X报警高于Y恢复、7数值在X和Y之间、8数值超过M分钟高于X、9数值超过M分钟低于Y、10传感器未连接、11超过M分钟未连接、12开关ON、13开关OFF、14数值等于X、15数值不等于X 必选参数")
    @JsonProperty("alarmType")
    private Integer alarmType;
    /**
     * 警戒值高值（X值） 可选参数，根据alarmType触发器类型填写
     */
    @ApiModelProperty(name = "heightValue",dataType = "Integer",required = false,value = "警戒值高值（X值） 可选参数，根据alarmType触发器类型填写")
    @JsonProperty("heightValue")
    private Integer heightValue;
    /**
     * 警戒值低值（Y值）可选参数，根据alarmType触发器类型填写
     */
    @ApiModelProperty(name = "belowValue",dataType = "Integer",required = false,value = "警戒值低值（Y值）可选参数，根据alarmType触发器类型填写")
    @JsonProperty("belowValue")
    private Integer belowValue;
    /**
     * 时间临界点（M值）单位分钟可选参数，根据alarmType触发器类型填写
     */
    @ApiModelProperty(name = "duration",dataType = "Integer",required = false,value = "时间临界点（M值）单位分钟可选参数，根据alarmType触发器类型填写")
    @JsonProperty("duration")
    private Integer duration;
    /**
     * 接收报警的方式 取值范围 1-4 分别表示1微信、2邮箱、3短信、4语音拨号
     */
    @ApiModelProperty(name = "targetModel",dataType = "Integer",required = false,value = "接收报警的方式 取值范围 1-4 分别表示1微信、2邮箱、3短信、4语音拨号")
    @JsonProperty("targetModel")
    private Integer targetModel;
    /**
     * 报警接收人，多个接收人已英文","分隔，微信报警时填写关注或绑定公众号的openId,邮箱报警时填写邮箱，短信语音拨号填写手机号码
     */
    @ApiModelProperty(name = "contacts",dataType = "String",required = false,value = "报警接收人，多个接收人已英文,分隔")
    @JsonProperty("contacts")
    private String contacts;
    /**
     * 是否转发 取值范围 0-1 0表示不转发，1表示转发 必选参数
     */
    @ApiModelProperty(name = "isForward",dataType = "Integer",required = false,value = "是否转发 取值范围 0-1 0表示不转发，1表示转发 必选参数",example = "0")
    @JsonProperty("isForward")
    private Integer isForward;
    /**
     * 转发时接收数据的第三方平台设备Id
     */
    @ApiModelProperty(name = "forwardDeviceId",dataType = "String",required = false,value = "转发时接收数据的第三方平台设备Id",example = "")
    @JsonProperty("forwardDeviceId")
    private String forwardDeviceId;
    /**
     * 转发时接收数据的第三方平台传感器Id
     */
    @ApiModelProperty(name = "forwardSensorId",dataType = "String",required = false,value = "转发时接收数据的第三方平台传感器Id",example = "")
    @JsonProperty("forwardSensorId")
    private String forwardSensorId;
    /**
     * 转发的数据类型 取值范围 1-2 1表示字符串 2表示十六进制
     */
    @ApiModelProperty(name = "forwardDataType",dataType = "String",required = false,value = "转发的数据类型 取值范围 1-2 1表示字符串 2表示十六进制",example = "")
    @JsonProperty("forwardDataType")
    private String forwardDataType;
    /**
     * 转发的数值
     */
    @ApiModelProperty(name = "forwardValue",dataType = "String",required = false,value = "转发的数值",example = "")
    @JsonProperty("forwardValue")
    private String forwardValue;

    /**
     * 提示信息
     */
    @ApiModelProperty(name = "tipMsg",dataType = "String",required = false,value = "提示信息",example = "")
    @JsonProperty("tipMsg")
    private String  tipMsg;
    /**
     * 开启状态 1:开启，0:关闭
     */
    @ApiModelProperty(name = "status",dataType = "Integer",required = false,value = "开启状态 1:开启，0:关闭",example = "0")
    @JsonProperty("status")
    private Integer status;

    private String ForwardLinkType;


}
