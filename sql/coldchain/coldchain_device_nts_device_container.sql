create table nts_device_container
(
    id           bigint(32) auto_increment comment '编号'
        primary key,
    device_id    bigint                 not null comment '设备ID',
    contaoner_id bigint(32)             not null comment '集装箱ID',
    delete_flag  tinyint(1)  default 1  null comment '删除标志 1-正常状态 2-已删除',
    create_time  datetime               null comment '创建时间',
    update_time  datetime               null comment '更新时间',
    create_by    varchar(64) default '' null comment '创建者',
    update_by    varchar(64) default '' null comment '更新者'
)
    comment '冷链设备-集装箱关联表';

INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (113, 189, 75, 1, '2020-09-25 10:10:33', null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (114, 137, 76, 1, '2020-09-25 11:04:06', null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (115, 173, 77, 1, '2020-09-25 11:04:45', null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (116, 133, 78, 1, '2020-09-25 11:05:21', null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (118, 135, 80, 1, '2020-09-25 11:06:27', null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (119, 136, 81, 1, '2020-09-25 11:06:49', null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (120, 138, 82, 1, '2020-09-25 11:07:33', null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (121, 139, 83, 1, '2020-09-25 11:07:59', null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (123, 141, 85, 1, '2020-09-25 11:09:28', null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (124, 140, 88, 1, '2020-09-25 11:13:21', null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (125, 143, 89, 1, '2020-09-25 11:14:22', null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (127, 144, 91, 1, '2020-09-25 11:15:39', null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (130, 147, 94, 1, '2020-09-25 11:16:46', null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (131, 149, 95, 1, '2020-09-25 11:17:14', null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (133, 166, 97, 1, '2020-09-25 11:44:10', null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (134, 160, 98, 1, '2020-09-25 11:44:46', null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (135, 177, 99, 1, '2020-09-25 11:45:15', null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (136, 190, 100, 1, '2020-09-25 11:45:45', null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (137, 167, 101, 1, '2020-09-25 11:46:32', null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (138, 155, 102, 1, '2020-09-25 11:47:00', null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (139, 170, 103, 1, '2020-09-25 11:47:19', null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (140, 156, 105, 1, '2020-09-25 11:47:47', null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (141, 153, 107, 1, '2020-09-25 11:48:22', null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (142, 152, 108, 1, '2020-09-25 11:50:12', null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (143, 180, 109, 1, '2020-09-25 11:50:42', null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (144, 181, 110, 1, '2020-09-25 11:51:04', null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (147, 172, 111, 1, '2020-09-27 09:55:05', null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (148, 178, 112, 1, '2020-09-27 09:55:53', null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (149, 165, 113, 1, '2020-09-27 09:56:31', null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (150, 168, 114, 1, '2020-09-27 09:56:41', null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (151, 164, 115, 1, '2020-09-27 09:57:02', null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (152, 176, 116, 1, '2020-09-27 10:03:11', null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (153, 191, 117, 1, '2020-09-27 10:03:28', null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (155, 186, 119, 1, '2020-09-27 10:03:46', null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (156, 175, 120, 1, '2020-09-27 10:04:09', null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (157, 187, 121, 1, '2020-09-27 10:04:17', null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (161, 154, 125, 1, '2020-09-27 10:05:41', null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (162, 159, 126, 1, '2020-09-27 10:06:08', null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (163, 161, 127, 1, '2020-09-27 10:06:20', null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (164, 179, 128, 1, '2020-09-27 10:06:43', null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (167, 185, 131, 1, '2020-09-27 10:07:51', null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (168, 169, 132, 1, '2020-09-27 10:08:09', null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (169, 182, 133, 1, '2020-09-27 10:08:49', null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (171, 163, 135, 1, '2020-09-27 10:09:18', null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (172, 162, 136, 1, '2020-09-27 10:09:33', null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (173, 146, 137, 1, null, null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (174, 142, 139, 1, null, null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (175, 151, 93, 1, '2020-09-27 10:53:50', null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (176, 145, 140, 1, null, null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (177, 134, 141, 1, null, null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (178, 184, 142, 1, null, null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (179, 158, 143, 1, null, null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (180, 157, 144, 1, null, null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (181, 183, 145, 1, null, null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (182, 174, 146, 1, null, null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (183, 171, 147, 1, null, null, '', '');
INSERT INTO coldchain_device.nts_device_container (id, device_id, contaoner_id, delete_flag, create_time, update_time, create_by, update_by) VALUES (184, 188, 148, 1, null, null, '', '');