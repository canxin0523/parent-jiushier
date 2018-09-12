package com.shopxx.mapper;

import com.shopxx.pojo.XxReceiver;
import com.shopxx.pojo.XxReceiverExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxReceiverMapper {
    int countByExample(XxReceiverExample example);

    int deleteByExample(XxReceiverExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxReceiver record);

    int insertSelective(XxReceiver record);

    List<XxReceiver> selectByExample(XxReceiverExample example);

    XxReceiver selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxReceiver record, @Param("example") XxReceiverExample example);

    int updateByExample(@Param("record") XxReceiver record, @Param("example") XxReceiverExample example);

    int updateByPrimaryKeySelective(XxReceiver record);

    int updateByPrimaryKey(XxReceiver record);
}