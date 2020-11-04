create table nts_wechat_user_dept
(
    id             bigint(64) auto_increment comment '主键ID'
        primary key,
    wechat_open_id varchar(64) not null comment '微信用户openid',
    dept_id        bigint(64)  not null comment '企业/部门ID',
    create_time    datetime    null comment '创建时间'
)
    comment '微信用户-企业/部门关联表';

