package com.service;

import com.shopxx.pojo.XxGiftItem;
import entity.PageResult;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface GiftItemService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<XxGiftItem> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(XxGiftItem giftItem);
	
	
	/**
	 * 修改
	 */
	public void update(XxGiftItem giftItem);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public XxGiftItem findOne(Long id);
	
	
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
	public PageResult findPage(XxGiftItem giftItem, int pageNum, int pageSize);
	
}
