package com.springboot.demo.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springboot.demo.bean.*;
import com.springboot.demo.dao.PropertyValueDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 设置所有属性值业务层
 */
@Service
public class PropertyValueService {

    @Resource
    private PropertyValueDao propertyValueDao;

    //*****************************主/被动安全装备

    /**
     * 获取主被动信息
     * @param ccategoryId
     * @param start
     * @param size
     * @return
     */
    public PageInfo<SafetyequipmentPropertyValue>  listAllSafetyequipmentPropertyValue(Integer ccategoryId, int start, int size){
        PageHelper.startPage(start,size,"id desc");  //支持分页,并按照降序排列
        List<SafetyequipmentPropertyValue> safetyequipmentPropertyValues =  propertyValueDao.listAllSafetyequipmentPropertyValue(ccategoryId);
        PageInfo<SafetyequipmentPropertyValue> pages = new PageInfo<>(safetyequipmentPropertyValues,5); //获取分页信息,并在导航栏显示5个数字
        return  pages;
    }

    /**
     * 删除安全装备信息
     * @param id
     */
   public void deleteOneSafetyequipmentPropertyValue(Integer id){
       propertyValueDao.deleteOneSafetyequipmentPropertyValue(id);
   }

    /**
     * 修改安全装备信息
     * @param sp
     */
   public void updateOneSafetyequipmentPropertyValue(SafetyequipmentPropertyValue sp){
       propertyValueDao.updateOneSafetyequipmentPropertyValue(sp);
   }

    /**
     * 获取指定id的安全装备信息
     * @param id
     * @return
     */
   public SafetyequipmentPropertyValue getOneSafetyequipmentPropertyValue(Integer id){
        return   propertyValueDao.getOneSafetyequipmentPropertyValue(id);
   }

    /**
     * 添加安全装备信息
     * @param sp
     */
   public void addOneSafetyequipmentPropertyValue(SafetyequipmentPropertyValue sp){
       propertyValueDao.addOneSafetyequipmentPropertyValue(sp);
   }

    //*****************************车轮制动

    /**
     * 获取所有汽车制动信息
     * @param ccategoryId
     * @param start
     * @param size
     * @return
     */
    public PageInfo<WheelbrakePropertyvalue>  listAllWheelbrakePropertyvalue(Integer ccategoryId, int start, int size){
        PageHelper.startPage(start,size,"id desc");  //支持分页,并按照降序排列
        List<WheelbrakePropertyvalue> WheelbrakePropertyvalues =    propertyValueDao.listAllWheelbrakePropertyvalue(ccategoryId);
        PageInfo<WheelbrakePropertyvalue> pages = new PageInfo<>(WheelbrakePropertyvalues,5); //获取分页信息,并在导航栏显示5个数字
        return  pages;
    }

    /**
     * 获取指定id的车轮信息
     * @param id
     */
    public void deleteOneWheelbrakePropertyvalue(Integer id){
        propertyValueDao.deleteOneWheelbrakePropertyvalue(id);
    }

    /**
     * 修改车轮制动信息
     * @param wp
     */
    public  void updateOneWheelbrakePropertyvalue(WheelbrakePropertyvalue wp){
        propertyValueDao.updateOneWheelbrakePropertyvalue(wp);
    }

    /**
     * 修改指定id的车轮信息
     * @param id
     * @return
     */
    public WheelbrakePropertyvalue getOneWheelbrakePropertyvalue(Integer id){
        return  propertyValueDao.getOneWheelbrakePropertyvalue(id);
    }

    /**
     * 添加一个汽车制动信息
     * @param wp
     */
    public  void addOneWheelbrakePropertyvalue(WheelbrakePropertyvalue wp){
        propertyValueDao.addOneWheelbrakePropertyvalue(wp);
    }


    //*****************************底盘转向

    /**
     * 获取底盘信息
     * @param ccategoryId
     * @param start
     * @param size
     * @return
     */
    public PageInfo<ChassissteeringPropertyvalue>  listAllChassissteeringPropertyvalue(Integer ccategoryId, int start, int size){
        PageHelper.startPage(start,size,"id desc");  //支持分页,并按照降序排列
        List<ChassissteeringPropertyvalue> chassissteeringPropertyvalues =    propertyValueDao.listAllChassissteeringPropertyvalue(ccategoryId);
        PageInfo<ChassissteeringPropertyvalue> pages = new PageInfo<>(chassissteeringPropertyvalues,5); //获取分页信息,并在导航栏显示5个数字
        return  pages;
    }

