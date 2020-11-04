create table QRTZ_SCHEDULER_STATE
(
    sched_name        varchar(120) not null,
    instance_name     varchar(200) not null,
    last_checkin_time bigint(13)   not null,
    checkin_interval  bigint(13)   not null,
    primary key (sched_name, instance_name)
);

INSERT INTO coldchain_device.QRTZ_SCHEDULER_STATE (sched_name, instance_name, last_checkin_time, checkin_interval) VALUES ('NtsScheduler', 'iZwz954w71wmo85wl7xh6qZ1601281432021', 1601349399215, 15000);
INSERT INTO coldchain_device.QRTZ_SCHEDULER_STATE (sched_name, instance_name, last_checkin_time, checkin_interval) VALUES ('NtsScheduler', 'iZwz9itsswnra4gpdztysvZ1601281772206', 1601349404442, 15000);