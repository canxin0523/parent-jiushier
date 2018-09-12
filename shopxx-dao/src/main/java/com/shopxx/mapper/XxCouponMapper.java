package com.shopxx.mapper;

import com.shopxx.pojo.XxCoupon;
import com.shopxx.pojo.XxCouponExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxCouponMapper {
    int countByExample(XxCouponExample example);

    int deleteByExample(XxCouponExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxCoupon record);

    int insertSelective(XxCoupon record);

    List<XxCoupon> selectByExampleWithBLOBs(XxCouponExample example);

    List<XxCoupon> selectByExample(XxCouponExample example);

    XxCoupon selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxCoupon record, @Param("example") XxCouponExample example);

    int updateByExampleWithBLOBs(@Param("record") XxCoupon record, @Param("example") XxCouponExample example);

    int updateByExample(@Param("record") XxCoupon record, @Param("example") XxCouponExample example);

    int updateByPrimaryKeySelective(XxCoupon record);

    int updateByPrimaryKeyWithBLOBs(XxCoupon record);

    int updateByPrimaryKey(XxCoupon record);
}