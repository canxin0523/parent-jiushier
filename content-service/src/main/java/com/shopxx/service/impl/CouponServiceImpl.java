package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.CouponService;
import com.shopxx.mapper.XxCouponMapper;
import com.shopxx.pojo.XxCoupon;
import com.shopxx.pojo.XxCouponExample;
import com.shopxx.pojo.XxCouponExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class CouponServiceImpl implements CouponService {

	@Autowired
	private XxCouponMapper couponMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxCoupon> findAll() {
		return couponMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxCoupon> page=   (Page<XxCoupon>) couponMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxCoupon coupon) {
		couponMapper.insert(coupon);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxCoupon coupon){
		couponMapper.updateByPrimaryKey(coupon);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxCoupon findOne(Long id){
		return couponMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			couponMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxCoupon coupon, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxCouponExample example=new XxCouponExample();
		Criteria criteria = example.createCriteria();
		
		if(coupon!=null){			
						if(coupon.getName()!=null && coupon.getName().length()>0){
				criteria.andNameLike("%"+coupon.getName()+"%");
			}
			if(coupon.getPrefix()!=null && coupon.getPrefix().length()>0){
				criteria.andPrefixLike("%"+coupon.getPrefix()+"%");
			}
	
		}
		
		Page<XxCoupon> page= (Page<XxCoupon>)couponMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
