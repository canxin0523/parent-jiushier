package com.shopxx.mapper;

import com.shopxx.pojo.XxMemberFavoriteProductExample;
import com.shopxx.pojo.XxMemberFavoriteProductKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxMemberFavoriteProductMapper {
    int countByExample(XxMemberFavoriteProductExample example);

    int deleteByExample(XxMemberFavoriteProductExample example);

    int deleteByPrimaryKey(XxMemberFavoriteProductKey key);

    int insert(XxMemberFavoriteProductKey record);

    int insertSelective(XxMemberFavoriteProductKey record);

    List<XxMemberFavoriteProductKey> selectByExample(XxMemberFavoriteProductExample example);

    int updateByExampleSelective(@Param("record") XxMemberFavoriteProductKey record, @Param("example") XxMemberFavoriteProductExample example);

    int updateByExample(@Param("record") XxMemberFavoriteProductKey record, @Param("example") XxMemberFavoriteProductExample example);
}