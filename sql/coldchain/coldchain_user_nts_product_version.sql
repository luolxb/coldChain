create table nts_product_version
(
    id                bigint auto_increment
        primary key,
    product_name      varchar(155)   null comment '产品名称',
    product_content   varchar(1400)  null comment '产品内容',
    product_price     decimal(10, 2) null comment '产品价格',
    original_price    decimal(10, 2) null comment '产品原价',
    create_time       datetime       null,
    create_by         varchar(64)    null,
    update_by         varchar(64)    null,
    update_time       datetime       null,
    device_server_num int(8)         null comment '设备服务数',
    effective_time    int(8)         null comment '有效时间'
);

INSERT INTO coldchain_user.nts_product_version (id, product_name, product_content, product_price, original_price, create_time, create_by, update_by, update_time, device_server_num, effective_time) VALUES (1, '非企业版', null, 0.00, null, '2020-10-16 13:43:46', 'admin', null, null, 3000, 365);
INSERT INTO coldchain_user.nts_product_version (id, product_name, product_content, product_price, original_price, create_time, create_by, update_by, update_time, device_server_num, effective_time) VALUES (2, '企业版', null, 3000.00, null, '2020-10-16 13:44:07', 'admin', null, null, 10, null);