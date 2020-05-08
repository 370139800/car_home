package com.springboot.demo.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springboot.demo.bean.Review;
import com.springboot.demo.dao.ReviewDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 评论业务层
 */
@Service
public class ReviewService {

    @Resource
    private ReviewDao reviewDao;

    /**
     * 所有评论
     * @param start
     * @param size
     * @return
     */
    public  PageInfo<Review> findAllReview(int start,int size,Review review){
        PageHelper.startPage(start,size);  //支持分页
        List<Review> reviews = reviewDao.findAllReview(review);  //查询所有评论
        PageInfo<Review> pages = new PageInfo<>(reviews,5); //获取分页信息,并在导航栏显示5个数字
        return  pages;
    }

    /**
     * 删除评论
     * @param id
     */
    public void deleteReview(Integer id){
        reviewDao.deleteReview(id);
    }

    /**
     * 修改审核状态
     */
    public void updateStatus(Review review){
        reviewDao.updateStatus(review);
    }

    /**
     * 导入评论
     * @param review
     */
    public void insertReview(Review review){
        reviewDao.insertReview(review);
    }

    /**
     * 查询所有数据
     * @return
     */
    public List<Review> getListReview(Review review){
        return reviewDao.findAllReview(review);
    }
}
