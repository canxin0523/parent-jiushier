package com.shopxx.mapper;

import com.shopxx.pojo.XxReturns;
import com.shopxx.pojo.XxReturnsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxReturnsMapper {
    int countByExample(XxReturnsExample example);

    int deleteByExample(XxReturnsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxReturns record);

    int insertSelective(XxReturns record);

    List<XxReturns> selectByExample(XxReturnsExample example);

    XxReturns selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxReturns record, @Param("example") XxReturnsExample example);

    int updateByExample(@Param("record") XxReturns record, @Param("example") XxReturnsExample example);

    int updateByPrimaryKeySelective(XxReturns record);

    int updateByPrimaryKey(XxReturns record);
}