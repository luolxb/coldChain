-- coldchain_data库 新增设备数据下载表 nts_device_data_down
-- 新增时间：2020-10-09
-- 新增人：罗先波
CREATE TABLE `nts_device_data_down`
(
    `id`               bigint(20) NOT NULL AUTO_INCREMENT,
    `device_id`        bigint(20)   DEFAULT NULL COMMENT '设备ID',
    `down_start`       datetime     DEFAULT NULL COMMENT '下载开始时间',
    `down_end`         datetime     DEFAULT NULL COMMENT '下载结束时间',
    `receiving_method` varchar(64)  DEFAULT NULL COMMENT '接收方式',
    `down_status`      tinyint(1)   DEFAULT '0' COMMENT '下载状态：0：待生成；1：已生成；2：生成失败',
    `path`             varchar(255) DEFAULT NULL COMMENT '本地保存路径',
    `create_time`      datetime     DEFAULT NULL,
    `create_by`        varchar(64)  DEFAULT NULL,
    `update_time`      datetime     DEFAULT NULL,
    `update_by`        varchar(64)  DEFAULT NULL,
    `delete_flag`      tinyint(1)   DEFAULT '0' COMMENT '删除标记0：正常 ；1：删除',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

-- coldchain_device库 新增设备数据下载表 nts_project
-- 新增时间：2020-10-09
-- 新增人：罗先波
CREATE TABLE `nts_project`
(
    `id`              bigint(20) NOT NULL AUTO_INCREMENT,
    `project_name`    varchar(64)     DEFAULT NULL COMMENT '项目名称',
    `project_address` varchar(255)    DEFAULT NULL COMMENT '项目地址',
    `project_type`    varchar(32)     DEFAULT NULL COMMENT '项目类型',
    `remark`          varchar(255)    DEFAULT NULL COMMENT '备注',
    `create_time`     timestamp  NULL DEFAULT NULL,
    `create_by`       varchar(64)     DEFAULT NULL,
    `update_time`     timestamp  NULL DEFAULT NULL,
    `update_by`       varchar(64)     DEFAULT NULL,
    `delete_flag`     tinyint(1)      DEFAULT '0' COMMENT '删除标记0：正常 1：删除',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;


-- coldchain_device库 新增设备数据下载表 nts_project_device
-- 新增时间：2020-10-09
-- 新增人：罗先波
CREATE TABLE `nts_project_device`
(
    `id`         bigint(20) NOT NULL AUTO_INCREMENT,
    `project_id` bigint(20) DEFAULT NULL COMMENT '项目ID',
    `device_id`  bigint(20) DEFAULT NULL COMMENT '设备ID',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;


-- coldchain_device库 新增设备数据下载表 nts_user_project
-- 新增时间：2020-10-09
-- 新增人：罗先波
CREATE TABLE `nts_user_project`
(
    `id`         bigint(20) NOT NULL AUTO_INCREMENT,
    `user_id`    bigint(20) DEFAULT NULL,
    `project_id` bigint(20) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

-- ----------------------------
-- Table structure for cp_device
-- coldchain_device库 新增设备表 cp_device
-- 新增时间：2020-10-09
-- 新增人：陈庆山
-- ----------------------------
DROP TABLE IF EXISTS `cp_device`;
CREATE TABLE `cp_device`
(
    `id`                  varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci  NOT NULL COMMENT '主键',
    `user_id`             varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户ID',
    `device_name`         varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '设备名称',
    `device_sn`           varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '设备序列号',
    `device_type`         varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '设备类型',
    `sim_card`            varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT 'sim卡',
    `positioning_mode`    varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '定位模式',
    `device_manufacturer` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '设备厂商',
    `device_company`      varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '所属企业',
    `device_project`      varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '所属项目',
    `create_time`         varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '设备接入时间',
    `device_group`        varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '设备分组',
    `link_type`           varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '设备协议',
    `is_on`               varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '状态',
    `create_date`         varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '创建时间',
    `founder`             varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '创建人',
    `modify_time`         varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '修改时间',
    `modifier`            varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '修改人',
    `lat`                 varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '纬度',
    `lng`                 varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '经度',
    `device_id`           int(20)                                                 DEFAULT NULL COMMENT '设备ID',
    `device_no`           varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci  DEFAULT NULL,
    `is_line`             int(1)                                                  DEFAULT NULL COMMENT '是否在线 0 否 1是',
    `is_alarms`           int(1)                                                  DEFAULT NULL COMMENT '是否报警 0 和 “”表示未报警，1 报警',
    `is_delete`           int(1)                                                  DEFAULT NULL COMMENT '是否已删除 0 否 1是',
    `default_timescale`   varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci   DEFAULT NULL COMMENT '掉线延时  单位（秒）',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8
  COLLATE = utf8_general_ci COMMENT = '设备表'
  ROW_FORMAT = Dynamic;



-- ----------------------------
-- Table structure for cp_device_correlation_sensor
-- coldchain_device库 新增设备-传感器关联表 cp_device_correlation_sensor
-- 新增时间：2020-10-09
-- 新增人：陈庆山
-- ----------------------------
DROP TABLE IF EXISTS `cp_device_correlation_sensor`;
CREATE TABLE `cp_device_correlation_sensor`
(
    `id`        varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
    `device_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '设备编号（主键）',
    `sensor_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '传感器编号（主键）',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8
  COLLATE = utf8_general_ci COMMENT = '设备-传感器关联表'
  ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for cp_device_correlation_type
-- coldchain_device库 新增设备-设备类型关联表 cp_device_correlation_type
-- 新增时间：2020-10-09
-- 新增人：陈庆山
-- ----------------------------
DROP TABLE IF EXISTS `cp_device_correlation_type`;
CREATE TABLE `cp_device_correlation_type`
(
    `id`             varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
    `device_id`      varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '设备编号（主键）',
    `device_type_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '设备类型编号（主键）',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8
  COLLATE = utf8_general_ci COMMENT = '设备-设备类型关联表'
  ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for cp_device_group
-- coldchain_device库 新增设备分组表 cp_device_group
-- 新增时间：2020-10-09
-- 新增人：陈庆山
-- ----------------------------
DROP TABLE IF EXISTS `cp_device_group`;
CREATE TABLE `cp_device_group`
(
    `id`            varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
    `group_name`    varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '分组名称',
    `group_company` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci  DEFAULT NULL COMMENT '所属企业ID',
    `group_user`    varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci  DEFAULT NULL COMMENT '所属用户ID',
    `remark`        varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '备注',
    `create_date`   datetime(0)                                             DEFAULT NULL COMMENT '创建时间',
    `create_by`     varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci  DEFAULT NULL COMMENT '创建者',
    `update_date`   datetime(0)                                             DEFAULT NULL COMMENT '修改时间',
    `update_by`     varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci  DEFAULT NULL COMMENT '修改者',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8
  COLLATE = utf8_general_ci
  ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for cp_device_type
-- coldchain_device库 新增设备类型表 cp_device_type
-- 新增时间：2020-10-09
-- 新增人：陈庆山
-- ----------------------------
DROP TABLE IF EXISTS `cp_device_type`;
CREATE TABLE `cp_device_type`
(
    `id`           varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键ID',
    `device_firm`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '设备厂商',
    `device_brand` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '设备品牌',
    `remark`       varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '备注',
    `create_date`  datetime(0)                                             DEFAULT NULL COMMENT '创建时间',
    `create_by`    varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci  DEFAULT NULL COMMENT '创建人',
    `update_date`  datetime(0)                                             DEFAULT NULL COMMENT '修改时间',
    `update_by`    varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci  DEFAULT NULL COMMENT '修改人',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8
  COLLATE = utf8_general_ci COMMENT = '设备类型表'
  ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for cp_sensor
-- coldchain_device库 新增传感器表 cp_sensor
-- 新增时间：2020-10-09
-- 新增人：陈庆山
-- ----------------------------
DROP TABLE IF EXISTS `cp_sensor`;
CREATE TABLE `cp_sensor`
(
    `id`            varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
    `sensor_id`     int(11)                                                 DEFAULT NULL COMMENT '传感器ID',
    `sensor_name`   varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '传感器名称',
    `sensor_type`   varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '数据类型',
    `decimal_point` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '小数点',
    `unit`          varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '数据单位',
    `value`         varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '数据内容',
    `create_date`   varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '创建时间',
    `founder`       varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '创建人',
    `modify_time`   varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '修改时间',
    `modifier`      varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '修改人',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8
  COLLATE = utf8_general_ci COMMENT = '传感器表'
  ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for cp_sensor_data
-- coldchain_device库 新增传感器数据表 cp_sensor_data
-- 新增时间：2020-10-09
-- 新增人：陈庆山
-- ----------------------------
DROP TABLE IF EXISTS `cp_sensor_data`;
CREATE TABLE `cp_sensor_data`
(
    `id`           varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
    `cp_sensor_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '传感器主键ID',
    `msg`          varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
    `update_date`  datetime(0)                                             DEFAULT NULL COMMENT '数据更新的时间',
    `flag`         varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '00表示请求成功01表示请求失败',
    `sensor_name`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '传感器名称',
    `user_name`    varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户名',
    `device_id`    int(11)                                                 DEFAULT NULL COMMENT '第三方平台设备ID',
    `user_id`      int(11)                                                 DEFAULT NULL COMMENT '用户ID',
    `sensor_id`    int(11)                                                 DEFAULT NULL COMMENT '第三方平台传感器ID',
    `unit`         varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '数值单位',
    `sensor_type`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '传感器类型 数值类型',
    `is_line`      varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '是否在线',
    `value`        varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '数值',
    `is_alarms`    varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '是否报警',
    `lat`          varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '经度',
    `lng`          varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '纬度',
    `switcher`     varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '开关值 0表示关 1表示开',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8
  COLLATE = utf8_general_ci COMMENT = '传感器数据表'
  ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for cp_trigger
-- coldchain_device库 新增触发器器数据表 cp_trigger
-- 新增时间：2020-10-12
-- 新增人：陈庆山
-- ----------------------------
DROP TABLE IF EXISTS `cp_trigger`;
CREATE TABLE `cp_trigger`
(
    `id`                varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键ID',
    `device_id`         varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci  DEFAULT NULL COMMENT '设备主键ID',
    `sensor_id`         varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci  DEFAULT NULL COMMENT '传感器主键ID',
    `link_user_id`      bigint(11)                                              DEFAULT NULL COMMENT '第三方平台用户ID',
    `link_device_id`    bigint(11)                                              DEFAULT NULL COMMENT '第三方平台设备ID',
    `link_sensor_id`    bigint(11)                                              DEFAULT NULL COMMENT '第三方平台传感器ID',
    `alarm_type`        int(2)                                                  DEFAULT NULL COMMENT '触发器类型 取值范围 1-15 分别表示,1数值高于X、2数值低于Y、3数值高于X低于Y、4数值高于X低于Y超过M分钟、5数值高于X报警低于Y恢复、6数值低于X报警高于Y恢复、7数值在X和Y之间、8数值超过M分钟高于X、9数值超过M分钟低于Y、10传感器未连接、11超过M分钟未连接、12开关ON、13开关OFF、14数值等于X、15数值不等于X 必选参数',
    `height_value`      int(8)                                                  DEFAULT NULL COMMENT '警戒值高值（X值） 可选参数，根据alarmType触发器类型填写',
    `below_value`       int(8)                                                  DEFAULT NULL COMMENT '警戒值低值（Y值）可选参数，根据alarmType触发器类型填写',
    `duration`          int(8)                                                  DEFAULT NULL COMMENT '时间临界点（M值）单位分钟可选参数，根据alarmType触发器类型填写',
    `target_model`      int(1)                                                  DEFAULT NULL COMMENT '接收报警的方式 取值范围 1-4 分别表示1微信、2邮箱、3短信、4语音拨号',
    `contacts`          varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '报警接收人，多个接收人已英文\",\"分隔，微信报警时填写关注或绑定公众号的openId,邮箱报警时填写邮箱，短信语音拨号填写手机号码',
    `is_forward`        int(1)                                                  DEFAULT NULL COMMENT '是否转发 取值范围 0-1 0表示不转发，1表示转发 必选参数',
    `forward_device_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci  DEFAULT NULL COMMENT '转发时接收数据的第三方平台设备Id',
    `forward_sensor_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci  DEFAULT NULL COMMENT '转发时接收数据的第三方平台传感器Id',
    `forward_data_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '转发的数据类型 取值范围 1-2 1表示字符串 2表示十六进制',
    `forward_value`     varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '转发的数值',
    ` tip_msg`          varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '提示信息',
    `status`            int(1)                                                  DEFAULT 1 COMMENT '开启状态 1:开启，0:关闭',
    `create_date`       datetime(0)                                             DEFAULT NULL COMMENT '创建时间',
    `create_by`         varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci  DEFAULT NULL COMMENT '创建者',
    `update_daate`      datetime(0)                                             DEFAULT NULL COMMENT '修改时间',
    `update_by`         varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci  DEFAULT NULL COMMENT '修改者',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8
  COLLATE = utf8_general_ci COMMENT = '触发器表'
  ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for cp_trigger_data
-- coldchain_device库 新增触发器报警记录表 cp_trigger_data
-- 新增时间：2020-10-12
-- 新增人：陈庆山
-- ----------------------------
DROP TABLE IF EXISTS `cp_trigger_data`;
CREATE TABLE `cp_trigger_data`
(
    `id`              varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键ID',
    `trigger_id`      varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci  DEFAULT NULL COMMENT '触发器主键ID',
    `device_id`       varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci  DEFAULT NULL COMMENT '设备主键ID',
    `sensor_id`       varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci  DEFAULT NULL COMMENT '传感器主键ID',
    `sensor_name`     varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci  DEFAULT NULL COMMENT '传感器名称',
    `smg_status`      int(1)                                                  DEFAULT NULL COMMENT '消息发送状态 0 正常 1失败',
    `msg_send_result` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '消息发送结果',
    `trigger_content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '触发内容',
    `trgger_date`     datetime(0)                                             DEFAULT NULL COMMENT '触发时间',
    `trigger_val`     varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '触发值',
    `trigger_email`   varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci  DEFAULT NULL COMMENT '报警消息接收人邮箱',
    `trigger_mobile`  varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci  DEFAULT NULL COMMENT '报警消息接收人电话',
    `trigger_wechat`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '报警消息接收人微信',
    `user_id`         varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci  DEFAULT NULL COMMENT '用户ID',
    `create_date`     datetime(0)                                             DEFAULT NULL COMMENT '创建时间',
    `create_by`       varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci  DEFAULT NULL COMMENT '创建者',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8
  COLLATE = utf8_general_ci COMMENT = '触发器报警记录表'
  ROW_FORMAT = Dynamic;

-- coldchain_user库 新增设备数据下载表 nts_user_company
-- 新增时间：2020-10-12
-- 新增人：罗先波
CREATE TABLE `nts_user_company`
(
    `id`         BIGINT(20) NOT NULL AUTO_INCREMENT,
    `user_id`    BIGINT(20) DEFAULT NULL,
    `company_id` BIGINT(20) DEFAULT NULL,
    PRIMARY KEY (`id`),
    KEY `index_user_id` (`user_id`),
    KEY `index_company_id` (`company_id`)
) ENGINE = INNODB
  DEFAULT CHARSET = utf8mb4;

-- coldchain_user库 新增设备数据下载表 nts_company
-- 新增时间：2020-10-12
-- 新增人：罗先波
CREATE TABLE `nts_company`
(
    `id`                 bigint(20) NOT NULL AUTO_INCREMENT,
    `company_type`       varchar(32)  DEFAULT NULL COMMENT '企业类型',
    `company_code`       varchar(64)  DEFAULT NULL COMMENT '企业编码',
    `company_name`       varchar(255) DEFAULT NULL COMMENT '企业名称',
    `logo`               varchar(255) DEFAULT NULL COMMENT '公司LOGO',
    `business_license`   varchar(255) DEFAULT NULL COMMENT '公司营业执照',
    `social_credit_code` varchar(64)  DEFAULT NULL COMMENT '社会信用代码',
    `company_address`    varchar(255) DEFAULT NULL COMMENT '地址',
    `company_profile`    varchar(300) DEFAULT NULL COMMENT '公司简介',
    `company_phone`      varchar(20)  DEFAULT NULL COMMENT '联系电话',
    `create_time`        datetime     DEFAULT NULL,
    `create_by`          varchar(32)  DEFAULT NULL,
    `update_time`        datetime     DEFAULT NULL,
    `update_by`          varchar(32)  DEFAULT NULL,
    `status`             tinyint(1)   DEFAULT '1' COMMENT '状态 1：启用  2：禁用',
    `audit_status`       tinyint(1)   DEFAULT '1' COMMENT '审核状态 1：待审核，2：已审核',
    `audit_time`         datetime     DEFAULT NULL COMMENT '审核时间',
    `audit_by`           varchar(32)  DEFAULT NULL COMMENT '审核人',
    `parent_id`          bigint(20)   DEFAULT '0' COMMENT '父节点ID',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

-- coldchain_user库 user表新增字段
-- 新增时间：2020-10-15
-- 新增人：罗先波
ALTER TABLE `coldchain_user`.`user`
    ADD COLUMN `create_time` DATETIME NULL AFTER `distribut_withdrawals_money`,
    ADD COLUMN `create_by` VARCHAR(32) NULL AFTER `create_time`,
    ADD COLUMN `update_time` DATETIME NULL AFTER `create_by`,
    ADD COLUMN `update_by` VARCHAR(32) NULL AFTER `update_time`;
ALTER TABLE `coldchain_user`.`user` ADD COLUMN `identity` VARCHAR(6) NULL COMMENT '身份' AFTER `update_by`;
ALTER TABLE `coldchain_user`.`user` ADD COLUMN `code` VARCHAR(32) NULL COMMENT '用户code' AFTER `identity`;
ALTER TABLE `coldchain_user`.`user` ADD COLUMN `lead_id` int(10) NULL COMMENT '上级id' AFTER `code`;
ALTER TABLE `coldchain_user`.`user` ADD COLUMN `user_address` VARCHAR(255) NULL COMMENT '用户地址' AFTER `lead_id`;

-- coldchain_user库 新增联系人表nts_contact_person
-- 新增时间：2020-10-15
-- 新增人：罗先波
CREATE TABLE `nts_contact_person` (
      `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
      `user_id` INT(10) DEFAULT NULL COMMENT '用户ID',
      `name` VARCHAR(64) DEFAULT NULL COMMENT '联系人',
      `mobile` VARBINARY(11) DEFAULT NULL COMMENT '电话',
      `email` VARCHAR(32) DEFAULT NULL COMMENT '邮箱',
      `wechat` VARCHAR(32) DEFAULT NULL COMMENT '微信',
      `nick_mame` VARCHAR(64) DEFAULT NULL COMMENT '联系人',
      `code` VARCHAR(32) DEFAULT NULL COMMENT '联系人 code',
      `create_time` DATETIME DEFAULT NULL,
      `create_by` VARCHAR(64) DEFAULT NULL,
      `update_by` VARCHAR(64) DEFAULT NULL,
      `update_time` DATETIME DEFAULT NULL,
      PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

-- coldchain_user库 新增站内消息表nts_notice
-- 新增时间：2020-10-16
-- 新增人：罗先波
CREATE TABLE `nts_notice` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` int(10) DEFAULT NULL COMMENT '接受用户ID',
  `notice_content` varchar(1400) DEFAULT NULL COMMENT '消息内容',
  `notice_title` varchar(255) DEFAULT NULL COMMENT '消息头',
  `notice_type` varchar(64) DEFAULT NULL COMMENT '消息类型',
  `create_time` datetime DEFAULT NULL,
  `create_by` varchar(64) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `update_by` varchar(64) DEFAULT NULL,
  `is_send` varchar(1) DEFAULT 'Y' COMMENT '是否发送',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- coldchain_user库 新增产品版本表nts_product_version
-- 新增时间：2020-10-16
-- 新增人：罗先波
CREATE TABLE `nts_product_version` (
`id` bigint(20) NOT NULL AUTO_INCREMENT,
`product_name` varchar(155) DEFAULT NULL COMMENT '产品名称',
`product_content` varchar(1400) DEFAULT NULL COMMENT '产品内容',
`product_price` decimal(10,2) DEFAULT NULL COMMENT '产品价格',
`original_price` decimal(10,2) DEFAULT NULL COMMENT '产品原价',
`create_time` datetime DEFAULT NULL,
`create_by` varchar(64) DEFAULT NULL,
`update_by` varchar(64) DEFAULT NULL,
`update_time` datetime DEFAULT NULL,
`device_server_num` int(8) DEFAULT NULL COMMENT '设备服务数',
`effective_time` int(8) DEFAULT NULL COMMENT '有效时间',
PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- coldchain_user库 新增用户产品版本表 nts_user_product_order
-- 新增时间：2020-10-16
-- 新增人：罗先波
CREATE TABLE `nts_user_product_order` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `product_id` bigint(20) DEFAULT NULL COMMENT '产品版本ID',
  `user_id` int(10) DEFAULT NULL COMMENT '用户ID',
  `buy_time` datetime DEFAULT NULL COMMENT '购买时间',
  `buy_price` decimal(10,2) DEFAULT NULL COMMENT '购买金额',
  `start_time` date DEFAULT NULL COMMENT '生效时间',
  `expired_time` date DEFAULT NULL COMMENT '过期时间',
  `is_expired` varchar(1) DEFAULT 'N' COMMENT '是否过期',
  `original_price` decimal(10,2) DEFAULT NULL COMMENT '产品原价',
  `create_time` datetime DEFAULT NULL,
  `create_by` varchar(64) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `update_by` varchar(64) DEFAULT NULL,
  `product_order_code` varchar(32) DEFAULT NULL COMMENT '订单code',
  `effective_time` int(8) DEFAULT NULL COMMENT '有效时间',
  `pay_type` varchar(16) DEFAULT NULL COMMENT '支付方式',
  `pay_status` int(1) DEFAULT '0' COMMENT '0:未支付，1已支付，2支付失败，3取消支付',
  `product_order_content` varchar(64) DEFAULT NULL COMMENT '订单内容',
  `device_server_num` int(8) DEFAULT NULL COMMENT '设备服务数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- coldchain_user库 新增交易记录表 nts_transaction_record
-- 新增时间：2020-10-19
-- 新增人：罗先波
CREATE TABLE `nts_transaction_record` (
  `id` bigint(20) DEFAULT NULL,
  `transaction_record_code` varchar(32) DEFAULT NULL COMMENT '交易编码',
  `user_id` int(10) DEFAULT NULL COMMENT '用户ID',
  `create_time` datetime DEFAULT NULL,
  `transaction_time` datetime DEFAULT NULL COMMENT '交易时间',
  `type` varchar(32) DEFAULT NULL COMMENT '交易类型',
  `price` decimal(10,2) DEFAULT NULL COMMENT '金额',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `update_time` datetime DEFAULT NULL,
  `update_by` varchar(32) DEFAULT NULL,
  `status` tinyint(1) DEFAULT '0' COMMENT '0：交易待确认，1：交易确认',
  `table` varchar(64) DEFAULT NULL COMMENT '表',
  `table_id` bigint(20) DEFAULT NULL COMMENT '表ID'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- coldchain_user库 新增用户余额详情表 nts_user_money_detail
-- 新增时间：2020-10-19
-- 新增人：罗先波
CREATE TABLE `nts_user_money_detail` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` int(10) DEFAULT NULL COMMENT '用户ID',
  `create_by` varchar(64) DEFAULT NULL COMMENT '创建人',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '交易时间、创建时间',
  `t_type` varchar(64) DEFAULT NULL COMMENT '交易类型',
  `t_price` decimal(10,2) DEFAULT NULL COMMENT '交易金额',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `update_time` datetime DEFAULT NULL,
  `update_by` varchar(64) DEFAULT NULL,
  `t_user_money_code` varchar(32) DEFAULT NULL COMMENT '交易编号',
  `t_status` tinyint(1) DEFAULT '0' COMMENT '0：充值待支付，1：充值已支付，2：充值取消支付，3：充值支付失败，4：购买待支付，5购买已支付，6购买取消支付，7购买支付失败',
  `buy_time` datetime DEFAULT NULL COMMENT '购买时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- coldchain_user库 删除以前用户地址表 user_address
-- 新增时间：2020-10-19
-- 新增人：罗先波
DROP TABLE user_address;

-- coldchain_user库 新增用户地址表 user_address
-- 新增时间：2020-10-19
-- 新增人：罗先波
CREATE TABLE `user_address` (
  `address_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` mediumint(8) DEFAULT '0',
  `consignee` varchar(60) DEFAULT '' COMMENT '收货人',
  `email` varchar(60) DEFAULT '' COMMENT '邮箱地址',
  `country` varchar(64) DEFAULT '0' COMMENT '国家',
  `province` varchar(64) DEFAULT '0' COMMENT '省份',
  `city` varchar(64) DEFAULT '0' COMMENT '城市',
  `district` varchar(64) DEFAULT '0' COMMENT '地区',
  `twon` varchar(64) DEFAULT '0' COMMENT '乡镇',
  `address` varchar(250) DEFAULT '' COMMENT '地址',
  `zipcode` varchar(60) DEFAULT '' COMMENT '邮政编码',
  `mobile` varchar(60) DEFAULT '' COMMENT '手机',
  `is_default` tinyint(1) DEFAULT '0' COMMENT '默认收货地址',
  `longitude` decimal(10,7) DEFAULT '0.0000000' COMMENT '地址经度',
  `latitude` decimal(10,7) DEFAULT '0.0000000' COMMENT '地址纬度',
  PRIMARY KEY (`address_id`),
  KEY `user_id` (`user_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;




