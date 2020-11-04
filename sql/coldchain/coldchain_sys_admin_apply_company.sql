create table apply_company
(
    id       int auto_increment
        primary key,
    name     varchar(255) null comment '企业名称',
    type     int          null comment '租车类型0 企业长租 1 企业分时',
    linker   varchar(255) null comment '联系人',
    phone    varchar(255) null comment '联系电话',
    email    varchar(255) null comment '邮件',
    address  varchar(255) null comment '地址',
    remark   varchar(500) null comment '备注',
    add_time datetime     null comment '添加时间',
    status   int          null comment '状态'
)
    engine = MyISAM;

