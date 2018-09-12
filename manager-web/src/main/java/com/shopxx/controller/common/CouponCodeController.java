package com.shopxx.controller.common;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.shopxx.pojo.XxCouponCode;
import com.service.CouponCodeService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/couponCode")
public class CouponCodeController {

	@Reference
	private CouponCodeService couponCodeService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<XxCouponCode> findAll(){			
		return couponCodeService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return couponCodeService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param couponCode
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody XxCouponCode couponCode){
		try {
			couponCodeService.add(couponCode);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param couponCode
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody XxCouponCode couponCode){
		try {
			couponCodeService.update(couponCode);
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
	public XxCouponCode findOne(Long id){
		return couponCodeService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			couponCodeService.delete(ids);
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
	public PageResult search(@RequestBody XxCouponCode couponCode, int page, int rows  ){
		return couponCodeService.findPage(couponCode, page, rows);		
	}
	
}
