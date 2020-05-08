package com.springboot.demo.bean;

import java.util.Objects;

/**
 * 汽车
 */
public class Car  {
    private Integer id;
    private Integer ccategoryId; //三级分类id
    private String name; //汽车名
    private double vendorquot; //厂商报价
    private double dealerquot; //经销商报价
    private Integer output; //汽车产量
    private Integer sales; //销售量
    private double radio; //销售率
    private Integer   state; //汽车状态 1在售 0停售

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVendorquot() {
        return vendorquot;
    }

    public void setVendorquot(double vendorquot) {
        this.vendorquot = vendorquot;
    }

    public double getDealerquot() {
        return dealerquot;
    }

    public void setDealerquot(double dealerquot) {
        this.dealerquot = dealerquot;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getOutput() {
        return output;
    }

    public void setOutput(Integer output) {
        this.output = output;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.vendorquot, vendorquot) == 0 &&
                Double.compare(car.dealerquot, dealerquot) == 0 &&
                Double.compare(car.radio, radio) == 0 &&
                Objects.equals(id, car.id) &&
                Objects.equals(ccategoryId, car.ccategoryId) &&
                Objects.equals(name, car.name) &&
                Objects.equals(output, car.output) &&
                Objects.equals(sales, car.sales) &&
                Objects.equals(state, car.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ccategoryId, name, vendorquot, dealerquot, output, sales, radio, state);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", ccategoryId=" + ccategoryId +
                ", name='" + name + '\'' +
                ", vendorquot=" + vendorquot +
                ", dealerquot=" + dealerquot +
                ", output=" + output +
                ", sales=" + sales +
                ", radio=" + radio +
                ", state=" + state +
                '}';
    }
}
