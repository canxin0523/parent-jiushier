package com.shopxx.controller.common;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.shopxx.pojo.XxProductNotify;
import com.service.ProductNotifyService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/productNotify")
public class ProductNotifyController {

	@Reference
	private ProductNotifyService productNotifyService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<XxProductNotify> findAll(){			
		return productNotifyService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return productNotifyService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param productNotify
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody XxProductNotify productNotify){
		try {
			productNotifyService.add(productNotify);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param productNotify
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody XxProductNotify productNotify){
		try {
			productNotifyService.update(productNotify);
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
	public XxProductNotify findOne(Long id){
		return productNotifyService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			productNotifyService.delete(ids);
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
	public PageResult search(@RequestBody XxProductNotify productNotify, int page, int rows  ){
		return productNotifyService.findPage(productNotify, page, rows);		
	}
	
}
