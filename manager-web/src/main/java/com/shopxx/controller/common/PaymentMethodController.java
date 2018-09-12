package com.shopxx.controller.common;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.shopxx.pojo.XxPaymentMethod;
import com.service.PaymentMethodService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/paymentMethod")
public class PaymentMethodController {

	@Reference
	private PaymentMethodService paymentMethodService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<XxPaymentMethod> findAll(){			
		return paymentMethodService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return paymentMethodService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param paymentMethod
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody XxPaymentMethod paymentMethod){
		try {
			paymentMethodService.add(paymentMethod);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param paymentMethod
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody XxPaymentMethod paymentMethod){
		try {
			paymentMethodService.update(paymentMethod);
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
	public XxPaymentMethod findOne(Long id){
		return paymentMethodService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			paymentMethodService.delete(ids);
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
	public PageResult search(@RequestBody XxPaymentMethod paymentMethod, int page, int rows  ){
		return paymentMethodService.findPage(paymentMethod, page, rows);		
	}
	
}
