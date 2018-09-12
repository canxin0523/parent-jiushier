package com.shopxx.controller.common;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.shopxx.pojo.XxArticleCategory;
import com.service.ArticleCategoryService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/articleCategory")
public class ArticleCategoryController {

	@Reference
	private ArticleCategoryService articleCategoryService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<XxArticleCategory> findAll(){			
		return articleCategoryService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return articleCategoryService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param articleCategory
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody XxArticleCategory articleCategory){
		try {
			articleCategoryService.add(articleCategory);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param articleCategory
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody XxArticleCategory articleCategory){
		try {
			articleCategoryService.update(articleCategory);
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
	public XxArticleCategory findOne(Long id){
		return articleCategoryService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			articleCategoryService.delete(ids);
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
	public PageResult search(@RequestBody XxArticleCategory articleCategory, int page, int rows  ){
		return articleCategoryService.findPage(articleCategory, page, rows);		
	}
	
}
