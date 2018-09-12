package com.shopxx.mapper;

import com.shopxx.pojo.XxSpecification;
import com.shopxx.pojo.XxSpecificationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxSpecificationMapper {
    int countByExample(XxSpecificationExample example);

    int deleteByExample(XxSpecificationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxSpecification record);

    int insertSelective(XxSpecification record);

    List<XxSpecification> selectByExample(XxSpecificationExample example);

    XxSpecification selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxSpecification record, @Param("example") XxSpecificationExample example);

    int updateByExample(@Param("record") XxSpecification record, @Param("example") XxSpecificationExample example);

    int updateByPrimaryKeySelective(XxSpecification record);

    int updateByPrimaryKey(XxSpecification record);
}