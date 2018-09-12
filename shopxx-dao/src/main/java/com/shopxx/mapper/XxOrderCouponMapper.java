package com.shopxx.mapper;

import com.shopxx.pojo.XxOrderCoupon;
import com.shopxx.pojo.XxOrderCouponExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxOrderCouponMapper {
    int countByExample(XxOrderCouponExample example);

    int deleteByExample(XxOrderCouponExample example);

    int insert(XxOrderCoupon record);

    int insertSelective(XxOrderCoupon record);

    List<XxOrderCoupon> selectByExample(XxOrderCouponExample example);

    int updateByExampleSelective(@Param("record") XxOrderCoupon record, @Param("example") XxOrderCouponExample example);

    int updateByExample(@Param("record") XxOrderCoupon record, @Param("example") XxOrderCouponExample example);
}