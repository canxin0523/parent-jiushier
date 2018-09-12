package com.shopxx.mapper;

import com.shopxx.pojo.XxProductParameterValue;
import com.shopxx.pojo.XxProductParameterValueExample;
import com.shopxx.pojo.XxProductParameterValueKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxProductParameterValueMapper {
    int countByExample(XxProductParameterValueExample example);

    int deleteByExample(XxProductParameterValueExample example);

    int deleteByPrimaryKey(XxProductParameterValueKey key);

    int insert(XxProductParameterValue record);

    int insertSelective(XxProductParameterValue record);

    List<XxProductParameterValue> selectByExample(XxProductParameterValueExample example);

    XxProductParameterValue selectByPrimaryKey(XxProductParameterValueKey key);

    int updateByExampleSelective(@Param("record") XxProductParameterValue record, @Param("example") XxProductParameterValueExample example);

    int updateByExample(@Param("record") XxProductParameterValue record, @Param("example") XxProductParameterValueExample example);

    int updateByPrimaryKeySelective(XxProductParameterValue record);

    int updateByPrimaryKey(XxProductParameterValue record);
}