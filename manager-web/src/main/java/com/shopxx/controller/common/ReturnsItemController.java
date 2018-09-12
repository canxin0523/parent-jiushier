package com.shopxx.controller.common;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.shopxx.pojo.XxReturnsItem;
import com.service.ReturnsItemService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/returnsItem")
public class ReturnsItemController {

	@Reference
	private ReturnsItemService returnsItemService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<XxReturnsItem> findAll(){			
		return returnsItemService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return returnsItemService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param returnsItem
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody XxReturnsItem returnsItem){
		try {
			returnsItemService.add(returnsItem);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param returnsItem
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody XxReturnsItem returnsItem){
		try {
			returnsItemService.update(returnsItem);
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
	public XxReturnsItem findOne(Long id){
		return returnsItemService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			returnsItemService.delete(ids);
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
	public PageResult search(@RequestBody XxReturnsItem returnsItem, int page, int rows  ){
		return returnsItemService.findPage(returnsItem, page, rows);		
	}
	
}
