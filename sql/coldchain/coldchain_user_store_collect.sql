create table store_collect
(
    log_id     int unsigned auto_increment
        primary key,
    user_id    int(10)      null,
    store_id   int(10)      null,
    add_time   int          null comment '收藏店铺时间',
    store_name varchar(100) null,
    user_name  varchar(50)  null comment '收藏会员名称'
);

