package com.shopxx.mapper;

import com.shopxx.pojo.XxPromotionBrandExample;
import com.shopxx.pojo.XxPromotionBrandKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxPromotionBrandMapper {
    int countByExample(XxPromotionBrandExample example);

    int deleteByExample(XxPromotionBrandExample example);

    int deleteByPrimaryKey(XxPromotionBrandKey key);

    int insert(XxPromotionBrandKey record);

    int insertSelective(XxPromotionBrandKey record);

    List<XxPromotionBrandKey> selectByExample(XxPromotionBrandExample example);

    int updateByExampleSelective(@Param("record") XxPromotionBrandKey record, @Param("example") XxPromotionBrandExample example);

    int updateByExample(@Param("record") XxPromotionBrandKey record, @Param("example") XxPromotionBrandExample example);
}