/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : car_home

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2019-10-14 11:13:09
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `car_basicparam_propertyvalue`
-- ----------------------------
DROP TABLE IF EXISTS `car_basicparam_propertyvalue`;
CREATE TABLE `car_basicparam_propertyvalue` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '基本参数属性值id',
  `ccategory_id` int(11) DEFAULT NULL COMMENT '三级分类的id',
  `manufacturer` varchar(30) DEFAULT NULL COMMENT '厂商',
  `rank` varchar(30) DEFAULT NULL COMMENT '级别',
  `energy_type` varchar(30) DEFAULT NULL COMMENT '能源类型',
  `environmental_protection` varchar(30) DEFAULT NULL COMMENT '环保标准',
  `mark_time` date DEFAULT NULL COMMENT '上市时间',
  `max_power` int(11) DEFAULT NULL COMMENT '最大功率',
  `max_torque` int(11) DEFAULT NULL COMMENT '最大扭矩',
  `engine` varchar(30) DEFAULT NULL COMMENT '发动机',
  `gearbox` varchar(30) DEFAULT NULL COMMENT '变速箱',
  `length_width_height` varchar(30) DEFAULT NULL COMMENT '长*宽*高(mm)',
  `body_structure` varchar(30) DEFAULT NULL COMMENT '车身结构',
  `maximum_speed` double(11,0) DEFAULT NULL COMMENT '最高车速(km/h)',
  `official_speed` double(11,0) DEFAULT NULL COMMENT '官方0-100km/h加速(s)',
  `measured_speed` double(11,0) DEFAULT NULL COMMENT '实测0-100km/h加速(s)',
  `measured_braking` double(15,2) DEFAULT NULL COMMENT '实测0-100km/h制动(m)',
  `cfcomoiat` double(15,2) DEFAULT NULL COMMENT '工信部综合油耗(L/100km)',
  `measured_consumption` double(15,2) DEFAULT NULL COMMENT '实测油耗(L/100km)',
  `vehicle_warranty` varchar(30) DEFAULT NULL COMMENT '整车质保',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of car_basicparam_propertyvalue
-- ----------------------------
INSERT INTO `car_basicparam_propertyvalue` VALUES ('4', '47', 'Jeep(进口)', '中型SUV', '汽油', '国V', '2019-04-01', '195', '400', '2.0T 266马力 L4', '8档手自一体', '4334*1894*1839', '2门4座SUV', '0', '0', '0', '0.00', '8.90', '9.00', '三年或8万公里');
INSERT INTO `car_basicparam_propertyvalue` VALUES ('5', '46', '沃尔沃亚太', '紧凑型SUV', '汽油', '国VI', '2019-05-01', '120', '265', '1.5T 165马力L3', '8档手自一体', '4425*1863*1652', '5门5座SUV', '195', '10', '0', '0.00', '6.60', '0.00', '三年不限公里');
INSERT INTO `car_basicparam_propertyvalue` VALUES ('6', '46', '沃尔沃亚太', '紧凑型SUV', '汽油', '国VI', '2019-05-01', '120', '265', '2.0T 190马力L4', '8档手自一体', '4425*1863*1652', '5门5座SUV', '210', '8', '0', '0.00', '7.40', '0.00', '三年不限公里');
INSERT INTO `car_basicparam_propertyvalue` VALUES ('7', '47', 'Jeep(进口)', '中型SUV', '汽油', '国V', '2019-10-16', '195', '400', '2.0T 266马力 L4', '8档手自一体', '4334*1894*1839', '2门4座SUV', '0', '0', '0', '0.00', '8.90', '9.00', '三年或8万公里');

