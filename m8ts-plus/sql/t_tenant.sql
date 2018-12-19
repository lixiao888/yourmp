/*
 Navicat Premium Data Transfer

 Source Server         : 172.0.16.135-dzbl
 Source Server Type    : MySQL
 Source Server Version : 100305
 Source Host           : 172.0.16.135:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 100305
 File Encoding         : 65001

 Date: 18/12/2018 13:42:49
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_tenant
-- ----------------------------
DROP TABLE IF EXISTS `t_tenant`;
CREATE TABLE `t_tenant`  (
  `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `tenant_id` bigint(20) NOT NULL COMMENT '租户ID',
  `name` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '姓名',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
