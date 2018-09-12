package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.service.TestService;
import com.shopxx.mapper.XxAdMapper;
import com.shopxx.pojo.XxAd;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class TestServiceImpl implements TestService{
	@Autowired
	private XxAdMapper xxadMapper;
	@Override
	public XxAd findOne(Long id) {
		id=(long) 1;
		XxAd selectByPrimaryKey = xxadMapper.selectByPrimaryKey(id);
		return selectByPrimaryKey;
	}

}
