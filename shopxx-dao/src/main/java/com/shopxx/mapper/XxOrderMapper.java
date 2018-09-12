package com.shopxx.mapper;

import com.shopxx.pojo.XxOrder;
import com.shopxx.pojo.XxOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxOrderMapper {
    int countByExample(XxOrderExample example);

    int deleteByExample(XxOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxOrder record);

    int insertSelective(XxOrder record);

    List<XxOrder> selectByExample(XxOrderExample example);

    XxOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxOrder record, @Param("example") XxOrderExample example);

    int updateByExample(@Param("record") XxOrder record, @Param("example") XxOrderExample example);

    int updateByPrimaryKeySelective(XxOrder record);

    int updateByPrimaryKey(XxOrder record);
}