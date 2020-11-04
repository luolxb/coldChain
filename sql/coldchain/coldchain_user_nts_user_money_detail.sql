create table nts_user_money_detail
(
    id                bigint auto_increment
        primary key,
    user_id           int(10)              null comment '用户ID',
    create_by         varchar(64)          null comment '创建人',
    create_time       timestamp            null comment '交易时间、创建时间',
    t_type            varchar(64)          null comment '交易类型',
    t_price           decimal(10, 2)       null comment '交易金额',
    remark            varchar(255)         null comment '备注',
    update_time       datetime             null,
    update_by         varchar(64)          null,
    t_user_money_code varchar(32)          null comment '交易编号',
    t_status          tinyint(1) default 0 null comment '0：充值待支付，1：充值已支付，2：充值取消支付，3：充值支付失败，4：购买待支付，5购买已支付，6购买取消支付，7购买支付失败',
    buy_time          datetime             null comment '购买时间'
);

