create table command_queue
(
    id              bigint auto_increment
        primary key,
    command_type    varchar(10) charset utf8   null comment '消息ID',
    dtu_id          varchar(30) charset utf8   null,
    server_id       int    default 1           null comment '所在服务器',
    snc_log_id      bigint default 0           null comment '日志事务id',
    command_content varchar(1000) charset utf8 null,
    create_date     datetime                   null
)
    collate = utf8_unicode_ci;

