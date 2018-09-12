package com.shopxx.controller.common;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.shopxx.pojo.XxProductCategory;
import com.service.ProductCategoryService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/productCategory")
public class ProductCategoryController {

	@Reference
	private ProductCategoryService productCategoryService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<XxProductCategory> findAll(){			
		return productCategoryService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return productCategoryService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param productCategory
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody XxProductCategory productCategory){
		try {
			productCategoryService.add(productCategory);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param productCategory
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody XxProductCategory productCategory){
		try {
			productCategoryService.update(productCategory);
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
	public XxProductCategory findOne(Long id){
		return productCategoryService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			productCategoryService.delete(ids);
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
	public PageResult search(@RequestBody XxProductCategory productCategory, int page, int rows  ){
		return productCategoryService.findPage(productCategory, page, rows);		
	}
	
}
