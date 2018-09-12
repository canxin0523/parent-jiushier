package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.CartItemService;
import com.shopxx.mapper.XxCartItemMapper;
import com.shopxx.pojo.XxCartItem;
import com.shopxx.pojo.XxCartItemExample;
import com.shopxx.pojo.XxCartItemExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class CartItemServiceImpl implements CartItemService {

	@Autowired
	private XxCartItemMapper cartItemMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxCartItem> findAll() {
		return cartItemMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxCartItem> page=   (Page<XxCartItem>) cartItemMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxCartItem cartItem) {
		cartItemMapper.insert(cartItem);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxCartItem cartItem){
		cartItemMapper.updateByPrimaryKey(cartItem);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxCartItem findOne(Long id){
		return cartItemMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			cartItemMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxCartItem cartItem, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxCartItemExample example=new XxCartItemExample();
		Criteria criteria = example.createCriteria();
		
		if(cartItem!=null){			
				
		}
		
		Page<XxCartItem> page= (Page<XxCartItem>)cartItemMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
