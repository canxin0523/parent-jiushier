package com.shopxx.mapper;

import com.shopxx.pojo.XxPayment;
import com.shopxx.pojo.XxPaymentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxPaymentMapper {
    int countByExample(XxPaymentExample example);

    int deleteByExample(XxPaymentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxPayment record);

    int insertSelective(XxPayment record);

    List<XxPayment> selectByExample(XxPaymentExample example);

    XxPayment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxPayment record, @Param("example") XxPaymentExample example);

    int updateByExample(@Param("record") XxPayment record, @Param("example") XxPaymentExample example);

    int updateByPrimaryKeySelective(XxPayment record);

    int updateByPrimaryKey(XxPayment record);
}