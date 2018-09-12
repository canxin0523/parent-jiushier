package com.service;

import com.shopxx.pojo.XxPromotion;
import entity.PageResult;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface PromotionService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<XxPromotion> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(XxPromotion promotion);
	
	
	/**
	 * 修改
	 */
	public void update(XxPromotion promotion);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public XxPromotion findOne(Long id);
	
	
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
	public PageResult findPage(XxPromotion promotion, int pageNum, int pageSize);
	
}
