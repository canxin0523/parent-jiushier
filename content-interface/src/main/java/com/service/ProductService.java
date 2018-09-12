package com.service;

import com.shopxx.pojo.XxProduct;
import entity.PageResult;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface ProductService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<XxProduct> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(XxProduct product);
	
	
	/**
	 * 修改
	 */
	public void update(XxProduct product);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public XxProduct findOne(Long id);
	
	
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
	public PageResult findPage(XxProduct product, int pageNum, int pageSize);
	
}
