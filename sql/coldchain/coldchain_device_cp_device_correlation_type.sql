create table cp_device_correlation_type
(
    id             varchar(64) not null comment '主键'
        primary key,
    device_id      varchar(64) not null comment '设备编号（主键）',
    device_type_id varchar(64) not null comment '设备类型编号（主键）'
)
    comment '设备-设备类型关联表';

