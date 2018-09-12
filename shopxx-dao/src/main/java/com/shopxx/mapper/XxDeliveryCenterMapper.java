package com.shopxx.mapper;

import com.shopxx.pojo.XxDeliveryCenter;
import com.shopxx.pojo.XxDeliveryCenterExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxDeliveryCenterMapper {
    int countByExample(XxDeliveryCenterExample example);

    int deleteByExample(XxDeliveryCenterExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxDeliveryCenter record);

    int insertSelective(XxDeliveryCenter record);

    List<XxDeliveryCenter> selectByExample(XxDeliveryCenterExample example);

    XxDeliveryCenter selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxDeliveryCenter record, @Param("example") XxDeliveryCenterExample example);

    int updateByExample(@Param("record") XxDeliveryCenter record, @Param("example") XxDeliveryCenterExample example);

    int updateByPrimaryKeySelective(XxDeliveryCenter record);

    int updateByPrimaryKey(XxDeliveryCenter record);
}