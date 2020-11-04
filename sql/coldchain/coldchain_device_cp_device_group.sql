create table cp_device_group
(
    id            varchar(64)  not null comment '主键'
        primary key,
    group_name    varchar(255) null comment '分组名称',
    group_company varchar(64)  null comment '所属企业ID',
    group_user    varchar(64)  null comment '所属用户ID',
    remark        varchar(500) null comment '备注',
    create_date   datetime     null comment '创建时间',
    create_by     varchar(64)  null comment '创建者',
    update_date   datetime     null comment '修改时间',
    update_by     varchar(64)  null comment '修改者'
);

INSERT INTO coldchain_device.cp_device_group (id, group_name, group_company, group_user, remark, create_date, create_by, update_date, update_by) VALUES ('1b8a0fa9e8e8fc9fb9a38bdd908306f0', '243243', null, '49', '11', '2020-10-29 17:17:31', null, null, null);
INSERT INTO coldchain_device.cp_device_group (id, group_name, group_company, group_user, remark, create_date, create_by, update_date, update_by) VALUES ('339280b377680cd5270c273000d6012a', '冷藏车', null, '64', '1', '2020-10-31 11:21:24', null, null, null);
INSERT INTO coldchain_device.cp_device_group (id, group_name, group_company, group_user, remark, create_date, create_by, update_date, update_by) VALUES ('3d09e7d9e5181d9be1d007895ff0eb40', '冷链控制器', null, '52', '冷藏箱', '2020-10-30 08:48:06', null, null, null);
INSERT INTO coldchain_device.cp_device_group (id, group_name, group_company, group_user, remark, create_date, create_by, update_date, update_by) VALUES ('564468a82abd8ffa5e2517e0998403a9', '111', null, '38', '11', '2020-10-29 11:32:58', null, '2020-10-30 14:22:27', null);
INSERT INTO coldchain_device.cp_device_group (id, group_name, group_company, group_user, remark, create_date, create_by, update_date, update_by) VALUES ('57cc156156156123dsfdsfsd1c171674a', '大道', '1', '2', '4号', '2020-10-27 11:03:33', null, null, null);
INSERT INTO coldchain_device.cp_device_group (id, group_name, group_company, group_user, remark, create_date, create_by, update_date, update_by) VALUES ('57cc6a25166eefabae15361352153156', '北湖大道', '1', '2', '4号', '2020-10-27 11:02:54', null, null, null);
INSERT INTO coldchain_device.cp_device_group (id, group_name, group_company, group_user, remark, create_date, create_by, update_date, update_by) VALUES ('57cc6a25166eefabae2b36c171674a10', '测试勿动9-分组', null, '30', null, null, null, null, null);
INSERT INTO coldchain_device.cp_device_group (id, group_name, group_company, group_user, remark, create_date, create_by, update_date, update_by) VALUES ('57cc6a25166eefabae2b36c171674a11', '测试勿动10-分组', null, '30', null, null, null, null, null);
INSERT INTO coldchain_device.cp_device_group (id, group_name, group_company, group_user, remark, create_date, create_by, update_date, update_by) VALUES ('57cc6a25166eefabae2b36c171674a12', '测试勿动11-分组', null, '30', null, null, null, null, null);
INSERT INTO coldchain_device.cp_device_group (id, group_name, group_company, group_user, remark, create_date, create_by, update_date, update_by) VALUES ('57cc6a25166eefabae2b36c171674a13', '测试勿动12-分组', null, '30', null, null, null, null, null);
INSERT INTO coldchain_device.cp_device_group (id, group_name, group_company, group_user, remark, create_date, create_by, update_date, update_by) VALUES ('57cc6a25166eefabae2b36c171674a14', '测试勿动13-分组', null, '30', null, null, null, null, null);
INSERT INTO coldchain_device.cp_device_group (id, group_name, group_company, group_user, remark, create_date, create_by, update_date, update_by) VALUES ('57cc6a25166eefabae2b36c171674a15', '测试勿动14-分组', null, '30', null, null, null, null, null);
INSERT INTO coldchain_device.cp_device_group (id, group_name, group_company, group_user, remark, create_date, create_by, update_date, update_by) VALUES ('57cc6a25166eefabae2b36c171674a31', '测试勿动2-分组', null, '30', '测试勿动2-分组', '2020-10-27 14:07:44', null, null, null);
INSERT INTO coldchain_device.cp_device_group (id, group_name, group_company, group_user, remark, create_date, create_by, update_date, update_by) VALUES ('57cc6a25166eefabae2b36c171674a32', '测试勿动1-分组', null, '30', '测试勿动1-分组', '2020-10-29 18:45:20', null, null, null);
INSERT INTO coldchain_device.cp_device_group (id, group_name, group_company, group_user, remark, create_date, create_by, update_date, update_by) VALUES ('57cc6a25166eefabae2b36c171674a33', '南湖大道', '1', '2', '4号', '2020-10-26 14:55:11', null, null, null);
INSERT INTO coldchain_device.cp_device_group (id, group_name, group_company, group_user, remark, create_date, create_by, update_date, update_by) VALUES ('57cc6a25166eefabae2b36c171674a34', '测试勿动3-分组', null, '30', null, null, null, null, null);
INSERT INTO coldchain_device.cp_device_group (id, group_name, group_company, group_user, remark, create_date, create_by, update_date, update_by) VALUES ('57cc6a25166eefabae2b36c171674a35', '测试勿动4-分组', null, '30', null, null, null, null, null);
INSERT INTO coldchain_device.cp_device_group (id, group_name, group_company, group_user, remark, create_date, create_by, update_date, update_by) VALUES ('57cc6a25166eefabae2b36c171674a36', '测试勿动5-分组', null, '30', null, null, null, null, null);
INSERT INTO coldchain_device.cp_device_group (id, group_name, group_company, group_user, remark, create_date, create_by, update_date, update_by) VALUES ('57cc6a25166eefabae2b36c171674a37', '测试勿动6-分组', null, '30', null, null, null, null, null);
INSERT INTO coldchain_device.cp_device_group (id, group_name, group_company, group_user, remark, create_date, create_by, update_date, update_by) VALUES ('57cc6a25166eefabae2b36c171674a38', '测试勿动7-分组', null, '30', null, null, null, null, null);
INSERT INTO coldchain_device.cp_device_group (id, group_name, group_company, group_user, remark, create_date, create_by, update_date, update_by) VALUES ('57cc6a25166eefabae2b36c171674a39', '测试勿动8-分组', null, '30', null, null, null, null, null);
INSERT INTO coldchain_device.cp_device_group (id, group_name, group_company, group_user, remark, create_date, create_by, update_date, update_by) VALUES ('73f1e331f8d6d9bf59a0a19da669cef8', '测试分组', null, '38', 'test', '2020-10-29 11:07:25', null, '2020-10-29 17:57:23', null);
INSERT INTO coldchain_device.cp_device_group (id, group_name, group_company, group_user, remark, create_date, create_by, update_date, update_by) VALUES ('90619d4cbd0e3205630df359ef24c75d', '测试', null, '89', '12412', '2020-10-31 16:14:06', null, null, null);
INSERT INTO coldchain_device.cp_device_group (id, group_name, group_company, group_user, remark, create_date, create_by, update_date, update_by) VALUES ('9a4e92b65d1a5903767c5559c31291a4', '346', null, '80', '46', '2020-10-30 19:43:47', null, null, null);
INSERT INTO coldchain_device.cp_device_group (id, group_name, group_company, group_user, remark, create_date, create_by, update_date, update_by) VALUES ('9d799c6019a4b515fd2f5774437f7e97', '分组', null, '60', '备注', '2020-10-30 15:05:40', null, null, null);
INSERT INTO coldchain_device.cp_device_group (id, group_name, group_company, group_user, remark, create_date, create_by, update_date, update_by) VALUES ('b70e5890b0a0199d19edfd99c8830d07', 'fenzu', null, '38', '11', '2020-10-29 19:50:30', null, null, null);
INSERT INTO coldchain_device.cp_device_group (id, group_name, group_company, group_user, remark, create_date, create_by, update_date, update_by) VALUES ('c2b6f25dbc32a7a838aa33f33133cb29', '温湿度记录仪', null, '52', '冷藏车', '2020-10-30 08:47:47', null, null, null);
INSERT INTO coldchain_device.cp_device_group (id, group_name, group_company, group_user, remark, create_date, create_by, update_date, update_by) VALUES ('cdecb24c34033c2a83834bb65f1f904c', '测试数据', null, '92', 'ss', '2020-11-02 16:37:08', null, null, null);
INSERT INTO coldchain_device.cp_device_group (id, group_name, group_company, group_user, remark, create_date, create_by, update_date, update_by) VALUES ('e1dff7ee067fcbff38085c4831a860b7', '测试2', null, '87', '3', '2020-10-31 13:47:01', null, null, null);