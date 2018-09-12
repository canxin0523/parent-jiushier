package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.PaymentService;
import com.shopxx.mapper.XxPaymentMapper;
import com.shopxx.pojo.XxPayment;
import com.shopxx.pojo.XxPaymentExample;
import com.shopxx.pojo.XxPaymentExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	private XxPaymentMapper paymentMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxPayment> findAll() {
		return paymentMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxPayment> page=   (Page<XxPayment>) paymentMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxPayment payment) {
		paymentMapper.insert(payment);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxPayment payment){
		paymentMapper.updateByPrimaryKey(payment);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxPayment findOne(Long id){
		return paymentMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			paymentMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxPayment payment, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxPaymentExample example=new XxPaymentExample();
		Criteria criteria = example.createCriteria();
		
		if(payment!=null){			
						if(payment.getAccount()!=null && payment.getAccount().length()>0){
				criteria.andAccountLike("%"+payment.getAccount()+"%");
			}
			if(payment.getBank()!=null && payment.getBank().length()>0){
				criteria.andBankLike("%"+payment.getBank()+"%");
			}
			if(payment.getMemo()!=null && payment.getMemo().length()>0){
				criteria.andMemoLike("%"+payment.getMemo()+"%");
			}
			if(payment.getOperator()!=null && payment.getOperator().length()>0){
				criteria.andOperatorLike("%"+payment.getOperator()+"%");
			}
			if(payment.getPayer()!=null && payment.getPayer().length()>0){
				criteria.andPayerLike("%"+payment.getPayer()+"%");
			}
			if(payment.getPaymentMethod()!=null && payment.getPaymentMethod().length()>0){
				criteria.andPaymentMethodLike("%"+payment.getPaymentMethod()+"%");
			}
			if(payment.getPaymentPluginId()!=null && payment.getPaymentPluginId().length()>0){
				criteria.andPaymentPluginIdLike("%"+payment.getPaymentPluginId()+"%");
			}
			if(payment.getSn()!=null && payment.getSn().length()>0){
				criteria.andSnLike("%"+payment.getSn()+"%");
			}
	
		}
		
		Page<XxPayment> page= (Page<XxPayment>)paymentMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
