package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.RoleService;
import com.shopxx.mapper.XxRoleMapper;
import com.shopxx.pojo.XxRole;
import com.shopxx.pojo.XxRoleExample;
import com.shopxx.pojo.XxRoleExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private XxRoleMapper roleMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxRole> findAll() {
		return roleMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxRole> page=   (Page<XxRole>) roleMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxRole role) {
		roleMapper.insert(role);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxRole role){
		roleMapper.updateByPrimaryKey(role);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxRole findOne(Long id){
		return roleMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			roleMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxRole role, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxRoleExample example=new XxRoleExample();
		Criteria criteria = example.createCriteria();
		
		if(role!=null){			
						if(role.getDescription()!=null && role.getDescription().length()>0){
				criteria.andDescriptionLike("%"+role.getDescription()+"%");
			}
			if(role.getName()!=null && role.getName().length()>0){
				criteria.andNameLike("%"+role.getName()+"%");
			}
	
		}
		
		Page<XxRole> page= (Page<XxRole>)roleMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
