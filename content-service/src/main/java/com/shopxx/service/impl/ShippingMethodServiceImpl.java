package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.ShippingMethodService;
import com.shopxx.mapper.XxShippingMethodMapper;
import com.shopxx.pojo.XxShippingMethod;
import com.shopxx.pojo.XxShippingMethodExample;
import com.shopxx.pojo.XxShippingMethodExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class ShippingMethodServiceImpl implements ShippingMethodService {

	@Autowired
	private XxShippingMethodMapper shippingMethodMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxShippingMethod> findAll() {
		return shippingMethodMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxShippingMethod> page=   (Page<XxShippingMethod>) shippingMethodMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxShippingMethod shippingMethod) {
		shippingMethodMapper.insert(shippingMethod);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxShippingMethod shippingMethod){
		shippingMethodMapper.updateByPrimaryKey(shippingMethod);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxShippingMethod findOne(Long id){
		return shippingMethodMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			shippingMethodMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxShippingMethod shippingMethod, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxShippingMethodExample example=new XxShippingMethodExample();
		Criteria criteria = example.createCriteria();
		
		if(shippingMethod!=null){			
						if(shippingMethod.getIcon()!=null && shippingMethod.getIcon().length()>0){
				criteria.andIconLike("%"+shippingMethod.getIcon()+"%");
			}
			if(shippingMethod.getName()!=null && shippingMethod.getName().length()>0){
				criteria.andNameLike("%"+shippingMethod.getName()+"%");
			}
	
		}
		
		Page<XxShippingMethod> page= (Page<XxShippingMethod>)shippingMethodMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
