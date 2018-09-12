package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.OrderService;
import com.shopxx.mapper.XxOrderMapper;
import com.shopxx.pojo.XxOrder;
import com.shopxx.pojo.XxOrderExample;
import com.shopxx.pojo.XxOrderExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private XxOrderMapper orderMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxOrder> findAll() {
		return orderMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxOrder> page=   (Page<XxOrder>) orderMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxOrder order) {
		orderMapper.insert(order);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxOrder order){
		orderMapper.updateByPrimaryKey(order);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxOrder findOne(Long id){
		return orderMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			orderMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxOrder order, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxOrderExample example=new XxOrderExample();
		Criteria criteria = example.createCriteria();
		
		if(order!=null){			
						if(order.getAddress()!=null && order.getAddress().length()>0){
				criteria.andAddressLike("%"+order.getAddress()+"%");
			}
			if(order.getAreaName()!=null && order.getAreaName().length()>0){
				criteria.andAreaNameLike("%"+order.getAreaName()+"%");
			}
			if(order.getConsignee()!=null && order.getConsignee().length()>0){
				criteria.andConsigneeLike("%"+order.getConsignee()+"%");
			}
			if(order.getInvoiceTitle()!=null && order.getInvoiceTitle().length()>0){
				criteria.andInvoiceTitleLike("%"+order.getInvoiceTitle()+"%");
			}
			if(order.getMemo()!=null && order.getMemo().length()>0){
				criteria.andMemoLike("%"+order.getMemo()+"%");
			}
			if(order.getPaymentMethodName()!=null && order.getPaymentMethodName().length()>0){
				criteria.andPaymentMethodNameLike("%"+order.getPaymentMethodName()+"%");
			}
			if(order.getPhone()!=null && order.getPhone().length()>0){
				criteria.andPhoneLike("%"+order.getPhone()+"%");
			}
			if(order.getPromotion()!=null && order.getPromotion().length()>0){
				criteria.andPromotionLike("%"+order.getPromotion()+"%");
			}
			if(order.getShippingMethodName()!=null && order.getShippingMethodName().length()>0){
				criteria.andShippingMethodNameLike("%"+order.getShippingMethodName()+"%");
			}
			if(order.getSn()!=null && order.getSn().length()>0){
				criteria.andSnLike("%"+order.getSn()+"%");
			}
			if(order.getZipCode()!=null && order.getZipCode().length()>0){
				criteria.andZipCodeLike("%"+order.getZipCode()+"%");
			}
	
		}
		
		Page<XxOrder> page= (Page<XxOrder>)orderMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
