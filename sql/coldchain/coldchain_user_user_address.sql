create table user_address
(
    address_id mediumint unsigned auto_increment
        primary key,
    user_id    mediumint(8)   default 0         null,
    consignee  varchar(60)    default ''        null comment '收货人',
    email      varchar(60)    default ''        null comment '邮箱地址',
    country    varchar(64)    default '0'       null comment '国家',
    province   varchar(64)    default '0'       null comment '省份',
    city       varchar(64)    default '0'       null comment '城市',
    district   varchar(64)    default '0'       null comment '地区',
    twon       varchar(64)    default '0'       null comment '乡镇',
    address    varchar(250)   default ''        null comment '地址',
    zipcode    varchar(60)    default ''        null comment '邮政编码',
    mobile     varchar(60)    default ''        null comment '手机',
    is_default tinyint(1)     default 0         null comment '默认收货地址',
    longitude  decimal(10, 7) default 0.0000000 null comment '地址经度',
    latitude   decimal(10, 7) default 0.0000000 null comment '地址纬度'
);

create index user_id
    on user_address (user_id);

