package com.shopxx.mapper;

import com.shopxx.pojo.XxMember;
import com.shopxx.pojo.XxMemberExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxMemberMapper {
    int countByExample(XxMemberExample example);

    int deleteByExample(XxMemberExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxMember record);

    int insertSelective(XxMember record);

    List<XxMember> selectByExample(XxMemberExample example);

    XxMember selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxMember record, @Param("example") XxMemberExample example);

    int updateByExample(@Param("record") XxMember record, @Param("example") XxMemberExample example);

    int updateByPrimaryKeySelective(XxMember record);

    int updateByPrimaryKey(XxMember record);
}