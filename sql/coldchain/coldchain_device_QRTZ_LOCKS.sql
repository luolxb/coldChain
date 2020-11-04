create table QRTZ_LOCKS
(
    sched_name varchar(120) not null,
    lock_name  varchar(40)  not null,
    primary key (sched_name, lock_name)
);

INSERT INTO coldchain_device.QRTZ_LOCKS (sched_name, lock_name) VALUES ('NtsScheduler', 'STATE_ACCESS');
INSERT INTO coldchain_device.QRTZ_LOCKS (sched_name, lock_name) VALUES ('NtsScheduler', 'TRIGGER_ACCESS');