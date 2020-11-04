package com.coldchain.entity.vo;


import lombok.Data;

@Data
public class LinkAlarmDto {
    /**
     * 第三方平台设备ID
     */
    private Long deviceId;
    /**
     * 第三方平台传感器ID
     */
    private Long sensorId;
    /**
     * 第三方平台用户ID
     */
    private Long userId;

    /**
     * 触发器类型 取值范围 1-15 分别表示,1数值高于X、2数值低于Y、3数值高于X低于Y、4数值高于X低于Y超过M分钟、5数值高于X报警低于Y恢复、6数值低于X报警高于Y恢复、7数值在X和Y之间、8数值超过M分钟高于X、9数值超过M分钟低于Y、10传感器未连接、11超过M分钟未连接、12开关ON、13开关OFF、14数值等于X、15数值不等于X 必选参数
     */
    private Integer alarmType;
    /**
     * 警戒值高值（X值） 可选参数，根据alarmType触发器类型填写
     */
    private Integer heightValue;
    /**
     * 警戒值低值（Y值）可选参数，根据alarmType触发器类型填写
     */
    private Integer belowValue;
    /**
     * 时间临界点（M值）单位分钟可选参数，根据alarmType触发器类型填写
     */
    private Integer duration;
    /**
     * 接收报警的方式 取值范围 1-4 分别表示1微信、2邮箱、3短信、4语音拨号
     */
    private Integer targetModel;
    /**
     * 报警接收人，多个接收人已英文","分隔，微信报警时填写关注或绑定公众号的openId,邮箱报警时填写邮箱，短信语音拨号填写手机号码
     */
    private String contacts;
    /**
     * 是否转发 取值范围 0-1 0表示不转发，1表示转发 必选参数
     */
    private Integer isForward;

    /**
     * 提示信息
     */
    private String  tipMsg;
}
