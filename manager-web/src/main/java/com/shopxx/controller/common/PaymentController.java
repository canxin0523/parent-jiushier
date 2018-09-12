package com.shopxx.controller.common;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.shopxx.pojo.XxPayment;
import com.service.PaymentService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {

	@Reference
	private PaymentService paymentService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<XxPayment> findAll(){			
		return paymentService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return paymentService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param payment
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody XxPayment payment){
		try {
			paymentService.add(payment);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param payment
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody XxPayment payment){
		try {
			paymentService.update(payment);
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
	public XxPayment findOne(Long id){
		return paymentService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			paymentService.delete(ids);
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
	public PageResult search(@RequestBody XxPayment payment, int page, int rows  ){
		return paymentService.findPage(payment, page, rows);		
	}
	
}
