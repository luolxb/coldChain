create table sms_log
(
    id         int auto_increment comment '表id'
        primary key,
    mobile     varchar(11) charset latin1  default '' null comment '手机号',
    session_id varchar(128) charset latin1 default '' null comment 'session_id',
    add_time   int                         default 0  null comment '发送时间',
    code       varchar(10) charset latin1  default '' null comment '验证码',
    seller_id  int(10)                     default 0  null,
    status     int(1)                      default 0  null comment '1:发送成功,0:发送失败',
    msg        varchar(255)                           null comment '短信内容',
    scene      int(1)                      default 0  null comment '发送场景,1:用户注册,2:找回密码,3:客户下单,4:客户支付,5:商家发货,6:身份验证',
    error_msg  text                                   null comment '发送短信异常内容'
);

