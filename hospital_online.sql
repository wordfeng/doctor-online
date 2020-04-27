/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50644
 Source Host           : localhost:3306
 Source Schema         : hospital_online

 Target Server Type    : MySQL
 Target Server Version : 50644
 File Encoding         : 65001

 Date: 27/04/2020 11:20:40
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '部门id',
  `dept_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '部门名',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 21 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES (1, '肠胃科');
INSERT INTO `dept` VALUES (2, '眼耳鼻喉科');
INSERT INTO `dept` VALUES (3, '消化内科');
INSERT INTO `dept` VALUES (4, '骨科');
INSERT INTO `dept` VALUES (5, '放射科');
INSERT INTO `dept` VALUES (6, '妇产科');
INSERT INTO `dept` VALUES (7, '眼科');
INSERT INTO `dept` VALUES (8, '心血管内科');
INSERT INTO `dept` VALUES (9, '肿瘤外科');
INSERT INTO `dept` VALUES (10, '胸外科');
INSERT INTO `dept` VALUES (11, '皮肤科');
INSERT INTO `dept` VALUES (12, '放疗科');
INSERT INTO `dept` VALUES (13, '眼科');
INSERT INTO `dept` VALUES (14, '肾脏科');
INSERT INTO `dept` VALUES (15, '肾脏内科');
INSERT INTO `dept` VALUES (16, '急诊内科');
INSERT INTO `dept` VALUES (17, '神经内科');
INSERT INTO `dept` VALUES (18, '口腔内科');
INSERT INTO `dept` VALUES (19, '针灸按摩科');
INSERT INTO `dept` VALUES (20, '急诊室');

-- ----------------------------
-- Table structure for emp
-- ----------------------------
DROP TABLE IF EXISTS `emp`;
CREATE TABLE `emp`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '员工唯一id',
  `username` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `experience` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '经历',
  `head_img` blob NULL COMMENT '头像',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `dept_id` int(255) NULL DEFAULT NULL COMMENT '外键部门id',
  `emp_job_id` int(11) NULL DEFAULT NULL COMMENT '职位id外键',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `deptid`(`dept_id`) USING BTREE,
  INDEX `jobid`(`emp_job_id`) USING BTREE,
  CONSTRAINT `deptid` FOREIGN KEY (`dept_id`) REFERENCES `dept` (`id`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `jobid` FOREIGN KEY (`emp_job_id`) REFERENCES `job` (`job_id`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '员工信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of emp
-- ----------------------------
INSERT INTO `emp` VALUES (1, '贾名', 'feng', 'yf0nuttiness@qq.com', '从事内科工作12年，主要研究脾胃病科、内分泌科疾病的中西医治疗，特别是脾胃病常见急症：如：消化道大出血、肝性脑病、肠梗塞、消化道溃疡等各种急慢性病的治疗。\r\n\r\n', 0x2E2E2F696D672F646F63746F722F6A69616D696E672E6A7067, NULL, 3, 1);

-- ----------------------------
-- Table structure for emp_role
-- ----------------------------
DROP TABLE IF EXISTS `emp_role`;
CREATE TABLE `emp_role`  (
  `emp_id` int(11) NULL DEFAULT NULL COMMENT '员工id',
  `role_id` int(11) NULL DEFAULT NULL COMMENT '角色id',
  INDEX `empid`(`emp_id`) USING BTREE,
  INDEX `roleids`(`role_id`) USING BTREE,
  CONSTRAINT `empid` FOREIGN KEY (`emp_id`) REFERENCES `emp` (`id`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `roleids` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '员工  角色对应表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of emp_role
-- ----------------------------
INSERT INTO `emp_role` VALUES (1, 2);

-- ----------------------------
-- Table structure for job
-- ----------------------------
DROP TABLE IF EXISTS `job`;
CREATE TABLE `job`  (
  `job_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '职位id',
  `job_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '职位名',
  PRIMARY KEY (`job_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 21 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of job
-- ----------------------------
INSERT INTO `job` VALUES (1, '主治医师');
INSERT INTO `job` VALUES (2, '实习生');
INSERT INTO `job` VALUES (3, '教授');
INSERT INTO `job` VALUES (4, '副教授');
INSERT INTO `job` VALUES (5, '专家');
INSERT INTO `job` VALUES (6, '主任');
INSERT INTO `job` VALUES (7, '副主任');
INSERT INTO `job` VALUES (8, '院长');
INSERT INTO `job` VALUES (9, '副院长');
INSERT INTO `job` VALUES (10, '名中医');
INSERT INTO `job` VALUES (11, '中医师');
INSERT INTO `job` VALUES (12, '主任中医师');
INSERT INTO `job` VALUES (13, '副主任中医师');
INSERT INTO `job` VALUES (14, '药师');
INSERT INTO `job` VALUES (15, '护士');
INSERT INTO `job` VALUES (16, '护士长');
INSERT INTO `job` VALUES (17, '捡药师');
INSERT INTO `job` VALUES (18, '设备支持');
INSERT INTO `job` VALUES (19, '技术支持');
INSERT INTO `job` VALUES (20, '器材管理');

-- ----------------------------
-- Table structure for privilege
-- ----------------------------
DROP TABLE IF EXISTS `privilege`;
CREATE TABLE `privilege`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '权限id',
  `privilege_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '权限名',
  `privilege_url` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '权限url',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '员工权限表管理权限' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of privilege
-- ----------------------------
INSERT INTO `privilege` VALUES (1, '员工管理', '/emp');
INSERT INTO `privilege` VALUES (2, '开药治疗', '/cure');

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色id',
  `role_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色名',
  `enabled` int(255) NULL DEFAULT NULL COMMENT '有效标志',
  `create_by` int(255) NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '员工角色表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES (1, '管理员', 1, 1, '2019-10-06 17:02:56');
INSERT INTO `role` VALUES (2, '医生', 1, 1, '2019-10-06 17:03:03');

-- ----------------------------
-- Table structure for role_privilege
-- ----------------------------
DROP TABLE IF EXISTS `role_privilege`;
CREATE TABLE `role_privilege`  (
  `role_id` int(11) NULL DEFAULT NULL COMMENT '角色id',
  `privilege_id` int(11) NULL DEFAULT NULL COMMENT '权限id',
  INDEX `roleid`(`role_id`) USING BTREE,
  INDEX `privilegeid`(`privilege_id`) USING BTREE,
  CONSTRAINT `privilegeid` FOREIGN KEY (`privilege_id`) REFERENCES `privilege` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `roleid` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '角色权限关系表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of role_privilege
-- ----------------------------
INSERT INTO `role_privilege` VALUES (1, 1);
INSERT INTO `role_privilege` VALUES (2, 2);

SET FOREIGN_KEY_CHECKS = 1;
