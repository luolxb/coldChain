/*
SQLyog Ultimate v13.1.1 (64 bit)
MySQL - 5.7.31 : Database - coldchain_user
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`coldchain_user` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `coldchain_user`;

/*Table structure for table `account_log` */

DROP TABLE IF EXISTS `account_log`;

CREATE TABLE `account_log` (
  `log_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` mediumint(8) unsigned NOT NULL DEFAULT '0',
  `user_money` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '用户金额',
  `frozen_money` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '冻结金额',
  `pay_points` mediumint(9) NOT NULL DEFAULT '0' COMMENT '支付积分',
  `change_time` int(10) unsigned NOT NULL COMMENT '变动时间',
  `desc` varchar(255) NOT NULL DEFAULT '' COMMENT '描述',
  `order_sn` varchar(50) NOT NULL DEFAULT '' COMMENT '订单编号',
  `order_id` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '订单id',
  PRIMARY KEY (`log_id`),
  KEY `user_id` (`user_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=112 DEFAULT CHARSET=utf8;

/*Data for the table `account_log` */

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `admin_id` smallint(5) unsigned NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `user_name` varchar(60) NOT NULL DEFAULT '' COMMENT '用户名',
  `email` varchar(60) NOT NULL DEFAULT '',
  `password` varchar(255) NOT NULL DEFAULT '',
  `add_time` int(11) NOT NULL DEFAULT '0',
  `last_login` int(11) NOT NULL DEFAULT '0',
  `last_ip` varchar(15) NOT NULL DEFAULT '',
  `nav_list` text,
  `lang_type` varchar(50) NOT NULL DEFAULT '',
  `paypwd` varchar(50) NOT NULL DEFAULT '' COMMENT '支付密码',
  `role_id` smallint(5) DEFAULT '0' COMMENT '角色id',
  `suppliers_id` smallint(5) unsigned DEFAULT NULL COMMENT 'suppliers_id',
  `site_id` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '0没有城市分站，1有',
  `open_teach` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`admin_id`) USING BTREE,
  KEY `user_name` (`user_name`) USING BTREE,
  KEY `agency_id` (`paypwd`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `admin` */

/*Table structure for table `expense_log` */

DROP TABLE IF EXISTS `expense_log`;

CREATE TABLE `expense_log` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `admin_id` int(11) DEFAULT NULL COMMENT '操作管理员',
  `money` decimal(10,2) DEFAULT NULL COMMENT '支出金额',
  `integral` int(10) DEFAULT '0' COMMENT '赠送积分',
  `type` tinyint(1) DEFAULT '0' COMMENT '支出类型0商家提现1用户提现2订单取消退款3订单售后退款4其他',
  `addtime` int(11) DEFAULT NULL COMMENT '日志记录时间',
  `log_type_id` int(11) DEFAULT '0' COMMENT '业务关联ID',
  `user_id` int(10) DEFAULT '0' COMMENT '涉及会员id',
  `store_id` int(10) DEFAULT '0' COMMENT '涉及商家id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=latin1 ROW_FORMAT=DYNAMIC COMMENT='平台支出金额或赠送积分记录日志';

/*Data for the table `expense_log` */

/*Table structure for table `invoice` */

DROP TABLE IF EXISTS `invoice`;

CREATE TABLE `invoice` (
  `invoice_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `order_id` int(20) unsigned NOT NULL DEFAULT '0' COMMENT '订单id',
  `order_sn` varchar(20) CHARACTER SET utf8 NOT NULL DEFAULT '' COMMENT '订单编号',
  `user_id` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '用户id',
  `store_id` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '商家id',
  `invoice_type` tinyint(1) NOT NULL DEFAULT '0' COMMENT '0普通发票1电子发票2增值税发票',
  `invoice_money` decimal(10,2) unsigned NOT NULL DEFAULT '0.00' COMMENT '发票金额',
  `invoice_title` varchar(255) CHARACTER SET utf8 NOT NULL DEFAULT '' COMMENT '发票抬头',
  `invoice_desc` varchar(255) CHARACTER SET utf8 NOT NULL DEFAULT '' COMMENT '发票内容',
  `invoice_rate` decimal(10,4) unsigned NOT NULL DEFAULT '0.0000' COMMENT '发票税率',
  `taxpayer` varchar(50) CHARACTER SET utf8 NOT NULL DEFAULT '' COMMENT '纳税人识别号',
  `status` tinyint(1) NOT NULL DEFAULT '0' COMMENT '发票状态0待开1已开2作废',
  `atime` int(11) NOT NULL DEFAULT '0' COMMENT '开票时间',
  `ctime` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '创建时间',
  PRIMARY KEY (`invoice_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='发票信息表';

/*Data for the table `invoice` */

/*Table structure for table `log` */

DROP TABLE IF EXISTS `log`;

CREATE TABLE `log` (
  `log_id` bigint(16) unsigned NOT NULL AUTO_INCREMENT,
  `admin_id` int(10) DEFAULT NULL,
  `log_info` varchar(255) DEFAULT NULL,
  `log_ip` varchar(30) DEFAULT NULL,
  `log_url` varchar(255) DEFAULT NULL,
  `log_time` int(10) DEFAULT NULL,
  `log_type` tinyint(2) DEFAULT '0' COMMENT '0默认1操作店铺2审核活动3处理投诉4其他',
  PRIMARY KEY (`log_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `log` */

/*Table structure for table `member_msg_tpl` */

DROP TABLE IF EXISTS `member_msg_tpl`;

CREATE TABLE `member_msg_tpl` (
  `mmt_code` varchar(50) NOT NULL DEFAULT '' COMMENT '用户消息模板编号',
  `mmt_name` varchar(50) NOT NULL DEFAULT '' COMMENT '模板名称',
  `mmt_message_switch` tinyint(3) unsigned NOT NULL DEFAULT '0' COMMENT '站内信接收开关',
  `mmt_message_content` varchar(255) NOT NULL DEFAULT '' COMMENT '站内信消息内容',
  `mmt_short_switch` tinyint(3) unsigned NOT NULL DEFAULT '0' COMMENT '短信接收开关',
  `mmt_short_content` varchar(255) NOT NULL DEFAULT '' COMMENT '短信接收内容',
  `mmt_mail_switch` tinyint(3) unsigned NOT NULL DEFAULT '0' COMMENT '邮件接收开关',
  `mmt_mail_subject` varchar(255) NOT NULL DEFAULT '' COMMENT '邮件标题',
  `mmt_mail_content` text NOT NULL COMMENT '邮件内容',
  `mmt_short_sign` varchar(50) NOT NULL DEFAULT '' COMMENT '短信签名',
  `mmt_short_code` varchar(50) NOT NULL DEFAULT '' COMMENT '短信模板ID',
  PRIMARY KEY (`mmt_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户消息模板';

/*Data for the table `member_msg_tpl` */

/*Table structure for table `message` */

DROP TABLE IF EXISTS `message`;

CREATE TABLE `message` (
  `message_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '消息ID',
  `admin_id` smallint(5) unsigned NOT NULL DEFAULT '0' COMMENT '管理员id',
  `seller_id` smallint(5) unsigned NOT NULL DEFAULT '0' COMMENT '商家管理员id',
  `message` text NOT NULL COMMENT '站内信内容',
  `type` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '个体消息：0，全体消息：1',
  `category` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '0系统消息，1物流通知，2优惠促销，3商品提醒，4我的资产，5商城好店',
  `send_time` int(10) unsigned NOT NULL COMMENT '发送时间',
  `data` text NOT NULL COMMENT '消息序列化内容',
  PRIMARY KEY (`message_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `message` */

/*Table structure for table `message_activity` */

DROP TABLE IF EXISTS `message_activity`;

CREATE TABLE `message_activity` (
  `message_id` int(11) NOT NULL AUTO_INCREMENT,
  `message_title` varchar(255) NOT NULL COMMENT '消息标题',
  `message_content` text COMMENT '消息内容',
  `img_uri` varchar(255) DEFAULT NULL COMMENT '图片地址',
  `send_time` int(10) unsigned NOT NULL COMMENT '发送时间',
  `end_time` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '活动结束时间',
  `mmt_code` varchar(50) NOT NULL COMMENT '用户消息模板编号',
  `prom_type` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '1抢购2团购3优惠促销4预售5虚拟6拼团7搭配购8自定义图文消息9订单促销',
  `prom_id` int(11) NOT NULL DEFAULT '0' COMMENT '活动id',
  `store_id` int(11) NOT NULL DEFAULT '0' COMMENT '店铺ID',
  PRIMARY KEY (`message_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `message_activity` */

/*Table structure for table `message_logistics` */

DROP TABLE IF EXISTS `message_logistics`;

CREATE TABLE `message_logistics` (
  `message_id` int(11) NOT NULL AUTO_INCREMENT,
  `message_title` varchar(255) DEFAULT NULL COMMENT '消息标题',
  `message_content` text NOT NULL COMMENT '消息内容',
  `img_uri` varchar(255) DEFAULT NULL COMMENT '图片地址',
  `send_time` int(10) unsigned NOT NULL COMMENT '发送时间',
  `order_sn` varchar(20) NOT NULL DEFAULT '' COMMENT '单号',
  `order_id` int(11) NOT NULL DEFAULT '0' COMMENT '物流订单id',
  `mmt_code` varchar(50) DEFAULT NULL COMMENT '用户消息模板编号',
  `type` tinyint(1) unsigned DEFAULT '0' COMMENT '1到货通知2发货提醒3签收提醒4评价提醒5退货提醒6退款提醒',
  `store_id` int(11) NOT NULL DEFAULT '0' COMMENT '店铺ID',
  PRIMARY KEY (`message_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `message_logistics` */

/*Table structure for table `message_notice` */

DROP TABLE IF EXISTS `message_notice`;

CREATE TABLE `message_notice` (
  `message_id` int(11) NOT NULL AUTO_INCREMENT,
  `message_type` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '个体消息：0，全体消息:1',
  `message_title` varchar(255) DEFAULT NULL COMMENT '消息标题',
  `message_content` text NOT NULL COMMENT '消息内容',
  `send_time` int(10) unsigned NOT NULL COMMENT '发送时间',
  `mmt_code` varchar(50) DEFAULT NULL COMMENT '用户消息模板编号',
  `type` tinyint(1) unsigned DEFAULT '0' COMMENT '0系统公告1降价通知2优惠券到账提醒3优惠券使用提醒4优惠券即将过期提醒5预售订单尾款支付提醒6提现到账提醒',
  `prom_id` int(11) NOT NULL DEFAULT '0' COMMENT '活动id',
  `store_id` int(11) DEFAULT '0' COMMENT '店铺ID',
  PRIMARY KEY (`message_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `message_notice` */

/*Table structure for table `message_private` */

DROP TABLE IF EXISTS `message_private`;

CREATE TABLE `message_private` (
  `message_id` int(11) NOT NULL AUTO_INCREMENT,
  `message_content` text NOT NULL COMMENT '消息内容',
  `send_time` int(10) unsigned NOT NULL COMMENT '发送时间',
  `send_user_id` mediumint(8) unsigned NOT NULL COMMENT '发送者',
  PRIMARY KEY (`message_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `message_private` */

/*Table structure for table `oauth_users` */

DROP TABLE IF EXISTS `oauth_users`;

CREATE TABLE `oauth_users` (
  `tu_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT COMMENT '表自增ID',
  `user_id` mediumint(8) NOT NULL COMMENT '用户表ID',
  `openid` varchar(255) NOT NULL COMMENT '第三方开放平台openid',
  `oauth` varchar(50) NOT NULL COMMENT '第三方授权平台',
  `unionid` varchar(255) DEFAULT NULL,
  `oauth_child` varchar(50) DEFAULT NULL COMMENT 'mp标识来自公众号, open标识来自开放平台,用于标识来自哪个第三方授权平台, 因为同是微信平台有来自公众号和开放平台',
  PRIMARY KEY (`tu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `oauth_users` */

/*Table structure for table `seller` */

DROP TABLE IF EXISTS `seller`;

CREATE TABLE `seller` (
  `seller_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '卖家编号',
  `seller_name` varchar(50) NOT NULL DEFAULT '' COMMENT '卖家用户名',
  `user_id` int(10) unsigned DEFAULT NULL COMMENT '用户编号',
  `group_id` int(10) unsigned DEFAULT NULL COMMENT '卖家组编号',
  `store_id` int(10) unsigned DEFAULT NULL COMMENT '店铺编号',
  `is_admin` tinyint(3) unsigned NOT NULL DEFAULT '0' COMMENT '是否管理员(0-不是 1-是)',
  `seller_quicklink` varchar(255) DEFAULT NULL COMMENT '卖家快捷操作',
  `last_login_time` int(11) unsigned DEFAULT NULL COMMENT '最后登录时间',
  `enabled` tinyint(1) DEFAULT '0' COMMENT '激活状态 0启用1关闭',
  `add_time` int(11) DEFAULT NULL,
  `token` varchar(64) DEFAULT NULL COMMENT '用于app 授权类似于session_id',
  `open_teach` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '是否显示新手向导',
  PRIMARY KEY (`seller_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='卖家用户表';

/*Data for the table `seller` */

/*Table structure for table `sms_log` */

DROP TABLE IF EXISTS `sms_log`;

CREATE TABLE `sms_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '表id',
  `mobile` varchar(11) CHARACTER SET latin1 DEFAULT '' COMMENT '手机号',
  `session_id` varchar(128) CHARACTER SET latin1 DEFAULT '' COMMENT 'session_id',
  `add_time` int(11) DEFAULT '0' COMMENT '发送时间',
  `code` varchar(10) CHARACTER SET latin1 DEFAULT '' COMMENT '验证码',
  `seller_id` int(10) DEFAULT '0',
  `status` int(1) DEFAULT '0' COMMENT '1:发送成功,0:发送失败',
  `msg` varchar(255) DEFAULT NULL COMMENT '短信内容',
  `scene` int(1) DEFAULT '0' COMMENT '发送场景,1:用户注册,2:找回密码,3:客户下单,4:客户支付,5:商家发货,6:身份验证',
  `error_msg` text COMMENT '发送短信异常内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=177 DEFAULT CHARSET=utf8;

/*Data for the table `sms_log` */

/*Table structure for table `store_collect` */

DROP TABLE IF EXISTS `store_collect`;

CREATE TABLE `store_collect` (
  `log_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(10) DEFAULT NULL,
  `store_id` int(10) DEFAULT NULL,
  `add_time` int(11) DEFAULT NULL COMMENT '收藏店铺时间',
  `store_name` varchar(100) DEFAULT NULL,
  `user_name` varchar(50) DEFAULT NULL COMMENT '收藏会员名称',
  PRIMARY KEY (`log_id`)
) ENGINE=InnoDB AUTO_INCREMENT=78 DEFAULT CHARSET=utf8;

/*Data for the table `store_collect` */

/*Table structure for table `undo_log` */

DROP TABLE IF EXISTS `undo_log`;

CREATE TABLE `undo_log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `branch_id` bigint(20) NOT NULL,
  `xid` varchar(100) NOT NULL,
  `context` varchar(128) NOT NULL,
  `rollback_info` longblob NOT NULL,
  `log_status` int(11) NOT NULL,
  `log_created` datetime NOT NULL,
  `log_modified` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `ux_undo_log` (`xid`,`branch_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `undo_log` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `user_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT COMMENT '表id',
  `email` varchar(60) NOT NULL DEFAULT '' COMMENT '邮件',
  `password` varchar(255) NOT NULL DEFAULT '' COMMENT '密码',
  `sex` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '0 保密 1 男 2 女',
  `birthday` int(11) NOT NULL DEFAULT '0' COMMENT '生日',
  `user_money` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '用户金额',
  `frozen_money` decimal(10,2) DEFAULT '0.00' COMMENT '冻结金额',
  `distribut_money` decimal(10,2) DEFAULT '0.00' COMMENT '累积分佣金额',
  `pay_points` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '消费积分',
  `paypwd` varchar(128) DEFAULT NULL COMMENT '支付密码',
  `reg_time` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '注册时间',
  `last_login` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '最后登录时间',
  `last_ip` varchar(15) NOT NULL DEFAULT '' COMMENT '最后登录ip',
  `qq` varchar(20) NOT NULL DEFAULT '' COMMENT 'QQ',
  `mobile` varchar(20) NOT NULL DEFAULT '' COMMENT '手机号码',
  `mobile_validated` tinyint(3) unsigned NOT NULL DEFAULT '0' COMMENT '是否验证手机',
  `head_pic` varchar(255) NOT NULL DEFAULT '' COMMENT '头像',
  `bank_name` varchar(150) DEFAULT NULL COMMENT '银行名称',
  `bank_card` varchar(50) DEFAULT NULL COMMENT '银行账号',
  `realname` varchar(50) DEFAULT NULL COMMENT '用户真实姓名',
  `idcard` varchar(100) DEFAULT NULL COMMENT '身份证号',
  `email_validated` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '是否验证电子邮箱',
  `nickname` varchar(50) NOT NULL DEFAULT '' COMMENT '第三方返回昵称',
  `level` tinyint(1) DEFAULT '1' COMMENT '会员等级',
  `discount` decimal(10,2) DEFAULT '1.00' COMMENT '会员折扣，默认1不享受',
  `total_amount` decimal(10,2) DEFAULT '0.00' COMMENT '消费累计额度',
  `is_lock` tinyint(1) DEFAULT '0' COMMENT '是否被锁定冻结',
  `is_distribut` tinyint(1) DEFAULT '0' COMMENT '是否为分销商 0 否 1 是',
  `first_leader` int(11) DEFAULT '0' COMMENT '第一个上级',
  `second_leader` int(11) DEFAULT '0' COMMENT '第二个上级',
  `third_leader` int(11) DEFAULT '0' COMMENT '第三个上级',
  `token` varchar(64) DEFAULT '' COMMENT '用于app 授权类似于session_id',
  `underling_number` int(5) DEFAULT '0' COMMENT '用户下线数',
  `message_mask` bit(6) NOT NULL DEFAULT b'111111' COMMENT '消息掩码',
  `push_id` varchar(30) NOT NULL DEFAULT '' COMMENT '推送id',
  `distribut_level` tinyint(2) DEFAULT '0' COMMENT '分销商等级',
  `xcx_qrcode` varchar(255) DEFAULT NULL COMMENT '小程序专属二维码',
  `is_store_member` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '属于哪个店铺的会员',
  `is_entry` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '0平常注册，1微信注册绑定，2微信账号关联',
  `manifesto` varchar(255) NOT NULL DEFAULT '' COMMENT '个人签名',
  `distribut_withdrawals_money` decimal(10,2) unsigned NOT NULL DEFAULT '0.00' COMMENT '累积分销佣金提现',
  PRIMARY KEY (`user_id`),
  KEY `email` (`email`) USING BTREE,
  KEY `mobile` (`mobile_validated`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=319 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

/*Table structure for table `user_address` */

DROP TABLE IF EXISTS `user_address`;

CREATE TABLE `user_address` (
  `address_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` mediumint(8) unsigned NOT NULL DEFAULT '0',
  `consignee` varchar(60) NOT NULL DEFAULT '' COMMENT '收货人',
  `email` varchar(60) NOT NULL DEFAULT '' COMMENT '邮箱地址',
  `country` int(11) NOT NULL DEFAULT '0' COMMENT '国家',
  `province` int(11) NOT NULL DEFAULT '0' COMMENT '省份',
  `city` int(11) NOT NULL DEFAULT '0' COMMENT '城市',
  `district` int(11) NOT NULL DEFAULT '0' COMMENT '地区',
  `twon` int(11) DEFAULT '0' COMMENT '乡镇',
  `address` varchar(250) NOT NULL DEFAULT '' COMMENT '地址',
  `zipcode` varchar(60) NOT NULL DEFAULT '' COMMENT '邮政编码',
  `mobile` varchar(60) NOT NULL DEFAULT '' COMMENT '手机',
  `is_default` tinyint(1) DEFAULT '0' COMMENT '默认收货地址',
  `longitude` decimal(10,7) NOT NULL DEFAULT '0.0000000' COMMENT '地址经度',
  `latitude` decimal(10,7) NOT NULL DEFAULT '0.0000000' COMMENT '地址纬度',
  PRIMARY KEY (`address_id`),
  KEY `user_id` (`user_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=166 DEFAULT CHARSET=utf8;

/*Data for the table `user_address` */

/*Table structure for table `user_extend` */

DROP TABLE IF EXISTS `user_extend`;

CREATE TABLE `user_extend` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(11) unsigned DEFAULT '0',
  `invoice_title` varchar(200) DEFAULT NULL COMMENT '发票抬头',
  `taxpayer` varchar(100) DEFAULT NULL COMMENT '纳税人识别号',
  `invoice_desc` varchar(50) DEFAULT NULL COMMENT '不开发票/明细',
  `realname` varchar(100) DEFAULT NULL COMMENT '真实姓名',
  `idcard` varchar(100) DEFAULT NULL COMMENT '身份证号',
  `cash_alipay` varchar(100) NOT NULL DEFAULT '' COMMENT '提现支付宝号',
  `cash_unionpay` varchar(100) NOT NULL DEFAULT '' COMMENT '提现银行卡号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;

/*Data for the table `user_extend` */

/*Table structure for table `user_level` */

DROP TABLE IF EXISTS `user_level`;

CREATE TABLE `user_level` (
  `level_id` smallint(4) unsigned NOT NULL AUTO_INCREMENT,
  `level_name` varchar(30) DEFAULT NULL COMMENT '头衔名称',
  `amount` decimal(10,2) DEFAULT NULL COMMENT '等级必要金额',
  `discount` smallint(4) DEFAULT '0' COMMENT '折扣',
  `describe` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`level_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `user_level` */

/*Table structure for table `user_message` */

DROP TABLE IF EXISTS `user_message`;

CREATE TABLE `user_message` (
  `rec_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` mediumint(8) unsigned NOT NULL DEFAULT '0' COMMENT '用户id',
  `message_id` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '消息id',
  `category` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '通知消息：0, 活动消息：1, 物流:2, 私信:3',
  `is_see` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '是否查看：0未查看, 1已查看',
  `deleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT '用户假删除标识,1:删除,0未删除',
  `status` int(11) NOT NULL DEFAULT '0' COMMENT '查看状态：0未查看，1已查看',
  PRIMARY KEY (`rec_id`),
  KEY `user_id` (`user_id`) USING BTREE,
  KEY `message_id` (`message_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user_message` */

/*Table structure for table `user_sign` */

DROP TABLE IF EXISTS `user_sign`;

CREATE TABLE `user_sign` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT '0' COMMENT '用户id',
  `sign_total` int(11) DEFAULT '0' COMMENT '累计签到天数',
  `sign_count` int(11) DEFAULT '0' COMMENT '连续签到天数',
  `sign_last` char(11) DEFAULT '0' COMMENT '最后签到时间，时间格式20170907',
  `sign_time` text CHARACTER SET utf8 COMMENT '历史签到时间，以逗号隔开',
  `cumtrapz` int(11) DEFAULT '0' COMMENT '用户累计签到总积分',
  `this_month` int(6) DEFAULT NULL COMMENT '本月累计积分',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

/*Data for the table `user_sign` */

/*Table structure for table `user_store` */

DROP TABLE IF EXISTS `user_store`;

CREATE TABLE `user_store` (
  `id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT COMMENT '表id',
  `user_id` mediumint(8) unsigned NOT NULL DEFAULT '0' COMMENT '用户id',
  `store_name` varchar(50) DEFAULT NULL COMMENT '店铺名',
  `true_name` varchar(50) DEFAULT NULL COMMENT '真名',
  `qq` varchar(20) NOT NULL DEFAULT '' COMMENT 'QQ',
  `mobile` varchar(20) NOT NULL DEFAULT '' COMMENT '手机号码',
  `store_img` varchar(255) DEFAULT NULL COMMENT '店铺图片',
  `store_time` int(11) NOT NULL DEFAULT '0' COMMENT '开店时间',
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`) USING BTREE,
  KEY `mobile` (`mobile`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=73 DEFAULT CHARSET=utf8 COMMENT='用户店铺信息表';

/*Data for the table `user_store` */

/*Table structure for table `withdrawals` */

DROP TABLE IF EXISTS `withdrawals`;

CREATE TABLE `withdrawals` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '提现申请表',
  `user_id` int(11) DEFAULT '0' COMMENT '用户id',
  `money` decimal(10,2) DEFAULT '0.00' COMMENT '提现金额',
  `create_time` int(11) DEFAULT '0' COMMENT '申请时间',
  `check_time` int(11) DEFAULT '0' COMMENT '审核时间',
  `pay_time` int(11) DEFAULT '0' COMMENT '支付时间',
  `refuse_time` int(11) DEFAULT '0' COMMENT '拒绝时间',
  `bank_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT '' COMMENT '银行名称 如支付宝 微信 中国银行 农业银行等',
  `bank_card` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT '' COMMENT '银行账号或支付宝账号',
  `realname` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT '' COMMENT '提款账号真实姓名',
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT '' COMMENT '提现备注',
  `taxfee` decimal(10,2) DEFAULT '0.00' COMMENT '税收手续费',
  `status` tinyint(1) DEFAULT '0' COMMENT '状态：-2删除作废-1审核失败0申请中1审核通过2付款成功3付款失败',
  `pay_code` varchar(100) DEFAULT NULL COMMENT '付款对账流水号',
  `error_code` varchar(255) DEFAULT NULL COMMENT '付款失败错误代码',
  `type` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '提箱类型:0余额提现,1佣金提现',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;

/*Data for the table `withdrawals` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
