package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.ReturnsItemService;
import com.shopxx.mapper.XxReturnsItemMapper;
import com.shopxx.pojo.XxReturnsItem;
import com.shopxx.pojo.XxReturnsItemExample;
import com.shopxx.pojo.XxReturnsItemExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class ReturnsItemServiceImpl implements ReturnsItemService {

	@Autowired
	private XxReturnsItemMapper returnsItemMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxReturnsItem> findAll() {
		return returnsItemMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxReturnsItem> page=   (Page<XxReturnsItem>) returnsItemMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxReturnsItem returnsItem) {
		returnsItemMapper.insert(returnsItem);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxReturnsItem returnsItem){
		returnsItemMapper.updateByPrimaryKey(returnsItem);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxReturnsItem findOne(Long id){
		return returnsItemMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			returnsItemMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxReturnsItem returnsItem, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxReturnsItemExample example=new XxReturnsItemExample();
		Criteria criteria = example.createCriteria();
		
		if(returnsItem!=null){			
						if(returnsItem.getName()!=null && returnsItem.getName().length()>0){
				criteria.andNameLike("%"+returnsItem.getName()+"%");
			}
			if(returnsItem.getSn()!=null && returnsItem.getSn().length()>0){
				criteria.andSnLike("%"+returnsItem.getSn()+"%");
			}
	
		}
		
		Page<XxReturnsItem> page= (Page<XxReturnsItem>)returnsItemMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
