create table user_message
(
    rec_id     int auto_increment
        primary key,
    user_id    mediumint unsigned  default 0 not null comment '用户id',
    message_id int(11) unsigned    default 0 not null comment '消息id',
    category   tinyint(1) unsigned default 0 not null comment '通知消息：0, 活动消息：1, 物流:2, 私信:3',
    is_see     tinyint(1) unsigned default 0 not null comment '是否查看：0未查看, 1已查看',
    deleted    tinyint(1)          default 0 not null comment '用户假删除标识,1:删除,0未删除',
    status     int                 default 0 not null comment '查看状态：0未查看，1已查看'
);

create index message_id
    on user_message (message_id);

create index user_id
    on user_message (user_id);

