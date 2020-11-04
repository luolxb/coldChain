create table nts_transaction_record
(
    id                      bigint               null,
    transaction_record_code varchar(32)          null comment '交易编码',
    user_id                 int(10)              null comment '用户ID',
    create_time             datetime             null,
    transaction_time        datetime             null comment '交易时间',
    type                    varchar(32)          null comment '交易类型',
    price                   decimal(10, 2)       null comment '金额',
    remark                  varchar(255)         null comment '备注',
    update_time             datetime             null,
    update_by               varchar(32)          null,
    status                  tinyint(1) default 0 null comment '0：交易待确认，1：交易确认',
    `table`                 varchar(64)          null comment '表',
    table_id                bigint               null comment '表ID'
);

