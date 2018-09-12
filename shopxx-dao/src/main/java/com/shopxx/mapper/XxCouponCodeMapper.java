package com.shopxx.mapper;

import com.shopxx.pojo.XxCouponCode;
import com.shopxx.pojo.XxCouponCodeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxCouponCodeMapper {
    int countByExample(XxCouponCodeExample example);

    int deleteByExample(XxCouponCodeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxCouponCode record);

    int insertSelective(XxCouponCode record);

    List<XxCouponCode> selectByExample(XxCouponCodeExample example);

    XxCouponCode selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxCouponCode record, @Param("example") XxCouponCodeExample example);

    int updateByExample(@Param("record") XxCouponCode record, @Param("example") XxCouponCodeExample example);

    int updateByPrimaryKeySelective(XxCouponCode record);

    int updateByPrimaryKey(XxCouponCode record);
}