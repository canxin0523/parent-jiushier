package com.shopxx.mapper;

import com.shopxx.pojo.XxProductCategory;
import com.shopxx.pojo.XxProductCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxProductCategoryMapper {
    int countByExample(XxProductCategoryExample example);

    int deleteByExample(XxProductCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxProductCategory record);

    int insertSelective(XxProductCategory record);

    List<XxProductCategory> selectByExample(XxProductCategoryExample example);

    XxProductCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxProductCategory record, @Param("example") XxProductCategoryExample example);

    int updateByExample(@Param("record") XxProductCategory record, @Param("example") XxProductCategoryExample example);

    int updateByPrimaryKeySelective(XxProductCategory record);

    int updateByPrimaryKey(XxProductCategory record);
}