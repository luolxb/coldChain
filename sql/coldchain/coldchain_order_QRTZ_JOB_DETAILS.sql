create table QRTZ_JOB_DETAILS
(
    sched_name        varchar(120) not null,
    job_name          varchar(200) not null,
    job_group         varchar(200) not null,
    description       varchar(250) null,
    job_class_name    varchar(250) not null,
    is_durable        varchar(1)   not null,
    is_nonconcurrent  varchar(1)   not null,
    is_update_data    varchar(1)   not null,
    requests_recovery varchar(1)   not null,
    job_data          blob         null,
    primary key (sched_name, job_name, job_group)
);

