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

 Date: 07/12/2018 17:37:12
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for WORKER_NODE
-- ----------------------------
DROP TABLE IF EXISTS `WORKER_NODE`;
CREATE TABLE `WORKER_NODE`  (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'auto increment id',
  `HOST_NAME` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT 'host name',
  `PORT` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT 'port',
  `TYPE` int(11) NOT NULL COMMENT 'node type: ACTUAL or CONTAINER',
  `LAUNCH_DATE` date NOT NULL COMMENT 'launch date',
  `MODIFIED` timestamp(0) NOT NULL DEFAULT current_timestamp(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT 'modified time',
  `CREATED` timestamp(0) NOT NULL COMMENT 'created time',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = 'DB WorkerID Assigner for UID Generator' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
