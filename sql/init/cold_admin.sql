/*
SQLyog Ultimate v13.1.1 (64 bit)
MySQL - 5.7.31 : Database - coldchain_sys_admin
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`coldchain_sys_admin` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `coldchain_sys_admin`;

/*Table structure for table `app_version` */

DROP TABLE IF EXISTS `app_version`;

CREATE TABLE `app_version` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` int(10) NOT NULL COMMENT '类型，1-安卓，2-ios',
  `version` varchar(100) NOT NULL COMMENT '系统版本号',
  `is_force` int(10) NOT NULL DEFAULT '0' COMMENT '是否强制更新，0-否，1-是',
  `download_url` varchar(200) NOT NULL COMMENT '更新地址',
  `add_time` datetime NOT NULL COMMENT '更新日期 ',
  `update_desc` varchar(1000) DEFAULT NULL COMMENT '更新内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='app版本表';

/*Data for the table `app_version` */

/*Table structure for table `apply_company` */

DROP TABLE IF EXISTS `apply_company`;

CREATE TABLE `apply_company` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '企业名称',
  `type` int(11) DEFAULT NULL COMMENT '租车类型0 企业长租 1 企业分时',
  `linker` varchar(255) DEFAULT NULL COMMENT '联系人',
  `phone` varchar(255) DEFAULT NULL COMMENT '联系电话',
  `email` varchar(255) DEFAULT NULL COMMENT '邮件',
  `address` varchar(255) DEFAULT NULL COMMENT '地址',
  `remark` varchar(500) DEFAULT NULL COMMENT '备注',
  `add_time` datetime DEFAULT NULL COMMENT '添加时间',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `apply_company` */

/*Table structure for table `pay_config` */

DROP TABLE IF EXISTS `pay_config`;

CREATE TABLE `pay_config` (
  `app_id` varchar(255) NOT NULL DEFAULT '' COMMENT '小程序appid',
  `mch_id` varchar(255) NOT NULL DEFAULT '' COMMENT '微信支付的商户id',
  `key` varchar(255) NOT NULL DEFAULT '' COMMENT '微信支付的商户密钥',
  `app_secret` varchar(255) NOT NULL DEFAULT '' COMMENT '小程序secret',
  `apiclient_cert` varchar(255) NOT NULL DEFAULT '' COMMENT '支付商户证书',
  `apiclient_key` varchar(255) NOT NULL DEFAULT '' COMMENT '支付商户证书密钥'
) ENGINE=MyISAM DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `pay_config` */

insert  into `pay_config`(`app_id`,`mch_id`,`key`,`app_secret`,`apiclient_cert`,`apiclient_key`) values 
('wx3c44179d820eb2ee ','1566458161','NTS32SDSD9ERM2313CD88923DSDHJSDS ','','','');

/*Table structure for table `proposal` */

DROP TABLE IF EXISTS `proposal`;

CREATE TABLE `proposal` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `content` varchar(50) NOT NULL DEFAULT '' COMMENT '内容',
  `add_time` datetime NOT NULL COMMENT '添加时间',
  `pid` int(11) NOT NULL DEFAULT '0' COMMENT '提交人呢',
  `photo_one` varchar(50) DEFAULT NULL COMMENT '图片1',
  `photo_two` varchar(50) DEFAULT NULL COMMENT '图片2',
  `photo_three` varchar(50) DEFAULT NULL COMMENT '图片3',
  `photo_four` varchar(50) DEFAULT NULL COMMENT '图片4',
  `photo_five` varchar(50) DEFAULT NULL COMMENT '图片5',
  `update_time` datetime DEFAULT NULL,
  `remark` longtext,
  `process_id` int(11) DEFAULT NULL COMMENT '处理人id',
  `process_name` varchar(50) DEFAULT NULL COMMENT '处理人',
  `status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '处理状态0-未处理，1-已处理',
  `market_id` int(11) DEFAULT NULL COMMENT '市场id',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=32 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='建议';

/*Data for the table `proposal` */

