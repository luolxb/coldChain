create table nts_project_device
(
    id         bigint auto_increment
        primary key,
    project_id bigint      null comment '项目ID',
    device_id  varchar(64) null comment '设备ID'
);

INSERT INTO coldchain_device.nts_project_device (id, project_id, device_id) VALUES (6, 7, '11a920fc2ab84fe38e77509cafcd2930');
INSERT INTO coldchain_device.nts_project_device (id, project_id, device_id) VALUES (7, 8, 'string');
INSERT INTO coldchain_device.nts_project_device (id, project_id, device_id) VALUES (8, 9, '11a920fc2ab84fe38e77509cafcd2930');
INSERT INTO coldchain_device.nts_project_device (id, project_id, device_id) VALUES (9, 10, '11a920fc2ab84fe38e77509cafcd2930');
INSERT INTO coldchain_device.nts_project_device (id, project_id, device_id) VALUES (11, 12, '11a920fc2ab84fe38e77509cafcd2930');
INSERT INTO coldchain_device.nts_project_device (id, project_id, device_id) VALUES (12, 13, '11a920fc2ab84fe38e77509cafcd2930');
INSERT INTO coldchain_device.nts_project_device (id, project_id, device_id) VALUES (13, 14, '11a920fc2ab84fe38e77509cafcd2930');
INSERT INTO coldchain_device.nts_project_device (id, project_id, device_id) VALUES (14, 15, '01f3074eef654a69a387c8cc1978f9c9');
INSERT INTO coldchain_device.nts_project_device (id, project_id, device_id) VALUES (15, 15, '12e6f84fcbc46f3116f00bb379da83ab');
INSERT INTO coldchain_device.nts_project_device (id, project_id, device_id) VALUES (16, 15, '5a66da602af843d3844502055005a9af');
INSERT INTO coldchain_device.nts_project_device (id, project_id, device_id) VALUES (17, 16, '80344');
INSERT INTO coldchain_device.nts_project_device (id, project_id, device_id) VALUES (18, 16, '80345');
INSERT INTO coldchain_device.nts_project_device (id, project_id, device_id) VALUES (19, 20, '81995');
INSERT INTO coldchain_device.nts_project_device (id, project_id, device_id) VALUES (20, 20, '81996');
INSERT INTO coldchain_device.nts_project_device (id, project_id, device_id) VALUES (21, 20, '81997');