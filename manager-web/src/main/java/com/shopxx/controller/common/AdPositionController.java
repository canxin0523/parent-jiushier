package com.shopxx.controller.common;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.shopxx.pojo.XxAdPosition;
import com.service.AdPositionService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/adPosition")
public class AdPositionController {

	@Reference
	private AdPositionService adPositionService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<XxAdPosition> findAll(){			
		return adPositionService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){	
		PageResult findPage = adPositionService.findPage(page, rows);
		return findPage;
	}
	
	/**
	 * 增加
	 * @param adPosition
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody XxAdPosition adPosition){
		try {
			adPositionService.add(adPosition);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param adPosition
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody XxAdPosition adPosition){
		try {
			adPositionService.update(adPosition);
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
	public XxAdPosition findOne(Long id){
		return adPositionService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			adPositionService.delete(ids);
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
	public PageResult search(@RequestBody XxAdPosition adPosition, int page, int rows  ){
		return adPositionService.findPage(adPosition, page, rows);		
	}
	
}
