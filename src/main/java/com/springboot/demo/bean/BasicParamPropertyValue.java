package com.springboot.demo.bean;

import java.util.Date;
import java.util.Objects;

/**
 * 设置基本参数属性值
 */
public class BasicParamPropertyValue {
    private Integer id;
    private Integer ccategoryId;  //三级分类id
    private String manufacturer; //厂商
    private String rank; //级别
    private String energyType; //能源类型
    private String environmentalProtection; //环保
    private Date markTime; //上市时间
    private Integer maxPower; //最大功率
    private Integer maxTorque; //最大扭矩
    private String engine; //发动机
    private String gearbox; //变速箱
    private String lengthWidthHeight; //长*宽*高(mm)
    private String bodyStructure; //车身结构
    private double maximumSpeed; //最高车速(km/h)
    private Double officialSpeed;//官方0-100km/h加速(s)
    private Double measuredSpeed;//实测0-100km/h加速(s)
    private double measuredBraking; //实测0-100km/h制动(m)
    private double cfcomoiat; //工信部综合油耗(L/100km)
    private double measuredConsumption; //实测油耗(L/100km)
    private String vehicleWarranty; //整车质保

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

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getEnergyType() {
        return energyType;
    }

    public void setEnergyType(String energyType) {
        this.energyType = energyType;
    }

    public String getEnvironmentalProtection() {
        return environmentalProtection;
    }

    public void setEnvironmentalProtection(String environmentalProtection) {
        this.environmentalProtection = environmentalProtection;
    }

    public Date getMarkTime() {
        return markTime;
    }

    public void setMarkTime(Date markTime) {
        this.markTime = markTime;
    }

    public Integer getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(Integer maxPower) {
        this.maxPower = maxPower;
    }

    public Integer getMaxTorque() {
        return maxTorque;
    }

    public void setMaxTorque(Integer maxTorque) {
        this.maxTorque = maxTorque;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getGearbox() {
        return gearbox;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }

    public String getLengthWidthHeight() {
        return lengthWidthHeight;
    }

    public void setLengthWidthHeight(String lengthWidthHeight) {
        this.lengthWidthHeight = lengthWidthHeight;
    }

    public String getBodyStructure() {
        return bodyStructure;
    }

    public void setBodyStructure(String bodyStructure) {
        this.bodyStructure = bodyStructure;
    }

    public double getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(double maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public Double getOfficialSpeed() {
        return officialSpeed;
    }

    public void setOfficialSpeed(Double officialSpeed) {
        this.officialSpeed = officialSpeed;
    }

    public Double getMeasuredSpeed() {
        return measuredSpeed;
    }

    public void setMeasuredSpeed(Double measuredSpeed) {
        this.measuredSpeed = measuredSpeed;
    }

    public double getMeasuredBraking() {
        return measuredBraking;
    }

    public void setMeasuredBraking(double measuredBraking) {
        this.measuredBraking = measuredBraking;
    }

    public double getCfcomoiat() {
        return cfcomoiat;
    }

    public void setCfcomoiat(double cfcomoiat) {
        this.cfcomoiat = cfcomoiat;
    }

    public double getMeasuredConsumption() {
        return measuredConsumption;
    }

    public void setMeasuredConsumption(double measuredConsumption) {
        this.measuredConsumption = measuredConsumption;
    }

    public String getVehicleWarranty() {
        return vehicleWarranty;
    }

    public void setVehicleWarranty(String vehicleWarranty) {
        this.vehicleWarranty = vehicleWarranty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasicParamPropertyValue that = (BasicParamPropertyValue) o;
        return Double.compare(that.maximumSpeed, maximumSpeed) == 0 &&
                Double.compare(that.measuredBraking, measuredBraking) == 0 &&
                Double.compare(that.cfcomoiat, cfcomoiat) == 0 &&
                Double.compare(that.measuredConsumption, measuredConsumption) == 0 &&
                Objects.equals(id, that.id) &&
                Objects.equals(ccategoryId, that.ccategoryId) &&
                Objects.equals(manufacturer, that.manufacturer) &&
                Objects.equals(rank, that.rank) &&
                Objects.equals(energyType, that.energyType) &&
                Objects.equals(environmentalProtection, that.environmentalProtection) &&
                Objects.equals(markTime, that.markTime) &&
                Objects.equals(maxPower, that.maxPower) &&
                Objects.equals(maxTorque, that.maxTorque) &&
                Objects.equals(engine, that.engine) &&
                Objects.equals(gearbox, that.gearbox) &&
                Objects.equals(lengthWidthHeight, that.lengthWidthHeight) &&
                Objects.equals(bodyStructure, that.bodyStructure) &&
                Objects.equals(officialSpeed, that.officialSpeed) &&
                Objects.equals(measuredSpeed, that.measuredSpeed) &&
                Objects.equals(vehicleWarranty, that.vehicleWarranty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ccategoryId, manufacturer, rank, energyType, environmentalProtection, markTime, maxPower, maxTorque, engine, gearbox, lengthWidthHeight, bodyStructure, maximumSpeed, officialSpeed, measuredSpeed, measuredBraking, cfcomoiat, measuredConsumption, vehicleWarranty);
    }

    @Override
    public String toString() {
        return "BasicParamPropertyValue{" +
                "id=" + id +
                ", ccategoryId=" + ccategoryId +
                ", manufacturer='" + manufacturer + '\'' +
                ", rank='" + rank + '\'' +
                ", energyType='" + energyType + '\'' +
                ", environmentalProtection='" + environmentalProtection + '\'' +
                ", markTime=" + markTime +
                ", maxPower=" + maxPower +
                ", maxTorque=" + maxTorque +
                ", engine='" + engine + '\'' +
                ", gearbox='" + gearbox + '\'' +
                ", lengthWidthHeight='" + lengthWidthHeight + '\'' +
                ", bodyStructure='" + bodyStructure + '\'' +
                ", maximumSpeed=" + maximumSpeed +
                ", officialSpeed=" + officialSpeed +
                ", measuredSpeed=" + measuredSpeed +
                ", measuredBraking=" + measuredBraking +
                ", cfcomoiat=" + cfcomoiat +
                ", measuredConsumption=" + measuredConsumption +
                ", vehicleWarranty='" + vehicleWarranty + '\'' +
                '}';
    }
}
