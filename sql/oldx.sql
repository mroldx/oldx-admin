/*
 Navicat Premium Data Transfer

 Source Server         : Moli
 Source Server Type    : MySQL
 Source Server Version : 50726
 Source Host           : localhost:3306
 Source Schema         : oldx

 Target Server Type    : MySQL
 Target Server Version : 50726
 File Encoding         : 65001

 Date: 04/05/2020 01:14:11
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for o_dept
-- ----------------------------
DROP TABLE IF EXISTS `o_dept`;
CREATE TABLE `o_dept`  (
  `dept_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '部门ID',
  `parent_id` bigint(20) NOT NULL COMMENT '上级部门ID',
  `dept_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '部门名称',
  `order_mun` bigint(20) NULL DEFAULT NULL COMMENT '排序',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`dept_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 39 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of o_dept
-- ----------------------------
INSERT INTO `o_dept` VALUES (1, 0, 'oldx-admin', 0, '2020-03-13 01:31:40');
INSERT INTO `o_dept` VALUES (2, 1, '产品研发部', 1, '2020-03-12 00:00:00');
INSERT INTO `o_dept` VALUES (3, 1, '人事部', 1, '2020-03-12 00:00:00');
INSERT INTO `o_dept` VALUES (4, 1, '财务部', 1, '2020-03-10 17:58:39');
INSERT INTO `o_dept` VALUES (34, 2, '研发一部', 2, '2020-03-12 22:33:02');
INSERT INTO `o_dept` VALUES (35, 2, 'OA研发项目组', 2, '2020-03-12 22:33:34');
INSERT INTO `o_dept` VALUES (36, 2, 'erp系统工具组', 2, '2020-03-12 22:34:05');
INSERT INTO `o_dept` VALUES (37, 3, '人力资源中心', 2, '2020-03-12 22:34:53');
INSERT INTO `o_dept` VALUES (38, 4, '财务一部', 2, '2020-03-12 22:35:18');

-- ----------------------------
-- Table structure for o_job
-- ----------------------------
DROP TABLE IF EXISTS `o_job`;
CREATE TABLE `o_job`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '岗位名称',
  `enabled` bit(1) NOT NULL COMMENT '岗位状态',
  `sort` bigint(20) NOT NULL COMMENT '岗位排序',
  `dept_id` bigint(20) NULL DEFAULT NULL COMMENT '部门ID',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建日期',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `FKmvhj0rogastlctflsxf1d6k3i`(`dept_id`) USING BTREE,
  CONSTRAINT `o_job_ibfk_1` FOREIGN KEY (`dept_id`) REFERENCES `dept` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 15 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '岗位' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of o_job
-- ----------------------------
INSERT INTO `o_job` VALUES (8, '人事专员', b'1', 3, 11, '2019-03-29 14:52:28');
INSERT INTO `o_job` VALUES (10, '产品经理', b'1', 4, 2, '2019-03-29 14:55:51');
INSERT INTO `o_job` VALUES (11, '全栈开发', b'1', 2, 2, '2019-03-31 13:39:30');
INSERT INTO `o_job` VALUES (12, '软件测试', b'1', 5, 2, '2019-03-31 13:39:43');
INSERT INTO `o_job` VALUES (13, '技术总监', b'1', 10, 2, '2020-03-11 00:48:59');
INSERT INTO `o_job` VALUES (14, '运维总监', b'1', 6, 5, '2020-03-11 00:49:59');

-- ----------------------------
-- Table structure for o_sys_log
-- ----------------------------
DROP TABLE IF EXISTS `o_sys_log`;
CREATE TABLE `o_sys_log`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '日志ID',
  `username` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '操作用户',
  `operation` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '操作内容',
  `time` decimal(11, 0) NULL DEFAULT NULL COMMENT '耗时',
  `method` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '操作方法',
  `params` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '方法参数',
  `ip` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '操作者IP',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `location` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '操作地点',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 92 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of o_sys_log
-- ----------------------------
INSERT INTO `o_sys_log` VALUES (76, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `o_sys_log` VALUES (77, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `o_sys_log` VALUES (78, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `o_sys_log` VALUES (79, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `o_sys_log` VALUES (80, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `o_sys_log` VALUES (81, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `o_sys_log` VALUES (82, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `o_sys_log` VALUES (83, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `o_sys_log` VALUES (84, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `o_sys_log` VALUES (85, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `o_sys_log` VALUES (86, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `o_sys_log` VALUES (87, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `o_sys_log` VALUES (88, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `o_sys_log` VALUES (89, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `o_sys_log` VALUES (90, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `o_sys_log` VALUES (91, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for o_sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `o_sys_menu`;
CREATE TABLE `o_sys_menu`  (
  `menu_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '菜单/按钮ID',
  `parent_id` bigint(20) NOT NULL COMMENT '上级菜单ID',
  `menu_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '菜单/按钮名称',
  `url` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '菜单URL',
  `perms` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '权限标识',
  `type` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '类型 0菜单 1按钮',
  `orderby_num` bigint(20) NULL DEFAULT NULL COMMENT '排序',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `modify_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`menu_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 15 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of o_sys_menu
-- ----------------------------
INSERT INTO `o_sys_menu` VALUES (1, 0, '系统管理', NULL, NULL, '0', 1, '2020-03-13 15:09:01', '2020-03-13 15:09:04');
INSERT INTO `o_sys_menu` VALUES (2, 0, '系统监控', NULL, NULL, '0', 2, '2020-03-13 15:09:21', '2020-03-13 15:09:26');
INSERT INTO `o_sys_menu` VALUES (3, 1, '用户管理', 'user', 'user:list', '0', 1, '2020-03-13 15:10:01', '2020-03-13 15:10:04');
INSERT INTO `o_sys_menu` VALUES (4, 1, '角色管理', 'role', 'role:list', '0', 2, '2020-03-13 15:10:49', '2020-03-13 15:10:52');
INSERT INTO `o_sys_menu` VALUES (5, 1, '部门管理', 'dept', 'dept:list', '0', 3, '2020-03-13 15:11:44', '2020-03-13 15:11:47');
INSERT INTO `o_sys_menu` VALUES (6, 1, '菜单管理', 'menu', 'menu:list', '0', 4, '2020-03-13 15:13:16', '2020-03-13 15:13:18');
INSERT INTO `o_sys_menu` VALUES (7, 2, '在线用户', 'session', 'session:list', '0', 1, '2020-03-13 15:14:33', '2020-03-13 15:14:35');
INSERT INTO `o_sys_menu` VALUES (8, 2, '系统日志', 'log', 'log:list', '0', 2, '2020-03-13 15:15:07', '2020-03-13 15:15:09');
INSERT INTO `o_sys_menu` VALUES (9, 3, '新增用户', NULL, 'user:add', '1', NULL, '2020-03-13 15:18:23', '2020-03-13 15:18:25');
INSERT INTO `o_sys_menu` VALUES (10, 3, '修改用户', NULL, 'user:update', '1', NULL, '2020-03-13 15:18:52', '2020-03-13 15:18:55');
INSERT INTO `o_sys_menu` VALUES (11, 3, '删除用户', NULL, 'user:delete', '1', NULL, '2020-03-13 15:19:24', '2020-03-13 15:19:27');
INSERT INTO `o_sys_menu` VALUES (12, 4, '新增角色', NULL, 'role:add', '1', NULL, '2020-03-13 15:20:21', '2020-03-13 15:20:25');
INSERT INTO `o_sys_menu` VALUES (13, 4, '修改角色', NULL, 'role:update', '1', NULL, '2020-03-13 15:20:57', '2020-03-13 15:21:01');
INSERT INTO `o_sys_menu` VALUES (14, 4, '删除角色', NULL, 'role:delete', '1', NULL, '2020-03-13 15:21:34', '2020-03-13 15:21:37');

-- ----------------------------
-- Table structure for o_sys_menu_role
-- ----------------------------
DROP TABLE IF EXISTS `o_sys_menu_role`;
CREATE TABLE `o_sys_menu_role`  (
  `role_id` bigint(20) NOT NULL COMMENT '角色ID',
  `menu_id` bigint(20) NOT NULL COMMENT '权限ID'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of o_sys_menu_role
-- ----------------------------
INSERT INTO `o_sys_menu_role` VALUES (1, 1);
INSERT INTO `o_sys_menu_role` VALUES (1, 3);
INSERT INTO `o_sys_menu_role` VALUES (1, 2);
INSERT INTO `o_sys_menu_role` VALUES (1, 4);
INSERT INTO `o_sys_menu_role` VALUES (1, 5);
INSERT INTO `o_sys_menu_role` VALUES (1, 6);
INSERT INTO `o_sys_menu_role` VALUES (1, 7);
INSERT INTO `o_sys_menu_role` VALUES (1, 8);
INSERT INTO `o_sys_menu_role` VALUES (1, 9);
INSERT INTO `o_sys_menu_role` VALUES (1, 10);
INSERT INTO `o_sys_menu_role` VALUES (1, 11);
INSERT INTO `o_sys_menu_role` VALUES (1, 12);
INSERT INTO `o_sys_menu_role` VALUES (1, 13);
INSERT INTO `o_sys_menu_role` VALUES (1, 14);
INSERT INTO `o_sys_menu_role` VALUES (2, 3);
INSERT INTO `o_sys_menu_role` VALUES (2, 7);

-- ----------------------------
-- Table structure for o_sys_role
-- ----------------------------
DROP TABLE IF EXISTS `o_sys_role`;
CREATE TABLE `o_sys_role`  (
  `id` bigint(32) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `role_name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色名称',
  `role_code` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色编码',
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '描述',
  `create_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `uniq_sys_role_role_code`(`role_code`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '角色表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of o_sys_role
-- ----------------------------
INSERT INTO `o_sys_role` VALUES (1, '管理员', 'admin', '系统管理员', 'oldx', '2020-03-13 01:20:24', '2020-03-13 15:51:40');
INSERT INTO `o_sys_role` VALUES (2, '普通员工', 'common', '一介草民', 'oldx', '2020-03-13 15:52:26', '2020-03-13 15:52:28');

-- ----------------------------
-- Table structure for o_sys_user
-- ----------------------------
DROP TABLE IF EXISTS `o_sys_user`;
CREATE TABLE `o_sys_user`  (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `username` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `password` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `dept_id` bigint(20) NULL DEFAULT NULL COMMENT '部门ID',
  `job_id` bigint(20) NULL DEFAULT NULL COMMENT '职位ID',
  `email` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `moble` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系电话',
  `status` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '状态 0锁定 1有效',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `modify_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `last_login_time` datetime(0) NULL DEFAULT NULL COMMENT '最近访问时间',
  `sex` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别 0男 1女',
  `AVATAR` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '头像',
  `DESCRIPTION` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1354567 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of o_sys_user
-- ----------------------------
INSERT INTO `o_sys_user` VALUES (1, 'oldx1', 'oldx', 2, 13, '974751082@qq.com', '110', '1', '2020-03-13 01:35:02', '2020-03-13 01:35:06', '2020-05-02 18:13:50', '1', NULL, '我是创始人·');
INSERT INTO `o_sys_user` VALUES (2, 'oldx', '$2a$10$Uen7Tqp1dG7CgopD9YX6w.jMvUGa1a5TL6IsXU/ZutXBLfwSh1yC6', NULL, NULL, NULL, NULL, '1', '2020-03-17 02:28:41', NULL, NULL, NULL, NULL, '管理员');
INSERT INTO `o_sys_user` VALUES (1354565, '12345', '$2a$10$nh2Jcda7h.TG4GxkEcITXeONVUdlO3aFGOsBu2Xm0mJbMhFhARezq', NULL, NULL, NULL, NULL, '1', '2020-03-17 00:33:23', NULL, NULL, NULL, NULL, '管理员');

-- ----------------------------
-- Table structure for o_sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `o_sys_user_role`;
CREATE TABLE `o_sys_user_role`  (
  `user_id` bigint(20) NOT NULL COMMENT '用户ID',
  `role_id` bigint(20) NOT NULL COMMENT '角色ID'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of o_sys_user_role
-- ----------------------------
INSERT INTO `o_sys_user_role` VALUES (1, 1);
INSERT INTO `o_sys_user_role` VALUES (2, 1);

SET FOREIGN_KEY_CHECKS = 1;
