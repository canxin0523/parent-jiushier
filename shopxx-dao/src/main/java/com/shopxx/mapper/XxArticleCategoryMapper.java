package com.shopxx.mapper;

import com.shopxx.pojo.XxArticleCategory;
import com.shopxx.pojo.XxArticleCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxArticleCategoryMapper {
    int countByExample(XxArticleCategoryExample example);

    int deleteByExample(XxArticleCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxArticleCategory record);

    int insertSelective(XxArticleCategory record);

    List<XxArticleCategory> selectByExample(XxArticleCategoryExample example);

    XxArticleCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxArticleCategory record, @Param("example") XxArticleCategoryExample example);

    int updateByExample(@Param("record") XxArticleCategory record, @Param("example") XxArticleCategoryExample example);

    int updateByPrimaryKeySelective(XxArticleCategory record);

    int updateByPrimaryKey(XxArticleCategory record);
}