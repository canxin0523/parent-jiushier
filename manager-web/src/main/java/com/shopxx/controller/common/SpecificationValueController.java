package com.shopxx.controller.common;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.shopxx.pojo.XxSpecificationValue;
import com.service.SpecificationValueService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/specificationValue")
public class SpecificationValueController {

	@Reference
	private SpecificationValueService specificationValueService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<XxSpecificationValue> findAll(){			
		return specificationValueService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return specificationValueService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param specificationValue
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody XxSpecificationValue specificationValue){
		try {
			specificationValueService.add(specificationValue);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param specificationValue
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody XxSpecificationValue specificationValue){
		try {
			specificationValueService.update(specificationValue);
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
	public XxSpecificationValue findOne(Long id){
		return specificationValueService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			specificationValueService.delete(ids);
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
	public PageResult search(@RequestBody XxSpecificationValue specificationValue, int page, int rows  ){
		return specificationValueService.findPage(specificationValue, page, rows);		
	}
	
}
