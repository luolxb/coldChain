create table QRTZ_BLOB_TRIGGERS
(
    sched_name    varchar(120) not null,
    trigger_name  varchar(200) not null,
    trigger_group varchar(200) not null,
    blob_data     blob         null,
    primary key (sched_name, trigger_name, trigger_group),
    constraint QRTZ_BLOB_TRIGGERS_ibfk_1
        foreign key (sched_name, trigger_name, trigger_group) references QRTZ_TRIGGERS (sched_name, trigger_name, trigger_group)
);

