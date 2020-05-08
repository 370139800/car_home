package com.springboot.demo.dao;

import com.springboot.demo.bean.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 设置所有属性值的持久层
 */
@Mapper
public interface PropertyValueDao {
    //**************************基本参数
    /**
     *
     * 获取所有基本参数属性值
     * @return
     */
    List<BasicParamPropertyValue> listAllBasicParamPropertyValue(Integer ccategoryId);

    /**
     *删除指定id的属性值
     * @param id
     */
    void deleteOneParamPropertyValue(Integer id);

    /**
     * 修改参数属性值
     * @param bpp
     */
    void updateOneParamPropertyValue(BasicParamPropertyValue bpp);

    /**
     * 通过id获取某一个基本参数属性值
     * @param id
     * @return
     */
    BasicParamPropertyValue getOneParamPropertyValue(Integer id);

    /**
     * 添加一个基本参数属性值
     * @param bpp
     */
    void addOneParamPropertyValue(BasicParamPropertyValue bpp);

    //车身

    /**
     * 通过三级种类id获取车身属性值
     * @param ccategoryId
     * @return
     */
   List<BodyworkPropertyvalue>  listAllBodyworkPropertyvalue(Integer ccategoryId);

    /**
     * 删除指定id的车身信息
     * @param id
     */
    void deleteOneBodyworkPropertyvalue(Integer id);

    /**
     * 新增车身信息
     * @param bp
     */
    void addOneBodyworkPropertyvalue(BodyworkPropertyvalue bp);

    /**
     * 获取指定的车身信息
     * @param id
     * @return
     */
    BodyworkPropertyvalue getOneBodyworkPropertyvalue(Integer id);

    /**
     * 修改车身信息
     * @param bp
     */
    void updateOneBodyworkPropertyvalue(BodyworkPropertyvalue bp);

    //*********************************发动机

    /**
     * 获取发动机
     * @param ccategoryId
     * @return
     */
    List<EnginePropertyValue>  listAllEnginePropertyValue(Integer ccategoryId);

    /**
     * 删除指定id的发动机
     * @param id
     */
    void deleteOneEnginePropertyValue(Integer id);

    /**
     * 修改一个发动机信息
     * @param ep
     *
     */
    void updateOneEnginePropertyValue(EnginePropertyValue ep);

    /**
     * 获取指定id发动机信息
     * @param id
     * @return
     */
    EnginePropertyValue getOneEnginePropertyValue(Integer id);

    /**
     * 添加发动机信息
     * @param ep
     */
    void addOneEnginePropertyValue(EnginePropertyValue ep);

    //**************************变速箱

    /**
     * 获取当前种类id下的变速箱信息
     * @param ccategoryId
     * @return
     */
    List<GearboxPropertyValue>  listAllGearboxPropertyValue(Integer ccategoryId);

    /**
     * 删除指定id的变速箱信息
     * @param id
     */
    void deleteOneGearboxPropertyValue(Integer id);

    /**
     * 修改变速箱信息
     * @param gp
     */
    void updateOneGearboxPropertyValue(GearboxPropertyValue gp);

    /**
     * 获取指定id的变速箱信息
     * @param id
     * @return
     */
    GearboxPropertyValue getOneGearboxPropertyValue(Integer id);

    /**
     * 添加变速箱信息
     * @param gp
     */
    void addOneGearboxPropertyValue(GearboxPropertyValue gp);

    //*******************************底盘转向

    /**
     * 获取底盘转向信息
     * @param ccategoryId
     * @return
     */
    List<ChassissteeringPropertyvalue>  listAllChassissteeringPropertyvalue(Integer ccategoryId);

    /**
     * 删除指定id底盘转向信息
     * @param id
     */
    void deleteOneChassissteeringPropertyvalue(Integer id);

    /**
     * 修改底盘转向信息
     * @param cp
     */
    void updateOneChassissteeringPropertyvalue(ChassissteeringPropertyvalue cp);

    /**
     * 获取指定id下的底盘转向信息
     * @param id
     * @return
     */
    ChassissteeringPropertyvalue getOneChassissteeringPropertyvalue(Integer id);

    /**
     * 添加底盘转向信息
     * @param cp
     */
    void addOneChassissteeringPropertyvalue(ChassissteeringPropertyvalue cp);

    //****************车轮制动

    /**
     * 获取车轮制动
     * @param ccategoryId
     * @return
     */
    List<WheelbrakePropertyvalue>  listAllWheelbrakePropertyvalue(Integer ccategoryId);

    /**
     * 删除指定id的车轮信息
     * @param id
     */
    void deleteOneWheelbrakePropertyvalue(Integer id);

    /**
     * 修改车轮制动信息
     * @param wp
     */
    void updateOneWheelbrakePropertyvalue(WheelbrakePropertyvalue wp);

    /**
     * 获取一个车轮制动信息
     * @param id
     * @return
     */
    WheelbrakePropertyvalue getOneWheelbrakePropertyvalue(Integer id);

    /**
     * 添加车轮制动信息
     * @param wp
     */
    void addOneWheelbrakePropertyvalue(WheelbrakePropertyvalue wp);

    //***********主被动安全装备

    /**
     * 获取所有安全装备
     * @param ccategoryId
     * @return
     */
    List<SafetyequipmentPropertyValue>  listAllSafetyequipmentPropertyValue(Integer ccategoryId);

    /**
     * 删除指定id的安全装备信息
     * @param id
     */
    void deleteOneSafetyequipmentPropertyValue(Integer id);

    /**
     * 修改安全装备信息
     * @param sp
     */
    void updateOneSafetyequipmentPropertyValue(SafetyequipmentPropertyValue sp);

    /**
     * 获取一个安全装备信息
     * @param id
     * @return
     */
    SafetyequipmentPropertyValue getOneSafetyequipmentPropertyValue(Integer id);

    /**
     * 添加安全装备信息
     * @param sp
     */
    void addOneSafetyequipmentPropertyValue(SafetyequipmentPropertyValue sp);

    //***************辅助操控配置

    /**
     * 获取所有
     * @param ccategoryId
     * @return
     */
    List<ManipulationPropertyValue>  listAllManipulationPropertyValue(Integer ccategoryId);

    /**
     * 删除
     * @param id
     */
    void deleteOneManipulationPropertyValue(Integer id);

    /**
     * 修改
     * @param mp
     */
    void updateOneManipulationPropertyValue(ManipulationPropertyValue mp);

    /**
     * 获取一个
     * @param id
     * @return
     */
    ManipulationPropertyValue getOneManipulationPropertyValue(Integer id);

    /**
     * 添加一个
     * @param mp
     */
    void addOneManipulationPropertyValue(ManipulationPropertyValue mp);
}
