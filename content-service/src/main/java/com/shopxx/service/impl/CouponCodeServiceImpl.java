package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.CouponCodeService;
import com.shopxx.mapper.XxCouponCodeMapper;
import com.shopxx.pojo.XxCouponCode;
import com.shopxx.pojo.XxCouponCodeExample;
import com.shopxx.pojo.XxCouponCodeExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class CouponCodeServiceImpl implements CouponCodeService {

	@Autowired
	private XxCouponCodeMapper couponCodeMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxCouponCode> findAll() {
		return couponCodeMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxCouponCode> page=   (Page<XxCouponCode>) couponCodeMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxCouponCode couponCode) {
		couponCodeMapper.insert(couponCode);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxCouponCode couponCode){
		couponCodeMapper.updateByPrimaryKey(couponCode);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxCouponCode findOne(Long id){
		return couponCodeMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			couponCodeMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxCouponCode couponCode, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxCouponCodeExample example=new XxCouponCodeExample();
		Criteria criteria = example.createCriteria();
		
		if(couponCode!=null){			
						if(couponCode.getCode()!=null && couponCode.getCode().length()>0){
				criteria.andCodeLike("%"+couponCode.getCode()+"%");
			}
	
		}
		
		Page<XxCouponCode> page= (Page<XxCouponCode>)couponCodeMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
