create table sys_oper_log
(
    oper_id        bigint auto_increment comment '日志主键'
        primary key,
    title          varchar(50)   default '' null comment '模块标题',
    business_type  int(2)        default 0  null comment '业务类型（0其它 1新增 2修改 3删除）',
    method         varchar(100)  default '' null comment '方法名称',
    request_method varchar(10)   default '' null comment '请求方式',
    operator_type  int(1)        default 0  null comment '操作类别（0其它 1后台用户 2手机端用户）',
    oper_name      varchar(50)   default '' null comment '操作人员',
    dept_name      varchar(50)   default '' null comment '部门名称',
    oper_url       varchar(255)  default '' null comment '请求URL',
    oper_ip        varchar(50)   default '' null comment '主机地址',
    oper_location  varchar(255)  default '' null comment '操作地点',
    oper_param     varchar(2000) default '' null comment '请求参数',
    json_result    varchar(2000) default '' null comment '返回参数',
    status         int(1)        default 0  null comment '操作状态（0正常 1异常）',
    error_msg      varchar(2000) default '' null comment '错误消息',
    oper_time      datetime                 null comment '操作时间'
)
    comment '操作日志记录';

INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (100, '代码生成', 6, 'com.nts.generator.controller.GenController.importTableSave()', 'POST', 1, 'admin', '研发部门', '/tool/gen/importTable', '127.0.0.1', '内网IP', '{
  "tables" : [ "device_temperature,device_reeferdata_log,device_reeferalarms,device_pts,device_other,device_power,device_mode,device_gas" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-06-24 11:20:06');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (101, '代码生成', 8, 'com.nts.generator.controller.GenController.batchGenCode()', 'GET', 1, 'admin', '研发部门', '/tool/gen/batchGenCode', '127.0.0.1', '内网IP', '{
  "tables" : [ "device_gas,device_mode,device_other,device_power,device_pts,device_reeferalarms,device_reeferdata_log,device_temperature" ]
}', 'null', 0, null, '2020-06-24 11:20:28');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (102, '代码生成', 3, 'com.nts.generator.controller.GenController.remove()', 'POST', 1, 'admin', '研发部门', '/tool/gen/remove', '127.0.0.1', '内网IP', '{
  "ids" : [ "1,2,3,4,5,6,7,8" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-06-24 13:24:23');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (103, '代码生成', 6, 'com.nts.generator.controller.GenController.importTableSave()', 'POST', 1, 'admin', '研发部门', '/tool/gen/importTable', '127.0.0.1', '内网IP', '{
  "tables" : [ "device" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-06-24 13:24:33');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (104, '代码生成', 8, 'com.nts.generator.controller.GenController.batchGenCode()', 'GET', 1, 'admin', '研发部门', '/tool/gen/batchGenCode', '127.0.0.1', '内网IP', '{
  "tables" : [ "device" ]
}', 'null', 0, null, '2020-06-24 13:24:50');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (105, '代码生成', 6, 'com.nts.generator.controller.GenController.importTableSave()', 'POST', 1, 'admin', '研发部门', '/tool/gen/importTable', '127.0.0.1', '内网IP', '{
  "tables" : [ "nts_boxlocation,nts_device_container,nts_container,nts_goods_allocation,nts_site" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-07-20 14:37:17');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (106, '代码生成', 3, 'com.nts.generator.controller.GenController.remove()', 'POST', 1, 'admin', '研发部门', '/tool/gen/remove', '127.0.0.1', '内网IP', '{
  "ids" : [ "9" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-07-20 14:37:24');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (107, '代码生成', 8, 'com.nts.generator.controller.GenController.batchGenCode()', 'GET', 1, 'admin', '研发部门', '/tool/gen/batchGenCode', '127.0.0.1', '内网IP', '{
  "tables" : [ "nts_boxlocation,nts_container,nts_device_container,nts_goods_allocation,nts_site" ]
}', 'null', 0, null, '2020-07-20 14:39:49');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (108, '代码生成', 8, 'com.nts.generator.controller.GenController.batchGenCode()', 'GET', 1, 'admin', '研发部门', '/tool/gen/batchGenCode', '127.0.0.1', '内网IP', '{
  "tables" : [ "nts_boxlocation,nts_container,nts_device_container,nts_goods_allocation,nts_site" ]
}', 'null', 0, null, '2020-07-20 14:41:32');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (109, '重置密码', 2, 'com.nts.web.controller.system.SysUserController.resetPwd()', 'GET', 1, 'admin', '研发部门', '/system/user/resetPwd/1', '127.0.0.1', '内网IP', '{ }', '"system/user/resetPwd"', 0, null, '2020-07-21 15:29:29');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (110, '代码生成', 3, 'com.nts.generator.controller.GenController.remove()', 'POST', 1, 'admin', '研发部门', '/tool/gen/remove', '127.0.0.1', '内网IP', '{
  "ids" : [ "10,11,12,13,14" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-07-24 08:55:41');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (111, '代码生成', 6, 'com.nts.generator.controller.GenController.importTableSave()', 'POST', 1, 'admin', '研发部门', '/tool/gen/importTable', '127.0.0.1', '内网IP', '{
  "tables" : [ "nts_box_position,nts_boxarea,nts_shellfis" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-07-24 08:56:52');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (112, '代码生成', 8, 'com.nts.generator.controller.GenController.batchGenCode()', 'GET', 1, 'admin', '研发部门', '/tool/gen/batchGenCode', '127.0.0.1', '内网IP', '{
  "tables" : [ "nts_box_position,nts_boxarea,nts_shellfis" ]
}', 'null', 0, null, '2020-07-24 08:56:58');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (113, '用户管理', 2, 'com.nts.web.controller.system.SysUserController.changeStatus()', 'POST', 1, 'admin', '研发部门', '/system/user/changeStatus', '192.168.31.35', '内网IP', '{
  "userId" : [ "2" ],
  "status" : [ "1" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-07-24 14:25:45');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (114, '用户管理', 2, 'com.nts.web.controller.system.SysUserController.changeStatus()', 'POST', 1, 'admin', '研发部门', '/system/user/changeStatus', '192.168.31.35', '内网IP', '{
  "userId" : [ "2" ],
  "status" : [ "0" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-07-24 14:25:48');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (115, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '192.168.31.35', '内网IP', '{
  "parentId" : [ "0" ],
  "menuType" : [ "M" ],
  "menuName" : [ "test" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "" ],
  "orderNum" : [ "4" ],
  "icon" : [ "fa fa-adjust" ],
  "visible" : [ "0" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-07-24 14:31:59');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (116, '代码生成', 3, 'com.nts.generator.controller.GenController.remove()', 'POST', 1, 'admin', '研发部门', '/tool/gen/remove', '127.0.0.1', '内网IP', '{
  "ids" : [ "15,16,17" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-07-24 15:22:07');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (117, '角色管理', 1, 'com.nts.web.controller.system.SysRoleController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/role/add', '192.168.31.35', '内网IP', '{
  "roleName" : [ "司机" ],
  "roleKey" : [ "1" ],
  "roleSort" : [ "1" ],
  "status" : [ "0" ],
  "remark" : [ "" ],
  "menuIds" : [ "2006,2015,2012,2016,2017,2018,2019,2021" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-07-27 13:21:05');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (118, '角色管理', 2, 'com.nts.web.controller.system.SysRoleController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/role/edit', '192.168.31.35', '内网IP', '{
  "roleId" : [ "1" ],
  "roleName" : [ "管理员" ],
  "roleKey" : [ "admin" ],
  "roleSort" : [ "1" ],
  "status" : [ "0" ],
  "remark" : [ "管理员" ],
  "menuIds" : [ "1,2005,100,1000,1001,1002,1003,1004,1005,1006,101,1007,1008,1009,1010,1011,102,1012,1013,1014,1015,103,1016,1017,1018,1019,104,1020,1021,1022,1023,1024,105,1025,1026,1027,1028,1029,106,1030,1031,1032,1033,1034,107,1035,1036,1037,1038,108,500,1039,1040,1041,1042,501,1043,1044,1045,1046,116,1062,1063,1064,1065" ]
}', 'null', 1, '不允许操作超级管理员角色', '2020-07-27 14:29:21');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (119, '字典数据', 1, 'com.nts.web.controller.system.SysDictDataController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/dict/data/add', '192.168.31.35', '内网IP', '{
  "dictLabel" : [ "系统通知" ],
  "dictValue" : [ "1" ],
  "dictType" : [ "sys_notice_type" ],
  "cssClass" : [ "" ],
  "dictSort" : [ "1" ],
  "listClass" : [ "" ],
  "isDefault" : [ "Y" ],
  "status" : [ "0" ],
  "remark" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-07-27 15:58:03');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (120, '通知公告', 1, 'com.nts.web.controller.system.SysNoticeController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/notice/add', '192.168.31.35', '内网IP', '{
  "noticeTitle" : [ "test" ],
  "noticeType" : [ "1" ],
  "noticeContent" : [ "<p><br></p>" ],
  "status" : [ "0" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-07-27 15:58:24');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (121, '通知公告', 1, 'com.nts.web.controller.system.SysNoticeController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/notice/add', '192.168.31.35', '内网IP', '{
  "noticeTitle" : [ "123" ],
  "noticeType" : [ "1" ],
  "noticeContent" : [ "<p>地方</p>" ],
  "status" : [ "0" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-07-27 15:59:02');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (122, '字典类型', 1, 'com.nts.web.controller.system.SysDictTypeController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/dict/add', '192.168.31.35', '内网IP', '{
  "dictName" : [ "吞吞吐吐拖" ],
  "dictType" : [ "打的发发发呆" ],
  "status" : [ "0" ],
  "remark" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-07-27 16:42:17');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (123, '字典类型', 2, 'com.nts.web.controller.system.SysDictTypeController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/dict/edit', '192.168.31.35', '内网IP', '{
  "dictId" : [ "102" ],
  "dictName" : [ "吞吞吐吐拖1" ],
  "dictType" : [ "打的发发发呆" ],
  "status" : [ "0" ],
  "remark" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-07-27 16:44:44');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (124, '字典类型', 2, 'com.nts.web.controller.system.SysDictTypeController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/dict/edit', '192.168.31.35', '内网IP', '{
  "dictId" : [ "102" ],
  "dictName" : [ "吞吞吐吐拖2" ],
  "dictType" : [ "打的发发发呆" ],
  "status" : [ "0" ],
  "remark" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-07-27 16:44:51');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (125, '字典类型', 3, 'com.nts.web.controller.system.SysDictTypeController.remove()', 'POST', 1, 'admin', '研发部门', '/system/dict/remove', '192.168.31.35', '内网IP', '{
  "ids" : [ "102" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-07-27 16:45:39');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (126, '字典类型', 3, 'com.nts.web.controller.system.SysDictTypeController.remove()', 'POST', 1, 'admin', '研发部门', '/system/dict/remove', '192.168.31.35', '内网IP', '{
  "ids" : [ "101" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-07-27 16:45:42');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (127, '字典类型', 3, 'com.nts.web.controller.system.SysDictTypeController.remove()', 'POST', 1, 'admin', '研发部门', '/system/dict/remove', '192.168.31.35', '内网IP', '{
  "ids" : [ "100" ]
}', '{
  "msg" : "qqqqq已分配,不能删除",
  "code" : 500
}', 0, null, '2020-07-27 16:45:44');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (128, '字典类型', 1, 'com.nts.web.controller.system.SysDictTypeController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/dict/add', '192.168.31.35', '内网IP', '{
  "dictName" : [ "发 打算发呆" ],
  "dictType" : [ " 发送到发呆" ],
  "status" : [ "0" ],
  "remark" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-07-27 16:46:54');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (129, '字典数据', 1, 'com.nts.web.controller.system.SysDictDataController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/dict/data/add', '192.168.31.35', '内网IP', '{
  "dictLabel" : [ "发多少sadfd" ],
  "dictValue" : [ "安防十大范德萨fdsa" ],
  "dictType" : [ " 发送到发呆" ],
  "cssClass" : [ "范德萨范德萨发达" ],
  "dictSort" : [ "1" ],
  "listClass" : [ "" ],
  "isDefault" : [ "Y" ],
  "status" : [ "0" ],
  "remark" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-07-27 16:47:12');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (130, '字典类型', 3, 'com.nts.web.controller.system.SysDictTypeController.remove()', 'POST', 1, 'admin', '研发部门', '/system/dict/remove', '192.168.31.35', '内网IP', '{
  "ids" : [ "103,100" ]
}', '{
  "msg" : "发 打算发呆已分配,不能删除",
  "code" : 500
}', 0, null, '2020-07-27 16:47:24');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (131, '字典类型', 3, 'com.nts.web.controller.system.SysDictTypeController.remove()', 'POST', 1, 'admin', '研发部门', '/system/dict/remove', '192.168.31.35', '内网IP', '{
  "ids" : [ "103" ]
}', '{
  "msg" : "发 打算发呆已分配,不能删除",
  "code" : 500
}', 0, null, '2020-07-27 16:47:42');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (132, '字典数据', 3, 'com.nts.web.controller.system.SysDictDataController.remove()', 'POST', 1, 'admin', '研发部门', '/system/dict/data/remove', '192.168.31.35', '内网IP', '{
  "ids" : [ "102" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-07-27 16:47:47');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (133, '字典类型', 3, 'com.nts.web.controller.system.SysDictTypeController.remove()', 'POST', 1, 'admin', '研发部门', '/system/dict/remove', '192.168.31.35', '内网IP', '{
  "ids" : [ "103" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-07-27 16:48:23');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (134, '字典数据', 1, 'com.nts.web.controller.system.SysDictDataController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/dict/data/add', '192.168.31.35', '内网IP', '{
  "dictLabel" : [ "222" ],
  "dictValue" : [ "111" ],
  "dictType" : [ "sys_user_sex" ],
  "cssClass" : [ "" ],
  "dictSort" : [ "1" ],
  "listClass" : [ "" ],
  "isDefault" : [ "Y" ],
  "status" : [ "0" ],
  "remark" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-07-27 18:39:18');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (135, '用户管理', 1, 'com.nts.web.controller.system.SysUserController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/user/add', '192.168.31.35', '内网IP', '{
  "deptId" : [ "104" ],
  "userName" : [ "test" ],
  "deptName" : [ "市场部门" ],
  "phonenumber" : [ "13055416654" ],
  "email" : [ "tangbin@163.com" ],
  "loginName" : [ "111" ],
  "password" : [ "123456" ],
  "role" : [ "2" ],
  "remark" : [ "" ],
  "status" : [ "0" ],
  "roleIds" : [ "2" ],
  "postIds" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-07-28 14:55:56');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (136, '用户管理', 2, 'com.nts.web.controller.system.SysUserController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/user/edit', '192.168.31.35', '内网IP', '{
  "userId" : [ "104" ],
  "deptId" : [ "104" ],
  "userName" : [ "test" ],
  "dept.deptName" : [ "市场部门" ],
  "phonenumber" : [ "13055416654" ],
  "email" : [ "tangbin@163.com" ],
  "loginName" : [ "111" ],
  "role" : [ "2", "100" ],
  "remark" : [ "" ],
  "status" : [ "0" ],
  "roleIds" : [ "2,100" ],
  "postIds" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-07-28 14:56:57');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (137, '用户管理', 2, 'com.nts.web.controller.system.SysUserController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/user/edit', '192.168.31.35', '内网IP', '{
  "userId" : [ "104" ],
  "deptId" : [ "104" ],
  "userName" : [ "test" ],
  "dept.deptName" : [ "市场部门" ],
  "phonenumber" : [ "13055416654" ],
  "email" : [ "tangbin@163.com" ],
  "loginName" : [ "111" ],
  "role" : [ "1" ],
  "remark" : [ "" ],
  "status" : [ "0" ],
  "roleIds" : [ "1" ],
  "postIds" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-07-28 15:01:37');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (138, '用户管理', 2, 'com.nts.web.controller.system.SysUserController.changeStatus()', 'POST', 1, 'admin', '研发部门', '/system/user/changeStatus', '127.0.0.1', '内网IP', '{
  "userId" : [ "2" ],
  "status" : [ "1" ]
}', '{
  "msg" : "操作失败",
  "code" : 500
}', 0, null, '2020-07-28 17:49:49');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (139, '用户管理', 2, 'com.nts.web.controller.system.SysUserController.changeStatus()', 'POST', 1, 'admin', '研发部门', '/system/user/changeStatus', '127.0.0.1', '内网IP', '{
  "userId" : [ "103" ],
  "status" : [ "1" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-07-28 17:49:58');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (140, '用户管理', 2, 'com.nts.web.controller.system.SysUserController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/user/edit', '127.0.0.1', '内网IP', '{
  "userId" : [ "2" ],
  "deptId" : [ "105" ],
  "userName" : [ "管理员" ],
  "dept.deptName" : [ "测试部门" ],
  "phonenumber" : [ "15666666666" ],
  "email" : [ "ry@qq.com" ],
  "loginName" : [ "ry" ],
  "role" : [ "2" ],
  "remark" : [ "测试员" ],
  "status" : [ "0" ],
  "roleIds" : [ "2" ],
  "postIds" : [ "2" ]
}', '{
  "msg" : "操作失败",
  "code" : 500
}', 0, null, '2020-07-28 17:50:14');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (141, '用户管理', 2, 'com.nts.web.controller.system.SysUserController.changeStatus()', 'POST', 1, 'admin', '研发部门', '/system/user/changeStatus', '127.0.0.1', '内网IP', '{
  "userId" : [ "1" ],
  "status" : [ "0" ]
}', 'null', 1, '不允许操作超级管理员用户', '2020-07-28 17:50:26');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (142, '用户管理', 2, 'com.nts.web.controller.system.SysUserController.changeStatus()', 'POST', 1, 'admin', '研发部门', '/system/user/changeStatus', '127.0.0.1', '内网IP', '{
  "userId" : [ "1" ],
  "status" : [ "0" ]
}', 'null', 1, '不允许操作超级管理员用户', '2020-07-28 17:50:35');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (143, '用户管理', 2, 'com.nts.web.controller.system.SysUserController.changeStatus()', 'POST', 1, 'admin', '研发部门', '/system/user/changeStatus', '127.0.0.1', '内网IP', '{
  "userId" : [ "2" ],
  "status" : [ "1" ]
}', '{
  "msg" : "操作失败",
  "code" : 500
}', 0, null, '2020-07-28 17:50:43');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (144, '用户管理', 2, 'com.nts.web.controller.system.SysUserController.changeStatus()', 'POST', 1, 'admin', '研发部门', '/system/user/changeStatus', '127.0.0.1', '内网IP', '{
  "userId" : [ "2" ],
  "status" : [ "1" ]
}', '{
  "msg" : "操作失败",
  "code" : 500
}', 0, null, '2020-07-28 17:53:14');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (145, '用户管理', 2, 'com.nts.web.controller.system.SysUserController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/user/edit', '127.0.0.1', '内网IP', '{
  "userId" : [ "2" ],
  "deptId" : [ "105" ],
  "userName" : [ "管理员" ],
  "dept.deptName" : [ "测试部门" ],
  "phonenumber" : [ "15666666666" ],
  "email" : [ "ry@qq.com" ],
  "loginName" : [ "ry" ],
  "role" : [ "2" ],
  "remark" : [ "测试员" ],
  "status" : [ "0" ],
  "roleIds" : [ "2" ],
  "postIds" : [ "2" ]
}', '{
  "msg" : "操作失败",
  "code" : 500
}', 0, null, '2020-07-28 17:53:32');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (146, '用户管理', 2, 'com.nts.web.controller.system.SysUserController.changeStatus()', 'POST', 1, 'admin', '研发部门', '/system/user/changeStatus', '127.0.0.1', '内网IP', '{
  "userId" : [ "104" ],
  "status" : [ "1" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-07-28 18:00:58');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (147, '用户管理', 2, 'com.nts.web.controller.system.SysUserController.changeStatus()', 'POST', 1, 'admin', '研发部门', '/system/user/changeStatus', '127.0.0.1', '内网IP', '{
  "userId" : [ "104" ],
  "status" : [ "0" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-07-28 18:01:00');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (148, '用户管理', 2, 'com.nts.web.controller.system.SysUserController.changeStatus()', 'POST', 1, 'admin', '研发部门', '/system/user/changeStatus', '127.0.0.1', '内网IP', '{
  "userId" : [ "2" ],
  "status" : [ "1" ]
}', '{
  "msg" : "操作失败",
  "code" : 500
}', 0, null, '2020-07-28 18:06:30');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (149, '角色管理', 4, 'com.nts.web.controller.system.SysRoleController.cancelAuthUser()', 'POST', 1, 'admin', '研发部门', '/system/role/authUser/cancel', '127.0.0.1', '内网IP', '{
  "roleId" : [ "2" ],
  "userId" : [ "2" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-07-28 18:07:09');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (150, '用户管理', 2, 'com.nts.web.controller.system.SysUserController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/user/edit', '127.0.0.1', '内网IP', '{
  "userId" : [ "2" ],
  "deptId" : [ "105" ],
  "userName" : [ "管理员" ],
  "dept.deptName" : [ "测试部门" ],
  "phonenumber" : [ "15666666666" ],
  "email" : [ "ry@qq.com" ],
  "loginName" : [ "ry" ],
  "role" : [ "2" ],
  "remark" : [ "测试员" ],
  "status" : [ "0" ],
  "roleIds" : [ "2" ],
  "postIds" : [ "2" ]
}', '{
  "msg" : "操作失败",
  "code" : 500
}', 0, null, '2020-07-28 18:07:17');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (151, '角色管理', 4, 'com.nts.web.controller.system.SysRoleController.selectAuthUserAll()', 'POST', 1, 'admin', '研发部门', '/system/role/authUser/selectAll', '127.0.0.1', '内网IP', '{
  "roleId" : [ "2" ],
  "userIds" : [ "1,103,104" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-07-28 18:07:37');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (152, '用户管理', 2, 'com.nts.web.controller.system.SysUserController.changeStatus()', 'POST', 1, 'admin', '研发部门', '/system/user/changeStatus', '127.0.0.1', '内网IP', '{
  "userId" : [ "2" ],
  "status" : [ "1" ]
}', '{
  "msg" : "操作失败",
  "code" : 500
}', 0, null, '2020-07-28 18:08:03');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (153, '用户管理', 2, 'com.nts.web.controller.system.SysUserController.changeStatus()', 'POST', 1, 'admin', '研发部门', '/system/user/changeStatus', '127.0.0.1', '内网IP', '{
  "userId" : [ "2" ],
  "status" : [ "1" ]
}', '{
  "msg" : "操作失败",
  "code" : 500
}', 0, null, '2020-07-28 18:10:22');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (154, '用户管理', 2, 'com.nts.web.controller.system.SysUserController.changeStatus()', 'POST', 1, 'admin', '研发部门', '/system/user/changeStatus', '127.0.0.1', '内网IP', '{
  "userId" : [ "2" ],
  "status" : [ "1" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-07-28 18:13:41');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (155, '用户管理', 2, 'com.nts.web.controller.system.SysUserController.changeStatus()', 'POST', 1, 'admin', '研发部门', '/system/user/changeStatus', '127.0.0.1', '内网IP', '{
  "userId" : [ "2" ],
  "status" : [ "0" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-07-28 18:13:44');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (156, '用户管理', 2, 'com.nts.web.controller.system.SysUserController.changeStatus()', 'POST', 1, 'admin', '研发部门', '/system/user/changeStatus', '127.0.0.1', '内网IP', '{
  "userId" : [ "2" ],
  "status" : [ "1" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-07-28 18:20:36');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (157, '用户管理', 2, 'com.nts.web.controller.system.SysUserController.changeStatus()', 'POST', 1, 'admin', '研发部门', '/system/user/changeStatus', '127.0.0.1', '内网IP', '{
  "userId" : [ "2" ],
  "status" : [ "0" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-07-28 18:20:39');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (158, '角色管理', 2, 'com.nts.web.controller.system.SysRoleController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/role/edit', '127.0.0.1', '内网IP', '{
  "roleId" : [ "1" ],
  "roleName" : [ "超级管理员" ],
  "roleKey" : [ "admin" ],
  "roleSort" : [ "1" ],
  "status" : [ "0" ],
  "remark" : [ "管理员" ],
  "menuIds" : [ "" ]
}', 'null', 1, '不允许操作超级管理员角色', '2020-07-30 09:30:23');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (159, '角色管理', 1, 'com.nts.web.controller.system.SysRoleController.addSave()', 'POST', 1, '123', null, '/system/role/add', '192.168.31.35', '内网IP', '{
  "roleName" : [ "pp" ],
  "roleKey" : [ "0" ],
  "roleSort" : [ "0" ],
  "status" : [ "0" ],
  "remark" : [ "0" ],
  "menuIds" : [ "1,100,1000,1001,1002,1003,1004,1005,1006,101,1007,1008,1009,1010,1011,102,1012,1013,1014,1015,103,1016,1017,1018,1019,104,1020,1021,1022,1023,1024,105,1025,1026,1027,1028,1029,106,1030,1031,1032,1033,1034,107,1035,1036,1037,1038,108,500,1039,1040,1041,1042,501,1043,1044,1045,1046" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-07-30 11:36:33');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (160, '角色管理', 1, 'com.nts.web.controller.system.SysRoleController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/role/add', '192.168.31.35', '内网IP', '{
  "roleName" : [ "ll" ],
  "roleKey" : [ "ll" ],
  "roleSort" : [ "0" ],
  "status" : [ "0" ],
  "remark" : [ "" ],
  "menuIds" : [ "2006,2015,2007" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-07-30 11:39:29');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (161, '角色管理', 2, 'com.nts.web.controller.system.SysRoleController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/role/edit', '192.168.31.35', '内网IP', '{
  "roleId" : [ "107" ],
  "roleName" : [ "pp" ],
  "roleKey" : [ "0" ],
  "roleSort" : [ "0" ],
  "status" : [ "0" ],
  "remark" : [ "0" ],
  "menuIds" : [ "2006,2015,2008,2012,2016,2017,2018,2019,2021,2022,2023,1,100,1000,1001,1002,1003,1004,1005,1006,101,1007,1008,1009,1010,1011,102,1012,1013,1014,1015,103,1016,1017,1018,1019,104,1020,1021,1022,1023,1024,105,1025,1026,1027,1028,1029,106,1030,1031,1032,1033,1034,107,1035,1036,1037,1038,108,500,1039,1040,1041,1042,501,1043,1044,1045,1046" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-07-30 13:33:19');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (162, '角色管理', 2, 'com.nts.web.controller.system.SysRoleController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/role/edit', '192.168.31.35', '内网IP', '{
  "roleId" : [ "2" ],
  "roleName" : [ "普通角色" ],
  "roleKey" : [ "common" ],
  "roleSort" : [ "2" ],
  "status" : [ "0" ],
  "remark" : [ "普通角色" ],
  "menuIds" : [ "1,100,1000,1001,1002,1003,1004,1005,1006,101,1007,1008,1009,1010,1011,102,1012,1013,1014,1015,103,1016,1017,1018,1019,104,1020,1021,1022,1023,1024,105,1025,1026,1027,1028,1029,106,1030,1031,1032,1033,1034,107,1035,1036,1037,1038,108,500,501,2,109,1047,1048,1049,110,1050,1051,1052,1053,1054,1055,1056,111,112,3,113,114,1057,1058,1060,115" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-07-30 14:49:01');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (163, '用户管理', 1, 'com.nts.web.controller.system.SysUserController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/user/add', '192.168.31.35', '内网IP', '{
  "deptId" : [ "103" ],
  "userName" : [ "321" ],
  "deptName" : [ "研发部门" ],
  "phonenumber" : [ "13055416654" ],
  "email" : [ "tangbin@163.com" ],
  "loginName" : [ "321" ],
  "password" : [ "123456" ],
  "role" : [ "2" ],
  "remark" : [ "" ],
  "status" : [ "0" ],
  "roleIds" : [ "2" ],
  "postIds" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-07-30 14:49:52');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (164, '角色管理', 2, 'com.nts.web.controller.system.SysRoleController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/role/edit', '192.168.31.35', '内网IP', '{
  "roleId" : [ "2" ],
  "roleName" : [ "普通角色" ],
  "roleKey" : [ "common" ],
  "roleSort" : [ "2" ],
  "status" : [ "0" ],
  "remark" : [ "普通角色" ],
  "menuIds" : [ "1,100,1000,1001,1002,1003,1004,1005,1006,101,1007,1008,1009,1010,1011,102,1012,1013,1014,1015,103,1016,1017,1018,1019,104,1020,1021,1022,1023,1024,105,1025,1026,1027,1028,1029,106,1030,1031,1032,1033,1034,107,1035,1036,1037,1038,108,500,501,2,109,1047,1048,1049,110,1050,1051,1052,1053,1054,1055,1056,111,112,3,113,114,1058,1060,115" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-07-30 15:25:50');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (165, '导出设备列表', 5, 'com.nts.business.api.DeviceApiController.export()', 'POST', 1, 'admin', '研发部门', '/api/device/export', '192.168.31.35', '内网IP', '{
  "deptId" : [ "" ],
  "deviceName" : [ "" ],
  "pageNum" : [ "1" ],
  "pageSize" : [ "10" ],
  "typeName" : [ "" ]
}', '{
  "code" : 0,
  "msg" : "导出成功",
  "data" : {
    "msg" : "15a5609c-e91a-4ac5-b903-a26f3e5d89a6_device.xlsx",
    "code" : 0
  }
}', 0, null, '2020-07-31 14:50:46');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (166, '箱位', 3, 'com.nts.business.api.BoxPostitonApiContrtoller.removeBoxPosition()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/removeBoxPosition', '192.168.31.35', '内网IP', '{
  "ids" : [ "9" ]
}', '{
  "code" : 55,
  "msg" : "删除贝图箱位失败"
}', 0, null, '2020-08-01 13:32:27');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (167, '箱位', 3, 'com.nts.business.api.BoxPostitonApiContrtoller.removeBoxPosition()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/removeBoxPosition', '192.168.31.35', '内网IP', '{
  "ids" : [ "9" ]
}', '{
  "code" : 55,
  "msg" : "删除贝图箱位失败"
}', 0, null, '2020-08-01 13:33:02');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (168, '箱位', 3, 'com.nts.business.api.BoxPostitonApiContrtoller.removeBoxPosition()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/removeBoxPosition', '192.168.31.35', '内网IP', '{
  "ids" : [ "9" ]
}', '{
  "code" : 55,
  "msg" : "删除贝图箱位失败"
}', 0, null, '2020-08-01 13:33:34');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (169, '贝图箱位', 1, 'com.nts.business.api.BoxPostitonApiContrtoller.addBoxPostiton()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/addBoxPostiton', '127.0.0.1', '内网IP', '{ }', 'null', 1, 'nested exception is org.apache.ibatis.exceptions.TooManyResultsException: Expected one result (or null) to be returned by selectOne(), but found: 2', '2020-08-04 15:27:19');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (170, '菜单管理', 3, 'com.nts.web.controller.system.SysMenuController.remove()', 'GET', 1, 'admin', '研发部门', '/system/menu/remove/2015', '127.0.0.1', '内网IP', '{ }', '{
  "msg" : "菜单已分配,不允许删除",
  "code" : 301
}', 0, null, '2020-08-05 09:56:24');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (171, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2006" ],
  "menuType" : [ "C" ],
  "menuName" : [ "实时数据" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "business:sc:realTimeData" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 10:08:47');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (172, '角色管理', 2, 'com.nts.web.controller.system.SysRoleController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/role/edit', '127.0.0.1', '内网IP', '{
  "roleId" : [ "2" ],
  "roleName" : [ "普通角色" ],
  "roleKey" : [ "common" ],
  "roleSort" : [ "2" ],
  "status" : [ "0" ],
  "remark" : [ "普通角色" ],
  "menuIds" : [ "100,1000,1001,1002,1003,1004,1005,1006,101,1007,1008,1009,1010,1011,102,1012,1013,1014,1015,103,1016,1017,1018,1019,104,1020,1021,1022,1023,1024,105,1025,1026,1027,1028,1029,106,1030,1031,1032,1033,1034,107,1035,1036,1037,1038,108,500,501,109,1047,1048,1049,110,1050,1051,1052,1053,1054,1055,1056,111,112,113,114,1058,1060,115" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 10:11:13');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (173, '菜单管理', 3, 'com.nts.web.controller.system.SysMenuController.remove()', 'GET', 1, 'admin', '研发部门', '/system/menu/remove/2015', '127.0.0.1', '内网IP', '{ }', '{
  "msg" : "菜单已分配,不允许删除",
  "code" : 301
}', 0, null, '2020-08-05 10:11:24');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (174, '菜单管理', 3, 'com.nts.web.controller.system.SysMenuController.remove()', 'GET', 1, 'admin', '研发部门', '/system/menu/remove/2015', '127.0.0.1', '内网IP', '{ }', '{
  "msg" : "菜单已分配,不允许删除",
  "code" : 301
}', 0, null, '2020-08-05 10:11:37');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (175, '菜单管理', 2, 'com.nts.web.controller.system.SysMenuController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/edit', '127.0.0.1', '内网IP', '{
  "menuId" : [ "2006" ],
  "parentId" : [ "0" ],
  "menuType" : [ "C" ],
  "menuName" : [ "监控中心" ],
  "url" : [ "/api/sc" ],
  "target" : [ "menuItem" ],
  "perms" : [ "" ],
  "orderNum" : [ "0" ],
  "icon" : [ "#" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 10:13:53');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (176, '菜单管理', 2, 'com.nts.web.controller.system.SysMenuController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/edit', '127.0.0.1', '内网IP', '{
  "menuId" : [ "2015" ],
  "parentId" : [ "2006" ],
  "menuType" : [ "F" ],
  "menuName" : [ "666" ],
  "url" : [ "#" ],
  "target" : [ "menuItem" ],
  "perms" : [ "" ],
  "orderNum" : [ "0" ],
  "icon" : [ "#" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 10:14:16');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (177, '菜单管理', 3, 'com.nts.web.controller.system.SysMenuController.remove()', 'GET', 1, 'admin', '研发部门', '/system/menu/remove/2015', '127.0.0.1', '内网IP', '{ }', '{
  "msg" : "菜单已分配,不允许删除",
  "code" : 301
}', 0, null, '2020-08-05 10:14:24');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (178, '菜单管理', 2, 'com.nts.web.controller.system.SysMenuController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/edit', '127.0.0.1', '内网IP', '{
  "menuId" : [ "2006" ],
  "parentId" : [ "0" ],
  "menuType" : [ "M" ],
  "menuName" : [ "监控中心" ],
  "url" : [ "/api/sc" ],
  "target" : [ "menuItem" ],
  "perms" : [ "" ],
  "orderNum" : [ "0" ],
  "icon" : [ "#" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 10:15:51');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (179, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2006" ],
  "menuType" : [ "C" ],
  "menuName" : [ "历史数据" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "business:sc:historyData" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 10:16:56');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (180, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2006" ],
  "menuType" : [ "C" ],
  "menuName" : [ "事件数据" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "business:sc:eventData" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 10:20:01');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (181, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2006" ],
  "menuType" : [ "F" ],
  "menuName" : [ "数据概览" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "business:sc:DataOverView" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 10:20:45');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (182, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2006" ],
  "menuType" : [ "C" ],
  "menuName" : [ "监控日志" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "business:sc:MonitoringLog" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 10:22:25');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (183, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2006" ],
  "menuType" : [ "C" ],
  "menuName" : [ "温度曲线" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "business:sc:TemperatureCurve" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 10:22:52');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (184, '菜单管理', 3, 'com.nts.web.controller.system.SysMenuController.remove()', 'GET', 1, 'admin', '研发部门', '/system/menu/remove/2016', '127.0.0.1', '内网IP', '{ }', '{
  "msg" : "存在子菜单,不允许删除",
  "code" : 301
}', 0, null, '2020-08-05 10:23:42');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (185, '菜单管理', 3, 'com.nts.web.controller.system.SysMenuController.remove()', 'GET', 1, 'admin', '研发部门', '/system/menu/remove/2017', '127.0.0.1', '内网IP', '{ }', '{
  "msg" : "菜单已分配,不允许删除",
  "code" : 301
}', 0, null, '2020-08-05 10:23:49');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (186, '菜单管理', 3, 'com.nts.web.controller.system.SysMenuController.remove()', 'GET', 1, 'admin', '研发部门', '/system/menu/remove/2012', '127.0.0.1', '内网IP', '{ }', '{
  "msg" : "存在子菜单,不允许删除",
  "code" : 301
}', 0, null, '2020-08-05 10:46:19');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (187, '菜单管理', 3, 'com.nts.web.controller.system.SysMenuController.remove()', 'GET', 1, 'admin', '研发部门', '/system/menu/remove/2017', '127.0.0.1', '内网IP', '{ }', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 10:47:33');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (188, '菜单管理', 3, 'com.nts.web.controller.system.SysMenuController.remove()', 'GET', 1, 'admin', '研发部门', '/system/menu/remove/2016', '127.0.0.1', '内网IP', '{ }', '{
  "msg" : "存在子菜单,不允许删除",
  "code" : 301
}', 0, null, '2020-08-05 10:47:39');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (189, '菜单管理', 3, 'com.nts.web.controller.system.SysMenuController.remove()', 'GET', 1, 'admin', '研发部门', '/system/menu/remove/2018', '127.0.0.1', '内网IP', '{ }', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 10:47:46');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (190, '菜单管理', 3, 'com.nts.web.controller.system.SysMenuController.remove()', 'GET', 1, 'admin', '研发部门', '/system/menu/remove/2019', '127.0.0.1', '内网IP', '{ }', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 10:47:55');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (191, '菜单管理', 3, 'com.nts.web.controller.system.SysMenuController.remove()', 'GET', 1, 'admin', '研发部门', '/system/menu/remove/2021', '127.0.0.1', '内网IP', '{ }', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 10:48:03');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (192, '菜单管理', 3, 'com.nts.web.controller.system.SysMenuController.remove()', 'GET', 1, 'admin', '研发部门', '/system/menu/remove/2016', '127.0.0.1', '内网IP', '{ }', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 10:48:11');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (193, '菜单管理', 3, 'com.nts.web.controller.system.SysMenuController.remove()', 'GET', 1, 'admin', '研发部门', '/system/menu/remove/2007', '127.0.0.1', '内网IP', '{ }', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 10:48:17');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (194, '菜单管理', 2, 'com.nts.web.controller.system.SysMenuController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/edit', '127.0.0.1', '内网IP', '{
  "menuId" : [ "2012" ],
  "parentId" : [ "0" ],
  "menuType" : [ "M" ],
  "menuName" : [ "系统中心" ],
  "url" : [ "#" ],
  "target" : [ "menuItem" ],
  "perms" : [ "" ],
  "orderNum" : [ "0" ],
  "icon" : [ "#" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 10:48:27');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (195, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2012" ],
  "menuType" : [ "M" ],
  "menuName" : [ "用户管理" ],
  "url" : [ "/api/sysuser" ],
  "target" : [ "menuItem" ],
  "perms" : [ "" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 10:55:21');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (196, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2032" ],
  "menuType" : [ "F" ],
  "menuName" : [ "重置密码" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "system:user:resetPwd" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 10:56:44');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (197, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2032" ],
  "menuType" : [ "F" ],
  "menuName" : [ "新增用户" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "system:user:add" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 10:57:25');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (198, '菜单管理', 3, 'com.nts.web.controller.system.SysMenuController.remove()', 'GET', 1, 'admin', '研发部门', '/system/menu/remove/2008', '127.0.0.1', '内网IP', '{ }', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 10:57:32');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (199, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2032" ],
  "menuType" : [ "F" ],
  "menuName" : [ "修改用户信息" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "system:user:edit" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 10:58:14');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (200, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2032" ],
  "menuType" : [ "F" ],
  "menuName" : [ "查询用户列表" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "system:user:list" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 10:58:51');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (201, '菜单管理', 2, 'com.nts.web.controller.system.SysMenuController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/edit', '127.0.0.1', '内网IP', '{
  "menuId" : [ "2036" ],
  "parentId" : [ "2032" ],
  "menuType" : [ "F" ],
  "menuName" : [ "查询用户" ],
  "url" : [ "#" ],
  "target" : [ "menuItem" ],
  "perms" : [ "system:user:list" ],
  "orderNum" : [ "0" ],
  "icon" : [ "#" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 10:59:22');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (202, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2032" ],
  "menuType" : [ "F" ],
  "menuName" : [ "删除用户" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "system:user:remove" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 11:01:01');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (203, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2012" ],
  "menuType" : [ "M" ],
  "menuName" : [ "角色管理" ],
  "url" : [ "/api/sysrole" ],
  "target" : [ "menuItem" ],
  "perms" : [ "" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 11:03:04');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (204, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2038" ],
  "menuType" : [ "F" ],
  "menuName" : [ "查询所有角色" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "system:role:listAll" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 11:04:36');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (205, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2038" ],
  "menuType" : [ "F" ],
  "menuName" : [ "查询角色(非所有)" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "system:role:list" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 11:05:49');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (206, '菜单管理', 2, 'com.nts.web.controller.system.SysMenuController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/edit', '127.0.0.1', '内网IP', '{
  "menuId" : [ "2012" ],
  "parentId" : [ "0" ],
  "menuType" : [ "M" ],
  "menuName" : [ "系统中心" ],
  "url" : [ "#" ],
  "target" : [ "menuItem" ],
  "perms" : [ "" ],
  "orderNum" : [ "1" ],
  "icon" : [ "#" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 11:08:26');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (207, '菜单管理', 2, 'com.nts.web.controller.system.SysMenuController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/edit', '127.0.0.1', '内网IP', '{
  "menuId" : [ "1" ],
  "parentId" : [ "0" ],
  "menuType" : [ "M" ],
  "menuName" : [ "系统管理" ],
  "url" : [ "#" ],
  "target" : [ "menuItem" ],
  "perms" : [ "" ],
  "orderNum" : [ "2" ],
  "icon" : [ "fa fa-gear" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 11:08:42');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (208, '菜单管理', 2, 'com.nts.web.controller.system.SysMenuController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/edit', '127.0.0.1', '内网IP', '{
  "menuId" : [ "2" ],
  "parentId" : [ "0" ],
  "menuType" : [ "M" ],
  "menuName" : [ "系统监控" ],
  "url" : [ "#" ],
  "target" : [ "menuItem" ],
  "perms" : [ "" ],
  "orderNum" : [ "3" ],
  "icon" : [ "fa fa-video-camera" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 11:08:51');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (209, '菜单管理', 2, 'com.nts.web.controller.system.SysMenuController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/edit', '127.0.0.1', '内网IP', '{
  "menuId" : [ "1" ],
  "parentId" : [ "0" ],
  "menuType" : [ "M" ],
  "menuName" : [ "系统管理" ],
  "url" : [ "#" ],
  "target" : [ "menuItem" ],
  "perms" : [ "" ],
  "orderNum" : [ "6" ],
  "icon" : [ "fa fa-gear" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 11:22:30');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (210, '菜单管理', 2, 'com.nts.web.controller.system.SysMenuController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/edit', '127.0.0.1', '内网IP', '{
  "menuId" : [ "3" ],
  "parentId" : [ "0" ],
  "menuType" : [ "M" ],
  "menuName" : [ "系统工具" ],
  "url" : [ "#" ],
  "target" : [ "menuItem" ],
  "perms" : [ "" ],
  "orderNum" : [ "7" ],
  "icon" : [ "fa fa-bars" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 11:22:38');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (211, '菜单管理', 2, 'com.nts.web.controller.system.SysMenuController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/edit', '127.0.0.1', '内网IP', '{
  "menuId" : [ "2" ],
  "parentId" : [ "0" ],
  "menuType" : [ "M" ],
  "menuName" : [ "系统监控" ],
  "url" : [ "#" ],
  "target" : [ "menuItem" ],
  "perms" : [ "" ],
  "orderNum" : [ "8" ],
  "icon" : [ "fa fa-video-camera" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 11:22:43');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (212, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2012" ],
  "menuType" : [ "M" ],
  "menuName" : [ "菜单权限管理" ],
  "url" : [ "/api/sysmen" ],
  "target" : [ "menuItem" ],
  "perms" : [ "" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 11:24:36');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (213, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2041" ],
  "menuType" : [ "F" ],
  "menuName" : [ "查询权限菜单列表" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "system:menu:list" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 11:25:27');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (214, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2041" ],
  "menuType" : [ "F" ],
  "menuName" : [ "菜单删除" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "system:menu:remove" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 11:27:34');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (215, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2041" ],
  "menuType" : [ "F" ],
  "menuName" : [ "菜单新增" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "system:menu:add" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 11:28:01');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (216, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2041" ],
  "menuType" : [ "F" ],
  "menuName" : [ "菜单修改" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "system:menu:edit" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 11:28:45');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (217, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2041" ],
  "menuType" : [ "F" ],
  "menuName" : [ "校验菜单名称" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "system:menu:checkMenuNameUnique" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 11:30:19');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (218, '菜单管理', 3, 'com.nts.web.controller.system.SysMenuController.remove()', 'GET', 1, 'admin', '研发部门', '/system/menu/remove/2046', '127.0.0.1', '内网IP', '{ }', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 11:30:51');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (219, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2012" ],
  "menuType" : [ "M" ],
  "menuName" : [ "企业/部门管理" ],
  "url" : [ "/api/sysdept" ],
  "target" : [ "menuItem" ],
  "perms" : [ "" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 11:32:10');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (220, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2047" ],
  "menuType" : [ "F" ],
  "menuName" : [ "企业查询" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "system:dept:list" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 11:35:36');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (221, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2047" ],
  "menuType" : [ "F" ],
  "menuName" : [ "企业/部门查询" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "system:dept:add" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 11:36:10');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (222, '菜单管理', 2, 'com.nts.web.controller.system.SysMenuController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/edit', '127.0.0.1', '内网IP', '{
  "menuId" : [ "2049" ],
  "parentId" : [ "2047" ],
  "menuType" : [ "F" ],
  "menuName" : [ "企业/部门添加" ],
  "url" : [ "#" ],
  "target" : [ "menuItem" ],
  "perms" : [ "system:dept:add" ],
  "orderNum" : [ "0" ],
  "icon" : [ "#" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 11:36:43');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (223, '菜单管理', 2, 'com.nts.web.controller.system.SysMenuController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/edit', '127.0.0.1', '内网IP', '{
  "menuId" : [ "2048" ],
  "parentId" : [ "2047" ],
  "menuType" : [ "F" ],
  "menuName" : [ "企业/部门查询" ],
  "url" : [ "#" ],
  "target" : [ "menuItem" ],
  "perms" : [ "system:dept:list" ],
  "orderNum" : [ "0" ],
  "icon" : [ "#" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 11:36:58');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (224, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2047" ],
  "menuType" : [ "F" ],
  "menuName" : [ "企业/部门修改" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "system:dept:edit" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 11:37:34');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (225, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2047" ],
  "menuType" : [ "F" ],
  "menuName" : [ "企业/部门删除" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "system:dept:remove" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 11:38:08');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (226, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2012" ],
  "menuType" : [ "M" ],
  "menuName" : [ "配置管理" ],
  "url" : [ "/api/sysconfig" ],
  "target" : [ "menuItem" ],
  "perms" : [ "" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 11:40:38');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (227, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2052" ],
  "menuType" : [ "F" ],
  "menuName" : [ "配置查询" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "system:config:list" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 11:41:13');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (228, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2052" ],
  "menuType" : [ "F" ],
  "menuName" : [ "新增配置" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "system:config:add" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 11:43:59');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (229, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2052" ],
  "menuType" : [ "F" ],
  "menuName" : [ "修改配置" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "system:config:edit" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 11:44:29');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (230, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2052" ],
  "menuType" : [ "F" ],
  "menuName" : [ "删除配置" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "system:config:remove" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 11:45:05');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (231, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2012" ],
  "menuType" : [ "M" ],
  "menuName" : [ "字典管理" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 11:46:13');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (232, '菜单管理', 2, 'com.nts.web.controller.system.SysMenuController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/edit', '127.0.0.1', '内网IP', '{
  "menuId" : [ "2032" ],
  "parentId" : [ "2012" ],
  "menuType" : [ "C" ],
  "menuName" : [ "用户管理" ],
  "url" : [ "/api/sysuser" ],
  "target" : [ "menuItem" ],
  "perms" : [ "" ],
  "orderNum" : [ "0" ],
  "icon" : [ "#" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 11:46:45');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (233, '菜单管理', 2, 'com.nts.web.controller.system.SysMenuController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/edit', '127.0.0.1', '内网IP', '{
  "menuId" : [ "2038" ],
  "parentId" : [ "2012" ],
  "menuType" : [ "C" ],
  "menuName" : [ "角色管理" ],
  "url" : [ "/api/sysrole" ],
  "target" : [ "menuItem" ],
  "perms" : [ "" ],
  "orderNum" : [ "0" ],
  "icon" : [ "#" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 11:46:54');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (234, '菜单管理', 2, 'com.nts.web.controller.system.SysMenuController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/edit', '127.0.0.1', '内网IP', '{
  "menuId" : [ "2041" ],
  "parentId" : [ "2012" ],
  "menuType" : [ "C" ],
  "menuName" : [ "菜单权限管理" ],
  "url" : [ "/api/sysmen" ],
  "target" : [ "menuItem" ],
  "perms" : [ "" ],
  "orderNum" : [ "0" ],
  "icon" : [ "#" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 11:47:03');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (235, '菜单管理', 2, 'com.nts.web.controller.system.SysMenuController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/edit', '127.0.0.1', '内网IP', '{
  "menuId" : [ "2047" ],
  "parentId" : [ "2012" ],
  "menuType" : [ "C" ],
  "menuName" : [ "企业/部门管理" ],
  "url" : [ "/api/sysdept" ],
  "target" : [ "menuItem" ],
  "perms" : [ "" ],
  "orderNum" : [ "0" ],
  "icon" : [ "#" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 11:47:12');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (236, '菜单管理', 2, 'com.nts.web.controller.system.SysMenuController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/edit', '127.0.0.1', '内网IP', '{
  "menuId" : [ "2052" ],
  "parentId" : [ "2012" ],
  "menuType" : [ "C" ],
  "menuName" : [ "配置管理" ],
  "url" : [ "/api/sysconfig" ],
  "target" : [ "menuItem" ],
  "perms" : [ "" ],
  "orderNum" : [ "0" ],
  "icon" : [ "#" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 11:47:19');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (237, '菜单管理', 2, 'com.nts.web.controller.system.SysMenuController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/edit', '127.0.0.1', '内网IP', '{
  "menuId" : [ "2057" ],
  "parentId" : [ "2012" ],
  "menuType" : [ "C" ],
  "menuName" : [ "字典管理" ],
  "url" : [ "/api/sysdict" ],
  "target" : [ "menuItem" ],
  "perms" : [ "" ],
  "orderNum" : [ "0" ],
  "icon" : [ "#" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 11:48:02');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (238, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2057" ],
  "menuType" : [ "F" ],
  "menuName" : [ "查询字典类型" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "system:dicttype:list" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 13:10:44');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (239, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2057" ],
  "menuType" : [ "F" ],
  "menuName" : [ "新增字典类型" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "system:dicttype:add" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 13:11:47');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (240, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2057" ],
  "menuType" : [ "F" ],
  "menuName" : [ "修改字典类型" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "system:dicttype:edit" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 13:12:25');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (241, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2057" ],
  "menuType" : [ "F" ],
  "menuName" : [ "删除字典类型" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "system:dicttype:remove" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 13:12:52');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (242, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2057" ],
  "menuType" : [ "F" ],
  "menuName" : [ "新增字典数据" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "system:dict:list" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 13:13:51');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (243, '菜单管理', 2, 'com.nts.web.controller.system.SysMenuController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/edit', '127.0.0.1', '内网IP', '{
  "menuId" : [ "2062" ],
  "parentId" : [ "2057" ],
  "menuType" : [ "F" ],
  "menuName" : [ "查询字典数据" ],
  "url" : [ "#" ],
  "target" : [ "menuItem" ],
  "perms" : [ "system:dict:list" ],
  "orderNum" : [ "0" ],
  "icon" : [ "#" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 13:14:18');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (244, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2057" ],
  "menuType" : [ "F" ],
  "menuName" : [ "新增字典数据" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "system:dict:add" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 13:14:51');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (245, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.36', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "e15230d1058c484e8024a42519bb4220",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-05 13:25:16');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (246, '箱位区域', 2, 'com.nts.business.api.SiteApiController.editBoxarea()', 'POST', 1, 'admin', '研发部门', '/api/site/editBoxarea', '192.168.31.36', '内网IP', '{
  "id" : [ "1" ],
  "siteId" : [ "1" ],
  "boxareaName" : [ "场地1-01" ],
  "maxColumn" : [ "6" ],
  "maxRow" : [ "5" ],
  "sortord" : [ "0" ],
  "shellfisStructure" : [ "0" ]
}', '{
  "code" : 0,
  "msg" : "箱位区域修改成功"
}', 0, null, '2020-08-05 13:25:28');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (247, '箱位区域', 2, 'com.nts.business.api.SiteApiController.editBoxarea()', 'POST', 1, 'admin', '研发部门', '/api/site/editBoxarea', '192.168.31.36', '内网IP', '{
  "id" : [ "1" ],
  "siteId" : [ "1" ],
  "boxareaName" : [ "场地1-01" ],
  "maxColumn" : [ "6" ],
  "maxRow" : [ "5" ],
  "sortord" : [ "0" ],
  "shellfisStructure" : [ "1" ]
}', '{
  "code" : 0,
  "msg" : "箱位区域修改成功"
}', 0, null, '2020-08-05 13:26:29');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (248, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2057" ],
  "menuType" : [ "F" ],
  "menuName" : [ "修改字典数据" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "system:dict:edit" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 13:30:26');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (249, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2057" ],
  "menuType" : [ "F" ],
  "menuName" : [ "删除字典数据" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "system:dict:remove" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 13:31:00');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (250, '箱位区域', 2, 'com.nts.business.api.SiteApiController.editBoxarea()', 'POST', 1, 'admin', '研发部门', '/api/site/editBoxarea', '192.168.31.36', '内网IP', '{
  "id" : [ "4" ],
  "siteId" : [ "2" ],
  "boxareaName" : [ "test-01" ],
  "maxColumn" : [ "4" ],
  "maxRow" : [ "3" ],
  "sortord" : [ "1" ],
  "shellfisStructure" : [ "0" ]
}', '{
  "code" : 0,
  "msg" : "箱位区域修改成功"
}', 0, null, '2020-08-05 13:32:51');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (251, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2012" ],
  "menuType" : [ "M" ],
  "menuName" : [ "日志管理" ],
  "url" : [ "/api/syslog" ],
  "target" : [ "menuItem" ],
  "perms" : [ "" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 13:35:46');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (252, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2066" ],
  "menuType" : [ "F" ],
  "menuName" : [ "查询用户在线状态" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "monitor:online:list" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 13:36:34');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (253, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2066" ],
  "menuType" : [ "F" ],
  "menuName" : [ "查询用户登录日志" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "monitor:logininfor:list" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 13:37:16');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (254, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2066" ],
  "menuType" : [ "F" ],
  "menuName" : [ "清空用户在线日志" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "monitor:logininfor:remove" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 13:38:09');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (255, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2066" ],
  "menuType" : [ "F" ],
  "menuName" : [ "查询操作日志" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "monitor:operlogs:lit" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 13:38:43');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (256, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2066" ],
  "menuType" : [ "F" ],
  "menuName" : [ "清空操作日志" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "monitor:operlog:remove" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 13:39:15');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (257, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.36', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "6ef742e9ec97432daf11c73ab50912f1",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-05 13:39:26');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (258, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2012" ],
  "menuType" : [ "C" ],
  "menuName" : [ "通知公告管理" ],
  "url" : [ "/api/sysmsg" ],
  "target" : [ "menuItem" ],
  "perms" : [ "" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 13:39:58');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (259, '菜单管理', 2, 'com.nts.web.controller.system.SysMenuController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/edit', '127.0.0.1', '内网IP', '{
  "menuId" : [ "2066" ],
  "parentId" : [ "2012" ],
  "menuType" : [ "C" ],
  "menuName" : [ "日志管理" ],
  "url" : [ "/api/syslog" ],
  "target" : [ "menuItem" ],
  "perms" : [ "" ],
  "orderNum" : [ "0" ],
  "icon" : [ "#" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 13:40:06');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (260, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2072" ],
  "menuType" : [ "F" ],
  "menuName" : [ "查询公告" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "system:notice:list" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 13:43:41');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (261, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2072" ],
  "menuType" : [ "F" ],
  "menuName" : [ "新增公告通知" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "system:notice:add" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 13:44:16');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (262, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2072" ],
  "menuType" : [ "F" ],
  "menuName" : [ "修改公告通知" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "system:notice:edit" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 13:44:55');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (263, '菜单管理', 2, 'com.nts.web.controller.system.SysMenuController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/edit', '127.0.0.1', '内网IP', '{
  "menuId" : [ "2073" ],
  "parentId" : [ "2072" ],
  "menuType" : [ "F" ],
  "menuName" : [ "查询公告通知" ],
  "url" : [ "#" ],
  "target" : [ "menuItem" ],
  "perms" : [ "system:notice:list" ],
  "orderNum" : [ "0" ],
  "icon" : [ "#" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 13:45:12');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (264, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2072" ],
  "menuType" : [ "F" ],
  "menuName" : [ "删除通知公告" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "system:notice:remove" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 13:45:53');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (265, '菜单管理', 2, 'com.nts.web.controller.system.SysMenuController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/edit', '127.0.0.1', '内网IP', '{
  "menuId" : [ "2027" ],
  "parentId" : [ "2006" ],
  "menuType" : [ "C" ],
  "menuName" : [ "历史数据" ],
  "url" : [ "#" ],
  "target" : [ "menuItem" ],
  "perms" : [ "business:sc:historyData" ],
  "orderNum" : [ "1" ],
  "icon" : [ "#" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 13:46:14');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (266, '菜单管理', 2, 'com.nts.web.controller.system.SysMenuController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/edit', '127.0.0.1', '内网IP', '{
  "menuId" : [ "2026" ],
  "parentId" : [ "2006" ],
  "menuType" : [ "C" ],
  "menuName" : [ "实时数据" ],
  "url" : [ "#" ],
  "target" : [ "menuItem" ],
  "perms" : [ "business:sc:realTimeData" ],
  "orderNum" : [ "2" ],
  "icon" : [ "#" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 13:46:25');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (267, '菜单管理', 2, 'com.nts.web.controller.system.SysMenuController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/edit', '127.0.0.1', '内网IP', '{
  "menuId" : [ "2006" ],
  "parentId" : [ "0" ],
  "menuType" : [ "C" ],
  "menuName" : [ "监控中心" ],
  "url" : [ "/api/sc" ],
  "target" : [ "menuItem" ],
  "perms" : [ "" ],
  "orderNum" : [ "0" ],
  "icon" : [ "#" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 13:46:37');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (268, '菜单管理', 2, 'com.nts.web.controller.system.SysMenuController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/edit', '127.0.0.1', '内网IP', '{
  "menuId" : [ "2006" ],
  "parentId" : [ "0" ],
  "menuType" : [ "M" ],
  "menuName" : [ "监控中心" ],
  "url" : [ "/api/sc" ],
  "target" : [ "menuItem" ],
  "perms" : [ "" ],
  "orderNum" : [ "0" ],
  "icon" : [ "#" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 13:46:53');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (269, '菜单管理', 2, 'com.nts.web.controller.system.SysMenuController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/edit', '127.0.0.1', '内网IP', '{
  "menuId" : [ "2028" ],
  "parentId" : [ "2006" ],
  "menuType" : [ "C" ],
  "menuName" : [ "事件数据" ],
  "url" : [ "#" ],
  "target" : [ "menuItem" ],
  "perms" : [ "business:sc:eventData" ],
  "orderNum" : [ "3" ],
  "icon" : [ "#" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 13:47:15');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (270, '菜单管理', 2, 'com.nts.web.controller.system.SysMenuController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/edit', '127.0.0.1', '内网IP', '{
  "menuId" : [ "2029" ],
  "parentId" : [ "2006" ],
  "menuType" : [ "F" ],
  "menuName" : [ "数据概览" ],
  "url" : [ "#" ],
  "target" : [ "menuItem" ],
  "perms" : [ "business:sc:DataOverView" ],
  "orderNum" : [ "4" ],
  "icon" : [ "#" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 13:47:31');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (271, '菜单管理', 2, 'com.nts.web.controller.system.SysMenuController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/edit', '127.0.0.1', '内网IP', '{
  "menuId" : [ "2030" ],
  "parentId" : [ "2006" ],
  "menuType" : [ "C" ],
  "menuName" : [ "监控日志" ],
  "url" : [ "#" ],
  "target" : [ "menuItem" ],
  "perms" : [ "business:sc:MonitoringLog" ],
  "orderNum" : [ "5" ],
  "icon" : [ "#" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 13:47:40');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (272, '菜单管理', 2, 'com.nts.web.controller.system.SysMenuController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/edit', '127.0.0.1', '内网IP', '{
  "menuId" : [ "2031" ],
  "parentId" : [ "2006" ],
  "menuType" : [ "C" ],
  "menuName" : [ "温度曲线" ],
  "url" : [ "#" ],
  "target" : [ "menuItem" ],
  "perms" : [ "business:sc:TemperatureCurve" ],
  "orderNum" : [ "6" ],
  "icon" : [ "#" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 13:47:58');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (273, '菜单管理', 2, 'com.nts.web.controller.system.SysMenuController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/edit', '127.0.0.1', '内网IP', '{
  "menuId" : [ "2038" ],
  "parentId" : [ "2012" ],
  "menuType" : [ "C" ],
  "menuName" : [ "角色管理" ],
  "url" : [ "/api/sysrole" ],
  "target" : [ "menuItem" ],
  "perms" : [ "" ],
  "orderNum" : [ "1" ],
  "icon" : [ "#" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 13:48:15');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (274, '菜单管理', 2, 'com.nts.web.controller.system.SysMenuController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/edit', '127.0.0.1', '内网IP', '{
  "menuId" : [ "2041" ],
  "parentId" : [ "2012" ],
  "menuType" : [ "C" ],
  "menuName" : [ "菜单权限管理" ],
  "url" : [ "/api/sysmen" ],
  "target" : [ "menuItem" ],
  "perms" : [ "" ],
  "orderNum" : [ "2" ],
  "icon" : [ "#" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 13:48:25');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (275, '菜单管理', 2, 'com.nts.web.controller.system.SysMenuController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/edit', '127.0.0.1', '内网IP', '{
  "menuId" : [ "2047" ],
  "parentId" : [ "2012" ],
  "menuType" : [ "C" ],
  "menuName" : [ "企业/部门管理" ],
  "url" : [ "/api/sysdept" ],
  "target" : [ "menuItem" ],
  "perms" : [ "" ],
  "orderNum" : [ "3" ],
  "icon" : [ "#" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 13:48:33');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (276, '菜单管理', 2, 'com.nts.web.controller.system.SysMenuController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/edit', '127.0.0.1', '内网IP', '{
  "menuId" : [ "2052" ],
  "parentId" : [ "2012" ],
  "menuType" : [ "C" ],
  "menuName" : [ "配置管理" ],
  "url" : [ "/api/sysconfig" ],
  "target" : [ "menuItem" ],
  "perms" : [ "" ],
  "orderNum" : [ "4" ],
  "icon" : [ "#" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 13:48:46');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (277, '菜单管理', 2, 'com.nts.web.controller.system.SysMenuController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/edit', '127.0.0.1', '内网IP', '{
  "menuId" : [ "2057" ],
  "parentId" : [ "2012" ],
  "menuType" : [ "C" ],
  "menuName" : [ "字典管理" ],
  "url" : [ "/api/sysdict" ],
  "target" : [ "menuItem" ],
  "perms" : [ "" ],
  "orderNum" : [ "5" ],
  "icon" : [ "#" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 13:48:57');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (278, '菜单管理', 2, 'com.nts.web.controller.system.SysMenuController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/edit', '127.0.0.1', '内网IP', '{
  "menuId" : [ "2066" ],
  "parentId" : [ "2012" ],
  "menuType" : [ "C" ],
  "menuName" : [ "日志管理" ],
  "url" : [ "/api/syslog" ],
  "target" : [ "menuItem" ],
  "perms" : [ "" ],
  "orderNum" : [ "6" ],
  "icon" : [ "#" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 13:49:04');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (279, '菜单管理', 2, 'com.nts.web.controller.system.SysMenuController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/edit', '127.0.0.1', '内网IP', '{
  "menuId" : [ "2072" ],
  "parentId" : [ "2012" ],
  "menuType" : [ "C" ],
  "menuName" : [ "通知公告管理" ],
  "url" : [ "/api/sysmsg" ],
  "target" : [ "menuItem" ],
  "perms" : [ "" ],
  "orderNum" : [ "7" ],
  "icon" : [ "#" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 13:49:12');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (280, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "0" ],
  "menuType" : [ "M" ],
  "menuName" : [ "设备中心" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "" ],
  "orderNum" : [ "2" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 13:49:51');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (281, '菜单管理', 2, 'com.nts.web.controller.system.SysMenuController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/edit', '127.0.0.1', '内网IP', '{
  "menuId" : [ "2006" ],
  "parentId" : [ "0" ],
  "menuType" : [ "M" ],
  "menuName" : [ "监控中心" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "" ],
  "orderNum" : [ "0" ],
  "icon" : [ "#" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 13:50:24');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (282, '箱位区域', 2, 'com.nts.business.api.SiteApiController.editBoxarea()', 'POST', 1, 'admin', '研发部门', '/api/site/editBoxarea', '192.168.31.36', '内网IP', '{
  "id" : [ "5" ],
  "siteId" : [ "2" ],
  "boxareaName" : [ "test-02" ],
  "maxColumn" : [ "4" ],
  "maxRow" : [ "4" ],
  "sortord" : [ "0" ],
  "shellfisStructure" : [ "1" ]
}', '{
  "code" : 0,
  "msg" : "箱位区域修改成功"
}', 0, null, '2020-08-05 13:54:44');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (283, '贝图箱位', 1, 'com.nts.business.api.BoxPostitonApiContrtoller.addBoxPostiton()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/addBoxPostiton', '192.168.31.36', '内网IP', '{
  "previewDirection" : [ "0" ],
  "pitchNoRow" : [ "1" ],
  "pitchNoColumn" : [ "1" ],
  "deviceId" : [ "123" ],
  "containerId" : [ "456" ],
  "childColumn" : [ "" ]
}', '{
  "code" : 55,
  "msg" : "添加贝图箱位失败,该位置已存在集装箱"
}', 0, null, '2020-08-05 14:16:32');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (284, '贝图箱位', 1, 'com.nts.business.api.BoxPostitonApiContrtoller.addBoxPostiton()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/addBoxPostiton', '192.168.31.36', '内网IP', '{
  "previewDirection" : [ "0" ],
  "pitchNoRow" : [ "1" ],
  "pitchNoColumn" : [ "1" ],
  "deviceId" : [ "3213213213" ],
  "containerId" : [ "1235" ],
  "childColumn" : [ "" ]
}', '{
  "code" : 55,
  "msg" : "添加贝图箱位失败,该位置已存在集装箱"
}', 0, null, '2020-08-05 14:18:23');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (285, '贝图箱位', 1, 'com.nts.business.api.BoxPostitonApiContrtoller.addBoxPostiton()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/addBoxPostiton', '192.168.31.36', '内网IP', '{
  "previewDirection" : [ "0" ],
  "pitchNoRow" : [ "1" ],
  "pitchNoColumn" : [ "1" ],
  "deviceId" : [ "3213213213" ],
  "containerId" : [ "1235" ],
  "childColumn" : [ "" ]
}', '{
  "code" : 55,
  "msg" : "添加贝图箱位失败,该位置已存在集装箱"
}', 0, null, '2020-08-05 14:18:38');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (286, '贝图箱位', 1, 'com.nts.business.api.BoxPostitonApiContrtoller.addBoxPostiton()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/addBoxPostiton', '192.168.31.36', '内网IP', '{
  "previewDirection" : [ "0" ],
  "pitchNoRow" : [ "5" ],
  "pitchNoColumn" : [ "5" ],
  "deviceId" : [ "3213213213" ],
  "containerId" : [ "666" ],
  "childColumn" : [ "1" ]
}', '{
  "code" : 0,
  "msg" : "添加贝图箱位成功"
}', 0, null, '2020-08-05 14:25:11');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (287, '贝图箱位', 1, 'com.nts.business.api.BoxPostitonApiContrtoller.addBoxPostiton()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/addBoxPostiton', '192.168.31.36', '内网IP', '{
  "previewDirection" : [ "0" ],
  "pitchNoRow" : [ "1" ],
  "pitchNoColumn" : [ "1" ],
  "deviceId" : [ "3213213213" ],
  "containerId" : [ "666" ],
  "childColumn" : [ "1" ]
}', '{
  "code" : 55,
  "msg" : "添加贝图箱位失败,该位置已存在集装箱"
}', 0, null, '2020-08-05 14:25:26');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (288, '贝图箱位', 1, 'com.nts.business.api.BoxPostitonApiContrtoller.addBoxPostiton()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/addBoxPostiton', '192.168.31.36', '内网IP', '{
  "previewDirection" : [ "0" ],
  "pitchNoRow" : [ "1" ],
  "pitchNoColumn" : [ "2" ],
  "deviceId" : [ "3213213213" ],
  "containerId" : [ "666" ],
  "childColumn" : [ "1" ]
}', '{
  "code" : 55,
  "msg" : "添加贝图箱位失败,该位置已存在集装箱"
}', 0, null, '2020-08-05 14:25:36');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (289, '贝图箱位', 1, 'com.nts.business.api.BoxPostitonApiContrtoller.addBoxPostiton()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/addBoxPostiton', '192.168.31.36', '内网IP', '{
  "previewDirection" : [ "0" ],
  "pitchNoRow" : [ "1" ],
  "pitchNoColumn" : [ "3" ],
  "deviceId" : [ "3213213213" ],
  "containerId" : [ "666" ],
  "childColumn" : [ "1" ]
}', '{
  "code" : 0,
  "msg" : "添加贝图箱位成功"
}', 0, null, '2020-08-05 14:25:41');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (290, '贝图箱位', 1, 'com.nts.business.api.BoxPostitonApiContrtoller.addBoxPostiton()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/addBoxPostiton', '192.168.31.36', '内网IP', '{
  "previewDirection" : [ "0" ],
  "pitchNoRow" : [ "2" ],
  "pitchNoColumn" : [ "3" ],
  "deviceId" : [ "3213213213" ],
  "containerId" : [ "1111" ],
  "childColumn" : [ "1" ]
}', '{
  "code" : 0,
  "msg" : "添加贝图箱位成功"
}', 0, null, '2020-08-05 14:35:02');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (291, '贝图箱位', 1, 'com.nts.business.api.BoxPostitonApiContrtoller.addBoxPostiton()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/addBoxPostiton', '192.168.31.36', '内网IP', '{
  "previewDirection" : [ "" ],
  "pitchNoRow" : [ "4" ],
  "pitchNoColumn" : [ "5" ],
  "deviceId" : [ "123" ],
  "containerId" : [ "456" ],
  "childColumn" : [ "1" ]
}', '{
  "code" : 0,
  "msg" : "添加贝图箱位成功"
}', 0, null, '2020-08-05 14:39:43');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (292, '贝图箱位', 1, 'com.nts.business.api.BoxPostitonApiContrtoller.addBoxPostiton()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/addBoxPostiton', '192.168.31.36', '内网IP', '{
  "previewDirection" : [ "0" ],
  "pitchNoRow" : [ "4" ],
  "pitchNoColumn" : [ "6" ],
  "deviceId" : [ "123" ],
  "containerId" : [ "456" ],
  "childColumn" : [ "1" ]
}', '{
  "code" : 0,
  "msg" : "添加贝图箱位成功"
}', 0, null, '2020-08-05 14:40:55');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (293, '箱位区域', 3, 'com.nts.business.api.SiteApiController.removeBoxarea()', 'POST', 1, 'admin', '研发部门', '/api/site/removeBoxarea', '192.168.31.36', '内网IP', '{
  "boxareaId" : [ "2" ]
}', 'null', 1, '
### Error querying database.  Cause: java.sql.SQLSyntaxErrorException: You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ''where id = (select site_id from nts_boxarea where id = 2)'' at line 3
### The error may exist in URL [jar:file:/C:/Users/Administrator/Desktop/nts-admin.jar!/BOOT-INF/lib/nts-business-4.1.0.jar!/mapper/business/NtsSiteMapper.xml]
### The error may involve com.nts.business.mapper.NtsSiteMapper.selectNtsSiteByBoxareaId-Inline
### The error occurred while setting parameters
### SQL: select id, site_name, box_location_set, dept_id, user_id, delete_flag, create_time, update_time from nts_site               where id = where id = (select site_id from nts_boxarea where id = ?)
### Cause: java.sql.SQLSyntaxErrorException: You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ''where id = (select site_id from nts_boxarea where id = 2)'' at line 3
; bad SQL grammar []; nested exception is java.sql.SQLSyntaxErrorException: You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ''where id = (select site_id from nts_boxarea where id = 2)'' at line 3', '2020-08-05 15:00:48');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (294, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.36', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "52fa79ffbe8a48ae9ac3ff0679085482",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-05 15:33:24');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (295, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2077" ],
  "menuType" : [ "C" ],
  "menuName" : [ "设备管理" ],
  "url" : [ "/api/device" ],
  "target" : [ "menuItem" ],
  "perms" : [ "" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 15:34:37');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (296, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2077" ],
  "menuType" : [ "M" ],
  "menuName" : [ "集装箱管理" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "" ],
  "orderNum" : [ "1" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 15:35:45');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (297, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2079" ],
  "menuType" : [ "C" ],
  "menuName" : [ "集装箱管理" ],
  "url" : [ "/api/ceontainer" ],
  "target" : [ "menuItem" ],
  "perms" : [ "" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 15:36:28');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (298, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2080" ],
  "menuType" : [ "F" ],
  "menuName" : [ "集装箱查询" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "business:container:list" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 15:37:25');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (299, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2080" ],
  "menuType" : [ "F" ],
  "menuName" : [ "集装箱信息导出" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "business:container:export" ],
  "orderNum" : [ "1" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 15:38:08');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (300, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2080" ],
  "menuType" : [ "F" ],
  "menuName" : [ "集装箱新增" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "business:container:add" ],
  "orderNum" : [ "1" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 15:38:39');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (301, '菜单管理', 2, 'com.nts.web.controller.system.SysMenuController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/edit', '127.0.0.1', '内网IP', '{
  "menuId" : [ "2083" ],
  "parentId" : [ "2080" ],
  "menuType" : [ "F" ],
  "menuName" : [ "集装箱新增" ],
  "url" : [ "#" ],
  "target" : [ "menuItem" ],
  "perms" : [ "business:container:add" ],
  "orderNum" : [ "2" ],
  "icon" : [ "#" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 15:38:49');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (302, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2080" ],
  "menuType" : [ "F" ],
  "menuName" : [ "集装箱修改" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "business:container:edit" ],
  "orderNum" : [ "3" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 15:39:17');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (303, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2080" ],
  "menuType" : [ "F" ],
  "menuName" : [ "集装箱删除" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "business:container:remove" ],
  "orderNum" : [ "4" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 15:39:57');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (304, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2080" ],
  "menuType" : [ "F" ],
  "menuName" : [ "集装箱绑定设备" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "business:container:bind" ],
  "orderNum" : [ "6" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 15:40:52');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (305, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2080" ],
  "menuType" : [ "F" ],
  "menuName" : [ "集装箱取消绑定设备" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "business:container:disbind" ],
  "orderNum" : [ "5" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 15:41:38');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (306, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.36', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "f5453372d1c74089bc5cc53b0460b532",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-05 15:43:17');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (307, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.36', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "a2780c933673484ebfdf4e54f585106d",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-05 15:44:05');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (308, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2079" ],
  "menuType" : [ "M" ],
  "menuName" : [ "场地箱位管理" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "" ],
  "orderNum" : [ "1" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 15:45:28');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (309, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2088" ],
  "menuType" : [ "C" ],
  "menuName" : [ "场地区域管理" ],
  "url" : [ "/api/site" ],
  "target" : [ "menuItem" ],
  "perms" : [ "" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 15:54:05');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (310, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2089" ],
  "menuType" : [ "F" ],
  "menuName" : [ "场地查询" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "business:site:list" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 15:54:39');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (311, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2089" ],
  "menuType" : [ "F" ],
  "menuName" : [ "场地添加" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "business:site:add" ],
  "orderNum" : [ "1" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 15:55:18');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (312, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.36', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "e7e664a6a33c4d5cbaf293a40f855cce",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-05 15:55:48');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (313, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.36', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "334d53e1ed7b46d59ab03c0625f204b6",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-05 16:02:47');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (314, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.36', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "cbb992fcc13143deb5b06dddd5daa7a4",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-05 16:09:18');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (315, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2089" ],
  "menuType" : [ "F" ],
  "menuName" : [ "场地修改" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "business:site:edit" ],
  "orderNum" : [ "2" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 16:10:59');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (316, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2089" ],
  "menuType" : [ "F" ],
  "menuName" : [ "场地删除" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "business:site:remove" ],
  "orderNum" : [ "3" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 16:11:37');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (317, '菜单管理', 2, 'com.nts.web.controller.system.SysMenuController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/edit', '127.0.0.1', '内网IP', '{
  "menuId" : [ "2090" ],
  "parentId" : [ "2089" ],
  "menuType" : [ "F" ],
  "menuName" : [ "场地场区查询" ],
  "url" : [ "#" ],
  "target" : [ "menuItem" ],
  "perms" : [ "business:site:list" ],
  "orderNum" : [ "0" ],
  "icon" : [ "#" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 16:12:30');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (318, '菜单管理', 2, 'com.nts.web.controller.system.SysMenuController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/edit', '127.0.0.1', '内网IP', '{
  "menuId" : [ "2092" ],
  "parentId" : [ "2089" ],
  "menuType" : [ "F" ],
  "menuName" : [ "场地场区修改" ],
  "url" : [ "#" ],
  "target" : [ "menuItem" ],
  "perms" : [ "business:site:edit" ],
  "orderNum" : [ "2" ],
  "icon" : [ "#" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 16:12:53');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (319, '菜单管理', 2, 'com.nts.web.controller.system.SysMenuController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/edit', '127.0.0.1', '内网IP', '{
  "menuId" : [ "2090" ],
  "parentId" : [ "2089" ],
  "menuType" : [ "F" ],
  "menuName" : [ "场地查询" ],
  "url" : [ "#" ],
  "target" : [ "menuItem" ],
  "perms" : [ "business:site:list" ],
  "orderNum" : [ "0" ],
  "icon" : [ "#" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 16:13:19');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (320, '菜单管理', 2, 'com.nts.web.controller.system.SysMenuController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/edit', '127.0.0.1', '内网IP', '{
  "menuId" : [ "2092" ],
  "parentId" : [ "2089" ],
  "menuType" : [ "F" ],
  "menuName" : [ "场地修改" ],
  "url" : [ "#" ],
  "target" : [ "menuItem" ],
  "perms" : [ "business:site:edit" ],
  "orderNum" : [ "2" ],
  "icon" : [ "#" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 16:13:33');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (321, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.36', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "f124e550c6874bd0b8647eb9f6d121dc",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-05 16:14:42');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (322, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2089" ],
  "menuType" : [ "F" ],
  "menuName" : [ "场区信息查询" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "business:boxarea:list" ],
  "orderNum" : [ "4" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 16:18:41');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (323, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2089" ],
  "menuType" : [ "F" ],
  "menuName" : [ "场地区域修改" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "business:boxarea:edit" ],
  "orderNum" : [ "5" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 16:19:12');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (324, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2089" ],
  "menuType" : [ "F" ],
  "menuName" : [ "场地箱位区域删除" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "business:boxarea:remove" ],
  "orderNum" : [ "6" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 16:20:29');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (325, '菜单管理', 2, 'com.nts.web.controller.system.SysMenuController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/edit', '127.0.0.1', '内网IP', '{
  "menuId" : [ "2095" ],
  "parentId" : [ "2089" ],
  "menuType" : [ "F" ],
  "menuName" : [ "场地箱位区域修改" ],
  "url" : [ "#" ],
  "target" : [ "menuItem" ],
  "perms" : [ "business:boxarea:edit" ],
  "orderNum" : [ "5" ],
  "icon" : [ "#" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 16:20:45');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (326, '菜单管理', 2, 'com.nts.web.controller.system.SysMenuController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/edit', '127.0.0.1', '内网IP', '{
  "menuId" : [ "2094" ],
  "parentId" : [ "2089" ],
  "menuType" : [ "F" ],
  "menuName" : [ "场地箱位区域查询" ],
  "url" : [ "#" ],
  "target" : [ "menuItem" ],
  "perms" : [ "business:boxarea:list" ],
  "orderNum" : [ "4" ],
  "icon" : [ "#" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 16:20:57');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (327, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2088" ],
  "menuType" : [ "C" ],
  "menuName" : [ "贝图箱位管理" ],
  "url" : [ "/api/boxpost" ],
  "target" : [ "menuItem" ],
  "perms" : [ "" ],
  "orderNum" : [ "1" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 16:22:52');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (328, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.36', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "2f1d85e265a449eea3150a6e90f7b7ba",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-05 16:27:13');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (329, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2097" ],
  "menuType" : [ "F" ],
  "menuName" : [ "新增贝图箱位" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "business:position:add" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 16:27:18');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (330, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2097" ],
  "menuType" : [ "F" ],
  "menuName" : [ "贝图箱位修改" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "business:position:edit" ],
  "orderNum" : [ "1" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 16:27:55');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (331, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2097" ],
  "menuType" : [ "F" ],
  "menuName" : [ "贝图箱位删除" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "business:position:remove" ],
  "orderNum" : [ "2" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 16:28:39');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (332, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2097" ],
  "menuType" : [ "F" ],
  "menuName" : [ "贝图箱位查询" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "business:position:list" ],
  "orderNum" : [ "3" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 16:29:12');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (333, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2097" ],
  "menuType" : [ "F" ],
  "menuName" : [ "贝图箱位数据导出" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "business:position:export" ],
  "orderNum" : [ "4" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 16:29:53');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (334, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2078" ],
  "menuType" : [ "F" ],
  "menuName" : [ "设备添加" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "business:device:add" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 16:31:26');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (335, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2078" ],
  "menuType" : [ "F" ],
  "menuName" : [ "设备查询" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "business:device:list" ],
  "orderNum" : [ "1" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 16:32:37');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (336, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2078" ],
  "menuType" : [ "F" ],
  "menuName" : [ "设备修改" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "business:device:edit" ],
  "orderNum" : [ "3" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 16:33:14');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (337, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2078" ],
  "menuType" : [ "F" ],
  "menuName" : [ "设备删除" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "business:device:remove" ],
  "orderNum" : [ "5" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 16:33:50');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (338, '菜单管理', 2, 'com.nts.web.controller.system.SysMenuController.editSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/edit', '127.0.0.1', '内网IP', '{
  "menuId" : [ "2106" ],
  "parentId" : [ "2078" ],
  "menuType" : [ "F" ],
  "menuName" : [ "设备删除" ],
  "url" : [ "#" ],
  "target" : [ "menuItem" ],
  "perms" : [ "business:device:remove" ],
  "orderNum" : [ "4" ],
  "icon" : [ "#" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 16:34:02');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (339, '定时任务', 2, 'com.nts.quartz.controller.SysJobController.changeStatus()', 'POST', 1, 'admin', '研发部门', '/monitor/job/changeStatus', '127.0.0.1', '内网IP', '{
  "jobId" : [ "1" ],
  "jobGroup" : [ "DEFAULT" ],
  "status" : [ "0" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 16:54:13');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (340, '定时任务', 2, 'com.nts.quartz.controller.SysJobController.run()', 'POST', 1, 'admin', '研发部门', '/monitor/job/run', '127.0.0.1', '内网IP', '{
  "jobId" : [ "1" ],
  "jobGroup" : [ "DEFAULT" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 16:54:16');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (341, '定时任务', 1, 'com.nts.quartz.controller.SysJobController.addSave()', 'POST', 1, 'admin', '研发部门', '/monitor/job/add', '127.0.0.1', '内网IP', '{
  "createBy" : [ "admin" ],
  "jobName" : [ "冷链数据采集" ],
  "invokeTarget" : [ "dataGatherTask.sendNotice()" ],
  "cronExpression" : [ "0/10 * * * * ? " ],
  "misfirePolicy" : [ "1" ],
  "concurrent" : [ "1" ],
  "remark" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 17:05:20');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (342, '定时任务', 2, 'com.nts.quartz.controller.SysJobController.changeStatus()', 'POST', 1, 'admin', '研发部门', '/monitor/job/changeStatus', '127.0.0.1', '内网IP', '{
  "jobId" : [ "100" ],
  "jobGroup" : [ "DEFAULT" ],
  "status" : [ "0" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 17:05:28');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (343, '定时任务', 2, 'com.nts.quartz.controller.SysJobController.changeStatus()', 'POST', 1, 'admin', '研发部门', '/monitor/job/changeStatus', '127.0.0.1', '内网IP', '{
  "jobId" : [ "1" ],
  "jobGroup" : [ "DEFAULT" ],
  "status" : [ "1" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 17:06:53');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (344, '贝图箱位', 1, 'com.nts.business.api.BoxPostitonApiContrtoller.addBoxPostiton()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/addBoxPostiton', '192.168.31.36', '内网IP', '{
  "boxareaId" : [ "1" ],
  "previewDirection" : [ "0" ],
  "pitchNoRow" : [ "3" ],
  "pitchNoColumn" : [ "6" ],
  "deviceId" : [ "222" ],
  "containerId" : [ "333" ],
  "childColumn" : [ "1" ]
}', '{
  "code" : 0,
  "msg" : "添加贝图箱位成功"
}', 0, null, '2020-08-05 17:07:14');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (345, '定时任务', 2, 'com.nts.quartz.controller.SysJobController.editSave()', 'POST', 1, 'admin', '研发部门', '/monitor/job/edit', '127.0.0.1', '内网IP', '{
  "jobId" : [ "100" ],
  "updateBy" : [ "admin" ],
  "jobName" : [ "冷链数据采集" ],
  "invokeTarget" : [ "dataGatherTask.sendNotice" ],
  "cronExpression" : [ "0/10 * * * * ?" ],
  "misfirePolicy" : [ "1" ],
  "concurrent" : [ "1" ],
  "remark" : [ "" ]
}', 'null', 1, '', '2020-08-05 17:07:15');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (346, '定时任务', 2, 'com.nts.quartz.controller.SysJobController.editSave()', 'POST', 1, 'admin', '研发部门', '/monitor/job/edit', '127.0.0.1', '内网IP', '{
  "jobId" : [ "100" ],
  "updateBy" : [ "admin" ],
  "jobName" : [ "冷链数据采集" ],
  "invokeTarget" : [ "dataGatherTask.sendNotice" ],
  "cronExpression" : [ "0/10 * * * * ?" ],
  "misfirePolicy" : [ "1" ],
  "concurrent" : [ "1" ],
  "remark" : [ "" ]
}', 'null', 1, '', '2020-08-05 17:07:26');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (347, '定时任务', 3, 'com.nts.quartz.controller.SysJobController.remove()', 'POST', 1, 'admin', '研发部门', '/monitor/job/remove', '127.0.0.1', '内网IP', '{
  "ids" : [ "100" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 17:07:56');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (348, '定时任务', 1, 'com.nts.quartz.controller.SysJobController.addSave()', 'POST', 1, 'admin', '研发部门', '/monitor/job/add', '127.0.0.1', '内网IP', '{
  "createBy" : [ "admin" ],
  "jobName" : [ "冷链数据采集" ],
  "invokeTarget" : [ "dataGatherTask.sendNotice" ],
  "cronExpression" : [ "0/5 * * * * ? " ],
  "misfirePolicy" : [ "1" ],
  "concurrent" : [ "1" ],
  "remark" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 17:08:31');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (349, '定时任务', 2, 'com.nts.quartz.controller.SysJobController.changeStatus()', 'POST', 1, 'admin', '研发部门', '/monitor/job/changeStatus', '127.0.0.1', '内网IP', '{
  "jobId" : [ "101" ],
  "jobGroup" : [ "DEFAULT" ],
  "status" : [ "0" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 17:08:40');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (350, '贝图箱位', 1, 'com.nts.business.api.BoxPostitonApiContrtoller.addBoxPostiton()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/addBoxPostiton', '192.168.31.36', '内网IP', '{
  "boxareaId" : [ "1" ],
  "previewDirection" : [ "0" ],
  "pitchNoRow" : [ "4" ],
  "pitchNoColumn" : [ "5" ],
  "deviceId" : [ "1212" ],
  "containerId" : [ "3434" ],
  "childColumn" : [ "1" ]
}', '{
  "code" : 0,
  "msg" : "添加贝图箱位成功"
}', 0, null, '2020-08-05 17:08:42');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (351, '定时任务', 2, 'com.nts.quartz.controller.SysJobController.run()', 'POST', 1, 'admin', '研发部门', '/monitor/job/run', '127.0.0.1', '内网IP', '{
  "jobId" : [ "101" ],
  "jobGroup" : [ "DEFAULT" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 17:08:54');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (352, '贝图箱位', 1, 'com.nts.business.api.BoxPostitonApiContrtoller.addBoxPostiton()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/addBoxPostiton', '192.168.31.36', '内网IP', '{
  "boxareaId" : [ "1" ],
  "previewDirection" : [ "0" ],
  "pitchNoRow" : [ "5" ],
  "pitchNoColumn" : [ "5" ],
  "deviceSn" : [ "888" ],
  "containerId" : [ "999" ],
  "childColumn" : [ "1" ]
}', '{
  "code" : 0,
  "msg" : "添加贝图箱位成功"
}', 0, null, '2020-08-05 17:09:55');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (353, '贝图箱位', 1, 'com.nts.business.api.BoxPostitonApiContrtoller.addBoxPostiton()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/addBoxPostiton', '192.168.31.36', '内网IP', '{
  "boxareaId" : [ "1" ],
  "previewDirection" : [ "0" ],
  "pitchNoRow" : [ "3" ],
  "pitchNoColumn" : [ "1" ],
  "deviceId" : [ "11" ],
  "containerId" : [ "222" ],
  "childColumn" : [ "1" ]
}', '{
  "code" : 0,
  "msg" : "添加贝图箱位成功"
}', 0, null, '2020-08-05 17:16:39');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (354, '贝图箱位', 1, 'com.nts.business.api.BoxPostitonApiContrtoller.addBoxPostiton()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/addBoxPostiton', '192.168.31.36', '内网IP', '{
  "boxareaId" : [ "1" ],
  "previewDirection" : [ "0" ],
  "pitchNoRow" : [ "3" ],
  "pitchNoColumn" : [ "3" ],
  "deviceId" : [ "1111" ],
  "containerId" : [ "222" ],
  "childColumn" : [ "1" ]
}', '{
  "code" : 0,
  "msg" : "添加贝图箱位成功"
}', 0, null, '2020-08-05 17:17:35');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (355, '贝图箱位', 1, 'com.nts.business.api.BoxPostitonApiContrtoller.addBoxPostiton()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/addBoxPostiton', '192.168.31.36', '内网IP', '{
  "boxareaId" : [ "1" ],
  "previewDirection" : [ "1" ],
  "pitchNoRow" : [ "1" ],
  "pitchNoColumn" : [ "1" ],
  "deviceId" : [ "11" ],
  "containerId" : [ "22" ],
  "childColumn" : [ "1" ]
}', '{
  "code" : 0,
  "msg" : "添加贝图箱位成功"
}', 0, null, '2020-08-05 17:17:51');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (356, '贝图箱位', 3, 'com.nts.business.api.BoxPostitonApiContrtoller.removeBoxPosition()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/removeBoxPosition', '192.168.31.36', '内网IP', '{
  "ids" : [ "2" ]
}', '{
  "code" : 0,
  "msg" : "删除贝图箱位成功"
}', 0, null, '2020-08-05 17:34:10');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (357, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.36', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "a4b5d133f48e428a8e0f31c7436860b2",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-05 17:45:20');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (358, '定时任务', 2, 'com.nts.quartz.controller.SysJobController.changeStatus()', 'POST', 1, 'admin', '研发部门', '/monitor/job/changeStatus', '127.0.0.1', '内网IP', '{
  "jobId" : [ "101" ],
  "jobGroup" : [ "DEFAULT" ],
  "status" : [ "1" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-05 18:35:01');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (359, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.36', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "8c2c3742c8704cbd891add78b27c71b7",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-05 18:35:12');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (360, '贝图箱位', 1, 'com.nts.business.api.BoxPostitonApiContrtoller.addBoxPostiton()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/addBoxPostiton', '192.168.31.36', '内网IP', '{
  "boxareaId" : [ "1" ],
  "previewDirection" : [ "0" ],
  "pitchNoRow" : [ "3" ],
  "pitchNoColumn" : [ "2" ],
  "deviceId" : [ "22" ],
  "containerId" : [ "22" ],
  "childColumn" : [ "1" ]
}', '{
  "code" : 0,
  "msg" : "添加贝图箱位成功"
}', 0, null, '2020-08-05 18:42:21');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (361, '贝图箱位', 1, 'com.nts.business.api.BoxPostitonApiContrtoller.addBoxPostiton()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/addBoxPostiton', '192.168.31.36', '内网IP', '{
  "boxareaId" : [ "1" ],
  "previewDirection" : [ "0" ],
  "pitchNoRow" : [ "2" ],
  "pitchNoColumn" : [ "1" ],
  "deviceId" : [ "w" ],
  "containerId" : [ "w" ],
  "childColumn" : [ "1" ]
}', '{
  "code" : 0,
  "msg" : "添加贝图箱位成功"
}', 0, null, '2020-08-05 19:02:27');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (362, '贝图箱位', 1, 'com.nts.business.api.BoxPostitonApiContrtoller.addBoxPostiton()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/addBoxPostiton', '192.168.31.36', '内网IP', '{
  "boxareaId" : [ "1" ],
  "previewDirection" : [ "1" ],
  "pitchNoRow" : [ "2" ],
  "pitchNoColumn" : [ "1" ],
  "deviceId" : [ "1" ],
  "containerId" : [ "1" ],
  "childColumn" : [ "1" ]
}', '{
  "code" : 0,
  "msg" : "添加贝图箱位成功"
}', 0, null, '2020-08-05 19:02:40');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (363, '贝图箱位', 1, 'com.nts.business.api.BoxPostitonApiContrtoller.addBoxPostiton()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/addBoxPostiton', '192.168.31.36', '内网IP', '{
  "boxareaId" : [ "1" ],
  "previewDirection" : [ "1" ],
  "pitchNoRow" : [ "2" ],
  "pitchNoColumn" : [ "1" ],
  "deviceId" : [ "1" ],
  "containerId" : [ "1" ],
  "childColumn" : [ "2" ]
}', '{
  "code" : 0,
  "msg" : "添加贝图箱位成功"
}', 0, null, '2020-08-05 19:04:29');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (364, '贝图箱位', 1, 'com.nts.business.api.BoxPostitonApiContrtoller.addBoxPostiton()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/addBoxPostiton', '192.168.31.36', '内网IP', '{
  "boxareaId" : [ "1" ],
  "previewDirection" : [ "1" ],
  "pitchNoRow" : [ "3" ],
  "pitchNoColumn" : [ "1" ],
  "deviceId" : [ "1" ],
  "containerId" : [ "1" ],
  "childColumn" : [ "1" ]
}', '{
  "code" : 0,
  "msg" : "添加贝图箱位成功"
}', 0, null, '2020-08-05 19:14:09');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (365, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "ffa9607e98aa4f9ea3812cedca0cf32a",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-06 08:53:38');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (366, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "e88dd8a6ec564b579182539c9114617f",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-06 08:59:52');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (367, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "81447b128718482f841ec2d6d50ab96f",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-06 09:39:48');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (368, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "39ca9f9b9145481ba30e7d3bc44ccb66",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-06 09:51:52');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (369, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.181', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "644e404803bc45a395dbf4cf4349b759",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-06 09:53:10');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (370, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "75a05db54726430487e834e79d92b1a7",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-06 09:55:56');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (371, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "c1154d2b248b47949012a7fad755e8f2",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-06 10:29:25');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (372, '场地', 2, 'com.nts.business.api.SiteApiController.editSite()', 'POST', 1, 'admin', '研发部门', '/api/site/editSite', '192.168.31.35', '内网IP', '{
  "id" : [ "3" ],
  "siteName" : [ "t" ],
  "boxLocationSet" : [ "4" ]
}', '{
  "code" : 55,
  "msg" : "修改场地失败，该场地名称已经存在"
}', 0, null, '2020-08-06 10:46:08');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (373, '场地', 2, 'com.nts.business.api.SiteApiController.editSite()', 'POST', 1, 'admin', '研发部门', '/api/site/editSite', '192.168.31.35', '内网IP', '{
  "id" : [ "3" ],
  "siteName" : [ "t2" ],
  "boxLocationSet" : [ "4" ]
}', '{
  "code" : 0,
  "msg" : "场地修改成功"
}', 0, null, '2020-08-06 10:46:15');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (374, '箱位区域', 3, 'com.nts.business.api.SiteApiController.removeBoxarea()', 'POST', 1, 'admin', '研发部门', '/api/site/removeBoxarea', '192.168.31.35', '内网IP', '{
  "boxareaId" : [ "1010" ]
}', 'null', 1, '
### Error querying database.  Cause: java.sql.SQLSyntaxErrorException: You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ''where id = (select site_id from nts_boxarea where id = 1010)'' at line 3
### The error may exist in URL [jar:file:/C:/Users/Administrator/Desktop/nts-admin.jar!/BOOT-INF/lib/nts-business-4.1.0.jar!/mapper/business/NtsSiteMapper.xml]
### The error may involve com.nts.business.mapper.NtsSiteMapper.selectNtsSiteByBoxareaId-Inline
### The error occurred while setting parameters
### SQL: select id, site_name, box_location_set, dept_id, user_id, delete_flag, create_time, update_time from nts_site               where id = where id = (select site_id from nts_boxarea where id = ?)
### Cause: java.sql.SQLSyntaxErrorException: You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ''where id = (select site_id from nts_boxarea where id = 1010)'' at line 3
; bad SQL grammar []; nested exception is java.sql.SQLSyntaxErrorException: You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ''where id = (select site_id from nts_boxarea where id = 1010)'' at line 3', '2020-08-06 10:47:15');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (375, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "ec6db80e1abb40fd879d591a60b16ccc",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-06 10:50:07');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (376, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "81e6dd5302194fa9ac21944a18a00ebf",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-06 11:38:13');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (377, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.13', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "4f1b8357d5734df78de9a6ca4c5fc41c",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-06 13:21:29');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (378, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "6cd16d9a21984c18aece2b72994602af",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-06 14:05:33');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (379, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "927a1b470d2440a6b266cc44df966bd7",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-06 14:07:41');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (380, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.181', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "c6fe9f29b16a415ba54701b54123d87c",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-06 14:22:45');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (381, '贝图箱位', 1, 'com.nts.business.api.BoxPostitonApiContrtoller.addBoxPostiton()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/addBoxPostiton', '192.168.31.35', '内网IP', '{
  "boxareaId" : [ "1" ],
  "previewDirection" : [ "1" ],
  "pitchNoRow" : [ "5" ],
  "pitchNoColumn" : [ "2" ],
  "deviceId" : [ "666" ],
  "containerId" : [ "123" ],
  "childColumn" : [ "2" ]
}', '{
  "code" : 0,
  "msg" : "添加贝图箱位成功"
}', 0, null, '2020-08-06 14:38:09');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (382, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '127.0.0.1', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "4574725c1be04353b79aef5ed3f2d7fa",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-06 14:50:38');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (383, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "6507299f1a1f434b86977369a6eae8fe",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-06 14:53:13');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (384, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '127.0.0.1', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "428f5179058343d4bed4291bbae3e513",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-06 14:53:52');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (385, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '127.0.0.1', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "c57480872603441d944416ab9c3e8ee5",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-06 15:04:52');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (386, '企业', 3, 'com.nts.business.api.MerchantCentreApiController.removeDept()', 'GET', 1, 'admin', '研发部门', '/api/merchant/removeDept', '127.0.0.1', '内网IP', '{
  "deptId" : [ "207" ]
}', '{
  "code" : 0,
  "msg" : "企业删除成功"
}', 0, null, '2020-08-06 15:06:14');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (387, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '127.0.0.1', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "ec86135c229e4658a10ff3a27f3900cd",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-06 15:12:00');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (388, '企业', 3, 'com.nts.business.api.MerchantCentreApiController.removeDept()', 'GET', 1, 'admin', '研发部门', '/api/merchant/removeDept', '127.0.0.1', '内网IP', '{
  "deptId" : [ "207" ]
}', 'null', 1, '
### Error updating database.  Cause: java.sql.SQLSyntaxErrorException: You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ''where dept_id = 207'' at line 1
### The error may involve com.nts.system.mapper.SysDeptMapper.deleteDeptById-Inline
### The error occurred while setting parameters
### SQL: delete sys_dept where dept_id = ?
### Cause: java.sql.SQLSyntaxErrorException: You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ''where dept_id = 207'' at line 1
; bad SQL grammar []; nested exception is java.sql.SQLSyntaxErrorException: You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ''where dept_id = 207'' at line 1', '2020-08-06 15:12:24');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (389, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "a392ff545a6045e48d7a5ee8a3071244",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-06 15:13:12');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (390, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '127.0.0.1', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "efc91bb6f60d49d79421c10429619d00",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-06 15:24:13');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (391, '企业', 3, 'com.nts.business.api.MerchantCentreApiController.removeDept()', 'GET', 1, 'admin', '研发部门', '/api/merchant/removeDept', '127.0.0.1', '内网IP', '{
  "deptId" : [ "207" ]
}', '{
  "code" : 0,
  "msg" : "企业删除成功"
}', 0, null, '2020-08-06 15:24:32');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (392, '企业', 2, 'com.nts.business.api.MerchantCentreApiController.editMerchant()', 'POST', 1, 'admin', '研发部门', '/api/merchant/editMerchant', '127.0.0.1', '内网IP', '{
  "deptId" : [ "206" ],
  "deptName" : [ "哈哈哈" ],
  "email" : [ "111@qq.com" ],
  "enterpriseLocation" : [ "" ],
  "leader" : [ "" ],
  "loginName" : [ "" ],
  "mealType" : [ "" ],
  "phone" : [ "" ],
  "status" : [ "" ]
}', 'null', 1, '', '2020-08-06 15:26:17');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (393, '企业', 2, 'com.nts.business.api.MerchantCentreApiController.editMerchant()', 'POST', 1, 'admin', '研发部门', '/api/merchant/editMerchant', '127.0.0.1', '内网IP', '{
  "deptId" : [ "206" ],
  "deptName" : [ "哈哈哈" ],
  "email" : [ "111@qq.com" ],
  "enterpriseLocation" : [ "" ],
  "leader" : [ "" ],
  "loginName" : [ "" ],
  "mealType" : [ "" ],
  "phone" : [ "" ],
  "status" : [ "" ]
}', 'null', 1, '', '2020-08-06 15:30:34');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (394, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '127.0.0.1', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "da85d86bc0ba4ab9afd4d52ea170d683",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-06 15:32:59');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (395, '企业', 2, 'com.nts.business.api.MerchantCentreApiController.editMerchant()', 'POST', 1, 'admin', '研发部门', '/api/merchant/editMerchant', '127.0.0.1', '内网IP', '{
  "deptId" : [ "206" ],
  "deptName" : [ "哈哈哈" ],
  "email" : [ "111@qq.com" ],
  "enterpriseLocation" : [ "" ],
  "leader" : [ "" ],
  "loginName" : [ "" ],
  "mealType" : [ "" ],
  "phone" : [ "" ],
  "status" : [ "" ]
}', '{
  "code" : 0,
  "msg" : "修改企业''哈哈哈''成功"
}', 0, null, '2020-08-06 15:33:35');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (396, '企业', 1, 'com.nts.business.api.MerchantCentreApiController.addMerchant()', 'POST', 1, 'admin', '研发部门', '/api/merchant/addMerchant', '127.0.0.1', '内网IP', '{
  "deptId" : [ "" ],
  "deptName" : [ "测试企业" ],
  "email" : [ "3333@qq.com" ],
  "enterpriseLocation" : [ "深圳" ],
  "leader" : [ "张三" ],
  "loginName" : [ "" ],
  "mealType" : [ "" ],
  "phone" : [ "12321231" ],
  "status" : [ "" ]
}', '{
  "code" : 0,
  "msg" : "新增企业''测试企业''成功"
}', 0, null, '2020-08-06 15:34:37');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (397, '用户', 1, 'com.nts.business.api.SysUserApiController.addUserSave()', 'POST', 1, 'admin', '研发部门', '/api/sysuser/addaddUserSave', '127.0.0.1', '内网IP', '{
  "postIds" : [ "" ],
  "roleIds" : [ "" ],
  "childFlag" : [ "" ],
  "deptId" : [ "208" ],
  "email" : [ "111@qq.com" ],
  "loginName" : [ "zhangsang" ],
  "parentId" : [ "" ],
  "password" : [ "zhangsang" ],
  "phonenumber" : [ "" ],
  "remark" : [ "" ],
  "sex" : [ "" ],
  "status" : [ "0" ],
  "userId" : [ "" ],
  "userName" : [ "zhangsang" ]
}', 'null', 1, 'nested exception is org.apache.ibatis.exceptions.TooManyResultsException: Expected one result (or null) to be returned by selectOne(), but found: 6', '2020-08-06 15:38:13');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (398, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '127.0.0.1', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "3774984950944f0db9e5e2cfe70a7147",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-06 15:50:23');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (399, '用户', 1, 'com.nts.business.api.SysUserApiController.addUserSave()', 'POST', 1, 'admin', '研发部门', '/api/sysuser/addaddUserSave', '127.0.0.1', '内网IP', '{
  "postIds" : [ "" ],
  "roleIds" : [ "" ],
  "childFlag" : [ "" ],
  "deptId" : [ "208" ],
  "email" : [ "111@qq.com" ],
  "loginName" : [ "zhangsang" ],
  "parentId" : [ "" ],
  "password" : [ "zhangsang" ],
  "phonenumber" : [ "" ],
  "remark" : [ "" ],
  "sex" : [ "" ],
  "status" : [ "0" ],
  "userId" : [ "" ],
  "userName" : [ "zhangsang" ]
}', '{
  "code" : 55,
  "msg" : "新增用户''zhangsang''失败，手机号码已存在"
}', 0, null, '2020-08-06 15:50:55');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (400, '用户', 1, 'com.nts.business.api.SysUserApiController.addUserSave()', 'POST', 1, 'admin', '研发部门', '/api/sysuser/addaddUserSave', '127.0.0.1', '内网IP', '{
  "postIds" : [ "" ],
  "roleIds" : [ "" ],
  "childFlag" : [ "" ],
  "deptId" : [ "208" ],
  "email" : [ "111@qq.com" ],
  "loginName" : [ "zhangsang" ],
  "parentId" : [ "" ],
  "password" : [ "zhangsang" ],
  "phonenumber" : [ "111111122" ],
  "remark" : [ "" ],
  "sex" : [ "" ],
  "status" : [ "0" ],
  "userId" : [ "" ],
  "userName" : [ "zhangsang" ]
}', 'null', 1, 'nested exception is org.apache.ibatis.builder.BuilderException: Error evaluating expression ''params.beginTime != null and params.beginTime != ''''''. Cause: org.apache.ibatis.ognl.OgnlException: source is null for getProperty(null, "beginTime")', '2020-08-06 15:51:10');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (401, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '127.0.0.1', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "3f641963418d4f4dad25327f55dd701f",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-06 15:55:41');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (402, '用户', 1, 'com.nts.business.api.SysUserApiController.addUserSave()', 'POST', 1, 'admin', '研发部门', '/api/sysuser/addaddUserSave', '127.0.0.1', '内网IP', '{
  "postIds" : [ "" ],
  "roleIds" : [ "" ],
  "childFlag" : [ "" ],
  "deptId" : [ "208" ],
  "email" : [ "111@qq.com" ],
  "loginName" : [ "zhangsang" ],
  "parentId" : [ "" ],
  "password" : [ "zhangsang" ],
  "phonenumber" : [ "111111122" ],
  "remark" : [ "" ],
  "sex" : [ "" ],
  "status" : [ "0" ],
  "userId" : [ "" ],
  "userName" : [ "zhangsang" ]
}', 'null', 1, 'nested exception is org.apache.ibatis.builder.BuilderException: Error evaluating expression ''params.beginTime != null and params.beginTime != ''''''. Cause: org.apache.ibatis.ognl.OgnlException: source is null for getProperty(null, "beginTime")', '2020-08-06 15:55:54');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (403, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '127.0.0.1', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "09fc6b804df146158e8cd4b5823d3591",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-06 15:59:58');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (404, '用户', 1, 'com.nts.business.api.SysUserApiController.addUserSave()', 'POST', 1, 'admin', '研发部门', '/api/sysuser/addaddUserSave', '127.0.0.1', '内网IP', '{
  "postIds" : [ "" ],
  "roleIds" : [ "" ],
  "childFlag" : [ "" ],
  "deptId" : [ "208" ],
  "email" : [ "111@qq.com" ],
  "loginName" : [ "zhangsang" ],
  "parentId" : [ "" ],
  "password" : [ "zhangsang" ],
  "phonenumber" : [ "111111122" ],
  "remark" : [ "" ],
  "sex" : [ "" ],
  "status" : [ "0" ],
  "userId" : [ "" ],
  "userName" : [ "zhangsang" ]
}', 'null', 1, '', '2020-08-06 16:00:20');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (405, '用户', 1, 'com.nts.business.api.SysUserApiController.addUserSave()', 'POST', 1, 'admin', '研发部门', '/api/sysuser/addaddUserSave', '127.0.0.1', '内网IP', '{
  "postIds" : [ "" ],
  "roleIds" : [ "" ],
  "childFlag" : [ "" ],
  "deptId" : [ "208" ],
  "email" : [ "111@qq.com" ],
  "loginName" : [ "zhangsang" ],
  "parentId" : [ "" ],
  "password" : [ "zhangsang" ],
  "phonenumber" : [ "111111122" ],
  "remark" : [ "" ],
  "sex" : [ "" ],
  "status" : [ "0" ],
  "userId" : [ "" ],
  "userName" : [ "zhangsang" ]
}', 'null', 1, '', '2020-08-06 16:03:23');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (406, '用户', 1, 'com.nts.business.api.SysUserApiController.addUserSave()', 'POST', 1, 'admin', '研发部门', '/api/sysuser/addaddUserSave', '127.0.0.1', '内网IP', '{
  "postIds" : [ "" ],
  "roleIds" : [ "" ],
  "childFlag" : [ "0" ],
  "deptId" : [ "208" ],
  "email" : [ "111@qq.com" ],
  "loginName" : [ "zhangsang" ],
  "parentId" : [ "" ],
  "password" : [ "zhangsang" ],
  "phonenumber" : [ "111111122" ],
  "remark" : [ "" ],
  "sex" : [ "" ],
  "status" : [ "0" ],
  "userId" : [ "" ],
  "userName" : [ "zhangsang" ]
}', '{
  "code" : 0,
  "msg" : "操作成功",
  "data" : 1
}', 0, null, '2020-08-06 16:03:54');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (407, '用户', 3, 'com.nts.business.api.SysUserApiController.delUserByUserId()', 'GET', 1, 'admin', '研发部门', '/api/sysuser/delUserByUserId', '127.0.0.1', '内网IP', '{
  "userId" : [ "128" ]
}', '{
  "code" : 0,
  "msg" : "用户删除成功"
}', 0, null, '2020-08-06 16:05:26');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (408, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "de7aadd655624812b4483b4f2015be76",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-06 16:19:36');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (409, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "0" ],
  "menuType" : [ "M" ],
  "menuName" : [ "商户中心" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "" ],
  "orderNum" : [ "3" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-06 16:25:16');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (410, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2107" ],
  "menuType" : [ "C" ],
  "menuName" : [ "商户中心" ],
  "url" : [ "/api/merchant" ],
  "target" : [ "menuItem" ],
  "perms" : [ "" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-06 16:26:00');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (411, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2108" ],
  "menuType" : [ "F" ],
  "menuName" : [ "企业商户查询" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "business:merchant:list" ],
  "orderNum" : [ "0" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-06 16:26:27');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (412, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2108" ],
  "menuType" : [ "F" ],
  "menuName" : [ "企业商户新增" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "system:merchant:add" ],
  "orderNum" : [ "1" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-06 16:26:56');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (413, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2108" ],
  "menuType" : [ "F" ],
  "menuName" : [ "企业商户修改" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "system:merchant:edit" ],
  "orderNum" : [ "2" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-06 16:27:34');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (414, '菜单管理', 1, 'com.nts.web.controller.system.SysMenuController.addSave()', 'POST', 1, 'admin', '研发部门', '/system/menu/add', '127.0.0.1', '内网IP', '{
  "parentId" : [ "2108" ],
  "menuType" : [ "F" ],
  "menuName" : [ "企业商户删除" ],
  "url" : [ "" ],
  "target" : [ "menuItem" ],
  "perms" : [ "system:dept:remove" ],
  "orderNum" : [ "3" ],
  "icon" : [ "" ]
}', '{
  "msg" : "操作成功",
  "code" : 0
}', 0, null, '2020-08-06 16:28:03');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (415, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "5146891a5ebc41a68b3c3a02e60f67b2",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-06 16:34:43');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (416, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.181', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "e8a66de3136a410997be0f674a0d4107",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-06 16:53:25');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (417, '登录', 7, 'com.nts.business.api.SysUserApiController.loginout()', 'GET', 1, null, null, '/api/sysuser/loginout', '192.168.31.181', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "退出成功"
}', 0, null, '2020-08-06 17:56:50');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (418, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.181', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "612afa77fbf14f42adc94a81414b266a",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-06 17:56:52');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (419, '场地', 1, 'com.nts.business.api.SiteApiController.addSite()', 'POST', 1, 'admin', '研发部门', '/api/site/addSite', '192.168.31.35', '内网IP', '{
  "siteName" : [ "测试" ],
  "boxLocationSet" : [ "3" ]
}', '{
  "code" : 0,
  "msg" : "场地添加成功"
}', 0, null, '2020-08-06 18:39:25');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (420, '箱位区域', 2, 'com.nts.business.api.SiteApiController.editBoxarea()', 'POST', 1, 'admin', '研发部门', '/api/site/editBoxarea', '192.168.31.35', '内网IP', '{
  "id" : [ "1025" ],
  "siteId" : [ "7" ],
  "boxareaName" : [ "测试-01" ],
  "maxColumn" : [ "5" ],
  "maxRow" : [ "4" ],
  "sortord" : [ "0" ],
  "shellfisStructure" : [ "0" ]
}', '{
  "code" : 0,
  "msg" : "箱位区域修改成功"
}', 0, null, '2020-08-06 18:40:03');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (421, '箱位区域', 2, 'com.nts.business.api.SiteApiController.editBoxarea()', 'POST', 1, 'admin', '研发部门', '/api/site/editBoxarea', '192.168.31.35', '内网IP', '{
  "id" : [ "1026" ],
  "siteId" : [ "7" ],
  "boxareaName" : [ "测试-02" ],
  "maxColumn" : [ "6" ],
  "maxRow" : [ "5" ],
  "sortord" : [ "1" ],
  "shellfisStructure" : [ "0" ]
}', '{
  "code" : 0,
  "msg" : "箱位区域修改成功"
}', 0, null, '2020-08-06 18:41:54');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (422, '贝图箱位', 1, 'com.nts.business.api.BoxPostitonApiContrtoller.addBoxPostiton()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/addBoxPostiton', '192.168.31.35', '内网IP', '{
  "boxareaId" : [ "1" ],
  "previewDirection" : [ "0" ],
  "pitchNoRow" : [ "3" ],
  "pitchNoColumn" : [ "2" ],
  "deviceId" : [ "123" ],
  "containerId" : [ "123" ],
  "childColumn" : [ "1" ]
}', '{
  "code" : 55,
  "msg" : "添加贝图箱位失败,该位置已存在集装箱"
}', 0, null, '2020-08-06 19:01:21');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (423, '贝图箱位', 1, 'com.nts.business.api.BoxPostitonApiContrtoller.addBoxPostiton()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/addBoxPostiton', '192.168.31.35', '内网IP', '{
  "boxareaId" : [ "1" ],
  "previewDirection" : [ "0" ],
  "pitchNoRow" : [ "3" ],
  "pitchNoColumn" : [ "4" ],
  "deviceId" : [ "222" ],
  "containerId" : [ "22" ],
  "childColumn" : [ "1" ]
}', '{
  "code" : 0,
  "msg" : "添加贝图箱位成功"
}', 0, null, '2020-08-06 19:03:30');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (424, '登录', 7, 'com.nts.business.api.SysUserApiController.loginout()', 'GET', 1, null, null, '/api/sysuser/loginout', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "退出成功"
}', 0, null, '2020-08-07 08:44:10');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (425, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "4c3e942ddfba438eb227df03d9fe6b99",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-07 08:44:12');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (426, '贝图箱位', 1, 'com.nts.business.api.BoxPostitonApiContrtoller.addBoxPostiton()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/addBoxPostiton', '192.168.31.35', '内网IP', '{
  "boxareaId" : [ "1" ],
  "previewDirection" : [ "1" ],
  "pitchNoRow" : [ "5" ],
  "pitchNoColumn" : [ "5" ],
  "deviceId" : [ "555" ],
  "containerId" : [ "555" ],
  "childColumn" : [ "1" ]
}', '{
  "code" : 0,
  "msg" : "添加贝图箱位成功"
}', 0, null, '2020-08-07 08:44:52');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (427, '登录', 7, 'com.nts.business.api.SysUserApiController.loginout()', 'GET', 1, null, null, '/api/sysuser/loginout', '192.168.31.181', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "退出成功"
}', 0, null, '2020-08-07 08:54:49');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (428, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.181', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "d08d0fe4050b49c3a3e8b6a8830fce3e",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-07 08:54:52');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (429, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.181', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "77f4489538184152a7d6a203d2ae40ea",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-07 08:59:08');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (430, '贝图箱位', 1, 'com.nts.business.api.BoxPostitonApiContrtoller.addBoxPostiton()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/addBoxPostiton', '192.168.31.35', '内网IP', '{
  "boxareaId" : [ "1" ],
  "previewDirection" : [ "0" ],
  "pitchNoRow" : [ "5" ],
  "pitchNoColumn" : [ "1" ],
  "deviceId" : [ "00" ],
  "containerId" : [ "000" ],
  "childColumn" : [ "1" ]
}', '{
  "code" : 0,
  "msg" : "添加贝图箱位成功"
}', 0, null, '2020-08-07 09:08:19');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (431, '贝图箱位', 1, 'com.nts.business.api.BoxPostitonApiContrtoller.addBoxPostiton()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/addBoxPostiton', '192.168.31.35', '内网IP', '{
  "boxareaId" : [ "1" ],
  "previewDirection" : [ "1" ],
  "pitchNoRow" : [ "3" ],
  "pitchNoColumn" : [ "5" ],
  "deviceId" : [ "66" ],
  "containerId" : [ "66" ],
  "childColumn" : [ "2" ]
}', '{
  "code" : 0,
  "msg" : "添加贝图箱位成功"
}', 0, null, '2020-08-07 09:08:27');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (432, '贝图箱位', 1, 'com.nts.business.api.BoxPostitonApiContrtoller.addBoxPostiton()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/addBoxPostiton', '192.168.31.35', '内网IP', '{
  "boxareaId" : [ "1" ],
  "previewDirection" : [ "1" ],
  "pitchNoRow" : [ "1" ],
  "pitchNoColumn" : [ "6" ],
  "deviceId" : [ "667" ],
  "containerId" : [ "667" ],
  "childColumn" : [ "2" ]
}', '{
  "code" : 0,
  "msg" : "添加贝图箱位成功"
}', 0, null, '2020-08-07 09:08:35');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (433, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "b570bacecf9946f4a2b51fea7da53b2a",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-07 09:32:40');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (434, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.181', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "2cb8e3605ca24271a49fbeccf76daa6c",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-07 09:37:09');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (435, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "be0c1fc09eae4ebfb73f6ba6b060ef30",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-07 09:38:23');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (436, '贝图箱位', 2, 'com.nts.business.api.BoxPostitonApiContrtoller.editBoxPosition()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/editBoxPosition', '192.168.31.35', '内网IP', '{
  "boxareaId" : [ "1" ],
  "previewDirection" : [ "0" ],
  "pitchNoRow" : [ "5" ],
  "pitchNoColumn" : [ "1" ],
  "deviceId" : [ "123" ],
  "containerId" : [ "321" ],
  "id" : [ "22" ],
  "childColumn" : [ "1" ]
}', '{
  "code" : 0,
  "msg" : "修改贝图箱位成功"
}', 0, null, '2020-08-07 09:38:47');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (437, '贝图箱位', 1, 'com.nts.business.api.BoxPostitonApiContrtoller.addBoxPostiton()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/addBoxPostiton', '192.168.31.35', '内网IP', '{
  "boxareaId" : [ "1" ],
  "previewDirection" : [ "0" ],
  "pitchNoRow" : [ "5" ],
  "pitchNoColumn" : [ "2" ],
  "deviceId" : [ "555" ],
  "containerId" : [ "666" ],
  "childColumn" : [ "2" ]
}', '{
  "code" : 0,
  "msg" : "添加贝图箱位成功"
}', 0, null, '2020-08-07 09:39:07');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (438, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '127.0.0.1', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "3b4660e22d72497f82e11ee4221a4d15",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-07 09:39:42');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (439, '集装箱', 2, 'com.nts.business.api.ContainerApiController.cancelBind()', 'POST', 1, 'admin', '研发部门', '/api/ceontainer/cancelBind', '192.168.31.181', '内网IP', '{
  "containerId" : [ "9" ],
  "deviceId" : [ "15" ]
}', '{
  "code" : 55,
  "msg" : "设备未绑定集装箱"
}', 0, null, '2020-08-07 09:41:41');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (440, '集装箱', 2, 'com.nts.business.api.ContainerApiController.cancelBind()', 'POST', 1, 'admin', '研发部门', '/api/ceontainer/cancelBind', '192.168.31.181', '内网IP', '{
  "containerId" : [ "9" ],
  "deviceId" : [ "15" ]
}', '{
  "code" : 55,
  "msg" : "设备未绑定集装箱"
}', 0, null, '2020-08-07 09:41:44');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (441, '集装箱', 2, 'com.nts.business.api.ContainerApiController.cancelBind()', 'POST', 1, 'admin', '研发部门', '/api/ceontainer/cancelBind', '192.168.31.181', '内网IP', '{
  "containerId" : [ "9" ],
  "deviceId" : [ "16" ]
}', '{
  "code" : 55,
  "msg" : "设备未绑定集装箱"
}', 0, null, '2020-08-07 09:41:45');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (442, '集装箱', 2, 'com.nts.business.api.ContainerApiController.bindDeviceToContainer()', 'POST', 1, 'admin', '研发部门', '/api/ceontainer/bindDeviceToContainer', '192.168.31.181', '内网IP', '{
  "containerId" : [ "9" ],
  "deviceId" : [ "14" ]
}', '{
  "code" : 0,
  "msg" : "设备绑定成功"
}', 0, null, '2020-08-07 09:41:46');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (443, '集装箱', 2, 'com.nts.business.api.ContainerApiController.cancelBind()', 'POST', 1, 'admin', '研发部门', '/api/ceontainer/cancelBind', '192.168.31.181', '内网IP', '{
  "containerId" : [ "9" ],
  "deviceId" : [ "14" ]
}', '{
  "code" : 0,
  "msg" : "设备解绑成功"
}', 0, null, '2020-08-07 09:41:48');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (444, '集装箱', 2, 'com.nts.business.api.ContainerApiController.bindDeviceToContainer()', 'POST', 1, 'admin', '研发部门', '/api/ceontainer/bindDeviceToContainer', '192.168.31.181', '内网IP', '{
  "containerId" : [ "9" ],
  "deviceId" : [ "14" ]
}', '{
  "code" : 0,
  "msg" : "设备绑定成功"
}', 0, null, '2020-08-07 09:41:50');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (445, '集装箱', 2, 'com.nts.business.api.ContainerApiController.cancelBind()', 'POST', 1, 'admin', '研发部门', '/api/ceontainer/cancelBind', '192.168.31.181', '内网IP', '{
  "containerId" : [ "9" ],
  "deviceId" : [ "14" ]
}', '{
  "code" : 0,
  "msg" : "设备解绑成功"
}', 0, null, '2020-08-07 09:41:51');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (446, '集装箱', 2, 'com.nts.business.api.ContainerApiController.bindDeviceToContainer()', 'POST', 1, 'admin', '研发部门', '/api/ceontainer/bindDeviceToContainer', '192.168.31.181', '内网IP', '{
  "containerId" : [ "9" ],
  "deviceId" : [ "14" ]
}', '{
  "code" : 0,
  "msg" : "设备绑定成功"
}', 0, null, '2020-08-07 09:41:54');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (447, '集装箱', 2, 'com.nts.business.api.ContainerApiController.cancelBind()', 'POST', 1, 'admin', '研发部门', '/api/ceontainer/cancelBind', '192.168.31.181', '内网IP', '{
  "containerId" : [ "9" ],
  "deviceId" : [ "14" ]
}', '{
  "code" : 0,
  "msg" : "设备解绑成功"
}', 0, null, '2020-08-07 09:41:56');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (448, '集装箱', 2, 'com.nts.business.api.ContainerApiController.bindDeviceToContainer()', 'POST', 1, 'admin', '研发部门', '/api/ceontainer/bindDeviceToContainer', '192.168.31.181', '内网IP', '{
  "containerId" : [ "8" ],
  "deviceId" : [ "14" ]
}', '{
  "code" : 0,
  "msg" : "设备绑定成功"
}', 0, null, '2020-08-07 09:42:00');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (449, '集装箱', 2, 'com.nts.business.api.ContainerApiController.cancelBind()', 'POST', 1, 'admin', '研发部门', '/api/ceontainer/cancelBind', '192.168.31.181', '内网IP', '{
  "containerId" : [ "8" ],
  "deviceId" : [ "14" ]
}', '{
  "code" : 0,
  "msg" : "设备解绑成功"
}', 0, null, '2020-08-07 09:42:03');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (450, '集装箱', 2, 'com.nts.business.api.ContainerApiController.cancelBind()', 'POST', 1, 'admin', '研发部门', '/api/ceontainer/cancelBind', '192.168.31.181', '内网IP', '{
  "containerId" : [ "8" ],
  "deviceId" : [ "15" ]
}', '{
  "code" : 0,
  "msg" : "设备解绑成功"
}', 0, null, '2020-08-07 09:42:05');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (451, '集装箱', 2, 'com.nts.business.api.ContainerApiController.cancelBind()', 'POST', 1, 'admin', '研发部门', '/api/ceontainer/cancelBind', '192.168.31.181', '内网IP', '{
  "containerId" : [ "8" ],
  "deviceId" : [ "16" ]
}', '{
  "code" : 55,
  "msg" : "设备未绑定集装箱"
}', 0, null, '2020-08-07 09:42:06');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (452, '集装箱', 2, 'com.nts.business.api.ContainerApiController.bindDeviceToContainer()', 'POST', 1, 'admin', '研发部门', '/api/ceontainer/bindDeviceToContainer', '192.168.31.181', '内网IP', '{
  "containerId" : [ "9" ],
  "deviceId" : [ "15" ]
}', '{
  "code" : 0,
  "msg" : "设备绑定成功"
}', 0, null, '2020-08-07 09:42:16');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (453, '集装箱', 2, 'com.nts.business.api.ContainerApiController.cancelBind()', 'POST', 1, 'admin', '研发部门', '/api/ceontainer/cancelBind', '192.168.31.181', '内网IP', '{
  "containerId" : [ "9" ],
  "deviceId" : [ "15" ]
}', '{
  "code" : 0,
  "msg" : "设备解绑成功"
}', 0, null, '2020-08-07 09:42:18');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (454, '集装箱', 2, 'com.nts.business.api.ContainerApiController.bindDeviceToContainer()', 'POST', 1, 'admin', '研发部门', '/api/ceontainer/bindDeviceToContainer', '192.168.31.181', '内网IP', '{
  "containerId" : [ "8" ],
  "deviceId" : [ "15" ]
}', '{
  "code" : 0,
  "msg" : "设备绑定成功"
}', 0, null, '2020-08-07 09:42:21');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (455, '贝图箱位', 3, 'com.nts.business.api.BoxPostitonApiContrtoller.removeBoxPosition()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/removeBoxPosition', '192.168.31.35', '内网IP', '{
  "ids" : [ "9" ]
}', '{
  "code" : 0,
  "msg" : "删除贝图箱位成功"
}', 0, null, '2020-08-07 09:43:42');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (456, '贝图箱位', 3, 'com.nts.business.api.BoxPostitonApiContrtoller.removeBoxPosition()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/removeBoxPosition', '192.168.31.35', '内网IP', '{
  "ids" : [ "10" ]
}', '{
  "code" : 0,
  "msg" : "删除贝图箱位成功"
}', 0, null, '2020-08-07 09:44:54');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (457, '贝图箱位', 3, 'com.nts.business.api.BoxPostitonApiContrtoller.removeBoxPosition()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/removeBoxPosition', '192.168.31.35', '内网IP', '{
  "ids" : [ "8" ]
}', '{
  "code" : 0,
  "msg" : "删除贝图箱位成功"
}', 0, null, '2020-08-07 09:47:47');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (458, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '127.0.0.1', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "f0563b3d89ad4496b75a88135a1aecbe",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-07 09:47:56');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (459, '贝图箱位', 3, 'com.nts.business.api.BoxPostitonApiContrtoller.removeBoxPosition()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/removeBoxPosition', '192.168.31.35', '内网IP', '{
  "ids" : [ "25" ]
}', '{
  "code" : 0,
  "msg" : "删除贝图箱位成功"
}', 0, null, '2020-08-07 09:48:18');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (460, '贝图箱位', 3, 'com.nts.business.api.BoxPostitonApiContrtoller.removeBoxPosition()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/removeBoxPosition', '192.168.31.35', '内网IP', '{
  "ids" : [ "20" ]
}', '{
  "code" : 0,
  "msg" : "删除贝图箱位成功"
}', 0, null, '2020-08-07 09:49:44');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (461, '贝图箱位', 3, 'com.nts.business.api.BoxPostitonApiContrtoller.removeBoxPosition()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/removeBoxPosition', '192.168.31.35', '内网IP', '{
  "ids" : [ "19" ]
}', '{
  "code" : 0,
  "msg" : "删除贝图箱位成功"
}', 0, null, '2020-08-07 09:50:14');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (462, '贝图箱位', 3, 'com.nts.business.api.BoxPostitonApiContrtoller.removeBoxPosition()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/removeBoxPosition', '192.168.31.35', '内网IP', '{
  "ids" : [ "12" ]
}', '{
  "code" : 0,
  "msg" : "删除贝图箱位成功"
}', 0, null, '2020-08-07 09:50:21');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (463, '贝图箱位', 3, 'com.nts.business.api.BoxPostitonApiContrtoller.removeBoxPosition()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/removeBoxPosition', '192.168.31.35', '内网IP', '{
  "ids" : [ "1" ]
}', '{
  "code" : 0,
  "msg" : "删除贝图箱位成功"
}', 0, null, '2020-08-07 09:50:25');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (464, '贝图箱位', 3, 'com.nts.business.api.BoxPostitonApiContrtoller.removeBoxPosition()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/removeBoxPosition', '192.168.31.35', '内网IP', '{
  "ids" : [ "14" ]
}', '{
  "code" : 0,
  "msg" : "删除贝图箱位成功"
}', 0, null, '2020-08-07 09:50:27');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (465, '贝图箱位', 3, 'com.nts.business.api.BoxPostitonApiContrtoller.removeBoxPosition()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/removeBoxPosition', '192.168.31.35', '内网IP', '{
  "ids" : [ "15" ]
}', '{
  "code" : 0,
  "msg" : "删除贝图箱位成功"
}', 0, null, '2020-08-07 09:50:30');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (466, '贝图箱位', 3, 'com.nts.business.api.BoxPostitonApiContrtoller.removeBoxPosition()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/removeBoxPosition', '192.168.31.35', '内网IP', '{
  "ids" : [ "11" ]
}', '{
  "code" : 0,
  "msg" : "删除贝图箱位成功"
}', 0, null, '2020-08-07 09:50:31');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (467, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "21eed78e2a8b423e9f677cd10eef4077",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-07 09:51:22');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (468, '贝图箱位', 1, 'com.nts.business.api.BoxPostitonApiContrtoller.addBoxPostiton()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/addBoxPostiton', '192.168.31.35', '内网IP', '{
  "boxareaId" : [ "1" ],
  "previewDirection" : [ "0" ],
  "pitchNoRow" : [ "3" ],
  "pitchNoColumn" : [ "3" ],
  "deviceId" : [ "111" ],
  "containerId" : [ "2222" ],
  "childColumn" : [ "1" ]
}', '{
  "code" : 0,
  "msg" : "添加贝图箱位成功"
}', 0, null, '2020-08-07 09:51:40');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (469, '贝图箱位', 1, 'com.nts.business.api.BoxPostitonApiContrtoller.addBoxPostiton()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/addBoxPostiton', '192.168.31.35', '内网IP', '{
  "boxareaId" : [ "4" ],
  "previewDirection" : [ "0" ],
  "pitchNoRow" : [ "2" ],
  "pitchNoColumn" : [ "4" ],
  "deviceId" : [ "111" ],
  "containerId" : [ "222" ],
  "childColumn" : [ "1" ]
}', '{
  "code" : 0,
  "msg" : "添加贝图箱位成功"
}', 0, null, '2020-08-07 09:58:54');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (470, '贝图箱位', 1, 'com.nts.business.api.BoxPostitonApiContrtoller.addBoxPostiton()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/addBoxPostiton', '192.168.31.181', '内网IP', '{
  "boxareaId" : [ "1" ],
  "previewDirection" : [ "0" ],
  "pitchNoRow" : [ "5" ],
  "pitchNoColumn" : [ "2" ],
  "deviceId" : [ "24234235" ],
  "containerId" : [ "5323532" ],
  "childColumn" : [ "1" ]
}', '{
  "code" : 0,
  "msg" : "添加贝图箱位成功"
}', 0, null, '2020-08-07 10:12:31');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (471, '贝图箱位', 1, 'com.nts.business.api.BoxPostitonApiContrtoller.addBoxPostiton()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/addBoxPostiton', '192.168.31.181', '内网IP', '{
  "boxareaId" : [ "1" ],
  "previewDirection" : [ "0" ],
  "pitchNoRow" : [ "5" ],
  "pitchNoColumn" : [ "3" ],
  "deviceId" : [ "87978" ],
  "containerId" : [ "79897789" ],
  "childColumn" : [ "2" ]
}', '{
  "code" : 0,
  "msg" : "添加贝图箱位成功"
}', 0, null, '2020-08-07 10:14:00');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (472, '场地', 2, 'com.nts.business.api.SiteApiController.editSite()', 'POST', 1, 'admin', '研发部门', '/api/site/editSite', '192.168.31.181', '内网IP', '{
  "id" : [ "1" ],
  "siteName" : [ "场地1" ],
  "boxLocationSet" : [ "3" ]
}', '{
  "code" : 55,
  "msg" : "修改场地失败，该场地名称已经存在"
}', 0, null, '2020-08-07 10:14:15');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (473, '贝图箱位', 1, 'com.nts.business.api.BoxPostitonApiContrtoller.addBoxPostiton()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/addBoxPostiton', '192.168.31.35', '内网IP', '{
  "boxareaId" : [ "5" ],
  "previewDirection" : [ "0" ],
  "pitchNoRow" : [ "3" ],
  "pitchNoColumn" : [ "1" ],
  "deviceId" : [ "1" ],
  "containerId" : [ "2" ],
  "childColumn" : [ "1" ]
}', '{
  "code" : 0,
  "msg" : "添加贝图箱位成功"
}', 0, null, '2020-08-07 10:21:43');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (474, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "25485eef2d6140f2a6de008f909005db",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-07 10:24:41');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (475, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '127.0.0.1', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "c703f16728b64fa3b394d9fd6f93cef9",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-07 10:26:07');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (476, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '127.0.0.1', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "7c3eda09b18548da961cc957b0d3fcf8",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-07 10:30:44');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (477, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "14b90e16c5ee4239bcb9232ce38a87e4",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-07 10:49:36');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (478, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '127.0.0.1', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "29d3b49ccded4c048e56524476b3c98b",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-07 10:52:20');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (479, '登录', 7, 'com.nts.business.api.SysUserApiController.loginout()', 'GET', 1, null, null, '/api/sysuser/loginout', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "退出成功"
}', 0, null, '2020-08-07 13:02:45');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (480, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "1fb04c4e5d634753983242d2abcdb5f6",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-07 13:02:48');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (481, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.181', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "fda0c3bb569a471981715bc40437694a",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-07 13:53:34');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (482, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "a7ed117a5d9c48688c543cb13daa301c",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-07 14:08:34');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (483, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.181', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "4e0d03fefadc42a2823c43ff30435707",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-07 14:39:48');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (484, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '127.0.0.1', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "b4f437bf86494585bb8a9c2b2406cfac",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-07 14:50:01');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (485, '贝图箱位', 3, 'com.nts.business.api.BoxPostitonApiContrtoller.removeBoxPosition()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/removeBoxPosition', '192.168.31.35', '内网IP', '{
  "ids" : [ "22" ]
}', '{
  "code" : 0,
  "msg" : "删除贝图箱位成功"
}', 0, null, '2020-08-07 15:00:01');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (486, '贝图箱位', 3, 'com.nts.business.api.BoxPostitonApiContrtoller.removeBoxPosition()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/removeBoxPosition', '192.168.31.35', '内网IP', '{
  "ids" : [ "28" ]
}', '{
  "code" : 0,
  "msg" : "删除贝图箱位成功"
}', 0, null, '2020-08-07 15:00:03');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (487, '贝图箱位', 3, 'com.nts.business.api.BoxPostitonApiContrtoller.removeBoxPosition()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/removeBoxPosition', '192.168.31.35', '内网IP', '{
  "ids" : [ "29" ]
}', '{
  "code" : 0,
  "msg" : "删除贝图箱位成功"
}', 0, null, '2020-08-07 15:00:05');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (488, '贝图箱位', 3, 'com.nts.business.api.BoxPostitonApiContrtoller.removeBoxPosition()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/removeBoxPosition', '192.168.31.35', '内网IP', '{
  "ids" : [ "26" ]
}', '{
  "code" : 0,
  "msg" : "删除贝图箱位成功"
}', 0, null, '2020-08-07 15:00:08');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (489, '贝图箱位', 1, 'com.nts.business.api.BoxPostitonApiContrtoller.addBoxPostiton()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/addBoxPostiton', '192.168.31.35', '内网IP', '{
  "boxareaId" : [ "1" ],
  "previewDirection" : [ "0" ],
  "pitchNoRow" : [ "5" ],
  "pitchNoColumn" : [ "1" ],
  "deviceId" : [ "514901342577801" ],
  "containerId" : [ "123456" ],
  "childColumn" : [ "1" ]
}', '{
  "code" : 0,
  "msg" : "添加贝图箱位成功"
}', 0, null, '2020-08-07 15:00:18');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (490, '贝图箱位', 1, 'com.nts.business.api.BoxPostitonApiContrtoller.addBoxPostiton()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/addBoxPostiton', '192.168.31.35', '内网IP', '{
  "boxareaId" : [ "1" ],
  "previewDirection" : [ "0" ],
  "pitchNoRow" : [ "1" ],
  "pitchNoColumn" : [ "6" ],
  "deviceId" : [ "11" ],
  "containerId" : [ "222" ],
  "childColumn" : [ "2" ]
}', '{
  "code" : 0,
  "msg" : "添加贝图箱位成功"
}', 0, null, '2020-08-07 15:00:27');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (491, '场地', 1, 'com.nts.business.api.SiteApiController.addSite()', 'POST', 1, 'admin', '研发部门', '/api/site/addSite', '192.168.31.35', '内网IP', '{
  "siteName" : [ "ss" ],
  "boxLocationSet" : [ "3" ]
}', '{
  "code" : 0,
  "msg" : "场地添加成功"
}', 0, null, '2020-08-07 15:19:45');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (492, '贝图箱位', 1, 'com.nts.business.api.BoxPostitonApiContrtoller.addBoxPostiton()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/addBoxPostiton', '192.168.31.35', '内网IP', '{
  "boxareaId" : [ "1" ],
  "previewDirection" : [ "0" ],
  "pitchNoRow" : [ "3" ],
  "pitchNoColumn" : [ "3" ],
  "deviceId" : [ "1" ],
  "containerId" : [ "1" ],
  "childColumn" : [ "2" ]
}', '{
  "code" : 0,
  "msg" : "添加贝图箱位成功"
}', 0, null, '2020-08-07 16:01:32');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (493, '箱位区域', 3, 'com.nts.business.api.SiteApiController.removeBoxarea()', 'POST', 1, 'admin', '研发部门', '/api/site/removeBoxarea', '192.168.31.35', '内网IP', '{
  "boxareaId" : [ "7" ]
}', 'null', 1, '
### Error querying database.  Cause: java.sql.SQLSyntaxErrorException: You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ''where id = (select site_id from nts_boxarea where id = 7)'' at line 3
### The error may exist in URL [jar:file:/C:/Users/Administrator/Desktop/nts-admin.jar!/BOOT-INF/lib/nts-business-4.1.0.jar!/mapper/business/NtsSiteMapper.xml]
### The error may involve com.nts.business.mapper.NtsSiteMapper.selectNtsSiteByBoxareaId-Inline
### The error occurred while setting parameters
### SQL: select id, site_name, box_location_set, dept_id, user_id, delete_flag, create_time, update_time from nts_site               where id = where id = (select site_id from nts_boxarea where id = ?)
### Cause: java.sql.SQLSyntaxErrorException: You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ''where id = (select site_id from nts_boxarea where id = 7)'' at line 3
; bad SQL grammar []; nested exception is java.sql.SQLSyntaxErrorException: You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ''where id = (select site_id from nts_boxarea where id = 7)'' at line 3', '2020-08-07 17:16:56');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (494, '箱位区域', 2, 'com.nts.business.api.SiteApiController.editBoxarea()', 'POST', 1, 'admin', '研发部门', '/api/site/editBoxarea', '192.168.31.35', '内网IP', '{
  "id" : [ "6" ],
  "siteId" : [ "2" ],
  "boxareaName" : [ "test-03" ],
  "maxColumn" : [ "5" ],
  "maxRow" : [ "5" ],
  "sortord" : [ "0" ],
  "shellfisStructure" : [ "0" ]
}', '{
  "code" : 0,
  "msg" : "箱位区域修改成功"
}', 0, null, '2020-08-07 17:18:15');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (495, '场地', 3, 'com.nts.business.api.SiteApiController.delSite()', 'POST', 1, 'admin', '研发部门', '/api/site/delSite', '192.168.31.35', '内网IP', '{
  "siteId" : [ "3" ]
}', '{
  "code" : 0,
  "msg" : "场地删除成功"
}', 0, null, '2020-08-07 17:20:38');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (496, '箱位区域', 2, 'com.nts.business.api.SiteApiController.editBoxarea()', 'POST', 1, 'admin', '研发部门', '/api/site/editBoxarea', '192.168.31.35', '内网IP', '{
  "id" : [ "16" ],
  "siteId" : [ "5" ],
  "boxareaName" : [ "yyy-02" ],
  "maxColumn" : [ "4" ],
  "maxRow" : [ "4" ],
  "sortord" : [ "0" ],
  "shellfisStructure" : [ "1" ]
}', '{
  "code" : 0,
  "msg" : "箱位区域修改成功"
}', 0, null, '2020-08-07 17:25:04');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (497, '箱位区域', 2, 'com.nts.business.api.SiteApiController.editBoxarea()', 'POST', 1, 'admin', '研发部门', '/api/site/editBoxarea', '192.168.31.35', '内网IP', '{
  "id" : [ "1011" ],
  "siteId" : [ "6" ],
  "boxareaName" : [ "000-987" ],
  "maxColumn" : [ "6" ],
  "maxRow" : [ "7" ],
  "sortord" : [ "0" ],
  "shellfisStructure" : [ "0" ]
}', '{
  "code" : 0,
  "msg" : "箱位区域修改成功"
}', 0, null, '2020-08-07 17:37:36');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (498, '贝图箱位', 1, 'com.nts.business.api.BoxPostitonApiContrtoller.addBoxPostiton()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/addBoxPostiton', '192.168.31.35', '内网IP', '{
  "boxareaId" : [ "1011" ],
  "previewDirection" : [ "0" ],
  "pitchNoRow" : [ "6" ],
  "pitchNoColumn" : [ "1" ],
  "deviceId" : [ "4" ],
  "containerId" : [ "4" ],
  "childColumn" : [ "1" ]
}', '{
  "code" : 0,
  "msg" : "添加贝图箱位成功"
}', 0, null, '2020-08-07 17:37:47');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (499, '企业/部门', 1, 'com.nts.business.api.SysDeptApiController.addDeptSave()', 'POST', 1, 'admin', '研发部门', '/api/sysdept/addDeptSave', '192.168.31.35', '内网IP', '{
  "deptName" : [ "123" ],
  "email" : [ "123" ],
  "enterpriseLocation" : [ "123" ],
  "leader" : [ "123" ],
  "phone" : [ "123" ],
  "duty" : [ "123" ],
  "parentId" : [ "0" ]
}', '{
  "code" : 0,
  "msg" : "新增企业/部门''123''成功"
}', 0, null, '2020-08-07 17:43:06');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (500, '登录', 7, 'com.nts.business.api.SysUserApiController.loginout()', 'GET', 1, null, null, '/api/sysuser/loginout', '192.168.31.181', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "退出成功"
}', 0, null, '2020-08-07 17:52:24');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (501, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.181', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "64b2bfbaf69c4d0094b67e6435429b51",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-07 17:52:27');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (502, '企业/部门', 2, 'com.nts.business.api.SysDeptApiController.editDeptSave()', 'POST', 1, 'admin', '研发部门', '/api/sysdept/editDeptSave', '192.168.31.35', '内网IP', '{
  "deptId" : [ "100" ],
  "parentId" : [ "0" ],
  "deptName" : [ "新时空智能" ],
  "leader" : [ "管理员" ]
}', '{
  "code" : 0,
  "msg" : "修改企业/部门''新时空智能''成功"
}', 0, null, '2020-08-07 17:54:50');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (503, '企业/部门', 1, 'com.nts.business.api.SysDeptApiController.addDeptSave()', 'POST', 1, 'admin', '研发部门', '/api/sysdept/addDeptSave', '192.168.31.35', '内网IP', '{
  "deptName" : [ "1" ],
  "email" : [ "2" ],
  "enterpriseLocation" : [ "3" ],
  "leader" : [ "4" ],
  "phone" : [ "5" ],
  "duty" : [ "6" ],
  "parentId" : [ "0" ]
}', '{
  "code" : 0,
  "msg" : "新增企业/部门''1''成功"
}', 0, null, '2020-08-07 17:55:20');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (504, '字典数据', 1, 'com.nts.business.api.SysDictApiController.addDictData()', 'POST', 1, 'admin', '研发部门', '/api/sysdict/addDictData', '192.168.31.181', '内网IP', '{
  "dictLabel" : [ "test" ],
  "dictValue" : [ "12" ],
  "dictType" : [ "sys_user_sex" ]
}', '{
  "code" : 0,
  "msg" : "新增字典成功"
}', 0, null, '2020-08-07 17:58:50');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (505, '企业/部门', 1, 'com.nts.business.api.SysDeptApiController.addDeptSave()', 'POST', 1, 'admin', '研发部门', '/api/sysdept/addDeptSave', '192.168.31.35', '内网IP', '{
  "deptName" : [ "0" ],
  "email" : [ "9" ],
  "enterpriseLocation" : [ "8" ],
  "leader" : [ "7" ],
  "phone" : [ "6" ],
  "duty" : [ "5" ],
  "parentId" : [ "0" ]
}', '{
  "code" : 0,
  "msg" : "新增企业/部门''0''成功"
}', 0, null, '2020-08-07 18:04:04');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (506, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '127.0.0.1', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "67e2dfc862a447709acdc177cdf509bc",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-07 18:04:09');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (507, '企业/部门', 1, 'com.nts.business.api.SysDeptApiController.addDeptSave()', 'POST', 1, 'admin', '研发部门', '/api/sysdept/addDeptSave', '127.0.0.1', '内网IP', '{
  "ancestors" : [ "" ],
  "deptId" : [ "" ],
  "deptName" : [ "哈哈哈1111" ],
  "email" : [ "111@qq.com" ],
  "enterpriseLocation" : [ "哈哈哈1111" ],
  "leader" : [ "哈哈哈1111" ],
  "orderNum" : [ "" ],
  "parentId" : [ "208" ],
  "parentName" : [ "" ],
  "phone" : [ "" ],
  "responsibility" : [ "aaaaaaaaaaaaaaa" ],
  "status" : [ "" ]
}', 'null', 1, '部门停用，不允许新增', '2020-08-07 18:05:11');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (508, '企业/部门', 1, 'com.nts.business.api.SysDeptApiController.addDeptSave()', 'POST', 1, 'admin', '研发部门', '/api/sysdept/addDeptSave', '127.0.0.1', '内网IP', '{
  "ancestors" : [ "" ],
  "deptId" : [ "" ],
  "deptName" : [ "哈哈哈121" ],
  "email" : [ "111@qq.com" ],
  "enterpriseLocation" : [ "哈哈哈1111" ],
  "leader" : [ "哈哈哈1111" ],
  "orderNum" : [ "" ],
  "parentId" : [ "208" ],
  "parentName" : [ "" ],
  "phone" : [ "" ],
  "responsibility" : [ "aaaaaaaaaaaaaaa" ],
  "status" : [ "" ]
}', 'null', 1, '部门停用，不允许新增', '2020-08-07 18:05:23');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (509, '企业/部门', 1, 'com.nts.business.api.SysDeptApiController.addDeptSave()', 'POST', 1, 'admin', '研发部门', '/api/sysdept/addDeptSave', '127.0.0.1', '内网IP', '{
  "ancestors" : [ "" ],
  "deptId" : [ "" ],
  "deptName" : [ "哈哈哈121" ],
  "email" : [ "111@qq.com" ],
  "enterpriseLocation" : [ "哈哈哈1111" ],
  "leader" : [ "哈哈哈1111" ],
  "orderNum" : [ "" ],
  "parentId" : [ "208" ],
  "parentName" : [ "" ],
  "phone" : [ "" ],
  "responsibility" : [ "aaaaaaaaaaaaaaa" ],
  "status" : [ "" ]
}', 'null', 1, '部门停用，不允许新增', '2020-08-07 18:05:51');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (510, '企业/部门', 1, 'com.nts.business.api.SysDeptApiController.addDeptSave()', 'POST', 1, 'admin', '研发部门', '/api/sysdept/addDeptSave', '127.0.0.1', '内网IP', '{
  "ancestors" : [ "" ],
  "deptId" : [ "" ],
  "deptName" : [ "哈哈哈121" ],
  "email" : [ "111@qq.com" ],
  "enterpriseLocation" : [ "哈哈哈1111" ],
  "leader" : [ "哈哈哈1111" ],
  "orderNum" : [ "" ],
  "parentId" : [ "208" ],
  "parentName" : [ "" ],
  "phone" : [ "" ],
  "responsibility" : [ "aaaaaaaaaaaaaaa" ],
  "status" : [ "" ]
}', '{
  "code" : 0,
  "msg" : "新增企业/部门''哈哈哈121''成功"
}', 0, null, '2020-08-07 18:06:18');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (511, '企业/部门', 1, 'com.nts.business.api.SysDeptApiController.addDeptSave()', 'POST', 1, 'admin', '研发部门', '/api/sysdept/addDeptSave', '127.0.0.1', '内网IP', '{
  "ancestors" : [ "" ],
  "deptId" : [ "" ],
  "deptName" : [ "哈哈哈121" ],
  "email" : [ "111@qq.com" ],
  "enterpriseLocation" : [ "哈哈哈1111" ],
  "leader" : [ "哈哈哈1111" ],
  "orderNum" : [ "" ],
  "parentId" : [ "208" ],
  "parentName" : [ "" ],
  "phone" : [ "" ],
  "responsibility" : [ "aaaaaaaaaaaaaaa" ],
  "status" : [ "" ]
}', '{
  "code" : 0,
  "msg" : "新增企业/部门''哈哈哈121''成功"
}', 0, null, '2020-08-07 18:08:02');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (512, '企业/部门', 1, 'com.nts.business.api.SysDeptApiController.addDeptSave()', 'POST', 1, 'admin', '研发部门', '/api/sysdept/addDeptSave', '127.0.0.1', '内网IP', '{
  "ancestors" : [ "" ],
  "deptId" : [ "" ],
  "deptName" : [ "哈哈哈121" ],
  "email" : [ "111@qq.com" ],
  "enterpriseLocation" : [ "哈哈哈1111" ],
  "leader" : [ "哈哈哈1111" ],
  "orderNum" : [ "" ],
  "parentId" : [ "208" ],
  "parentName" : [ "" ],
  "phone" : [ "" ],
  "responsibility" : [ "aaaaaaaaaaaaaaa" ],
  "status" : [ "" ]
}', '{
  "code" : 55,
  "msg" : "新增企业/部门''哈哈哈121''失败，企业/部门名称已存在"
}', 0, null, '2020-08-07 18:08:06');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (513, '企业/部门', 1, 'com.nts.business.api.SysDeptApiController.addDeptSave()', 'POST', 1, 'admin', '研发部门', '/api/sysdept/addDeptSave', '127.0.0.1', '内网IP', '{
  "ancestors" : [ "" ],
  "deptId" : [ "" ],
  "deptName" : [ "哈哈哈121" ],
  "email" : [ "111@qq.com" ],
  "enterpriseLocation" : [ "哈哈哈1111" ],
  "leader" : [ "哈哈哈1111" ],
  "orderNum" : [ "" ],
  "parentId" : [ "208" ],
  "parentName" : [ "" ],
  "phone" : [ "" ],
  "responsibility" : [ "aaaaaaaaaaaaaaa" ],
  "status" : [ "" ]
}', '{
  "code" : 0,
  "msg" : "新增企业/部门''哈哈哈121''成功"
}', 0, null, '2020-08-07 18:09:38');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (514, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '127.0.0.1', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "9231302417a145408878071cbbfd0f60",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-07 18:13:15');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (515, '用户', 1, 'com.nts.business.api.SysUserApiController.addUserSave()', 'POST', 1, 'admin', '研发部门', '/api/sysuser/addaddUserSave', '192.168.31.35', '内网IP', '{
  "postIds" : [ "" ],
  "roleIds" : [ "2" ],
  "userName" : [ "77" ],
  "password" : [ "777777" ],
  "loginName" : [ "777" ],
  "status" : [ "0" ],
  "deptId" : [ "206" ]
}', 'null', 1, '', '2020-08-07 18:14:17');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (516, '用户', 1, 'com.nts.business.api.SysUserApiController.addUserSave()', 'POST', 1, 'admin', '研发部门', '/api/sysuser/addaddUserSave', '192.168.31.35', '内网IP', '{
  "postIds" : [ "" ],
  "roleIds" : [ "2" ],
  "userName" : [ "90" ],
  "password" : [ "909090" ],
  "loginName" : [ "90" ],
  "status" : [ "0" ]
}', 'null', 1, '', '2020-08-07 18:15:35');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (517, '用户', 1, 'com.nts.business.api.SysUserApiController.addUserSave()', 'POST', 1, 'admin', '研发部门', '/api/sysuser/addaddUserSave', '192.168.31.35', '内网IP', '{
  "postIds" : [ "" ],
  "roleIds" : [ "2" ],
  "userName" : [ "67" ],
  "password" : [ "676767" ],
  "loginName" : [ "67" ],
  "status" : [ "0" ],
  "deptId" : [ "206" ]
}', 'null', 1, '', '2020-08-07 18:16:01');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (518, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "a30464c0b2d946c8be65a3d5ee26a839",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-07 18:23:00');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (519, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '127.0.0.1', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "b6f3187ee3bc45628010a24661c15bd7",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-07 18:31:12');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (520, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "25c18427a07948c7ac7cbedf76966a22",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-07 18:32:11');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (521, '用户', 1, 'com.nts.business.api.SysUserApiController.addUserSave()', 'POST', 1, 'admin', '研发部门', '/api/sysuser/addaddUserSave', '127.0.0.1', '内网IP', '{
  "postIds" : [ "" ],
  "roleIds" : [ "" ],
  "childFlag" : [ "0" ],
  "deptId" : [ "214" ],
  "email" : [ "111@qq.com" ],
  "loginName" : [ "zhangsang" ],
  "parentId" : [ "" ],
  "password" : [ "zhangsang" ],
  "phonenumber" : [ "111111122" ],
  "remark" : [ "" ],
  "sex" : [ "" ],
  "status" : [ "0" ],
  "userId" : [ "" ],
  "userName" : [ "zhangsang" ]
}', '{
  "code" : 0,
  "msg" : "操作成功",
  "data" : 1
}', 0, null, '2020-08-07 18:33:31');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (522, '菜单', 1, 'com.nts.business.api.SysMenuApiController.addMenuSave()', 'POST', 1, 'admin', '研发部门', '/api/sysmen/addMenuSave', '192.168.31.35', '内网IP', '{
  "menuName" : [ "tt" ],
  "perms" : [ "ttt4444" ]
}', '{
  "code" : 0,
  "msg" : "新增菜单''tt''成功"
}', 0, null, '2020-08-07 18:42:33');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (523, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '127.0.0.1', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "be287a4676b74a5db8aff38449de86b9",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-07 18:46:24');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (524, '用户', 1, 'com.nts.business.api.SysUserApiController.addUserSave()', 'POST', 1, 'admin', '研发部门', '/api/sysuser/addaddUserSave', '192.168.31.35', '内网IP', '{
  "postIds" : [ "" ],
  "roleIds" : [ "2" ],
  "childFlag" : [ "0" ],
  "userName" : [ "oioioi" ],
  "password" : [ "oioioi" ],
  "loginName" : [ "oioioi" ],
  "status" : [ "0" ],
  "deptId" : [ "100" ]
}', '{
  "code" : 55,
  "msg" : "新增用户失败，该企业已存在企业账号"
}', 0, null, '2020-08-07 18:48:11');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (525, '用户', 1, 'com.nts.business.api.SysUserApiController.addUserSave()', 'POST', 1, 'admin', '研发部门', '/api/sysuser/addaddUserSave', '192.168.31.35', '内网IP', '{
  "postIds" : [ "" ],
  "roleIds" : [ "2" ],
  "childFlag" : [ "0" ],
  "userName" : [ "oioioi" ],
  "password" : [ "oioioi" ],
  "loginName" : [ "oioioi" ],
  "status" : [ "0" ],
  "deptId" : [ "100" ]
}', '{
  "code" : 55,
  "msg" : "新增用户失败，该企业已存在企业账号"
}', 0, null, '2020-08-07 18:48:17');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (526, '用户', 1, 'com.nts.business.api.SysUserApiController.addUserSave()', 'POST', 1, 'admin', '研发部门', '/api/sysuser/addaddUserSave', '192.168.31.35', '内网IP', '{
  "postIds" : [ "" ],
  "roleIds" : [ "2" ],
  "childFlag" : [ "0" ],
  "userName" : [ "oioioi" ],
  "password" : [ "oioioi" ],
  "loginName" : [ "oioioi" ],
  "status" : [ "0" ],
  "deptId" : [ "100" ]
}', '{
  "code" : 55,
  "msg" : "新增用户失败，该企业已存在企业账号"
}', 0, null, '2020-08-07 18:48:21');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (527, '用户', 1, 'com.nts.business.api.SysUserApiController.addUserSave()', 'POST', 1, 'admin', '研发部门', '/api/sysuser/addaddUserSave', '192.168.31.35', '内网IP', '{
  "postIds" : [ "" ],
  "roleIds" : [ "2" ],
  "childFlag" : [ "0" ],
  "userName" : [ "oioioi" ],
  "password" : [ "oioioi" ],
  "loginName" : [ "oioioi" ],
  "status" : [ "0" ],
  "deptId" : [ "100" ]
}', '{
  "code" : 55,
  "msg" : "新增用户失败，该企业已存在企业账号"
}', 0, null, '2020-08-07 18:48:26');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (528, '用户', 1, 'com.nts.business.api.SysUserApiController.addUserSave()', 'POST', 1, 'admin', '研发部门', '/api/sysuser/addaddUserSave', '192.168.31.35', '内网IP', '{
  "postIds" : [ "" ],
  "roleIds" : [ "2" ],
  "childFlag" : [ "0" ],
  "userName" : [ "oioioi" ],
  "password" : [ "oioioi" ],
  "loginName" : [ "oioioi" ],
  "status" : [ "0" ],
  "deptId" : [ "210" ]
}', '{
  "code" : 0,
  "msg" : "操作成功",
  "data" : 1
}', 0, null, '2020-08-07 18:48:36');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (529, '用户', 2, 'com.nts.business.api.SysUserApiController.editUserSave()', 'POST', 1, 'admin', '研发部门', '/api/sysuser/editUserSave', '192.168.31.35', '内网IP', '{
  "postIds" : [ "" ],
  "roleIds" : [ "2" ],
  "childFlag" : [ "0" ],
  "userId" : [ "130" ],
  "userName" : [ "oioioi7" ],
  "loginName" : [ "oioioi" ],
  "status" : [ "0" ]
}', '{
  "code" : 0,
  "msg" : "修改用户成功"
}', 0, null, '2020-08-07 18:50:34');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (530, '用户', 2, 'com.nts.business.api.SysUserApiController.editUserSave()', 'POST', 1, 'admin', '研发部门', '/api/sysuser/editUserSave', '192.168.31.35', '内网IP', '{
  "postIds" : [ "" ],
  "roleIds" : [ "2" ],
  "childFlag" : [ "0" ],
  "userId" : [ "130" ],
  "userName" : [ "oioioi7" ],
  "password" : [ "555555" ],
  "loginName" : [ "oioioi" ],
  "status" : [ "0" ]
}', '{
  "code" : 0,
  "msg" : "修改用户成功"
}', 0, null, '2020-08-07 18:50:55');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (531, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '127.0.0.1', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "2199606a9d5c4ab4aa6ce204b755d0ba",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-07 18:57:39');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (532, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "9044d81d9dee4e1485def8818802189d",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-07 19:00:24');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (533, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 11,
  "msg" : "账号或密码错误！"
}', 0, null, '2020-08-07 19:14:08');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (534, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 11,
  "msg" : "账号或密码错误！"
}', 0, null, '2020-08-07 19:14:14');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (535, '登录', 7, 'com.nts.business.api.SysUserApiController.loginout()', 'GET', 1, null, null, '/api/sysuser/loginout', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "退出成功"
}', 0, null, '2020-08-07 19:14:26');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (536, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "2c8256b0585348b999a06e6b1cdcb2bf",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-07 19:14:33');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (537, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "be9651ceb60f427995eae8f5332d09a4",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-07 19:14:40');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (538, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "2f4b9ae905be4283b9eecf30f5f2dcdf",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-07 19:17:26');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (539, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "e4396756e0794d00b2397d34894a5289",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-07 19:17:46');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (540, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "34d9c2ff1e52432f88c1a7e579006377",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-07 19:17:53');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (541, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "d2f381206c7f49a5a1f91c386faf591c",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-07 19:21:39');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (542, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "3c05b5ada9f84f028edcb4983c8eb70b",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-10 08:56:02');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (543, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "a3607bb839ea42249aec7670c11720d6",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-10 09:21:40');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (544, '登录', 7, 'com.nts.business.api.SysUserApiController.loginout()', 'GET', 1, null, null, '/api/sysuser/loginout', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "退出成功"
}', 0, null, '2020-08-10 09:34:08');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (545, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "f8ac428310b04fe49d5dbf354305cf23",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-10 09:34:11');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (546, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "d4229c680d5a4f7a843b1fde28ac07f1",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-10 10:04:05');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (547, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "c45cad4b18204997b1cc1f34e07a44f0",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-10 10:06:50');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (548, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "1a99fcff32f64097aefe7d8bfd0b88a0",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-10 10:10:17');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (549, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "c90fd18abd33416d9700101a32567b31",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-10 10:13:05');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (550, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "715ee250481a47508c5cdbd2d382ca69",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-10 10:14:23');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (551, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "89ad6fa389e74d109d2d2f22cf0a321f",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-10 10:17:24');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (552, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "a325c4f4e20f4efd941ef0c858a0a7a6",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-10 10:19:11');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (553, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "7a6984acb01947cd901d178deb8d4ccf",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-10 10:19:52');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (554, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "330920b9aa2e41d5b0fdd3cc329d42d7",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-10 10:22:59');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (555, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "59ba43fdaf264f9fab99ca36363144dc",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-10 10:25:58');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (556, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "2ce86ef1f9fb4ea49f1729aac91df7b1",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-10 11:02:47');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (557, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, null, null, '/api/auth/login', '192.168.31.181', '内网IP', '{ }', '{
  "code" : 11,
  "msg" : "账号或密码错误！"
}', 0, null, '2020-08-10 11:12:02');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (558, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, null, null, '/api/auth/login', '192.168.31.181', '内网IP', '{ }', '{
  "code" : 11,
  "msg" : "账号或密码错误！"
}', 0, null, '2020-08-10 11:12:34');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (559, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.181', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "df3607e297c745b081fc65af50d0bc08",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-10 11:12:42');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (560, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.154', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "d853a118f0cb48d2b831d344d7d25a1e",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-10 11:13:41');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (561, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "c48bbefbb40444dda728ee24bbce47b5",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-10 11:29:46');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (562, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "21fc5e4e914042c0914827a491bc0387",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-10 11:35:34');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (563, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', 'null', 1, 'nested exception is org.apache.ibatis.exceptions.PersistenceException: 
### Error querying database.  Cause: org.springframework.jdbc.CannotGetJdbcConnectionException: Failed to obtain JDBC Connection; nested exception is com.alibaba.druid.pool.GetConnectionTimeoutException: wait millis 60088, active 20, maxActive 20, creating 0, runningSqlCount 2 : SELECT COUNT(0)
FROM (
	SELECT di.id, di.device_sn, di.bind_container, di.asset_type, di.asset_id
		, di.oem, di.tamb, di.tamb_q, di.tusda4, di.tusda4_q
		, di.pctco2, di.pctco2_q, di.pctco2_set, di.pctco2_set_q, di.di.psuc
		, di.psuc_q, di.tdis, di.tdis_q, di.freq_comp, di.tsuc
		, di.tsuc_q, di.mcond, di.pcond, di.pcond_q, di.tcond
		, di.tcond_q, di.mctrl, di.snctrl, di.amp_pha, di.amp_phb
		, di.amp_phc, di.pdis, di.pdis_q, di.pct_econ_vlv, di.pct_econ_vlv_q
		, di.pct_exp_vlv, di.pct_exp_vlv_q, di.tevap, di.tevap_q, di.mctrl3
		, di.pct_htr, di.pct_htr_q, di.mevap_fan_hs, di.pct_gas_vlv, di.pct_gas_vlv_q
		, di.pct_hum, di.pct_hum_q, di.pct_hum_set, di.pct_hum_set_q, di.freq_line
		, di.freq_line_q, di.vline1, di.vline2, di.vline3, di.mevap_fan_ls
		, di.pct_o2, di.pct_o2_q, di.pct_o2_set, di.pct_o2_set_q, di.mctrl2
		, di.trtn1, di.trtn1_q, di.trtn2, di.trtn2_q, di.tset
		, di.tset_q, di.ver_sw_major, di.ver_sw_minor, di.pct_suc_vlv, di.pct_suc_vlv_q
		, di.tsup1, di.tsup1_q, di.tsup2, di.tsup2_q, di.amp_total_draw
		, di.amp_total_draw_q, di.tusda1, di.tusda1_q, di.tusda2, di.tusda2_q
		, di.tusda3, di.tusda3_q, di.cmh_vent, di.cmh_vent_q, di.bk_num
		, di.tbk, di.tbk_q, di.ptidtm, di.pti_result, di.create_time
		, di.event_infos, di.preview_direction, di.pitch_no_row, di.pitch_no_column, di.child_column
	FROM (
		SELECT rd.id, rd.device_sn, rd.bind_container, rd.asset_type, rd.asset_id
			, rd.oem, rd.tamb, rd.tamb_q, rd.tusda4, rd.tusda4_q
			, rd.pctco2, rd.pctco2_q, rd.pctco2_set, rd.pctco2_set_q, rd.psuc
			, rd.psuc_q, rd.tdis, rd.tdis_q, rd.freq_comp, rd.tsuc
			, rd.tsuc_q, rd.mcond, rd.pcond, rd.pcond_q', '2020-08-10 11:44:34');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (564, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', 'null', 1, 'nested exception is org.apache.ibatis.exceptions.PersistenceException: 
### Error querying database.  Cause: org.springframework.jdbc.CannotGetJdbcConnectionException: Failed to obtain JDBC Connection; nested exception is com.alibaba.druid.pool.GetConnectionTimeoutException: wait millis 60080, active 20, maxActive 20, creating 0, runningSqlCount 2 : SELECT COUNT(0)
FROM (
	SELECT di.id, di.device_sn, di.bind_container, di.asset_type, di.asset_id
		, di.oem, di.tamb, di.tamb_q, di.tusda4, di.tusda4_q
		, di.pctco2, di.pctco2_q, di.pctco2_set, di.pctco2_set_q, di.di.psuc
		, di.psuc_q, di.tdis, di.tdis_q, di.freq_comp, di.tsuc
		, di.tsuc_q, di.mcond, di.pcond, di.pcond_q, di.tcond
		, di.tcond_q, di.mctrl, di.snctrl, di.amp_pha, di.amp_phb
		, di.amp_phc, di.pdis, di.pdis_q, di.pct_econ_vlv, di.pct_econ_vlv_q
		, di.pct_exp_vlv, di.pct_exp_vlv_q, di.tevap, di.tevap_q, di.mctrl3
		, di.pct_htr, di.pct_htr_q, di.mevap_fan_hs, di.pct_gas_vlv, di.pct_gas_vlv_q
		, di.pct_hum, di.pct_hum_q, di.pct_hum_set, di.pct_hum_set_q, di.freq_line
		, di.freq_line_q, di.vline1, di.vline2, di.vline3, di.mevap_fan_ls
		, di.pct_o2, di.pct_o2_q, di.pct_o2_set, di.pct_o2_set_q, di.mctrl2
		, di.trtn1, di.trtn1_q, di.trtn2, di.trtn2_q, di.tset
		, di.tset_q, di.ver_sw_major, di.ver_sw_minor, di.pct_suc_vlv, di.pct_suc_vlv_q
		, di.tsup1, di.tsup1_q, di.tsup2, di.tsup2_q, di.amp_total_draw
		, di.amp_total_draw_q, di.tusda1, di.tusda1_q, di.tusda2, di.tusda2_q
		, di.tusda3, di.tusda3_q, di.cmh_vent, di.cmh_vent_q, di.bk_num
		, di.tbk, di.tbk_q, di.ptidtm, di.pti_result, di.create_time
		, di.event_infos, di.preview_direction, di.pitch_no_row, di.pitch_no_column, di.child_column
	FROM (
		SELECT rd.id, rd.device_sn, rd.bind_container, rd.asset_type, rd.asset_id
			, rd.oem, rd.tamb, rd.tamb_q, rd.tusda4, rd.tusda4_q
			, rd.pctco2, rd.pctco2_q, rd.pctco2_set, rd.pctco2_set_q, rd.psuc
			, rd.psuc_q, rd.tdis, rd.tdis_q, rd.freq_comp, rd.tsuc
			, rd.tsuc_q, rd.mcond, rd.pcond, rd.pcond_q', '2020-08-10 11:44:38');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (565, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', 'null', 1, 'nested exception is org.apache.ibatis.exceptions.PersistenceException: 
### Error querying database.  Cause: org.springframework.jdbc.CannotGetJdbcConnectionException: Failed to obtain JDBC Connection; nested exception is com.alibaba.druid.pool.GetConnectionTimeoutException: wait millis 60101, active 20, maxActive 20, creating 0, runningSqlCount 2 : SELECT COUNT(0)
FROM (
	SELECT di.id, di.device_sn, di.bind_container, di.asset_type, di.asset_id
		, di.oem, di.tamb, di.tamb_q, di.tusda4, di.tusda4_q
		, di.pctco2, di.pctco2_q, di.pctco2_set, di.pctco2_set_q, di.di.psuc
		, di.psuc_q, di.tdis, di.tdis_q, di.freq_comp, di.tsuc
		, di.tsuc_q, di.mcond, di.pcond, di.pcond_q, di.tcond
		, di.tcond_q, di.mctrl, di.snctrl, di.amp_pha, di.amp_phb
		, di.amp_phc, di.pdis, di.pdis_q, di.pct_econ_vlv, di.pct_econ_vlv_q
		, di.pct_exp_vlv, di.pct_exp_vlv_q, di.tevap, di.tevap_q, di.mctrl3
		, di.pct_htr, di.pct_htr_q, di.mevap_fan_hs, di.pct_gas_vlv, di.pct_gas_vlv_q
		, di.pct_hum, di.pct_hum_q, di.pct_hum_set, di.pct_hum_set_q, di.freq_line
		, di.freq_line_q, di.vline1, di.vline2, di.vline3, di.mevap_fan_ls
		, di.pct_o2, di.pct_o2_q, di.pct_o2_set, di.pct_o2_set_q, di.mctrl2
		, di.trtn1, di.trtn1_q, di.trtn2, di.trtn2_q, di.tset
		, di.tset_q, di.ver_sw_major, di.ver_sw_minor, di.pct_suc_vlv, di.pct_suc_vlv_q
		, di.tsup1, di.tsup1_q, di.tsup2, di.tsup2_q, di.amp_total_draw
		, di.amp_total_draw_q, di.tusda1, di.tusda1_q, di.tusda2, di.tusda2_q
		, di.tusda3, di.tusda3_q, di.cmh_vent, di.cmh_vent_q, di.bk_num
		, di.tbk, di.tbk_q, di.ptidtm, di.pti_result, di.create_time
		, di.event_infos, di.preview_direction, di.pitch_no_row, di.pitch_no_column, di.child_column
	FROM (
		SELECT rd.id, rd.device_sn, rd.bind_container, rd.asset_type, rd.asset_id
			, rd.oem, rd.tamb, rd.tamb_q, rd.tusda4, rd.tusda4_q
			, rd.pctco2, rd.pctco2_q, rd.pctco2_set, rd.pctco2_set_q, rd.psuc
			, rd.psuc_q, rd.tdis, rd.tdis_q, rd.freq_comp, rd.tsuc
			, rd.tsuc_q, rd.mcond, rd.pcond, rd.pcond_q', '2020-08-10 11:44:41');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (566, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', 'null', 1, 'nested exception is org.apache.ibatis.exceptions.PersistenceException: 
### Error querying database.  Cause: org.springframework.jdbc.CannotGetJdbcConnectionException: Failed to obtain JDBC Connection; nested exception is com.alibaba.druid.pool.GetConnectionTimeoutException: wait millis 60089, active 20, maxActive 20, creating 0, runningSqlCount 2 : SELECT COUNT(0)
FROM (
	SELECT di.id, di.device_sn, di.bind_container, di.asset_type, di.asset_id
		, di.oem, di.tamb, di.tamb_q, di.tusda4, di.tusda4_q
		, di.pctco2, di.pctco2_q, di.pctco2_set, di.pctco2_set_q, di.di.psuc
		, di.psuc_q, di.tdis, di.tdis_q, di.freq_comp, di.tsuc
		, di.tsuc_q, di.mcond, di.pcond, di.pcond_q, di.tcond
		, di.tcond_q, di.mctrl, di.snctrl, di.amp_pha, di.amp_phb
		, di.amp_phc, di.pdis, di.pdis_q, di.pct_econ_vlv, di.pct_econ_vlv_q
		, di.pct_exp_vlv, di.pct_exp_vlv_q, di.tevap, di.tevap_q, di.mctrl3
		, di.pct_htr, di.pct_htr_q, di.mevap_fan_hs, di.pct_gas_vlv, di.pct_gas_vlv_q
		, di.pct_hum, di.pct_hum_q, di.pct_hum_set, di.pct_hum_set_q, di.freq_line
		, di.freq_line_q, di.vline1, di.vline2, di.vline3, di.mevap_fan_ls
		, di.pct_o2, di.pct_o2_q, di.pct_o2_set, di.pct_o2_set_q, di.mctrl2
		, di.trtn1, di.trtn1_q, di.trtn2, di.trtn2_q, di.tset
		, di.tset_q, di.ver_sw_major, di.ver_sw_minor, di.pct_suc_vlv, di.pct_suc_vlv_q
		, di.tsup1, di.tsup1_q, di.tsup2, di.tsup2_q, di.amp_total_draw
		, di.amp_total_draw_q, di.tusda1, di.tusda1_q, di.tusda2, di.tusda2_q
		, di.tusda3, di.tusda3_q, di.cmh_vent, di.cmh_vent_q, di.bk_num
		, di.tbk, di.tbk_q, di.ptidtm, di.pti_result, di.create_time
		, di.event_infos, di.preview_direction, di.pitch_no_row, di.pitch_no_column, di.child_column
	FROM (
		SELECT rd.id, rd.device_sn, rd.bind_container, rd.asset_type, rd.asset_id
			, rd.oem, rd.tamb, rd.tamb_q, rd.tusda4, rd.tusda4_q
			, rd.pctco2, rd.pctco2_q, rd.pctco2_set, rd.pctco2_set_q, rd.psuc
			, rd.psuc_q, rd.tdis, rd.tdis_q, rd.freq_comp, rd.tsuc
			, rd.tsuc_q, rd.mcond, rd.pcond, rd.pcond_q', '2020-08-10 11:44:42');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (567, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', 'null', 1, 'nested exception is org.apache.ibatis.exceptions.PersistenceException: 
### Error querying database.  Cause: org.springframework.jdbc.CannotGetJdbcConnectionException: Failed to obtain JDBC Connection; nested exception is com.alibaba.druid.pool.GetConnectionTimeoutException: wait millis 60091, active 20, maxActive 20, creating 0, runningSqlCount 2 : SELECT COUNT(0)
FROM (
	SELECT di.id, di.device_sn, di.bind_container, di.asset_type, di.asset_id
		, di.oem, di.tamb, di.tamb_q, di.tusda4, di.tusda4_q
		, di.pctco2, di.pctco2_q, di.pctco2_set, di.pctco2_set_q, di.di.psuc
		, di.psuc_q, di.tdis, di.tdis_q, di.freq_comp, di.tsuc
		, di.tsuc_q, di.mcond, di.pcond, di.pcond_q, di.tcond
		, di.tcond_q, di.mctrl, di.snctrl, di.amp_pha, di.amp_phb
		, di.amp_phc, di.pdis, di.pdis_q, di.pct_econ_vlv, di.pct_econ_vlv_q
		, di.pct_exp_vlv, di.pct_exp_vlv_q, di.tevap, di.tevap_q, di.mctrl3
		, di.pct_htr, di.pct_htr_q, di.mevap_fan_hs, di.pct_gas_vlv, di.pct_gas_vlv_q
		, di.pct_hum, di.pct_hum_q, di.pct_hum_set, di.pct_hum_set_q, di.freq_line
		, di.freq_line_q, di.vline1, di.vline2, di.vline3, di.mevap_fan_ls
		, di.pct_o2, di.pct_o2_q, di.pct_o2_set, di.pct_o2_set_q, di.mctrl2
		, di.trtn1, di.trtn1_q, di.trtn2, di.trtn2_q, di.tset
		, di.tset_q, di.ver_sw_major, di.ver_sw_minor, di.pct_suc_vlv, di.pct_suc_vlv_q
		, di.tsup1, di.tsup1_q, di.tsup2, di.tsup2_q, di.amp_total_draw
		, di.amp_total_draw_q, di.tusda1, di.tusda1_q, di.tusda2, di.tusda2_q
		, di.tusda3, di.tusda3_q, di.cmh_vent, di.cmh_vent_q, di.bk_num
		, di.tbk, di.tbk_q, di.ptidtm, di.pti_result, di.create_time
		, di.event_infos, di.preview_direction, di.pitch_no_row, di.pitch_no_column, di.child_column
	FROM (
		SELECT rd.id, rd.device_sn, rd.bind_container, rd.asset_type, rd.asset_id
			, rd.oem, rd.tamb, rd.tamb_q, rd.tusda4, rd.tusda4_q
			, rd.pctco2, rd.pctco2_q, rd.pctco2_set, rd.pctco2_set_q, rd.psuc
			, rd.psuc_q, rd.tdis, rd.tdis_q, rd.freq_comp, rd.tsuc
			, rd.tsuc_q, rd.mcond, rd.pcond, rd.pcond_q', '2020-08-10 11:44:42');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (568, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', 'null', 1, 'nested exception is org.apache.ibatis.exceptions.PersistenceException: 
### Error querying database.  Cause: org.springframework.jdbc.CannotGetJdbcConnectionException: Failed to obtain JDBC Connection; nested exception is com.alibaba.druid.pool.GetConnectionTimeoutException: wait millis 60074, active 20, maxActive 20, creating 0, runningSqlCount 2 : SELECT COUNT(0)
FROM (
	SELECT di.id, di.device_sn, di.bind_container, di.asset_type, di.asset_id
		, di.oem, di.tamb, di.tamb_q, di.tusda4, di.tusda4_q
		, di.pctco2, di.pctco2_q, di.pctco2_set, di.pctco2_set_q, di.di.psuc
		, di.psuc_q, di.tdis, di.tdis_q, di.freq_comp, di.tsuc
		, di.tsuc_q, di.mcond, di.pcond, di.pcond_q, di.tcond
		, di.tcond_q, di.mctrl, di.snctrl, di.amp_pha, di.amp_phb
		, di.amp_phc, di.pdis, di.pdis_q, di.pct_econ_vlv, di.pct_econ_vlv_q
		, di.pct_exp_vlv, di.pct_exp_vlv_q, di.tevap, di.tevap_q, di.mctrl3
		, di.pct_htr, di.pct_htr_q, di.mevap_fan_hs, di.pct_gas_vlv, di.pct_gas_vlv_q
		, di.pct_hum, di.pct_hum_q, di.pct_hum_set, di.pct_hum_set_q, di.freq_line
		, di.freq_line_q, di.vline1, di.vline2, di.vline3, di.mevap_fan_ls
		, di.pct_o2, di.pct_o2_q, di.pct_o2_set, di.pct_o2_set_q, di.mctrl2
		, di.trtn1, di.trtn1_q, di.trtn2, di.trtn2_q, di.tset
		, di.tset_q, di.ver_sw_major, di.ver_sw_minor, di.pct_suc_vlv, di.pct_suc_vlv_q
		, di.tsup1, di.tsup1_q, di.tsup2, di.tsup2_q, di.amp_total_draw
		, di.amp_total_draw_q, di.tusda1, di.tusda1_q, di.tusda2, di.tusda2_q
		, di.tusda3, di.tusda3_q, di.cmh_vent, di.cmh_vent_q, di.bk_num
		, di.tbk, di.tbk_q, di.ptidtm, di.pti_result, di.create_time
		, di.event_infos, di.preview_direction, di.pitch_no_row, di.pitch_no_column, di.child_column
	FROM (
		SELECT rd.id, rd.device_sn, rd.bind_container, rd.asset_type, rd.asset_id
			, rd.oem, rd.tamb, rd.tamb_q, rd.tusda4, rd.tusda4_q
			, rd.pctco2, rd.pctco2_q, rd.pctco2_set, rd.pctco2_set_q, rd.psuc
			, rd.psuc_q, rd.tdis, rd.tdis_q, rd.freq_comp, rd.tsuc
			, rd.tsuc_q, rd.mcond, rd.pcond, rd.pcond_q', '2020-08-10 11:44:44');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (569, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', 'null', 1, 'nested exception is org.apache.ibatis.exceptions.PersistenceException: 
### Error querying database.  Cause: org.springframework.jdbc.CannotGetJdbcConnectionException: Failed to obtain JDBC Connection; nested exception is com.alibaba.druid.pool.GetConnectionTimeoutException: wait millis 60093, active 20, maxActive 20, creating 0, runningSqlCount 2 : SELECT COUNT(0)
FROM (
	SELECT di.id, di.device_sn, di.bind_container, di.asset_type, di.asset_id
		, di.oem, di.tamb, di.tamb_q, di.tusda4, di.tusda4_q
		, di.pctco2, di.pctco2_q, di.pctco2_set, di.pctco2_set_q, di.di.psuc
		, di.psuc_q, di.tdis, di.tdis_q, di.freq_comp, di.tsuc
		, di.tsuc_q, di.mcond, di.pcond, di.pcond_q, di.tcond
		, di.tcond_q, di.mctrl, di.snctrl, di.amp_pha, di.amp_phb
		, di.amp_phc, di.pdis, di.pdis_q, di.pct_econ_vlv, di.pct_econ_vlv_q
		, di.pct_exp_vlv, di.pct_exp_vlv_q, di.tevap, di.tevap_q, di.mctrl3
		, di.pct_htr, di.pct_htr_q, di.mevap_fan_hs, di.pct_gas_vlv, di.pct_gas_vlv_q
		, di.pct_hum, di.pct_hum_q, di.pct_hum_set, di.pct_hum_set_q, di.freq_line
		, di.freq_line_q, di.vline1, di.vline2, di.vline3, di.mevap_fan_ls
		, di.pct_o2, di.pct_o2_q, di.pct_o2_set, di.pct_o2_set_q, di.mctrl2
		, di.trtn1, di.trtn1_q, di.trtn2, di.trtn2_q, di.tset
		, di.tset_q, di.ver_sw_major, di.ver_sw_minor, di.pct_suc_vlv, di.pct_suc_vlv_q
		, di.tsup1, di.tsup1_q, di.tsup2, di.tsup2_q, di.amp_total_draw
		, di.amp_total_draw_q, di.tusda1, di.tusda1_q, di.tusda2, di.tusda2_q
		, di.tusda3, di.tusda3_q, di.cmh_vent, di.cmh_vent_q, di.bk_num
		, di.tbk, di.tbk_q, di.ptidtm, di.pti_result, di.create_time
		, di.event_infos, di.preview_direction, di.pitch_no_row, di.pitch_no_column, di.child_column
	FROM (
		SELECT rd.id, rd.device_sn, rd.bind_container, rd.asset_type, rd.asset_id
			, rd.oem, rd.tamb, rd.tamb_q, rd.tusda4, rd.tusda4_q
			, rd.pctco2, rd.pctco2_q, rd.pctco2_set, rd.pctco2_set_q, rd.psuc
			, rd.psuc_q, rd.tdis, rd.tdis_q, rd.freq_comp, rd.tsuc
			, rd.tsuc_q, rd.mcond, rd.pcond, rd.pcond_q', '2020-08-10 11:44:45');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (570, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', 'null', 1, 'nested exception is org.apache.ibatis.exceptions.PersistenceException: 
### Error querying database.  Cause: org.springframework.jdbc.CannotGetJdbcConnectionException: Failed to obtain JDBC Connection; nested exception is com.alibaba.druid.pool.GetConnectionTimeoutException: wait millis 60088, active 20, maxActive 20, creating 0, runningSqlCount 2 : SELECT di.id, di.device_sn, di.bind_container, di.asset_type, di.asset_id
	, di.oem, di.tamb, di.tamb_q, di.tusda4, di.tusda4_q
	, di.pctco2, di.pctco2_q, di.pctco2_set, di.pctco2_set_q, di.di.psuc
	, di.psuc_q, di.tdis, di.tdis_q, di.freq_comp, di.tsuc
	, di.tsuc_q, di.mcond, di.pcond, di.pcond_q, di.tcond
	, di.tcond_q, di.mctrl, di.snctrl, di.amp_pha, di.amp_phb
	, di.amp_phc, di.pdis, di.pdis_q, di.pct_econ_vlv, di.pct_econ_vlv_q
	, di.pct_exp_vlv, di.pct_exp_vlv_q, di.tevap, di.tevap_q, di.mctrl3
	, di.pct_htr, di.pct_htr_q, di.mevap_fan_hs, di.pct_gas_vlv, di.pct_gas_vlv_q
	, di.pct_hum, di.pct_hum_q, di.pct_hum_set, di.pct_hum_set_q, di.freq_line
	, di.freq_line_q, di.vline1, di.vline2, di.vline3, di.mevap_fan_ls
	, di.pct_o2, di.pct_o2_q, di.pct_o2_set, di.pct_o2_set_q, di.mctrl2
	, di.trtn1, di.trtn1_q, di.trtn2, di.trtn2_q, di.tset
	, di.tset_q, di.ver_sw_major, di.ver_sw_minor, di.pct_suc_vlv, di.pct_suc_vlv_q
	, di.tsup1, di.tsup1_q, di.tsup2, di.tsup2_q, di.amp_total_draw
	, di.amp_total_draw_q, di.tusda1, di.tusda1_q, di.tusda2, di.tusda2_q
	, di.tusda3, di.tusda3_q, di.cmh_vent, di.cmh_vent_q, di.bk_num
	, di.tbk, di.tbk_q, di.ptidtm, di.pti_result, di.create_time
	, di.event_infos, di.preview_direction, di.pitch_no_row, di.pitch_no_column, di.child_column
FROM (
	SELECT rd.id, rd.device_sn, rd.bind_container, rd.asset_type, rd.asset_id
		, rd.oem, rd.tamb, rd.tamb_q, rd.tusda4, rd.tusda4_q
		, rd.pctco2, rd.pctco2_q, rd.pctco2_set, rd.pctco2_set_q, rd.psuc
		, rd.psuc_q, rd.tdis, rd.tdis_q, rd.freq_comp, rd.tsuc
		, rd.tsuc_q, rd.mcond, rd.pcond, rd.pcond_q, rd.tcond
		, rd.tcond_q, rd.mctrl, rd.snctrl, ', '2020-08-10 11:45:22');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (571, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', 'null', 1, 'nested exception is org.apache.ibatis.exceptions.PersistenceException: 
### Error querying database.  Cause: org.springframework.jdbc.CannotGetJdbcConnectionException: Failed to obtain JDBC Connection; nested exception is com.alibaba.druid.pool.GetConnectionTimeoutException: wait millis 60092, active 20, maxActive 20, creating 0, runningSqlCount 2 : SELECT di.id, di.device_sn, di.bind_container, di.asset_type, di.asset_id
	, di.oem, di.tamb, di.tamb_q, di.tusda4, di.tusda4_q
	, di.pctco2, di.pctco2_q, di.pctco2_set, di.pctco2_set_q, di.di.psuc
	, di.psuc_q, di.tdis, di.tdis_q, di.freq_comp, di.tsuc
	, di.tsuc_q, di.mcond, di.pcond, di.pcond_q, di.tcond
	, di.tcond_q, di.mctrl, di.snctrl, di.amp_pha, di.amp_phb
	, di.amp_phc, di.pdis, di.pdis_q, di.pct_econ_vlv, di.pct_econ_vlv_q
	, di.pct_exp_vlv, di.pct_exp_vlv_q, di.tevap, di.tevap_q, di.mctrl3
	, di.pct_htr, di.pct_htr_q, di.mevap_fan_hs, di.pct_gas_vlv, di.pct_gas_vlv_q
	, di.pct_hum, di.pct_hum_q, di.pct_hum_set, di.pct_hum_set_q, di.freq_line
	, di.freq_line_q, di.vline1, di.vline2, di.vline3, di.mevap_fan_ls
	, di.pct_o2, di.pct_o2_q, di.pct_o2_set, di.pct_o2_set_q, di.mctrl2
	, di.trtn1, di.trtn1_q, di.trtn2, di.trtn2_q, di.tset
	, di.tset_q, di.ver_sw_major, di.ver_sw_minor, di.pct_suc_vlv, di.pct_suc_vlv_q
	, di.tsup1, di.tsup1_q, di.tsup2, di.tsup2_q, di.amp_total_draw
	, di.amp_total_draw_q, di.tusda1, di.tusda1_q, di.tusda2, di.tusda2_q
	, di.tusda3, di.tusda3_q, di.cmh_vent, di.cmh_vent_q, di.bk_num
	, di.tbk, di.tbk_q, di.ptidtm, di.pti_result, di.create_time
	, di.event_infos, di.preview_direction, di.pitch_no_row, di.pitch_no_column, di.child_column
FROM (
	SELECT rd.id, rd.device_sn, rd.bind_container, rd.asset_type, rd.asset_id
		, rd.oem, rd.tamb, rd.tamb_q, rd.tusda4, rd.tusda4_q
		, rd.pctco2, rd.pctco2_q, rd.pctco2_set, rd.pctco2_set_q, rd.psuc
		, rd.psuc_q, rd.tdis, rd.tdis_q, rd.freq_comp, rd.tsuc
		, rd.tsuc_q, rd.mcond, rd.pcond, rd.pcond_q, rd.tcond
		, rd.tcond_q, rd.mctrl, rd.snctrl, ', '2020-08-10 11:45:22');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (572, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', 'null', 1, 'nested exception is org.apache.ibatis.exceptions.PersistenceException: 
### Error querying database.  Cause: org.springframework.jdbc.CannotGetJdbcConnectionException: Failed to obtain JDBC Connection; nested exception is com.alibaba.druid.pool.GetConnectionTimeoutException: wait millis 60111, active 20, maxActive 20, creating 0, runningSqlCount 2 : SELECT di.id, di.device_sn, di.bind_container, di.asset_type, di.asset_id
	, di.oem, di.tamb, di.tamb_q, di.tusda4, di.tusda4_q
	, di.pctco2, di.pctco2_q, di.pctco2_set, di.pctco2_set_q, di.di.psuc
	, di.psuc_q, di.tdis, di.tdis_q, di.freq_comp, di.tsuc
	, di.tsuc_q, di.mcond, di.pcond, di.pcond_q, di.tcond
	, di.tcond_q, di.mctrl, di.snctrl, di.amp_pha, di.amp_phb
	, di.amp_phc, di.pdis, di.pdis_q, di.pct_econ_vlv, di.pct_econ_vlv_q
	, di.pct_exp_vlv, di.pct_exp_vlv_q, di.tevap, di.tevap_q, di.mctrl3
	, di.pct_htr, di.pct_htr_q, di.mevap_fan_hs, di.pct_gas_vlv, di.pct_gas_vlv_q
	, di.pct_hum, di.pct_hum_q, di.pct_hum_set, di.pct_hum_set_q, di.freq_line
	, di.freq_line_q, di.vline1, di.vline2, di.vline3, di.mevap_fan_ls
	, di.pct_o2, di.pct_o2_q, di.pct_o2_set, di.pct_o2_set_q, di.mctrl2
	, di.trtn1, di.trtn1_q, di.trtn2, di.trtn2_q, di.tset
	, di.tset_q, di.ver_sw_major, di.ver_sw_minor, di.pct_suc_vlv, di.pct_suc_vlv_q
	, di.tsup1, di.tsup1_q, di.tsup2, di.tsup2_q, di.amp_total_draw
	, di.amp_total_draw_q, di.tusda1, di.tusda1_q, di.tusda2, di.tusda2_q
	, di.tusda3, di.tusda3_q, di.cmh_vent, di.cmh_vent_q, di.bk_num
	, di.tbk, di.tbk_q, di.ptidtm, di.pti_result, di.create_time
	, di.event_infos, di.preview_direction, di.pitch_no_row, di.pitch_no_column, di.child_column
FROM (
	SELECT rd.id, rd.device_sn, rd.bind_container, rd.asset_type, rd.asset_id
		, rd.oem, rd.tamb, rd.tamb_q, rd.tusda4, rd.tusda4_q
		, rd.pctco2, rd.pctco2_q, rd.pctco2_set, rd.pctco2_set_q, rd.psuc
		, rd.psuc_q, rd.tdis, rd.tdis_q, rd.freq_comp, rd.tsuc
		, rd.tsuc_q, rd.mcond, rd.pcond, rd.pcond_q, rd.tcond
		, rd.tcond_q, rd.mctrl, rd.snctrl, ', '2020-08-10 11:45:24');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (573, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', 'null', 1, 'nested exception is org.apache.ibatis.exceptions.PersistenceException: 
### Error querying database.  Cause: org.springframework.jdbc.CannotGetJdbcConnectionException: Failed to obtain JDBC Connection; nested exception is com.alibaba.druid.pool.GetConnectionTimeoutException: wait millis 60099, active 20, maxActive 20, creating 0, runningSqlCount 2 : SELECT di.id, di.device_sn, di.bind_container, di.asset_type, di.asset_id
	, di.oem, di.tamb, di.tamb_q, di.tusda4, di.tusda4_q
	, di.pctco2, di.pctco2_q, di.pctco2_set, di.pctco2_set_q, di.di.psuc
	, di.psuc_q, di.tdis, di.tdis_q, di.freq_comp, di.tsuc
	, di.tsuc_q, di.mcond, di.pcond, di.pcond_q, di.tcond
	, di.tcond_q, di.mctrl, di.snctrl, di.amp_pha, di.amp_phb
	, di.amp_phc, di.pdis, di.pdis_q, di.pct_econ_vlv, di.pct_econ_vlv_q
	, di.pct_exp_vlv, di.pct_exp_vlv_q, di.tevap, di.tevap_q, di.mctrl3
	, di.pct_htr, di.pct_htr_q, di.mevap_fan_hs, di.pct_gas_vlv, di.pct_gas_vlv_q
	, di.pct_hum, di.pct_hum_q, di.pct_hum_set, di.pct_hum_set_q, di.freq_line
	, di.freq_line_q, di.vline1, di.vline2, di.vline3, di.mevap_fan_ls
	, di.pct_o2, di.pct_o2_q, di.pct_o2_set, di.pct_o2_set_q, di.mctrl2
	, di.trtn1, di.trtn1_q, di.trtn2, di.trtn2_q, di.tset
	, di.tset_q, di.ver_sw_major, di.ver_sw_minor, di.pct_suc_vlv, di.pct_suc_vlv_q
	, di.tsup1, di.tsup1_q, di.tsup2, di.tsup2_q, di.amp_total_draw
	, di.amp_total_draw_q, di.tusda1, di.tusda1_q, di.tusda2, di.tusda2_q
	, di.tusda3, di.tusda3_q, di.cmh_vent, di.cmh_vent_q, di.bk_num
	, di.tbk, di.tbk_q, di.ptidtm, di.pti_result, di.create_time
	, di.event_infos, di.preview_direction, di.pitch_no_row, di.pitch_no_column, di.child_column
FROM (
	SELECT rd.id, rd.device_sn, rd.bind_container, rd.asset_type, rd.asset_id
		, rd.oem, rd.tamb, rd.tamb_q, rd.tusda4, rd.tusda4_q
		, rd.pctco2, rd.pctco2_q, rd.pctco2_set, rd.pctco2_set_q, rd.psuc
		, rd.psuc_q, rd.tdis, rd.tdis_q, rd.freq_comp, rd.tsuc
		, rd.tsuc_q, rd.mcond, rd.pcond, rd.pcond_q, rd.tcond
		, rd.tcond_q, rd.mctrl, rd.snctrl, ', '2020-08-10 11:45:25');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (574, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', 'null', 1, 'nested exception is org.apache.ibatis.exceptions.PersistenceException: 
### Error querying database.  Cause: org.springframework.jdbc.CannotGetJdbcConnectionException: Failed to obtain JDBC Connection; nested exception is com.alibaba.druid.pool.GetConnectionTimeoutException: wait millis 60073, active 20, maxActive 20, creating 0, runningSqlCount 2 : SELECT di.id, di.device_sn, di.bind_container, di.asset_type, di.asset_id
	, di.oem, di.tamb, di.tamb_q, di.tusda4, di.tusda4_q
	, di.pctco2, di.pctco2_q, di.pctco2_set, di.pctco2_set_q, di.di.psuc
	, di.psuc_q, di.tdis, di.tdis_q, di.freq_comp, di.tsuc
	, di.tsuc_q, di.mcond, di.pcond, di.pcond_q, di.tcond
	, di.tcond_q, di.mctrl, di.snctrl, di.amp_pha, di.amp_phb
	, di.amp_phc, di.pdis, di.pdis_q, di.pct_econ_vlv, di.pct_econ_vlv_q
	, di.pct_exp_vlv, di.pct_exp_vlv_q, di.tevap, di.tevap_q, di.mctrl3
	, di.pct_htr, di.pct_htr_q, di.mevap_fan_hs, di.pct_gas_vlv, di.pct_gas_vlv_q
	, di.pct_hum, di.pct_hum_q, di.pct_hum_set, di.pct_hum_set_q, di.freq_line
	, di.freq_line_q, di.vline1, di.vline2, di.vline3, di.mevap_fan_ls
	, di.pct_o2, di.pct_o2_q, di.pct_o2_set, di.pct_o2_set_q, di.mctrl2
	, di.trtn1, di.trtn1_q, di.trtn2, di.trtn2_q, di.tset
	, di.tset_q, di.ver_sw_major, di.ver_sw_minor, di.pct_suc_vlv, di.pct_suc_vlv_q
	, di.tsup1, di.tsup1_q, di.tsup2, di.tsup2_q, di.amp_total_draw
	, di.amp_total_draw_q, di.tusda1, di.tusda1_q, di.tusda2, di.tusda2_q
	, di.tusda3, di.tusda3_q, di.cmh_vent, di.cmh_vent_q, di.bk_num
	, di.tbk, di.tbk_q, di.ptidtm, di.pti_result, di.create_time
	, di.event_infos, di.preview_direction, di.pitch_no_row, di.pitch_no_column, di.child_column
FROM (
	SELECT rd.id, rd.device_sn, rd.bind_container, rd.asset_type, rd.asset_id
		, rd.oem, rd.tamb, rd.tamb_q, rd.tusda4, rd.tusda4_q
		, rd.pctco2, rd.pctco2_q, rd.pctco2_set, rd.pctco2_set_q, rd.psuc
		, rd.psuc_q, rd.tdis, rd.tdis_q, rd.freq_comp, rd.tsuc
		, rd.tsuc_q, rd.mcond, rd.pcond, rd.pcond_q, rd.tcond
		, rd.tcond_q, rd.mctrl, rd.snctrl, ', '2020-08-10 11:45:25');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (575, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', 'null', 1, 'nested exception is org.apache.ibatis.exceptions.PersistenceException: 
### Error querying database.  Cause: org.springframework.jdbc.CannotGetJdbcConnectionException: Failed to obtain JDBC Connection; nested exception is com.alibaba.druid.pool.GetConnectionTimeoutException: wait millis 60113, active 20, maxActive 20, creating 0, runningSqlCount 2 : SELECT di.id, di.device_sn, di.bind_container, di.asset_type, di.asset_id
	, di.oem, di.tamb, di.tamb_q, di.tusda4, di.tusda4_q
	, di.pctco2, di.pctco2_q, di.pctco2_set, di.pctco2_set_q, di.di.psuc
	, di.psuc_q, di.tdis, di.tdis_q, di.freq_comp, di.tsuc
	, di.tsuc_q, di.mcond, di.pcond, di.pcond_q, di.tcond
	, di.tcond_q, di.mctrl, di.snctrl, di.amp_pha, di.amp_phb
	, di.amp_phc, di.pdis, di.pdis_q, di.pct_econ_vlv, di.pct_econ_vlv_q
	, di.pct_exp_vlv, di.pct_exp_vlv_q, di.tevap, di.tevap_q, di.mctrl3
	, di.pct_htr, di.pct_htr_q, di.mevap_fan_hs, di.pct_gas_vlv, di.pct_gas_vlv_q
	, di.pct_hum, di.pct_hum_q, di.pct_hum_set, di.pct_hum_set_q, di.freq_line
	, di.freq_line_q, di.vline1, di.vline2, di.vline3, di.mevap_fan_ls
	, di.pct_o2, di.pct_o2_q, di.pct_o2_set, di.pct_o2_set_q, di.mctrl2
	, di.trtn1, di.trtn1_q, di.trtn2, di.trtn2_q, di.tset
	, di.tset_q, di.ver_sw_major, di.ver_sw_minor, di.pct_suc_vlv, di.pct_suc_vlv_q
	, di.tsup1, di.tsup1_q, di.tsup2, di.tsup2_q, di.amp_total_draw
	, di.amp_total_draw_q, di.tusda1, di.tusda1_q, di.tusda2, di.tusda2_q
	, di.tusda3, di.tusda3_q, di.cmh_vent, di.cmh_vent_q, di.bk_num
	, di.tbk, di.tbk_q, di.ptidtm, di.pti_result, di.create_time
	, di.event_infos, di.preview_direction, di.pitch_no_row, di.pitch_no_column, di.child_column
FROM (
	SELECT rd.id, rd.device_sn, rd.bind_container, rd.asset_type, rd.asset_id
		, rd.oem, rd.tamb, rd.tamb_q, rd.tusda4, rd.tusda4_q
		, rd.pctco2, rd.pctco2_q, rd.pctco2_set, rd.pctco2_set_q, rd.psuc
		, rd.psuc_q, rd.tdis, rd.tdis_q, rd.freq_comp, rd.tsuc
		, rd.tsuc_q, rd.mcond, rd.pcond, rd.pcond_q, rd.tcond
		, rd.tcond_q, rd.mctrl, rd.snctrl, ', '2020-08-10 11:45:26');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (576, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', 'null', 1, 'nested exception is org.apache.ibatis.exceptions.PersistenceException: 
### Error querying database.  Cause: org.springframework.jdbc.CannotGetJdbcConnectionException: Failed to obtain JDBC Connection; nested exception is com.alibaba.druid.pool.GetConnectionTimeoutException: wait millis 60093, active 20, maxActive 20, creating 0, runningSqlCount 2 : SELECT di.id, di.device_sn, di.bind_container, di.asset_type, di.asset_id
	, di.oem, di.tamb, di.tamb_q, di.tusda4, di.tusda4_q
	, di.pctco2, di.pctco2_q, di.pctco2_set, di.pctco2_set_q, di.di.psuc
	, di.psuc_q, di.tdis, di.tdis_q, di.freq_comp, di.tsuc
	, di.tsuc_q, di.mcond, di.pcond, di.pcond_q, di.tcond
	, di.tcond_q, di.mctrl, di.snctrl, di.amp_pha, di.amp_phb
	, di.amp_phc, di.pdis, di.pdis_q, di.pct_econ_vlv, di.pct_econ_vlv_q
	, di.pct_exp_vlv, di.pct_exp_vlv_q, di.tevap, di.tevap_q, di.mctrl3
	, di.pct_htr, di.pct_htr_q, di.mevap_fan_hs, di.pct_gas_vlv, di.pct_gas_vlv_q
	, di.pct_hum, di.pct_hum_q, di.pct_hum_set, di.pct_hum_set_q, di.freq_line
	, di.freq_line_q, di.vline1, di.vline2, di.vline3, di.mevap_fan_ls
	, di.pct_o2, di.pct_o2_q, di.pct_o2_set, di.pct_o2_set_q, di.mctrl2
	, di.trtn1, di.trtn1_q, di.trtn2, di.trtn2_q, di.tset
	, di.tset_q, di.ver_sw_major, di.ver_sw_minor, di.pct_suc_vlv, di.pct_suc_vlv_q
	, di.tsup1, di.tsup1_q, di.tsup2, di.tsup2_q, di.amp_total_draw
	, di.amp_total_draw_q, di.tusda1, di.tusda1_q, di.tusda2, di.tusda2_q
	, di.tusda3, di.tusda3_q, di.cmh_vent, di.cmh_vent_q, di.bk_num
	, di.tbk, di.tbk_q, di.ptidtm, di.pti_result, di.create_time
	, di.event_infos, di.preview_direction, di.pitch_no_row, di.pitch_no_column, di.child_column
FROM (
	SELECT rd.id, rd.device_sn, rd.bind_container, rd.asset_type, rd.asset_id
		, rd.oem, rd.tamb, rd.tamb_q, rd.tusda4, rd.tusda4_q
		, rd.pctco2, rd.pctco2_q, rd.pctco2_set, rd.pctco2_set_q, rd.psuc
		, rd.psuc_q, rd.tdis, rd.tdis_q, rd.freq_comp, rd.tsuc
		, rd.tsuc_q, rd.mcond, rd.pcond, rd.pcond_q, rd.tcond
		, rd.tcond_q, rd.mctrl, rd.snctrl, ', '2020-08-10 11:45:27');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (577, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', 'null', 1, 'nested exception is org.apache.ibatis.exceptions.PersistenceException: 
### Error querying database.  Cause: org.springframework.jdbc.CannotGetJdbcConnectionException: Failed to obtain JDBC Connection; nested exception is com.alibaba.druid.pool.GetConnectionTimeoutException: wait millis 60083, active 20, maxActive 20, creating 0, runningSqlCount 2 : SELECT di.id, di.device_sn, di.bind_container, di.asset_type, di.asset_id
	, di.oem, di.tamb, di.tamb_q, di.tusda4, di.tusda4_q
	, di.pctco2, di.pctco2_q, di.pctco2_set, di.pctco2_set_q, di.di.psuc
	, di.psuc_q, di.tdis, di.tdis_q, di.freq_comp, di.tsuc
	, di.tsuc_q, di.mcond, di.pcond, di.pcond_q, di.tcond
	, di.tcond_q, di.mctrl, di.snctrl, di.amp_pha, di.amp_phb
	, di.amp_phc, di.pdis, di.pdis_q, di.pct_econ_vlv, di.pct_econ_vlv_q
	, di.pct_exp_vlv, di.pct_exp_vlv_q, di.tevap, di.tevap_q, di.mctrl3
	, di.pct_htr, di.pct_htr_q, di.mevap_fan_hs, di.pct_gas_vlv, di.pct_gas_vlv_q
	, di.pct_hum, di.pct_hum_q, di.pct_hum_set, di.pct_hum_set_q, di.freq_line
	, di.freq_line_q, di.vline1, di.vline2, di.vline3, di.mevap_fan_ls
	, di.pct_o2, di.pct_o2_q, di.pct_o2_set, di.pct_o2_set_q, di.mctrl2
	, di.trtn1, di.trtn1_q, di.trtn2, di.trtn2_q, di.tset
	, di.tset_q, di.ver_sw_major, di.ver_sw_minor, di.pct_suc_vlv, di.pct_suc_vlv_q
	, di.tsup1, di.tsup1_q, di.tsup2, di.tsup2_q, di.amp_total_draw
	, di.amp_total_draw_q, di.tusda1, di.tusda1_q, di.tusda2, di.tusda2_q
	, di.tusda3, di.tusda3_q, di.cmh_vent, di.cmh_vent_q, di.bk_num
	, di.tbk, di.tbk_q, di.ptidtm, di.pti_result, di.create_time
	, di.event_infos, di.preview_direction, di.pitch_no_row, di.pitch_no_column, di.child_column
FROM (
	SELECT rd.id, rd.device_sn, rd.bind_container, rd.asset_type, rd.asset_id
		, rd.oem, rd.tamb, rd.tamb_q, rd.tusda4, rd.tusda4_q
		, rd.pctco2, rd.pctco2_q, rd.pctco2_set, rd.pctco2_set_q, rd.psuc
		, rd.psuc_q, rd.tdis, rd.tdis_q, rd.freq_comp, rd.tsuc
		, rd.tsuc_q, rd.mcond, rd.pcond, rd.pcond_q, rd.tcond
		, rd.tcond_q, rd.mctrl, rd.snctrl, ', '2020-08-10 11:45:28');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (578, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', 'null', 1, 'nested exception is org.apache.ibatis.exceptions.PersistenceException: 
### Error querying database.  Cause: org.springframework.jdbc.CannotGetJdbcConnectionException: Failed to obtain JDBC Connection; nested exception is com.alibaba.druid.pool.GetConnectionTimeoutException: wait millis 60085, active 20, maxActive 20, creating 0, runningSqlCount 2 : SELECT di.id, di.device_sn, di.bind_container, di.asset_type, di.asset_id
	, di.oem, di.tamb, di.tamb_q, di.tusda4, di.tusda4_q
	, di.pctco2, di.pctco2_q, di.pctco2_set, di.pctco2_set_q, di.di.psuc
	, di.psuc_q, di.tdis, di.tdis_q, di.freq_comp, di.tsuc
	, di.tsuc_q, di.mcond, di.pcond, di.pcond_q, di.tcond
	, di.tcond_q, di.mctrl, di.snctrl, di.amp_pha, di.amp_phb
	, di.amp_phc, di.pdis, di.pdis_q, di.pct_econ_vlv, di.pct_econ_vlv_q
	, di.pct_exp_vlv, di.pct_exp_vlv_q, di.tevap, di.tevap_q, di.mctrl3
	, di.pct_htr, di.pct_htr_q, di.mevap_fan_hs, di.pct_gas_vlv, di.pct_gas_vlv_q
	, di.pct_hum, di.pct_hum_q, di.pct_hum_set, di.pct_hum_set_q, di.freq_line
	, di.freq_line_q, di.vline1, di.vline2, di.vline3, di.mevap_fan_ls
	, di.pct_o2, di.pct_o2_q, di.pct_o2_set, di.pct_o2_set_q, di.mctrl2
	, di.trtn1, di.trtn1_q, di.trtn2, di.trtn2_q, di.tset
	, di.tset_q, di.ver_sw_major, di.ver_sw_minor, di.pct_suc_vlv, di.pct_suc_vlv_q
	, di.tsup1, di.tsup1_q, di.tsup2, di.tsup2_q, di.amp_total_draw
	, di.amp_total_draw_q, di.tusda1, di.tusda1_q, di.tusda2, di.tusda2_q
	, di.tusda3, di.tusda3_q, di.cmh_vent, di.cmh_vent_q, di.bk_num
	, di.tbk, di.tbk_q, di.ptidtm, di.pti_result, di.create_time
	, di.event_infos, di.preview_direction, di.pitch_no_row, di.pitch_no_column, di.child_column
FROM (
	SELECT rd.id, rd.device_sn, rd.bind_container, rd.asset_type, rd.asset_id
		, rd.oem, rd.tamb, rd.tamb_q, rd.tusda4, rd.tusda4_q
		, rd.pctco2, rd.pctco2_q, rd.pctco2_set, rd.pctco2_set_q, rd.psuc
		, rd.psuc_q, rd.tdis, rd.tdis_q, rd.freq_comp, rd.tsuc
		, rd.tsuc_q, rd.mcond, rd.pcond, rd.pcond_q, rd.tcond
		, rd.tcond_q, rd.mctrl, rd.snctrl, ', '2020-08-10 11:45:29');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (579, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', 'null', 1, 'nested exception is org.apache.ibatis.exceptions.PersistenceException: 
### Error querying database.  Cause: org.springframework.jdbc.CannotGetJdbcConnectionException: Failed to obtain JDBC Connection; nested exception is com.alibaba.druid.pool.GetConnectionTimeoutException: wait millis 60095, active 20, maxActive 20, creating 0, runningSqlCount 2 : SELECT di.id, di.device_sn, di.bind_container, di.asset_type, di.asset_id
	, di.oem, di.tamb, di.tamb_q, di.tusda4, di.tusda4_q
	, di.pctco2, di.pctco2_q, di.pctco2_set, di.pctco2_set_q, di.di.psuc
	, di.psuc_q, di.tdis, di.tdis_q, di.freq_comp, di.tsuc
	, di.tsuc_q, di.mcond, di.pcond, di.pcond_q, di.tcond
	, di.tcond_q, di.mctrl, di.snctrl, di.amp_pha, di.amp_phb
	, di.amp_phc, di.pdis, di.pdis_q, di.pct_econ_vlv, di.pct_econ_vlv_q
	, di.pct_exp_vlv, di.pct_exp_vlv_q, di.tevap, di.tevap_q, di.mctrl3
	, di.pct_htr, di.pct_htr_q, di.mevap_fan_hs, di.pct_gas_vlv, di.pct_gas_vlv_q
	, di.pct_hum, di.pct_hum_q, di.pct_hum_set, di.pct_hum_set_q, di.freq_line
	, di.freq_line_q, di.vline1, di.vline2, di.vline3, di.mevap_fan_ls
	, di.pct_o2, di.pct_o2_q, di.pct_o2_set, di.pct_o2_set_q, di.mctrl2
	, di.trtn1, di.trtn1_q, di.trtn2, di.trtn2_q, di.tset
	, di.tset_q, di.ver_sw_major, di.ver_sw_minor, di.pct_suc_vlv, di.pct_suc_vlv_q
	, di.tsup1, di.tsup1_q, di.tsup2, di.tsup2_q, di.amp_total_draw
	, di.amp_total_draw_q, di.tusda1, di.tusda1_q, di.tusda2, di.tusda2_q
	, di.tusda3, di.tusda3_q, di.cmh_vent, di.cmh_vent_q, di.bk_num
	, di.tbk, di.tbk_q, di.ptidtm, di.pti_result, di.create_time
	, di.event_infos, di.preview_direction, di.pitch_no_row, di.pitch_no_column, di.child_column
FROM (
	SELECT rd.id, rd.device_sn, rd.bind_container, rd.asset_type, rd.asset_id
		, rd.oem, rd.tamb, rd.tamb_q, rd.tusda4, rd.tusda4_q
		, rd.pctco2, rd.pctco2_q, rd.pctco2_set, rd.pctco2_set_q, rd.psuc
		, rd.psuc_q, rd.tdis, rd.tdis_q, rd.freq_comp, rd.tsuc
		, rd.tsuc_q, rd.mcond, rd.pcond, rd.pcond_q, rd.tcond
		, rd.tcond_q, rd.mctrl, rd.snctrl, ', '2020-08-10 11:45:29');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (580, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', 'null', 1, 'nested exception is org.apache.ibatis.exceptions.PersistenceException: 
### Error querying database.  Cause: org.springframework.jdbc.CannotGetJdbcConnectionException: Failed to obtain JDBC Connection; nested exception is com.alibaba.druid.pool.GetConnectionTimeoutException: wait millis 60072, active 20, maxActive 20, creating 0, runningSqlCount 2 : SELECT di.id, di.device_sn, di.bind_container, di.asset_type, di.asset_id
	, di.oem, di.tamb, di.tamb_q, di.tusda4, di.tusda4_q
	, di.pctco2, di.pctco2_q, di.pctco2_set, di.pctco2_set_q, di.di.psuc
	, di.psuc_q, di.tdis, di.tdis_q, di.freq_comp, di.tsuc
	, di.tsuc_q, di.mcond, di.pcond, di.pcond_q, di.tcond
	, di.tcond_q, di.mctrl, di.snctrl, di.amp_pha, di.amp_phb
	, di.amp_phc, di.pdis, di.pdis_q, di.pct_econ_vlv, di.pct_econ_vlv_q
	, di.pct_exp_vlv, di.pct_exp_vlv_q, di.tevap, di.tevap_q, di.mctrl3
	, di.pct_htr, di.pct_htr_q, di.mevap_fan_hs, di.pct_gas_vlv, di.pct_gas_vlv_q
	, di.pct_hum, di.pct_hum_q, di.pct_hum_set, di.pct_hum_set_q, di.freq_line
	, di.freq_line_q, di.vline1, di.vline2, di.vline3, di.mevap_fan_ls
	, di.pct_o2, di.pct_o2_q, di.pct_o2_set, di.pct_o2_set_q, di.mctrl2
	, di.trtn1, di.trtn1_q, di.trtn2, di.trtn2_q, di.tset
	, di.tset_q, di.ver_sw_major, di.ver_sw_minor, di.pct_suc_vlv, di.pct_suc_vlv_q
	, di.tsup1, di.tsup1_q, di.tsup2, di.tsup2_q, di.amp_total_draw
	, di.amp_total_draw_q, di.tusda1, di.tusda1_q, di.tusda2, di.tusda2_q
	, di.tusda3, di.tusda3_q, di.cmh_vent, di.cmh_vent_q, di.bk_num
	, di.tbk, di.tbk_q, di.ptidtm, di.pti_result, di.create_time
	, di.event_infos, di.preview_direction, di.pitch_no_row, di.pitch_no_column, di.child_column
FROM (
	SELECT rd.id, rd.device_sn, rd.bind_container, rd.asset_type, rd.asset_id
		, rd.oem, rd.tamb, rd.tamb_q, rd.tusda4, rd.tusda4_q
		, rd.pctco2, rd.pctco2_q, rd.pctco2_set, rd.pctco2_set_q, rd.psuc
		, rd.psuc_q, rd.tdis, rd.tdis_q, rd.freq_comp, rd.tsuc
		, rd.tsuc_q, rd.mcond, rd.pcond, rd.pcond_q, rd.tcond
		, rd.tcond_q, rd.mctrl, rd.snctrl, ', '2020-08-10 11:45:30');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (581, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', 'null', 1, 'nested exception is org.apache.ibatis.exceptions.PersistenceException: 
### Error querying database.  Cause: org.springframework.jdbc.CannotGetJdbcConnectionException: Failed to obtain JDBC Connection; nested exception is com.alibaba.druid.pool.GetConnectionTimeoutException: wait millis 60065, active 20, maxActive 20, creating 0, runningSqlCount 2 : SELECT di.id, di.device_sn, di.bind_container, di.asset_type, di.asset_id
	, di.oem, di.tamb, di.tamb_q, di.tusda4, di.tusda4_q
	, di.pctco2, di.pctco2_q, di.pctco2_set, di.pctco2_set_q, di.di.psuc
	, di.psuc_q, di.tdis, di.tdis_q, di.freq_comp, di.tsuc
	, di.tsuc_q, di.mcond, di.pcond, di.pcond_q, di.tcond
	, di.tcond_q, di.mctrl, di.snctrl, di.amp_pha, di.amp_phb
	, di.amp_phc, di.pdis, di.pdis_q, di.pct_econ_vlv, di.pct_econ_vlv_q
	, di.pct_exp_vlv, di.pct_exp_vlv_q, di.tevap, di.tevap_q, di.mctrl3
	, di.pct_htr, di.pct_htr_q, di.mevap_fan_hs, di.pct_gas_vlv, di.pct_gas_vlv_q
	, di.pct_hum, di.pct_hum_q, di.pct_hum_set, di.pct_hum_set_q, di.freq_line
	, di.freq_line_q, di.vline1, di.vline2, di.vline3, di.mevap_fan_ls
	, di.pct_o2, di.pct_o2_q, di.pct_o2_set, di.pct_o2_set_q, di.mctrl2
	, di.trtn1, di.trtn1_q, di.trtn2, di.trtn2_q, di.tset
	, di.tset_q, di.ver_sw_major, di.ver_sw_minor, di.pct_suc_vlv, di.pct_suc_vlv_q
	, di.tsup1, di.tsup1_q, di.tsup2, di.tsup2_q, di.amp_total_draw
	, di.amp_total_draw_q, di.tusda1, di.tusda1_q, di.tusda2, di.tusda2_q
	, di.tusda3, di.tusda3_q, di.cmh_vent, di.cmh_vent_q, di.bk_num
	, di.tbk, di.tbk_q, di.ptidtm, di.pti_result, di.create_time
	, di.event_infos, di.preview_direction, di.pitch_no_row, di.pitch_no_column, di.child_column
FROM (
	SELECT rd.id, rd.device_sn, rd.bind_container, rd.asset_type, rd.asset_id
		, rd.oem, rd.tamb, rd.tamb_q, rd.tusda4, rd.tusda4_q
		, rd.pctco2, rd.pctco2_q, rd.pctco2_set, rd.pctco2_set_q, rd.psuc
		, rd.psuc_q, rd.tdis, rd.tdis_q, rd.freq_comp, rd.tsuc
		, rd.tsuc_q, rd.mcond, rd.pcond, rd.pcond_q, rd.tcond
		, rd.tcond_q, rd.mctrl, rd.snctrl, ', '2020-08-10 11:45:31');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (582, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "7aea953716604e1abc33462e0b64b1ee",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-10 11:46:16');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (583, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "bc95082cd12744e49a51c56e2632712f",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-10 11:46:19');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (584, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "edac3eac3b9b492093bb790bcdfc1bc4",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-10 11:46:20');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (585, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "dadd7e6b22bc4016973eba2cbcd9f15e",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-10 11:46:21');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (586, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "ce91c8a98fb24ceb87855bc3b9af32fb",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-10 11:46:21');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (587, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "01afe4b5b5f446649ddf2c9d2d1f4f68",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-10 11:46:22');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (588, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "c90353d4b5e8459c83c1a5fd90d92b6f",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-10 11:46:23');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (589, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "437619bed29840dbb81c38137319dbf3",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-10 11:46:23');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (590, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "3cba6c6c160944d99ab992413b34c183",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-10 11:46:24');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (591, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "3fa6cd21bfc5429596b9cd919f25500b",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-10 11:46:25');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (592, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "7e687ddd6e4542acbf0efe649cc0fa71",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-10 11:46:25');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (593, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "08d0e9939c5a4f13bf8128c242195a39",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-10 11:46:26');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (594, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "e11e3d900fbc4fe1a1cbb10150468ebf",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-10 11:46:27');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (595, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "effc89b87901441eb3b2aa1d0c660536",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-10 11:46:32');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (596, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "d3ff76b7bb5e468caa913941c874e579",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-10 11:46:37');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (597, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "1ce8e9bce7b240ff9216564d21883844",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-10 13:02:55');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (598, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.181', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "c533548b6e914ca6a1277e4137070254",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-10 13:03:29');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (599, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "b8ded95bf23c4a678fc7b306c83388f4",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-10 13:11:11');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (600, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.181', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "89bfb9ce2fd847c7bf781f53577dcced",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-10 14:25:41');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (601, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "90abac2d41c9443b90f99b6ad043afcb",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-10 14:26:41');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (602, '登录', 7, 'com.nts.business.api.SysUserApiController.loginout()', 'GET', 1, null, null, '/api/sysuser/loginout', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "退出成功"
}', 0, null, '2020-08-10 14:26:46');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (603, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "d0598f01c5384d379ffa7630e1de0b01",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-10 14:27:52');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (604, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "01e2c136b7b94abcafdbb8cda474a012",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-10 14:33:01');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (605, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '127.0.0.1', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "1af2da93a9cd433b81c871c5a6fc7f45",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-10 15:21:00');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (606, '贝图箱位', 1, 'com.nts.business.api.BoxPostitonApiContrtoller.addBoxPostiton()', 'POST', 1, 'admin', '研发部门', '/api/boxpost/addBoxPostiton', '127.0.0.1', '内网IP', '{
  "boxareaId" : [ "1" ],
  "childColumn" : [ "1" ],
  "containerId" : [ "APNT0000001" ],
  "deviceId" : [ "514901342577801" ],
  "id" : [ "" ],
  "pitchNoColumn" : [ "3" ],
  "pitchNoRow" : [ "3" ],
  "previewDirection" : [ "0" ]
}', '{
  "code" : 55,
  "msg" : "添加贝图箱位失败,该设备已存在该场区"
}', 0, null, '2020-08-10 15:22:15');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (607, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "7d7b6aff08ba4c1a9ffbc9df0e4dd8c5",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-10 15:59:35');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (608, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "9b125cb128b6469b81ba22b2a6441cde",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-10 16:54:06');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (609, '用户', 2, 'com.nts.business.api.SysUserApiController.editUserSave()', 'POST', 1, 'admin', '研发部门', '/api/sysuser/editUserSave', '192.168.31.35', '内网IP', '{
  "userId" : [ "129" ],
  "status" : [ "1" ]
}', '{
  "code" : 0,
  "msg" : "修改用户成功"
}', 0, null, '2020-08-10 17:12:26');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (610, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "0b0890dee9474cfbbe80a182bdf0b775",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-10 17:19:13');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (611, '用户', 2, 'com.nts.business.api.SysUserApiController.editUserSave()', 'POST', 1, 'admin', '研发部门', '/api/sysuser/editUserSave', '192.168.31.35', '内网IP', '{
  "postIds" : [ "" ],
  "roleIds" : [ "1" ],
  "childFlag" : [ "1" ],
  "userId" : [ "121" ],
  "userName" : [ "小朋友" ],
  "loginName" : [ "cqs" ],
  "status" : [ "0" ],
  "deptId" : [ "100" ]
}', '{
  "code" : 0,
  "msg" : "修改用户成功"
}', 0, null, '2020-08-10 17:42:42');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (612, '用户', 2, 'com.nts.business.api.SysUserApiController.editUserSave()', 'POST', 1, 'admin', '研发部门', '/api/sysuser/editUserSave', '192.168.31.35', '内网IP', '{
  "postIds" : [ "" ],
  "roleIds" : [ "2" ],
  "childFlag" : [ "1" ],
  "userId" : [ "129" ],
  "userName" : [ "大朋友" ],
  "loginName" : [ "zhangsang" ],
  "status" : [ "1" ],
  "deptId" : [ "214" ]
}', '{
  "code" : 0,
  "msg" : "修改用户成功"
}', 0, null, '2020-08-10 17:44:46');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (613, '用户', 2, 'com.nts.business.api.SysUserApiController.editUserSave()', 'POST', 1, 'admin', '研发部门', '/api/sysuser/editUserSave', '192.168.31.35', '内网IP', '{
  "postIds" : [ "" ],
  "roleIds" : [ "2" ],
  "childFlag" : [ "1" ],
  "userId" : [ "120" ],
  "userName" : [ "大大人" ],
  "loginName" : [ "oppo" ],
  "status" : [ "0" ],
  "deptId" : [ "" ]
}', '{
  "code" : 0,
  "msg" : "修改用户成功"
}', 0, null, '2020-08-10 17:47:04');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (614, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "615058f2637b401ab45c74f3295b28f8",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-11 09:03:51');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (615, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.181', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "ca2deda662db42e58e25a2530b35ec05",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-11 09:10:52');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (616, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.181', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "3c96da36d8b749f581e61bbd2833dd9b",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-11 09:12:05');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (617, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.181', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "1a29e04490db41bfb687e13500bf5e9b",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-11 09:12:43');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (618, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.181', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "a6d624b5a6f7496ca8926cf05584d4d1",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-11 09:16:19');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (619, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.181', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "23a3fa1decbf40d88b7f87eeed50447e",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-11 09:21:12');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (620, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "bf3fd7356e794df591d1d582cfa4c93e",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-11 09:30:39');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (621, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "b71de64fe9b34d92b6768f51346c8b1e",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-11 09:33:36');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (622, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "9a0d6c8fe3c94d52b34e97ef0459bfcd",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-11 09:34:21');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (623, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.181', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "8646e9980a2348cc8a476cec8a973c61",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-11 09:38:40');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (624, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.181', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "f761d8281ee740eeb8f7982c7b15c845",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-11 09:40:44');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (625, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "4f6a9e1561224b63b44e5f2520fc09ec",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-11 09:41:10');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (626, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "d473c27af9a84b2a9152b3a409485ace",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-11 09:41:24');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (627, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "4803b811511c474395d9edaae50d660b",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-11 09:41:27');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (628, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "3b10ce1bce9d4d18bbf1412901eeddc2",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-11 09:41:28');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (629, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "52806fd5ef344989b33ea4dfee02482c",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-11 09:41:32');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (630, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "84de6445513446b0835f93e5402a8f8b",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-11 09:41:39');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (631, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "15d103be41c54d51826b19586b23422e",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-11 09:41:43');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (632, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "a42442a1bf2a42b1a10ec236e3fe7051",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-11 09:41:45');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (633, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "ad6349f5a00546aa9cbd356b6e4d03ed",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-11 09:41:47');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (634, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "d30c0464eb6b4d769140e10896cfef69",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-11 09:41:48');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (635, '登录', 7, 'com.nts.business.api.SysUserApiController.loginout()', 'GET', 1, null, null, '/api/sysuser/loginout', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "退出成功"
}', 0, null, '2020-08-11 09:41:55');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (636, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "256a4cc03ea64735be5d496e7887f2fd",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-11 09:41:59');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (637, '登录', 7, 'com.nts.business.api.SysUserApiController.loginout()', 'GET', 1, null, null, '/api/sysuser/loginout', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "退出成功"
}', 0, null, '2020-08-11 09:42:17');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (638, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "f28ca6aacbeb4463a1dc6a7b7699c619",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-11 09:42:24');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (639, '登录', 7, 'com.nts.business.api.SysUserApiController.loginout()', 'GET', 1, null, null, '/api/sysuser/loginout', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "退出成功"
}', 0, null, '2020-08-11 09:42:45');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (640, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "0ffbe742fe2d4a58ba33ccee08582878",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-11 09:42:51');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (641, '登录', 7, 'com.nts.business.api.SysUserApiController.loginout()', 'GET', 1, null, null, '/api/sysuser/loginout', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "退出成功"
}', 0, null, '2020-08-11 09:43:02');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (642, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "78fe1c7c9c3e451da67f034e41574e67",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-11 09:43:10');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (643, '登录', 7, 'com.nts.business.api.SysUserApiController.loginout()', 'GET', 1, null, null, '/api/sysuser/loginout', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "退出成功"
}', 0, null, '2020-08-11 09:43:37');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (644, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "11dfdbb6e28546e983f5b9c350ecf38e",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-11 09:45:44');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (645, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.181', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "e9380847219e4e9dbcdd4e91d31fcd1b",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-11 09:47:23');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (646, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "ca1b13c21c7445e0950325b027c0f0c9",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-11 09:52:01');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (647, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "d770d2f8b5bd4326849760e97932c02e",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-11 09:57:55');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (648, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "a2253dd5179d47729354d7516272dacc",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-11 10:00:15');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (649, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '127.0.0.1', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "91e62fef702b41428fb1accd7c904a52",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-11 10:02:49');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (650, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '127.0.0.1', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "e7adc2aeb0ef4d62881f95358b991eff",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-11 10:03:57');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (651, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '127.0.0.1', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "7cec95f88663498b9647dd1ed59ab4b0",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-11 10:34:51');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (652, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "65beb4b02416424a8be85fd69425cb7e",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-11 10:35:16');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (653, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "ed5f190a7e48459b9891cc9d4e77605c",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-11 10:35:26');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (654, '登录', 7, 'com.nts.business.api.SysUserApiController.loginout()', 'GET', 1, null, null, '/api/sysuser/loginout', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "退出成功"
}', 0, null, '2020-08-11 10:35:59');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (655, '登录', 7, 'com.nts.business.api.SysUserApiController.loginout()', 'GET', 1, null, null, '/api/sysuser/loginout', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "退出成功"
}', 0, null, '2020-08-11 10:36:08');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (656, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "469c5825af4f46f89e99dcd1b15fdc06",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-11 10:36:11');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (657, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '127.0.0.1', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "0c9bce6b0b2d4bde8d18dc4036311f51",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-11 10:37:14');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (658, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '192.168.31.35', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "c0c278e0e9404af19b22a99fec251365",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-11 10:37:44');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (659, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '127.0.0.1', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "26f64ab9a0d74ecf9beb39730cac567b",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-11 13:58:43');
INSERT INTO coldchain_sys_admin.sys_oper_log (oper_id, title, business_type, method, request_method, operator_type, oper_name, dept_name, oper_url, oper_ip, oper_location, oper_param, json_result, status, error_msg, oper_time) VALUES (660, '登录', 4, 'com.nts.business.api.AuthApiController.login()', 'POST', 1, 'admin', '研发部门', '/api/auth/login', '127.0.0.1', '内网IP', '{ }', '{
  "code" : 0,
  "msg" : "登录成功！",
  "data" : {
    "roleIds" : [ null ],
    "userName" : "管理员",
    "token" : "0a3b413221b34c86907f5cb6b8fc4dcf",
    "loginName" : "admin"
  }
}', 0, null, '2020-08-11 14:34:30');