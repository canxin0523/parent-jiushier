package com.shopxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.MemberService;
import com.shopxx.mapper.XxMemberMapper;
import com.shopxx.pojo.XxMember;
import com.shopxx.pojo.XxMemberExample;
import com.shopxx.pojo.XxMemberExample.Criteria;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private XxMemberMapper memberMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<XxMember> findAll() {
		return memberMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<XxMember> page=   (Page<XxMember>) memberMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(XxMember member) {
		memberMapper.insert(member);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(XxMember member){
		memberMapper.updateByPrimaryKey(member);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public XxMember findOne(Long id){
		return memberMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			memberMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(XxMember member, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		XxMemberExample example=new XxMemberExample();
		Criteria criteria = example.createCriteria();
		
		if(member!=null){			
						if(member.getAddress()!=null && member.getAddress().length()>0){
				criteria.andAddressLike("%"+member.getAddress()+"%");
			}
			if(member.getAttributeValue0()!=null && member.getAttributeValue0().length()>0){
				criteria.andAttributeValue0Like("%"+member.getAttributeValue0()+"%");
			}
			if(member.getAttributeValue1()!=null && member.getAttributeValue1().length()>0){
				criteria.andAttributeValue1Like("%"+member.getAttributeValue1()+"%");
			}
			if(member.getAttributeValue2()!=null && member.getAttributeValue2().length()>0){
				criteria.andAttributeValue2Like("%"+member.getAttributeValue2()+"%");
			}
			if(member.getAttributeValue3()!=null && member.getAttributeValue3().length()>0){
				criteria.andAttributeValue3Like("%"+member.getAttributeValue3()+"%");
			}
			if(member.getAttributeValue4()!=null && member.getAttributeValue4().length()>0){
				criteria.andAttributeValue4Like("%"+member.getAttributeValue4()+"%");
			}
			if(member.getAttributeValue5()!=null && member.getAttributeValue5().length()>0){
				criteria.andAttributeValue5Like("%"+member.getAttributeValue5()+"%");
			}
			if(member.getAttributeValue6()!=null && member.getAttributeValue6().length()>0){
				criteria.andAttributeValue6Like("%"+member.getAttributeValue6()+"%");
			}
			if(member.getAttributeValue7()!=null && member.getAttributeValue7().length()>0){
				criteria.andAttributeValue7Like("%"+member.getAttributeValue7()+"%");
			}
			if(member.getAttributeValue8()!=null && member.getAttributeValue8().length()>0){
				criteria.andAttributeValue8Like("%"+member.getAttributeValue8()+"%");
			}
			if(member.getAttributeValue9()!=null && member.getAttributeValue9().length()>0){
				criteria.andAttributeValue9Like("%"+member.getAttributeValue9()+"%");
			}
			if(member.getEmail()!=null && member.getEmail().length()>0){
				criteria.andEmailLike("%"+member.getEmail()+"%");
			}
			if(member.getLoginIp()!=null && member.getLoginIp().length()>0){
				criteria.andLoginIpLike("%"+member.getLoginIp()+"%");
			}
			if(member.getMobile()!=null && member.getMobile().length()>0){
				criteria.andMobileLike("%"+member.getMobile()+"%");
			}
			if(member.getName()!=null && member.getName().length()>0){
				criteria.andNameLike("%"+member.getName()+"%");
			}
			if(member.getPassword()!=null && member.getPassword().length()>0){
				criteria.andPasswordLike("%"+member.getPassword()+"%");
			}
			if(member.getPhone()!=null && member.getPhone().length()>0){
				criteria.andPhoneLike("%"+member.getPhone()+"%");
			}
			if(member.getRegisterIp()!=null && member.getRegisterIp().length()>0){
				criteria.andRegisterIpLike("%"+member.getRegisterIp()+"%");
			}
			if(member.getSafeKeyValue()!=null && member.getSafeKeyValue().length()>0){
				criteria.andSafeKeyValueLike("%"+member.getSafeKeyValue()+"%");
			}
			if(member.getUsername()!=null && member.getUsername().length()>0){
				criteria.andUsernameLike("%"+member.getUsername()+"%");
			}
			if(member.getZipCode()!=null && member.getZipCode().length()>0){
				criteria.andZipCodeLike("%"+member.getZipCode()+"%");
			}
	
		}
		
		Page<XxMember> page= (Page<XxMember>)memberMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
