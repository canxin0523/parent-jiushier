package com.shopxx.mapper;

import com.shopxx.pojo.XxConsultation;
import com.shopxx.pojo.XxConsultationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxConsultationMapper {
    int countByExample(XxConsultationExample example);

    int deleteByExample(XxConsultationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxConsultation record);

    int insertSelective(XxConsultation record);

    List<XxConsultation> selectByExample(XxConsultationExample example);

    XxConsultation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxConsultation record, @Param("example") XxConsultationExample example);

    int updateByExample(@Param("record") XxConsultation record, @Param("example") XxConsultationExample example);

    int updateByPrimaryKeySelective(XxConsultation record);

    int updateByPrimaryKey(XxConsultation record);
}