create table account_log
(
    log_id       mediumint unsigned auto_increment
        primary key,
    user_id      mediumint unsigned default 0    not null,
    user_money   decimal(10, 2)     default 0.00 not null comment '用户金额',
    frozen_money decimal(10, 2)     default 0.00 not null comment '冻结金额',
    pay_points   mediumint          default 0    not null comment '支付积分',
    change_time  int unsigned                    not null comment '变动时间',
    `desc`       varchar(255)       default ''   not null comment '描述',
    order_sn     varchar(50)        default ''   not null comment '订单编号',
    order_id     int unsigned       default 0    not null comment '订单id'
);

create index user_id
    on account_log (user_id);

