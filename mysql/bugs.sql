/*
Navicat MySQL Data Transfer

Source Server         : testMySql
Source Server Version : 50549
Source Host           : sql7.freesqldatabase.com:3306
Source Database       : sql7130869

Target Server Type    : MYSQL
Target Server Version : 50549
File Encoding         : 65001

Date: 2016-08-11 14:03:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for bugs
-- ----------------------------
DROP TABLE IF EXISTS `bugs`;
CREATE TABLE `bugs` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `open_date` date DEFAULT NULL,
  `close_date` date DEFAULT NULL,
  `severity` bit(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id` (`id`,`severity`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of bugs
-- ----------------------------
INSERT INTO `bugs` VALUES ('1', '2016-07-11', '2016-08-01', '');
INSERT INTO `bugs` VALUES ('2', '2016-06-11', '2016-08-03', '\0');
INSERT INTO `bugs` VALUES ('3', '2016-08-02', '2016-08-11', '\0');
