package com.shopxx.mapper;

import com.shopxx.pojo.XxAttribute;
import com.shopxx.pojo.XxAttributeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxAttributeMapper {
    int countByExample(XxAttributeExample example);

    int deleteByExample(XxAttributeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxAttribute record);

    int insertSelective(XxAttribute record);

    List<XxAttribute> selectByExample(XxAttributeExample example);

    XxAttribute selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxAttribute record, @Param("example") XxAttributeExample example);

    int updateByExample(@Param("record") XxAttribute record, @Param("example") XxAttributeExample example);

    int updateByPrimaryKeySelective(XxAttribute record);

    int updateByPrimaryKey(XxAttribute record);
}