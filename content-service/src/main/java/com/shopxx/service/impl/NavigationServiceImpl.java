package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.NavigationService;
import com.shopxx.mapper.XxNavigationMapper;
import com.shopxx.pojo.XxNavigation;
import com.shopxx.pojo.XxNavigationExample;
import com.shopxx.pojo.XxNavigationExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class NavigationServiceImpl implements NavigationService {

	@Autowired
	private XxNavigationMapper navigationMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxNavigation> findAll() {
		return navigationMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxNavigation> page=   (Page<XxNavigation>) navigationMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxNavigation navigation) {
		navigationMapper.insert(navigation);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxNavigation navigation){
		navigationMapper.updateByPrimaryKey(navigation);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxNavigation findOne(Long id){
		return navigationMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			navigationMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxNavigation navigation, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxNavigationExample example=new XxNavigationExample();
		Criteria criteria = example.createCriteria();
		
		if(navigation!=null){			
						if(navigation.getName()!=null && navigation.getName().length()>0){
				criteria.andNameLike("%"+navigation.getName()+"%");
			}
			if(navigation.getUrl()!=null && navigation.getUrl().length()>0){
				criteria.andUrlLike("%"+navigation.getUrl()+"%");
			}
	
		}
		
		Page<XxNavigation> page= (Page<XxNavigation>)navigationMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
