package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.ShippingItemService;
import com.shopxx.mapper.XxShippingItemMapper;
import com.shopxx.pojo.XxShippingItem;
import com.shopxx.pojo.XxShippingItemExample;
import com.shopxx.pojo.XxShippingItemExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class ShippingItemServiceImpl implements ShippingItemService {

	@Autowired
	private XxShippingItemMapper shippingItemMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxShippingItem> findAll() {
		return shippingItemMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxShippingItem> page=   (Page<XxShippingItem>) shippingItemMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxShippingItem shippingItem) {
		shippingItemMapper.insert(shippingItem);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxShippingItem shippingItem){
		shippingItemMapper.updateByPrimaryKey(shippingItem);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxShippingItem findOne(Long id){
		return shippingItemMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			shippingItemMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxShippingItem shippingItem, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxShippingItemExample example=new XxShippingItemExample();
		Criteria criteria = example.createCriteria();
		
		if(shippingItem!=null){			
						if(shippingItem.getName()!=null && shippingItem.getName().length()>0){
				criteria.andNameLike("%"+shippingItem.getName()+"%");
			}
			if(shippingItem.getSn()!=null && shippingItem.getSn().length()>0){
				criteria.andSnLike("%"+shippingItem.getSn()+"%");
			}
	
		}
		
		Page<XxShippingItem> page= (Page<XxShippingItem>)shippingItemMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