    /**
     * 删除底盘信息
     * @param id
     */
    public void deleteOneChassissteeringPropertyvalue(Integer id){
        propertyValueDao.deleteOneChassissteeringPropertyvalue(id);
    }

    /**
     * 修改底盘信息
     * @param cp
     */
    public void updateOneChassissteeringPropertyvalue(ChassissteeringPropertyvalue cp){
        propertyValueDao.updateOneChassissteeringPropertyvalue(cp);
    }

    /**
     * 获取一个底盘信息
     * @param id
     * @return
     */
    public ChassissteeringPropertyvalue getOneChassissteeringPropertyvalue(Integer id){
        return  propertyValueDao.getOneChassissteeringPropertyvalue(id);
    }

    /**
     * 添加一个底盘信息
     * @param cp
     */
    public  void addOneChassissteeringPropertyvalue(ChassissteeringPropertyvalue cp){
        propertyValueDao.addOneChassissteeringPropertyvalue(cp);
    }

    //*****************************变速箱

    /**
     * 获取变速箱信息
     * @param ccategoryId
     * @param start
     * @param size
     * @return
     */
    public PageInfo<GearboxPropertyValue>  listAllGearboxPropertyValue(Integer ccategoryId, int start, int size){
        PageHelper.startPage(start,size,"id desc");  //支持分页,并按照降序排列
        List<GearboxPropertyValue> GearboxPropertyValues =    propertyValueDao.listAllGearboxPropertyValue(ccategoryId);
        PageInfo<GearboxPropertyValue> pages = new PageInfo<>(GearboxPropertyValues,5); //获取分页信息,并在导航栏显示5个数字
        return  pages;
    }

    /**
     * 删除变速箱信息
     * @param id
     */
    public void deleteOneGearboxPropertyValue(Integer id){
        propertyValueDao.deleteOneGearboxPropertyValue(id);
    }

    /**
     * 修改一个变速箱信息
     * @param gp
     */
    public void updateOneGearboxPropertyValue(GearboxPropertyValue gp){
        propertyValueDao.updateOneGearboxPropertyValue(gp);
    }

    /**
     * 获取一个变速箱信息
     * @param id
     * @return
     */
    public GearboxPropertyValue getOneGearboxPropertyValue(Integer id){
       return  propertyValueDao.getOneGearboxPropertyValue(id);
    }

    /**
     * 添加一个变速箱信息
     * @param gp
     */
    public void addOneGearboxPropertyValue(GearboxPropertyValue gp){
        propertyValueDao.addOneGearboxPropertyValue(gp);
    }

    //**********************发动机

    /**
     * 获取所有发动机信息
     * @param ccategoryId
     * @return
     */
    public PageInfo<EnginePropertyValue>  listAllEnginePropertyValue(Integer ccategoryId, int start, int size){
        PageHelper.startPage(start,size,"id desc");  //支持分页,并按照降序排列
        List<EnginePropertyValue> EnginePropertyValues =    propertyValueDao.listAllEnginePropertyValue(ccategoryId);
        PageInfo<EnginePropertyValue> pages = new PageInfo<>(EnginePropertyValues,5); //获取分页信息,并在导航栏显示5个数字
        return  pages;
    }

    /**
     * 删除指定id的发动机信息
     * @param id
     */
    public void deleteOneEnginePropertyValue(Integer id){
        propertyValueDao.deleteOneEnginePropertyValue(id);
    }

    /**
     * 修改汽车发动机信息
     * @param ep
     */
    public void updateOneEnginePropertyValue(EnginePropertyValue ep){
        propertyValueDao.updateOneEnginePropertyValue(ep);
    }

    /**
     * 获取指定id的发动机信息
     * @param id
     * @return
     */
    public EnginePropertyValue getOneEnginePropertyValue(Integer id){
        return  propertyValueDao.getOneEnginePropertyValue(id);
    }

    /**
     * 添加一个发动机信息
     * @param ep
     */
    public void addOneEnginePropertyValue(EnginePropertyValue ep){
        propertyValueDao.addOneEnginePropertyValue(ep);
    }

    //*********************车身
    /**
     * 获取当前种类id下的所有车身信息
     * @param ccategoryId
     * @param start
     * @param size
     * @return
     */
    public PageInfo<BodyworkPropertyvalue> listAllBodyworkPropertyvalue(Integer ccategoryId, int start, int size){
        PageHelper.startPage(start,size,"id desc");  //支持分页,并按照降序排列
        List<BodyworkPropertyvalue> bodyworkPropertyvalues = propertyValueDao.listAllBodyworkPropertyvalue(ccategoryId);
        PageInfo<BodyworkPropertyvalue> pages = new PageInfo<>(bodyworkPropertyvalues,5); //获取分页信息,并在导航栏显示5个数字
        return  pages;
    }

