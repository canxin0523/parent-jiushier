package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.ShippingService;
import com.shopxx.mapper.XxShippingMapper;
import com.shopxx.pojo.XxShipping;
import com.shopxx.pojo.XxShippingExample;
import com.shopxx.pojo.XxShippingExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class ShippingServiceImpl implements ShippingService {

	@Autowired
	private XxShippingMapper shippingMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxShipping> findAll() {
		return shippingMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxShipping> page=   (Page<XxShipping>) shippingMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxShipping shipping) {
		shippingMapper.insert(shipping);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxShipping shipping){
		shippingMapper.updateByPrimaryKey(shipping);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxShipping findOne(Long id){
		return shippingMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			shippingMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxShipping shipping, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxShippingExample example=new XxShippingExample();
		Criteria criteria = example.createCriteria();
		
		if(shipping!=null){			
						if(shipping.getAddress()!=null && shipping.getAddress().length()>0){
				criteria.andAddressLike("%"+shipping.getAddress()+"%");
			}
			if(shipping.getArea()!=null && shipping.getArea().length()>0){
				criteria.andAreaLike("%"+shipping.getArea()+"%");
			}
			if(shipping.getConsignee()!=null && shipping.getConsignee().length()>0){
				criteria.andConsigneeLike("%"+shipping.getConsignee()+"%");
			}
			if(shipping.getDeliveryCorp()!=null && shipping.getDeliveryCorp().length()>0){
				criteria.andDeliveryCorpLike("%"+shipping.getDeliveryCorp()+"%");
			}
			if(shipping.getDeliveryCorpCode()!=null && shipping.getDeliveryCorpCode().length()>0){
				criteria.andDeliveryCorpCodeLike("%"+shipping.getDeliveryCorpCode()+"%");
			}
			if(shipping.getDeliveryCorpUrl()!=null && shipping.getDeliveryCorpUrl().length()>0){
				criteria.andDeliveryCorpUrlLike("%"+shipping.getDeliveryCorpUrl()+"%");
			}
			if(shipping.getMemo()!=null && shipping.getMemo().length()>0){
				criteria.andMemoLike("%"+shipping.getMemo()+"%");
			}
			if(shipping.getOperator()!=null && shipping.getOperator().length()>0){
				criteria.andOperatorLike("%"+shipping.getOperator()+"%");
			}
			if(shipping.getPhone()!=null && shipping.getPhone().length()>0){
				criteria.andPhoneLike("%"+shipping.getPhone()+"%");
			}
			if(shipping.getShippingMethod()!=null && shipping.getShippingMethod().length()>0){
				criteria.andShippingMethodLike("%"+shipping.getShippingMethod()+"%");
			}
			if(shipping.getSn()!=null && shipping.getSn().length()>0){
				criteria.andSnLike("%"+shipping.getSn()+"%");
			}
			if(shipping.getTrackingNo()!=null && shipping.getTrackingNo().length()>0){
				criteria.andTrackingNoLike("%"+shipping.getTrackingNo()+"%");
			}
			if(shipping.getZipCode()!=null && shipping.getZipCode().length()>0){
				criteria.andZipCodeLike("%"+shipping.getZipCode()+"%");
			}
	
		}
		
		Page<XxShipping> page= (Page<XxShipping>)shippingMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