-- ----------------------------
-- Table structure for `car_bodywork_propertyvalue`
-- ----------------------------
DROP TABLE IF EXISTS `car_bodywork_propertyvalue`;
CREATE TABLE `car_bodywork_propertyvalue` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ccategory_id` int(11) DEFAULT NULL COMMENT '三级种类id',
  `length` bigint(20) DEFAULT NULL COMMENT '长度(mm)',
  `width` bigint(20) DEFAULT NULL COMMENT '宽度',
  `height` bigint(20) DEFAULT NULL COMMENT '高度(mm)',
  `wheelbase` bigint(20) DEFAULT NULL COMMENT '轴距(mm)',
  `frontgauge` bigint(20) DEFAULT NULL COMMENT '前轮距(mm)',
  `trackrear` bigint(20) DEFAULT NULL COMMENT '后轮距(mm)',
  `minimumgroundclearance` bigint(20) DEFAULT NULL COMMENT '最小离地间隙(mm)',
  `bodystructure` varchar(30) DEFAULT NULL COMMENT '车身结构',
  `doornumber` bigint(11) DEFAULT NULL COMMENT '车门个数(个)',
  `seating` bigint(11) DEFAULT NULL COMMENT '座位数(个)',
  `oiltankcapacity` bigint(11) DEFAULT NULL COMMENT '邮箱容积(L)',
  `capacityofbaggagecompartment` bigint(11) DEFAULT NULL COMMENT '行李厢容积(L)',
  `curbweight` bigint(11) DEFAULT NULL COMMENT '整备质量(kg)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of car_bodywork_propertyvalue
-- ----------------------------
INSERT INTO `car_bodywork_propertyvalue` VALUES ('4', '47', '4334', '1894', '1839', '2549', '1598', '1598', '251', 'SUV', '2', '4', '70', '0', '1843');
INSERT INTO `car_bodywork_propertyvalue` VALUES ('5', '46', '4425', '1863', '1652', '2702', '0', '0', '211', 'SUV', '5', '5', '460', '0', '1635');

-- ----------------------------
-- Table structure for `car_car`
-- ----------------------------
DROP TABLE IF EXISTS `car_car`;
CREATE TABLE `car_car` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '汽车id',
  `ccategory_id` int(11) DEFAULT NULL COMMENT '三级分类id',
  `name` varchar(25) DEFAULT NULL COMMENT '汽车名',
  `vendorquot` double(15,0) DEFAULT NULL COMMENT '厂商报价',
  `Dealerquot` double(15,0) DEFAULT NULL COMMENT '经销商报价',
  `output` int(11) DEFAULT NULL COMMENT '汽车产量',
  `state` int(5) DEFAULT NULL COMMENT '汽车状态 出售1 停售0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of car_car
-- ----------------------------
INSERT INTO `car_car` VALUES ('8', '47', '2019款 2.0T Sahara 两门版', '43', '43', '1000', '1');
INSERT INTO `car_car` VALUES ('9', '47', '2019款 2.0T Rubicon 两门版', '49', '49', '1000', '1');
INSERT INTO `car_car` VALUES ('10', '47', '2019款 2.0T Sahara 四门版', '46', '46', '1000', '1');
INSERT INTO `car_car` VALUES ('11', '47', '2019款 2.0T Sahara 四门炫顶版', '46', '46', '1000', '1');
INSERT INTO `car_car` VALUES ('12', '47', '2019款 2.0T Sahara 四门电动敞篷版', '48', '48', '1000', '1');
INSERT INTO `car_car` VALUES ('13', '46', '2020款 T3 智行时尚版', '26', '24', '1000', '1');

-- ----------------------------
-- Table structure for `car_category`
-- ----------------------------
DROP TABLE IF EXISTS `car_category`;
CREATE TABLE `car_category` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '汽车种类id',
  `parent_id` int(11) DEFAULT NULL COMMENT '父级id',
  `name` varchar(20) DEFAULT NULL COMMENT '种类名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=103 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of car_category
-- ----------------------------
INSERT INTO `car_category` VALUES ('1', null, '热门车');
INSERT INTO `car_category` VALUES ('2', null, '豪华车');
INSERT INTO `car_category` VALUES ('3', null, '小型/其他');
INSERT INTO `car_category` VALUES ('4', null, '商用车');
INSERT INTO `car_category` VALUES ('5', '1', 'SUV');
INSERT INTO `car_category` VALUES ('6', '1', '紧凑车型');
INSERT INTO `car_category` VALUES ('7', '1', '中型车');
INSERT INTO `car_category` VALUES ('8', '2', '大型车');
INSERT INTO `car_category` VALUES ('9', '2', '中大型车');
INSERT INTO `car_category` VALUES ('10', '2', '跑车');
INSERT INTO `car_category` VALUES ('11', '3', '小型车');
INSERT INTO `car_category` VALUES ('12', '3', 'MPV');
INSERT INTO `car_category` VALUES ('13', '3', '微型车');
INSERT INTO `car_category` VALUES ('14', '4', '微面');
INSERT INTO `car_category` VALUES ('15', '4', '皮卡');
INSERT INTO `car_category` VALUES ('16', '4', '轻客');
INSERT INTO `car_category` VALUES ('24', '5', '哈弗H6');
INSERT INTO `car_category` VALUES ('25', '5', '胜达');
INSERT INTO `car_category` VALUES ('26', '5', '汉兰达');
INSERT INTO `car_category` VALUES ('27', '5', '名爵HS');
INSERT INTO `car_category` VALUES ('28', '5', '奥迪Q5L');
INSERT INTO `car_category` VALUES ('29', '5', '揽胜极光');
INSERT INTO `car_category` VALUES ('30', '5', '奔驰GLC');
INSERT INTO `car_category` VALUES ('31', '5', '哈弗H9');
INSERT INTO `car_category` VALUES ('32', '5', '普拉多');
INSERT INTO `car_category` VALUES ('33', '5', '宝马X3');
INSERT INTO `car_category` VALUES ('34', '5', '本田CR-V');
INSERT INTO `car_category` VALUES ('35', '5', '凯迪拉克XT6');
INSERT INTO `car_category` VALUES ('36', '5', '探岳');
INSERT INTO `car_category` VALUES ('37', '5', 'RAV4荣放');
INSERT INTO `car_category` VALUES ('38', '5', '宝马X5');
INSERT INTO `car_category` VALUES ('39', '5', '途观L');
INSERT INTO `car_category` VALUES ('40', '5', '途昂');
INSERT INTO `car_category` VALUES ('41', '5', '锐界');
INSERT INTO `car_category` VALUES ('42', '5', '沃尔沃XC60');
INSERT INTO `car_category` VALUES ('43', '5', 'Cayenne');
INSERT INTO `car_category` VALUES ('44', '5', '奥迪Q7');
INSERT INTO `car_category` VALUES ('45', '5', '探岳');
INSERT INTO `car_category` VALUES ('46', '5', '沃尔沃XC40');
INSERT INTO `car_category` VALUES ('47', '5', '牧马人');
INSERT INTO `car_category` VALUES ('48', '6', '轩逸');
INSERT INTO `car_category` VALUES ('49', '6', '卡罗拉');
INSERT INTO `car_category` VALUES ('50', '6', '思域');
INSERT INTO `car_category` VALUES ('51', '6', '名爵6');
INSERT INTO `car_category` VALUES ('52', '6', '朗逸');
INSERT INTO `car_category` VALUES ('53', '6', '速腾');
INSERT INTO `car_category` VALUES ('54', '6', '领克03');
INSERT INTO `car_category` VALUES ('55', '6', '福克斯');
INSERT INTO `car_category` VALUES ('56', '6', '高尔夫');
INSERT INTO `car_category` VALUES ('57', '6', '雷凌');
INSERT INTO `car_category` VALUES ('58', '6', '宝来');
INSERT INTO `car_category` VALUES ('59', '6', '奥迪A3');
INSERT INTO `car_category` VALUES ('60', '6', '菲斯塔');
INSERT INTO `car_category` VALUES ('61', '6', '马自达3 昂克赛拉');
INSERT INTO `car_category` VALUES ('62', '6', '奔驰A级');
INSERT INTO `car_category` VALUES ('63', '6', '领动');
INSERT INTO `car_category` VALUES ('64', '6', '凌派');
INSERT INTO `car_category` VALUES ('65', '6', '英朗');
INSERT INTO `car_category` VALUES ('66', '6', '宝马1系');
INSERT INTO `car_category` VALUES ('67', '6', '凌渡');
INSERT INTO `car_category` VALUES ('68', '6', '捷达');
INSERT INTO `car_category` VALUES ('69', '6', '逸动');
INSERT INTO `car_category` VALUES ('70', '6', '高尔夫(进口)');
INSERT INTO `car_category` VALUES ('71', '6', '秦Pro');
INSERT INTO `car_category` VALUES ('72', '7', '宝马3系');
INSERT INTO `car_category` VALUES ('73', '7', '奥迪A4L');
INSERT INTO `car_category` VALUES ('74', '7', '雅阁');
INSERT INTO `car_category` VALUES ('75', '7', '帕萨特');
INSERT INTO `car_category` VALUES ('76', '7', '凯美瑞');
INSERT INTO `car_category` VALUES ('77', '7', '奔驰C级');
INSERT INTO `car_category` VALUES ('78', '7', '迈腾');
INSERT INTO `car_category` VALUES ('79', '7', '阿特兹');
INSERT INTO `car_category` VALUES ('80', '7', '天籁');
INSERT INTO `car_category` VALUES ('81', '7', '亚洲龙');
INSERT INTO `car_category` VALUES ('82', '7', '君威');
INSERT INTO `car_category` VALUES ('83', '7', '凯迪拉克ATS-L');
INSERT INTO `car_category` VALUES ('84', '7', '沃尔沃V60');
INSERT INTO `car_category` VALUES ('85', '7', '迈锐宝XL');
INSERT INTO `car_category` VALUES ('86', '7', '一汽-大众CC');
INSERT INTO `car_category` VALUES ('87', '7', '君越');
INSERT INTO `car_category` VALUES ('88', '7', 'Model 3(进口)');
INSERT INTO `car_category` VALUES ('89', '7', '奥迪A5');
INSERT INTO `car_category` VALUES ('90', '7', 'INSPIRE');
INSERT INTO `car_category` VALUES ('91', '7', '捷豹XEL');
INSERT INTO `car_category` VALUES ('92', '7', '传祺GA6');
INSERT INTO `car_category` VALUES ('93', '7', '速派');
INSERT INTO `car_category` VALUES ('94', '7', '金牛座');
INSERT INTO `car_category` VALUES ('95', '7', '奥迪A4(进口)');
INSERT INTO `car_category` VALUES ('97', '96', '紧凑型车');
INSERT INTO `car_category` VALUES ('98', '96', '中型车');
INSERT INTO `car_category` VALUES ('99', '96', 'SUV');
INSERT INTO `car_category` VALUES ('100', '99', '普拉多');
INSERT INTO `car_category` VALUES ('101', '99', '汉兰达');
INSERT INTO `car_category` VALUES ('102', '99', '锐志');

-- ----------------------------
-- Table structure for `car_chassissteering_propertyvalue`
-- ----------------------------
DROP TABLE IF EXISTS `car_chassissteering_propertyvalue`;
CREATE TABLE `car_chassissteering_propertyvalue` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ccategory_id` int(11) DEFAULT NULL COMMENT '三级分类id',
  `drivemode` varchar(30) DEFAULT NULL COMMENT '驱动方式',
  `allwheeldriveform` varchar(30) DEFAULT NULL COMMENT '四驱形式',
  `centraldifferentialstructure` varchar(30) DEFAULT NULL COMMENT '中央差速器结构',
  `frontsuspensiontype` varchar(30) DEFAULT NULL COMMENT '前悬架类型',
  `rearsuspensiontype` varchar(30) DEFAULT NULL COMMENT '后悬架类型',
  `powertype` varchar(30) DEFAULT NULL COMMENT '助力类型',
  `bodystructure` varchar(30) DEFAULT NULL COMMENT '车体结构',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='底盘转向';