insert  into `proposal`(`id`,`content`,`add_time`,`pid`,`photo_one`,`photo_two`,`photo_three`,`photo_four`,`photo_five`,`update_time`,`remark`,`process_id`,`process_name`,`status`,`market_id`) values 
(1,'aaa','2017-01-19 13:52:29',69,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL),
(2,'???','2017-02-07 08:56:19',312,'/Uploads/2017/0207/sgrwjs4frgmgx.jpeg','/Uploads/2017/0207/e8xh59dmlxa4f.jpeg','','','',NULL,NULL,NULL,NULL,0,NULL),
(3,'???','2017-02-07 08:56:24',312,'/Uploads/2017/0207/sgrwjs4frgmgx.jpeg','/Uploads/2017/0207/e8xh59dmlxa4f.jpeg','','','',NULL,NULL,NULL,NULL,0,NULL),
(4,'???','2017-02-07 08:56:26',312,'/Uploads/2017/0207/sgrwjs4frgmgx.jpeg','/Uploads/2017/0207/e8xh59dmlxa4f.jpeg','','','',NULL,NULL,NULL,NULL,0,NULL),
(5,'????','2017-02-07 09:05:27',312,'/Uploads/2017/0207/y9glkl8yudmad.jpeg','','','','',NULL,NULL,NULL,NULL,0,NULL),
(6,'Asf','2017-02-09 14:20:42',311,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL),
(7,'Sdfdsg','2017-02-09 15:11:20',311,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL),
(8,'Test','2017-02-09 15:11:58',311,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL),
(9,'Test again','2017-02-09 15:13:04',311,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL),
(10,'Shit','2017-02-09 15:18:00',311,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL),
(11,'Fuck','2017-02-09 15:22:48',311,'/Uploads/2017/0209/yr5ur9u59uiir.jpeg',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL),
(12,'Five pic','2017-02-09 15:24:03',311,'/Uploads/2017/0209/yo9eh7j5vzhdv.jpeg','/Uploads/2017/0209/n6f2kp6ac6bi1.jpeg','/Uploads/2017/0209/a8qas0qg9p8sh.jpeg','/Uploads/2017/0209/stkrdarcg67i7.jpeg','/Uploads/2017/0209/s411qwc9x4gl8.jpeg',NULL,NULL,NULL,NULL,0,NULL),
(13,'????','2017-02-09 17:16:29',311,'/Uploads/2017/0209/gsle6csk5z8fr.jpg','','','','',NULL,NULL,NULL,NULL,0,NULL),
(14,'123','2017-02-10 16:46:14',353,'/Uploads/2017/0210/ryelxdqarxl4u.jpeg',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL),
(15,'??????????','2017-02-13 10:59:00',354,'null','null','null','null','null',NULL,NULL,NULL,NULL,0,NULL),
(16,'Test several pics??????','2017-02-17 17:15:25',353,'/Uploads/2017/0217/amjc89x5uivvu.jpeg','/Uploads/2017/0217/pmr8iqk1uo0ev.jpeg','/Uploads/2017/0217/m0ctx3g09k8pp.jpeg','/Uploads/2017/0217/v2u0v11yzq42j.jpeg','/Uploads/2017/0217/h8uc734sg4aoi.jpeg',NULL,NULL,NULL,NULL,0,NULL),
(17,'????','2017-02-17 17:32:15',354,'/Uploads/2017/0217/hctcfzcci6c1x.jpeg','/Uploads/2017/0217/9ftjpxklqj7ct.jpeg','/Uploads/2017/0217/jfg5wpynzaeba.jpeg','/Uploads/2017/0217/719lcuydaqnao.jpeg','/Uploads/2017/0217/uw6vfhnd6y55v.jpeg',NULL,NULL,NULL,NULL,0,NULL),
(18,'????','2017-02-17 17:33:22',354,'/Uploads/2017/0217/hctcfzcci6c1x.jpeg','/Uploads/2017/0217/9ftjpxklqj7ct.jpeg','/Uploads/2017/0217/jfg5wpynzaeba.jpeg','/Uploads/2017/0217/719lcuydaqnao.jpeg','/Uploads/2017/0217/uw6vfhnd6y55v.jpeg',NULL,NULL,NULL,NULL,0,NULL),
(19,'??','2017-02-25 10:08:46',354,'/Uploads/2017/0225/plco367jgux2l.jpeg','','','','',NULL,NULL,NULL,NULL,0,NULL),
(20,'??','2017-02-25 10:13:38',354,'/Uploads/2017/0225/62ra7s0qa68cn.jpeg','','','','',NULL,NULL,NULL,NULL,0,NULL),
(21,'qsprs','2017-02-27 15:39:30',162,'/Uploads/2017/0227/90qsl3y9wy2zz.png','/Uploads/2017/0227/11i4nelo11dcf.png','/Uploads/2017/0227/mfkq7cygffatt.jpeg','/Uploads/2017/0227/tpuoaaq6t0qb0.jpeg','/Uploads/2017/0227/82dvy0x21ywsr.png',NULL,NULL,NULL,NULL,0,NULL),
(22,'gyuu','2017-02-28 17:49:18',162,'/Uploads/2017/0228/3kp2srpbd5gkl.jpeg','','','','',NULL,NULL,NULL,NULL,0,NULL),
(23,'udhfhfjfidjdjudd','2017-03-01 13:54:28',162,'null','null','null','null','null',NULL,NULL,NULL,NULL,0,NULL),
(24,'ddff','2017-03-01 16:45:57',162,'null','null','null','null','null',NULL,NULL,NULL,NULL,0,NULL),
(25,'??','2017-03-07 17:38:36',162,'/Uploads/2017/0307/8za7azgazqli9.jpeg','/Uploads/2017/0307/51r8ja34si2ar.jpeg','/Uploads/2017/0307/7cmrwrn858fzt.jpeg','/Uploads/2017/0307/b9sfny72mo88u.jpeg','',NULL,NULL,NULL,NULL,0,NULL),
(26,'Test ','2017-03-17 15:01:30',364,'/Uploads/2017/0317/chn464nsmh801.jpeg','/Uploads/2017/0317/lpk70l5u2jvez.jpeg',NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL),
(27,'aaaaa','2017-03-17 15:05:47',363,'/Uploads/2017/0317/xk7uw41m42pxt.png','/Uploads/2017/0317/w7wjocoftlqod.jpeg','','','',NULL,NULL,NULL,NULL,0,NULL),
(28,'aaaa','2017-03-17 15:08:18',363,'/Uploads/2017/0317/og4pnbnsi3pzw.jpg','','','','',NULL,NULL,NULL,NULL,0,NULL),
(29,'aaaa','2017-03-17 15:11:36',363,'/Uploads/2017/0317/fcjbi7h17asfv.jpeg','/Uploads/2017/0317/re6b0jijvve73.jpeg','','','',NULL,NULL,NULL,NULL,0,NULL),
(30,'cab','2017-03-17 17:55:15',363,'/Uploads/2017/0317/5uzrzyee1w3ob.jpeg','','','','',NULL,NULL,NULL,NULL,0,NULL),
(31,'??','2017-03-20 15:54:25',162,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL);

