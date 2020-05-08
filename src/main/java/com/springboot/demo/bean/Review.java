package com.springboot.demo.bean;

import java.util.Date;
import java.util.Objects;

/**
 * 评论
 */
public class Review {
    private Integer id;
    private Integer carId; //款式id
    private Integer createBy; //创建人
    private String uname; //评论人
    private String ccname; //系列
    private String cname; //款式
    private Integer status; //审核状态 未审核:0 审核未通过:1 审核通过:2
    private String review; //评语
    private Date createTime; //创建时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCcname() {
        return ccname;
    }

    public void setCcname(String ccname) {
        this.ccname = ccname;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", carId=" + carId +
                ", createBy=" + createBy +
                ", uname='" + uname + '\'' +
                ", ccname='" + ccname + '\'' +
                ", cname='" + cname + '\'' +
                ", status=" + status +
                ", review='" + review + '\'' +
                ", createTime=" + createTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Review review1 = (Review) o;
        return Objects.equals(id, review1.id) &&
                Objects.equals(carId, review1.carId) &&
                Objects.equals(createBy, review1.createBy) &&
                Objects.equals(uname, review1.uname) &&
                Objects.equals(ccname, review1.ccname) &&
                Objects.equals(cname, review1.cname) &&
                Objects.equals(status, review1.status) &&
                Objects.equals(review, review1.review) &&
                Objects.equals(createTime, review1.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, carId, createBy, uname, ccname, cname, status, review, createTime);
    }
}
