create table nts_user_product_order
(
    id                    bigint auto_increment comment '主键'
        primary key,
    product_id            bigint                 null comment '产品版本ID',
    user_id               int(10)                null comment '用户ID',
    buy_time              datetime               null comment '购买时间',
    buy_price             decimal(10, 2)         null comment '购买金额',
    start_time            date                   null comment '生效时间',
    expired_time          date                   null comment '过期时间',
    is_expired            varchar(1) default 'N' null comment '是否过期',
    original_price        decimal(10, 2)         null comment '产品原价',
    create_time           datetime               null,
    create_by             varchar(64)            null,
    update_time           datetime               null,
    update_by             varchar(64)            null,
    product_order_code    varchar(32)            null comment '订单code',
    effective_time        int(8)                 null comment '有效时间',
    pay_type              varchar(16)            null comment '支付方式',
    pay_status            int(1)     default 0   null comment '0:未支付，1已支付，2支付失败，3取消支付',
    product_order_content varchar(64)            null comment '订单内容',
    device_server_num     int(8)                 null comment '设备服务数'
);

INSERT INTO coldchain_user.nts_user_product_order (id, product_id, user_id, buy_time, buy_price, start_time, expired_time, is_expired, original_price, create_time, create_by, update_time, update_by, product_order_code, effective_time, pay_type, pay_status, product_order_content, device_server_num) VALUES (1, 2, 7, null, 3000.00, '2020-10-22', '2021-10-22', 'N', null, '2020-10-22 14:56:28', 'test1', null, null, 'e9ad46e4add04bc2b13df40909c6ee97', null, null, 0, '企业版', 10);
INSERT INTO coldchain_user.nts_user_product_order (id, product_id, user_id, buy_time, buy_price, start_time, expired_time, is_expired, original_price, create_time, create_by, update_time, update_by, product_order_code, effective_time, pay_type, pay_status, product_order_content, device_server_num) VALUES (2, 2, 7, null, 3000.00, '2020-10-22', '2021-10-22', 'N', null, '2020-10-22 14:58:12', 'test1', null, null, '2e2bb23a9e3346ff9dafda514e7fdf46', null, null, 0, '企业版', 10);
INSERT INTO coldchain_user.nts_user_product_order (id, product_id, user_id, buy_time, buy_price, start_time, expired_time, is_expired, original_price, create_time, create_by, update_time, update_by, product_order_code, effective_time, pay_type, pay_status, product_order_content, device_server_num) VALUES (3, 2, 2, null, 3000.00, '2020-10-22', '2021-10-22', 'N', null, '2020-10-22 14:58:32', '18687269789', null, null, '8995596083084615a87b72a708610679', null, null, 0, '企业版', 10);
INSERT INTO coldchain_user.nts_user_product_order (id, product_id, user_id, buy_time, buy_price, start_time, expired_time, is_expired, original_price, create_time, create_by, update_time, update_by, product_order_code, effective_time, pay_type, pay_status, product_order_content, device_server_num) VALUES (4, 2, 7, null, 3000.00, '2020-10-22', '2021-10-22', 'N', null, '2020-10-22 15:02:04', 'test1', null, null, '24368d64fabe48e182b85b25c6adace1', null, null, 0, '企业版', 10);
INSERT INTO coldchain_user.nts_user_product_order (id, product_id, user_id, buy_time, buy_price, start_time, expired_time, is_expired, original_price, create_time, create_by, update_time, update_by, product_order_code, effective_time, pay_type, pay_status, product_order_content, device_server_num) VALUES (5, 2, 2, null, 3000.00, '2020-10-22', '2021-10-22', 'N', null, '2020-10-22 15:16:08', '18687269789', null, null, '2c327bb1ade04ccb85bb4e1e5e60b8fd', null, null, 0, '企业版', 10);
INSERT INTO coldchain_user.nts_user_product_order (id, product_id, user_id, buy_time, buy_price, start_time, expired_time, is_expired, original_price, create_time, create_by, update_time, update_by, product_order_code, effective_time, pay_type, pay_status, product_order_content, device_server_num) VALUES (6, 2, 2, null, 3000.00, '2020-10-22', '2021-10-22', 'N', null, '2020-10-22 15:32:21', '18687269789', null, null, '67c5ae3e35104cc585775f709eca7ab8', null, null, 0, '企业版', 10);
INSERT INTO coldchain_user.nts_user_product_order (id, product_id, user_id, buy_time, buy_price, start_time, expired_time, is_expired, original_price, create_time, create_by, update_time, update_by, product_order_code, effective_time, pay_type, pay_status, product_order_content, device_server_num) VALUES (7, 2, 2, null, 3000.00, '2020-10-22', '2021-10-22', 'N', null, '2020-10-22 15:44:15', '18687269789', null, null, '347dcae71bf3467abe5b9e0ae6ee0e6f', null, null, 0, '企业版', 10);
INSERT INTO coldchain_user.nts_user_product_order (id, product_id, user_id, buy_time, buy_price, start_time, expired_time, is_expired, original_price, create_time, create_by, update_time, update_by, product_order_code, effective_time, pay_type, pay_status, product_order_content, device_server_num) VALUES (8, 2, 2, null, 3000.00, '2020-10-22', '2021-10-22', 'N', null, '2020-10-22 15:48:51', '18687269789', null, null, 'a2726b0a28a84f8fb7d60a235d0b752d', null, null, 0, '企业版', 10);
INSERT INTO coldchain_user.nts_user_product_order (id, product_id, user_id, buy_time, buy_price, start_time, expired_time, is_expired, original_price, create_time, create_by, update_time, update_by, product_order_code, effective_time, pay_type, pay_status, product_order_content, device_server_num) VALUES (9, 2, 2, null, 3000.00, '2020-10-22', '2021-10-22', 'N', null, '2020-10-22 15:49:51', '18687269789', null, null, '6ff5fb87ce044a0fae2bf1d4c9d07aac', null, null, 0, '企业版', 10);
INSERT INTO coldchain_user.nts_user_product_order (id, product_id, user_id, buy_time, buy_price, start_time, expired_time, is_expired, original_price, create_time, create_by, update_time, update_by, product_order_code, effective_time, pay_type, pay_status, product_order_content, device_server_num) VALUES (10, 2, 2, null, 3000.00, '2020-10-22', '2021-10-22', 'N', null, '2020-10-22 15:51:13', '18687269789', null, null, '588f007d79b945fea944ee7b573d7e59', null, null, 0, '企业版', 10);
INSERT INTO coldchain_user.nts_user_product_order (id, product_id, user_id, buy_time, buy_price, start_time, expired_time, is_expired, original_price, create_time, create_by, update_time, update_by, product_order_code, effective_time, pay_type, pay_status, product_order_content, device_server_num) VALUES (11, 2, 2, null, 3000.00, '2020-10-22', '2021-10-22', 'N', null, '2020-10-22 16:07:02', '18687269789', null, null, 'ce269d282d42476699872e0580bb9cfc', null, null, 0, '企业版', 10);
INSERT INTO coldchain_user.nts_user_product_order (id, product_id, user_id, buy_time, buy_price, start_time, expired_time, is_expired, original_price, create_time, create_by, update_time, update_by, product_order_code, effective_time, pay_type, pay_status, product_order_content, device_server_num) VALUES (1319193612870127617, 2, 2, null, 3000.00, '2020-10-22', '2021-10-22', 'N', null, '2020-10-22 16:27:21', '18687269789', null, null, 'c1f63619d2544ebfbc16f4dfdab6039c', null, null, 0, '企业版', 10);
INSERT INTO coldchain_user.nts_user_product_order (id, product_id, user_id, buy_time, buy_price, start_time, expired_time, is_expired, original_price, create_time, create_by, update_time, update_by, product_order_code, effective_time, pay_type, pay_status, product_order_content, device_server_num) VALUES (1319193612870127618, 2, 2, null, 3000.00, '2020-10-23', '2021-10-23', 'N', null, '2020-10-23 13:16:28', null, null, null, '009b1905c9b449a7b09e192c3e9be60c', null, null, 0, '企业版', 10);
INSERT INTO coldchain_user.nts_user_product_order (id, product_id, user_id, buy_time, buy_price, start_time, expired_time, is_expired, original_price, create_time, create_by, update_time, update_by, product_order_code, effective_time, pay_type, pay_status, product_order_content, device_server_num) VALUES (1319193612870127619, 2, 2, null, 3000.00, '2020-10-23', '2021-10-23', 'N', null, '2020-10-23 15:07:44', null, null, null, '276fdf3031714d19810de573ced544b3', null, null, 0, '企业版', 10);
INSERT INTO coldchain_user.nts_user_product_order (id, product_id, user_id, buy_time, buy_price, start_time, expired_time, is_expired, original_price, create_time, create_by, update_time, update_by, product_order_code, effective_time, pay_type, pay_status, product_order_content, device_server_num) VALUES (1319596932042891265, 2, 2, null, 3000.00, '2020-10-23', '2021-10-23', 'N', null, '2020-10-23 19:10:00', null, null, null, '87573a13e12a4b0aa16b653f919c49c2', null, null, 0, '企业版', 10);
INSERT INTO coldchain_user.nts_user_product_order (id, product_id, user_id, buy_time, buy_price, start_time, expired_time, is_expired, original_price, create_time, create_by, update_time, update_by, product_order_code, effective_time, pay_type, pay_status, product_order_content, device_server_num) VALUES (1319597228026535938, 2, 2, null, 3000.00, '2020-10-23', '2021-10-23', 'N', null, '2020-10-23 19:11:11', null, null, null, '7058f5afc5144a5e8dedf8f75a4292f1', null, null, 0, '企业版', 10);
INSERT INTO coldchain_user.nts_user_product_order (id, product_id, user_id, buy_time, buy_price, start_time, expired_time, is_expired, original_price, create_time, create_by, update_time, update_by, product_order_code, effective_time, pay_type, pay_status, product_order_content, device_server_num) VALUES (1319597228026535939, 2, 38, null, 3000.00, '2020-10-27', '2021-10-27', 'N', null, '2020-10-27 18:06:13', null, null, null, 'b681377581014eda8f801d259e80d74a', null, null, 0, '企业版', 10);
INSERT INTO coldchain_user.nts_user_product_order (id, product_id, user_id, buy_time, buy_price, start_time, expired_time, is_expired, original_price, create_time, create_by, update_time, update_by, product_order_code, effective_time, pay_type, pay_status, product_order_content, device_server_num) VALUES (1319597228026535940, 2, 38, null, 3000.00, '2020-10-27', '2021-10-27', 'N', null, '2020-10-27 18:08:22', null, null, null, '54167131304641d8a52c450f34d67924', null, null, 0, '企业版', 10);
INSERT INTO coldchain_user.nts_user_product_order (id, product_id, user_id, buy_time, buy_price, start_time, expired_time, is_expired, original_price, create_time, create_by, update_time, update_by, product_order_code, effective_time, pay_type, pay_status, product_order_content, device_server_num) VALUES (1319597228026535941, 2, 38, null, 3000.00, '2020-10-29', '2021-10-29', 'N', null, '2020-10-29 19:44:42', null, null, null, 'bcf8b611980646368a3fde4f69254474', null, null, 0, '企业版', 10);