    /**
     * 删除指定id的车身信息
     * @param id
     */
    public void deleteOneBodyworkPropertyvalue(Integer id){
        propertyValueDao.deleteOneBodyworkPropertyvalue(id);
    }

    /**
     * 添加一个车身信息
     * @param bp
     */
    public void addOneBodyworkPropertyvalue(BodyworkPropertyvalue bp){
        propertyValueDao.addOneBodyworkPropertyvalue(bp);
    }

    /**
     * 获取指定id的车身信息
     * @param id
     * @return
     */
    public BodyworkPropertyvalue getOneBodyworkPropertyvalue(Integer id){
        return propertyValueDao.getOneBodyworkPropertyvalue(id);
    }

    /**
     * 修改车身信息
     * @param bp
     */
    public void updateOneBodyworkPropertyvalue(BodyworkPropertyvalue bp){
        propertyValueDao.updateOneBodyworkPropertyvalue(bp);
    }

    //****************************基本参数
    /**
     * 根据三级种类id获取基本参数属性值
     * @param ccategoryId
     * @return
     */
    public PageInfo<BasicParamPropertyValue> listAllBasicParamPropertyValue(Integer ccategoryId,int start,int size){
        PageHelper.startPage(start,size,"id desc");  //支持分页,并按照降序排列
        List<BasicParamPropertyValue> basicParamPropertyValues = propertyValueDao.listAllBasicParamPropertyValue(ccategoryId);
        PageInfo<BasicParamPropertyValue> pages = new PageInfo<>(basicParamPropertyValues,5); //获取分页信息,并在导航栏显示5个数字
        return  pages;
    }

    /**
     * 删除指定id的属性值
     * @param id
     */
    public void deleteOneParamPropertyValue(Integer id){
        propertyValueDao.deleteOneParamPropertyValue(id);
    }

    /**
     * 修改一个基本参数属性值
     * @param bpp
     */
    public void updateOneParamPropertyValue(BasicParamPropertyValue bpp){
        propertyValueDao.updateOneParamPropertyValue(bpp);
    }

    /**
     * 通过id获取某一个基本参数属性值
     * @param id
     * @return
     */
    public BasicParamPropertyValue getOneParamPropertyValue(Integer id){
        return propertyValueDao.getOneParamPropertyValue(id);
    }

    /**
     * 添加一个基本属性值
     * @param bpp
     */
    public void addOneParamPropertyValue(BasicParamPropertyValue bpp){
        propertyValueDao.addOneParamPropertyValue(bpp);
    }

    //************************辅助操控设备
    /**
     * 获取所有辅助操控设备
     * @param ccategoryId
     * @param start
     * @param size
     * @return
     */
    public PageInfo<ManipulationPropertyValue> listAllManipulationPropertyValue(Integer ccategoryId,int start,int size){
        PageHelper.startPage(start,size,"id desc");  //支持分页,并按照降序排列
        List<ManipulationPropertyValue> ManipulationPropertyValues = propertyValueDao.listAllManipulationPropertyValue(ccategoryId);
        PageInfo<ManipulationPropertyValue> pages = new PageInfo<>(ManipulationPropertyValues,5); //获取分页信息,并在导航栏显示5个数字
        return  pages;
    }

    /**
     * 删除指定id的辅助操控设备
     * @param id
     */
    public void deleteOneManipulationPropertyValue(Integer id){
        propertyValueDao.deleteOneManipulationPropertyValue(id);
    }

    /**
     * 修改辅助操控信息
     * @param mp
     */
    public void updateOneManipulationPropertyValue(ManipulationPropertyValue mp){
        propertyValueDao.updateOneManipulationPropertyValue(mp);
    }

    /**
     * 获取指定id的辅助操控信息
     * @param id
     * @return
     */
    public ManipulationPropertyValue getOneManipulationPropertyValue(Integer id){
        return  propertyValueDao.getOneManipulationPropertyValue(id);
    }

    /**
     * 添加一个辅助操控设备
     * @param mp
     */
    public void addOneManipulationPropertyValue(ManipulationPropertyValue mp){
        propertyValueDao.addOneManipulationPropertyValue(mp);
    }

}
