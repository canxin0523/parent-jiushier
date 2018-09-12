package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.FriendLinkService;
import com.shopxx.mapper.XxFriendLinkMapper;
import com.shopxx.pojo.XxFriendLink;
import com.shopxx.pojo.XxFriendLinkExample;
import com.shopxx.pojo.XxFriendLinkExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class FriendLinkServiceImpl implements FriendLinkService {

	@Autowired
	private XxFriendLinkMapper friendLinkMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxFriendLink> findAll() {
		return friendLinkMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxFriendLink> page=   (Page<XxFriendLink>) friendLinkMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxFriendLink friendLink) {
		friendLinkMapper.insert(friendLink);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxFriendLink friendLink){
		friendLinkMapper.updateByPrimaryKey(friendLink);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxFriendLink findOne(Long id){
		return friendLinkMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			friendLinkMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxFriendLink friendLink, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxFriendLinkExample example=new XxFriendLinkExample();
		Criteria criteria = example.createCriteria();
		
		if(friendLink!=null){			
						if(friendLink.getLogo()!=null && friendLink.getLogo().length()>0){
				criteria.andLogoLike("%"+friendLink.getLogo()+"%");
			}
			if(friendLink.getName()!=null && friendLink.getName().length()>0){
				criteria.andNameLike("%"+friendLink.getName()+"%");
			}
			if(friendLink.getUrl()!=null && friendLink.getUrl().length()>0){
				criteria.andUrlLike("%"+friendLink.getUrl()+"%");
			}
	
		}
		
		Page<XxFriendLink> page= (Page<XxFriendLink>)friendLinkMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
