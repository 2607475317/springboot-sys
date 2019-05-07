/*
 Navicat Premium Data Transfer

 Source Server         : king
 Source Server Type    : MySQL
 Source Server Version : 50721
 Source Host           : localhost:3306
 Source Schema         : boot_demo

 Target Server Type    : MySQL
 Target Server Version : 50721
 File Encoding         : 65001

 Date: 06/03/2019 19:17:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tx_person
-- ----------------------------
DROP TABLE IF EXISTS `tx_person`;
CREATE TABLE `tx_person`  (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `pAddr` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `pname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `gender` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `birth` date DEFAULT NULL,
  PRIMARY KEY (`pid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tx_person
-- ----------------------------
INSERT INTO `tx_person` VALUES (1, 'www', '123', '北京', '李四a', '1', '1999-02-25');
INSERT INTO `tx_person` VALUES (2, '123', '321', '日照东港区', '张三a', '2', '2000-02-02');
INSERT INTO `tx_person` VALUES (3, '321', '123', '001', '王五', '1', '2016-02-07');
INSERT INTO `tx_person` VALUES (4, '东方', 'xxx', '上海', '东方不败', '2', '2018-06-08');
INSERT INTO `tx_person` VALUES (5, '111', '111111', '青岛黄岛区', '周吴', '1', '1998-05-04');
INSERT INTO `tx_person` VALUES (6, '999', '999', '1', '999', '1', '1111-02-08');
INSERT INTO `tx_person` VALUES (11, '666', '', '东港区', '张飞', '1', '1998-02-09');

-- ----------------------------
-- Table structure for tx_persona
-- ----------------------------
DROP TABLE IF EXISTS `tx_persona`;
CREATE TABLE `tx_persona`  (
  `p_id` int(11) NOT NULL,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `p_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `gender` int(255) DEFAULT NULL,
  `birth` date DEFAULT NULL,
  `p_addr` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`p_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tx_persona
-- ----------------------------
INSERT INTO `tx_persona` VALUES (1, '123', '123', '123', 1, '1999-02-05', '上海');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `role` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `createtime` date NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 41 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (11, '李庆照', '12344', '学生', '2018-09-11');
INSERT INTO `user` VALUES (12, 'al', '121221', '学生', '2018-08-11');
INSERT INTO `user` VALUES (13, '韩小虎', '12344', '学生', '2018-09-10');
INSERT INTO `user` VALUES (14, '狄云辉', '12345', '学生', '2018-09-01');
INSERT INTO `user` VALUES (15, '王鹏', '124434', '学生', '2018-09-09');
INSERT INTO `user` VALUES (16, '魏鹏', '12344', '学生', '2018-09-14');
INSERT INTO `user` VALUES (17, '吕老师', '123456', '老师', '2018-09-10');
INSERT INTO `user` VALUES (18, '李庆照', '123456', '管理员', '2018-09-09');
INSERT INTO `user` VALUES (19, '吕老师', '12344', '学生', '2018-09-11');
INSERT INTO `user` VALUES (21, '甘志伟', '12344', '学生', '2018-09-11');
INSERT INTO `user` VALUES (32, '夏平平', '123456', '学生', '2018-09-11');
INSERT INTO `user` VALUES (38, '', '', '学生', '2018-09-11');
INSERT INTO `user` VALUES (39, '', '', '学生', '2018-09-11');
INSERT INTO `user` VALUES (40, 'admin', '123456', '学生', '2018-09-11');

SET FOREIGN_KEY_CHECKS = 1;
