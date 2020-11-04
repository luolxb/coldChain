create table nts_notice_read_log
(
    id         bigint(64) auto_increment comment '主键'
        primary key,
    login_name varchar(255)         null comment '账号',
    notice_id  bigint(32)           null comment '消息公告id',
    read_flag  tinyint(2) default 1 null comment '阅读标识0-未阅读 1-已阅读'
);

