package com.springboot.demo.bean;

import java.util.Objects;

/**
 * 发动机
 */
public class EnginePropertyValue {

    private Integer id;
    private Integer ccategoryId;  //三级分类id
    private String engineype; //发动机型号
    private Integer displacement; //排量(ml)
    private String airintakeform; //进气形式
    private String cylinderarrangement; //气缸排列形式
    private  Integer numberofcylinders; //气缸数(个)
    private Integer numberofvalvespercylinder; //每缸气门数(个)
    private String compressionratio; //压缩比
    private String valvemechanism; //配气机构
    private Integer cylinderdiameter; //缸径(mm)
    private Integer journey; //行程
    private Integer maxhp; //最大马力(kw)
    private double maximumpower; //最大功率(kw)
    private Integer maximumpowerspeed; //最大功率转速(rpm)
    private String enginespecifictechnology; //发动机特有技术
    private String fuelform; //燃料形式
    private String fuellabel; //燃油标号
    private String oilsupplyway; //供油方式
    private String cylinderheadmaterial; //缸盖材料
    private String cylinderbodymaterial; //缸体材料
    private String environmentalstandard; //环保标准

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

    public String getEngineype() {
        return engineype;
    }

    public void setEngineype(String engineype) {
        this.engineype = engineype;
    }

    public Integer getDisplacement() {
        return displacement;
    }

    public void setDisplacement(Integer displacement) {
        this.displacement = displacement;
    }

    public String getAirintakeform() {
        return airintakeform;
    }

    public void setAirintakeform(String airintakeform) {
        this.airintakeform = airintakeform;
    }

    public String getCylinderarrangement() {
        return cylinderarrangement;
    }

    public void setCylinderarrangement(String cylinderarrangement) {
        this.cylinderarrangement = cylinderarrangement;
    }

    public Integer getNumberofcylinders() {
        return numberofcylinders;
    }

    public void setNumberofcylinders(Integer numberofcylinders) {
        this.numberofcylinders = numberofcylinders;
    }

    public Integer getNumberofvalvespercylinder() {
        return numberofvalvespercylinder;
    }

    public void setNumberofvalvespercylinder(Integer numberofvalvespercylinder) {
        this.numberofvalvespercylinder = numberofvalvespercylinder;
    }

    public String getCompressionratio() {
        return compressionratio;
    }

    public void setCompressionratio(String compressionratio) {
        this.compressionratio = compressionratio;
    }

    public String getValvemechanism() {
        return valvemechanism;
    }

    public void setValvemechanism(String valvemechanism) {
        this.valvemechanism = valvemechanism;
    }

    public Integer getCylinderdiameter() {
        return cylinderdiameter;
    }

    public void setCylinderdiameter(Integer cylinderdiameter) {
        this.cylinderdiameter = cylinderdiameter;
    }

    public Integer getJourney() {
        return journey;
    }

    public void setJourney(Integer journey) {
        this.journey = journey;
    }

    public Integer getMaxhp() {
        return maxhp;
    }

    public void setMaxhp(Integer maxhp) {
        this.maxhp = maxhp;
    }

    public double getMaximumpower() {
        return maximumpower;
    }

    public void setMaximumpower(double maximumpower) {
        this.maximumpower = maximumpower;
    }

    public Integer getMaximumpowerspeed() {
        return maximumpowerspeed;
    }

    public void setMaximumpowerspeed(Integer maximumpowerspeed) {
        this.maximumpowerspeed = maximumpowerspeed;
    }

    public String getEnginespecifictechnology() {
        return enginespecifictechnology;
    }

    public void setEnginespecifictechnology(String enginespecifictechnology) {
        this.enginespecifictechnology = enginespecifictechnology;
    }

    public String getFuelform() {
        return fuelform;
    }

    public void setFuelform(String fuelform) {
        this.fuelform = fuelform;
    }

    public String getFuellabel() {
        return fuellabel;
    }

    public void setFuellabel(String fuellabel) {
        this.fuellabel = fuellabel;
    }

    public String getOilsupplyway() {
        return oilsupplyway;
    }

