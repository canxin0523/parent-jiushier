package com.shopxx.mapper;

import com.shopxx.pojo.XxRoleAuthority;
import com.shopxx.pojo.XxRoleAuthorityExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxRoleAuthorityMapper {
    int countByExample(XxRoleAuthorityExample example);

    int deleteByExample(XxRoleAuthorityExample example);

    int insert(XxRoleAuthority record);

    int insertSelective(XxRoleAuthority record);

    List<XxRoleAuthority> selectByExample(XxRoleAuthorityExample example);

    int updateByExampleSelective(@Param("record") XxRoleAuthority record, @Param("example") XxRoleAuthorityExample example);

    int updateByExample(@Param("record") XxRoleAuthority record, @Param("example") XxRoleAuthorityExample example);
}