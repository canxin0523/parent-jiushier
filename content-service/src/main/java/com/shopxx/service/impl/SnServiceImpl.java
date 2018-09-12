package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.SnService;
import com.shopxx.mapper.XxSnMapper;
import com.shopxx.pojo.XxSn;
import com.shopxx.pojo.XxSnExample;
import com.shopxx.pojo.XxSnExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class SnServiceImpl implements SnService {

	@Autowired
	private XxSnMapper snMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxSn> findAll() {
		return snMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxSn> page=   (Page<XxSn>) snMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxSn sn) {
		snMapper.insert(sn);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxSn sn){
		snMapper.updateByPrimaryKey(sn);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxSn findOne(Long id){
		return snMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			snMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxSn sn, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxSnExample example=new XxSnExample();
		Criteria criteria = example.createCriteria();
		
		if(sn!=null){			
				
		}
		
		Page<XxSn> page= (Page<XxSn>)snMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
