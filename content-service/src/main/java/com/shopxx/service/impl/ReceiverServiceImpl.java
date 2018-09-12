package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.ReceiverService;
import com.shopxx.mapper.XxReceiverMapper;
import com.shopxx.pojo.XxReceiver;
import com.shopxx.pojo.XxReceiverExample;
import com.shopxx.pojo.XxReceiverExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class ReceiverServiceImpl implements ReceiverService {

	@Autowired
	private XxReceiverMapper receiverMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxReceiver> findAll() {
		return receiverMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxReceiver> page=   (Page<XxReceiver>) receiverMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxReceiver receiver) {
		receiverMapper.insert(receiver);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxReceiver receiver){
		receiverMapper.updateByPrimaryKey(receiver);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxReceiver findOne(Long id){
		return receiverMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			receiverMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxReceiver receiver, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxReceiverExample example=new XxReceiverExample();
		Criteria criteria = example.createCriteria();
		
		if(receiver!=null){			
						if(receiver.getAddress()!=null && receiver.getAddress().length()>0){
				criteria.andAddressLike("%"+receiver.getAddress()+"%");
			}
			if(receiver.getAreaName()!=null && receiver.getAreaName().length()>0){
				criteria.andAreaNameLike("%"+receiver.getAreaName()+"%");
			}
			if(receiver.getConsignee()!=null && receiver.getConsignee().length()>0){
				criteria.andConsigneeLike("%"+receiver.getConsignee()+"%");
			}
			if(receiver.getPhone()!=null && receiver.getPhone().length()>0){
				criteria.andPhoneLike("%"+receiver.getPhone()+"%");
			}
			if(receiver.getZipCode()!=null && receiver.getZipCode().length()>0){
				criteria.andZipCodeLike("%"+receiver.getZipCode()+"%");
			}
	
		}
		
		Page<XxReceiver> page= (Page<XxReceiver>)receiverMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
