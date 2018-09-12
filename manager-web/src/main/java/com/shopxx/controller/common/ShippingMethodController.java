package com.shopxx.controller.common;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.shopxx.pojo.XxShippingMethod;
import com.service.ShippingMethodService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/shippingMethod")
public class ShippingMethodController {

	@Reference
	private ShippingMethodService shippingMethodService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<XxShippingMethod> findAll(){			
		return shippingMethodService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return shippingMethodService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param shippingMethod
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody XxShippingMethod shippingMethod){
		try {
			shippingMethodService.add(shippingMethod);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param shippingMethod
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody XxShippingMethod shippingMethod){
		try {
			shippingMethodService.update(shippingMethod);
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
	public XxShippingMethod findOne(Long id){
		return shippingMethodService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			shippingMethodService.delete(ids);
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
	public PageResult search(@RequestBody XxShippingMethod shippingMethod, int page, int rows  ){
		return shippingMethodService.findPage(shippingMethod, page, rows);		
	}
	
}
