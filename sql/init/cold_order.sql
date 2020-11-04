/*
SQLyog Ultimate v13.1.1 (64 bit)
MySQL - 5.7.31 : Database - coldchain_order
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`coldchain_order` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `coldchain_order`;

/*Table structure for table `QRTZ_BLOB_TRIGGERS` */

DROP TABLE IF EXISTS `QRTZ_BLOB_TRIGGERS`;

CREATE TABLE `QRTZ_BLOB_TRIGGERS` (
  `sched_name` varchar(120) NOT NULL,
  `trigger_name` varchar(200) NOT NULL,
  `trigger_group` varchar(200) NOT NULL,
  `blob_data` blob,
  PRIMARY KEY (`sched_name`,`trigger_name`,`trigger_group`),
  CONSTRAINT `QRTZ_BLOB_TRIGGERS_ibfk_1` FOREIGN KEY (`sched_name`, `trigger_name`, `trigger_group`) REFERENCES `QRTZ_TRIGGERS` (`sched_name`, `trigger_name`, `trigger_group`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `QRTZ_BLOB_TRIGGERS` */

/*Table structure for table `QRTZ_CALENDARS` */

DROP TABLE IF EXISTS `QRTZ_CALENDARS`;

CREATE TABLE `QRTZ_CALENDARS` (
  `sched_name` varchar(120) NOT NULL,
  `calendar_name` varchar(200) NOT NULL,
  `calendar` blob NOT NULL,
  PRIMARY KEY (`sched_name`,`calendar_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `QRTZ_CALENDARS` */

/*Table structure for table `QRTZ_CRON_TRIGGERS` */

DROP TABLE IF EXISTS `QRTZ_CRON_TRIGGERS`;

CREATE TABLE `QRTZ_CRON_TRIGGERS` (
  `sched_name` varchar(120) NOT NULL,
  `trigger_name` varchar(200) NOT NULL,
  `trigger_group` varchar(200) NOT NULL,
  `cron_expression` varchar(200) NOT NULL,
  `time_zone_id` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`sched_name`,`trigger_name`,`trigger_group`),
  CONSTRAINT `QRTZ_CRON_TRIGGERS_ibfk_1` FOREIGN KEY (`sched_name`, `trigger_name`, `trigger_group`) REFERENCES `QRTZ_TRIGGERS` (`sched_name`, `trigger_name`, `trigger_group`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `QRTZ_CRON_TRIGGERS` */

/*Table structure for table `QRTZ_FIRED_TRIGGERS` */

DROP TABLE IF EXISTS `QRTZ_FIRED_TRIGGERS`;

CREATE TABLE `QRTZ_FIRED_TRIGGERS` (
  `sched_name` varchar(120) NOT NULL,
  `entry_id` varchar(95) NOT NULL,
  `trigger_name` varchar(200) NOT NULL,
  `trigger_group` varchar(200) NOT NULL,
  `instance_name` varchar(200) NOT NULL,
  `fired_time` bigint(13) NOT NULL,
  `sched_time` bigint(13) NOT NULL,
  `priority` int(11) NOT NULL,
  `state` varchar(16) NOT NULL,
  `job_name` varchar(200) DEFAULT NULL,
  `job_group` varchar(200) DEFAULT NULL,
  `is_nonconcurrent` varchar(1) DEFAULT NULL,
  `requests_recovery` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`sched_name`,`entry_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `QRTZ_FIRED_TRIGGERS` */

/*Table structure for table `QRTZ_JOB_DETAILS` */

DROP TABLE IF EXISTS `QRTZ_JOB_DETAILS`;

CREATE TABLE `QRTZ_JOB_DETAILS` (
  `sched_name` varchar(120) NOT NULL,
  `job_name` varchar(200) NOT NULL,
  `job_group` varchar(200) NOT NULL,
  `description` varchar(250) DEFAULT NULL,
  `job_class_name` varchar(250) NOT NULL,
  `is_durable` varchar(1) NOT NULL,
  `is_nonconcurrent` varchar(1) NOT NULL,
  `is_update_data` varchar(1) NOT NULL,
  `requests_recovery` varchar(1) NOT NULL,
  `job_data` blob,
  PRIMARY KEY (`sched_name`,`job_name`,`job_group`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `QRTZ_JOB_DETAILS` */

/*Table structure for table `QRTZ_LOCKS` */

DROP TABLE IF EXISTS `QRTZ_LOCKS`;

CREATE TABLE `QRTZ_LOCKS` (
  `sched_name` varchar(120) NOT NULL,
  `lock_name` varchar(40) NOT NULL,
  PRIMARY KEY (`sched_name`,`lock_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `QRTZ_LOCKS` */

/*Table structure for table `QRTZ_PAUSED_TRIGGER_GRPS` */

DROP TABLE IF EXISTS `QRTZ_PAUSED_TRIGGER_GRPS`;

CREATE TABLE `QRTZ_PAUSED_TRIGGER_GRPS` (
  `sched_name` varchar(120) NOT NULL,
  `trigger_group` varchar(200) NOT NULL,
  PRIMARY KEY (`sched_name`,`trigger_group`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `QRTZ_PAUSED_TRIGGER_GRPS` */

/*Table structure for table `QRTZ_SCHEDULER_STATE` */

DROP TABLE IF EXISTS `QRTZ_SCHEDULER_STATE`;

CREATE TABLE `QRTZ_SCHEDULER_STATE` (
  `sched_name` varchar(120) NOT NULL,
  `instance_name` varchar(200) NOT NULL,
  `last_checkin_time` bigint(13) NOT NULL,
  `checkin_interval` bigint(13) NOT NULL,
  PRIMARY KEY (`sched_name`,`instance_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `QRTZ_SCHEDULER_STATE` */

/*Table structure for table `QRTZ_SIMPLE_TRIGGERS` */

DROP TABLE IF EXISTS `QRTZ_SIMPLE_TRIGGERS`;

CREATE TABLE `QRTZ_SIMPLE_TRIGGERS` (
  `sched_name` varchar(120) NOT NULL,
  `trigger_name` varchar(200) NOT NULL,
  `trigger_group` varchar(200) NOT NULL,
  `repeat_count` bigint(7) NOT NULL,
  `repeat_interval` bigint(12) NOT NULL,
  `times_triggered` bigint(10) NOT NULL,
  PRIMARY KEY (`sched_name`,`trigger_name`,`trigger_group`),
  CONSTRAINT `QRTZ_SIMPLE_TRIGGERS_ibfk_1` FOREIGN KEY (`sched_name`, `trigger_name`, `trigger_group`) REFERENCES `QRTZ_TRIGGERS` (`sched_name`, `trigger_name`, `trigger_group`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `QRTZ_SIMPLE_TRIGGERS` */

/*Table structure for table `QRTZ_SIMPROP_TRIGGERS` */

DROP TABLE IF EXISTS `QRTZ_SIMPROP_TRIGGERS`;

CREATE TABLE `QRTZ_SIMPROP_TRIGGERS` (
  `sched_name` varchar(120) NOT NULL,
  `trigger_name` varchar(200) NOT NULL,
  `trigger_group` varchar(200) NOT NULL,
  `str_prop_1` varchar(512) DEFAULT NULL,
  `str_prop_2` varchar(512) DEFAULT NULL,
  `str_prop_3` varchar(512) DEFAULT NULL,
  `int_prop_1` int(11) DEFAULT NULL,
  `int_prop_2` int(11) DEFAULT NULL,
  `long_prop_1` bigint(20) DEFAULT NULL,
  `long_prop_2` bigint(20) DEFAULT NULL,
  `dec_prop_1` decimal(13,4) DEFAULT NULL,
  `dec_prop_2` decimal(13,4) DEFAULT NULL,
  `bool_prop_1` varchar(1) DEFAULT NULL,
  `bool_prop_2` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`sched_name`,`trigger_name`,`trigger_group`),
  CONSTRAINT `QRTZ_SIMPROP_TRIGGERS_ibfk_1` FOREIGN KEY (`sched_name`, `trigger_name`, `trigger_group`) REFERENCES `QRTZ_TRIGGERS` (`sched_name`, `trigger_name`, `trigger_group`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `QRTZ_SIMPROP_TRIGGERS` */

/*Table structure for table `QRTZ_TRIGGERS` */

DROP TABLE IF EXISTS `QRTZ_TRIGGERS`;

CREATE TABLE `QRTZ_TRIGGERS` (
  `sched_name` varchar(120) NOT NULL,
  `trigger_name` varchar(200) NOT NULL,
  `trigger_group` varchar(200) NOT NULL,
  `job_name` varchar(200) NOT NULL,
  `job_group` varchar(200) NOT NULL,
  `description` varchar(250) DEFAULT NULL,
  `next_fire_time` bigint(13) DEFAULT NULL,
  `prev_fire_time` bigint(13) DEFAULT NULL,
  `priority` int(11) DEFAULT NULL,
  `trigger_state` varchar(16) NOT NULL,
  `trigger_type` varchar(8) NOT NULL,
  `start_time` bigint(13) NOT NULL,
  `end_time` bigint(13) DEFAULT NULL,
  `calendar_name` varchar(200) DEFAULT NULL,
  `misfire_instr` smallint(2) DEFAULT NULL,
  `job_data` blob,
  PRIMARY KEY (`sched_name`,`trigger_name`,`trigger_group`),
  KEY `sched_name` (`sched_name`,`job_name`,`job_group`) USING BTREE,
  CONSTRAINT `QRTZ_TRIGGERS_ibfk_1` FOREIGN KEY (`sched_name`, `job_name`, `job_group`) REFERENCES `QRTZ_JOB_DETAILS` (`sched_name`, `job_name`, `job_group`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `QRTZ_TRIGGERS` */

/*Table structure for table `gen_table` */

DROP TABLE IF EXISTS `gen_table`;

CREATE TABLE `gen_table` (
  `table_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `table_name` varchar(200) DEFAULT '' COMMENT '表名称',
  `table_comment` varchar(500) DEFAULT '' COMMENT '表描述',
  `class_name` varchar(100) DEFAULT '' COMMENT '实体类名称',
  `tpl_category` varchar(200) DEFAULT 'crud' COMMENT '使用的模板（crud单表操作 tree树表操作）',
  `package_name` varchar(100) DEFAULT NULL COMMENT '生成包路径',
  `module_name` varchar(30) DEFAULT NULL COMMENT '生成模块名',
  `business_name` varchar(30) DEFAULT NULL COMMENT '生成业务名',
  `function_name` varchar(50) DEFAULT NULL COMMENT '生成功能名',
  `function_author` varchar(50) DEFAULT NULL COMMENT '生成功能作者',
  `options` varchar(1000) DEFAULT NULL COMMENT '其它生成选项',
  `create_by` varchar(64) DEFAULT '' COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) DEFAULT '' COMMENT '更新者',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`table_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='代码生成业务表';

/*Data for the table `gen_table` */

/*Table structure for table `gen_table_column` */

DROP TABLE IF EXISTS `gen_table_column`;

CREATE TABLE `gen_table_column` (
  `column_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `table_id` varchar(64) DEFAULT NULL COMMENT '归属表编号',
  `column_name` varchar(200) DEFAULT NULL COMMENT '列名称',
  `column_comment` varchar(500) DEFAULT NULL COMMENT '列描述',
  `column_type` varchar(100) DEFAULT NULL COMMENT '列类型',
  `java_type` varchar(500) DEFAULT NULL COMMENT 'JAVA类型',
  `java_field` varchar(200) DEFAULT NULL COMMENT 'JAVA字段名',
  `is_pk` char(1) DEFAULT NULL COMMENT '是否主键（1是）',
  `is_increment` char(1) DEFAULT NULL COMMENT '是否自增（1是）',
  `is_required` char(1) DEFAULT NULL COMMENT '是否必填（1是）',
  `is_insert` char(1) DEFAULT NULL COMMENT '是否为插入字段（1是）',
  `is_edit` char(1) DEFAULT NULL COMMENT '是否编辑字段（1是）',
  `is_list` char(1) DEFAULT NULL COMMENT '是否列表字段（1是）',
  `is_query` char(1) DEFAULT NULL COMMENT '是否查询字段（1是）',
  `query_type` varchar(200) DEFAULT 'EQ' COMMENT '查询方式（等于、不等于、大于、小于、范围）',
  `html_type` varchar(200) DEFAULT NULL COMMENT '显示类型（文本框、文本域、下拉框、复选框、单选框、日期控件）',
  `dict_type` varchar(200) DEFAULT '' COMMENT '字典类型',
  `sort` int(11) DEFAULT NULL COMMENT '排序',
  `create_by` varchar(64) DEFAULT '' COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) DEFAULT '' COMMENT '更新者',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`column_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='代码生成业务表字段';

/*Data for the table `gen_table_column` */

/*Table structure for table `nts_card_info` */

DROP TABLE IF EXISTS `nts_card_info`;

CREATE TABLE `nts_card_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `msisdn` varchar(32) DEFAULT NULL,
  `icc_id` varchar(32) DEFAULT NULL,
  `imsi` varchar(32) DEFAULT NULL,
  `carrier` varchar(32) DEFAULT NULL COMMENT '运营商',
  `sp_code` varchar(32) DEFAULT NULL COMMENT '短信端口号',
  `data_plan` varchar(32) DEFAULT NULL COMMENT '套餐大小',
  `expiry_date` date DEFAULT NULL COMMENT '计费结束日期',
  `data_usage` varchar(32) DEFAULT NULL COMMENT '当月流量',
  `account_status` varchar(32) DEFAULT NULL COMMENT '卡状态',
  `active` tinyint(1) DEFAULT '0' COMMENT '激活/未激活  0:否  1:是',
  `test_valid_date` date DEFAULT NULL COMMENT '测试期起始日期',
  `silent_valid_date` date DEFAULT NULL COMMENT '沉默期起始日期',
  `outbound_date` date DEFAULT NULL COMMENT '出库日期',
  `active_date` date DEFAULT NULL COMMENT '激活日期',
  `support_sms` tinyint(1) DEFAULT NULL COMMENT '是否支持短信  0:否  1:是',
  `data_balance` varchar(32) DEFAULT NULL COMMENT '剩余流量',
  `test_used_data_usage` varchar(32) DEFAULT NULL COMMENT '测试期已用流量',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `remark` varchar(256) DEFAULT NULL COMMENT '备注',
  `device_id` int(11) DEFAULT NULL COMMENT '设备id',
  `company_id` int(10) DEFAULT NULL COMMENT '企业ID',
  `user_id` int(10) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='物联卡信息表';

/*Data for the table `nts_card_info` */

/*Table structure for table `nts_card_usaged_detail` */

DROP TABLE IF EXISTS `nts_card_usaged_detail`;

CREATE TABLE `nts_card_usaged_detail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `card_id` int(11) DEFAULT NULL COMMENT '物联卡id',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `date` date DEFAULT NULL COMMENT '记录时间',
  `data_usage` varchar(32) DEFAULT NULL COMMENT '使用的数据量',
  `remark` varchar(256) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='物联卡流量使用使用详情';

/*Data for the table `nts_card_usaged_detail` */

/*Table structure for table `nts_card_usaged_log` */

DROP TABLE IF EXISTS `nts_card_usaged_log`;

CREATE TABLE `nts_card_usaged_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `card_id` int(11) DEFAULT NULL COMMENT '物联卡id',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `date` date DEFAULT NULL COMMENT '记录时间',
  `data_usage` varchar(32) DEFAULT NULL COMMENT '当前累计使用的数据量',
  `remark` varchar(256) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='物联网卡使用日志';

/*Data for the table `nts_card_usaged_log` */

/*Table structure for table `nts_company` */

DROP TABLE IF EXISTS `nts_company`;

CREATE TABLE `nts_company` (
  `company_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(200) COLLATE utf8mb4_bin DEFAULT '' COMMENT '企业名称',
  `alias` varchar(100) COLLATE utf8mb4_bin DEFAULT '' COMMENT '企业别名',
  `address` varchar(500) COLLATE utf8mb4_bin DEFAULT '' COMMENT '企业地址',
  `industry_id` int(5) DEFAULT NULL COMMENT '行业ID',
  `company_member_id` int(5) DEFAULT NULL COMMENT '企业会员ID',
  `company_scale_id` int(5) DEFAULT NULL COMMENT '企业规模ID',
  `lic_code` varchar(100) COLLATE utf8mb4_bin DEFAULT '' COMMENT '信用代码|注册号',
  `lic_name` varchar(200) COLLATE utf8mb4_bin DEFAULT '' COMMENT '营业执照企业名称',
  `lic_address` varchar(500) COLLATE utf8mb4_bin DEFAULT '' COMMENT '营业执照企业地址',
  `legal_person` varchar(100) COLLATE utf8mb4_bin DEFAULT '' COMMENT '企业法人',
  `license` varchar(500) COLLATE utf8mb4_bin DEFAULT '' COMMENT '营业执照Url',
  `web_url` varchar(500) COLLATE utf8mb4_bin DEFAULT '' COMMENT '企业网站Url',
  `email` varchar(100) COLLATE utf8mb4_bin DEFAULT '' COMMENT '企业邮箱',
  `telephone` varchar(100) COLLATE utf8mb4_bin DEFAULT '' COMMENT '座机电话',
  `audit_status` tinyint(1) DEFAULT '0' COMMENT '审核状态：0-未审核 1-审核成功 2-审核失败',
  `delete_flag` tinyint(1) DEFAULT '1' COMMENT '删除标志 1-正常状态 2-已删除',
  `audit_desc` varchar(500) COLLATE utf8mb4_bin DEFAULT '' COMMENT '审核说明',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`company_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='企业表';

/*Data for the table `nts_company` */

/*Table structure for table `nts_company_flow_pool` */

DROP TABLE IF EXISTS `nts_company_flow_pool`;

CREATE TABLE `nts_company_flow_pool` (
  `company_flow_pool_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `company_id` bigint(20) DEFAULT NULL COMMENT '企业ID',
  `surplus_flow` double(20,4) DEFAULT NULL COMMENT '剩余流量',
  `used_flow` double(20,4) DEFAULT NULL COMMENT '已用流量',
  `delete_flag` tinyint(1) DEFAULT '1' COMMENT '删除标志 1-正常状态 2-已删除',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`company_flow_pool_id`),
  UNIQUE KEY `company_id` (`company_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='企业流量池表';

/*Data for the table `nts_company_flow_pool` */

/*Table structure for table `nts_device` */

DROP TABLE IF EXISTS `nts_device`;

CREATE TABLE `nts_device` (
  `device_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `company_id` bigint(20) DEFAULT NULL COMMENT '企业ID',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户ID',
  `device_name` varchar(100) COLLATE utf8mb4_bin DEFAULT '' COMMENT '设备名称',
  `device_type_id` int(5) DEFAULT NULL COMMENT '设备类型ID',
  `device_desc` varchar(500) COLLATE utf8mb4_bin DEFAULT '' COMMENT '设备描述',
  `device_vendor_id` int(5) DEFAULT NULL COMMENT '设备制造商ID',
  `activate` tinyint(1) DEFAULT '0' COMMENT '激活状态：0-未激活 1-已激活',
  `activate_time` datetime DEFAULT NULL COMMENT '激活时间',
  `device_state` tinyint(1) DEFAULT '0' COMMENT '设备状态：0-离线 1-在线 2-故障 3-欠费',
  `device_sn` varchar(100) COLLATE utf8mb4_bin DEFAULT '' COMMENT '设备SN',
  `delete_flag` tinyint(1) DEFAULT '1' COMMENT '删除标志 1-正常状态 2-已删除',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `card_icc_id` varchar(32) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '物联卡iccid',
  PRIMARY KEY (`device_id`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='设备表';

/*Data for the table `nts_device` */

/*Table structure for table `nts_device_data_report` */

DROP TABLE IF EXISTS `nts_device_data_report`;

CREATE TABLE `nts_device_data_report` (
  `device_data_report_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `account` varchar(100) COLLATE utf8mb4_bin DEFAULT '' COMMENT '账号',
  `organization` varchar(100) COLLATE utf8mb4_bin DEFAULT '' COMMENT '组织',
  `time_zone` varchar(100) COLLATE utf8mb4_bin DEFAULT '' COMMENT '时区',
  `device_sn` varchar(100) COLLATE utf8mb4_bin DEFAULT '' COMMENT '设备SN',
  `device_event` varchar(100) COLLATE utf8mb4_bin DEFAULT '' COMMENT '设备事件',
  `device_time` datetime DEFAULT NULL COMMENT '设备时间',
  `device_time_local` datetime DEFAULT NULL COMMENT '设备本地时间',
  `device_type` varchar(64) COLLATE utf8mb4_bin DEFAULT '' COMMENT '设备类型',
  `device_speed` varchar(40) COLLATE utf8mb4_bin DEFAULT '' COMMENT '设备速度',
  `gps_address` varchar(200) COLLATE utf8mb4_bin DEFAULT '' COMMENT 'GPS地址',
  `gps_mode` varchar(100) COLLATE utf8mb4_bin DEFAULT '' COMMENT 'GPS模式',
  `latitude` varchar(64) COLLATE utf8mb4_bin DEFAULT '' COMMENT 'GPS维度',
  `longitude` varchar(64) COLLATE utf8mb4_bin DEFAULT '' COMMENT 'GPS经度',
  `satellites_used` varchar(40) COLLATE utf8mb4_bin DEFAULT '' COMMENT '是否使用卫星',
  `temperature` varchar(40) COLLATE utf8mb4_bin DEFAULT '' COMMENT '温度',
  `battery_voltage` varchar(40) COLLATE utf8mb4_bin DEFAULT '' COMMENT '电池电压',
  `firmware_version` varchar(100) COLLATE utf8mb4_bin DEFAULT '' COMMENT '固件版本',
  `read_id` varchar(60) COLLATE utf8mb4_bin DEFAULT '' COMMENT '读取ID',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`device_data_report_id`),
  UNIQUE KEY `read_id` (`read_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4011 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='设备数据上报表';

/*Data for the table `nts_device_data_report` */

/*Table structure for table `nts_device_details` */

DROP TABLE IF EXISTS `nts_device_details`;

CREATE TABLE `nts_device_details` (
  `device_details_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `device_id` bigint(20) DEFAULT NULL COMMENT '设备ID',
  `company_id` bigint(20) DEFAULT NULL COMMENT '企业ID',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户ID',
  `device_sn` varchar(100) COLLATE utf8mb4_bin DEFAULT '' COMMENT '设备SN',
  `carrier_id` int(5) DEFAULT NULL COMMENT '服务商ID',
  `account` varchar(100) COLLATE utf8mb4_bin DEFAULT '' COMMENT '账号ID',
  `subaccount` varchar(100) COLLATE utf8mb4_bin DEFAULT '' COMMENT '子账号ID',
  `price_plan` varchar(100) COLLATE utf8mb4_bin DEFAULT '' COMMENT '价格计划',
  `gateway_account` varchar(100) COLLATE utf8mb4_bin DEFAULT '' COMMENT '网关账号',
  `satellite_module` tinyint(1) DEFAULT '0' COMMENT '卫星模块：1-OGI 2-OG2',
  `satellite_sn` varchar(100) COLLATE utf8mb4_bin DEFAULT '' COMMENT '卫星模块SN',
  `sim_operator` int(2) DEFAULT NULL COMMENT 'SIM运营商：1-中国电信 2-中国移动 3-中国联通',
  `sim_sn` varchar(100) COLLATE utf8mb4_bin DEFAULT '' COMMENT 'SIM唯一SN',
  `delete_flag` tinyint(1) DEFAULT '1' COMMENT '删除标志 1-正常状态 2-已删除',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`device_details_id`),
  UNIQUE KEY `device_id` (`device_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=73 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='设备详情表';

/*Data for the table `nts_device_details` */

/*Table structure for table `nts_device_flow_agg` */

DROP TABLE IF EXISTS `nts_device_flow_agg`;

CREATE TABLE `nts_device_flow_agg` (
  `device_flow_agg_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `subscriber_id` varchar(100) DEFAULT '' COMMENT '设备ID',
  `carrier` varchar(100) DEFAULT '' COMMENT '服务商',
  `account` varchar(100) DEFAULT '' COMMENT '账号ID',
  `subaccount` varchar(100) DEFAULT '' COMMENT '子账号ID',
  `price_plan` varchar(100) DEFAULT '' COMMENT '价格计划',
  `sms_mo` int(11) DEFAULT NULL COMMENT 'sms发送数据流量',
  `sms_mt` int(11) DEFAULT NULL COMMENT 'sms接受数据流量',
  `data_mo` int(11) DEFAULT NULL COMMENT 'data发送数据流量',
  `data_mt` int(11) DEFAULT NULL COMMENT 'data接受数据流量',
  `data_both` int(11) DEFAULT NULL COMMENT 'data发送和接受数据流量',
  `voice_mo` int(11) DEFAULT NULL COMMENT 'voice发送数据流量',
  `voice_mt` int(11) DEFAULT NULL COMMENT 'voice接受数据流量',
  `orbcomm_reports` int(11) DEFAULT NULL COMMENT 'orbcomm报告数据流量',
  `orbcomm_messages` int(11) DEFAULT NULL COMMENT 'orbcomm消息数据流量',
  `orbcomm_bytes` int(11) DEFAULT NULL COMMENT 'orbcomm数据流量',
  `statistics_time` datetime DEFAULT NULL COMMENT '统计时间',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`device_flow_agg_id`),
  KEY `indexsubscriber_id` (`subscriber_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=638 DEFAULT CHARSET=utf8 COMMENT='设备流量日志统计表';

/*Data for the table `nts_device_flow_agg` */

/*Table structure for table `nts_device_flow_details` */

DROP TABLE IF EXISTS `nts_device_flow_details`;

CREATE TABLE `nts_device_flow_details` (
  `device_flow_details_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `sort_id` varchar(64) DEFAULT '' COMMENT '排序ID',
  `subscriber_id` varchar(100) DEFAULT '' COMMENT '设备ID',
  `carrier` varchar(100) DEFAULT '' COMMENT '运营商',
  `account` varchar(100) DEFAULT '' COMMENT '账号ID',
  `subaccount` varchar(100) DEFAULT '' COMMENT '子账号ID',
  `price_plan` varchar(100) DEFAULT '' COMMENT '价格计划',
  `sms_mo` int(11) DEFAULT NULL COMMENT 'sms发送数据流量',
  `sms_mt` int(11) DEFAULT NULL COMMENT 'sms接受数据流量',
  `data_mo` int(11) DEFAULT NULL COMMENT 'data发送数据流量',
  `data_mt` int(11) DEFAULT NULL COMMENT 'data接受数据流量',
  `data_both` int(11) DEFAULT NULL COMMENT 'data发送和接受数据流量',
  `voice_mo` int(11) DEFAULT NULL COMMENT 'voice发送数据流量',
  `voice_mt` int(11) DEFAULT NULL COMMENT 'voice接受数据流量',
  `orbcomm_reports` int(11) DEFAULT NULL COMMENT 'orbcomm报告数据流量',
  `orbcomm_messages` int(11) DEFAULT NULL COMMENT 'orbcomm消息数据流量',
  `orbcomm_bytes` int(11) DEFAULT NULL COMMENT 'orbcomm数据流量',
  `usage_time` datetime DEFAULT NULL COMMENT '使用时间',
  `import_time` datetime DEFAULT NULL COMMENT '导入时间',
  `statistics_time` datetime DEFAULT NULL COMMENT '统计时间',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`device_flow_details_id`)
) ENGINE=InnoDB AUTO_INCREMENT=53411 DEFAULT CHARSET=utf8 COMMENT='设备流量日志统计表';

/*Data for the table `nts_device_flow_details` */

/*Table structure for table `nts_device_flow_pool` */

DROP TABLE IF EXISTS `nts_device_flow_pool`;

CREATE TABLE `nts_device_flow_pool` (
  `flow_pool_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `device_id` bigint(20) DEFAULT NULL COMMENT '设备ID',
  `device_sn` varchar(100) COLLATE utf8mb4_bin DEFAULT '' COMMENT '设备SN',
  `surplus_flow` double(20,4) DEFAULT NULL COMMENT '剩余流量',
  `used_flow` double(20,4) DEFAULT NULL COMMENT '已用流量',
  `delete_flag` tinyint(1) DEFAULT '1' COMMENT '删除标志 1-正常状态 2-已删除',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`flow_pool_id`),
  UNIQUE KEY `device_id` (`device_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=73 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='设备流量池表';

/*Data for the table `nts_device_flow_pool` */

/*Table structure for table `nts_dict_account_type` */

DROP TABLE IF EXISTS `nts_dict_account_type`;

CREATE TABLE `nts_dict_account_type` (
  `account_type_id` int(5) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(100) COLLATE utf8mb4_bin DEFAULT '' COMMENT '账号类别名称',
  `descr` varchar(500) COLLATE utf8mb4_bin DEFAULT '' COMMENT '账号类别描述',
  `delete_flag` tinyint(1) DEFAULT '1' COMMENT '删除标志 1-正常状态 2-已删除',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`account_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='字典-账号类别表';

/*Data for the table `nts_dict_account_type` */

/*Table structure for table `nts_dict_business_type` */

DROP TABLE IF EXISTS `nts_dict_business_type`;

CREATE TABLE `nts_dict_business_type` (
  `business_type_id` int(5) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(100) COLLATE utf8mb4_bin DEFAULT '' COMMENT '业务类别名称',
  `descr` varchar(500) COLLATE utf8mb4_bin DEFAULT '' COMMENT '业务类别描述',
  `delete_flag` tinyint(1) DEFAULT '1' COMMENT '删除标志 1-正常状态 2-已删除',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`business_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='字典-业务类别表';

/*Data for the table `nts_dict_business_type` */

/*Table structure for table `nts_dict_carrier` */

DROP TABLE IF EXISTS `nts_dict_carrier`;

CREATE TABLE `nts_dict_carrier` (
  `carrier_id` int(5) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(100) COLLATE utf8mb4_bin DEFAULT '' COMMENT '服务商名称',
  `descr` varchar(500) COLLATE utf8mb4_bin DEFAULT '' COMMENT '服务商描述',
  `delete_flag` tinyint(1) DEFAULT '1' COMMENT '删除标志 1-正常状态 2-已删除',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`carrier_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='字典-服务商表';

/*Data for the table `nts_dict_carrier` */

/*Table structure for table `nts_dict_company_member` */

DROP TABLE IF EXISTS `nts_dict_company_member`;

CREATE TABLE `nts_dict_company_member` (
  `company_member_id` int(5) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(100) COLLATE utf8mb4_bin DEFAULT '' COMMENT '企业会员名称',
  `descr` varchar(500) COLLATE utf8mb4_bin DEFAULT '' COMMENT '企业会员描述',
  `delete_flag` tinyint(1) DEFAULT '1' COMMENT '删除标志 1-正常状态 2-已删除',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`company_member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='字典-企业会员表';

/*Data for the table `nts_dict_company_member` */

/*Table structure for table `nts_dict_company_scale` */

DROP TABLE IF EXISTS `nts_dict_company_scale`;

CREATE TABLE `nts_dict_company_scale` (
  `company_scale_id` int(5) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(100) COLLATE utf8mb4_bin DEFAULT '' COMMENT '企业规模名称',
  `descr` varchar(500) COLLATE utf8mb4_bin DEFAULT '' COMMENT '企业规模描述',
  `delete_flag` tinyint(1) DEFAULT '1' COMMENT '删除标志 1-正常状态 2-已删除',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`company_scale_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='字典-企业规模表';

/*Data for the table `nts_dict_company_scale` */

/*Table structure for table `nts_dict_currency_type` */

DROP TABLE IF EXISTS `nts_dict_currency_type`;

CREATE TABLE `nts_dict_currency_type` (
  `currency_type_id` int(5) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(100) COLLATE utf8mb4_bin DEFAULT '' COMMENT '货币币种名称',
  `descr` varchar(500) COLLATE utf8mb4_bin DEFAULT '' COMMENT '货币币种描述',
  `delete_flag` tinyint(1) DEFAULT '1' COMMENT '删除标志 1-正常状态 2-已删除',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`currency_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='字典-货币类别表';

/*Data for the table `nts_dict_currency_type` */

/*Table structure for table `nts_dict_data_type` */

DROP TABLE IF EXISTS `nts_dict_data_type`;

CREATE TABLE `nts_dict_data_type` (
  `data_type_id` int(5) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(100) COLLATE utf8mb4_bin DEFAULT '' COMMENT '数据类别名称',
  `descr` varchar(500) COLLATE utf8mb4_bin DEFAULT '' COMMENT '数据类别描述',
  `delete_flag` tinyint(1) DEFAULT '1' COMMENT '删除标志 1-正常状态 2-已删除',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`data_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='字典-数据类别表';

/*Data for the table `nts_dict_data_type` */

/*Table structure for table `nts_dict_device_type` */

DROP TABLE IF EXISTS `nts_dict_device_type`;

CREATE TABLE `nts_dict_device_type` (
  `device_type_id` int(5) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(100) COLLATE utf8mb4_bin DEFAULT '' COMMENT '设备类别名称',
  `descr` varchar(500) COLLATE utf8mb4_bin DEFAULT '' COMMENT '设备类别描述',
  `delete_flag` tinyint(1) DEFAULT '1' COMMENT '删除标志 1-正常状态 2-已删除',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`device_type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='字典-设备类别表';

/*Data for the table `nts_dict_device_type` */

/*Table structure for table `nts_dict_device_vendor` */

DROP TABLE IF EXISTS `nts_dict_device_vendor`;

CREATE TABLE `nts_dict_device_vendor` (
  `device_vendor_id` int(5) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(100) COLLATE utf8mb4_bin DEFAULT '' COMMENT '设备制造商名称',
  `descr` varchar(500) COLLATE utf8mb4_bin DEFAULT '' COMMENT '设备制造商描述',
  `delete_flag` tinyint(1) DEFAULT '1' COMMENT '删除标志 1-正常状态 2-已删除',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`device_vendor_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='字典-设备制造商表';

/*Data for the table `nts_dict_device_vendor` */

/*Table structure for table `nts_dict_flow_valuation_ratio` */

DROP TABLE IF EXISTS `nts_dict_flow_valuation_ratio`;

CREATE TABLE `nts_dict_flow_valuation_ratio` (
  `flow_valuation_ratio_id` int(5) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(100) COLLATE utf8mb4_bin DEFAULT '' COMMENT '流量计价比率名称',
  `descr` varchar(500) COLLATE utf8mb4_bin DEFAULT '' COMMENT '流量计价比率描述',
  `price` decimal(20,8) DEFAULT NULL COMMENT '价格',
  `delete_flag` tinyint(1) DEFAULT '1' COMMENT '删除标志 1-正常状态 2-已删除',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`flow_valuation_ratio_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='字典-流量计价比率表';

/*Data for the table `nts_dict_flow_valuation_ratio` */

/*Table structure for table `nts_dict_industry` */

DROP TABLE IF EXISTS `nts_dict_industry`;

CREATE TABLE `nts_dict_industry` (
  `industry_id` int(5) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(100) COLLATE utf8mb4_bin DEFAULT '' COMMENT '行业名称',
  `descr` varchar(500) COLLATE utf8mb4_bin DEFAULT '' COMMENT '行业描述',
  `delete_flag` tinyint(1) DEFAULT '1' COMMENT '删除标志 1-正常状态 2-已删除',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`industry_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='字典-行业表';

/*Data for the table `nts_dict_industry` */

/*Table structure for table `nts_dict_pay_model` */

DROP TABLE IF EXISTS `nts_dict_pay_model`;

CREATE TABLE `nts_dict_pay_model` (
  `pay_model_id` int(5) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(100) COLLATE utf8mb4_bin DEFAULT '' COMMENT '支付名称',
  `image` varchar(200) COLLATE utf8mb4_bin DEFAULT '' COMMENT '支付图标',
  `descr` varchar(500) COLLATE utf8mb4_bin DEFAULT '' COMMENT '支付描述',
  `delete_flag` tinyint(1) DEFAULT '1' COMMENT '删除标志 1-正常状态 2-已删除',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`pay_model_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='字典-支付方式表';

/*Data for the table `nts_dict_pay_model` */

/*Table structure for table `nts_dict_valuation_type` */

DROP TABLE IF EXISTS `nts_dict_valuation_type`;

CREATE TABLE `nts_dict_valuation_type` (
  `valuation_type_id` int(5) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(100) COLLATE utf8mb4_bin DEFAULT '' COMMENT '计价模式名称',
  `descr` varchar(500) COLLATE utf8mb4_bin DEFAULT '' COMMENT '计价模式描述',
  `months` int(4) DEFAULT '1' COMMENT '默认收费：1月/1次',
  `delete_flag` tinyint(1) DEFAULT '1' COMMENT '删除标志 1-正常状态 2-已删除',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`valuation_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='字典-计价模式表';

/*Data for the table `nts_dict_valuation_type` */

/*Table structure for table `nts_flow_plans` */

DROP TABLE IF EXISTS `nts_flow_plans`;

CREATE TABLE `nts_flow_plans` (
  `flow_plans_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `plans_name` varchar(100) COLLATE utf8mb4_bin DEFAULT '' COMMENT '套餐名称',
  `plans_type` tinyint(1) DEFAULT '0' COMMENT '套餐类型 0-自定义流量 1-流量阶梯 2-按月缴费',
  `plans_desc` varchar(100) COLLATE utf8mb4_bin DEFAULT '' COMMENT '套餐描述',
  `unit_price` decimal(20,8) DEFAULT NULL COMMENT '流量单价 ?/kb',
  `total_price` decimal(20,8) DEFAULT NULL COMMENT '流量总价',
  `flow_number` double(11,4) DEFAULT '0.0000' COMMENT '流量数量 ：kb',
  `months` int(4) DEFAULT '0' COMMENT '月收费：1月，3月，6月',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`flow_plans_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='流量价格套餐表';

/*Data for the table `nts_flow_plans` */

/*Table structure for table `nts_notice` */

DROP TABLE IF EXISTS `nts_notice`;

CREATE TABLE `nts_notice` (
  `notice_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `title` varchar(200) DEFAULT '' COMMENT '通告标题',
  `content` varchar(500) DEFAULT '' COMMENT '通告内容',
  `release_time` datetime DEFAULT NULL COMMENT '发布时间',
  `is_undo` tinyint(1) DEFAULT '0' COMMENT '是否撤销 0-默认 1-撤销',
  `undo_time` datetime DEFAULT NULL COMMENT '撤销时间',
  `is_del` tinyint(1) DEFAULT '0' COMMENT '是否删除 0-默认 1-删除',
  `del_time` datetime DEFAULT NULL COMMENT '删除时间',
  `priority` tinyint(1) DEFAULT '0' COMMENT '优先级 0-默认 1-紧急 2-高 3-普通',
  `notice_obj_type` tinyint(1) DEFAULT '0' COMMENT '通告对象类型 0-默认 1-单个用户 2-多个用户 3-全部用户 4-用户类型',
  `account_type` int(5) DEFAULT NULL COMMENT '用户类型',
  PRIMARY KEY (`notice_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8 COMMENT='通告表';

/*Data for the table `nts_notice` */

/*Table structure for table `nts_notice_user_tag` */

DROP TABLE IF EXISTS `nts_notice_user_tag`;

CREATE TABLE `nts_notice_user_tag` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `notice_id` bigint(20) DEFAULT NULL COMMENT '通告编号',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户编号',
  `is_read` tinyint(1) DEFAULT '0' COMMENT '是否阅读 0-未阅读 1-已阅读',
  `read_time` datetime DEFAULT NULL COMMENT '阅读时间',
  `account_type` int(5) DEFAULT NULL COMMENT '用户类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8 COMMENT='通告用户标记表';

/*Data for the table `nts_notice_user_tag` */

/*Table structure for table `nts_order_company_flow` */

DROP TABLE IF EXISTS `nts_order_company_flow`;

CREATE TABLE `nts_order_company_flow` (
  `order_company_flow_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `company_id` bigint(20) DEFAULT NULL COMMENT '企业ID',
  `create_user_id` bigint(20) DEFAULT NULL COMMENT '创建者ID',
  `update_user_id` bigint(20) DEFAULT NULL COMMENT '更新者ID',
  `order_code` varchar(64) DEFAULT '' COMMENT '订单编号',
  `order_status` tinyint(1) DEFAULT '0' COMMENT '订单状态 0-待付款 1-处理中 2-已完成 3-取消 4-售后',
  `flow_price` decimal(20,8) DEFAULT NULL COMMENT '流量总价',
  `order_price` decimal(20,8) DEFAULT NULL COMMENT '订单总价',
  `actual_price` decimal(20,8) DEFAULT NULL COMMENT '实际需要支付的金额',
  `currency_type_id` int(5) DEFAULT NULL COMMENT '货币类别ID',
  `pay_model_id` int(5) DEFAULT NULL COMMENT '支付方式ID',
  `pay_name` varchar(100) DEFAULT '' COMMENT '支付名称',
  `pay_code` varchar(100) DEFAULT '' COMMENT '支付流水号',
  `pay_status` tinyint(1) DEFAULT '0' COMMENT '支付状态 0-初始化 1-付款中,2-支付成功',
  `payer` varchar(120) DEFAULT '' COMMENT '支付人',
  `pay_callback` tinyint(1) DEFAULT '0' COMMENT '支付回调状态 0-初始化 1-成功,-1-失败',
  `pay_time` datetime DEFAULT NULL COMMENT '支付时间',
  `remark` varchar(500) DEFAULT '' COMMENT '备注',
  `delete_flag` tinyint(1) DEFAULT '1' COMMENT '删除标志 1-正常状态 2-已删除',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`order_company_flow_id`),
  KEY `_order_company_flow_company` (`company_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8 COMMENT='企业流量订单表';

/*Data for the table `nts_order_company_flow` */

/*Table structure for table `nts_order_device_flow` */

DROP TABLE IF EXISTS `nts_order_device_flow`;

CREATE TABLE `nts_order_device_flow` (
  `order_device_flow_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `company_id` bigint(20) DEFAULT NULL COMMENT '企业ID',
  `device_id` bigint(20) DEFAULT NULL COMMENT '设备ID',
  `create_user_id` bigint(20) DEFAULT NULL COMMENT '创建者ID',
  `update_user_id` bigint(20) DEFAULT NULL COMMENT '更新者ID',
  `order_code` varchar(64) DEFAULT '' COMMENT '订单编号',
  `order_status` tinyint(1) DEFAULT '0' COMMENT '订单状态 0-待付款 1-处理中 2-已完成 3-取消 4-售后',
  `flow_price` decimal(20,8) DEFAULT NULL COMMENT '流量总价',
  `order_price` decimal(20,8) DEFAULT NULL COMMENT '订单总价',
  `actual_price` decimal(20,8) DEFAULT NULL COMMENT '实际需要支付的金额',
  `currency_type_id` int(5) DEFAULT NULL COMMENT '货币类别ID',
  `pay_model_id` int(5) DEFAULT NULL COMMENT '支付方式ID',
  `pay_name` varchar(100) DEFAULT '' COMMENT '支付名称',
  `pay_code` varchar(100) DEFAULT '' COMMENT '支付流水号',
  `pay_status` tinyint(1) DEFAULT '0' COMMENT '支付状态 0-初始化 1-付款中,2-支付成功',
  `payer` varchar(120) DEFAULT '' COMMENT '支付人',
  `pay_callback` tinyint(1) DEFAULT '0' COMMENT '支付回调状态 0-初始化 1-成功,-1-失败',
  `pay_time` datetime DEFAULT NULL COMMENT '支付时间',
  `remark` varchar(500) DEFAULT '' COMMENT '备注',
  `delete_flag` tinyint(1) DEFAULT '1' COMMENT '删除标志 1-正常状态 2-已删除',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`order_device_flow_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='设备流量订单表';

/*Data for the table `nts_order_device_flow` */

/*Table structure for table `nts_order_flow_plans` */

DROP TABLE IF EXISTS `nts_order_flow_plans`;

CREATE TABLE `nts_order_flow_plans` (
  `order_flow_plans_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `order_id` bigint(20) DEFAULT NULL COMMENT '订单ID',
  `order_type` tinyint(1) DEFAULT '0' COMMENT '订单类型 1-设备流量订单 2-企业流订单',
  `plans_name` varchar(100) DEFAULT '' COMMENT '套餐名称',
  `plans_type` tinyint(1) DEFAULT '0' COMMENT '套餐类型 0-自定义流量 1-流量阶梯 2-按月缴费',
  `plans_desc` varchar(100) DEFAULT '' COMMENT '套餐描述',
  `unit_price` decimal(20,8) DEFAULT NULL COMMENT '流量单价 ?/kb',
  `total_price` decimal(20,8) DEFAULT NULL COMMENT '流量总价',
  `flow_number` double(11,4) DEFAULT '0.0000' COMMENT '流量数量 单位：kb',
  `months` int(4) DEFAULT '1' COMMENT '月收费：1月，3月，6月',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`order_flow_plans_id`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8 COMMENT='订单流量价格套餐表';

/*Data for the table `nts_order_flow_plans` */

/*Table structure for table `nts_wallet` */

DROP TABLE IF EXISTS `nts_wallet`;

CREATE TABLE `nts_wallet` (
  `wallet_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `company_id` bigint(20) DEFAULT NULL COMMENT '企业ID',
  `money` decimal(20,8) DEFAULT NULL COMMENT '金额',
  `pay_password` varchar(64) COLLATE utf8mb4_bin DEFAULT '' COMMENT '支付密码',
  `salt` varchar(20) COLLATE utf8mb4_bin DEFAULT '' COMMENT '盐加密',
  `create_user_id` bigint(20) DEFAULT NULL COMMENT '创建用户ID',
  `update_user_id` bigint(20) DEFAULT NULL COMMENT '修改用户ID',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`wallet_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='企业钱包表';

/*Data for the table `nts_wallet` */

/*Table structure for table `nts_wallet_log` */

DROP TABLE IF EXISTS `nts_wallet_log`;

CREATE TABLE `nts_wallet_log` (
  `wallet_log_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `company_id` bigint(20) DEFAULT NULL COMMENT '企业ID',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户ID',
  `wallet_record_sn` varchar(64) COLLATE utf8mb4_bin DEFAULT '' COMMENT '交易流水sn，关联nts_wallet_record表',
  `change_money` decimal(20,8) DEFAULT NULL COMMENT '变动金额 增+ 减-',
  `money` decimal(20,8) DEFAULT NULL COMMENT '变动后的金额',
  `remark` varchar(500) COLLATE utf8mb4_bin DEFAULT '' COMMENT '备注',
  `display` tinyint(1) DEFAULT '1' COMMENT '是否显示 0-不显示 1-显示',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`wallet_log_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='钱包变动日志表';

/*Data for the table `nts_wallet_log` */

/*Table structure for table `nts_wallet_record` */

DROP TABLE IF EXISTS `nts_wallet_record`;

CREATE TABLE `nts_wallet_record` (
  `wallet_record_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `company_id` bigint(20) DEFAULT NULL COMMENT '企业ID',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户ID',
  `wallet_record_sn` varchar(64) COLLATE utf8mb4_bin DEFAULT '' COMMENT '交易流水sn，ymdHis+2位随机数',
  `from_uid` varchar(64) COLLATE utf8mb4_bin DEFAULT '' COMMENT '支付方UID，0-系统充值',
  `to_uid` varchar(64) COLLATE utf8mb4_bin DEFAULT '' COMMENT '接收方UID，0-系统提现',
  `type` tinyint(1) DEFAULT '1' COMMENT '交易类型 1-充值 2-提现 3-交易',
  `money` decimal(20,8) DEFAULT NULL COMMENT '交易金额',
  `pay_model_id` int(5) DEFAULT '0' COMMENT '支付方式ID 0-待定 支付宝|微信|银行卡|余额',
  `remark` varchar(500) COLLATE utf8mb4_bin DEFAULT '' COMMENT '备注',
  `pay_status` tinyint(1) DEFAULT '0' COMMENT '支付状态 0-待支付 -1-失败 1-成功',
  `pay_time` datetime DEFAULT NULL COMMENT '交易时间',
  `fetch_status` tinyint(1) DEFAULT '0' COMMENT '收款状态 0-待收款 -1-失败 1-成功',
  `fetch_time` datetime DEFAULT NULL COMMENT '收款时间',
  `check_status` tinyint(1) DEFAULT '0' COMMENT '对账状态 0-未对账 1-已对账',
  `check_time` datetime DEFAULT NULL COMMENT '对账时间',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`wallet_record_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='钱包交易记录表';

/*Data for the table `nts_wallet_record` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
