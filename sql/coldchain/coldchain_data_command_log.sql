create table command_log
(
    id              bigint auto_increment
        primary key,
    dtu_id          varchar(20) null,
    server_id       tinyint     null,
    command_type    varchar(10) null comment '消息类型/ID',
    mode            tinyint     null comment '1收到 2发送',
    command_content text        null comment '数据包',
    create_date     datetime    null
);

create index dtu_id_idx
    on command_log (dtu_id);

create index idx_time
    on command_log (create_date);

