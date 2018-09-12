package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.ReviewService;
import com.shopxx.mapper.XxReviewMapper;
import com.shopxx.pojo.XxReview;
import com.shopxx.pojo.XxReviewExample;
import com.shopxx.pojo.XxReviewExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class ReviewServiceImpl implements ReviewService {

	@Autowired
	private XxReviewMapper reviewMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxReview> findAll() {
		return reviewMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxReview> page=   (Page<XxReview>) reviewMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxReview review) {
		reviewMapper.insert(review);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxReview review){
		reviewMapper.updateByPrimaryKey(review);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxReview findOne(Long id){
		return reviewMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			reviewMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxReview review, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxReviewExample example=new XxReviewExample();
		Criteria criteria = example.createCriteria();
		
		if(review!=null){			
						if(review.getContent()!=null && review.getContent().length()>0){
				criteria.andContentLike("%"+review.getContent()+"%");
			}
			if(review.getIp()!=null && review.getIp().length()>0){
				criteria.andIpLike("%"+review.getIp()+"%");
			}
	
		}
		
		Page<XxReview> page= (Page<XxReview>)reviewMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
