package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.OrderLogService;
import com.shopxx.mapper.XxOrderLogMapper;
import com.shopxx.pojo.XxOrderLog;
import com.shopxx.pojo.XxOrderLogExample;
import com.shopxx.pojo.XxOrderLogExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class OrderLogServiceImpl implements OrderLogService {

	@Autowired
	private XxOrderLogMapper orderLogMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxOrderLog> findAll() {
		return orderLogMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxOrderLog> page=   (Page<XxOrderLog>) orderLogMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxOrderLog orderLog) {
		orderLogMapper.insert(orderLog);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxOrderLog orderLog){
		orderLogMapper.updateByPrimaryKey(orderLog);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxOrderLog findOne(Long id){
		return orderLogMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			orderLogMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxOrderLog orderLog, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxOrderLogExample example=new XxOrderLogExample();
		Criteria criteria = example.createCriteria();
		
		if(orderLog!=null){			
						if(orderLog.getContent()!=null && orderLog.getContent().length()>0){
				criteria.andContentLike("%"+orderLog.getContent()+"%");
			}
			if(orderLog.getOperator()!=null && orderLog.getOperator().length()>0){
				criteria.andOperatorLike("%"+orderLog.getOperator()+"%");
			}
	
		}
		
		Page<XxOrderLog> page= (Page<XxOrderLog>)orderLogMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
