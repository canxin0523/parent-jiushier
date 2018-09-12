package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.CartService;
import com.shopxx.mapper.XxCartMapper;
import com.shopxx.pojo.XxCart;
import com.shopxx.pojo.XxCartExample;
import com.shopxx.pojo.XxCartExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private XxCartMapper cartMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxCart> findAll() {
		return cartMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxCart> page=   (Page<XxCart>) cartMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxCart cart) {
		cartMapper.insert(cart);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxCart cart){
		cartMapper.updateByPrimaryKey(cart);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxCart findOne(Long id){
		return cartMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			cartMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxCart cart, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxCartExample example=new XxCartExample();
		Criteria criteria = example.createCriteria();
		
		if(cart!=null){			
						if(cart.getCartKey()!=null && cart.getCartKey().length()>0){
				criteria.andCartKeyLike("%"+cart.getCartKey()+"%");
			}
	
		}
		
		Page<XxCart> page= (Page<XxCart>)cartMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
