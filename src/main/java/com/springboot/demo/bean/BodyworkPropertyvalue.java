package com.springboot.demo.bean;

import java.util.Objects;

/**
 * 车身
 */
public class BodyworkPropertyvalue {

    private Integer id;
    private Integer ccategoryId; //种类id
    private Integer length; //长度
    private Integer width; //宽度
    private Integer height; //高度
    private Integer wheelbase; //轴距
    private Integer frontgauge; //前轮距
    private Integer trackrear; //后轮距
    private  Integer minimumgroundclearance; //最小离地间隙
    private String bodystructure;  //车身结构
    private Integer doornumber; //车门个数
    private Integer seating; //座位个数
    private Integer oiltankcapacity; //油箱容积
    private Integer capacityofbaggagecompartment; //行李箱容积
    private Integer curbweight; //整备质量

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

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWheelbase() {
        return wheelbase;
    }

    public void setWheelbase(Integer wheelbase) {
        this.wheelbase = wheelbase;
    }

    public Integer getFrontgauge() {
        return frontgauge;
    }

    public void setFrontgauge(Integer frontgauge) {
        this.frontgauge = frontgauge;
    }

    public Integer getTrackrear() {
        return trackrear;
    }

    public void setTrackrear(Integer trackrear) {
        this.trackrear = trackrear;
    }

    public Integer getMinimumgroundclearance() {
        return minimumgroundclearance;
    }

    public void setMinimumgroundclearance(Integer minimumgroundclearance) {
        this.minimumgroundclearance = minimumgroundclearance;
    }

    public String getBodystructure() {
        return bodystructure;
    }

    public void setBodystructure(String bodystructure) {
        this.bodystructure = bodystructure;
    }

    public Integer getDoornumber() {
        return doornumber;
    }

    public void setDoornumber(Integer doornumber) {
        this.doornumber = doornumber;
    }

    public Integer getSeating() {
        return seating;
    }

    public void setSeating(Integer seating) {
        this.seating = seating;
    }

    public Integer getOiltankcapacity() {
        return oiltankcapacity;
    }

    public void setOiltankcapacity(Integer oiltankcapacity) {
        this.oiltankcapacity = oiltankcapacity;
    }

    public Integer getCapacityofbaggagecompartment() {
        return capacityofbaggagecompartment;
    }

    public void setCapacityofbaggagecompartment(Integer capacityofbaggagecompartment) {
        this.capacityofbaggagecompartment = capacityofbaggagecompartment;
    }

    public Integer getCurbweight() {
        return curbweight;
    }

    public void setCurbweight(Integer curbweight) {
        this.curbweight = curbweight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BodyworkPropertyvalue that = (BodyworkPropertyvalue) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(ccategoryId, that.ccategoryId) &&
                Objects.equals(length, that.length) &&
                Objects.equals(width, that.width) &&
                Objects.equals(height, that.height) &&
                Objects.equals(wheelbase, that.wheelbase) &&
                Objects.equals(frontgauge, that.frontgauge) &&
                Objects.equals(trackrear, that.trackrear) &&
                Objects.equals(minimumgroundclearance, that.minimumgroundclearance) &&
                Objects.equals(bodystructure, that.bodystructure) &&
                Objects.equals(doornumber, that.doornumber) &&
                Objects.equals(seating, that.seating) &&
                Objects.equals(oiltankcapacity, that.oiltankcapacity) &&
                Objects.equals(capacityofbaggagecompartment, that.capacityofbaggagecompartment) &&
                Objects.equals(curbweight, that.curbweight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ccategoryId, length, width, height, wheelbase, frontgauge, trackrear, minimumgroundclearance, bodystructure, doornumber, seating, oiltankcapacity, capacityofbaggagecompartment, curbweight);
    }

    @Override
    public String toString() {
        return "BodyworkPropertyvalue{" +
                "id=" + id +
                ", ccategoryId=" + ccategoryId +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", wheelbase=" + wheelbase +
                ", frontgauge=" + frontgauge +
                ", trackrear=" + trackrear +
                ", minimumgroundclearance=" + minimumgroundclearance +
                ", bodystructure='" + bodystructure + '\'' +
                ", doornumber=" + doornumber +
                ", seating=" + seating +
                ", oiltankcapacity=" + oiltankcapacity +
                ", capacityofbaggagecompartment=" + capacityofbaggagecompartment +
                ", curbweight=" + curbweight +
                '}';
    }
}
