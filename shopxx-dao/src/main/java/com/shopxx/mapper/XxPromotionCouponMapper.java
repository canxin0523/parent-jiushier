package com.shopxx.mapper;

import com.shopxx.pojo.XxPromotionCouponExample;
import com.shopxx.pojo.XxPromotionCouponKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxPromotionCouponMapper {
    int countByExample(XxPromotionCouponExample example);

    int deleteByExample(XxPromotionCouponExample example);

    int deleteByPrimaryKey(XxPromotionCouponKey key);

    int insert(XxPromotionCouponKey record);

    int insertSelective(XxPromotionCouponKey record);

    List<XxPromotionCouponKey> selectByExample(XxPromotionCouponExample example);

    int updateByExampleSelective(@Param("record") XxPromotionCouponKey record, @Param("example") XxPromotionCouponExample example);

    int updateByExample(@Param("record") XxPromotionCouponKey record, @Param("example") XxPromotionCouponExample example);
}