package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.ParameterGroupService;
import com.shopxx.mapper.XxParameterGroupMapper;
import com.shopxx.pojo.XxParameterGroup;
import com.shopxx.pojo.XxParameterGroupExample;
import com.shopxx.pojo.XxParameterGroupExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class ParameterGroupServiceImpl implements ParameterGroupService {

	@Autowired
	private XxParameterGroupMapper parameterGroupMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxParameterGroup> findAll() {
		return parameterGroupMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxParameterGroup> page=   (Page<XxParameterGroup>) parameterGroupMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxParameterGroup parameterGroup) {
		parameterGroupMapper.insert(parameterGroup);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxParameterGroup parameterGroup){
		parameterGroupMapper.updateByPrimaryKey(parameterGroup);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxParameterGroup findOne(Long id){
		return parameterGroupMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			parameterGroupMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxParameterGroup parameterGroup, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxParameterGroupExample example=new XxParameterGroupExample();
		Criteria criteria = example.createCriteria();
		
		if(parameterGroup!=null){			
						if(parameterGroup.getName()!=null && parameterGroup.getName().length()>0){
				criteria.andNameLike("%"+parameterGroup.getName()+"%");
			}
	
		}
		
		Page<XxParameterGroup> page= (Page<XxParameterGroup>)parameterGroupMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
