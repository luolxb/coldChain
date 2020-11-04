create table member_msg_tpl
(
    mmt_code            varchar(50)      default '' not null comment '用户消息模板编号'
        primary key,
    mmt_name            varchar(50)      default '' not null comment '模板名称',
    mmt_message_switch  tinyint unsigned default 0  not null comment '站内信接收开关',
    mmt_message_content varchar(255)     default '' not null comment '站内信消息内容',
    mmt_short_switch    tinyint unsigned default 0  not null comment '短信接收开关',
    mmt_short_content   varchar(255)     default '' not null comment '短信接收内容',
    mmt_mail_switch     tinyint unsigned default 0  not null comment '邮件接收开关',
    mmt_mail_subject    varchar(255)     default '' not null comment '邮件标题',
    mmt_mail_content    text                        not null comment '邮件内容',
    mmt_short_sign      varchar(50)      default '' not null comment '短信签名',
    mmt_short_code      varchar(50)      default '' not null comment '短信模板ID'
)
    comment '用户消息模板';

