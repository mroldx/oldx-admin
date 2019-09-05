/*
Navicat MySQL Data Transfer

Source Server         : moli
Source Server Version : 50726
Source Host           : localhost:3306
Source Database       : oldx

Target Server Type    : MYSQL
Target Server Version : 50726
File Encoding         : 65001

Date: 2019-07-27 23:25:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for o_user
-- ----------------------------
DROP TABLE IF EXISTS `o_user`;
CREATE TABLE `o_user` (
  `id` int(20) unsigned NOT NULL AUTO_INCREMENT,
  `ip` varchar(255) DEFAULT '1',
  `login_time` datetime DEFAULT NULL,
  `login_city` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of o_user
-- ----------------------------
INSERT INTO `o_user` VALUES ('22', '0:0:0:0:0:0:0:1', '2019-07-27 23:07:15', null);
INSERT INTO `o_user` VALUES ('23', '0:0:0:0:0:0:0:1', '2019-07-27 23:09:21', '中国广东深圳');
INSERT INTO `o_user` VALUES ('24', '0:0:0:0:0:0:0:1', '2019-07-27 23:21:04', '中国广东深圳');
