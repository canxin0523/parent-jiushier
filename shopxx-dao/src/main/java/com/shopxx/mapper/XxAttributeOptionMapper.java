package com.shopxx.mapper;

import com.shopxx.pojo.XxAttributeOption;
import com.shopxx.pojo.XxAttributeOptionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxAttributeOptionMapper {
    int countByExample(XxAttributeOptionExample example);

    int deleteByExample(XxAttributeOptionExample example);

    int insert(XxAttributeOption record);

    int insertSelective(XxAttributeOption record);

    List<XxAttributeOption> selectByExample(XxAttributeOptionExample example);

    int updateByExampleSelective(@Param("record") XxAttributeOption record, @Param("example") XxAttributeOptionExample example);

    int updateByExample(@Param("record") XxAttributeOption record, @Param("example") XxAttributeOptionExample example);
}