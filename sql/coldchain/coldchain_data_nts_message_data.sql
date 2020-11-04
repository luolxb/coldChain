create table nts_message_data
(
    id          bigint auto_increment comment '编号'
        primary key,
    msg_id      varchar(60)          null comment '消息/事件ID',
    event_dtm   varchar(20)          null comment '事件发生日期',
    app_dtm     varchar(20)          null comment '消息/事件处理日期',
    event_infos varchar(255)         null comment '事件数组',
    dept_id     bigint               null comment '部门|企业ID',
    events_id   bigint               null comment '事件ID',
    delete_flag tinyint(1) default 1 null comment '删除标志 1-正常状态 2-已删除',
    create_time datetime             null comment '创建时间',
    update_time datetime             null comment '更新时间'
)
    comment '消息数据表';

create index index_message_data
    on nts_message_data (msg_id, event_infos, events_id);

