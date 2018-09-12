package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.MemberRankService;
import com.shopxx.mapper.XxMemberRankMapper;
import com.shopxx.pojo.XxMemberRank;
import com.shopxx.pojo.XxMemberRankExample;
import com.shopxx.pojo.XxMemberRankExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class MemberRankServiceImpl implements MemberRankService {

	@Autowired
	private XxMemberRankMapper memberRankMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxMemberRank> findAll() {
		return memberRankMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxMemberRank> page=   (Page<XxMemberRank>) memberRankMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxMemberRank memberRank) {
		memberRankMapper.insert(memberRank);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxMemberRank memberRank){
		memberRankMapper.updateByPrimaryKey(memberRank);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxMemberRank findOne(Long id){
		return memberRankMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			memberRankMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxMemberRank memberRank, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxMemberRankExample example=new XxMemberRankExample();
		Criteria criteria = example.createCriteria();
		
		if(memberRank!=null){			
						if(memberRank.getName()!=null && memberRank.getName().length()>0){
				criteria.andNameLike("%"+memberRank.getName()+"%");
			}
	
		}
		
		Page<XxMemberRank> page= (Page<XxMemberRank>)memberRankMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
