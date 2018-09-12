package com.shopxx.mapper;

import com.shopxx.pojo.XxNavigation;
import com.shopxx.pojo.XxNavigationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxNavigationMapper {
    int countByExample(XxNavigationExample example);

    int deleteByExample(XxNavigationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxNavigation record);

    int insertSelective(XxNavigation record);

    List<XxNavigation> selectByExample(XxNavigationExample example);

    XxNavigation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxNavigation record, @Param("example") XxNavigationExample example);

    int updateByExample(@Param("record") XxNavigation record, @Param("example") XxNavigationExample example);

    int updateByPrimaryKeySelective(XxNavigation record);

    int updateByPrimaryKey(XxNavigation record);
}