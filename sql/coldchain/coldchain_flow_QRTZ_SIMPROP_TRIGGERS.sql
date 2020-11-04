create table QRTZ_SIMPROP_TRIGGERS
(
    sched_name    varchar(120)   not null,
    trigger_name  varchar(200)   not null,
    trigger_group varchar(200)   not null,
    str_prop_1    varchar(512)   null,
    str_prop_2    varchar(512)   null,
    str_prop_3    varchar(512)   null,
    int_prop_1    int            null,
    int_prop_2    int            null,
    long_prop_1   bigint         null,
    long_prop_2   bigint         null,
    dec_prop_1    decimal(13, 4) null,
    dec_prop_2    decimal(13, 4) null,
    bool_prop_1   varchar(1)     null,
    bool_prop_2   varchar(1)     null,
    primary key (sched_name, trigger_name, trigger_group),
    constraint QRTZ_SIMPROP_TRIGGERS_ibfk_1
        foreign key (sched_name, trigger_name, trigger_group) references QRTZ_TRIGGERS (sched_name, trigger_name, trigger_group)
);

