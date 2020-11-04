create table sms_template
(
    tpl_id       mediumint(8) auto_increment comment '自增ID'
        primary key,
    sms_sign     varchar(50)  default '' not null comment '短信签名',
    sms_tpl_code varchar(100) default '' not null comment '短信模板ID',
    tpl_content  varchar(512) default '' not null comment '发送短信内容',
    send_scene   varchar(100) default '' not null comment '短信发送场景',
    add_time     int                     not null comment '添加时间'
)
    comment '短信模板配置表';

