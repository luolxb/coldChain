create table app_version
(
    id           int auto_increment
        primary key,
    type         int(10)           not null comment '类型，1-安卓，2-ios',
    version      varchar(100)      not null comment '系统版本号',
    is_force     int(10) default 0 not null comment '是否强制更新，0-否，1-是',
    download_url varchar(200)      not null comment '更新地址',
    add_time     datetime          not null comment '更新日期 ',
    update_desc  varchar(1000)     null comment '更新内容'
)
    comment 'app版本表';

