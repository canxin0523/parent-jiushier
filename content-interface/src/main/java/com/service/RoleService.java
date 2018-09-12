package com.service;

import com.shopxx.pojo.XxRole;
import entity.PageResult;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface RoleService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<XxRole> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(XxRole role);
	
	
	/**
	 * 修改
	 */
	public void update(XxRole role);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public XxRole findOne(Long id);
	
	
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
	public PageResult findPage(XxRole role, int pageNum, int pageSize);
	
}
