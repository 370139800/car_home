package com.springboot.demo.bean;

import java.util.Objects;

/**
 * 底盘转向
 */
public class ChassissteeringPropertyvalue {

    private Integer id;
    private Integer ccategoryId; //三级分类id
    private String drivemode; //驱动方式
    private String allwheeldriveform; //四驱形式
    private String centraldifferentialstructure; //中央差速器结构
    private String frontsuspensiontype; //前悬架类型
    private String rearsuspensiontype; //后悬架类型
    private String powertype; //助力类型
    private String bodystructure; //车体结构

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

    public String getDrivemode() {
        return drivemode;
    }

    public void setDrivemode(String drivemode) {
        this.drivemode = drivemode;
    }

    public String getAllwheeldriveform() {
        return allwheeldriveform;
    }

    public void setAllwheeldriveform(String allwheeldriveform) {
        this.allwheeldriveform = allwheeldriveform;
    }

    public String getCentraldifferentialstructure() {
        return centraldifferentialstructure;
    }

    public void setCentraldifferentialstructure(String centraldifferentialstructure) {
        this.centraldifferentialstructure = centraldifferentialstructure;
    }

    public String getFrontsuspensiontype() {
        return frontsuspensiontype;
    }

    public void setFrontsuspensiontype(String frontsuspensiontype) {
        this.frontsuspensiontype = frontsuspensiontype;
    }

    public String getRearsuspensiontype() {
        return rearsuspensiontype;
    }

    public void setRearsuspensiontype(String rearsuspensiontype) {
        this.rearsuspensiontype = rearsuspensiontype;
    }

    public String getPowertype() {
        return powertype;
    }

    public void setPowertype(String powertype) {
        this.powertype = powertype;
    }

    public String getBodystructure() {
        return bodystructure;
    }

    public void setBodystructure(String bodystructure) {
        this.bodystructure = bodystructure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChassissteeringPropertyvalue that = (ChassissteeringPropertyvalue) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(ccategoryId, that.ccategoryId) &&
                Objects.equals(drivemode, that.drivemode) &&
                Objects.equals(allwheeldriveform, that.allwheeldriveform) &&
                Objects.equals(centraldifferentialstructure, that.centraldifferentialstructure) &&
                Objects.equals(frontsuspensiontype, that.frontsuspensiontype) &&
                Objects.equals(rearsuspensiontype, that.rearsuspensiontype) &&
                Objects.equals(powertype, that.powertype) &&
                Objects.equals(bodystructure, that.bodystructure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ccategoryId, drivemode, allwheeldriveform, centraldifferentialstructure, frontsuspensiontype, rearsuspensiontype, powertype, bodystructure);
    }

    @Override
    public String toString() {
        return "ChassissteeringPropertyvalue{" +
                "id=" + id +
                ", ccategoryId=" + ccategoryId +
                ", drivemode='" + drivemode + '\'' +
                ", allwheeldriveform='" + allwheeldriveform + '\'' +
                ", centraldifferentialstructure='" + centraldifferentialstructure + '\'' +
                ", frontsuspensiontype='" + frontsuspensiontype + '\'' +
                ", rearsuspensiontype='" + rearsuspensiontype + '\'' +
                ", powertype='" + powertype + '\'' +
                ", bodystructure='" + bodystructure + '\'' +
                '}';
    }
}
