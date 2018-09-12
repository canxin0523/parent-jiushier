package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.DepositService;
import com.shopxx.mapper.XxDepositMapper;
import com.shopxx.pojo.XxDeposit;
import com.shopxx.pojo.XxDepositExample;
import com.shopxx.pojo.XxDepositExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class DepositServiceImpl implements DepositService {

	@Autowired
	private XxDepositMapper depositMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxDeposit> findAll() {
		return depositMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxDeposit> page=   (Page<XxDeposit>) depositMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxDeposit deposit) {
		depositMapper.insert(deposit);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxDeposit deposit){
		depositMapper.updateByPrimaryKey(deposit);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxDeposit findOne(Long id){
		return depositMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			depositMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxDeposit deposit, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxDepositExample example=new XxDepositExample();
		Criteria criteria = example.createCriteria();
		
		if(deposit!=null){			
						if(deposit.getMemo()!=null && deposit.getMemo().length()>0){
				criteria.andMemoLike("%"+deposit.getMemo()+"%");
			}
			if(deposit.getOperator()!=null && deposit.getOperator().length()>0){
				criteria.andOperatorLike("%"+deposit.getOperator()+"%");
			}
	
		}
		
		Page<XxDeposit> page= (Page<XxDeposit>)depositMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
