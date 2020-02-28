/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : seata_order

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2020-02-28 22:22:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for seata_order
-- ----------------------------
DROP TABLE IF EXISTS `seata_order`;
CREATE TABLE `seata_order` (
  `o_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单id',
  `o_goods_id` int(11) NOT NULL COMMENT '产品id',
  `o_account_id` int(11) NOT NULL COMMENT '用户id',
  `o_price` decimal(11,2) NOT NULL COMMENT '金额',
  PRIMARY KEY (`o_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of seata_order
-- ----------------------------