    public void setOilsupplyway(String oilsupplyway) {
        this.oilsupplyway = oilsupplyway;
    }

    public String getCylinderheadmaterial() {
        return cylinderheadmaterial;
    }

    public void setCylinderheadmaterial(String cylinderheadmaterial) {
        this.cylinderheadmaterial = cylinderheadmaterial;
    }

    public String getCylinderbodymaterial() {
        return cylinderbodymaterial;
    }

    public void setCylinderbodymaterial(String cylinderbodymaterial) {
        this.cylinderbodymaterial = cylinderbodymaterial;
    }

    public String getEnvironmentalstandard() {
        return environmentalstandard;
    }

    public void setEnvironmentalstandard(String environmentalstandard) {
        this.environmentalstandard = environmentalstandard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnginePropertyValue that = (EnginePropertyValue) o;
        return Double.compare(that.maximumpower, maximumpower) == 0 &&
                Objects.equals(id, that.id) &&
                Objects.equals(ccategoryId, that.ccategoryId) &&
                Objects.equals(engineype, that.engineype) &&
                Objects.equals(displacement, that.displacement) &&
                Objects.equals(airintakeform, that.airintakeform) &&
                Objects.equals(cylinderarrangement, that.cylinderarrangement) &&
                Objects.equals(numberofcylinders, that.numberofcylinders) &&
                Objects.equals(numberofvalvespercylinder, that.numberofvalvespercylinder) &&
                Objects.equals(compressionratio, that.compressionratio) &&
                Objects.equals(valvemechanism, that.valvemechanism) &&
                Objects.equals(cylinderdiameter, that.cylinderdiameter) &&
                Objects.equals(journey, that.journey) &&
                Objects.equals(maxhp, that.maxhp) &&
                Objects.equals(maximumpowerspeed, that.maximumpowerspeed) &&
                Objects.equals(enginespecifictechnology, that.enginespecifictechnology) &&
                Objects.equals(fuelform, that.fuelform) &&
                Objects.equals(fuellabel, that.fuellabel) &&
                Objects.equals(oilsupplyway, that.oilsupplyway) &&
                Objects.equals(cylinderheadmaterial, that.cylinderheadmaterial) &&
                Objects.equals(cylinderbodymaterial, that.cylinderbodymaterial) &&
                Objects.equals(environmentalstandard, that.environmentalstandard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ccategoryId, engineype, displacement, airintakeform, cylinderarrangement, numberofcylinders, numberofvalvespercylinder, compressionratio, valvemechanism, cylinderdiameter, journey, maxhp, maximumpower, maximumpowerspeed, enginespecifictechnology, fuelform, fuellabel, oilsupplyway, cylinderheadmaterial, cylinderbodymaterial, environmentalstandard);
    }

    @Override
    public String toString() {
        return "EnginePropertyValue{" +
                "id=" + id +
                ", ccategoryId=" + ccategoryId +
                ", engineype='" + engineype + '\'' +
                ", displacement=" + displacement +
                ", airintakeform='" + airintakeform + '\'' +
                ", cylinderarrangement='" + cylinderarrangement + '\'' +
                ", numberofcylinders=" + numberofcylinders +
                ", numberofvalvespercylinder=" + numberofvalvespercylinder +
                ", compressionratio='" + compressionratio + '\'' +
                ", valvemechanism='" + valvemechanism + '\'' +
                ", cylinderdiameter=" + cylinderdiameter +
                ", journey=" + journey +
                ", maxhp=" + maxhp +
                ", maximumpower=" + maximumpower +
                ", maximumpowerspeed=" + maximumpowerspeed +
                ", enginespecifictechnology='" + enginespecifictechnology + '\'' +
                ", fuelform='" + fuelform + '\'' +
                ", fuellabel='" + fuellabel + '\'' +
                ", oilsupplyway='" + oilsupplyway + '\'' +
                ", cylinderheadmaterial='" + cylinderheadmaterial + '\'' +
                ", cylinderbodymaterial='" + cylinderbodymaterial + '\'' +
                ", environmentalstandard='" + environmentalstandard + '\'' +
                '}';
    }
}
