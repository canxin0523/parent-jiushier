package com.shopxx.mapper;

import com.shopxx.pojo.XxParameter;
import com.shopxx.pojo.XxParameterExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxParameterMapper {
    int countByExample(XxParameterExample example);

    int deleteByExample(XxParameterExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxParameter record);

    int insertSelective(XxParameter record);

    List<XxParameter> selectByExample(XxParameterExample example);

    XxParameter selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxParameter record, @Param("example") XxParameterExample example);

    int updateByExample(@Param("record") XxParameter record, @Param("example") XxParameterExample example);

    int updateByPrimaryKeySelective(XxParameter record);

    int updateByPrimaryKey(XxParameter record);
}