/*
SQLyog Ultimate v13.1.1 (64 bit)
MySQL - 5.7.31 : Database - coldchain_data
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`coldchain_data` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `coldchain_data`;

/*Table structure for table `alert_info` */

DROP TABLE IF EXISTS `alert_info`;

CREATE TABLE `alert_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `convert_type` tinyint(4) DEFAULT NULL COMMENT '主机变频器型号',
  `alert_key` int(11) DEFAULT NULL COMMENT '报警数值\r\n',
  `alert_value` varchar(20) DEFAULT NULL COMMENT '报警代码\r\n',
  `create_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=178 DEFAULT CHARSET=utf8;

/*Data for the table `alert_info` */

/*Table structure for table `command_log` */

DROP TABLE IF EXISTS `command_log`;

CREATE TABLE `command_log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `dtu_id` varchar(20) DEFAULT NULL,
  `server_id` tinyint(4) DEFAULT NULL,
  `command_type` varchar(10) DEFAULT NULL COMMENT '消息类型/ID',
  `mode` tinyint(4) DEFAULT NULL COMMENT '1收到 2发送',
  `command_content` text COMMENT '数据包',
  `create_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `dtu_id_idx` (`dtu_id`) USING BTREE,
  KEY `idx_time` (`create_date`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=8372065 DEFAULT CHARSET=utf8;

/*Data for the table `command_log` */

/*Table structure for table `command_queue` */

DROP TABLE IF EXISTS `command_queue`;

CREATE TABLE `command_queue` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `command_type` varchar(10) CHARACTER SET utf8 DEFAULT NULL COMMENT '消息ID',
  `dtu_id` varchar(30) CHARACTER SET utf8 DEFAULT NULL,
  `server_id` int(11) DEFAULT '1' COMMENT '所在服务器',
  `snc_log_id` bigint(20) DEFAULT '0' COMMENT '日志事务id',
  `command_content` varchar(1000) CHARACTER SET utf8 DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21568 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `command_queue` */

/*Table structure for table `nts_events` */

DROP TABLE IF EXISTS `nts_events`;

CREATE TABLE `nts_events` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `event_class` varchar(30) DEFAULT NULL COMMENT '事件类型',
  `msg_id` varchar(60) DEFAULT NULL COMMENT '消息/事件ID',
  `device_sn` varchar(60) DEFAULT NULL COMMENT '设备SN',
  `message_data_id` bigint(20) DEFAULT NULL COMMENT '消息数据ID',
  `device_data_id` bigint(20) DEFAULT NULL COMMENT '设备数据ID',
  `reefer_data_id` bigint(20) DEFAULT NULL COMMENT '冷链数据ID',
  `dept_id` bigint(20) DEFAULT NULL COMMENT '部门|企业ID',
  `delete_flag` tinyint(1) DEFAULT '1' COMMENT '删除标志 1-正常状态 2-已删除',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `index_event_reefer_data_id` (`reefer_data_id`) USING BTREE,
  KEY `index_event_msg_id` (`msg_id`),
  KEY `index_event_device_data_id` (`device_data_id`),
  KEY `index_ecent_message_data_id` (`message_data_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12934 DEFAULT CHARSET=utf8 COMMENT='事件表';

/*Data for the table `nts_events` */

/*Table structure for table `nts_login_log` */

DROP TABLE IF EXISTS `nts_login_log`;

CREATE TABLE `nts_login_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) DEFAULT NULL,
  `accountName` varchar(20) DEFAULT NULL,
  `loginTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `loginIP` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `ly_user_loginlist` (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=8055 DEFAULT CHARSET=utf8;

/*Data for the table `nts_login_log` */

/*Table structure for table `nts_message_data` */

DROP TABLE IF EXISTS `nts_message_data`;

CREATE TABLE `nts_message_data` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `msg_id` varchar(60) DEFAULT NULL COMMENT '消息/事件ID',
  `event_dtm` varchar(20) DEFAULT NULL COMMENT '事件发生日期',
  `app_dtm` varchar(20) DEFAULT NULL COMMENT '消息/事件处理日期',
  `event_infos` varchar(255) DEFAULT NULL COMMENT '事件数组',
  `dept_id` bigint(20) DEFAULT NULL COMMENT '部门|企业ID',
  `events_id` bigint(20) DEFAULT NULL COMMENT '事件ID',
  `delete_flag` tinyint(1) DEFAULT '1' COMMENT '删除标志 1-正常状态 2-已删除',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `index_message_data` (`msg_id`,`event_infos`,`events_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=12939 DEFAULT CHARSET=utf8 COMMENT='消息数据表';

/*Data for the table `nts_message_data` */

/*Table structure for table `nts_notice_read_log` */

DROP TABLE IF EXISTS `nts_notice_read_log`;

CREATE TABLE `nts_notice_read_log` (
  `id` bigint(64) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `login_name` varchar(255) DEFAULT NULL COMMENT '账号',
  `notice_id` bigint(32) DEFAULT NULL COMMENT '消息公告id',
  `read_flag` tinyint(2) DEFAULT '1' COMMENT '阅读标识0-未阅读 1-已阅读',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=91 DEFAULT CHARSET=utf8;

/*Data for the table `nts_notice_read_log` */

/*Table structure for table `nts_reefer_alarms` */

DROP TABLE IF EXISTS `nts_reefer_alarms`;

CREATE TABLE `nts_reefer_alarms` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `device_sn` varchar(60) DEFAULT NULL COMMENT '设备SN',
  `oem_alarm` int(11) DEFAULT NULL COMMENT '冷链OEM的微报警',
  `rc_alias` varchar(20) DEFAULT NULL COMMENT '显示的报警别名',
  `rc_severity` varchar(20) DEFAULT NULL COMMENT '警报的严重程度',
  `active` varchar(10) DEFAULT NULL COMMENT '是否报警 true/false',
  `dept_id` bigint(20) DEFAULT NULL COMMENT '部门|企业ID',
  `reefer_data_id` bigint(20) DEFAULT NULL COMMENT '冷链数据ID',
  `delete_flag` tinyint(1) DEFAULT '1' COMMENT '删除标志 1-正常状态 2-已删除',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `index_reefer_alarms` (`device_sn`,`reefer_data_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=6428 DEFAULT CHARSET=utf8 COMMENT='冷链警报表';

/*Data for the table `nts_reefer_alarms` */

/*Table structure for table `nts_snc_log` */

DROP TABLE IF EXISTS `nts_snc_log`;

CREATE TABLE `nts_snc_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dtu_id` varchar(200) DEFAULT NULL COMMENT '设备dtu_id',
  `accountName` varchar(30) DEFAULT NULL,
  `module` varchar(30) DEFAULT NULL,
  `methods` varchar(200) DEFAULT NULL,
  `actionTime` varchar(30) DEFAULT NULL,
  `userIP` varchar(60) DEFAULT NULL,
  `operTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `isSuccess` tinyint(4) DEFAULT '0',
  `description` varchar(2000) DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `dtu_id` (`dtu_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=34091 DEFAULT CHARSET=utf8;

/*Data for the table `nts_snc_log` */

/*Table structure for table `suppliers` */

DROP TABLE IF EXISTS `suppliers`;

CREATE TABLE `suppliers` (
  `suppliers_id` smallint(5) unsigned NOT NULL AUTO_INCREMENT COMMENT '供应商ID',
  `suppliers_name` varchar(255) NOT NULL DEFAULT '' COMMENT '供应商名称',
  `suppliers_desc` mediumtext NOT NULL COMMENT '供应商描述',
  `is_check` tinyint(1) unsigned NOT NULL DEFAULT '1' COMMENT '供应商状态',
  `suppliers_contacts` varchar(255) NOT NULL DEFAULT '' COMMENT '供应商联系人',
  `suppliers_phone` varchar(20) NOT NULL DEFAULT '' COMMENT '供应商电话',
  `store_id` int(10) DEFAULT '0' COMMENT '所属商家id',
  PRIMARY KEY (`suppliers_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `suppliers` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
