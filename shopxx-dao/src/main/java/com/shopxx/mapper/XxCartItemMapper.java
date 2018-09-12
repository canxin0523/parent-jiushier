package com.shopxx.mapper;

import com.shopxx.pojo.XxCartItem;
import com.shopxx.pojo.XxCartItemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxCartItemMapper {
    int countByExample(XxCartItemExample example);

    int deleteByExample(XxCartItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxCartItem record);

    int insertSelective(XxCartItem record);

    List<XxCartItem> selectByExample(XxCartItemExample example);

    XxCartItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxCartItem record, @Param("example") XxCartItemExample example);

    int updateByExample(@Param("record") XxCartItem record, @Param("example") XxCartItemExample example);

    int updateByPrimaryKeySelective(XxCartItem record);

    int updateByPrimaryKey(XxCartItem record);
}