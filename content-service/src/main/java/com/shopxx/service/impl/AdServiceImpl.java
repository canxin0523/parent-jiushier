package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.AdService;
import com.shopxx.mapper.XxAdMapper;
import com.shopxx.pojo.XxAd;
import com.shopxx.pojo.XxAdExample;
import com.shopxx.pojo.XxAdExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class AdServiceImpl implements AdService {

	@Autowired
	private XxAdMapper adMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxAd> findAll() {
		return adMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxAd> page=   (Page<XxAd>) adMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxAd ad) {
		adMapper.insert(ad);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxAd ad){
		adMapper.updateByPrimaryKey(ad);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxAd findOne(Long id){
		return adMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			adMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxAd ad, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxAdExample example=new XxAdExample();
		Criteria criteria = example.createCriteria();
		
		if(ad!=null){			
						if(ad.getPath()!=null && ad.getPath().length()>0){
				criteria.andPathLike("%"+ad.getPath()+"%");
			}
			if(ad.getTitle()!=null && ad.getTitle().length()>0){
				criteria.andTitleLike("%"+ad.getTitle()+"%");
			}
			if(ad.getUrl()!=null && ad.getUrl().length()>0){
				criteria.andUrlLike("%"+ad.getUrl()+"%");
			}
	
		}
		
		Page<XxAd> page= (Page<XxAd>)adMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
