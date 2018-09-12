package com.service;

import com.shopxx.pojo.XxMemberAttribute;
import entity.PageResult;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface MemberAttributeService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<XxMemberAttribute> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(XxMemberAttribute memberAttribute);
	
	
	/**
	 * 修改
	 */
	public void update(XxMemberAttribute memberAttribute);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public XxMemberAttribute findOne(Long id);
	
	
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
	public PageResult findPage(XxMemberAttribute memberAttribute, int pageNum, int pageSize);
	
}
