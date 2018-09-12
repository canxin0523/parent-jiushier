package com.shopxx.mapper;

import com.shopxx.pojo.XxParameterGroup;
import com.shopxx.pojo.XxParameterGroupExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxParameterGroupMapper {
    int countByExample(XxParameterGroupExample example);

    int deleteByExample(XxParameterGroupExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxParameterGroup record);

    int insertSelective(XxParameterGroup record);

    List<XxParameterGroup> selectByExample(XxParameterGroupExample example);

    XxParameterGroup selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxParameterGroup record, @Param("example") XxParameterGroupExample example);

    int updateByExample(@Param("record") XxParameterGroup record, @Param("example") XxParameterGroupExample example);

    int updateByPrimaryKeySelective(XxParameterGroup record);

    int updateByPrimaryKey(XxParameterGroup record);
}