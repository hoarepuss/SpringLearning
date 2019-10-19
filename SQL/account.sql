/*
Navicat MySQL Data Transfer

Source Server         : 20191003
Source Server Version : 50562
Source Host           : localhost:3306
Source Database       : spring

Target Server Type    : MYSQL
Target Server Version : 50562
File Encoding         : 65001

Date: 2019-10-19 15:57:29
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `account`
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) DEFAULT NULL,
  `money` float DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES ('1', 'aaa', '1000');
INSERT INTO `account` VALUES ('2', 'bbb', '10000');
INSERT INTO `account` VALUES ('3', 'ccc', '1000');
INSERT INTO `account` VALUES ('5', 'ddd', '1000');
INSERT INTO `account` VALUES ('6', 'ggg', '500');
