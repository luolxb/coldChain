create table QRTZ_CRON_TRIGGERS
(
    sched_name      varchar(120) not null,
    trigger_name    varchar(200) not null,
    trigger_group   varchar(200) not null,
    cron_expression varchar(200) not null,
    time_zone_id    varchar(80)  null,
    primary key (sched_name, trigger_name, trigger_group),
    constraint QRTZ_CRON_TRIGGERS_ibfk_1
        foreign key (sched_name, trigger_name, trigger_group) references QRTZ_TRIGGERS (sched_name, trigger_name, trigger_group)
);

INSERT INTO coldchain_device.QRTZ_CRON_TRIGGERS (sched_name, trigger_name, trigger_group, cron_expression, time_zone_id) VALUES ('NtsScheduler', 'TASK_CLASS_NAME1', 'DEFAULT', '0/10 * * * * ?', 'Asia/Shanghai');
INSERT INTO coldchain_device.QRTZ_CRON_TRIGGERS (sched_name, trigger_name, trigger_group, cron_expression, time_zone_id) VALUES ('NtsScheduler', 'TASK_CLASS_NAME101', 'DEFAULT', '0/5 * * * * ?', 'Asia/Shanghai');
INSERT INTO coldchain_device.QRTZ_CRON_TRIGGERS (sched_name, trigger_name, trigger_group, cron_expression, time_zone_id) VALUES ('NtsScheduler', 'TASK_CLASS_NAME2', 'DEFAULT', '0/15 * * * * ?', 'Asia/Shanghai');
INSERT INTO coldchain_device.QRTZ_CRON_TRIGGERS (sched_name, trigger_name, trigger_group, cron_expression, time_zone_id) VALUES ('NtsScheduler', 'TASK_CLASS_NAME3', 'DEFAULT', '0/20 * * * * ?', 'Asia/Shanghai');