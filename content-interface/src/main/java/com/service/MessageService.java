package com.service;

import com.shopxx.pojo.XxMessage;
import entity.PageResult;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface MessageService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<XxMessage> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(XxMessage message);
	
	
	/**
	 * 修改
	 */
	public void update(XxMessage message);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public XxMessage findOne(Long id);
	
	
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
	public PageResult findPage(XxMessage message, int pageNum, int pageSize);
	
}
