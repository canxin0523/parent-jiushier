package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.ConsultationService;
import com.shopxx.mapper.XxConsultationMapper;
import com.shopxx.pojo.XxConsultation;
import com.shopxx.pojo.XxConsultationExample;
import com.shopxx.pojo.XxConsultationExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class ConsultationServiceImpl implements ConsultationService {

	@Autowired
	private XxConsultationMapper consultationMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxConsultation> findAll() {
		return consultationMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxConsultation> page=   (Page<XxConsultation>) consultationMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxConsultation consultation) {
		consultationMapper.insert(consultation);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxConsultation consultation){
		consultationMapper.updateByPrimaryKey(consultation);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxConsultation findOne(Long id){
		return consultationMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			consultationMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxConsultation consultation, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxConsultationExample example=new XxConsultationExample();
		Criteria criteria = example.createCriteria();
		
		if(consultation!=null){			
						if(consultation.getContent()!=null && consultation.getContent().length()>0){
				criteria.andContentLike("%"+consultation.getContent()+"%");
			}
			if(consultation.getIp()!=null && consultation.getIp().length()>0){
				criteria.andIpLike("%"+consultation.getIp()+"%");
			}
	
		}
		
		Page<XxConsultation> page= (Page<XxConsultation>)consultationMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
