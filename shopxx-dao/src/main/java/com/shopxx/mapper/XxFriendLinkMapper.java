package com.shopxx.mapper;

import com.shopxx.pojo.XxFriendLink;
import com.shopxx.pojo.XxFriendLinkExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxFriendLinkMapper {
    int countByExample(XxFriendLinkExample example);

    int deleteByExample(XxFriendLinkExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxFriendLink record);

    int insertSelective(XxFriendLink record);

    List<XxFriendLink> selectByExample(XxFriendLinkExample example);

    XxFriendLink selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxFriendLink record, @Param("example") XxFriendLinkExample example);

    int updateByExample(@Param("record") XxFriendLink record, @Param("example") XxFriendLinkExample example);

    int updateByPrimaryKeySelective(XxFriendLink record);

    int updateByPrimaryKey(XxFriendLink record);
}