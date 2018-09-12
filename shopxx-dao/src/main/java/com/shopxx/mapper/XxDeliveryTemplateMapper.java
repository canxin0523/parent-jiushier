package com.shopxx.mapper;

import com.shopxx.pojo.XxDeliveryTemplate;
import com.shopxx.pojo.XxDeliveryTemplateExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxDeliveryTemplateMapper {
    int countByExample(XxDeliveryTemplateExample example);

    int deleteByExample(XxDeliveryTemplateExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxDeliveryTemplate record);

    int insertSelective(XxDeliveryTemplate record);

    List<XxDeliveryTemplate> selectByExampleWithBLOBs(XxDeliveryTemplateExample example);

    List<XxDeliveryTemplate> selectByExample(XxDeliveryTemplateExample example);

    XxDeliveryTemplate selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxDeliveryTemplate record, @Param("example") XxDeliveryTemplateExample example);

    int updateByExampleWithBLOBs(@Param("record") XxDeliveryTemplate record, @Param("example") XxDeliveryTemplateExample example);

    int updateByExample(@Param("record") XxDeliveryTemplate record, @Param("example") XxDeliveryTemplateExample example);

    int updateByPrimaryKeySelective(XxDeliveryTemplate record);

    int updateByPrimaryKeyWithBLOBs(XxDeliveryTemplate record);

    int updateByPrimaryKey(XxDeliveryTemplate record);
}