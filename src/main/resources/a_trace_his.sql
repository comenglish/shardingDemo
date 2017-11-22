/*
Navicat MySQL Data Transfer

Source Server         : 10.38.164.44
Source Server Version : 50718
Source Host           : 10.38.164.44:3306
Source Database       : db_t_test

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2017-11-22 15:16:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for a_trace_his
-- ----------------------------
DROP TABLE IF EXISTS `a_trace_his`;
CREATE TABLE `a_trace_his` (
  `SYSTEM_REF` bigint(20) NOT NULL,
  `ORDER_NO` char(36) NOT NULL,
  `CUT_DATE` int(11) NOT NULL,  
  UNIQUE KEY `SYSTEM_REF_INDEX` (`SYSTEM_REF`) USING BTREE,
  UNIQUE KEY `ORDER_NO_INDEX` (`ORDER_NO`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
