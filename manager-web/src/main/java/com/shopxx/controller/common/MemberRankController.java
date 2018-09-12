package com.shopxx.controller.common;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.shopxx.pojo.XxMemberRank;
import com.service.MemberRankService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/memberRank")
public class MemberRankController {

	@Reference
	private MemberRankService memberRankService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<XxMemberRank> findAll(){			
		return memberRankService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return memberRankService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param memberRank
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody XxMemberRank memberRank){
		try {
			memberRankService.add(memberRank);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param memberRank
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody XxMemberRank memberRank){
		try {
			memberRankService.update(memberRank);
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
	public XxMemberRank findOne(Long id){
		return memberRankService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			memberRankService.delete(ids);
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
	public PageResult search(@RequestBody XxMemberRank memberRank, int page, int rows  ){
		return memberRankService.findPage(memberRank, page, rows);		
	}
	
}
