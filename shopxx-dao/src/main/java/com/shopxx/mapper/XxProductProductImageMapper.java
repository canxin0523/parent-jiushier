package com.shopxx.mapper;

import com.shopxx.pojo.XxProductProductImage;
import com.shopxx.pojo.XxProductProductImageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxProductProductImageMapper {
    int countByExample(XxProductProductImageExample example);

    int deleteByExample(XxProductProductImageExample example);

    int insert(XxProductProductImage record);

    int insertSelective(XxProductProductImage record);

    List<XxProductProductImage> selectByExample(XxProductProductImageExample example);

    int updateByExampleSelective(@Param("record") XxProductProductImage record, @Param("example") XxProductProductImageExample example);

    int updateByExample(@Param("record") XxProductProductImage record, @Param("example") XxProductProductImageExample example);
}