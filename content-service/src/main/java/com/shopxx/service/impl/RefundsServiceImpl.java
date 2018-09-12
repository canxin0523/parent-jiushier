package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.RefundsService;
import com.shopxx.mapper.XxRefundsMapper;
import com.shopxx.pojo.XxRefunds;
import com.shopxx.pojo.XxRefundsExample;
import com.shopxx.pojo.XxRefundsExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class RefundsServiceImpl implements RefundsService {

	@Autowired
	private XxRefundsMapper refundsMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxRefunds> findAll() {
		return refundsMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxRefunds> page=   (Page<XxRefunds>) refundsMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxRefunds refunds) {
		refundsMapper.insert(refunds);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxRefunds refunds){
		refundsMapper.updateByPrimaryKey(refunds);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxRefunds findOne(Long id){
		return refundsMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			refundsMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxRefunds refunds, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxRefundsExample example=new XxRefundsExample();
		Criteria criteria = example.createCriteria();
		
		if(refunds!=null){			
						if(refunds.getAccount()!=null && refunds.getAccount().length()>0){
				criteria.andAccountLike("%"+refunds.getAccount()+"%");
			}
			if(refunds.getBank()!=null && refunds.getBank().length()>0){
				criteria.andBankLike("%"+refunds.getBank()+"%");
			}
			if(refunds.getMemo()!=null && refunds.getMemo().length()>0){
				criteria.andMemoLike("%"+refunds.getMemo()+"%");
			}
			if(refunds.getOperator()!=null && refunds.getOperator().length()>0){
				criteria.andOperatorLike("%"+refunds.getOperator()+"%");
			}
			if(refunds.getPayee()!=null && refunds.getPayee().length()>0){
				criteria.andPayeeLike("%"+refunds.getPayee()+"%");
			}
			if(refunds.getPaymentMethod()!=null && refunds.getPaymentMethod().length()>0){
				criteria.andPaymentMethodLike("%"+refunds.getPaymentMethod()+"%");
			}
			if(refunds.getSn()!=null && refunds.getSn().length()>0){
				criteria.andSnLike("%"+refunds.getSn()+"%");
			}
	
		}
		
		Page<XxRefunds> page= (Page<XxRefunds>)refundsMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
