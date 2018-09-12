package com.service;

import com.shopxx.pojo.XxArticle;
import entity.PageResult;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface ArticleService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<XxArticle> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(XxArticle article);
	
	
	/**
	 * 修改
	 */
	public void update(XxArticle article);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public XxArticle findOne(Long id);
	
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Long[] ids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(XxArticle article, int pageNum, int pageSize);
	
}
