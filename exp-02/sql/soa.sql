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

 Date: 27/11/2023 10:40:52
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
  `password` varchar(16) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of person
-- ----------------------------
BEGIN;
INSERT INTO `person` (`id`, `name`, `role`, `password`, `role_id`) VALUES ('0', 'root', 'root', 'root', 0);
INSERT INTO `person` (`id`, `name`, `role`, `password`, `role_id`) VALUES ('1', 'admin', 'admin', 'admin', 1);
INSERT INTO `person` (`id`, `name`, `role`, `password`, `role_id`) VALUES ('2', 'guest', 'guest', 'guest', 2);
INSERT INTO `person` (`id`, `name`, `role`, `password`, `role_id`) VALUES ('3', '1', 'guest', '1', 2);
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
