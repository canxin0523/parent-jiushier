package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.ProductNotifyService;
import com.shopxx.mapper.XxProductNotifyMapper;
import com.shopxx.pojo.XxProductNotify;
import com.shopxx.pojo.XxProductNotifyExample;
import com.shopxx.pojo.XxProductNotifyExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class ProductNotifyServiceImpl implements ProductNotifyService {

	@Autowired
	private XxProductNotifyMapper productNotifyMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxProductNotify> findAll() {
		return productNotifyMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxProductNotify> page=   (Page<XxProductNotify>) productNotifyMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxProductNotify productNotify) {
		productNotifyMapper.insert(productNotify);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxProductNotify productNotify){
		productNotifyMapper.updateByPrimaryKey(productNotify);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxProductNotify findOne(Long id){
		return productNotifyMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			productNotifyMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxProductNotify productNotify, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxProductNotifyExample example=new XxProductNotifyExample();
		Criteria criteria = example.createCriteria();
		
		if(productNotify!=null){			
						if(productNotify.getEmail()!=null && productNotify.getEmail().length()>0){
				criteria.andEmailLike("%"+productNotify.getEmail()+"%");
			}
	
		}
		
		Page<XxProductNotify> page= (Page<XxProductNotify>)productNotifyMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
