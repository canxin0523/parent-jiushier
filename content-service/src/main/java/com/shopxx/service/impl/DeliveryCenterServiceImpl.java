package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.DeliveryCenterService;
import com.shopxx.mapper.XxDeliveryCenterMapper;
import com.shopxx.pojo.XxDeliveryCenter;
import com.shopxx.pojo.XxDeliveryCenterExample;
import com.shopxx.pojo.XxDeliveryCenterExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class DeliveryCenterServiceImpl implements DeliveryCenterService {

	@Autowired
	private XxDeliveryCenterMapper deliveryCenterMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxDeliveryCenter> findAll() {
		return deliveryCenterMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxDeliveryCenter> page=   (Page<XxDeliveryCenter>) deliveryCenterMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxDeliveryCenter deliveryCenter) {
		deliveryCenterMapper.insert(deliveryCenter);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxDeliveryCenter deliveryCenter){
		deliveryCenterMapper.updateByPrimaryKey(deliveryCenter);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxDeliveryCenter findOne(Long id){
		return deliveryCenterMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			deliveryCenterMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxDeliveryCenter deliveryCenter, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxDeliveryCenterExample example=new XxDeliveryCenterExample();
		Criteria criteria = example.createCriteria();
		
		if(deliveryCenter!=null){			
						if(deliveryCenter.getAddress()!=null && deliveryCenter.getAddress().length()>0){
				criteria.andAddressLike("%"+deliveryCenter.getAddress()+"%");
			}
			if(deliveryCenter.getAreaName()!=null && deliveryCenter.getAreaName().length()>0){
				criteria.andAreaNameLike("%"+deliveryCenter.getAreaName()+"%");
			}
			if(deliveryCenter.getContact()!=null && deliveryCenter.getContact().length()>0){
				criteria.andContactLike("%"+deliveryCenter.getContact()+"%");
			}
			if(deliveryCenter.getMemo()!=null && deliveryCenter.getMemo().length()>0){
				criteria.andMemoLike("%"+deliveryCenter.getMemo()+"%");
			}
			if(deliveryCenter.getMobile()!=null && deliveryCenter.getMobile().length()>0){
				criteria.andMobileLike("%"+deliveryCenter.getMobile()+"%");
			}
			if(deliveryCenter.getName()!=null && deliveryCenter.getName().length()>0){
				criteria.andNameLike("%"+deliveryCenter.getName()+"%");
			}
			if(deliveryCenter.getPhone()!=null && deliveryCenter.getPhone().length()>0){
				criteria.andPhoneLike("%"+deliveryCenter.getPhone()+"%");
			}
			if(deliveryCenter.getZipCode()!=null && deliveryCenter.getZipCode().length()>0){
				criteria.andZipCodeLike("%"+deliveryCenter.getZipCode()+"%");
			}
	
		}
		
		Page<XxDeliveryCenter> page= (Page<XxDeliveryCenter>)deliveryCenterMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
