package com.shopxx.mapper;

import com.shopxx.pojo.XxProductSpecificationValueExample;
import com.shopxx.pojo.XxProductSpecificationValueKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxProductSpecificationValueMapper {
    int countByExample(XxProductSpecificationValueExample example);

    int deleteByExample(XxProductSpecificationValueExample example);

    int deleteByPrimaryKey(XxProductSpecificationValueKey key);

    int insert(XxProductSpecificationValueKey record);

    int insertSelective(XxProductSpecificationValueKey record);

    List<XxProductSpecificationValueKey> selectByExample(XxProductSpecificationValueExample example);

    int updateByExampleSelective(@Param("record") XxProductSpecificationValueKey record, @Param("example") XxProductSpecificationValueExample example);

    int updateByExample(@Param("record") XxProductSpecificationValueKey record, @Param("example") XxProductSpecificationValueExample example);
}