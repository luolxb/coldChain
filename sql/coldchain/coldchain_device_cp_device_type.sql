create table cp_device_type
(
    id               varchar(64)      not null comment '主键ID'
        primary key,
    device_type_name varchar(64)      null comment '设备类型名称',
    device_firm      varchar(255)     null comment '设备厂商',
    device_brand     varchar(255)     null comment '设备品牌',
    remark           varchar(500)     null comment '备注',
    create_date      datetime         null comment '创建时间',
    create_by        varchar(64)      null comment '创建人',
    update_date      datetime         null comment '修改时间',
    update_by        varchar(64)      null comment '修改人',
    status           int(4) default 0 null comment '0：启用，1禁用',
    device_company   varchar(255)     null comment '设备企业'
)
    comment '设备类型表';

INSERT INTO coldchain_device.cp_device_type (id, device_type_name, device_firm, device_brand, remark, create_date, create_by, update_date, update_by, status, device_company) VALUES ('ac514e91d7f64802ac2632b3ee7c4ce9', '温控器', '新时空', 'nts', '1', '2020-10-27 17:12:09', null, null, null, 1, null);
INSERT INTO coldchain_device.cp_device_type (id, device_type_name, device_firm, device_brand, remark, create_date, create_by, update_date, update_by, status, device_company) VALUES ('b76952e737c34ee897681a95672af3e9', '湿度记录仪', '555564537', '53736573567', '6573567', '2020-10-22 20:23:07', null, null, null, 1, null);
INSERT INTO coldchain_device.cp_device_type (id, device_type_name, device_firm, device_brand, remark, create_date, create_by, update_date, update_by, status, device_company) VALUES ('f69ef45ba936428c9d96c671af3c745a', '温度记录仪', 'dsfd', 'sdfsd', 'sdfdsf', '2020-10-21 17:09:17', '18687269789', '2020-10-22 19:50:03', '18687269789', 1, null);