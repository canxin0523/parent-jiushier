package com.shopxx.mapper;

import com.shopxx.pojo.XxSpecificationValue;
import com.shopxx.pojo.XxSpecificationValueExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxSpecificationValueMapper {
    int countByExample(XxSpecificationValueExample example);

    int deleteByExample(XxSpecificationValueExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxSpecificationValue record);

    int insertSelective(XxSpecificationValue record);

    List<XxSpecificationValue> selectByExample(XxSpecificationValueExample example);

    XxSpecificationValue selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxSpecificationValue record, @Param("example") XxSpecificationValueExample example);

    int updateByExample(@Param("record") XxSpecificationValue record, @Param("example") XxSpecificationValueExample example);

    int updateByPrimaryKeySelective(XxSpecificationValue record);

    int updateByPrimaryKey(XxSpecificationValue record);
}