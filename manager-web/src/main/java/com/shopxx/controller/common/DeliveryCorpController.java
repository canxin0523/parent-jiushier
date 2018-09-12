package com.shopxx.controller.common;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.shopxx.pojo.XxDeliveryCorp;
import com.service.DeliveryCorpService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/deliveryCorp")
public class DeliveryCorpController {

	@Reference
	private DeliveryCorpService deliveryCorpService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<XxDeliveryCorp> findAll(){			
		return deliveryCorpService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return deliveryCorpService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param deliveryCorp
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody XxDeliveryCorp deliveryCorp){
		try {
			deliveryCorpService.add(deliveryCorp);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param deliveryCorp
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody XxDeliveryCorp deliveryCorp){
		try {
			deliveryCorpService.update(deliveryCorp);
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
	public XxDeliveryCorp findOne(Long id){
		return deliveryCorpService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			deliveryCorpService.delete(ids);
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
	public PageResult search(@RequestBody XxDeliveryCorp deliveryCorp, int page, int rows  ){
		return deliveryCorpService.findPage(deliveryCorp, page, rows);		
	}
	
}
