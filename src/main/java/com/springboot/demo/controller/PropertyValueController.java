package com.springboot.demo.controller;

import com.github.pagehelper.PageInfo;
import com.springboot.demo.bean.*;
import com.springboot.demo.service.PropertyValueService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/propertyValue")
public class PropertyValueController {

    @Resource
    private PropertyValueService propertyValueService;

    //****************************辅助/操控设备
    /**
     * 获取辅助操控设备
     * @param ccategoryId
     * @param start
     * @param size
     * @return
     */
    @RequestMapping("/listAllManipulationPropertyValue")
    public PageInfo<ManipulationPropertyValue> listAllManipulationPropertyValue(Integer ccategoryId, @RequestParam(value = "start" , defaultValue = "1") Integer start ,
                                                                                      @RequestParam(value = "size" , defaultValue = "5") Integer size){
        if(start == null || start < 1){
            start = 1;
        }
        return propertyValueService.listAllManipulationPropertyValue(ccategoryId,start,size);
    }

    /**
     * 删除指定辅助/操控设备
     * @param id
     * @return
     */
    @RequestMapping("/deleteOneManipulationPropertyValue")
    public String deleteOneManipulationPropertyValue(Integer id){
        propertyValueService.deleteOneManipulationPropertyValue(id);
        return "删除成功";
    }

    /**
     * 修改成功
     * @param mp
     * @return
     */
    @RequestMapping("/updateOneManipulationPropertyValue")
    public String updateOneManipulationPropertyValue(@RequestBody ManipulationPropertyValue mp){
        propertyValueService.updateOneManipulationPropertyValue(mp);
        return "修改成功";
    }

    /**
     * 获取辅助设备
     * @param id
     * @return
     */
    @RequestMapping("/getOneManipulationPropertyValue")
    public ManipulationPropertyValue getOneManipulationPropertyValue(Integer id){
        return  propertyValueService.getOneManipulationPropertyValue(id);
    }

    /**
     * 添加一个辅助设备
     * @param mp
     */
    @RequestMapping("/addOneManipulationPropertyValue")
    public String addOneManipulationPropertyValue(@RequestBody ManipulationPropertyValue mp){
        propertyValueService.addOneManipulationPropertyValue(mp);
        return "添加成功";
    }

    //*****************************主被动安全装备信息

    /**
     * 获取所有
     * @param ccategoryId
     * @param start
     * @param size
     * @return
     */
    @RequestMapping("/listAllSafetyequipmentPropertyValue")
    public PageInfo<SafetyequipmentPropertyValue> listAllSafetyequipmentPropertyValue(Integer ccategoryId, @RequestParam(value = "start" , defaultValue = "1") Integer start ,
                                                                            @RequestParam(value = "size" , defaultValue = "5") Integer size){
        if(start == null || start < 1){
            start = 1;
        }
        return propertyValueService.listAllSafetyequipmentPropertyValue(ccategoryId,start,size);
    }

    /**
     * 删除
     * @param id
     */
    @RequestMapping("/deleteOneSafetyequipmentPropertyValue")
    public void deleteOneSafetyequipmentPropertyValue(Integer id){
        propertyValueService.deleteOneSafetyequipmentPropertyValue(id);
    }

    /**
     * 修改
     * @param sp
     * @return
     */
    @RequestMapping("/updateOneSafetyequipmentPropertyValue")
    public String updateOneSafetyequipmentPropertyValue(@RequestBody SafetyequipmentPropertyValue sp){
        propertyValueService.updateOneSafetyequipmentPropertyValue(sp);
        return "修改成功";
    }

    /**
     * 获取一个
     * @param id
     * @return
     */
    @RequestMapping("/getOneSafetyequipmentPropertyValue")
    public SafetyequipmentPropertyValue getOneSafetyequipmentPropertyValue(Integer id){
        return  propertyValueService.getOneSafetyequipmentPropertyValue(id);
    }

