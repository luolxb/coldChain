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

INSERT INTO coldchain_device.QRTZ_TRIGGERS (sched_name, trigger_name, trigger_group, job_name, job_group, description, next_fire_time, prev_fire_time, priority, trigger_state, trigger_type, start_time, end_time, calendar_name, misfire_instr, job_data) VALUES ('NtsScheduler', 'TASK_CLASS_NAME1', 'DEFAULT', 'TASK_CLASS_NAME1', 'DEFAULT', null, 1601281780000, -1, 5, 'PAUSED', 'CRON', 1601281772000, 0, null, 2, 0x);
INSERT INTO coldchain_device.QRTZ_TRIGGERS (sched_name, trigger_name, trigger_group, job_name, job_group, description, next_fire_time, prev_fire_time, priority, trigger_state, trigger_type, start_time, end_time, calendar_name, misfire_instr, job_data) VALUES ('NtsScheduler', 'TASK_CLASS_NAME101', 'DEFAULT', 'TASK_CLASS_NAME101', 'DEFAULT', null, 1601281775000, -1, 5, 'PAUSED', 'CRON', 1601281773000, 0, null, -1, 0x);
INSERT INTO coldchain_device.QRTZ_TRIGGERS (sched_name, trigger_name, trigger_group, job_name, job_group, description, next_fire_time, prev_fire_time, priority, trigger_state, trigger_type, start_time, end_time, calendar_name, misfire_instr, job_data) VALUES ('NtsScheduler', 'TASK_CLASS_NAME2', 'DEFAULT', 'TASK_CLASS_NAME2', 'DEFAULT', null, 1601281785000, -1, 5, 'PAUSED', 'CRON', 1601281773000, 0, null, 2, 0x);
INSERT INTO coldchain_device.QRTZ_TRIGGERS (sched_name, trigger_name, trigger_group, job_name, job_group, description, next_fire_time, prev_fire_time, priority, trigger_state, trigger_type, start_time, end_time, calendar_name, misfire_instr, job_data) VALUES ('NtsScheduler', 'TASK_CLASS_NAME3', 'DEFAULT', 'TASK_CLASS_NAME3', 'DEFAULT', null, 1601281780000, -1, 5, 'PAUSED', 'CRON', 1601281773000, 0, null, 2, 0x);