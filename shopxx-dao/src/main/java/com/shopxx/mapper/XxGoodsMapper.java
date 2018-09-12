package com.shopxx.mapper;

import com.shopxx.pojo.XxGoods;
import com.shopxx.pojo.XxGoodsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxGoodsMapper {
    int countByExample(XxGoodsExample example);

    int deleteByExample(XxGoodsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxGoods record);

    int insertSelective(XxGoods record);

    List<XxGoods> selectByExample(XxGoodsExample example);

    XxGoods selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxGoods record, @Param("example") XxGoodsExample example);

    int updateByExample(@Param("record") XxGoods record, @Param("example") XxGoodsExample example);

    int updateByPrimaryKeySelective(XxGoods record);

    int updateByPrimaryKey(XxGoods record);
}