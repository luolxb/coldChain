create table nts_company
(
    id                 bigint auto_increment
        primary key,
    company_type       varchar(32)          null comment '企业类型',
    company_code       varchar(64)          null comment '企业编码',
    company_name       varchar(255)         null comment '企业名称',
    logo               varchar(255)         null comment '公司LOGO',
    business_license   varchar(255)         null comment '公司营业执照',
    social_credit_code varchar(64)          null comment '社会信用代码',
    company_address    varchar(255)         null comment '地址',
    company_profile    varchar(300)         null comment '公司简介',
    company_phone      varchar(20)          null comment '联系电话',
    create_time        datetime             null,
    create_by          varchar(32)          null,
    update_time        datetime             null,
    update_by          varchar(32)          null,
    status             tinyint(1) default 1 null comment '状态 1：启用  2：禁用',
    audit_status       tinyint(1) default 1 null comment '审核状态 1：待审核，2：已审核',
    audit_time         datetime             null comment '审核时间',
    audit_by           varchar(32)          null comment '审核人',
    parent_id          bigint     default 0 null comment '父节点ID'
);

INSERT INTO coldchain_user.nts_company (id, company_type, company_code, company_name, logo, business_license, social_credit_code, company_address, company_profile, company_phone, create_time, create_by, update_time, update_by, status, audit_status, audit_time, audit_by, parent_id) VALUES (1, 'dd', null, '新时空', null, null, null, null, null, null, null, null, null, null, 1, 1, null, null, 0);
INSERT INTO coldchain_user.nts_company (id, company_type, company_code, company_name, logo, business_license, social_credit_code, company_address, company_profile, company_phone, create_time, create_by, update_time, update_by, status, audit_status, audit_time, audit_by, parent_id) VALUES (2, 'aa', null, '苹果', null, null, null, null, null, null, null, null, null, null, 1, 1, null, null, 1);
INSERT INTO coldchain_user.nts_company (id, company_type, company_code, company_name, logo, business_license, social_credit_code, company_address, company_profile, company_phone, create_time, create_by, update_time, update_by, status, audit_status, audit_time, audit_by, parent_id) VALUES (3, 'string', null, 'string', 'string', 'string', 'string', 'string', 'string', '18687269789', '2020-10-28 11:47:45', '13066803937', null, null, 1, 1, null, null, 2);