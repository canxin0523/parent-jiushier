package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.BrandService;
import com.shopxx.mapper.XxBrandMapper;
import com.shopxx.pojo.XxBrand;
import com.shopxx.pojo.XxBrandExample;
import com.shopxx.pojo.XxBrandExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class BrandServiceImpl implements BrandService {

	@Autowired
	private XxBrandMapper brandMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxBrand> findAll() {
		return brandMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxBrand> page=   (Page<XxBrand>) brandMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxBrand brand) {
		brandMapper.insert(brand);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxBrand brand){
		brandMapper.updateByPrimaryKey(brand);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxBrand findOne(Long id){
		return brandMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			brandMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxBrand brand, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxBrandExample example=new XxBrandExample();
		Criteria criteria = example.createCriteria();
		
		if(brand!=null){			
						if(brand.getLogo()!=null && brand.getLogo().length()>0){
				criteria.andLogoLike("%"+brand.getLogo()+"%");
			}
			if(brand.getName()!=null && brand.getName().length()>0){
				criteria.andNameLike("%"+brand.getName()+"%");
			}
			if(brand.getUrl()!=null && brand.getUrl().length()>0){
				criteria.andUrlLike("%"+brand.getUrl()+"%");
			}
	
		}
		
		Page<XxBrand> page= (Page<XxBrand>)brandMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
