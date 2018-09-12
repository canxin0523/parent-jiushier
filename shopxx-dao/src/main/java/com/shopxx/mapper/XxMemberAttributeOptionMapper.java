package com.shopxx.mapper;

import com.shopxx.pojo.XxMemberAttributeOption;
import com.shopxx.pojo.XxMemberAttributeOptionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxMemberAttributeOptionMapper {
    int countByExample(XxMemberAttributeOptionExample example);

    int deleteByExample(XxMemberAttributeOptionExample example);

    int insert(XxMemberAttributeOption record);

    int insertSelective(XxMemberAttributeOption record);

    List<XxMemberAttributeOption> selectByExample(XxMemberAttributeOptionExample example);

    int updateByExampleSelective(@Param("record") XxMemberAttributeOption record, @Param("example") XxMemberAttributeOptionExample example);

    int updateByExample(@Param("record") XxMemberAttributeOption record, @Param("example") XxMemberAttributeOptionExample example);
}