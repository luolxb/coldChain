create table nts_device_type_param
(
    id             int auto_increment
        primary key,
    device_type_id int      null,
    param_id       int      null comment '参数ID',
    createDate     datetime null
);

