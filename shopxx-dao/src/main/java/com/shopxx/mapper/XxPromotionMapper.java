package com.shopxx.mapper;

import com.shopxx.pojo.XxPromotion;
import com.shopxx.pojo.XxPromotionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxPromotionMapper {
    int countByExample(XxPromotionExample example);

    int deleteByExample(XxPromotionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxPromotion record);

    int insertSelective(XxPromotion record);

    List<XxPromotion> selectByExampleWithBLOBs(XxPromotionExample example);

    List<XxPromotion> selectByExample(XxPromotionExample example);

    XxPromotion selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxPromotion record, @Param("example") XxPromotionExample example);

    int updateByExampleWithBLOBs(@Param("record") XxPromotion record, @Param("example") XxPromotionExample example);

    int updateByExample(@Param("record") XxPromotion record, @Param("example") XxPromotionExample example);

    int updateByPrimaryKeySelective(XxPromotion record);

    int updateByPrimaryKeyWithBLOBs(XxPromotion record);

    int updateByPrimaryKey(XxPromotion record);
}