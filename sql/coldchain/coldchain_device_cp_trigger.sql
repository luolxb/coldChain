create table cp_trigger
(
    id                varchar(64)      not null comment '主键ID'
        primary key,
    device_id         varchar(64)      null comment '设备主键ID',
    sensor_id         varchar(64)      null comment '传感器主键ID',
    link_user_id      bigint(11)       null comment '第三方平台用户ID',
    link_device_id    bigint(11)       null comment '第三方平台设备ID',
    link_sensor_id    bigint(11)       null comment '第三方平台传感器ID',
    alarm_type        int(2)           null comment '触发器类型 取值范围 1-15 分别表示,1数值高于X、2数值低于Y、3数值高于X低于Y、4数值高于X低于Y超过M分钟、5数值高于X报警低于Y恢复、6数值低于X报警高于Y恢复、7数值在X和Y之间、8数值超过M分钟高于X、9数值超过M分钟低于Y、10传感器未连接、11超过M分钟未连接、12开关ON、13开关OFF、14数值等于X、15数值不等于X 必选参数',
    height_value      int(8)           null comment '警戒值高值（X值） 可选参数，根据alarmType触发器类型填写',
    below_value       int(8)           null comment '警戒值低值（Y值）可选参数，根据alarmType触发器类型填写',
    duration          int(8)           null comment '时间临界点（M值）单位分钟可选参数，根据alarmType触发器类型填写',
    target_model      int(1)           null comment '接收报警的方式 取值范围 1-4 分别表示1微信、2邮箱、3短信、4语音拨号',
    contacts          varchar(500)     null comment '报警接收人，多个接收人已英文","分隔，微信报警时填写关注或绑定公众号的openId,邮箱报警时填写邮箱，短信语音拨号填写手机号码',
    is_forward        int(1)           null comment '是否转发 取值范围 0-1 0表示不转发，1表示转发 必选参数',
    forward_device_id varchar(64)      null comment '转发时接收数据的第三方平台设备Id',
    forward_sensor_id varchar(64)      null comment '转发时接收数据的第三方平台传感器Id',
    forward_data_type varchar(255)     null comment '转发的数据类型 取值范围 1-2 1表示字符串 2表示十六进制',
    forward_value     varchar(255)     null comment '转发的数值',
    tip_msg           varchar(500)     null comment '提示信息',
    status            int(1) default 1 null comment '开启状态 1:开启，0:关闭',
    create_date       datetime         null comment '创建时间',
    create_by         varchar(64)      null comment '创建者',
    update_daate      datetime         null comment '修改时间',
    update_by         varchar(64)      null comment '修改者',
    forward_link_type varchar(255)     null
)
    comment '触发器表';

INSERT INTO coldchain_device.cp_trigger (id, device_id, sensor_id, link_user_id, link_device_id, link_sensor_id, alarm_type, height_value, below_value, duration, target_model, contacts, is_forward, forward_device_id, forward_sensor_id, forward_data_type, forward_value, tip_msg, status, create_date, create_by, update_daate, update_by, forward_link_type) VALUES ('61866', null, null, 49139, 80345, 922090, 1, 25, null, null, 1, '陈林（Iot-PM）|o7lb-wznhMu0dut2hiKrPeQvpKds,', 0, '', '', '', '', '', null, null, null, null, null, null);
INSERT INTO coldchain_device.cp_trigger (id, device_id, sensor_id, link_user_id, link_device_id, link_sensor_id, alarm_type, height_value, below_value, duration, target_model, contacts, is_forward, forward_device_id, forward_sensor_id, forward_data_type, forward_value, tip_msg, status, create_date, create_by, update_daate, update_by, forward_link_type) VALUES ('61867', null, null, 49139, 80345, 922090, 1, 25, null, null, 1, '陈林（Iot-PM）|o7lb-wznhMu0dut2hiKrPeQvpKds,', 0, '', '', '', '', '', null, null, null, null, null, null);
INSERT INTO coldchain_device.cp_trigger (id, device_id, sensor_id, link_user_id, link_device_id, link_sensor_id, alarm_type, height_value, below_value, duration, target_model, contacts, is_forward, forward_device_id, forward_sensor_id, forward_data_type, forward_value, tip_msg, status, create_date, create_by, update_daate, update_by, forward_link_type) VALUES ('61868', null, null, 49139, 80345, 922090, 1, 25, null, null, 3, '陈林|15889781738,', 0, '', '', '', '', '', null, null, null, null, null, null);
INSERT INTO coldchain_device.cp_trigger (id, device_id, sensor_id, link_user_id, link_device_id, link_sensor_id, alarm_type, height_value, below_value, duration, target_model, contacts, is_forward, forward_device_id, forward_sensor_id, forward_data_type, forward_value, tip_msg, status, create_date, create_by, update_daate, update_by, forward_link_type) VALUES ('63309', null, null, 49139, 80345, 922091, 1, 40, null, null, 1, 'shlgf|o7lb-w07iAZh2Bk-mijfYeNG3EzA,', 0, '', '', '', '', '提示信息', null, null, null, null, null, null);
INSERT INTO coldchain_device.cp_trigger (id, device_id, sensor_id, link_user_id, link_device_id, link_sensor_id, alarm_type, height_value, below_value, duration, target_model, contacts, is_forward, forward_device_id, forward_sensor_id, forward_data_type, forward_value, tip_msg, status, create_date, create_by, update_daate, update_by, forward_link_type) VALUES ('63317', '81556', '945094', 49139, 81556, 945094, 1, 3, null, null, 1, 'o7lb-w07iAZh2Bk-mijfYeNG3EzA', 0, '', '', '', '', '提示信息', null, null, null, null, null, null);
INSERT INTO coldchain_device.cp_trigger (id, device_id, sensor_id, link_user_id, link_device_id, link_sensor_id, alarm_type, height_value, below_value, duration, target_model, contacts, is_forward, forward_device_id, forward_sensor_id, forward_data_type, forward_value, tip_msg, status, create_date, create_by, update_daate, update_by, forward_link_type) VALUES ('982001f4e95541d892022fc69e96a1b9', null, null, 49139, 81556, 945094, 1, 40, null, null, 1, 'o7lb-w07iAZh2Bk-mijfYeNG3EzA', 0, null, null, null, null, '提示信息', null, '2020-10-19 20:43:40', null, null, null, null);