-- ----------------------------
-- Records of car_chassissteering_propertyvalue
-- ----------------------------
INSERT INTO `car_chassissteering_propertyvalue` VALUES ('3', '47', '前置四驱', '分时四驱', '', '多连杆整体桥式', '多连杆整体桥式', '电子液压助力', '非承载式');
INSERT INTO `car_chassissteering_propertyvalue` VALUES ('4', '46', '前置前驱', '', '', '麦弗逊式独立悬架', '多连杆式独立悬架', '电动助力', '承载式');
INSERT INTO `car_chassissteering_propertyvalue` VALUES ('5', '46', '前置四驱', '全时四驱', '多片离合器', '麦弗逊式独立悬架', '多连杆式独立悬架', '电动助力', '承载式');

-- ----------------------------
-- Table structure for `car_engine_propertyvalue`
-- ----------------------------
DROP TABLE IF EXISTS `car_engine_propertyvalue`;
CREATE TABLE `car_engine_propertyvalue` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `ccategory_id` bigint(11) DEFAULT NULL COMMENT '三级分类id',
  `engineype` varchar(30) DEFAULT NULL COMMENT '发动机型号',
  `displacement` bigint(11) DEFAULT NULL COMMENT '排量(ml)',
  `airintakeform` varchar(30) DEFAULT NULL COMMENT '进气形式',
  `cylinderarrangement` varchar(30) DEFAULT NULL COMMENT '气缸排列形式',
  `numberofcylinders` bigint(11) DEFAULT NULL COMMENT '气缸数(个)',
  `numberofvalvespercylinder` bigint(11) DEFAULT NULL COMMENT '每缸气门数(个)',
  `compressionratio` varchar(30) DEFAULT NULL COMMENT '压缩比',
  `valvemechanism` varchar(30) DEFAULT NULL COMMENT '配气机构',
  `cylinderdiameter` bigint(11) DEFAULT NULL COMMENT '缸径(mm)',
  `journey` bigint(11) DEFAULT NULL COMMENT '行程(mm)',
  `maxhp` int(11) DEFAULT NULL COMMENT '最大马力(kw)',
  `maximumpower` double(11,0) DEFAULT NULL COMMENT '最大功率(kw)',
  `maximumpowerspeed` bigint(11) DEFAULT NULL COMMENT '最大功率转速(rpm)',
  `enginespecifictechnology` varchar(30) DEFAULT NULL COMMENT '发动机特有技术',
  `fuelform` varchar(30) DEFAULT NULL COMMENT '燃料形式',
  `fuellabel` varchar(30) DEFAULT NULL COMMENT '燃油标号',
  `oilsupplyway` varchar(30) DEFAULT NULL COMMENT '供油方式',
  `cylinderheadmaterial` varchar(30) DEFAULT NULL COMMENT '缸盖材料',
  `cylinderbodymaterial` varchar(30) DEFAULT NULL COMMENT '缸体材料',
  `environmentalstandard` varchar(30) DEFAULT NULL COMMENT '环保标准',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='发动机';

-- ----------------------------
-- Records of car_engine_propertyvalue
-- ----------------------------
INSERT INTO `car_engine_propertyvalue` VALUES ('3', '47', '15S4C', '1995', '2.0', '涡轮增压', '4', '4', '10', 'DOHC', '0', '0', '266', '195', '5000', '', '汽油', '95号', '直喷', '铝合金', '铝合金', '国V');
INSERT INTO `car_engine_propertyvalue` VALUES ('4', '46', 'B3154T2', '1477', '涡轮增压', 'L', '3', '4', '', 'DOHC', '0', '0', '163', '120', '5500', '', '汽油', '95号', '直喷', '铝合金', '铝合金', '国VI');

