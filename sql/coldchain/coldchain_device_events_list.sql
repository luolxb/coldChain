create table events_list
(
    id         int               not null
        primary key,
    event_name varchar(100)      null comment '事件名称',
    event_type tinyint default 0 null comment '1:保养事件,2:预警事件,3:报警事件,4:其他事件',
    is_sms     tinyint default 0 null comment '是否需要发送短信,0:NO,1:YES'
);

