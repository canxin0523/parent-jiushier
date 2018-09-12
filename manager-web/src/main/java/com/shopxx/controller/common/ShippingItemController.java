package com.shopxx.controller.common;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.shopxx.pojo.XxShippingItem;
import com.service.ShippingItemService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/shippingItem")
public class ShippingItemController {

	@Reference
	private ShippingItemService shippingItemService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<XxShippingItem> findAll(){			
		return shippingItemService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return shippingItemService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param shippingItem
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody XxShippingItem shippingItem){
		try {
			shippingItemService.add(shippingItem);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param shippingItem
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody XxShippingItem shippingItem){
		try {
			shippingItemService.update(shippingItem);
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
	public XxShippingItem findOne(Long id){
		return shippingItemService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			shippingItemService.delete(ids);
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
	public PageResult search(@RequestBody XxShippingItem shippingItem, int page, int rows  ){
		return shippingItemService.findPage(shippingItem, page, rows);		
	}
	
}
