package com.service;

import com.shopxx.pojo.XxShipping;
import entity.PageResult;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface ShippingService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<XxShipping> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(XxShipping shipping);
	
	
	/**
	 * 修改
	 */
	public void update(XxShipping shipping);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public XxShipping findOne(Long id);
	
	
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
	public PageResult findPage(XxShipping shipping, int pageNum, int pageSize);
	
}