    /**
     * 添加
     * @param sp
     * @return
     */
    @RequestMapping("/addOneSafetyequipmentPropertyValue")
    public String addOneSafetyequipmentPropertyValue(@RequestBody SafetyequipmentPropertyValue sp){
        propertyValueService.addOneSafetyequipmentPropertyValue(sp);
        return "添加成功";
    }

    //*****************************车轮制动

    /**
     * 获取所有
     * @param ccategoryId
     * @param start
     * @param size
     * @return
     */
    @RequestMapping("/listAllWheelbrakePropertyvalue")
    public PageInfo<WheelbrakePropertyvalue> listAllWheelbrakePropertyvalue(Integer ccategoryId, @RequestParam(value = "start" , defaultValue = "1") Integer start ,
                                                                                      @RequestParam(value = "size" , defaultValue = "5") Integer size){
        if(start == null || start < 1){
            start = 1;
        }
        return propertyValueService.listAllWheelbrakePropertyvalue(ccategoryId,start,size);
    }

    /**
     * 删除一个
     * @param id
     */
    @RequestMapping("/deleteOneWheelbrakePropertyvalue")
    public void deleteOneWheelbrakePropertyvalue(Integer id){
        propertyValueService.deleteOneWheelbrakePropertyvalue(id);
    }

    /**
     * 修改车轮制动信息
     * @param wp
     * @return
     */
    @RequestMapping("/updateOneWheelbrakePropertyvalue")
    public String updateOneWheelbrakePropertyvalue(@RequestBody WheelbrakePropertyvalue wp){
        propertyValueService.updateOneWheelbrakePropertyvalue(wp);
        return "修改成功";
    }

    /**
     * 获取一个
     * @param id
     * @return
     */
    @RequestMapping("/getOneWheelbrakePropertyvalue")
    public WheelbrakePropertyvalue getOneWheelbrakePropertyvalue(Integer id){
        return  propertyValueService.getOneWheelbrakePropertyvalue(id);
    }

    /**
     * 添加汽车制动信息
     * @param wp
     * @return
     */
    @RequestMapping("/addOneWheelbrakePropertyvalue")
    public String addOneWheelbrakePropertyvalue(@RequestBody WheelbrakePropertyvalue wp){
        propertyValueService.addOneWheelbrakePropertyvalue(wp);
        return "添加成功";
    }

    //*****************************底盘转向
    /**
     * 获取所有底盘信息
     * @param ccategoryId
     * @param start
     * @param size
     * @return
     */
    @RequestMapping("/listAllChassissteeringPropertyvalue")
    public PageInfo<ChassissteeringPropertyvalue> listAllChassissteeringPropertyvalue(Integer ccategoryId, @RequestParam(value = "start" , defaultValue = "1") Integer start ,
                                                                                      @RequestParam(value = "size" , defaultValue = "5") Integer size){
        if(start == null || start < 1){
            start = 1;
        }
        return propertyValueService.listAllChassissteeringPropertyvalue(ccategoryId,start,size);
    }

    /**
     * 删除一个底盘信息
     * @param id
     */
    @RequestMapping("/deleteOneChassissteeringPropertyvalue")
    public void deleteOneChassissteeringPropertyvalue(Integer id){
        propertyValueService.deleteOneChassissteeringPropertyvalue(id);
    }

    /**
     * 修改一个底盘信息
     * @param cp
     */
    @RequestMapping("/updateOneChassissteeringPropertyvalue")
    public String updateOneChassissteeringPropertyvalue(@RequestBody ChassissteeringPropertyvalue cp){
        propertyValueService.updateOneChassissteeringPropertyvalue(cp);
        return "修改成功";
    }

    /**
     * 获取一个底盘信息
     * @param id
     * @return
     */
    @RequestMapping("/getOneChassissteeringPropertyvalue")
    public ChassissteeringPropertyvalue getOneChassissteeringPropertyvalue(Integer id){
        return  propertyValueService.getOneChassissteeringPropertyvalue(id);
    }

