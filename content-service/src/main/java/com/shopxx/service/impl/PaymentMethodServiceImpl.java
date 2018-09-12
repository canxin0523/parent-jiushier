package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.PaymentMethodService;
import com.shopxx.mapper.XxPaymentMethodMapper;
import com.shopxx.pojo.XxPaymentMethod;
import com.shopxx.pojo.XxPaymentMethodExample;
import com.shopxx.pojo.XxPaymentMethodExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class PaymentMethodServiceImpl implements PaymentMethodService {

	@Autowired
	private XxPaymentMethodMapper paymentMethodMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxPaymentMethod> findAll() {
		return paymentMethodMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxPaymentMethod> page=   (Page<XxPaymentMethod>) paymentMethodMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxPaymentMethod paymentMethod) {
		paymentMethodMapper.insert(paymentMethod);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxPaymentMethod paymentMethod){
		paymentMethodMapper.updateByPrimaryKey(paymentMethod);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxPaymentMethod findOne(Long id){
		return paymentMethodMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			paymentMethodMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxPaymentMethod paymentMethod, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxPaymentMethodExample example=new XxPaymentMethodExample();
		Criteria criteria = example.createCriteria();
		
		if(paymentMethod!=null){			
						if(paymentMethod.getDescription()!=null && paymentMethod.getDescription().length()>0){
				criteria.andDescriptionLike("%"+paymentMethod.getDescription()+"%");
			}
			if(paymentMethod.getIcon()!=null && paymentMethod.getIcon().length()>0){
				criteria.andIconLike("%"+paymentMethod.getIcon()+"%");
			}
			if(paymentMethod.getName()!=null && paymentMethod.getName().length()>0){
				criteria.andNameLike("%"+paymentMethod.getName()+"%");
			}
	
		}
		
		Page<XxPaymentMethod> page= (Page<XxPaymentMethod>)paymentMethodMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
