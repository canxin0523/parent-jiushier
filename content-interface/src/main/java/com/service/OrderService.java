package com.service;

import com.shopxx.pojo.XxOrder;
import entity.PageResult;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface OrderService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<XxOrder> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(XxOrder order);
	
	
	/**
	 * 修改
	 */
	public void update(XxOrder order);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public XxOrder findOne(Long id);
	
	
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
	public PageResult findPage(XxOrder order, int pageNum, int pageSize);
	
}
