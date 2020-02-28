/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : seata_account

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2020-02-28 22:22:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for seata_account
-- ----------------------------
DROP TABLE IF EXISTS `seata_account`;
CREATE TABLE `seata_account` (
  `a_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `a_money` decimal(11,2) NOT NULL COMMENT '用户金额',
  `a_mark` varchar(256) DEFAULT NULL,
  `a_create_time` datetime NOT NULL,
  PRIMARY KEY (`a_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of seata_account
-- ----------------------------
