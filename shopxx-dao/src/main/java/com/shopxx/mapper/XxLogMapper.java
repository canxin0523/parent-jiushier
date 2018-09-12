package com.shopxx.mapper;

import com.shopxx.pojo.XxLog;
import com.shopxx.pojo.XxLogExample;
import com.shopxx.pojo.XxLogWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxLogMapper {
    int countByExample(XxLogExample example);

    int deleteByExample(XxLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxLogWithBLOBs record);

    int insertSelective(XxLogWithBLOBs record);

    List<XxLogWithBLOBs> selectByExampleWithBLOBs(XxLogExample example);

    List<XxLog> selectByExample(XxLogExample example);

    XxLogWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxLogWithBLOBs record, @Param("example") XxLogExample example);

    int updateByExampleWithBLOBs(@Param("record") XxLogWithBLOBs record, @Param("example") XxLogExample example);

    int updateByExample(@Param("record") XxLog record, @Param("example") XxLogExample example);

    int updateByPrimaryKeySelective(XxLogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(XxLogWithBLOBs record);

    int updateByPrimaryKey(XxLog record);
}