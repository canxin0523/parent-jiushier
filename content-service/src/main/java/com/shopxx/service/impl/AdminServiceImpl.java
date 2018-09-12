package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.AdminService;
import com.shopxx.mapper.XxAdminMapper;
import com.shopxx.pojo.XxAdmin;
import com.shopxx.pojo.XxAdminExample;
import com.shopxx.pojo.XxAdminExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private XxAdminMapper adminMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxAdmin> findAll() {
		return adminMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxAdmin> page=   (Page<XxAdmin>) adminMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxAdmin admin) {
		adminMapper.insert(admin);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxAdmin admin){
		adminMapper.updateByPrimaryKey(admin);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxAdmin findOne(Long id){
		return adminMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			adminMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxAdmin admin, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxAdminExample example=new XxAdminExample();
		Criteria criteria = example.createCriteria();
		
		if(admin!=null){			
						if(admin.getDepartment()!=null && admin.getDepartment().length()>0){
				criteria.andDepartmentLike("%"+admin.getDepartment()+"%");
			}
			if(admin.getEmail()!=null && admin.getEmail().length()>0){
				criteria.andEmailLike("%"+admin.getEmail()+"%");
			}
			if(admin.getLoginIp()!=null && admin.getLoginIp().length()>0){
				criteria.andLoginIpLike("%"+admin.getLoginIp()+"%");
			}
			if(admin.getName()!=null && admin.getName().length()>0){
				criteria.andNameLike("%"+admin.getName()+"%");
			}
			if(admin.getPassword()!=null && admin.getPassword().length()>0){
				criteria.andPasswordLike("%"+admin.getPassword()+"%");
			}
			if(admin.getUsername()!=null && admin.getUsername().length()>0){
				criteria.andUsernameLike("%"+admin.getUsername()+"%");
			}
	
		}
		
		Page<XxAdmin> page= (Page<XxAdmin>)adminMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
