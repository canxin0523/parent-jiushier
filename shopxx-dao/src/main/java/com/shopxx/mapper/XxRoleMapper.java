package com.shopxx.mapper;

import com.shopxx.pojo.XxRole;
import com.shopxx.pojo.XxRoleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxRoleMapper {
    int countByExample(XxRoleExample example);

    int deleteByExample(XxRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxRole record);

    int insertSelective(XxRole record);

    List<XxRole> selectByExample(XxRoleExample example);

    XxRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxRole record, @Param("example") XxRoleExample example);

    int updateByExample(@Param("record") XxRole record, @Param("example") XxRoleExample example);

    int updateByPrimaryKeySelective(XxRole record);

    int updateByPrimaryKey(XxRole record);
}