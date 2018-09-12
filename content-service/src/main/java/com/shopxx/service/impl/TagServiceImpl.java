package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.TagService;
import com.shopxx.mapper.XxTagMapper;
import com.shopxx.pojo.XxTag;
import com.shopxx.pojo.XxTagExample;
import com.shopxx.pojo.XxTagExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class TagServiceImpl implements TagService {

	@Autowired
	private XxTagMapper tagMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxTag> findAll() {
		return tagMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxTag> page=   (Page<XxTag>) tagMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxTag tag) {
		tagMapper.insert(tag);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxTag tag){
		tagMapper.updateByPrimaryKey(tag);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxTag findOne(Long id){
		return tagMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			tagMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxTag tag, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxTagExample example=new XxTagExample();
		Criteria criteria = example.createCriteria();
		
		if(tag!=null){			
						if(tag.getIcon()!=null && tag.getIcon().length()>0){
				criteria.andIconLike("%"+tag.getIcon()+"%");
			}
			if(tag.getMemo()!=null && tag.getMemo().length()>0){
				criteria.andMemoLike("%"+tag.getMemo()+"%");
			}
			if(tag.getName()!=null && tag.getName().length()>0){
				criteria.andNameLike("%"+tag.getName()+"%");
			}
	
		}
		
		Page<XxTag> page= (Page<XxTag>)tagMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
