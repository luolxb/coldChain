create table nts_snc_log
(
    id          int auto_increment
        primary key,
    dtu_id      varchar(200)                        null comment '设备dtu_id',
    accountName varchar(30)                         null,
    module      varchar(30)                         null,
    methods     varchar(200)                        null,
    actionTime  varchar(30)                         null,
    userIP      varchar(60)                         null,
    operTime    timestamp default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP,
    isSuccess   tinyint   default 0                 null,
    description varchar(2000)                       null,
    userId      int                                 null
);

create index dtu_id
    on nts_snc_log (dtu_id);

