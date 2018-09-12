package com.shopxx.controller.common;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.shopxx.pojo.XxMemberAttribute;
import com.service.MemberAttributeService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/memberAttribute")
public class MemberAttributeController {

	@Reference
	private MemberAttributeService memberAttributeService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<XxMemberAttribute> findAll(){			
		return memberAttributeService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return memberAttributeService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param memberAttribute
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody XxMemberAttribute memberAttribute){
		try {
			memberAttributeService.add(memberAttribute);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param memberAttribute
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody XxMemberAttribute memberAttribute){
		try {
			memberAttributeService.update(memberAttribute);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}	
	
	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOne")
	public XxMemberAttribute findOne(Long id){
		return memberAttributeService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			memberAttributeService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
		/**
	 * 查询+分页
	 * @param brand
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody XxMemberAttribute memberAttribute, int page, int rows  ){
		return memberAttributeService.findPage(memberAttribute, page, rows);		
	}
	
}
