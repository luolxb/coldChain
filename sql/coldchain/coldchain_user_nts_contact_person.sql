create table nts_contact_person
(
    id          bigint auto_increment comment '主键'
        primary key,
    user_id     int(10)       null comment '用户ID',
    name        varchar(64)   null comment '联系人',
    mobile      varbinary(11) null comment '电话',
    email       varchar(32)   null comment '邮箱',
    wechat      varchar(32)   null comment '微信',
    nick_mame   varchar(64)   null comment '联系人',
    code        varchar(32)   null comment '联系人 code',
    create_time datetime      null,
    create_by   varchar(64)   null,
    update_by   varchar(64)   null,
    update_time datetime      null
);

INSERT INTO coldchain_user.nts_contact_person (id, user_id, name, mobile, email, wechat, nick_mame, code, create_time, create_by, update_by, update_time) VALUES (1, 2, 'test3', 0x3138363033303539353531, 'admin@ntsitech.com', '123456', 'test3', null, '2020-10-27 10:21:28', null, null, '2020-10-27 11:33:56');
INSERT INTO coldchain_user.nts_contact_person (id, user_id, name, mobile, email, wechat, nick_mame, code, create_time, create_by, update_by, update_time) VALUES (2, 2, 'nts', 0x3138363033303539353539, 'nts@ntsitech.com', '123456', 'nts', null, '2020-10-27 11:20:57', null, null, null);
INSERT INTO coldchain_user.nts_contact_person (id, user_id, name, mobile, email, wechat, nick_mame, code, create_time, create_by, update_by, update_time) VALUES (3, 38, 'qq1', 0x3133303532383539363231, '16545641@163.com', '123456', 'qq1', null, '2020-10-27 18:04:22', null, null, '2020-10-27 18:04:44');
INSERT INTO coldchain_user.nts_contact_person (id, user_id, name, mobile, email, wechat, nick_mame, code, create_time, create_by, update_by, update_time) VALUES (4, 38, 'qq1432', 0x3133303532383539323235, '4363646@163.com', '123456', 'qq1432', null, '2020-10-27 18:05:23', null, null, null);
INSERT INTO coldchain_user.nts_contact_person (id, user_id, name, mobile, email, wechat, nick_mame, code, create_time, create_by, update_by, update_time) VALUES (5, 38, '34634634', 0x3433363433363334, '346436436', '123456', '34634634', null, '2020-10-29 09:37:32', null, null, null);