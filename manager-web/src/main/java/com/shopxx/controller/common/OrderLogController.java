package com.shopxx.controller.common;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.shopxx.pojo.XxOrderLog;
import com.service.OrderLogService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/orderLog")
public class OrderLogController {

	@Reference
	private OrderLogService orderLogService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<XxOrderLog> findAll(){			
		return orderLogService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return orderLogService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param orderLog
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody XxOrderLog orderLog){
		try {
			orderLogService.add(orderLog);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param orderLog
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody XxOrderLog orderLog){
		try {
			orderLogService.update(orderLog);
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
	public XxOrderLog findOne(Long id){
		return orderLogService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			orderLogService.delete(ids);
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
	public PageResult search(@RequestBody XxOrderLog orderLog, int page, int rows  ){
		return orderLogService.findPage(orderLog, page, rows);		
	}
	
}
