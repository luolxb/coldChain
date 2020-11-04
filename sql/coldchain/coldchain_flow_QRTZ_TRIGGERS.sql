create table QRTZ_TRIGGERS
(
    sched_name     varchar(120) not null,
    trigger_name   varchar(200) not null,
    trigger_group  varchar(200) not null,
    job_name       varchar(200) not null,
    job_group      varchar(200) not null,
    description    varchar(250) null,
    next_fire_time bigint(13)   null,
    prev_fire_time bigint(13)   null,
    priority       int          null,
    trigger_state  varchar(16)  not null,
    trigger_type   varchar(8)   not null,
    start_time     bigint(13)   not null,
    end_time       bigint(13)   null,
    calendar_name  varchar(200) null,
    misfire_instr  smallint(2)  null,
    job_data       blob         null,
    primary key (sched_name, trigger_name, trigger_group),
    constraint QRTZ_TRIGGERS_ibfk_1
        foreign key (sched_name, job_name, job_group) references QRTZ_JOB_DETAILS (sched_name, job_name, job_group)
);

create index sched_name
    on QRTZ_TRIGGERS (sched_name, job_name, job_group);

