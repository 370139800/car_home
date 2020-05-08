package com.springboot.demo.bean;

import java.util.Objects;

/**
 * 变速箱
 */
public class GearboxPropertyValue {

    private Integer id;
    private Integer ccategoryId;
    private Integer blocknumber; //挡位个数
    private String gearboxtype; //变速箱类型
    private String forshort; //简称

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

    public Integer getBlocknumber() {
        return blocknumber;
    }

    public void setBlocknumber(Integer blocknumber) {
        this.blocknumber = blocknumber;
    }

    public String getGearboxtype() {
        return gearboxtype;
    }

    public void setGearboxtype(String gearboxtype) {
        this.gearboxtype = gearboxtype;
    }

    public String getForshort() {
        return forshort;
    }

    public void setForshort(String forshort) {
        this.forshort = forshort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GearboxPropertyValue that = (GearboxPropertyValue) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(ccategoryId, that.ccategoryId) &&
                Objects.equals(blocknumber, that.blocknumber) &&
                Objects.equals(gearboxtype, that.gearboxtype) &&
                Objects.equals(forshort, that.forshort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ccategoryId, blocknumber, gearboxtype, forshort);
    }

    @Override
    public String toString() {
        return "GearboxPropertyValue{" +
                "id=" + id +
                ", ccategoryId=" + ccategoryId +
                ", blocknumber=" + blocknumber +
                ", gearboxtype='" + gearboxtype + '\'' +
                ", forshort='" + forshort + '\'' +
                '}';
    }
}
