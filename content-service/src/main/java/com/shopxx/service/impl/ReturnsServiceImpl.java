package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.ReturnsService;
import com.shopxx.mapper.XxReturnsMapper;
import com.shopxx.pojo.XxReturns;
import com.shopxx.pojo.XxReturnsExample;
import com.shopxx.pojo.XxReturnsExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class ReturnsServiceImpl implements ReturnsService {

	@Autowired
	private XxReturnsMapper returnsMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxReturns> findAll() {
		return returnsMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxReturns> page=   (Page<XxReturns>) returnsMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxReturns returns) {
		returnsMapper.insert(returns);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxReturns returns){
		returnsMapper.updateByPrimaryKey(returns);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxReturns findOne(Long id){
		return returnsMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			returnsMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxReturns returns, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxReturnsExample example=new XxReturnsExample();
		Criteria criteria = example.createCriteria();
		
		if(returns!=null){			
						if(returns.getAddress()!=null && returns.getAddress().length()>0){
				criteria.andAddressLike("%"+returns.getAddress()+"%");
			}
			if(returns.getArea()!=null && returns.getArea().length()>0){
				criteria.andAreaLike("%"+returns.getArea()+"%");
			}
			if(returns.getDeliveryCorp()!=null && returns.getDeliveryCorp().length()>0){
				criteria.andDeliveryCorpLike("%"+returns.getDeliveryCorp()+"%");
			}
			if(returns.getMemo()!=null && returns.getMemo().length()>0){
				criteria.andMemoLike("%"+returns.getMemo()+"%");
			}
			if(returns.getOperator()!=null && returns.getOperator().length()>0){
				criteria.andOperatorLike("%"+returns.getOperator()+"%");
			}
			if(returns.getPhone()!=null && returns.getPhone().length()>0){
				criteria.andPhoneLike("%"+returns.getPhone()+"%");
			}
			if(returns.getShipper()!=null && returns.getShipper().length()>0){
				criteria.andShipperLike("%"+returns.getShipper()+"%");
			}
			if(returns.getShippingMethod()!=null && returns.getShippingMethod().length()>0){
				criteria.andShippingMethodLike("%"+returns.getShippingMethod()+"%");
			}
			if(returns.getSn()!=null && returns.getSn().length()>0){
				criteria.andSnLike("%"+returns.getSn()+"%");
			}
			if(returns.getTrackingNo()!=null && returns.getTrackingNo().length()>0){
				criteria.andTrackingNoLike("%"+returns.getTrackingNo()+"%");
			}
			if(returns.getZipCode()!=null && returns.getZipCode().length()>0){
				criteria.andZipCodeLike("%"+returns.getZipCode()+"%");
			}
	
		}
		
		Page<XxReturns> page= (Page<XxReturns>)returnsMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
