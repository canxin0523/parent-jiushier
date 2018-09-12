package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.SpecificationValueService;
import com.shopxx.mapper.XxSpecificationValueMapper;
import com.shopxx.pojo.XxSpecificationValue;
import com.shopxx.pojo.XxSpecificationValueExample;
import com.shopxx.pojo.XxSpecificationValueExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class SpecificationValueServiceImpl implements SpecificationValueService {

	@Autowired
	private XxSpecificationValueMapper specificationValueMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxSpecificationValue> findAll() {
		return specificationValueMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxSpecificationValue> page=   (Page<XxSpecificationValue>) specificationValueMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxSpecificationValue specificationValue) {
		specificationValueMapper.insert(specificationValue);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxSpecificationValue specificationValue){
		specificationValueMapper.updateByPrimaryKey(specificationValue);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxSpecificationValue findOne(Long id){
		return specificationValueMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			specificationValueMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxSpecificationValue specificationValue, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxSpecificationValueExample example=new XxSpecificationValueExample();
		Criteria criteria = example.createCriteria();
		
		if(specificationValue!=null){			
						if(specificationValue.getImage()!=null && specificationValue.getImage().length()>0){
				criteria.andImageLike("%"+specificationValue.getImage()+"%");
			}
			if(specificationValue.getName()!=null && specificationValue.getName().length()>0){
				criteria.andNameLike("%"+specificationValue.getName()+"%");
			}
	
		}
		
		Page<XxSpecificationValue> page= (Page<XxSpecificationValue>)specificationValueMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
