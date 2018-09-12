package com.shopxx.mapper;

import com.shopxx.pojo.XxOrderLog;
import com.shopxx.pojo.XxOrderLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxOrderLogMapper {
    int countByExample(XxOrderLogExample example);

    int deleteByExample(XxOrderLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxOrderLog record);

    int insertSelective(XxOrderLog record);

    List<XxOrderLog> selectByExample(XxOrderLogExample example);

    XxOrderLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxOrderLog record, @Param("example") XxOrderLogExample example);

    int updateByExample(@Param("record") XxOrderLog record, @Param("example") XxOrderLogExample example);

    int updateByPrimaryKeySelective(XxOrderLog record);

    int updateByPrimaryKey(XxOrderLog record);
}