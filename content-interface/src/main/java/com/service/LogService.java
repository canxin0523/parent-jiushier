package com.service;

import com.shopxx.pojo.XxLog;
import entity.PageResult;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface LogService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<XxLog> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(XxLog log);
	
	
	/**
	 * 修改
	 */
	public void update(XxLog log);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public XxLog findOne(Long id);
	
	
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
	public PageResult findPage(XxLog log, int pageNum, int pageSize);
	
}
