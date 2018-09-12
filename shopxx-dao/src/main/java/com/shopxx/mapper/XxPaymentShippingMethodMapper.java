package com.shopxx.mapper;

import com.shopxx.pojo.XxPaymentShippingMethodExample;
import com.shopxx.pojo.XxPaymentShippingMethodKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxPaymentShippingMethodMapper {
    int countByExample(XxPaymentShippingMethodExample example);

    int deleteByExample(XxPaymentShippingMethodExample example);

    int deleteByPrimaryKey(XxPaymentShippingMethodKey key);

    int insert(XxPaymentShippingMethodKey record);

    int insertSelective(XxPaymentShippingMethodKey record);

    List<XxPaymentShippingMethodKey> selectByExample(XxPaymentShippingMethodExample example);

    int updateByExampleSelective(@Param("record") XxPaymentShippingMethodKey record, @Param("example") XxPaymentShippingMethodExample example);

    int updateByExample(@Param("record") XxPaymentShippingMethodKey record, @Param("example") XxPaymentShippingMethodExample example);
}