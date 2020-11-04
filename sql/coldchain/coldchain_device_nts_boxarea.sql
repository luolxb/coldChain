create table nts_boxarea
(
    id                 bigint(32) auto_increment comment '编号'
        primary key,
    boxarea_name       varchar(64)            null comment '箱位区域名称',
    max_column         int(8)                 null comment '最大列数',
    max_row            int(8)                 null comment '最大行数',
    sortord            tinyint(1)  default 0  null comment '排序方式 0-从左往右 1-从右往左 默认为0',
    shellfis_structure varchar(16)            null comment '贝图箱位结构',
    site_id            bigint(32)             null comment '所属场地编号',
    delete_flag        tinyint(1)  default 1  null comment '删除标志 1-正常状态 2-已删除',
    create_time        datetime               null comment '创建时间',
    update_time        datetime               null comment '更新时间',
    create_by          varchar(64) default '' null comment '创建者',
    update_by          varchar(64) default '' null comment '更新者'
)
    comment '箱位区域表';

create index index_boxarea
    on nts_boxarea (site_id);

INSERT INTO coldchain_device.nts_boxarea (id, boxarea_name, max_column, max_row, sortord, shellfis_structure, site_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (1183, '01-01', 6, 5, 0, '1', 25, 1, '2020-09-25 09:27:34', '2020-09-25 09:28:10', '', '');
INSERT INTO coldchain_device.nts_boxarea (id, boxarea_name, max_column, max_row, sortord, shellfis_structure, site_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (1187, 'A8-01', 6, 5, 1, '0', 26, 1, '2020-09-25 10:04:11', '2020-09-25 10:04:20', '', '');