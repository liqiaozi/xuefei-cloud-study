/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : seata_goods

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2020-02-28 22:22:16
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for seata_goods
-- ----------------------------
DROP TABLE IF EXISTS `seata_goods`;
CREATE TABLE `seata_goods` (
  `g_id` int(11) NOT NULL,
  `g_name` varchar(256) DEFAULT NULL,
  `g_stock` int(11) NOT NULL,
  `g_price` decimal(11,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of seata_goods
-- ----------------------------
