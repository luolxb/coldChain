create table sys_dict_data
(
    dict_code   bigint auto_increment comment '字典编码'
        primary key,
    dict_sort   int(4)       default 0   null comment '字典排序',
    dict_label  varchar(100) default ''  null comment '字典标签',
    dict_value  varchar(100) default ''  null comment '字典键值',
    dict_type   varchar(100) default ''  null comment '字典类型',
    css_class   varchar(100)             null comment '样式属性（其他样式扩展）',
    list_class  varchar(100)             null comment '表格回显样式',
    is_default  char         default 'N' null comment '是否默认（Y是 N否）',
    status      char         default '0' null comment '状态（0正常 1停用）',
    create_by   varchar(64)  default ''  null comment '创建者',
    create_time datetime                 null comment '创建时间',
    update_by   varchar(64)  default ''  null comment '更新者',
    update_time datetime                 null comment '更新时间',
    remark      varchar(500)             null comment '备注'
)
    comment '字典数据表';

INSERT INTO coldchain_sys_admin.sys_dict_data (dict_code, dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, create_time, update_by, update_time, remark) VALUES (111, 0, '通知', '1', '消息类型', null, null, 'N', '0', 'admin', '2020-07-28 13:46:33', 'admin', '2020-07-31 11:40:43', null);
INSERT INTO coldchain_sys_admin.sys_dict_data (dict_code, dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, create_time, update_by, update_time, remark) VALUES (112, 0, '公告', '2', '消息类型', null, null, 'N', '0', 'admin', '2020-07-28 13:47:42', 'admin', '2020-07-31 11:40:50', null);
INSERT INTO coldchain_sys_admin.sys_dict_data (dict_code, dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, create_time, update_by, update_time, remark) VALUES (114, 0, '干箱', '干箱', '集装箱类型', null, null, 'N', '0', 'admin', '2020-07-29 16:20:12', 'admin', '2020-07-29 16:20:44', null);
INSERT INTO coldchain_sys_admin.sys_dict_data (dict_code, dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, create_time, update_by, update_time, remark) VALUES (115, 0, '冷箱', '冷箱', '集装箱类型', null, null, 'N', '0', 'admin', '2020-07-29 16:20:56', '', null, null);
INSERT INTO coldchain_sys_admin.sys_dict_data (dict_code, dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, create_time, update_by, update_time, remark) VALUES (116, 0, '灌箱', '灌箱', '集装箱类型', null, null, 'N', '0', 'admin', '2020-07-29 16:21:09', '', null, null);
INSERT INTO coldchain_sys_admin.sys_dict_data (dict_code, dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, create_time, update_by, update_time, remark) VALUES (117, 0, '20DC', '20DC', '集装箱型号', null, null, 'N', '0', 'admin', '2020-07-29 16:22:55', '', null, null);
INSERT INTO coldchain_sys_admin.sys_dict_data (dict_code, dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, create_time, update_by, update_time, remark) VALUES (118, 0, '40DC', '40DC', '集装箱型号', null, null, 'N', '0', 'admin', '2020-07-29 16:22:59', '', null, null);
INSERT INTO coldchain_sys_admin.sys_dict_data (dict_code, dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, create_time, update_by, update_time, remark) VALUES (119, 0, 'NTS3000', 'NTS3000', '设备类型', null, null, 'N', '0', 'admin', '2020-07-30 18:52:39', '', null, null);
INSERT INTO coldchain_sys_admin.sys_dict_data (dict_code, dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, create_time, update_by, update_time, remark) VALUES (121, 0, '追踪', '追踪', '追踪模式', null, null, 'N', '0', 'admin', '2020-07-31 09:21:23', '', null, null);
INSERT INTO coldchain_sys_admin.sys_dict_data (dict_code, dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, create_time, update_by, update_time, remark) VALUES (122, 0, '不追踪', '不追踪', '追踪模式', null, null, 'N', '0', 'admin', '2020-07-31 09:21:31', '', null, null);
INSERT INTO coldchain_sys_admin.sys_dict_data (dict_code, dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, create_time, update_by, update_time, remark) VALUES (123, 0, 'GPS', 'GPS', '定位模式', null, null, 'N', '0', 'admin', '2020-07-31 09:21:58', '', null, null);
INSERT INTO coldchain_sys_admin.sys_dict_data (dict_code, dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, create_time, update_by, update_time, remark) VALUES (124, 0, 'A套餐', 'A套餐', '套餐类型', null, null, 'N', '0', 'admin', '2020-07-31 09:22:14', '', null, null);
INSERT INTO coldchain_sys_admin.sys_dict_data (dict_code, dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, create_time, update_by, update_time, remark) VALUES (125, 0, 'B套餐', 'B套餐', '套餐类型', null, null, 'N', '0', 'admin', '2020-07-31 09:22:21', '', null, null);
INSERT INTO coldchain_sys_admin.sys_dict_data (dict_code, dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, create_time, update_by, update_time, remark) VALUES (126, 0, '正常', '1', '设备状态', null, null, 'N', '0', 'admin', '2020-07-31 11:42:52', '', null, null);
INSERT INTO coldchain_sys_admin.sys_dict_data (dict_code, dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, create_time, update_by, update_time, remark) VALUES (127, 0, '停用', '2', '设备状态', null, null, 'N', '0', 'admin', '2020-07-31 11:42:58', '', null, null);
INSERT INTO coldchain_sys_admin.sys_dict_data (dict_code, dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, create_time, update_by, update_time, remark) VALUES (128, 0, '关闭', '3', '设备状态', null, null, 'N', '0', 'admin', '2020-07-31 11:43:08', '', null, null);
INSERT INTO coldchain_sys_admin.sys_dict_data (dict_code, dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, create_time, update_by, update_time, remark) VALUES (129, 0, 'test', '12', 'sys_user_sex', null, null, 'N', '0', 'admin', '2020-08-07 17:58:50', '', null, null);