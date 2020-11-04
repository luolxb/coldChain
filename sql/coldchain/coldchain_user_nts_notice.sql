create table nts_notice
(
    id             bigint auto_increment
        primary key,
    user_id        int(10)                null comment '接受用户ID',
    notice_content varchar(1400)          null comment '消息内容',
    notice_title   varchar(255)           null comment '消息头',
    notice_type    varchar(64)            null comment '消息类型',
    create_time    datetime               null,
    create_by      varchar(64)            null,
    update_time    datetime               null,
    update_by      varchar(64)            null,
    is_send        varchar(1) default 'Y' null comment '是否发送'
);