/*Table structure for table `sms_template` */

DROP TABLE IF EXISTS `sms_template`;

CREATE TABLE `sms_template` (
  `tpl_id` mediumint(8) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `sms_sign` varchar(50) NOT NULL DEFAULT '' COMMENT '短信签名',
  `sms_tpl_code` varchar(100) NOT NULL DEFAULT '' COMMENT '短信模板ID',
  `tpl_content` varchar(512) NOT NULL DEFAULT '' COMMENT '发送短信内容',
  `send_scene` varchar(100) NOT NULL DEFAULT '' COMMENT '短信发送场景',
  `add_time` int(11) NOT NULL COMMENT '添加时间',
  PRIMARY KEY (`tpl_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COMMENT='短信模板配置表';

/*Data for the table `sms_template` */

/*Table structure for table `sys_function` */

DROP TABLE IF EXISTS `sys_function`;

CREATE TABLE `sys_function` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(500) DEFAULT NULL COMMENT '编码',
  `name` varchar(100) DEFAULT NULL COMMENT '模块名称',
  `description` varchar(500) DEFAULT NULL COMMENT '访问连接',
  `menu_rank` varchar(11) DEFAULT NULL COMMENT '排序',
  `status` varchar(1) DEFAULT NULL COMMENT '状态',
  `parent_id` int(11) DEFAULT NULL COMMENT '父级菜单id',
  `remarks` varchar(500) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=144 DEFAULT CHARSET=utf8;

/*Data for the table `sys_function` */

/*Table structure for table `sys_param` */

DROP TABLE IF EXISTS `sys_param`;

CREATE TABLE `sys_param` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `p_key` varchar(50) NOT NULL DEFAULT '' COMMENT '参数键',
  `p_value` varchar(50) NOT NULL DEFAULT '' COMMENT '参数值',
  `p_name` varchar(50) NOT NULL DEFAULT '' COMMENT '参数名',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=41 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='系统参数';

/*Data for the table `sys_param` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
