package com.shopxx.mapper;

import com.shopxx.pojo.XxProductCategoryBrandExample;
import com.shopxx.pojo.XxProductCategoryBrandKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxProductCategoryBrandMapper {
    int countByExample(XxProductCategoryBrandExample example);

    int deleteByExample(XxProductCategoryBrandExample example);

    int deleteByPrimaryKey(XxProductCategoryBrandKey key);

    int insert(XxProductCategoryBrandKey record);

    int insertSelective(XxProductCategoryBrandKey record);

    List<XxProductCategoryBrandKey> selectByExample(XxProductCategoryBrandExample example);

    int updateByExampleSelective(@Param("record") XxProductCategoryBrandKey record, @Param("example") XxProductCategoryBrandExample example);

    int updateByExample(@Param("record") XxProductCategoryBrandKey record, @Param("example") XxProductCategoryBrandExample example);
}