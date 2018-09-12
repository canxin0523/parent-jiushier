package com.shopxx.mapper;

import com.shopxx.pojo.XxPromotionProductCategoryExample;
import com.shopxx.pojo.XxPromotionProductCategoryKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxPromotionProductCategoryMapper {
    int countByExample(XxPromotionProductCategoryExample example);

    int deleteByExample(XxPromotionProductCategoryExample example);

    int deleteByPrimaryKey(XxPromotionProductCategoryKey key);

    int insert(XxPromotionProductCategoryKey record);

    int insertSelective(XxPromotionProductCategoryKey record);

    List<XxPromotionProductCategoryKey> selectByExample(XxPromotionProductCategoryExample example);

    int updateByExampleSelective(@Param("record") XxPromotionProductCategoryKey record, @Param("example") XxPromotionProductCategoryExample example);

    int updateByExample(@Param("record") XxPromotionProductCategoryKey record, @Param("example") XxPromotionProductCategoryExample example);
}