-- ----------------------------
-- Table structure for `car_gearbox_propertyvalue`
-- ----------------------------
DROP TABLE IF EXISTS `car_gearbox_propertyvalue`;
CREATE TABLE `car_gearbox_propertyvalue` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ccategory_id` int(11) DEFAULT NULL COMMENT '三级分类id',
  `blocknumber` int(11) DEFAULT NULL COMMENT '挡位个数',
  `gearboxtype` varchar(30) DEFAULT NULL COMMENT '变速箱类型',
  `forshort` varchar(30) DEFAULT NULL COMMENT '简称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='变速箱';

-- ----------------------------
-- Records of car_gearbox_propertyvalue
-- ----------------------------
INSERT INTO `car_gearbox_propertyvalue` VALUES ('2', '47', '8', '手自一体变速箱(AT)', '8档手自一体');
INSERT INTO `car_gearbox_propertyvalue` VALUES ('3', '46', '8', '手自一体变速箱(AT)', '8档手自一体');

-- ----------------------------
-- Table structure for `car_image`
-- ----------------------------
DROP TABLE IF EXISTS `car_image`;
CREATE TABLE `car_image` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '汽车图片id',
  `ccar_id` int(11) DEFAULT NULL COMMENT '汽车id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of car_image
-- ----------------------------
INSERT INTO `car_image` VALUES ('21', '8');
INSERT INTO `car_image` VALUES ('23', '9');
INSERT INTO `car_image` VALUES ('24', '10');
INSERT INTO `car_image` VALUES ('26', '10');
INSERT INTO `car_image` VALUES ('27', '10');
INSERT INTO `car_image` VALUES ('29', '10');
INSERT INTO `car_image` VALUES ('30', '10');
INSERT INTO `car_image` VALUES ('31', '11');
INSERT INTO `car_image` VALUES ('33', '11');
INSERT INTO `car_image` VALUES ('34', '11');
INSERT INTO `car_image` VALUES ('35', '11');
INSERT INTO `car_image` VALUES ('37', '11');
INSERT INTO `car_image` VALUES ('38', '12');
INSERT INTO `car_image` VALUES ('39', '12');
INSERT INTO `car_image` VALUES ('40', '12');
INSERT INTO `car_image` VALUES ('41', '12');
INSERT INTO `car_image` VALUES ('42', '12');
INSERT INTO `car_image` VALUES ('43', '13');
INSERT INTO `car_image` VALUES ('44', '13');
INSERT INTO `car_image` VALUES ('45', '13');
INSERT INTO `car_image` VALUES ('46', '13');
INSERT INTO `car_image` VALUES ('48', '13');

-- ----------------------------
-- Table structure for `car_manipulation_peopertyvalue`
-- ----------------------------
DROP TABLE IF EXISTS `car_manipulation_peopertyvalue`;
CREATE TABLE `car_manipulation_peopertyvalue` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ccategory_id` int(11) DEFAULT NULL COMMENT '三级分类id',
  `parkingradar` varchar(30) DEFAULT NULL COMMENT '前/后驻车雷达',
  `auxiliaryimage` varchar(30) DEFAULT NULL COMMENT '驾驶辅助影像',
  `backawacssystem` varchar(30) DEFAULT NULL COMMENT '倒车车侧预警系统',
  `cruisesystem` varchar(30) DEFAULT NULL COMMENT '巡航系统',
  `patternswitch` varchar(30) DEFAULT NULL COMMENT '驾驶模式切换',
  `autoparkina` varchar(30) DEFAULT NULL COMMENT '自动泊车入位',
  `enginestartandstoptechnology` varchar(30) DEFAULT NULL COMMENT '发动机启停技术',
  `autobreak` varchar(30) DEFAULT NULL COMMENT '自动驻车',
  `uphillassist` varchar(30) DEFAULT NULL COMMENT '上坡辅助',
  `abruptslowdescent` varchar(30) DEFAULT NULL COMMENT '陡坡缓降',
  `variablesuspension` varchar(30) DEFAULT NULL COMMENT '可变悬架功能',
  `airsuspension` varchar(30) DEFAULT NULL COMMENT '空气悬架',
  `batteryinducedsuspension` varchar(30) DEFAULT NULL COMMENT '电池感应悬架',
  `variablesteerratio` varchar(30) DEFAULT NULL COMMENT '可变转向比',
  `centraldifferentiallocking` varchar(30) DEFAULT NULL COMMENT '中央差速器锁止功能',
  `integralactivesteer` varchar(30) DEFAULT NULL COMMENT '整体主动转向系统',
  `differentlock` varchar(30) DEFAULT NULL COMMENT '限滑差速器/差速锁',
  `wadsensor` varchar(30) DEFAULT NULL COMMENT '涉水感应系统',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='辅助/操控配置';

