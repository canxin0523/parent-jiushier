package com.shopxx.controller.common;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.shopxx.pojo.XxDeliveryTemplate;
import com.service.DeliveryTemplateService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/deliveryTemplate")
public class DeliveryTemplateController {

	@Reference
	private DeliveryTemplateService deliveryTemplateService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<XxDeliveryTemplate> findAll(){			
		return deliveryTemplateService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return deliveryTemplateService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param deliveryTemplate
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody XxDeliveryTemplate deliveryTemplate){
		try {
			deliveryTemplateService.add(deliveryTemplate);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param deliveryTemplate
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody XxDeliveryTemplate deliveryTemplate){
		try {
			deliveryTemplateService.update(deliveryTemplate);
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
	public XxDeliveryTemplate findOne(Long id){
		return deliveryTemplateService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			deliveryTemplateService.delete(ids);
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
	public PageResult search(@RequestBody XxDeliveryTemplate deliveryTemplate, int page, int rows  ){
		return deliveryTemplateService.findPage(deliveryTemplate, page, rows);		
	}
	
}
