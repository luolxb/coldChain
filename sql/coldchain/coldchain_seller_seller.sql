create table seller
(
    seller_id        int unsigned auto_increment comment '卖家编号'
        primary key,
    seller_name      varchar(50)         default '' not null comment '卖家用户名',
    user_id          int unsigned                   null comment '用户编号',
    company_id       int unsigned                   null comment '卖家组编号',
    store_id         int unsigned                   null comment '店铺编号',
    is_admin         tinyint unsigned    default 0  not null comment '是否管理员(0-不是 1-是)',
    seller_quicklink varchar(255)                   null comment '卖家快捷操作',
    last_login_time  int(11) unsigned               null comment '最后登录时间',
    enabled          tinyint(1)          default 0  null comment '激活状态 0启用1关闭',
    add_time         int                            null,
    token            varchar(64)                    null comment '用于app 授权类似于session_id',
    open_teach       tinyint(1) unsigned default 0  not null comment '是否显示新手向导'
)
    comment '卖家用户表';

INSERT INTO coldchain_seller.seller (seller_id, seller_name, user_id, company_id, store_id, is_admin, seller_quicklink, last_login_time, enabled, add_time, token, open_teach) VALUES (85, '13058140233', 60, null, null, 0, null, 1604454770, 0, null, null, 0);
INSERT INTO coldchain_seller.seller (seller_id, seller_name, user_id, company_id, store_id, is_admin, seller_quicklink, last_login_time, enabled, add_time, token, open_teach) VALUES (86, '13052635263', 62, null, null, 0, null, 1604053176, 0, null, null, 0);
INSERT INTO coldchain_seller.seller (seller_id, seller_name, user_id, company_id, store_id, is_admin, seller_quicklink, last_login_time, enabled, add_time, token, open_teach) VALUES (87, '13057485145', 63, null, null, 0, null, 1604053160, 0, null, null, 0);
INSERT INTO coldchain_seller.seller (seller_id, seller_name, user_id, company_id, store_id, is_admin, seller_quicklink, last_login_time, enabled, add_time, token, open_teach) VALUES (88, '15889781738', 64, null, null, 0, null, 1604454971, 0, null, null, 0);
INSERT INTO coldchain_seller.seller (seller_id, seller_name, user_id, company_id, store_id, is_admin, seller_quicklink, last_login_time, enabled, add_time, token, open_teach) VALUES (90, '15555085266', 80, null, null, 0, null, 1604058159, 0, null, null, 0);
INSERT INTO coldchain_seller.seller (seller_id, seller_name, user_id, company_id, store_id, is_admin, seller_quicklink, last_login_time, enabled, add_time, token, open_teach) VALUES (92, '18387879090', 86, null, null, 0, null, null, 0, null, null, 0);
INSERT INTO coldchain_seller.seller (seller_id, seller_name, user_id, company_id, store_id, is_admin, seller_quicklink, last_login_time, enabled, add_time, token, open_teach) VALUES (93, '18687654321', 87, null, null, 0, null, 1604126788, 0, null, null, 0);
INSERT INTO coldchain_seller.seller (seller_id, seller_name, user_id, company_id, store_id, is_admin, seller_quicklink, last_login_time, enabled, add_time, token, open_teach) VALUES (94, '13098765412', 89, null, null, 0, null, 1604132147, 0, null, null, 0);
INSERT INTO coldchain_seller.seller (seller_id, seller_name, user_id, company_id, store_id, is_admin, seller_quicklink, last_login_time, enabled, add_time, token, open_teach) VALUES (95, '17674181052', 92, null, null, 0, null, 1604456780, 0, null, null, 0);
INSERT INTO coldchain_seller.seller (seller_id, seller_name, user_id, company_id, store_id, is_admin, seller_quicklink, last_login_time, enabled, add_time, token, open_teach) VALUES (96, '13068197971', 93, null, null, 0, null, null, 0, null, null, 0);
INSERT INTO coldchain_seller.seller (seller_id, seller_name, user_id, company_id, store_id, is_admin, seller_quicklink, last_login_time, enabled, add_time, token, open_teach) VALUES (97, '18897892621', 98, null, null, 0, null, 1604396314, 0, null, null, 0);