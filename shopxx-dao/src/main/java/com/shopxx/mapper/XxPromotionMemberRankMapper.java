package com.shopxx.mapper;

import com.shopxx.pojo.XxPromotionMemberRankExample;
import com.shopxx.pojo.XxPromotionMemberRankKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxPromotionMemberRankMapper {
    int countByExample(XxPromotionMemberRankExample example);

    int deleteByExample(XxPromotionMemberRankExample example);

    int deleteByPrimaryKey(XxPromotionMemberRankKey key);

    int insert(XxPromotionMemberRankKey record);

    int insertSelective(XxPromotionMemberRankKey record);

    List<XxPromotionMemberRankKey> selectByExample(XxPromotionMemberRankExample example);

    int updateByExampleSelective(@Param("record") XxPromotionMemberRankKey record, @Param("example") XxPromotionMemberRankExample example);

    int updateByExample(@Param("record") XxPromotionMemberRankKey record, @Param("example") XxPromotionMemberRankExample example);
}