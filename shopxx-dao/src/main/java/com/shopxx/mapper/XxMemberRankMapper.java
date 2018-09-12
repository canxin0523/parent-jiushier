package com.shopxx.mapper;

import com.shopxx.pojo.XxMemberRank;
import com.shopxx.pojo.XxMemberRankExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxMemberRankMapper {
    int countByExample(XxMemberRankExample example);

    int deleteByExample(XxMemberRankExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxMemberRank record);

    int insertSelective(XxMemberRank record);

    List<XxMemberRank> selectByExample(XxMemberRankExample example);

    XxMemberRank selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxMemberRank record, @Param("example") XxMemberRankExample example);

    int updateByExample(@Param("record") XxMemberRank record, @Param("example") XxMemberRankExample example);

    int updateByPrimaryKeySelective(XxMemberRank record);

    int updateByPrimaryKey(XxMemberRank record);
}