create table QRTZ_PAUSED_TRIGGER_GRPS
(
    sched_name    varchar(120) not null,
    trigger_group varchar(200) not null,
    primary key (sched_name, trigger_group)
);

