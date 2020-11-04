create table nts_shellfis
(
    id                 bigint(32) auto_increment comment '贝图编号'
        primary key,
    shellfis_name      varchar(64)          null comment '贝图别名',
    boxarea_id         bigint(32)           null comment '箱位区块编号',
    shellfis_structure varchar(16)          null comment '贝图箱位结构',
    shellfis_count     int(8)               null comment '贝图箱位总数',
    delete_flag        tinyint(1) default 1 null comment '删除标志 1-正常状态 2-已删除',
    create_time        datetime             null comment '创建时间',
    update_time        datetime             null comment '更新时间'
)
    comment '贝-货位表';

