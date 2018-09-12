package com.shopxx.mapper;

import com.shopxx.pojo.XxProductTagExample;
import com.shopxx.pojo.XxProductTagKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxProductTagMapper {
    int countByExample(XxProductTagExample example);

    int deleteByExample(XxProductTagExample example);

    int deleteByPrimaryKey(XxProductTagKey key);

    int insert(XxProductTagKey record);

    int insertSelective(XxProductTagKey record);

    List<XxProductTagKey> selectByExample(XxProductTagExample example);

    int updateByExampleSelective(@Param("record") XxProductTagKey record, @Param("example") XxProductTagExample example);

    int updateByExample(@Param("record") XxProductTagKey record, @Param("example") XxProductTagExample example);
}