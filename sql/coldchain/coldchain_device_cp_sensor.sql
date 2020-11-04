create table cp_sensor
(
    id             varchar(64)  not null comment '主键'
        primary key,
    sensor_id      int          null comment '传感器ID',
    sensor_name    varchar(255) null comment '传感器名称',
    sensor_type    varchar(255) null comment '数据类型',
    decimals       varchar(255) null comment '小数点',
    unit           varchar(255) null comment '数据单位',
    value          varchar(255) null comment '数据内容',
    create_date    varchar(255) null comment '创建时间',
    founder        varchar(255) null comment '创建人',
    modify_time    varchar(255) null comment '修改时间',
    modifier       varchar(255) null comment '修改人',
    device_id      varchar(255) null comment '传感器所属设备ID',
    device_name    varchar(255) null comment '设备名称',
    heartbeat_date datetime     null comment '心跳时间',
    ioc_url        varchar(255) null comment '图片地址',
    is_alarms      varchar(255) null comment '是否报警',
    is_delete      varchar(255) null comment '是否删除',
    is_line        varchar(255) null comment '是否在线'
)
    comment '传感器表';

INSERT INTO coldchain_device.cp_sensor (id, sensor_id, sensor_name, sensor_type, decimals, unit, value, create_date, founder, modify_time, modifier, device_id, device_name, heartbeat_date, ioc_url, is_alarms, is_delete, is_line) VALUES ('1', 972469, '内部温度', '1', '1', '℃', null, '2020-10-29 19:26:51', null, null, null, '82746', 'Meter1', '2020-10-31 15:55:43', null, '0', '0', '1');
INSERT INTO coldchain_device.cp_sensor (id, sensor_id, sensor_name, sensor_type, decimals, unit, value, create_date, founder, modify_time, modifier, device_id, device_name, heartbeat_date, ioc_url, is_alarms, is_delete, is_line) VALUES ('10aa177ac5f4fb3e6893a48cdd346af5', 949525, '内部温度', '1', '1', '℃', '26.7', '2020-10-29 19:26:51', null, null, null, '82018', 'Meter', '2020-10-30 15:48:48', '/images/temperature.png', '0', '0', '1');
INSERT INTO coldchain_device.cp_sensor (id, sensor_id, sensor_name, sensor_type, decimals, unit, value, create_date, founder, modify_time, modifier, device_id, device_name, heartbeat_date, ioc_url, is_alarms, is_delete, is_line) VALUES ('1449aa819e7b07bf940dc5c5085dce30', 949531, '信号', '1', '1', 'dbm', '26.7', '2020-10-29 19:26:51', null, null, null, '82018', 'Meter', '2020-10-30 15:48:48', '/images/temperature.png', '0', '0', '1');
INSERT INTO coldchain_device.cp_sensor (id, sensor_id, sensor_name, sensor_type, decimals, unit, value, create_date, founder, modify_time, modifier, device_id, device_name, heartbeat_date, ioc_url, is_alarms, is_delete, is_line) VALUES ('2', 972470, '湿度', '1', '1', '%', null, '2020-10-29 19:26:51', null, null, null, '82746', 'Meter1', '2020-10-31 15:55:46', null, '0', '0', '1');
INSERT INTO coldchain_device.cp_sensor (id, sensor_id, sensor_name, sensor_type, decimals, unit, value, create_date, founder, modify_time, modifier, device_id, device_name, heartbeat_date, ioc_url, is_alarms, is_delete, is_line) VALUES ('3', 972471, '外部温度', '1', '1', '℃', null, '2020-10-29 19:26:51', null, null, null, '82746', 'Meter1', '2020-10-31 15:55:48', null, '0', '0', '1');
INSERT INTO coldchain_device.cp_sensor (id, sensor_id, sensor_name, sensor_type, decimals, unit, value, create_date, founder, modify_time, modifier, device_id, device_name, heartbeat_date, ioc_url, is_alarms, is_delete, is_line) VALUES ('4', 972472, '外部湿度', '1', '1', '%', null, '2020-10-29 19:26:51', null, null, null, '82746', 'Meter1', '2020-10-31 15:55:51', null, '0', '0', '1');
INSERT INTO coldchain_device.cp_sensor (id, sensor_id, sensor_name, sensor_type, decimals, unit, value, create_date, founder, modify_time, modifier, device_id, device_name, heartbeat_date, ioc_url, is_alarms, is_delete, is_line) VALUES ('5', 972473, '电池电压', '1', '2', 'mv', null, '2020-10-29 19:26:51', null, null, null, '82746', 'Meter1', '2020-10-31 15:55:54', null, '0', '0', '1');
INSERT INTO coldchain_device.cp_sensor (id, sensor_id, sensor_name, sensor_type, decimals, unit, value, create_date, founder, modify_time, modifier, device_id, device_name, heartbeat_date, ioc_url, is_alarms, is_delete, is_line) VALUES ('6', 972474, 'USB供电', '5', null, null, null, '2020-10-29 19:26:51', null, null, null, '82746', 'Meter1', '2020-10-31 15:55:57', null, '0', '0', '1');
INSERT INTO coldchain_device.cp_sensor (id, sensor_id, sensor_name, sensor_type, decimals, unit, value, create_date, founder, modify_time, modifier, device_id, device_name, heartbeat_date, ioc_url, is_alarms, is_delete, is_line) VALUES ('6539e8630926941c8dc041dd3a24dea8', 949528, '外部湿度', '1', '1', '%', '26.7', '2020-10-29 19:26:51', null, null, null, '82018', 'Meter', '2020-10-30 15:48:48', '/images/temperature.png', '0', '0', '1');
INSERT INTO coldchain_device.cp_sensor (id, sensor_id, sensor_name, sensor_type, decimals, unit, value, create_date, founder, modify_time, modifier, device_id, device_name, heartbeat_date, ioc_url, is_alarms, is_delete, is_line) VALUES ('663a08fa4346622be44425388447b96b', 949533, 'ICCD', '8', '', null, '26.7', '2020-10-29 19:26:52', null, null, null, '82018', 'Meter', '2020-10-30 15:48:48', '/images/temperature.png', '0', '0', '1');
INSERT INTO coldchain_device.cp_sensor (id, sensor_id, sensor_name, sensor_type, decimals, unit, value, create_date, founder, modify_time, modifier, device_id, device_name, heartbeat_date, ioc_url, is_alarms, is_delete, is_line) VALUES ('6ac2fd28b8db96ba7502e58ff2471eec', 949529, '电池电压', '1', '2', 'mv', '26.7', '2020-10-29 19:26:51', null, null, null, '82018', 'Meter', '2020-10-30 15:48:48', '/images/temperature.png', '0', '0', '1');
INSERT INTO coldchain_device.cp_sensor (id, sensor_id, sensor_name, sensor_type, decimals, unit, value, create_date, founder, modify_time, modifier, device_id, device_name, heartbeat_date, ioc_url, is_alarms, is_delete, is_line) VALUES ('6e1f2503d5efd949f9acc98afc6b82ec', 949527, '外部温度', '1', '1', '℃', '26.7', '2020-10-29 19:26:52', null, null, null, '82018', 'Meter', '2020-10-30 15:48:48', '/images/temperature.png', '0', '0', '1');
INSERT INTO coldchain_device.cp_sensor (id, sensor_id, sensor_name, sensor_type, decimals, unit, value, create_date, founder, modify_time, modifier, device_id, device_name, heartbeat_date, ioc_url, is_alarms, is_delete, is_line) VALUES ('7', 972475, '信号', '1', '2', 'dbm', null, '2020-10-29 19:26:51', null, null, null, '82746', 'Meter1', '2020-10-31 15:56:00', null, '0', '0', '1');
INSERT INTO coldchain_device.cp_sensor (id, sensor_id, sensor_name, sensor_type, decimals, unit, value, create_date, founder, modify_time, modifier, device_id, device_name, heartbeat_date, ioc_url, is_alarms, is_delete, is_line) VALUES ('8', 987495, '	
ICCD', '8', null, null, null, '2020-10-29 19:26:51', null, null, null, '82746', 'Meter1', '2020-10-31 15:56:02', null, '0', '0', '1');
INSERT INTO coldchain_device.cp_sensor (id, sensor_id, sensor_name, sensor_type, decimals, unit, value, create_date, founder, modify_time, modifier, device_id, device_name, heartbeat_date, ioc_url, is_alarms, is_delete, is_line) VALUES ('adec999ab68795064709e67e4dec353c', 949530, 'USB供电', '5', '', null, '26.7', '2020-10-29 19:26:51', null, null, null, '82018', 'Meter', '2020-10-30 15:48:48', '/images/temperature.png', '0', '0', '1');
INSERT INTO coldchain_device.cp_sensor (id, sensor_id, sensor_name, sensor_type, decimals, unit, value, create_date, founder, modify_time, modifier, device_id, device_name, heartbeat_date, ioc_url, is_alarms, is_delete, is_line) VALUES ('ba5ed6cfd6b823a54c45139fc6f83b1d', 949532, '位置', '3', '', null, '26.7', '2020-10-29 19:26:51', null, null, null, '82018', 'Meter', '2020-10-30 15:48:48', '/images/temperature.png', '0', '0', '1');
INSERT INTO coldchain_device.cp_sensor (id, sensor_id, sensor_name, sensor_type, decimals, unit, value, create_date, founder, modify_time, modifier, device_id, device_name, heartbeat_date, ioc_url, is_alarms, is_delete, is_line) VALUES ('fce0cb0a32b1cbc75ba9cceb5b129ec3', 949526, '内部湿度', '1', '1', '%', '26.7', '2020-10-29 19:26:51', null, null, null, '82018', 'Meter', '2020-10-30 15:48:48', '/images/temperature.png', '0', '0', '1');