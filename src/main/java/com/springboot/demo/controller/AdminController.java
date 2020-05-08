package com.springboot.demo.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class AdminController {

    @RequestMapping("/")
    public String login(){
        return "redirect:backstagelogin" ;
    }

    //后台登录页面
    @RequestMapping("/backstagelogin")
    public String backstagelogin(){
        return "login/backstagelogin";
    }

    /*显示用户列表页面*/
    @RequestMapping("/listUserPage")
    public  String listUserPage(String navName,HttpSession session){
        if(navName!=null) {
            session.setAttribute("navName", navName);
        }
        return  "user/listUser";
    }
    /*显示首页*/
    @RequestMapping("/index")
    public  String index(String navName,HttpSession session){
        if(navName!=null) {
            session.setAttribute("navName", navName);
        }
        return  "index";
    }
    /*编辑用户*/
    @RequestMapping("/editUser")
    public String editUser(){
        return "user/editUser";
    }

    /**
     * 新增用户
     * @return
     */
    @RequestMapping("/addUser")
    public String  addUser(String navName,HttpSession session){
        if(navName!=null) {
            session.setAttribute("navName", navName);
        }
        return "user/addUser";
    }

    /**
     * 修改头像
     * @return
     */
    @RequestMapping("/updateImage")
    public String updateImage(){
        return "user/updateImage";
    }

    /**
     * 无法找到查找的用户的页面
     * @return
     */
    @RequestMapping("/noExist")
    public String noExist(){
        return "noExist/noExist";
    }

    /**
     * 修改超级管理员图片
     * @return
     */
    @RequestMapping("/updateManagerImage")
    public String updateManagerImage(){
        return "manager/updateManagerImage";
    }

    /**
     * 编辑管理员
     * @return
     */
    @RequestMapping("/editManager")
    public String editManager(String navName,HttpSession session){
        if(navName!=null) {
            session.setAttribute("navName", navName);
        }
        return "manager/editManagerUser";
    }

    /**
     * 退出操作
     * @param session
     * @return
     */
    @RequestMapping("/exit")
    public String exit(HttpSession session){
        Subject subject = SecurityUtils.getSubject();
        if(subject.isAuthenticated()) //判断是否登录,若登录退出操作
            subject.logout();   //删除登录信息
        return "redirect:backstagelogin";
    }

    //***********************************

    /**
     * 显示评论
     * @return
     */
    @RequestMapping("/listReview")
    public String listReview(String navName,HttpSession session){
        if(navName!=null) {
            session.setAttribute("navName", navName);
        }
        return "review/listReview";
    }

    /**
     * 导入评论页面
     * @return
     */
    @RequestMapping("/importReview")
    public String importReview(String navName,HttpSession session){
        if(navName!=null) {
            session.setAttribute("navName", navName);
        }
        return "review/importReview";
    }

    //***********************************

    /**
     * 获取汽车标志显示页面
     * @return
     */
    @RequestMapping("/listCarMark")
    public String listCarMark(String navName,HttpSession session) {
        if(navName!=null) {
            session.setAttribute("navName", navName);
        }
        return "carMark/listCarMark";
    }

    /**
     * 修改汽车标志图片
     * @return
     */
    @RequestMapping("/updateCarMarkImage")
    public String updateCarMarkImage(){
        return "carMark/updateImage";
    }

    /**
     * 编辑汽车标志信息
     * @return
     */
    @RequestMapping("/editCarMark")
    public String editCarMark(){
        return "carMark/editCarMark";
    }

    /**
     * 添加车标信息
     * @return
     */
    @RequestMapping("/addCarMark")
    public String addCarMark(String navName,HttpSession session){
        if(navName!=null) {
            session.setAttribute("navName", navName);
        }
        return "carMark/addCarMark";
    }

    /**
     * 显示汽车车标详情
     * @return
     */
    @RequestMapping("/showCarMarkDetail")
    public String showCarMarkDetail(){
        return "carMark/carMarkDetail";
    }

    //********************************************

    /**
     *  获取一级分类页面
     * @return
     */
    @RequestMapping("/listStairCarCategory")
    public String listStairCarCategory(String navName,HttpSession session){
        if(navName!=null) {
            session.setAttribute("navName", navName);
        }
        return "carCategory/listStairCarCategory";
    }

    /**
     * 获取一级分类的编辑页面
     * @return
     */
    @RequestMapping("/editStairCarCategory")
    public String editStairCarCategory(){
        return "carCategory/editStairCarCategory";
    }

    /**
     * 获取二级分类
     * @return
     */
    @RequestMapping("/listSecondCarCategory")
    public String listSecondCarCategory(){
        return "carCategory/listSecondCarCategory";
    }

    /**
     * 获取二级分类的编辑页面
     * @return
     */
    @RequestMapping("/editSecondCarCategory")
    public String editSecondCarCategory(){
        return "carCategory/editSecondCarCategory";
    }

    /**
     * 获取三级分类
     * @return
     */
    @RequestMapping("/listThridCarCategory")
    public String listThridCarCategory(){
        return "carCategory/listThridCarCategory";
    }

    /**
     * 获取三级分类的编辑页面
     * @return
     */
    @RequestMapping("/editThridCarCategory")
    public String editThridCarCategory(){
        return "carCategory/editThridCarCategory";
    }

    /**
     * 上传视频
     * @return
     */
    @RequestMapping("/uploadVidio")
    public String uploadVidio(){
        return "carCategory/uploadVidio";
    }

    /**
     * 显示视频
     */
    @RequestMapping("/showVidio")
    public String showVidio(){
        return "carCategory/showVidio";
    }

    //*******************************************

    /**
     * 显示基本参数属性值
     * @return
     */
    @RequestMapping("/listBasicParamPropertyValue")
    public String listBasicParamPropertyValue(HttpServletRequest request){
       return "PropertyValue/listBasicParamPropertyValue";
    }

    /**
     * 显示编辑基本参数页面
     * @return
     */
    @RequestMapping("/editBasicParamPropertyValue")
    public String editBasicParamPropertyValue(){
        return "PropertyValue/editBasicParamPropertyValue";
    }

    /**
     * 显示添加基本参数页面
     * @return
     */
    @RequestMapping("/addBasicParamPropertyValue")
    public String addBasicParamPropertyValue(){
        return "PropertyValue/addBasicParamPropertyValue";
    }

    /**
     * 显示车身列表页面
     * @return
     */
    @RequestMapping("/listBodyworkPropertyvalue")
    public String listBodyworkPropertyvalue(){return "PropertyValue/listBodyworkPropertyvalue";}

    /**
     * 显示添加车身
     * @return
     */
    @RequestMapping("/addBodyworkPropertyvalue")
    public String addBodyworkPropertyvalue(){
        return "PropertyValue/addBodyworkPropertyvalue";
    }

    /**
     * 显示修改车身
     * @return
     */
    @RequestMapping("/editBodyworkPropertyValue")
    public String editBodyworkPropertyValue(){return "PropertyValue/editBodyworkPropertyValue";}

    /**
     * 显示发动机
     * @return
     */
    @RequestMapping("/listEnginePropertyValue")
    public String listEnginePropertyValue(){return "PropertyValue/listEnginePropertyValue";}

    /**
     * 显示发动机编辑页面
     * @return
     */
    @RequestMapping("/editEnginePropertyValue")
    public String editEnginePropertyValue(){
        return "PropertyValue/editEnginePropertyValue";
    }

    /**
     * 显示发动机添加页面
     * @return
     */
    @RequestMapping("/addEnginePropertyValue")
    public String addEnginePropertyValue(){return "PropertyValue/addEnginePropertyValue";}

    /**
     * 显示变速箱页面
     * @return
     */
    @RequestMapping("/listGearboxPropertyValue")
    public String listGearboxPropertyValue(){return "PropertyValue/listGearboxPropertyValue";}

    /**
     * 显示编辑变速箱信息
     * @return
     */
    @RequestMapping("/editGearboxPropertyValue")
    public String editGearboxPropertyValue(){
        return "PropertyValue/editGearboxPropertyValue";
    }

    /**
     * 显示添加变速箱信息
     * @return
     */
    @RequestMapping("/addGearboxPropertyValue")
    public String addGearboxPropertyValue(){return "PropertyValue/addGearboxPropertyValue";}

    /**
     * 显示底盘转向信息
     * @return
     */
    @RequestMapping("/listChassissteeringPropertyValue")
    public String listChassissteeringPropertyValue(){return "PropertyValue/listChassissteeringPropertyValue";}

    /**
     * 显示新增底盘页面
     * @return
     */
    @RequestMapping("/addChassissteeringPropertyValue")
    public String addChassissteeringPropertyValue(){return "PropertyValue/addChassissteeringPropertyValue";}

    /**
     * 显示编辑底盘转向信息
     * @return
     */
    @RequestMapping("/editChassissteeringPropertyValue")
    public String editChassissteeringPropertyValue(){
        return "PropertyValue/editChassissteeringPropertyValue";
    }

    /**
     * 显示车轮制动页面
     * @return
     */
    @RequestMapping("/listWheelbrakePropertyValue")
    public String listWheelbrakePropertyValue(){return "PropertyValue/listWheelbrakePropertyValue";}

    @RequestMapping("/addWheelbreakePropertyValue")
    public String addWheelbreakePropertyValue(){return "PropertyValue/addWheelbreakePropertyValue";}

    @RequestMapping("/editWheelbreakPropertyValue")
    public String editWheelbreakPropertyValue(){
        return "PropertyValue/editWheelbreakPropertyValue";
    }

    /**
     * 显示主被动安全装备
     * @return
     */
    @RequestMapping("/listSafetyquipmentPropertyValue")
    public String listSafetyquipmentPropertyValue(){return "PropertyValue/listSafetyquipmentPropertyValue";}

    @RequestMapping("/addSafetyquipmentPropertyValue")
    public String addSafetyquipmentPropertyValue(){return "PropertyValue/addSafetyquipmentPropertyValue";}

    @RequestMapping("/editSafetyquipmentPropertyValue")
    public String editSafetyquipmentPropertyValue(){
        return "PropertyValue/editSafetyquipmentPropertyValue";
    }

    /**
     * 显示辅助操控设备
     * @return
     */
    @RequestMapping("/listManipulationPropertyValue")
    public String listManipulationPropertyValue(){return "PropertyValue/listManipulationPropertyValue";}
    @RequestMapping("/addManipulationPropertyValue")
    public String addManipulationPropertyValue(){return "PropertyValue/addManipulationPropertyValue";}
    @RequestMapping("/editManipulationPropertyValue")
    public String editManipulationPropertyValue(){
        return "PropertyValue/editManipulationPropertyValue";
    }
    //******************************************

    /**
     * 显示汽车列表
     * @return
     */
    @RequestMapping("/listCar")
    public String listCar(){
        return "car/listCar";
    }

    /**
     * 编辑汽车
     * @return
     */
    @RequestMapping("/editCar")
    public String editCar(){
        return "car/editCar";
    }

    //********************************

    /**
     * 添加车图
     * @return
     */
    @RequestMapping("/addCarImage")
    public String addCarImage(){
        return "carImage/addCarImage";
    }
}
