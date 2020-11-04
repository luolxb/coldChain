create table nts_events
(
    id              bigint auto_increment comment '编号'
        primary key,
    event_class     varchar(30)          null comment '事件类型',
    msg_id          varchar(60)          null comment '消息/事件ID',
    device_sn       varchar(60)          null comment '设备SN',
    message_data_id bigint               null comment '消息数据ID',
    device_data_id  bigint               null comment '设备数据ID',
    reefer_data_id  bigint               null comment '冷链数据ID',
    dept_id         bigint               null comment '部门|企业ID',
    delete_flag     tinyint(1) default 1 null comment '删除标志 1-正常状态 2-已删除',
    create_time     datetime             null comment '创建时间',
    update_time     datetime             null comment '更新时间'
)
    comment '事件表';

create index index_ecent_message_data_id
    on nts_events (message_data_id);

create index index_event_device_data_id
    on nts_events (device_data_id);

create index index_event_msg_id
    on nts_events (msg_id);

create index index_event_reefer_data_id
    on nts_events (reefer_data_id);

