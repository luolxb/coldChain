create table pay_config
(
    app_id         varchar(255) default '' not null comment '小程序appid',
    mch_id         varchar(255) default '' not null comment '微信支付的商户id',
    `key`          varchar(255) default '' not null comment '微信支付的商户密钥',
    app_secret     varchar(255) default '' not null comment '小程序secret',
    apiclient_cert varchar(255) default '' not null comment '支付商户证书',
    apiclient_key  varchar(255) default '' not null comment '支付商户证书密钥'
)
    engine = MyISAM;

INSERT INTO coldchain_sys_admin.pay_config (app_id, mch_id, `key`, app_secret, apiclient_cert, apiclient_key) VALUES ('wx3c44179d820eb2ee ', '1566458161', 'NTS32SDSD9ERM2313CD88923DSDHJSDS ', '', '', '');