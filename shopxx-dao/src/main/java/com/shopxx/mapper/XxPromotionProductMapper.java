package com.shopxx.mapper;

import com.shopxx.pojo.XxPromotionProductExample;
import com.shopxx.pojo.XxPromotionProductKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxPromotionProductMapper {
    int countByExample(XxPromotionProductExample example);

    int deleteByExample(XxPromotionProductExample example);

    int deleteByPrimaryKey(XxPromotionProductKey key);

    int insert(XxPromotionProductKey record);

    int insertSelective(XxPromotionProductKey record);

    List<XxPromotionProductKey> selectByExample(XxPromotionProductExample example);

    int updateByExampleSelective(@Param("record") XxPromotionProductKey record, @Param("example") XxPromotionProductExample example);

    int updateByExample(@Param("record") XxPromotionProductKey record, @Param("example") XxPromotionProductExample example);
}