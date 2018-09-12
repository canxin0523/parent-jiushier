package com.shopxx.mapper;

import com.shopxx.pojo.XxReturnsItem;
import com.shopxx.pojo.XxReturnsItemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxReturnsItemMapper {
    int countByExample(XxReturnsItemExample example);

    int deleteByExample(XxReturnsItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxReturnsItem record);

    int insertSelective(XxReturnsItem record);

    List<XxReturnsItem> selectByExample(XxReturnsItemExample example);

    XxReturnsItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxReturnsItem record, @Param("example") XxReturnsItemExample example);

    int updateByExample(@Param("record") XxReturnsItem record, @Param("example") XxReturnsItemExample example);

    int updateByPrimaryKeySelective(XxReturnsItem record);

    int updateByPrimaryKey(XxReturnsItem record);
}