package com.shopxx.mapper;

import com.shopxx.pojo.XxAdminRoleExample;
import com.shopxx.pojo.XxAdminRoleKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxAdminRoleMapper {
    int countByExample(XxAdminRoleExample example);

    int deleteByExample(XxAdminRoleExample example);

    int deleteByPrimaryKey(XxAdminRoleKey key);

    int insert(XxAdminRoleKey record);

    int insertSelective(XxAdminRoleKey record);

    List<XxAdminRoleKey> selectByExample(XxAdminRoleExample example);

    int updateByExampleSelective(@Param("record") XxAdminRoleKey record, @Param("example") XxAdminRoleExample example);

    int updateByExample(@Param("record") XxAdminRoleKey record, @Param("example") XxAdminRoleExample example);
}