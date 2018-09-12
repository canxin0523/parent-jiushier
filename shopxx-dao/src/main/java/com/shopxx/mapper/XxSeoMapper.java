package com.shopxx.mapper;

import com.shopxx.pojo.XxSeo;
import com.shopxx.pojo.XxSeoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxSeoMapper {
    int countByExample(XxSeoExample example);

    int deleteByExample(XxSeoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxSeo record);

    int insertSelective(XxSeo record);

    List<XxSeo> selectByExample(XxSeoExample example);

    XxSeo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxSeo record, @Param("example") XxSeoExample example);

    int updateByExample(@Param("record") XxSeo record, @Param("example") XxSeoExample example);

    int updateByPrimaryKeySelective(XxSeo record);

    int updateByPrimaryKey(XxSeo record);
}