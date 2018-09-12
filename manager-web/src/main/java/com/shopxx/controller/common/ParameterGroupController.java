package com.shopxx.controller.common;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.shopxx.pojo.XxParameterGroup;
import com.service.ParameterGroupService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/parameterGroup")
public class ParameterGroupController {

	@Reference
	private ParameterGroupService parameterGroupService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<XxParameterGroup> findAll(){			
		return parameterGroupService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return parameterGroupService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param parameterGroup
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody XxParameterGroup parameterGroup){
		try {
			parameterGroupService.add(parameterGroup);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param parameterGroup
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody XxParameterGroup parameterGroup){
		try {
			parameterGroupService.update(parameterGroup);
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
	public XxParameterGroup findOne(Long id){
		return parameterGroupService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			parameterGroupService.delete(ids);
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
	public PageResult search(@RequestBody XxParameterGroup parameterGroup, int page, int rows  ){
		return parameterGroupService.findPage(parameterGroup, page, rows);		
	}
	
}
