create table sys_function
(
    id          int auto_increment
        primary key,
    code        varchar(500) null comment '编码',
    name        varchar(100) null comment '模块名称',
    description varchar(500) null comment '访问连接',
    menu_rank   varchar(11)  null comment '排序',
    status      varchar(1)   null comment '状态',
    parent_id   int          null comment '父级菜单id',
    remarks     varchar(500) null comment '备注'
)
    engine = MyISAM;

