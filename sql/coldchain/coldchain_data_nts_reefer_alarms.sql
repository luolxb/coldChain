create table nts_reefer_alarms
(
    id             bigint auto_increment comment '编号'
        primary key,
    device_sn      varchar(60)          null comment '设备SN',
    oem_alarm      int                  null comment '冷链OEM的微报警',
    rc_alias       varchar(20)          null comment '显示的报警别名',
    rc_severity    varchar(20)          null comment '警报的严重程度',
    active         varchar(10)          null comment '是否报警 true/false',
    dept_id        bigint               null comment '部门|企业ID',
    reefer_data_id bigint               null comment '冷链数据ID',
    delete_flag    tinyint(1) default 1 null comment '删除标志 1-正常状态 2-已删除',
    create_time    datetime             null comment '创建时间',
    update_time    datetime             null comment '更新时间'
)
    comment '冷链警报表';

create index index_reefer_alarms
    on nts_reefer_alarms (device_sn, reefer_data_id);

