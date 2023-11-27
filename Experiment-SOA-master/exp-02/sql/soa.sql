/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 80200
 Source Host           : localhost:3306
 Source Schema         : soa

 Target Server Type    : MySQL
 Target Server Version : 80200
 File Encoding         : 65001

 Date: 26/11/2023 00:45:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for borrow
-- ----------------------------
DROP TABLE IF EXISTS `borrow`;
CREATE TABLE `borrow`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `person_id` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '借用人员id',
  `thing_id` int NOT NULL COMMENT '借用物资id',
  `thing_quantity` int NOT NULL COMMENT '借用数量',
  `borrow_time` datetime NOT NULL COMMENT '借出时间',
  `latest_return_time` datetime NOT NULL COMMENT '最晚归还时间',
  `is_return` tinyint NOT NULL COMMENT '是否归还',
  `actual_return_time` datetime NULL DEFAULT NULL COMMENT '实际归还时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of borrow
-- ----------------------------

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person`  (
  `id` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '学工号',
  `name` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '姓名',
  `role` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '身份：本科生、研究生、教师',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES ('1', 'a', 'a');
INSERT INTO `person` VALUES ('string', 'string', 'string');
INSERT INTO `person` VALUES ('string1', 'string1', 'string1');

-- ----------------------------
-- Table structure for thing
-- ----------------------------
DROP TABLE IF EXISTS `thing`;
CREATE TABLE `thing`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '物资名称',
  `quantity` int NOT NULL COMMENT '剩余数量',
  `unit` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '单位：个、升、克，等等',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of thing
-- ----------------------------
INSERT INTO `thing` VALUES (1, '苹果', 80, '个');
INSERT INTO `thing` VALUES (2, '书本', 90, '本');
INSERT INTO `thing` VALUES (3, 'milk', 100, 'ml');

SET FOREIGN_KEY_CHECKS = 1;
