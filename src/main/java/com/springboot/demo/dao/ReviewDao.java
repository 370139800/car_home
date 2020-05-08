package com.springboot.demo.dao;

import com.springboot.demo.bean.Review;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReviewDao {
    /**
     * 查询所有评论
     * @return
     */
    public List<Review> findAllReview(Review review);

    /**
     * 删除评论
     * @param id
     */
    public void deleteReview(Integer id);

    /**
     * 修改状态
     *
     */
    public void updateStatus(Review review);

    /**
     * 插入评论
     * @param review
     */
    public void insertReview(Review review);
}
