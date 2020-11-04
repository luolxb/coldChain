create table user_level
(
    level_id   smallint(4) unsigned auto_increment
        primary key,
    level_name varchar(30)           null comment '头衔名称',
    amount     decimal(10, 2)        null comment '等级必要金额',
    discount   smallint(4) default 0 null comment '折扣',
    `describe` varchar(200)          null
);

