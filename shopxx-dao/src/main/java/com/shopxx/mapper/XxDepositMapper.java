package com.shopxx.mapper;

import com.shopxx.pojo.XxDeposit;
import com.shopxx.pojo.XxDepositExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxDepositMapper {
    int countByExample(XxDepositExample example);

    int deleteByExample(XxDepositExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxDeposit record);

    int insertSelective(XxDeposit record);

    List<XxDeposit> selectByExample(XxDepositExample example);

    XxDeposit selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxDeposit record, @Param("example") XxDepositExample example);

    int updateByExample(@Param("record") XxDeposit record, @Param("example") XxDepositExample example);

    int updateByPrimaryKeySelective(XxDeposit record);

    int updateByPrimaryKey(XxDeposit record);
}