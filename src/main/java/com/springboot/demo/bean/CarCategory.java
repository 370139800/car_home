package com.springboot.demo.bean;

import java.io.Serializable;
import java.util.Objects;

/**
 * 汽车种类
 */
public class CarCategory implements Serializable {

    private static final long serialVersionUID = 8028980236580307857L;
    private Integer id; //种类id
    private Integer parentId; //父级id
    private String name; //种类名

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarCategory that = (CarCategory) o;
        return id.equals(that.id) &&
                parentId.equals(that.parentId) &&
                name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, parentId, name);
    }

    @Override
    public String toString() {
        return "CarCategory{" +
                "id=" + id +
                ", parentId=" + parentId +
                ", name='" + name + '\'' +
                '}';
    }
}
