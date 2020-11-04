create table nts_card_package
(
    id           bigint auto_increment
        primary key,
    operator     varchar(32)    null comment '运行商',
    channel_name varchar(32)    null comment '渠道名称',
    package_name varchar(32)    null comment '套餐名称',
    package_type varchar(32)    null comment '套餐类型',
    price        decimal(10, 2) null comment '售价',
    cycle        int(10)        null comment '周期',
    flow         bigint         null comment '流量',
    status       varchar(32)    null comment '状态',
    crate_time   datetime       null,
    create_by    varchar(32)    null,
    update_time  datetime       null,
    update_by    varchar(32)    null
);

