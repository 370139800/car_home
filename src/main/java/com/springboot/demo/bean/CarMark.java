package com.springboot.demo.bean;

import java.io.Serializable;
import java.util.Objects;

/**
 * 汽车标志bean对象
 */
public class CarMark implements Serializable {

    private static final long serialVersionUID = 8028980236480307857L;
    private Integer id;
    private String name;
    private String source;

    public CarMark(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarMark carMark = (CarMark) o;
        return id.equals(carMark.id) &&
                name.equals(carMark.name) &&
                source.equals(carMark.source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, source);
    }

    @Override
    public String toString() {
        return "CarMark{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", source='" + source + '\'' +
                '}';
    }
}
