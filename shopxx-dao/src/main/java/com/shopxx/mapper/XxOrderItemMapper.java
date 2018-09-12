package com.shopxx.mapper;

import com.shopxx.pojo.XxOrderItem;
import com.shopxx.pojo.XxOrderItemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxOrderItemMapper {
    int countByExample(XxOrderItemExample example);

    int deleteByExample(XxOrderItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxOrderItem record);

    int insertSelective(XxOrderItem record);

    List<XxOrderItem> selectByExample(XxOrderItemExample example);

    XxOrderItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxOrderItem record, @Param("example") XxOrderItemExample example);

    int updateByExample(@Param("record") XxOrderItem record, @Param("example") XxOrderItemExample example);

    int updateByPrimaryKeySelective(XxOrderItem record);

    int updateByPrimaryKey(XxOrderItem record);
}