    /**
     * 添加一个底盘信息
     * @param cp
     */
    @RequestMapping("/addOneChassissteeringPropertyvalue")
    public  String addOneChassissteeringPropertyvalue(@RequestBody ChassissteeringPropertyvalue cp){
        propertyValueService.addOneChassissteeringPropertyvalue(cp);
        return "添加成功";
    }

    //变速箱

    /**
     * 添加一个变速箱信息
     * @param gp
     * @return
     */
    @RequestMapping("/addOneGearboxPropertyValue")
    public String addOneGearboxPropertyValue(@RequestBody GearboxPropertyValue gp){
        propertyValueService.addOneGearboxPropertyValue(gp);
        return "添加成功";
    }

    /**
     * 获取指定id的变速箱信息
     * @param id
     * @return
     */
    @RequestMapping("/getOneGearboxPropertyValue")
    public GearboxPropertyValue getOneGearboxPropertyValue(Integer id){
        return  propertyValueService.getOneGearboxPropertyValue(id);
    }

    /**
     * 修改一个变速箱信息
     * @param gp
     * @return
     */
    @RequestMapping("/updateOneGearboxPropertyValue")
    public String updateOneGearboxPropertyValue(@RequestBody GearboxPropertyValue gp){
        propertyValueService.updateOneGearboxPropertyValue(gp);
        return "修改成功";
    }

    /**
     * 删除一个变速箱信息
     * @param id
     * @return
     */
    @RequestMapping("/deleteOneGearboxPropertyValue")
    public String deleteOneGearboxPropertyValue(Integer id){
        propertyValueService.deleteOneGearboxPropertyValue(id);
        return "删除成功";
    }

    /**
     * 获取指定种类id下的变速箱信息
     * @param ccategoryId
     * @param start
     * @param size
     * @return
     */
    @RequestMapping("/listAllGearboxPropertyValue")
    public PageInfo<GearboxPropertyValue> listAllGearboxPropertyValue(Integer ccategoryId, @RequestParam(value = "start" , defaultValue = "1") Integer start ,
                                                                      @RequestParam(value = "size" , defaultValue = "5") Integer size){
        if(start == null || start < 1){
            start = 1;
        }
        return propertyValueService.listAllGearboxPropertyValue(ccategoryId,start,size);
    }

    //发动机

    /**
     * 添加发动信息
     * @param ep
     * @return
     */
    @RequestMapping("/addOneEnginePropertyValue")
    public String addOneEnginePropertyValue(@RequestBody EnginePropertyValue ep){
        propertyValueService.addOneEnginePropertyValue(ep);
        return "添加成功";
    }

    /**
     * 获取指定id的发动机信息
     * @param id
     * @return
     */
    @RequestMapping("/getOneEnginePropertyValue")
    public EnginePropertyValue getOneEnginePropertyValue(Integer id){
        return  propertyValueService.getOneEnginePropertyValue(id);
    }

    /**
     * 修改发动机信息
     * @param ep
     * @return
     */
    @RequestMapping("/updateOneEnginePropertyValue")
    public String updateOneEnginePropertyValue(@RequestBody EnginePropertyValue ep){
        propertyValueService.updateOneEnginePropertyValue(ep);
        return "修改成功";
    }

    /**
     * 删除指定id的发动机信息
     * @param id
     * @return
     */
    @RequestMapping("/deleteOneEnginePropertyValue")
    public String deleteOneEnginePropertyValue(Integer id){
        propertyValueService.deleteOneEnginePropertyValue(id);
        return "删除成功";
    }

    /**
     * 获取指定种类id下的发动机信息
     * @param ccategoryId
     * @return
     */
    @RequestMapping("/listAllEnginePropertyValue")
    public PageInfo<EnginePropertyValue> listAllEnginePropertyValue(Integer ccategoryId, @RequestParam(value = "start" , defaultValue = "1") Integer start ,
                                                                @RequestParam(value = "size" , defaultValue = "5") Integer size){
        if(start == null || start < 1){
            start = 1;
        }
        return propertyValueService.listAllEnginePropertyValue(ccategoryId,start,size);
    }

