create table sys_param
(
    id      int auto_increment comment 'id'
        primary key,
    p_key   varchar(50) default '' not null comment '参数键',
    p_value varchar(50) default '' not null comment '参数值',
    p_name  varchar(50) default '' not null comment '参数名'
)
    comment '系统参数' engine = MyISAM;

