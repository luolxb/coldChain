create table nts_site
(
    id               bigint(32) auto_increment comment '编号'
        primary key,
    site_name        varchar(64)            null comment '场地名称',
    box_location_set int(8)                 null comment '箱位设置',
    dept_id          bigint                 null comment '部门|企业ID',
    user_id          bigint                 null comment '用户ID',
    delete_flag      tinyint(1)  default 1  null comment '删除标志 1-正常状态 2-已删除',
    create_time      datetime               null comment '创建时间',
    update_time      datetime               null comment '更新时间',
    create_by        varchar(64) default '' null comment '创建者',
    update_by        varchar(64) default '' null comment '更新者'
)
    comment '场地表';

create index index_site
    on nts_site (site_name, dept_id);

INSERT INTO coldchain_device.nts_site (id, site_name, box_location_set, dept_id, user_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (25, '01', 1, 255, 191, 1, '2020-09-25 09:27:34', '2020-09-25 14:01:50', '', '');
INSERT INTO coldchain_device.nts_site (id, site_name, box_location_set, dept_id, user_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (26, 'A8', 1, 255, 191, 1, '2020-09-25 10:02:33', '2020-09-25 10:04:11', '', '');