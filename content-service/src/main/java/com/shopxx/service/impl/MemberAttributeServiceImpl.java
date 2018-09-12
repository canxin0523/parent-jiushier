package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.MemberAttributeService;
import com.shopxx.mapper.XxMemberAttributeMapper;
import com.shopxx.pojo.XxMemberAttribute;
import com.shopxx.pojo.XxMemberAttributeExample;
import com.shopxx.pojo.XxMemberAttributeExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class MemberAttributeServiceImpl implements MemberAttributeService {

	@Autowired
	private XxMemberAttributeMapper memberAttributeMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxMemberAttribute> findAll() {
		return memberAttributeMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxMemberAttribute> page=   (Page<XxMemberAttribute>) memberAttributeMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxMemberAttribute memberAttribute) {
		memberAttributeMapper.insert(memberAttribute);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxMemberAttribute memberAttribute){
		memberAttributeMapper.updateByPrimaryKey(memberAttribute);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxMemberAttribute findOne(Long id){
		return memberAttributeMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			memberAttributeMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxMemberAttribute memberAttribute, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxMemberAttributeExample example=new XxMemberAttributeExample();
		Criteria criteria = example.createCriteria();
		
		if(memberAttribute!=null){			
						if(memberAttribute.getName()!=null && memberAttribute.getName().length()>0){
				criteria.andNameLike("%"+memberAttribute.getName()+"%");
			}
	
		}
		
		Page<XxMemberAttribute> page= (Page<XxMemberAttribute>)memberAttributeMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
