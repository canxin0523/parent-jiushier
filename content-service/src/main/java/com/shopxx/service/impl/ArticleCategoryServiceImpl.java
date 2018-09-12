package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.ArticleCategoryService;
import com.shopxx.mapper.XxArticleCategoryMapper;
import com.shopxx.pojo.XxArticleCategory;
import com.shopxx.pojo.XxArticleCategoryExample;
import com.shopxx.pojo.XxArticleCategoryExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class ArticleCategoryServiceImpl implements ArticleCategoryService {

	@Autowired
	private XxArticleCategoryMapper articleCategoryMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxArticleCategory> findAll() {
		return articleCategoryMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxArticleCategory> page=   (Page<XxArticleCategory>) articleCategoryMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxArticleCategory articleCategory) {
		articleCategoryMapper.insert(articleCategory);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxArticleCategory articleCategory){
		articleCategoryMapper.updateByPrimaryKey(articleCategory);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxArticleCategory findOne(Long id){
		return articleCategoryMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			articleCategoryMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxArticleCategory articleCategory, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxArticleCategoryExample example=new XxArticleCategoryExample();
		Criteria criteria = example.createCriteria();
		
		if(articleCategory!=null){			
						if(articleCategory.getName()!=null && articleCategory.getName().length()>0){
				criteria.andNameLike("%"+articleCategory.getName()+"%");
			}
			if(articleCategory.getSeoDescription()!=null && articleCategory.getSeoDescription().length()>0){
				criteria.andSeoDescriptionLike("%"+articleCategory.getSeoDescription()+"%");
			}
			if(articleCategory.getSeoKeywords()!=null && articleCategory.getSeoKeywords().length()>0){
				criteria.andSeoKeywordsLike("%"+articleCategory.getSeoKeywords()+"%");
			}
			if(articleCategory.getSeoTitle()!=null && articleCategory.getSeoTitle().length()>0){
				criteria.andSeoTitleLike("%"+articleCategory.getSeoTitle()+"%");
			}
			if(articleCategory.getTreePath()!=null && articleCategory.getTreePath().length()>0){
				criteria.andTreePathLike("%"+articleCategory.getTreePath()+"%");
			}
	
		}
		
		Page<XxArticleCategory> page= (Page<XxArticleCategory>)articleCategoryMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
