package com.service;

import com.shopxx.pojo.XxOrderLog;
import entity.PageResult;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface OrderLogService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<XxOrderLog> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(XxOrderLog orderLog);
	
	
	/**
	 * 修改
	 */
	public void update(XxOrderLog orderLog);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public XxOrderLog findOne(Long id);
	
	
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
	public PageResult findPage(XxOrderLog orderLog, int pageNum, int pageSize);
	
}
