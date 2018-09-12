package com.shopxx.mapper;

import com.shopxx.pojo.XxProductMemberPrice;
import com.shopxx.pojo.XxProductMemberPriceExample;
import com.shopxx.pojo.XxProductMemberPriceKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxProductMemberPriceMapper {
    int countByExample(XxProductMemberPriceExample example);

    int deleteByExample(XxProductMemberPriceExample example);

    int deleteByPrimaryKey(XxProductMemberPriceKey key);

    int insert(XxProductMemberPrice record);

    int insertSelective(XxProductMemberPrice record);

    List<XxProductMemberPrice> selectByExample(XxProductMemberPriceExample example);

    XxProductMemberPrice selectByPrimaryKey(XxProductMemberPriceKey key);

    int updateByExampleSelective(@Param("record") XxProductMemberPrice record, @Param("example") XxProductMemberPriceExample example);

    int updateByExample(@Param("record") XxProductMemberPrice record, @Param("example") XxProductMemberPriceExample example);

    int updateByPrimaryKeySelective(XxProductMemberPrice record);

    int updateByPrimaryKey(XxProductMemberPrice record);
}