package com.springboot.demo.interceptor;

import org.apache.commons.lang.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class BPLoginInteceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();//获取session对象
        String ContextPath = session.getServletContext().getContextPath();  //获取上下文
        /*if("".equals(ContextPath)){
            response.sendRedirect("backstagelogin");
            return false;
        }*/
        String []requireAuthPages = new String[]{
                "listUserPage", "editUser", "addUser", "updateImage", "updateManagerImage","index",
                "editManager", "exit", "listCarMark", "updateCarMarkImage", "editCarMark", "addCarMark", "showCarMarkDetail",
                "listStairCarCategory", "editStairCarCategory", "listSecondCarCategory", "editSecondCarCategory",
                "listThridCarCategory", "editThridCarCategory", "listBasicParamPropertyValue", "editBasicParamPropertyValue",
                "addBasicParamPropertyValue", "listBodyworkPropertyvalue", "addBodyworkPropertyvalue", "editBodyworkPropertyValue",
                "listEnginePropertyValue", "editEnginePropertyValue", "addEnginePropertyValue", "listGearboxPropertyValue",
                "editGearboxPropertyValue", "addGearboxPropertyValue", "listChassissteeringPropertyValue", "addChassissteeringPropertyValue",
                "editChassissteeringPropertyValue", "listWheelbrakePropertyValue", "addWheelbreakePropertyValue",
                "editWheelbreakPropertyValue", "listSafetyquipmentPropertyValue", "addSafetyquipmentPropertyValue",
                "editSafetyquipmentPropertyValue","listManipulationPropertyValue","addManipulationPropertyValue",
                "editManipulationPropertyValue","listCar","editCar","addCarImage",
                "carCategory/**",
                "user/**",
                "car/**",
                "carImage/**",
                "carMark/**",
                "manager/getManagerUserById",
                "manager/changeManagerUserMsg",
                "manager/updateManagerImage",
                "propertyValue/**"
        };
        String uri = request.getRequestURI(); //获取请求路径
        uri = StringUtils.remove(uri, ContextPath+"/");  //获取有效路径
        String page = uri;
        //判断数组中是否含有此路径,若有执行true
        if(beginWith(page,requireAuthPages)){
            //采用shiro判断是否登录,若没有登录重定向到login页面
            Subject subject = SecurityUtils.getSubject();
            if(!subject.isAuthenticated()) {
                response.sendRedirect("backstagelogin");
                return false;
            }
        }
        return true;
    }

    /**
     * 判断请求的路径是不是已数组中的某个开始
     * @return
     */
    private boolean beginWith(String page , String []requireAuthPages){
        boolean result = false;
        for(String require : requireAuthPages){
            if(require.equals(page)){
                result = true;
            }
        }
        return result;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
