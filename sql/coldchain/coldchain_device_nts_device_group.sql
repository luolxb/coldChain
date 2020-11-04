create table nts_device_group
(
    id          int(5) auto_increment comment '分组ID'
        primary key,
    parent_id   int(5)     default 0 null comment '父分组ID',
    dept_id     int                  null comment '部门|企业ID',
    group_name  varchar(100)         not null comment '分组名称',
    group_desc  varchar(200)         null comment '分组描述',
    order_num   int(4)     default 0 null comment '显示顺序',
    status      tinyint(1) default 1 null comment '状态 1-正常 0-停用',
    delete_flag tinyint(1) default 1 null comment '删除标志 1-正常状态 2-已删除',
    create_time datetime             null comment '创建时间',
    update_time datetime             null comment '更新时间'
)
    comment '设备分组表';

