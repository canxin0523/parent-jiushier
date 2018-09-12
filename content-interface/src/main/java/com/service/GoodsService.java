package com.service;

import com.shopxx.pojo.XxGoods;
import entity.PageResult;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface GoodsService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<XxGoods> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(XxGoods goods);
	
	
	/**
	 * 修改
	 */
	public void update(XxGoods goods);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public XxGoods findOne(Long id);
	
	
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
	public PageResult findPage(XxGoods goods, int pageNum, int pageSize);
	
}
