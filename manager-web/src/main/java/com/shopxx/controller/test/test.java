package com.shopxx.controller.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.service.TestService;
import com.shopxx.pojo.XxAd;

@RestController
@RequestMapping("/jump")
public class test {
//	@Reference
//	private TestService testservice;
//	@RequestMapping("/findOne")
//	public XxAd findOne(Long id){
//		XxAd  xx=testservice.findOne(id);
//		System.out.println(xx.getId());
//		System.out.println(xx.getPath());
//		return null;
//	}
	
	
	/*
	 * 广告位
	 * */
	@RequestMapping("adposition")
	public String adposition() {
		return "admin/adPosition";
	}
	/*
	 * 登录
	 * */
	@RequestMapping("login")
	public String login() {
		return "login";
	}
}
