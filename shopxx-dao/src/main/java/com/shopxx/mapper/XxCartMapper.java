package com.shopxx.mapper;

import com.shopxx.pojo.XxCart;
import com.shopxx.pojo.XxCartExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxCartMapper {
    int countByExample(XxCartExample example);

    int deleteByExample(XxCartExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxCart record);

    int insertSelective(XxCart record);

    List<XxCart> selectByExample(XxCartExample example);

    XxCart selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxCart record, @Param("example") XxCartExample example);

    int updateByExample(@Param("record") XxCart record, @Param("example") XxCartExample example);

    int updateByPrimaryKeySelective(XxCart record);

    int updateByPrimaryKey(XxCart record);
}