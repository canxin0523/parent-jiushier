package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.PromotionService;
import com.shopxx.mapper.XxPromotionMapper;
import com.shopxx.pojo.XxPromotion;
import com.shopxx.pojo.XxPromotionExample;
import com.shopxx.pojo.XxPromotionExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class PromotionServiceImpl implements PromotionService {

	@Autowired
	private XxPromotionMapper promotionMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxPromotion> findAll() {
		return promotionMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxPromotion> page=   (Page<XxPromotion>) promotionMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxPromotion promotion) {
		promotionMapper.insert(promotion);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxPromotion promotion){
		promotionMapper.updateByPrimaryKey(promotion);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxPromotion findOne(Long id){
		return promotionMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			promotionMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxPromotion promotion, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxPromotionExample example=new XxPromotionExample();
		Criteria criteria = example.createCriteria();
		
		if(promotion!=null){			
						if(promotion.getName()!=null && promotion.getName().length()>0){
				criteria.andNameLike("%"+promotion.getName()+"%");
			}
			if(promotion.getTitle()!=null && promotion.getTitle().length()>0){
				criteria.andTitleLike("%"+promotion.getTitle()+"%");
			}
	
		}
		
		Page<XxPromotion> page= (Page<XxPromotion>)promotionMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
