create table sys_notice
(
    notice_id      int(4) auto_increment comment '公告ID'
        primary key,
    notice_title   varchar(50)             not null comment '公告标题',
    notice_type    char                    not null comment '公告类型（1通知 2公告）',
    notice_content varchar(2000)           null comment '公告内容',
    status         char        default '0' null comment '公告状态（0正常 1关闭）',
    user_loginName varchar(32)             null comment '指定接收用户',
    create_by      varchar(64) default ''  null comment '创建者',
    create_time    datetime                null comment '创建时间',
    update_by      varchar(64) default ''  null comment '更新者',
    update_time    datetime                null comment '更新时间',
    remark         varchar(255)            null comment '备注'
)
    comment '通知公告表';

INSERT INTO coldchain_sys_admin.sys_notice (notice_id, notice_title, notice_type, notice_content, status, user_loginName, create_by, create_time, update_by, update_time, remark) VALUES (1, '温馨提醒：2018-07-01 新版本发布啦', '2', '新版本内容', '0', null, 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '管理员');
INSERT INTO coldchain_sys_admin.sys_notice (notice_id, notice_title, notice_type, notice_content, status, user_loginName, create_by, create_time, update_by, update_time, remark) VALUES (2, '维护通知：2018-07-01 系统凌晨维护', '1', '维护内容', '0', null, 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '管理员');
INSERT INTO coldchain_sys_admin.sys_notice (notice_id, notice_title, notice_type, notice_content, status, user_loginName, create_by, create_time, update_by, update_time, remark) VALUES (16, '好消息', '0', '好消息，好消息，好消息，重要事情说三遍。', '0', 'cqs', 'admin', '2020-07-29 11:35:16', '', null, null);
INSERT INTO coldchain_sys_admin.sys_notice (notice_id, notice_title, notice_type, notice_content, status, user_loginName, create_by, create_time, update_by, update_time, remark) VALUES (19, '好消息', '1', '江南皮革厂倒闭了', '0', null, 'admin', '2020-08-03 17:18:09', '', null, null);