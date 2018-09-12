package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.AreaService;
import com.shopxx.mapper.XxAreaMapper;
import com.shopxx.pojo.XxArea;
import com.shopxx.pojo.XxAreaExample;
import com.shopxx.pojo.XxAreaExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class AreaServiceImpl implements AreaService {

	@Autowired
	private XxAreaMapper areaMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxArea> findAll() {
		return areaMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxArea> page=   (Page<XxArea>) areaMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxArea area) {
		areaMapper.insert(area);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxArea area){
		areaMapper.updateByPrimaryKey(area);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxArea findOne(Long id){
		return areaMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			areaMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxArea area, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxAreaExample example=new XxAreaExample();
		Criteria criteria = example.createCriteria();
		
		if(area!=null){			
						if(area.getName()!=null && area.getName().length()>0){
				criteria.andNameLike("%"+area.getName()+"%");
			}
			if(area.getTreePath()!=null && area.getTreePath().length()>0){
				criteria.andTreePathLike("%"+area.getTreePath()+"%");
			}
	
		}
		
		Page<XxArea> page= (Page<XxArea>)areaMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
