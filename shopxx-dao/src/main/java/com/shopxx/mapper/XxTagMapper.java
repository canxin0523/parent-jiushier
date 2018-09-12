package com.shopxx.mapper;

import com.shopxx.pojo.XxTag;
import com.shopxx.pojo.XxTagExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxTagMapper {
    int countByExample(XxTagExample example);

    int deleteByExample(XxTagExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxTag record);

    int insertSelective(XxTag record);

    List<XxTag> selectByExample(XxTagExample example);

    XxTag selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxTag record, @Param("example") XxTagExample example);

    int updateByExample(@Param("record") XxTag record, @Param("example") XxTagExample example);

    int updateByPrimaryKeySelective(XxTag record);

    int updateByPrimaryKey(XxTag record);
}