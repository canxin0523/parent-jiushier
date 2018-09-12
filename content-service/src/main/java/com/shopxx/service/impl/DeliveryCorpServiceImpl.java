package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.DeliveryCorpService;
import com.shopxx.mapper.XxDeliveryCorpMapper;
import com.shopxx.pojo.XxDeliveryCorp;
import com.shopxx.pojo.XxDeliveryCorpExample;
import com.shopxx.pojo.XxDeliveryCorpExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class DeliveryCorpServiceImpl implements DeliveryCorpService {

	@Autowired
	private XxDeliveryCorpMapper deliveryCorpMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxDeliveryCorp> findAll() {
		return deliveryCorpMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxDeliveryCorp> page=   (Page<XxDeliveryCorp>) deliveryCorpMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxDeliveryCorp deliveryCorp) {
		deliveryCorpMapper.insert(deliveryCorp);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxDeliveryCorp deliveryCorp){
		deliveryCorpMapper.updateByPrimaryKey(deliveryCorp);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxDeliveryCorp findOne(Long id){
		return deliveryCorpMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			deliveryCorpMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxDeliveryCorp deliveryCorp, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxDeliveryCorpExample example=new XxDeliveryCorpExample();
		Criteria criteria = example.createCriteria();
		
		if(deliveryCorp!=null){			
						if(deliveryCorp.getCode()!=null && deliveryCorp.getCode().length()>0){
				criteria.andCodeLike("%"+deliveryCorp.getCode()+"%");
			}
			if(deliveryCorp.getName()!=null && deliveryCorp.getName().length()>0){
				criteria.andNameLike("%"+deliveryCorp.getName()+"%");
			}
			if(deliveryCorp.getUrl()!=null && deliveryCorp.getUrl().length()>0){
				criteria.andUrlLike("%"+deliveryCorp.getUrl()+"%");
			}
	
		}
		
		Page<XxDeliveryCorp> page= (Page<XxDeliveryCorp>)deliveryCorpMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
