package com.shopxx.mapper;

import com.shopxx.pojo.XxArticleTagExample;
import com.shopxx.pojo.XxArticleTagKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxArticleTagMapper {
    int countByExample(XxArticleTagExample example);

    int deleteByExample(XxArticleTagExample example);

    int deleteByPrimaryKey(XxArticleTagKey key);

    int insert(XxArticleTagKey record);

    int insertSelective(XxArticleTagKey record);

    List<XxArticleTagKey> selectByExample(XxArticleTagExample example);

    int updateByExampleSelective(@Param("record") XxArticleTagKey record, @Param("example") XxArticleTagExample example);

    int updateByExample(@Param("record") XxArticleTagKey record, @Param("example") XxArticleTagExample example);
}