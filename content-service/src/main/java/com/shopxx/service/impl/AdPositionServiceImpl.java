package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.AdPositionService;
import com.shopxx.mapper.XxAdPositionMapper;
import com.shopxx.pojo.XxAdPosition;
import com.shopxx.pojo.XxAdPositionExample;
import com.shopxx.pojo.XxAdPositionExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class AdPositionServiceImpl implements AdPositionService {

	@Autowired
	private XxAdPositionMapper adPositionMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxAdPosition> findAll() {
		return adPositionMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxAdPosition> page=   (Page<XxAdPosition>) adPositionMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxAdPosition adPosition) {
		adPositionMapper.insert(adPosition);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxAdPosition adPosition){
		adPositionMapper.updateByPrimaryKey(adPosition);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxAdPosition findOne(Long id){
		return adPositionMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			adPositionMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxAdPosition adPosition, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxAdPositionExample example=new XxAdPositionExample();
		Criteria criteria = example.createCriteria();
		
		if(adPosition!=null){			
						if(adPosition.getDescription()!=null && adPosition.getDescription().length()>0){
				criteria.andDescriptionLike("%"+adPosition.getDescription()+"%");
			}
			if(adPosition.getName()!=null && adPosition.getName().length()>0){
				criteria.andNameLike("%"+adPosition.getName()+"%");
			}
	
		}
		
		Page<XxAdPosition> page= (Page<XxAdPosition>)adPositionMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
