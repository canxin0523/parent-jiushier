package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.AttributeService;
import com.shopxx.mapper.XxAttributeMapper;
import com.shopxx.pojo.XxAttribute;
import com.shopxx.pojo.XxAttributeExample;
import com.shopxx.pojo.XxAttributeExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class AttributeServiceImpl implements AttributeService {

	@Autowired
	private XxAttributeMapper attributeMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxAttribute> findAll() {
		return attributeMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxAttribute> page=   (Page<XxAttribute>) attributeMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxAttribute attribute) {
		attributeMapper.insert(attribute);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxAttribute attribute){
		attributeMapper.updateByPrimaryKey(attribute);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxAttribute findOne(Long id){
		return attributeMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			attributeMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxAttribute attribute, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxAttributeExample example=new XxAttributeExample();
		Criteria criteria = example.createCriteria();
		
		if(attribute!=null){			
						if(attribute.getName()!=null && attribute.getName().length()>0){
				criteria.andNameLike("%"+attribute.getName()+"%");
			}
	
		}
		
		Page<XxAttribute> page= (Page<XxAttribute>)attributeMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
