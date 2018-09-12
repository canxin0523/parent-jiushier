package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.MessageService;
import com.shopxx.mapper.XxMessageMapper;
import com.shopxx.pojo.XxMessage;
import com.shopxx.pojo.XxMessageExample;
import com.shopxx.pojo.XxMessageExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class MessageServiceImpl implements MessageService {

	@Autowired
	private XxMessageMapper messageMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxMessage> findAll() {
		return messageMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxMessage> page=   (Page<XxMessage>) messageMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxMessage message) {
		messageMapper.insert(message);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxMessage message){
		messageMapper.updateByPrimaryKey(message);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxMessage findOne(Long id){
		return messageMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			messageMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxMessage message, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxMessageExample example=new XxMessageExample();
		Criteria criteria = example.createCriteria();
		
		if(message!=null){			
						if(message.getIp()!=null && message.getIp().length()>0){
				criteria.andIpLike("%"+message.getIp()+"%");
			}
			if(message.getTitle()!=null && message.getTitle().length()>0){
				criteria.andTitleLike("%"+message.getTitle()+"%");
			}
	
		}
		
		Page<XxMessage> page= (Page<XxMessage>)messageMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
