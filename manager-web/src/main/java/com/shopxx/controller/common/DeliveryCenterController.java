package com.shopxx.controller.common;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.shopxx.pojo.XxDeliveryCenter;
import com.service.DeliveryCenterService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/deliveryCenter")
public class DeliveryCenterController {

	@Reference
	private DeliveryCenterService deliveryCenterService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<XxDeliveryCenter> findAll(){			
		return deliveryCenterService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return deliveryCenterService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param deliveryCenter
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody XxDeliveryCenter deliveryCenter){
		try {
			deliveryCenterService.add(deliveryCenter);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param deliveryCenter
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody XxDeliveryCenter deliveryCenter){
		try {
			deliveryCenterService.update(deliveryCenter);
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
	public XxDeliveryCenter findOne(Long id){
		return deliveryCenterService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			deliveryCenterService.delete(ids);
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
	public PageResult search(@RequestBody XxDeliveryCenter deliveryCenter, int page, int rows  ){
		return deliveryCenterService.findPage(deliveryCenter, page, rows);		
	}
	
}