-- ----------------------------
-- Records of car_manipulation_peopertyvalue
-- ----------------------------
INSERT INTO `car_manipulation_peopertyvalue` VALUES ('6', '47', '前- / 后*', '倒车影像', '-', '定速巡航', '越野', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-');
INSERT INTO `car_manipulation_peopertyvalue` VALUES ('7', '47', '前* / 后*', '倒车影像', '定速巡航', '越野', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '*前桥限滑差速器 *后桥限滑差速器', '');
INSERT INTO `car_manipulation_peopertyvalue` VALUES ('8', '46', '前*/后*', '倒车影像', '', '定速巡航', '*运动 *经济 *标准/舒适 *越野', '', '', '', '', '', '', '', '', '', '', '', '', '');

-- ----------------------------
-- Table structure for `car_mark`
-- ----------------------------
DROP TABLE IF EXISTS `car_mark`;
CREATE TABLE `car_mark` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '汽车标志id',
  `name` varchar(20) DEFAULT NULL COMMENT '汽车标志名字',
  `source` varchar(1000) DEFAULT NULL COMMENT '标志由来',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of car_mark
-- ----------------------------
INSERT INTO `car_mark` VALUES ('10', '奥迪AUDI', '奥迪轿车的标志为四个圆环，代表着合并前的四家公司。这些公司曾经是自行车、摩托车及小客车的生产厂家。由于该公司原是由4家公司合并而成，因此每一环都是其中一个公司的象征。');
INSERT INTO `car_mark` VALUES ('11', '奔驰BENZ', '1909年6月戴姆勒公司申请登记了三叉星做为轿车的标志，象征着陆上、水上和空中的机械化。1916年在它的四周加上了一个圆圈，在圆的上方镶嵌了4个小星，下面有梅赛德斯“Mercedes”字样。“梅赛德斯”是幸福的意思，意为戴姆勒生产的汽车将为车主们带来幸福。');
INSERT INTO `car_mark` VALUES ('12', '大众VOLKSWAGEN', '大众汽车公司的德文Volks Wagenwerk，意为大众使用的汽车，标志中的VW为全称中头一个字母。标志像是由三个用中指和食指作出的“V”组成，表示大众公司及其产品必胜－必胜－必胜。');
INSERT INTO `car_mark` VALUES ('13', '丰田TOYOTA', '丰田公司的三个椭圆的标志是从1990年初开始使用的。标志中的大椭圆代表地球，中间由两个椭圆垂直组合成一个T字，代表丰田公司。它象征丰田公司立足于未来，对未来的信心和雄心，还象征着丰田公司立足于顾客，对顾客的保证，象征着用户的心和汽车厂家的心是连在一起的，具有相互信赖感，同时喻示着丰田的高超技术和革新潜力。');
INSERT INTO `car_mark` VALUES ('14', '福特FORD', '福特汽车的标志是采用福特英文Ford字样，蓝底白字。由于创建人亨利·福特喜欢小动物，所以标志设计者把福特的英文画成一只小白兔样子的图案。');
INSERT INTO `car_mark` VALUES ('15', '宝马BMW', '宝马标志中间的蓝白相间图案，代表蓝天，白云和旋转不停的螺旋浆，喻示宝马公司渊源悠久的历史，象征该公司过去在航空发动机技术方面的领先地位，又象征公司 一贯宗旨和目标：在广阔的时空中，以先进的精湛技术、最新的观念，满足顾客的最大愿望，反映了公司蓬勃向上的气势和日新月异的新面貌。');
INSERT INTO `car_mark` VALUES ('16', '劳斯莱斯ROLLS-ROYCE', '劳斯莱斯汽车的标志图案采用两个“R”重叠在一起，象征着你中有我，我中有你，体现了两人融洽及和谐的关系。\n');
INSERT INTO `car_mark` VALUES ('17', '劳斯莱斯ROLLS-ROYCE', '劳斯莱斯的标志除了双R之外，还有著名的飞人标志。这个标志的创意取自巴黎卢浮宫艺术品走廊的一尊有两千年历史的胜利女神雕像，她庄重高贵的身姿是艺 术家们产生激情的源泉。当汽车艺术品大师查尔斯·塞克斯应邀为罗尔斯·罗易斯汽车公司设计标志时，深深印在他脑海中的女神像立刻使他产生创作灵感。于是一 个两臂后伸，身带披纱的女神像飘然而至。');
INSERT INTO `car_mark` VALUES ('18', '法拉利FERRARI', '法 拉利车的标志是一匹跃起的马。在第一次世界大战中意大利有一位表现非常出色的飞行员；他的飞机上就有这样一匹会给他带来好运气的跃马。在法拉利最初的赛车 比赛获胜后，该飞行员的父母亲——一对伯爵夫妇建议：法拉利也应在车上印上这匹带来好运气的跃马。后来这位飞行员战死了，马就变成了黑颜色；而标志底色为 公司所在地摩德纳的金丝雀的颜色。');
INSERT INTO `car_mark` VALUES ('19', '标致PEUGEOT', '标致汽车公司的前身，是19世纪初标致家族皮埃尔兄弟开办的一家生产拉锯、弹簧等铁制工具的小作坊。这些铁制品的商标是一个威武的雄狮，它是公司所在地弗南 修·昆蒂省的标志，有不可征服的喻意。体现了标致拉锯的三大优点：锯齿象雄狮的牙齿久经耐磨、锯身象狮子的脊梁骨富有弹性、拉锯的性能象狮子一样所向无阻。当1890年，第一辆标致汽车问世时，为表明它的高品质，公司决定仍沿用“雄狮”商标。');
INSERT INTO `car_mark` VALUES ('20', '阿斯顿·马丁ASTONMARTIN', '阿斯顿·马丁汽车标志为一只展翅飞翔的大鹏，分别注有奥斯顿、马丁英文字样。喻示该公司象大鹏一样，具有从天而降的冲刺速度和远大的志向。');
INSERT INTO `car_mark` VALUES ('21', '本特利（宾利）Bentley', '欧文·本特利1919年生产第一辆四汽缸赛车时车上就带有一个徽章，上面是一对隼鹰翅膀簇拥着本特利的开头字母“B”。现在四汽缸汽车已不再生产，而 “B”字徽章仍是本特利的象征。本特利轿车标志是以公司名的第一个字母“B”为主体，生出一对翅膀，似凌空翱翔的雄鹰，此标志一直沿用至今。');
INSERT INTO `car_mark` VALUES ('22', '林肯LINCOLN', '林肯汽车是福特汽车公司拥有的第二个品牌。镶嵌在车头正中长形围绕的十字星，象征着尊严和庄重。林肯汽车公司是亨利·利兰先生于1907年创立的，1922年被福特汽车公司收购。初期以生产飞机发动机为业。\n        林肯汽车是第一个以总统的名字命名的品牌，专为总统和国家元首生产的高档轿车。由于林肯车杰出的性能、高雅的造型和无与伦比的舒适，自1939年美国的富兰克林·罗斯福总统以来，一直被白宫选为总统专车。');
INSERT INTO `car_mark` VALUES ('23', '美洲虎JAGUAR', '美洲虎汽车的名字起源，则可追溯到一九三七年。该年六月SS汽车公司正式接收了Sunbeam（Wolverhampton）汽车公司。当时，里昂斯爵士十 分希望能把汽车名为Sunbeam，因为Sunbeam曾于多次的世界赛车中取得冠军，可谓“胜利”的标志。可惜，公司内部出现了一些问题。最后，被迫放 弃使用Sunbeam作为公司的名字。里昂斯爵士最后拣选了一个在各种语言中都发音清脆的名字—Jaguar，它是根据第一次世界大战的一种飞行机器而命名。美洲虎又称捷豹，香港人还称“积架”，缘由英文JAGUAR的音译，它的汽车标识被设计成一只纵身跳跃的美洲虎，造型生动、形象简练、动感强烈，蕴含着力量、节奏与勇猛。');
INSERT INTO `car_mark` VALUES ('24', '雪佛兰CHEVROLET', '雪佛兰商标表示了图案化了的蝴蝶结，Chevrolet是瑞士的赛车手、工程师路易斯·雪佛兰的名字。');
INSERT INTO `car_mark` VALUES ('25', '雷克萨斯LEXUS', '雷克萨斯的标志取车名的英文第一个字母，即LEXUS(参数|图片)的第一个字母“L”。');
INSERT INTO `car_mark` VALUES ('26', '兰博基尼LAMBORGHINI', '公司的标志是一头浑身充满了力气，正准备向对手发动猛烈的攻击。据说兰伯基尼本人就是这种不甘示弱的牛脾气，也体现了兰伯基尼公司产品的特点，因为公司生产的汽车都是大功率、高速的运动型轿车。车头和车尾上的商标省去了公司名，只剩下一头犟牛。');
INSERT INTO `car_mark` VALUES ('27', '凯迪拉克CADILLAC', '选用“凯迪拉克”之名是为了向法国的皇家贵族、探险家、美国底特律城的创始人安东尼·门斯·凯迪拉克表示敬意，商标图形主要由冠和盾组成。冠象征着凯迪拉克家族的纹章，冠上7颗珍珠喻示皇家的贵族血统。\n\n盾象征着凯迪拉克军队的英勇善战。盾分为4个等分。第一和第四等分是门斯家族的全底纹章，中间横穿过的深褐色棒把三只相同的黑鸟分开，两只在上，一只在下。这三只鸟意味三味一体的神圣，还意味着大胆和热情的基督教武士智慧、富有、聪敏的头脑和它完美的品德。\n\n第二和第三等分是由于内部通婚，当另一块领土加到门斯家族的财产上时，这些4等分才能在门斯盾形纹章里被采用。4等分内采用的色彩表明了广阔的土地，增色了 门斯家族的名望，红色标志着行动的勇敢和大胆；银色表示团结、博爱、美德和富有。横穿的棒表示了在十字军战争的骑士们的勇敢。凯迪拉克商标是底特律城创始 人的祖先的英勇和荣誉。');
INSERT INTO `car_mark` VALUES ('28', '沃尔沃VOLVO', '“沃尔沃”（VOLVO），也译为“富豪”。车标由图标和文字商标两部分组成。沃尔沃图形车标是由双圆环组成车轮的形状，并有指向右上方的箭头。中间的拉丁语文字“VOLVO”，是滚滚向前的意思，寓意着沃尔沃汽车的车轮滚滚向前和公司兴旺发达、前途无量。');
INSERT INTO `car_mark` VALUES ('29', '马自达MAZDA', '马自达汽车公司的原名为东洋工业公司，生产的汽车用公司创始人“松田”来命名，又因“松田”的拼音为MAZDA（马自达），所以人们便习惯称为马自达。\n\n马自达起初使用的车标，是在椭圆之中有双手捧着一个太阳，寓意马自达公司将拥有明天，马自达汽车跑遍全球。\n\n马自达公司与福特公司合作之后，采用了新的车标，椭圆中展翅飞翔的海鸥，同时又组成“M”字样。“M”是MAZDA第一个大写字母，预示该公司将展翅高飞，以无穷的创意和真诚的服务，迈向新世纪。');
INSERT INTO `car_mark` VALUES ('30', '旁蒂克PONTIAC', '旁蒂克车标，由字母和图形两部分组成。字母“PONTIAC”，取自美国密执安州的一个地名：图形车标是带十字标记的箭头。而十字形标记，则表示旁蒂克是通 用汽车公司的重要成员，也象征旁蒂克汽车安全可靠；箭头则代表旁蒂克的技术超前和攻关精神，预示着旁蒂克汽车跑遍全球。');
INSERT INTO `car_mark` VALUES ('31', '莲花LOTUS', '莲花车标，是在椭圆形底板上镶嵌着抽象了的莲花造型，上面除了有“莲花”（LOTUS）字样外，还以创始人查普曼姓名全称（A．C．B．CHAPMAN）的四个英文字母“A．C．B．C”叠加在一起而成。\n\n莲花公司是英国人查普曼1951年创立的，主要生产跑车，由于规模小，在激烈的竞争中几经易手，现落户到意大利的菲亚特汽车公司。');
INSERT INTO `car_mark` VALUES ('32', '雷诺', '1898年，路易斯·雷诺三兄弟在法国比仰古创建雷诺汽车公司。它是世界上最悠久的汽车公司之一。主要产品有雷诺牌轿车、公务用车和运动车等。\n\n雷诺车标是四个菱形拼成的图案，象征雷诺三兄弟与汽车工业融为一体，表示“雷诺”能在无限的（四维）空间中竞争、生存、发展。');
INSERT INTO `car_mark` VALUES ('33', '通用别克BUICK', '别克商标中形似“三利剑”的图案为共图形商标，被安装在汽车散热器格栅上。那三把颜色不同的利剑（从左到右分别为红、白、蓝三种颜色），依次排列在不同的高度位置上，给人一种积极进取、不断攀登的感觉，它表示别克采用顶级技术，别克人是勇于登峰的勇士。\n\n别克轿车的英文车标来源于该公司的创始人大卫·别克的姓氏。而整个商标是一只展翅的雄鹰即将落在别克的英文字母上。它象征着别克是雄鹰最理想的栖息之地，正应了中国的那句谚语：“家有梧桐树，才能招来金凤凰。”');
INSERT INTO `car_mark` VALUES ('34', '保时捷', '保时捷的英文车标采用德国保时捷公司创始人费迪南德·保时捷的姓氏。图形车标采用公司所在地斯图加特市的盾形市徽。\n\n“PORSCHE”字样在商标的最上方，表明该商标为保时捷设计公司所拥有；商标中的“STUTTCART”字样在马的上方，说明公司总部在斯图加特市；商标中间是一匹骏马，表示斯图加特这个地方盛产一种名贵种马；');
INSERT INTO `car_mark` VALUES ('35', '保时捷', '商标的左上方和右下方是鹿角的图案，表示斯图加特曾是狩猎的好地方；商标右上方和左下方的黄色条纹代表成熟了的麦子颜色，喻指五谷丰登，商标中的黑色代表肥 沃土地，商标中的红色象征人们的智慧和对大自然的钟爱，由此组成一幅精湛意深、秀气美丽的田园风景画，展现了保时捷公司辉煌的过去，并预示了保时捷公司美 好的未来，保时捷跑车的出类拔萃！');
INSERT INTO `car_mark` VALUES ('36', '欧宝', '凡是经常看电视体育频道节目的观众，都会在大型国际球类比赛中看到“圆圈闪电”的徽记，那就是德国欧宝汽车的标识。“圆圈闪电”，即意味着欧宝汽车的力量和速度是无与伦比的；欧宝公司永远充满着生机与活力。\n\n德国欧宝公司是美国通用汽车公司的子公司，是通用公司在欧洲的一个窗口。它由亚当·欧宝所创立，至今已有百多年历史。由于欧宝公司对足球世界杯、欧锦赛、戴维斯杯、联盟杯网球赛等世界重大球类比赛的赞助，使得欧宝公司在体育领域有很高的声望，无疑也给其带来丰厚的回报。\n\n目前，欧宝的产品已遍及世界20多个国家的100多个市场。欧宝轿车已连续5年保持了西欧轿车头号品牌的位置，占据了西欧轿车市场12%的份额。');

-- ----------------------------
-- Table structure for `car_safetyequipment_propertyvalue`
-- ----------------------------
DROP TABLE IF EXISTS `car_safetyequipment_propertyvalue`;
CREATE TABLE `car_safetyequipment_propertyvalue` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ccategory_id` int(11) DEFAULT NULL COMMENT '三级分类id',
  `airbag` varchar(30) DEFAULT NULL COMMENT '主/副驾驶座安全气囊',
  `sideairbag` varchar(30) DEFAULT NULL COMMENT '前/后排侧气囊',
  `headairbag` varchar(30) DEFAULT NULL COMMENT '前/后排头部气囊(气帘)',
  `kneeairbag` varchar(30) DEFAULT NULL COMMENT '膝部气囊',
  `safebeltairbag` varchar(30) DEFAULT NULL COMMENT '后排安全带式气囊',
  `centersafeairbag` varchar(30) DEFAULT NULL COMMENT '后排中央安全气囊',
  `passivepedestrianprotection` varchar(30) DEFAULT NULL COMMENT '被动行人保护',
  `tirepressuremonitoring` varchar(30) DEFAULT NULL COMMENT '胎压监测功能',
  `zerotirecontinue` varchar(30) DEFAULT NULL COMMENT '零胎压继续形式',
  `seatbeltnotfastened` varchar(30) DEFAULT NULL COMMENT '安全带未系提醒',
  `childseatjoint` varchar(30) DEFAULT NULL COMMENT 'ISOFIX儿童座椅接口',
  `abs` varchar(30) DEFAULT NULL COMMENT 'ABS防抱死',
  `ebd` varchar(30) DEFAULT NULL COMMENT '制动力分类(EBD/CBC等)',
  `eba` varchar(30) DEFAULT NULL COMMENT '刹车辅助(EBA/BAS/BA等)',
  `asr` varchar(30) DEFAULT NULL COMMENT '牵引力控制(ASR/TCS/TRC等)',
  `esc` varchar(30) DEFAULT NULL COMMENT '车身稳定控制(ESC/ESP/DES等)',
  `doublingauxiliary` varchar(30) DEFAULT NULL COMMENT '并线辅助',
  `fromearlywarning` varchar(30) DEFAULT NULL COMMENT '车道偏离预警系统',
  `keepassist` varchar(30) DEFAULT NULL COMMENT '车道保持辅助系统',
  `trafficsign` varchar(30) DEFAULT NULL COMMENT '道路交通标识识别',
  `activebrake` varchar(30) DEFAULT NULL COMMENT '主动刹车/主动安全系统',
  `nightsight` varchar(30) DEFAULT NULL COMMENT '夜视系统',
  `fatiguedrivingtip` varchar(30) DEFAULT NULL COMMENT '疲劳驾驶提示',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='主/被动安全装备';

-- ----------------------------
-- Records of car_safetyequipment_propertyvalue
-- ----------------------------
INSERT INTO `car_safetyequipment_propertyvalue` VALUES ('3', '47', '主* / 副*', '前* / 后-', '-', '-', '-', '-', '-', '胎压显示', '-', '前排', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-');
INSERT INTO `car_safetyequipment_propertyvalue` VALUES ('4', '46', '主* / 副*', '前* / 后-', '前* / 后*', '', '', '', '', '胎压报警', '', '前排', '', '', '', '', '', '', '', '', '', '', '', '', '');

-- ----------------------------
-- Table structure for `car_wheelbrake_propertyvalue`
-- ----------------------------
DROP TABLE IF EXISTS `car_wheelbrake_propertyvalue`;
CREATE TABLE `car_wheelbrake_propertyvalue` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ccategory_id` int(11) DEFAULT NULL COMMENT '三级分类id',
  `frontbraketype` varchar(15) DEFAULT NULL COMMENT '前制动器类型',
  `rearbraketype` varchar(15) DEFAULT NULL COMMENT '后制动器类型',
  `parkingbraketype` varchar(15) DEFAULT NULL COMMENT '驻车制动类型',
  `fronttyrespecification` varchar(15) DEFAULT NULL COMMENT '前轮胎规格',
  `reartyrespecification` varchar(15) DEFAULT NULL COMMENT '后轮胎规格',
  `sparetirespecifications` varchar(15) DEFAULT NULL COMMENT '备胎规格',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='车轮制动';

-- ----------------------------
-- Records of car_wheelbrake_propertyvalue
-- ----------------------------
INSERT INTO `car_wheelbrake_propertyvalue` VALUES ('3', '47', '通风盘式', '盘式', '手刹', '245/75 R17', '245/75 R17', '全尺寸');
INSERT INTO `car_wheelbrake_propertyvalue` VALUES ('4', '46', '通风盘式', '盘式', '电动驻车', '235/55 R18', '235/55 R18', '非全尺寸');
INSERT INTO `car_wheelbrake_propertyvalue` VALUES ('5', '46', '通风盘式', '盘式', '电子驻车', '235/50 R19', '235/50 R19', '非全尺寸');

-- ----------------------------
-- Table structure for `manageruser`
-- ----------------------------
DROP TABLE IF EXISTS `manageruser`;
CREATE TABLE `manageruser` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `sex` varchar(2) DEFAULT NULL COMMENT '1男0女',
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `salt` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of manageruser
-- ----------------------------
INSERT INTO `manageruser` VALUES ('1', '超级管理员', '1', 'admin', '3c85fd54cf9332a5033b152907a7770f', 'eZL9xUxlXUgU5F2VwgMoqA==');
INSERT INTO `manageruser` VALUES ('2', '测试人员', '0', 'test', 'a94f7349db02aefb89aa16e5c5c30e57', '92qcBluHIkI62lQmBndw0A==');

-- ----------------------------
-- Table structure for `review`
-- ----------------------------
DROP TABLE IF EXISTS `review`;
CREATE TABLE `review` (
  `id` int(11) NOT NULL,
  `car_id` int(11) NOT NULL COMMENT '汽车id',
  `review` varchar(40) DEFAULT NULL COMMENT '评语',
  `status` int(10) DEFAULT NULL COMMENT '审核状态(未审核 0,审核通过 2,审核未通过 1)',
  `create_by` int(11) NOT NULL COMMENT '创建人',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of review
-- ----------------------------
INSERT INTO `review` VALUES ('1', '8', '这个车子还行', '0', '35', '2019-10-13 13:29:33');
INSERT INTO `review` VALUES ('2', '9', '性能好,速度快,耗油低', '0', '36', '2019-10-10 13:30:26');
INSERT INTO `review` VALUES ('3', '10', '差差差', '0', '37', '2019-10-02 13:31:00');
INSERT INTO `review` VALUES ('5', '12', '快快快', '1', '39', '2019-10-13 13:32:06');
INSERT INTO `review` VALUES ('6', '13', '好好', '2', '39', '2019-10-23 14:57:32');
INSERT INTO `review` VALUES ('7', '13', '不从', '0', '41', '2019-10-13 14:57:55');
INSERT INTO `review` VALUES ('8', '11', '顶顶顶', '0', '36', '2019-10-13 14:58:28');
INSERT INTO `review` VALUES ('9', '11', '11', '0', '38', '2019-10-13 14:58:43');
INSERT INTO `review` VALUES ('10', '13', '发动机动力,开着舒服', '0', '36', '2019-10-10 11:09:32');
INSERT INTO `review` VALUES ('11', '12', '开着舒服', '0', '40', '2019-10-24 11:10:19');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `sex` varchar(2) DEFAULT NULL COMMENT '1男0女',
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `salt` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('35', '吴前辉', '1', 'wuqianhui', 'b6129eb5133b508ee589e8fd8d9d9732', 'ScjLgnwkxi69GkeCq7kQhQ==');
INSERT INTO `user` VALUES ('36', '张三', '1', 'zhangsan', '7becb870b6d3bb551b02ca03aa18bb7f', '5r62upyLap/3Eqhd/QIKjQ==');
INSERT INTO `user` VALUES ('37', '李四', '1', 'lisi', 'fd21b53c1c2fa67a94e98ee85a81bdd3', '8IojrKyNoKohbDp2ysoOoQ==');
INSERT INTO `user` VALUES ('38', '王五', '1', 'wangwu', 'a94d8625f74d516d700cfc5de37e3d9d', '9h8LjNGSi5Ak/DD43mwDXQ==');
INSERT INTO `user` VALUES ('39', '赵六', '1', 'zhaoliu', '403816c11ab11c80ed1fddf219dac94c', '2HXTLJw1//QD01Vt9UErIQ==');
INSERT INTO `user` VALUES ('40', '刘史茹', '0', '123123', '854cf9475d053911d248f746b3de4ad3', 'zyilSnQuw02NeGqDiukVaQ==');
INSERT INTO `user` VALUES ('41', '刘婷婷', '0', '370139800', '33130a9a0729fc612759c4a30c8fdcb2', 'XcxKvjQpc3yPDuJ0T0qzKQ==');
INSERT INTO `user` VALUES ('42', '李思思', '0', 'lisisi', '1c3360d84806050ac244d24acc807a1d', '06PG5oiJyAplkmZ87vbu8A==');
INSERT INTO `user` VALUES ('43', '六六', '1', '370139888', 'ea3713cc6bdefb374ea0db26bb58308c', 'pAQ93LWqVmgCQB77e6E7Sw==');
INSERT INTO `user` VALUES ('44', '向日葵', '1', 'liuliu', '3876c27853590de4dfedebdc775e3aa7', 'urmdSPJ0VkU3FV+2TMdX4w==');
INSERT INTO `user` VALUES ('45', '刘十期', '1', '123456', '8f8923e6792f665c7bf34792cd953bfc', 'gdBhMWjsBLJZWhb9vw5dkw==');
INSERT INTO `user` VALUES ('46', '123', '1', '123', '32ab730c31ee85547a8dd4f6a0927ce7', 'S7eXOUu1WiiYQ0AspYeKTg==');
INSERT INTO `user` VALUES ('47', '123', '1', '132', 'ba414a2747c5bd85a38a9d595f2e1a46', 'zecYnfPbwtfeF7gASWkmYg==');
INSERT INTO `user` VALUES ('48', '123', '1', '134', 'e4aa6135e96fce940868a0b2496e2fd7', 'v/TCauL308urXRCAPOhWEA==');
INSERT INTO `user` VALUES ('49', '123', '1', '432', '82459812134c9944276590a9304dc062', 'KDSx5dzKCoPG7zGbdK/Hfg==');
INSERT INTO `user` VALUES ('50', '123', '1', '434', 'faba7c3076491cf93ce83675b8c2febf', 'ebk2r2vld4XxtxDxA9tk0w==');
INSERT INTO `user` VALUES ('51', '1234', '1', '543', 'e5435d2f17fff0153224db6a1c03bbee', 'RTzC0GrWL7NjiTG6uMaF3Q==');
INSERT INTO `user` VALUES ('52', '433', '1', '444', '0662889ea2e9a907ae53893c331bcfc2', 'xAACz9e+WbUiRFCVp1H/qw==');
INSERT INTO `user` VALUES ('53', '556', '1', '5555', '27c6052545553c7f3f2465fe4545468b', 'bzbK7yLWovyr0a8lFUH7BA==');
INSERT INTO `user` VALUES ('54', '555', '1', '666', '4098b02d224c28bf20135a145bfb1975', 'xtkrqOkW7kWq3hIa55uAEA==');
INSERT INTO `user` VALUES ('55', '777', '1', '777', '0d3bf5fa8c41ed60c025be8503b03f94', 'F3BbYcgzigW7i4hrZ+uVsw==');
INSERT INTO `user` VALUES ('56', '888', '1', '888', 'ec30864da6467fb634fe5f8e99e457ba', 'Ugbn8AWY20o9qReFsulEVw==');
