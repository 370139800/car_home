package com.springboot.demo.bean;

import java.util.Objects;

/**
 * 辅助操控配置
 */
public class ManipulationPropertyValue {
    private Integer id;
    private Integer ccategoryId;
    private String parkingradar; //前/后驻车雷达
    private String auxiliaryimage; //驾驶辅助影像
    private String backawacssystem; //倒车车侧预警系统
    private String cruisesystem; //巡航系统
    private String patternswitch; //驾驶模式切换
    private String autoparkina; //自动泊车入位
    private String enginestartandstoptechnology; //发动机启停技术
    private String autobreak; //自动驻车
    private String uphillassist; //上坡辅助
    private String abruptslowdescent; //陡坡缓降
    private String variablesuspension; //可变悬架功能
    private String airsuspension; //空气悬架
    private String batteryinducedsuspension; //电池感应悬架
    private String variablesteerratio; //可变转向比
    private String centraldifferentiallocking; //中央差速器锁止功能
    private String integralactivesteer; //整体主动转向系统
    private String differentlock; //限滑差速器/差速锁
    private String wadsensor; //涉水感应系统

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCcategoryId() {
        return ccategoryId;
    }

    public void setCcategoryId(Integer ccategoryId) {
        this.ccategoryId = ccategoryId;
    }

    public String getParkingradar() {
        return parkingradar;
    }

    public void setParkingradar(String parkingradar) {
        this.parkingradar = parkingradar;
    }

    public String getAuxiliaryimage() {
        return auxiliaryimage;
    }

    public void setAuxiliaryimage(String auxiliaryimage) {
        this.auxiliaryimage = auxiliaryimage;
    }

    public String getBackawacssystem() {
        return backawacssystem;
    }

    public void setBackawacssystem(String backawacssystem) {
        this.backawacssystem = backawacssystem;
    }

    public String getCruisesystem() {
        return cruisesystem;
    }

    public void setCruisesystem(String cruisesystem) {
        this.cruisesystem = cruisesystem;
    }

    public String getPatternswitch() {
        return patternswitch;
    }

    public void setPatternswitch(String patternswitch) {
        this.patternswitch = patternswitch;
    }

    public String getAutoparkina() {
        return autoparkina;
    }

    public void setAutoparkina(String autoparkina) {
        this.autoparkina = autoparkina;
    }

    public String getEnginestartandstoptechnology() {
        return enginestartandstoptechnology;
    }

    public void setEnginestartandstoptechnology(String enginestartandstoptechnology) {
        this.enginestartandstoptechnology = enginestartandstoptechnology;
    }

    public String getAutobreak() {
        return autobreak;
    }

    public void setAutobreak(String autobreak) {
        this.autobreak = autobreak;
    }

    public String getUphillassist() {
        return uphillassist;
    }

    public void setUphillassist(String uphillassist) {
        this.uphillassist = uphillassist;
    }

    public String getAbruptslowdescent() {
        return abruptslowdescent;
    }

    public void setAbruptslowdescent(String abruptslowdescent) {
        this.abruptslowdescent = abruptslowdescent;
    }

    public String getVariablesuspension() {
        return variablesuspension;
    }

    public void setVariablesuspension(String variablesuspension) {
        this.variablesuspension = variablesuspension;
    }

    public String getAirsuspension() {
        return airsuspension;
    }

    public void setAirsuspension(String airsuspension) {
        this.airsuspension = airsuspension;
    }

    public String getBatteryinducedsuspension() {
        return batteryinducedsuspension;
    }

    public void setBatteryinducedsuspension(String batteryinducedsuspension) {
        this.batteryinducedsuspension = batteryinducedsuspension;
    }

    public String getVariablesteerratio() {
        return variablesteerratio;
    }

    public void setVariablesteerratio(String variablesteerratio) {
        this.variablesteerratio = variablesteerratio;
    }

    public String getCentraldifferentiallocking() {
        return centraldifferentiallocking;
    }

    public void setCentraldifferentiallocking(String centraldifferentiallocking) {
        this.centraldifferentiallocking = centraldifferentiallocking;
    }

    public String getIntegralactivesteer() {
        return integralactivesteer;
    }

    public void setIntegralactivesteer(String integralactivesteer) {
        this.integralactivesteer = integralactivesteer;
    }

    public String getDifferentlock() {
        return differentlock;
    }

    public void setDifferentlock(String differentlock) {
        this.differentlock = differentlock;
    }

    public String getWadsensor() {
        return wadsensor;
    }

    public void setWadsensor(String wadsensor) {
        this.wadsensor = wadsensor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ManipulationPropertyValue that = (ManipulationPropertyValue) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(ccategoryId, that.ccategoryId) &&
                Objects.equals(parkingradar, that.parkingradar) &&
                Objects.equals(auxiliaryimage, that.auxiliaryimage) &&
                Objects.equals(backawacssystem, that.backawacssystem) &&
                Objects.equals(cruisesystem, that.cruisesystem) &&
                Objects.equals(patternswitch, that.patternswitch) &&
                Objects.equals(autoparkina, that.autoparkina) &&
                Objects.equals(enginestartandstoptechnology, that.enginestartandstoptechnology) &&
                Objects.equals(autobreak, that.autobreak) &&
                Objects.equals(uphillassist, that.uphillassist) &&
                Objects.equals(abruptslowdescent, that.abruptslowdescent) &&
                Objects.equals(variablesuspension, that.variablesuspension) &&
                Objects.equals(airsuspension, that.airsuspension) &&
                Objects.equals(batteryinducedsuspension, that.batteryinducedsuspension) &&
                Objects.equals(variablesteerratio, that.variablesteerratio) &&
                Objects.equals(centraldifferentiallocking, that.centraldifferentiallocking) &&
                Objects.equals(integralactivesteer, that.integralactivesteer) &&
                Objects.equals(differentlock, that.differentlock) &&
                Objects.equals(wadsensor, that.wadsensor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ccategoryId, parkingradar, auxiliaryimage, backawacssystem, cruisesystem, patternswitch, autoparkina, enginestartandstoptechnology, autobreak, uphillassist, abruptslowdescent, variablesuspension, airsuspension, batteryinducedsuspension, variablesteerratio, centraldifferentiallocking, integralactivesteer, differentlock, wadsensor);
    }

    @Override
    public String toString() {
        return "Manipulation{" +
                "id=" + id +
                ", ccategoryId=" + ccategoryId +
                ", parkingradar='" + parkingradar + '\'' +
                ", auxiliaryimage='" + auxiliaryimage + '\'' +
                ", backawacssystem='" + backawacssystem + '\'' +
                ", cruisesystem='" + cruisesystem + '\'' +
                ", patternswitch='" + patternswitch + '\'' +
                ", autoparkina='" + autoparkina + '\'' +
                ", enginestartandstoptechnology='" + enginestartandstoptechnology + '\'' +
                ", autobreak='" + autobreak + '\'' +
                ", uphillassist='" + uphillassist + '\'' +
                ", abruptslowdescent='" + abruptslowdescent + '\'' +
                ", variablesuspension='" + variablesuspension + '\'' +
                ", airsuspension='" + airsuspension + '\'' +
                ", batteryinducedsuspension='" + batteryinducedsuspension + '\'' +
                ", variablesteerratio='" + variablesteerratio + '\'' +
                ", centraldifferentiallocking='" + centraldifferentiallocking + '\'' +
                ", integralactivesteer='" + integralactivesteer + '\'' +
                ", differentlock='" + differentlock + '\'' +
                ", wadsensor='" + wadsensor + '\'' +
                '}';
    }
}
