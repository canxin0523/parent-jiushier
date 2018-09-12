package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.PluginConfigService;
import com.shopxx.mapper.XxPluginConfigMapper;
import com.shopxx.pojo.XxPluginConfig;
import com.shopxx.pojo.XxPluginConfigExample;
import com.shopxx.pojo.XxPluginConfigExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class PluginConfigServiceImpl implements PluginConfigService {

	@Autowired
	private XxPluginConfigMapper pluginConfigMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxPluginConfig> findAll() {
		return pluginConfigMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxPluginConfig> page=   (Page<XxPluginConfig>) pluginConfigMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxPluginConfig pluginConfig) {
		pluginConfigMapper.insert(pluginConfig);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxPluginConfig pluginConfig){
		pluginConfigMapper.updateByPrimaryKey(pluginConfig);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxPluginConfig findOne(Long id){
		return pluginConfigMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			pluginConfigMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxPluginConfig pluginConfig, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxPluginConfigExample example=new XxPluginConfigExample();
		Criteria criteria = example.createCriteria();
		
		if(pluginConfig!=null){			
						if(pluginConfig.getPluginId()!=null && pluginConfig.getPluginId().length()>0){
				criteria.andPluginIdLike("%"+pluginConfig.getPluginId()+"%");
			}
	
		}
		
		Page<XxPluginConfig> page= (Page<XxPluginConfig>)pluginConfigMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
