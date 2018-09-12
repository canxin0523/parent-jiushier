package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.ParameterService;
import com.shopxx.mapper.XxParameterMapper;
import com.shopxx.pojo.XxParameter;
import com.shopxx.pojo.XxParameterExample;
import com.shopxx.pojo.XxParameterExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class ParameterServiceImpl implements ParameterService {

	@Autowired
	private XxParameterMapper parameterMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxParameter> findAll() {
		return parameterMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxParameter> page=   (Page<XxParameter>) parameterMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxParameter parameter) {
		parameterMapper.insert(parameter);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxParameter parameter){
		parameterMapper.updateByPrimaryKey(parameter);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxParameter findOne(Long id){
		return parameterMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			parameterMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxParameter parameter, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxParameterExample example=new XxParameterExample();
		Criteria criteria = example.createCriteria();
		
		if(parameter!=null){			
						if(parameter.getName()!=null && parameter.getName().length()>0){
				criteria.andNameLike("%"+parameter.getName()+"%");
			}
	
		}
		
		Page<XxParameter> page= (Page<XxParameter>)parameterMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
