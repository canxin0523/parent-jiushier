package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.DeliveryTemplateService;
import com.shopxx.mapper.XxDeliveryTemplateMapper;
import com.shopxx.pojo.XxDeliveryTemplate;
import com.shopxx.pojo.XxDeliveryTemplateExample;
import com.shopxx.pojo.XxDeliveryTemplateExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class DeliveryTemplateServiceImpl implements DeliveryTemplateService {

	@Autowired
	private XxDeliveryTemplateMapper deliveryTemplateMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxDeliveryTemplate> findAll() {
		return deliveryTemplateMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxDeliveryTemplate> page=   (Page<XxDeliveryTemplate>) deliveryTemplateMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxDeliveryTemplate deliveryTemplate) {
		deliveryTemplateMapper.insert(deliveryTemplate);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxDeliveryTemplate deliveryTemplate){
		deliveryTemplateMapper.updateByPrimaryKey(deliveryTemplate);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxDeliveryTemplate findOne(Long id){
		return deliveryTemplateMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			deliveryTemplateMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxDeliveryTemplate deliveryTemplate, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxDeliveryTemplateExample example=new XxDeliveryTemplateExample();
		Criteria criteria = example.createCriteria();
		
		if(deliveryTemplate!=null){			
						if(deliveryTemplate.getBackground()!=null && deliveryTemplate.getBackground().length()>0){
				criteria.andBackgroundLike("%"+deliveryTemplate.getBackground()+"%");
			}
			if(deliveryTemplate.getMemo()!=null && deliveryTemplate.getMemo().length()>0){
				criteria.andMemoLike("%"+deliveryTemplate.getMemo()+"%");
			}
			if(deliveryTemplate.getName()!=null && deliveryTemplate.getName().length()>0){
				criteria.andNameLike("%"+deliveryTemplate.getName()+"%");
			}
	
		}
		
		Page<XxDeliveryTemplate> page= (Page<XxDeliveryTemplate>)deliveryTemplateMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
