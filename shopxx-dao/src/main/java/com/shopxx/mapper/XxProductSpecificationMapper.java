package com.shopxx.mapper;

import com.shopxx.pojo.XxProductSpecificationExample;
import com.shopxx.pojo.XxProductSpecificationKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxProductSpecificationMapper {
    int countByExample(XxProductSpecificationExample example);

    int deleteByExample(XxProductSpecificationExample example);

    int deleteByPrimaryKey(XxProductSpecificationKey key);

    int insert(XxProductSpecificationKey record);

    int insertSelective(XxProductSpecificationKey record);

    List<XxProductSpecificationKey> selectByExample(XxProductSpecificationExample example);

    int updateByExampleSelective(@Param("record") XxProductSpecificationKey record, @Param("example") XxProductSpecificationExample example);

    int updateByExample(@Param("record") XxProductSpecificationKey record, @Param("example") XxProductSpecificationExample example);
}