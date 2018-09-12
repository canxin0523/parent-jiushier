package com.shopxx.controller.common;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.shopxx.pojo.XxGiftItem;
import com.service.GiftItemService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/giftItem")
public class GiftItemController {

	@Reference
	private GiftItemService giftItemService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<XxGiftItem> findAll(){			
		return giftItemService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return giftItemService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param giftItem
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody XxGiftItem giftItem){
		try {
			giftItemService.add(giftItem);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param giftItem
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody XxGiftItem giftItem){
		try {
			giftItemService.update(giftItem);
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
	public XxGiftItem findOne(Long id){
		return giftItemService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			giftItemService.delete(ids);
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
	public PageResult search(@RequestBody XxGiftItem giftItem, int page, int rows  ){
		return giftItemService.findPage(giftItem, page, rows);		
	}
	
}