    //车身

    /**
     * 修改指定车身信息
     * @param bp
     */
    @RequestMapping("/updateOneBodyworkPropertyvalue")
    public void updateOneBodyworkPropertyvalue(BodyworkPropertyvalue bp){
        propertyValueService.updateOneBodyworkPropertyvalue(bp);
    }

    /**
     * 获取指定id的车身信息
     * @param id
     * @return
     */
    @RequestMapping("/getOneBodyworkPropertyvalue")
    public BodyworkPropertyvalue getOneBodyworkPropertyvalue(Integer id){
        return propertyValueService.getOneBodyworkPropertyvalue(id);
    }

    /**
     * 添加一个车身属性值
     * @param bp
     */
    @RequestMapping("/addOneBodyworkPropertyvalue")
    public String addOneBodyworkPropertyvalue(@RequestBody BodyworkPropertyvalue bp){
        propertyValueService.addOneBodyworkPropertyvalue(bp);
        return "添加成功";
    }

    /**
     * 删除指定id的车身信息
     * @param id
     * @return
     */
    @RequestMapping("/deleteOneBodyworkPropertyvalue")
    public String deleteOneBodyworkPropertyvalue(Integer id){
        propertyValueService.deleteOneBodyworkPropertyvalue(id);
        return "删除成功";
    }

    /**
     * 获取车身属性值
     * @param ccategoryId
     * @param start
     * @param size
     * @return
     */
    @RequestMapping("/listAllBodyworkPropertyvalue")
    public PageInfo<BodyworkPropertyvalue> listAllBodyworkPropertyvalue(Integer ccategoryId, @RequestParam(value = "start" , defaultValue = "1") Integer start ,
                                                                        @RequestParam(value = "size" , defaultValue = "5") Integer size){
        if(start == null || start < 1){
            start = 1;
        }
        return propertyValueService.listAllBodyworkPropertyvalue(ccategoryId,start,size);
    }


    /**
     * 添加一个基本参数信息
     * @param bbp
     * @return
     */
    @RequestMapping("/addOneParamPropertyValue")
    public String addOneParamPropertyValue(@RequestBody BasicParamPropertyValue bbp){
        propertyValueService.addOneParamPropertyValue(bbp);
        return "插入成功";
    }

    /**
     * 获取某一个属性值
     * @param id
     * @return
     */
    @RequestMapping("/getOneParamPropertyValue")
    public BasicParamPropertyValue getOneParamPropertyValue(Integer id){
        return propertyValueService.getOneParamPropertyValue(id);
    }

    /**
     * 修改基本参数数据
     * @param bbp
     * @return
     */
    @RequestMapping("/updateOneParamPropertyValue")
    public String updateOneParamPropertyValue(@RequestBody BasicParamPropertyValue bbp){
        propertyValueService.updateOneParamPropertyValue(bbp);
        return "修改成功";
    }

    /**
     * 删除指定id的属性值
     * @param id
     * @return
     */
    @RequestMapping("/deleteOneParamPropertyValue")
    public String deleteOneParamPropertyValue(Integer id){
        propertyValueService.deleteOneParamPropertyValue(id);
        return "删除成功";
    }

    /**
     * 获取基本参数属性值
     * @param ccategoryId
     * @param start
     * @param size
     * @return
     */
    @RequestMapping("/listAllBasicParamPropertyValue")
    public PageInfo<BasicParamPropertyValue> listAllBasicParamPropertyValue(Integer ccategoryId, @RequestParam(value = "start" , defaultValue = "1") Integer start ,
                                                                            @RequestParam(value = "size" , defaultValue = "5") Integer size){
        if(start == null || start < 1){
            start = 1;
        }
        return  propertyValueService.listAllBasicParamPropertyValue(ccategoryId,start,size);
    }



}
