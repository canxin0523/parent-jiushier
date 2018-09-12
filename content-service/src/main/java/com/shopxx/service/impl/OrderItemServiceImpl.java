package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.OrderItemService;
import com.shopxx.mapper.XxOrderItemMapper;
import com.shopxx.pojo.XxOrderItem;
import com.shopxx.pojo.XxOrderItemExample;
import com.shopxx.pojo.XxOrderItemExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class OrderItemServiceImpl implements OrderItemService {

	@Autowired
	private XxOrderItemMapper orderItemMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxOrderItem> findAll() {
		return orderItemMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxOrderItem> page=   (Page<XxOrderItem>) orderItemMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxOrderItem orderItem) {
		orderItemMapper.insert(orderItem);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxOrderItem orderItem){
		orderItemMapper.updateByPrimaryKey(orderItem);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxOrderItem findOne(Long id){
		return orderItemMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			orderItemMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxOrderItem orderItem, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxOrderItemExample example=new XxOrderItemExample();
		Criteria criteria = example.createCriteria();
		
		if(orderItem!=null){			
						if(orderItem.getFullName()!=null && orderItem.getFullName().length()>0){
				criteria.andFullNameLike("%"+orderItem.getFullName()+"%");
			}
			if(orderItem.getName()!=null && orderItem.getName().length()>0){
				criteria.andNameLike("%"+orderItem.getName()+"%");
			}
			if(orderItem.getSn()!=null && orderItem.getSn().length()>0){
				criteria.andSnLike("%"+orderItem.getSn()+"%");
			}
			if(orderItem.getThumbnail()!=null && orderItem.getThumbnail().length()>0){
				criteria.andThumbnailLike("%"+orderItem.getThumbnail()+"%");
			}
	
		}
		
		Page<XxOrderItem> page= (Page<XxOrderItem>)orderItemMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
