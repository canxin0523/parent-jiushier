package com.shopxx.controller.common;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.shopxx.pojo.XxFriendLink;
import com.service.FriendLinkService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/friendLink")
public class FriendLinkController {

	@Reference
	private FriendLinkService friendLinkService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<XxFriendLink> findAll(){			
		return friendLinkService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return friendLinkService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param friendLink
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody XxFriendLink friendLink){
		try {
			friendLinkService.add(friendLink);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param friendLink
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody XxFriendLink friendLink){
		try {
			friendLinkService.update(friendLink);
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
	public XxFriendLink findOne(Long id){
		return friendLinkService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			friendLinkService.delete(ids);
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
	public PageResult search(@RequestBody XxFriendLink friendLink, int page, int rows  ){
		return friendLinkService.findPage(friendLink, page, rows);		
	}
	
}
