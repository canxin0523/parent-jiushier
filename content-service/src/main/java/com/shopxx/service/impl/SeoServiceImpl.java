package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.SeoService;
import com.shopxx.mapper.XxSeoMapper;
import com.shopxx.pojo.XxSeo;
import com.shopxx.pojo.XxSeoExample;
import com.shopxx.pojo.XxSeoExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class SeoServiceImpl implements SeoService {

	@Autowired
	private XxSeoMapper seoMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxSeo> findAll() {
		return seoMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxSeo> page=   (Page<XxSeo>) seoMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxSeo seo) {
		seoMapper.insert(seo);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxSeo seo){
		seoMapper.updateByPrimaryKey(seo);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxSeo findOne(Long id){
		return seoMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			seoMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxSeo seo, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxSeoExample example=new XxSeoExample();
		Criteria criteria = example.createCriteria();
		
		if(seo!=null){			
						if(seo.getDescription()!=null && seo.getDescription().length()>0){
				criteria.andDescriptionLike("%"+seo.getDescription()+"%");
			}
			if(seo.getKeywords()!=null && seo.getKeywords().length()>0){
				criteria.andKeywordsLike("%"+seo.getKeywords()+"%");
			}
			if(seo.getTitle()!=null && seo.getTitle().length()>0){
				criteria.andTitleLike("%"+seo.getTitle()+"%");
			}
	
		}
		
		Page<XxSeo> page= (Page<XxSeo>)seoMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
