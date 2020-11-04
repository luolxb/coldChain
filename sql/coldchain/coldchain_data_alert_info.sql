create table alert_info
(
    id           int auto_increment
        primary key,
    convert_type tinyint     null comment '主机变频器型号',
    alert_key    int         null comment '报警数值
',
    alert_value  varchar(20) null comment '报警代码
',
    create_date  datetime    null
);

