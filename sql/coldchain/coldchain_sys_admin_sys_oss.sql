create table sys_oss
(
    id          bigint auto_increment comment '编号'
        primary key,
    file_name   varchar(64)          null comment '文件名',
    file_suffix varchar(10)          null comment '文件后缀名',
    url         varchar(200)         not null comment 'URL地址',
    create_time datetime             null comment '创建时间',
    create_by   varchar(64)          null comment '上传人',
    service     tinyint(2) default 1 not null comment '服务商'
)
    comment '文件上传表';

