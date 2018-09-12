package com.shopxx.mapper;

import com.shopxx.pojo.XxProduct;
import com.shopxx.pojo.XxProductExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxProductMapper {
    int countByExample(XxProductExample example);

    int deleteByExample(XxProductExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxProduct record);

    int insertSelective(XxProduct record);

    List<XxProduct> selectByExampleWithBLOBs(XxProductExample example);

    List<XxProduct> selectByExample(XxProductExample example);

    XxProduct selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxProduct record, @Param("example") XxProductExample example);

    int updateByExampleWithBLOBs(@Param("record") XxProduct record, @Param("example") XxProductExample example);

    int updateByExample(@Param("record") XxProduct record, @Param("example") XxProductExample example);

    int updateByPrimaryKeySelective(XxProduct record);

    int updateByPrimaryKeyWithBLOBs(XxProduct record);

    int updateByPrimaryKey(XxProduct record);
}