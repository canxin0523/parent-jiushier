package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.SpecificationService;
import com.shopxx.mapper.XxSpecificationMapper;
import com.shopxx.pojo.XxSpecification;
import com.shopxx.pojo.XxSpecificationExample;
import com.shopxx.pojo.XxSpecificationExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class SpecificationServiceImpl implements SpecificationService {

	@Autowired
	private XxSpecificationMapper specificationMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxSpecification> findAll() {
		return specificationMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxSpecification> page=   (Page<XxSpecification>) specificationMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxSpecification specification) {
		specificationMapper.insert(specification);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxSpecification specification){
		specificationMapper.updateByPrimaryKey(specification);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxSpecification findOne(Long id){
		return specificationMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			specificationMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxSpecification specification, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxSpecificationExample example=new XxSpecificationExample();
		Criteria criteria = example.createCriteria();
		
		if(specification!=null){			
						if(specification.getMemo()!=null && specification.getMemo().length()>0){
				criteria.andMemoLike("%"+specification.getMemo()+"%");
			}
			if(specification.getName()!=null && specification.getName().length()>0){
				criteria.andNameLike("%"+specification.getName()+"%");
			}
	
		}
		
		Page<XxSpecification> page= (Page<XxSpecification>)specificationMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
