package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.GiftItemService;
import com.shopxx.mapper.XxGiftItemMapper;
import com.shopxx.pojo.XxGiftItem;
import com.shopxx.pojo.XxGiftItemExample;
import com.shopxx.pojo.XxGiftItemExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class GiftItemServiceImpl implements GiftItemService {

	@Autowired
	private XxGiftItemMapper giftItemMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxGiftItem> findAll() {
		return giftItemMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxGiftItem> page=   (Page<XxGiftItem>) giftItemMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxGiftItem giftItem) {
		giftItemMapper.insert(giftItem);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxGiftItem giftItem){
		giftItemMapper.updateByPrimaryKey(giftItem);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxGiftItem findOne(Long id){
		return giftItemMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			giftItemMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxGiftItem giftItem, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxGiftItemExample example=new XxGiftItemExample();
		Criteria criteria = example.createCriteria();
		
		if(giftItem!=null){			
				
		}
		
		Page<XxGiftItem> page= (Page<XxGiftItem>)giftItemMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
