package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.ArticleService;
import com.shopxx.mapper.XxArticleMapper;
import com.shopxx.pojo.XxArticle;
import com.shopxx.pojo.XxArticleExample;
import com.shopxx.pojo.XxArticleExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	private XxArticleMapper articleMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxArticle> findAll() {
		return articleMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxArticle> page=   (Page<XxArticle>) articleMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxArticle article) {
		articleMapper.insert(article);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxArticle article){
		articleMapper.updateByPrimaryKey(article);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxArticle findOne(Long id){
		return articleMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			articleMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxArticle article, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxArticleExample example=new XxArticleExample();
		Criteria criteria = example.createCriteria();
		
		if(article!=null){			
						if(article.getAuthor()!=null && article.getAuthor().length()>0){
				criteria.andAuthorLike("%"+article.getAuthor()+"%");
			}
			if(article.getSeoDescription()!=null && article.getSeoDescription().length()>0){
				criteria.andSeoDescriptionLike("%"+article.getSeoDescription()+"%");
			}
			if(article.getSeoKeywords()!=null && article.getSeoKeywords().length()>0){
				criteria.andSeoKeywordsLike("%"+article.getSeoKeywords()+"%");
			}
			if(article.getSeoTitle()!=null && article.getSeoTitle().length()>0){
				criteria.andSeoTitleLike("%"+article.getSeoTitle()+"%");
			}
			if(article.getTitle()!=null && article.getTitle().length()>0){
				criteria.andTitleLike("%"+article.getTitle()+"%");
			}
	
		}
		
		Page<XxArticle> page= (Page<XxArticle>)articleMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
