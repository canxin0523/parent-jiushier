package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.ProductCategoryService;
import com.shopxx.mapper.XxProductCategoryMapper;
import com.shopxx.pojo.XxProductCategory;
import com.shopxx.pojo.XxProductCategoryExample;
import com.shopxx.pojo.XxProductCategoryExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

	@Autowired
	private XxProductCategoryMapper productCategoryMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxProductCategory> findAll() {
		return productCategoryMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxProductCategory> page=   (Page<XxProductCategory>) productCategoryMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxProductCategory productCategory) {
		productCategoryMapper.insert(productCategory);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxProductCategory productCategory){
		productCategoryMapper.updateByPrimaryKey(productCategory);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxProductCategory findOne(Long id){
		return productCategoryMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			productCategoryMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxProductCategory productCategory, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxProductCategoryExample example=new XxProductCategoryExample();
		Criteria criteria = example.createCriteria();
		
		if(productCategory!=null){			
						if(productCategory.getName()!=null && productCategory.getName().length()>0){
				criteria.andNameLike("%"+productCategory.getName()+"%");
			}
			if(productCategory.getSeoDescription()!=null && productCategory.getSeoDescription().length()>0){
				criteria.andSeoDescriptionLike("%"+productCategory.getSeoDescription()+"%");
			}
			if(productCategory.getSeoKeywords()!=null && productCategory.getSeoKeywords().length()>0){
				criteria.andSeoKeywordsLike("%"+productCategory.getSeoKeywords()+"%");
			}
			if(productCategory.getSeoTitle()!=null && productCategory.getSeoTitle().length()>0){
				criteria.andSeoTitleLike("%"+productCategory.getSeoTitle()+"%");
			}
			if(productCategory.getTreePath()!=null && productCategory.getTreePath().length()>0){
				criteria.andTreePathLike("%"+productCategory.getTreePath()+"%");
			}
	
		}
		
		Page<XxProductCategory> page= (Page<XxProductCategory>)productCategoryMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
