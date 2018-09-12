package com.shopxx.mapper;

import com.shopxx.pojo.XxShipping;
import com.shopxx.pojo.XxShippingExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxShippingMapper {
    int countByExample(XxShippingExample example);

    int deleteByExample(XxShippingExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxShipping record);

    int insertSelective(XxShipping record);

    List<XxShipping> selectByExample(XxShippingExample example);

    XxShipping selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxShipping record, @Param("example") XxShippingExample example);

    int updateByExample(@Param("record") XxShipping record, @Param("example") XxShippingExample example);

    int updateByPrimaryKeySelective(XxShipping record);

    int updateByPrimaryKey(XxShipping record);
}