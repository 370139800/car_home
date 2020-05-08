package com.springboot.demo.bean;

import java.util.Objects;

/**
 * 汽车图片
 */
public class CarImage {
    private Integer id;
    private Integer ccarId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCcarId() {
        return ccarId;
    }

    public void setCcarId(Integer ccarId) {
        this.ccarId = ccarId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarImage carImage = (CarImage) o;
        return id.equals(carImage.id) &&
                ccarId.equals(carImage.ccarId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ccarId);
    }

    @Override
    public String toString() {
        return "CarImage{" +
                "id=" + id +
                ", ccarId=" + ccarId +
                '}';
    }
}
