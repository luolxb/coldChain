create table message_notice
(
    message_id      int auto_increment
        primary key,
    message_type    tinyint(1) unsigned default 0 not null comment '个体消息：0，全体消息:1',
    message_title   varchar(255)                  null comment '消息标题',
    message_content text                          not null comment '消息内容',
    send_time       int unsigned                  not null comment '发送时间',
    mmt_code        varchar(50)                   null comment '用户消息模板编号',
    type            tinyint(1) unsigned default 0 null comment '0系统公告1降价通知2优惠券到账提醒3优惠券使用提醒4优惠券即将过期提醒5预售订单尾款支付提醒6提现到账提醒',
    prom_id         int                 default 0 not null comment '活动id',
    store_id        int                 default 0 null comment '店铺ID'
);

