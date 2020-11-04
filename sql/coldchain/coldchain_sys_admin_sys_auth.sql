create table sys_auth
(
    id          bigint auto_increment comment '编号'
        primary key,
    auth_name   varchar(64)             null comment '权限名称',
    perms       varchar(100)            null comment '权限标识',
    create_by   varchar(64)  default '' null comment '创建者',
    create_time datetime                null comment '创建时间',
    update_by   varchar(64)  default '' null comment '更新者',
    update_time datetime                null comment '更新时间',
    remark      varchar(500) default '' null comment '备注'
)
    comment '权限表';

