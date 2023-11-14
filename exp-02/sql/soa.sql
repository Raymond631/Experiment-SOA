/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 50736 (5.7.36)
 Source Host           : 127.0.0.1:3306
 Source Schema         : soa

 Target Server Type    : MySQL
 Target Server Version : 50736 (5.7.36)
 File Encoding         : 65001

 Date: 14/11/2023 12:56:53
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for borrow
-- ----------------------------
DROP TABLE IF EXISTS `borrow`;
CREATE TABLE `borrow` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `person_id` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '借用人员id',
  `thing_id` int(11) NOT NULL COMMENT '借用物资id',
  `thing_quantity` int(11) NOT NULL COMMENT '借用数量',
  `borrow_time` datetime NOT NULL COMMENT '借出时间',
  `latest_return_time` datetime NOT NULL COMMENT '最晚归还时间',
  `is_return` tinyint(4) NOT NULL COMMENT '是否归还',
  `actual_return_time` datetime DEFAULT NULL COMMENT '实际归还时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ----------------------------
-- Records of borrow
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `id` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '学工号',
  `name` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '姓名',
  `role` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '身份：本科生、研究生、教师',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ----------------------------
-- Records of person
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for thing
-- ----------------------------
DROP TABLE IF EXISTS `thing`;
CREATE TABLE `thing` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `name` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '物资名称',
  `quantity` int(11) NOT NULL COMMENT '剩余数量',
  `unit` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '单位：个、升、克，等等',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ----------------------------
-- Records of thing
-- ----------------------------
BEGIN;
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
