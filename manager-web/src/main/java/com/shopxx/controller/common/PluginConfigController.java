package com.shopxx.controller.common;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.shopxx.pojo.XxPluginConfig;
import com.service.PluginConfigService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/pluginConfig")
public class PluginConfigController {

	@Reference
	private PluginConfigService pluginConfigService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<XxPluginConfig> findAll(){			
		return pluginConfigService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return pluginConfigService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param pluginConfig
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody XxPluginConfig pluginConfig){
		try {
			pluginConfigService.add(pluginConfig);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param pluginConfig
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody XxPluginConfig pluginConfig){
		try {
			pluginConfigService.update(pluginConfig);
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
	public XxPluginConfig findOne(Long id){
		return pluginConfigService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			pluginConfigService.delete(ids);
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
	public PageResult search(@RequestBody XxPluginConfig pluginConfig, int page, int rows  ){
		return pluginConfigService.findPage(pluginConfig, page, rows);		
	}
	
}
