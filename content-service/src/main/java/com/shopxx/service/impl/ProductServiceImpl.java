package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.ProductService;
import com.shopxx.mapper.XxProductMapper;
import com.shopxx.pojo.XxProduct;
import com.shopxx.pojo.XxProductExample;
import com.shopxx.pojo.XxProductExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private XxProductMapper productMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxProduct> findAll() {
		return productMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxProduct> page=   (Page<XxProduct>) productMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxProduct product) {
		productMapper.insert(product);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxProduct product){
		productMapper.updateByPrimaryKey(product);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxProduct findOne(Long id){
		return productMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			productMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxProduct product, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxProductExample example=new XxProductExample();
		Criteria criteria = example.createCriteria();
		
		if(product!=null){			
						if(product.getAttributeValue0()!=null && product.getAttributeValue0().length()>0){
				criteria.andAttributeValue0Like("%"+product.getAttributeValue0()+"%");
			}
			if(product.getAttributeValue1()!=null && product.getAttributeValue1().length()>0){
				criteria.andAttributeValue1Like("%"+product.getAttributeValue1()+"%");
			}
			if(product.getAttributeValue10()!=null && product.getAttributeValue10().length()>0){
				criteria.andAttributeValue10Like("%"+product.getAttributeValue10()+"%");
			}
			if(product.getAttributeValue11()!=null && product.getAttributeValue11().length()>0){
				criteria.andAttributeValue11Like("%"+product.getAttributeValue11()+"%");
			}
			if(product.getAttributeValue12()!=null && product.getAttributeValue12().length()>0){
				criteria.andAttributeValue12Like("%"+product.getAttributeValue12()+"%");
			}
			if(product.getAttributeValue13()!=null && product.getAttributeValue13().length()>0){
				criteria.andAttributeValue13Like("%"+product.getAttributeValue13()+"%");
			}
			if(product.getAttributeValue14()!=null && product.getAttributeValue14().length()>0){
				criteria.andAttributeValue14Like("%"+product.getAttributeValue14()+"%");
			}
			if(product.getAttributeValue15()!=null && product.getAttributeValue15().length()>0){
				criteria.andAttributeValue15Like("%"+product.getAttributeValue15()+"%");
			}
			if(product.getAttributeValue16()!=null && product.getAttributeValue16().length()>0){
				criteria.andAttributeValue16Like("%"+product.getAttributeValue16()+"%");
			}
			if(product.getAttributeValue17()!=null && product.getAttributeValue17().length()>0){
				criteria.andAttributeValue17Like("%"+product.getAttributeValue17()+"%");
			}
			if(product.getAttributeValue18()!=null && product.getAttributeValue18().length()>0){
				criteria.andAttributeValue18Like("%"+product.getAttributeValue18()+"%");
			}
			if(product.getAttributeValue19()!=null && product.getAttributeValue19().length()>0){
				criteria.andAttributeValue19Like("%"+product.getAttributeValue19()+"%");
			}
			if(product.getAttributeValue2()!=null && product.getAttributeValue2().length()>0){
				criteria.andAttributeValue2Like("%"+product.getAttributeValue2()+"%");
			}
			if(product.getAttributeValue3()!=null && product.getAttributeValue3().length()>0){
				criteria.andAttributeValue3Like("%"+product.getAttributeValue3()+"%");
			}
			if(product.getAttributeValue4()!=null && product.getAttributeValue4().length()>0){
				criteria.andAttributeValue4Like("%"+product.getAttributeValue4()+"%");
			}
			if(product.getAttributeValue5()!=null && product.getAttributeValue5().length()>0){
				criteria.andAttributeValue5Like("%"+product.getAttributeValue5()+"%");
			}
			if(product.getAttributeValue6()!=null && product.getAttributeValue6().length()>0){
				criteria.andAttributeValue6Like("%"+product.getAttributeValue6()+"%");
			}
			if(product.getAttributeValue7()!=null && product.getAttributeValue7().length()>0){
				criteria.andAttributeValue7Like("%"+product.getAttributeValue7()+"%");
			}
			if(product.getAttributeValue8()!=null && product.getAttributeValue8().length()>0){
				criteria.andAttributeValue8Like("%"+product.getAttributeValue8()+"%");
			}
			if(product.getAttributeValue9()!=null && product.getAttributeValue9().length()>0){
				criteria.andAttributeValue9Like("%"+product.getAttributeValue9()+"%");
			}
			if(product.getFullName()!=null && product.getFullName().length()>0){
				criteria.andFullNameLike("%"+product.getFullName()+"%");
			}
			if(product.getImage()!=null && product.getImage().length()>0){
				criteria.andImageLike("%"+product.getImage()+"%");
			}
			if(product.getKeyword()!=null && product.getKeyword().length()>0){
				criteria.andKeywordLike("%"+product.getKeyword()+"%");
			}
			if(product.getMemo()!=null && product.getMemo().length()>0){
				criteria.andMemoLike("%"+product.getMemo()+"%");
			}
			if(product.getName()!=null && product.getName().length()>0){
				criteria.andNameLike("%"+product.getName()+"%");
			}
			if(product.getSeoDescription()!=null && product.getSeoDescription().length()>0){
				criteria.andSeoDescriptionLike("%"+product.getSeoDescription()+"%");
			}
			if(product.getSeoKeywords()!=null && product.getSeoKeywords().length()>0){
				criteria.andSeoKeywordsLike("%"+product.getSeoKeywords()+"%");
			}
			if(product.getSeoTitle()!=null && product.getSeoTitle().length()>0){
				criteria.andSeoTitleLike("%"+product.getSeoTitle()+"%");
			}
			if(product.getSn()!=null && product.getSn().length()>0){
				criteria.andSnLike("%"+product.getSn()+"%");
			}
			if(product.getStockMemo()!=null && product.getStockMemo().length()>0){
				criteria.andStockMemoLike("%"+product.getStockMemo()+"%");
			}
			if(product.getUnit()!=null && product.getUnit().length()>0){
				criteria.andUnitLike("%"+product.getUnit()+"%");
			}
	
		}
		
		Page<XxProduct> page= (Page<XxProduct>)productMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
