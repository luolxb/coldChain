create table QRTZ_SCHEDULER_STATE
(
    sched_name        varchar(120) not null,
    instance_name     varchar(200) not null,
    last_checkin_time bigint(13)   not null,
    checkin_interval  bigint(13)   not null,
    primary key (sched_name, instance_name)
);

