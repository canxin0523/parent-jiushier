package com.shopxx.mapper;

import com.shopxx.pojo.XxPluginConfigAttribute;
import com.shopxx.pojo.XxPluginConfigAttributeExample;
import com.shopxx.pojo.XxPluginConfigAttributeKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxPluginConfigAttributeMapper {
    int countByExample(XxPluginConfigAttributeExample example);

    int deleteByExample(XxPluginConfigAttributeExample example);

    int deleteByPrimaryKey(XxPluginConfigAttributeKey key);

    int insert(XxPluginConfigAttribute record);

    int insertSelective(XxPluginConfigAttribute record);

    List<XxPluginConfigAttribute> selectByExample(XxPluginConfigAttributeExample example);

    XxPluginConfigAttribute selectByPrimaryKey(XxPluginConfigAttributeKey key);

    int updateByExampleSelective(@Param("record") XxPluginConfigAttribute record, @Param("example") XxPluginConfigAttributeExample example);

    int updateByExample(@Param("record") XxPluginConfigAttribute record, @Param("example") XxPluginConfigAttributeExample example);

    int updateByPrimaryKeySelective(XxPluginConfigAttribute record);

    int updateByPrimaryKey(XxPluginConfigAttribute record);
}