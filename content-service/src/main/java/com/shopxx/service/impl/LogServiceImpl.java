package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.LogService;
import com.shopxx.mapper.XxLogMapper;
import com.shopxx.pojo.XxLog;
import com.shopxx.pojo.XxLogExample;
import com.shopxx.pojo.XxLogExample.Criteria;
import com.shopxx.pojo.XxLogWithBLOBs;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class LogServiceImpl implements LogService {

	@Autowired
	private XxLogMapper logMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxLog> findAll() {
		return logMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxLog> page=   (Page<XxLog>) logMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxLog log) {
		logMapper.insert((XxLogWithBLOBs) log);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxLog log){
		logMapper.updateByPrimaryKey(log);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxLog findOne(Long id){
		return logMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			logMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxLog log, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxLogExample example=new XxLogExample();
		Criteria criteria = example.createCriteria();
		
		if(log!=null){			
						if(log.getIp()!=null && log.getIp().length()>0){
				criteria.andIpLike("%"+log.getIp()+"%");
			}
			if(log.getOperation()!=null && log.getOperation().length()>0){
				criteria.andOperationLike("%"+log.getOperation()+"%");
			}
			if(log.getOperator()!=null && log.getOperator().length()>0){
				criteria.andOperatorLike("%"+log.getOperator()+"%");
			}
	
		}
		
		Page<XxLog> page= (Page<XxLog>)logMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
