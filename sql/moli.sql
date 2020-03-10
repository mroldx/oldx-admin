/*
 Navicat Premium Data Transfer

 Source Server         : Moli
 Source Server Type    : MySQL
 Source Server Version : 50726
 Source Host           : localhost:3306
 Source Schema         : moli

 Target Server Type    : MySQL
 Target Server Version : 50726
 File Encoding         : 65001

 Date: 11/03/2020 04:13:35
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for eqwe
-- ----------------------------
DROP TABLE IF EXISTS `eqwe`;
CREATE TABLE `eqwe`  (
  `wqeq` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `23213` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of eqwe
-- ----------------------------
INSERT INTO `eqwe` VALUES (NULL, '11');
INSERT INTO `eqwe` VALUES (NULL, NULL);
INSERT INTO `eqwe` VALUES (NULL, NULL);

-- ----------------------------
-- Table structure for m_dept
-- ----------------------------
DROP TABLE IF EXISTS `m_dept`;
CREATE TABLE `m_dept`  (
  `dept_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '部门ID',
  `parent_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '上级部门ID',
  `dept_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '部门名字',
  `creat_time` datetime(0) NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`dept_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of m_dept
-- ----------------------------
INSERT INTO `m_dept` VALUES (1, '0', '研发部', '2019-09-24 15:38:41');
INSERT INTO `m_dept` VALUES (2, '1', '研发一部', '2019-09-13 15:39:08');
INSERT INTO `m_dept` VALUES (3, '1', '研发二部', '2019-09-24 15:43:51');
INSERT INTO `m_dept` VALUES (4, '0', '财务部', '2019-09-19 15:44:40');
INSERT INTO `m_dept` VALUES (5, '0', '人事部', '2019-09-21 15:44:55');
INSERT INTO `m_dept` VALUES (6, '0', '人工智能部', '2019-09-12 15:45:20');
INSERT INTO `m_dept` VALUES (7, '6', 'AI机器人部', '2019-09-21 15:45:36');
INSERT INTO `m_dept` VALUES (8, '6', 'AI家居部', '2019-09-10 15:46:35');
INSERT INTO `m_dept` VALUES (9, '2', '213', '2020-03-10 17:18:20');

-- ----------------------------
-- Table structure for m_menu
-- ----------------------------
DROP TABLE IF EXISTS `m_menu`;
CREATE TABLE `m_menu`  (
  `menu_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '菜单/按钮ID',
  `parent_id` bigint(20) NOT NULL COMMENT '上机菜单ID',
  `menu_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '菜单/按钮名称',
  `url` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '菜单URL',
  `perms` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '权限标识',
  `type` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '状态 0菜单 1按钮',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `modify_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`menu_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of m_menu
-- ----------------------------
INSERT INTO `m_menu` VALUES (1, 0, '系统管理', NULL, NULL, '0', '2019-09-20 16:55:03', '2019-09-20 16:42:35');
INSERT INTO `m_menu` VALUES (2, 0, '系统监控', NULL, NULL, '0', '2019-09-20 16:42:27', '2019-09-20 16:42:33');
INSERT INTO `m_menu` VALUES (3, 1, '用户管理', 'user', 'user:list', '0', '2019-09-21 16:43:43', '2019-09-20 16:43:48');
INSERT INTO `m_menu` VALUES (4, 1, '角色管理', 'role', 'role:list', '0', '2019-09-20 16:44:46', NULL);
INSERT INTO `m_menu` VALUES (5, 1, '菜单管理', 'menu', 'menu:list', '0', '2019-09-20 16:45:13', NULL);
INSERT INTO `m_menu` VALUES (6, 1, '部门管理', 'dpet', 'dept:list', '0', '2019-09-20 16:45:47', NULL);
INSERT INTO `m_menu` VALUES (7, 1, 'cms管理', 'cms', 'cms', '0', '2019-09-20 16:46:35', NULL);
INSERT INTO `m_menu` VALUES (8, 2, '在线用户', 'session', 'session:list', '0', '2019-09-20 16:47:08', NULL);
INSERT INTO `m_menu` VALUES (9, 2, '系统操作日志', 'system', 'system:log', '0', '2019-09-20 16:48:05', NULL);
INSERT INTO `m_menu` VALUES (10, 3, '新增用户', NULL, 'MUser:add', '1', '2019-09-20 16:49:10', NULL);
INSERT INTO `m_menu` VALUES (11, 3, '修改用户', NULL, 'MUser:update', '1', '2019-09-20 16:50:14', NULL);

-- ----------------------------
-- Table structure for m_role
-- ----------------------------
DROP TABLE IF EXISTS `m_role`;
CREATE TABLE `m_role`  (
  `role_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '角色ID',
  `role_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色名称',
  `description` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色描述',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `modify_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间啊',
  PRIMARY KEY (`role_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of m_role
-- ----------------------------
INSERT INTO `m_role` VALUES (1, '管理员', '创始人', '2019-09-20 16:53:32', NULL);
INSERT INTO `m_role` VALUES (2, '卑微测试', '测试人员', '2019-09-20 16:55:04', NULL);
INSERT INTO `m_role` VALUES (3, '一介草民', 'test', '2019-09-20 16:55:54', NULL);

-- ----------------------------
-- Table structure for m_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `m_role_menu`;
CREATE TABLE `m_role_menu`  (
  `role_id` bigint(20) NOT NULL COMMENT '角色id',
  `menu_id` bigint(20) NOT NULL COMMENT '权限id'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of m_role_menu
-- ----------------------------
INSERT INTO `m_role_menu` VALUES (1, 1);
INSERT INTO `m_role_menu` VALUES (1, 2);
INSERT INTO `m_role_menu` VALUES (1, 4);
INSERT INTO `m_role_menu` VALUES (1, 3);
INSERT INTO `m_role_menu` VALUES (1, 5);
INSERT INTO `m_role_menu` VALUES (1, 6);
INSERT INTO `m_role_menu` VALUES (1, 7);
INSERT INTO `m_role_menu` VALUES (1, 8);
INSERT INTO `m_role_menu` VALUES (1, 9);
INSERT INTO `m_role_menu` VALUES (1, 10);
INSERT INTO `m_role_menu` VALUES (1, 11);
INSERT INTO `m_role_menu` VALUES (2, 1);
INSERT INTO `m_role_menu` VALUES (2, 2);
INSERT INTO `m_role_menu` VALUES (2, 3);
INSERT INTO `m_role_menu` VALUES (2, 4);
INSERT INTO `m_role_menu` VALUES (2, 5);
INSERT INTO `m_role_menu` VALUES (2, 6);
INSERT INTO `m_role_menu` VALUES (2, 7);
INSERT INTO `m_role_menu` VALUES (2, 8);
INSERT INTO `m_role_menu` VALUES (3, 1);
INSERT INTO `m_role_menu` VALUES (3, 2);

-- ----------------------------
-- Table structure for m_user_log
-- ----------------------------
DROP TABLE IF EXISTS `m_user_log`;
CREATE TABLE `m_user_log`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '日志ID',
  `username` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '操作用户',
  `operation` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '操作内容',
  `time` decimal(11, 0) NULL DEFAULT NULL COMMENT '耗时',
  `method` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '操作方法',
  `params` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '方法参数',
  `ip` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '操作者IP',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `city` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '操作地点',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of m_user_log
-- ----------------------------

-- ----------------------------
-- Table structure for m_user_role
-- ----------------------------
DROP TABLE IF EXISTS `m_user_role`;
CREATE TABLE `m_user_role`  (
  `user_id` int(10) NOT NULL COMMENT '用户id',
  `role_id` int(10) NOT NULL COMMENT '角色id'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of m_user_role
-- ----------------------------
INSERT INTO `m_user_role` VALUES (2, 1);
INSERT INTO `m_user_role` VALUES (11, 2);

-- ----------------------------
-- Table structure for moli_user
-- ----------------------------
DROP TABLE IF EXISTS `moli_user`;
CREATE TABLE `moli_user`  (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `username` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `password` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户密码',
  `dept_id` bigint(20) NULL DEFAULT NULL COMMENT '部门ID',
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电子邮箱',
  `mobile` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系电话',
  `status` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '状态 0锁定 1有效',
  `create_time` datetime(0) NOT NULL COMMENT '注册时间',
  `modify_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `last_login_time` datetime(0) NULL DEFAULT NULL COMMENT '最近访问时间',
  `sex` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别 0男 1女',
  `icon` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '头像',
  `desciption` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of moli_user
-- ----------------------------
INSERT INTO `moli_user` VALUES (2, 'moli', '$2a$10$.WT6zam8FwPcxGM4Ln1n7uXEMuHGNrq4sO5DIcGgnoIzUant2L.xW', 1, '974751082@qq.com', '15146791589', '1', '2019-09-20 17:07:22', '2019-09-20 17:07:22', '2019-09-20 17:07:22', '0', NULL, '系统管理员');
INSERT INTO `moli_user` VALUES (11, 'test', '$2a$10$pw9sdjJ9JpmSGOpMfpD3ve3eDHoipVw69B4UhTKCWEUnGGjfGpzm.', 0, '147258369@qq.com', '1', '1', '2019-09-20 17:05:26', '2019-09-20 17:05:26', '2019-09-20 17:05:26', '1', '1', '测试');

SET FOREIGN_KEY_CHECKS = 1;
