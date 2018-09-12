package com.shopxx.mapper;

import com.shopxx.pojo.XxDeliveryCorp;
import com.shopxx.pojo.XxDeliveryCorpExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxDeliveryCorpMapper {
    int countByExample(XxDeliveryCorpExample example);

    int deleteByExample(XxDeliveryCorpExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxDeliveryCorp record);

    int insertSelective(XxDeliveryCorp record);

    List<XxDeliveryCorp> selectByExample(XxDeliveryCorpExample example);

    XxDeliveryCorp selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxDeliveryCorp record, @Param("example") XxDeliveryCorpExample example);

    int updateByExample(@Param("record") XxDeliveryCorp record, @Param("example") XxDeliveryCorpExample example);

    int updateByPrimaryKeySelective(XxDeliveryCorp record);

    int updateByPrimaryKey(XxDeliveryCorp record);
}