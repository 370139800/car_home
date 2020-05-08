package com.springboot.demo.bean;

import java.util.Objects;

/**
 * 车轮制动
 */
public class WheelbrakePropertyvalue {

    private Integer id;
    private Integer ccategoryId; //三级分类id
    private String frontbraketype; //前制动器类型
    private String rearbraketype; //后制动器类型
    private String parkingbraketype; //驻车制动类型
    private String fronttyrespecification; //前轮胎规格
    private String reartyrespecification; //后轮胎规格
    private String sparetirespecifications; //备胎规格

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

    public String getFrontbraketype() {
        return frontbraketype;
    }

    public void setFrontbraketype(String frontbraketype) {
        this.frontbraketype = frontbraketype;
    }

    public String getRearbraketype() {
        return rearbraketype;
    }

    public void setRearbraketype(String rearbraketype) {
        this.rearbraketype = rearbraketype;
    }

    public String getParkingbraketype() {
        return parkingbraketype;
    }

    public void setParkingbraketype(String parkingbraketype) {
        this.parkingbraketype = parkingbraketype;
    }

    public String getFronttyrespecification() {
        return fronttyrespecification;
    }

    public void setFronttyrespecification(String fronttyrespecification) {
        this.fronttyrespecification = fronttyrespecification;
    }

    public String getReartyrespecification() {
        return reartyrespecification;
    }

    public void setReartyrespecification(String reartyrespecification) {
        this.reartyrespecification = reartyrespecification;
    }

    public String getSparetirespecifications() {
        return sparetirespecifications;
    }

    public void setSparetirespecifications(String sparetirespecifications) {
        this.sparetirespecifications = sparetirespecifications;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WheelbrakePropertyvalue that = (WheelbrakePropertyvalue) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(ccategoryId, that.ccategoryId) &&
                Objects.equals(frontbraketype, that.frontbraketype) &&
                Objects.equals(rearbraketype, that.rearbraketype) &&
                Objects.equals(parkingbraketype, that.parkingbraketype) &&
                Objects.equals(fronttyrespecification, that.fronttyrespecification) &&
                Objects.equals(reartyrespecification, that.reartyrespecification) &&
                Objects.equals(sparetirespecifications, that.sparetirespecifications);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ccategoryId, frontbraketype, rearbraketype, parkingbraketype, fronttyrespecification, reartyrespecification, sparetirespecifications);
    }

    @Override
    public String toString() {
        return "WheelbrakePropertyvalue{" +
                "id=" + id +
                ", ccategoryId=" + ccategoryId +
                ", frontbraketype='" + frontbraketype + '\'' +
                ", rearbraketype='" + rearbraketype + '\'' +
                ", parkingbraketype='" + parkingbraketype + '\'' +
                ", fronttyrespecification='" + fronttyrespecification + '\'' +
                ", reartyrespecification='" + reartyrespecification + '\'' +
                ", sparetirespecifications='" + sparetirespecifications + '\'' +
                '}';
    }
}
