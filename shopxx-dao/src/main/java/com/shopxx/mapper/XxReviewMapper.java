package com.shopxx.mapper;

import com.shopxx.pojo.XxReview;
import com.shopxx.pojo.XxReviewExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxReviewMapper {
    int countByExample(XxReviewExample example);

    int deleteByExample(XxReviewExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxReview record);

    int insertSelective(XxReview record);

    List<XxReview> selectByExample(XxReviewExample example);

    XxReview selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxReview record, @Param("example") XxReviewExample example);

    int updateByExample(@Param("record") XxReview record, @Param("example") XxReviewExample example);

    int updateByPrimaryKeySelective(XxReview record);

    int updateByPrimaryKey(XxReview record);
}