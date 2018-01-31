package com.atguigu.crowdfunding.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.crowdfunding.bean.Member;
import com.atguigu.crowdfunding.bean.User;
import com.atguigu.crowdfunding.service.MemeberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private MemeberService memberService;
	
	
	@RequestMapping("/add")
	public String add() {
		
		return "add";
	}
	@ResponseBody
	@RequestMapping("/index/{id}")
	public Object index(@PathVariable("id")Integer id) {
		User user = memberService.queryById(id);
		return user;
	}
	
	@RequestMapping("/insert")
	public Object insert( Member member ) {
		memberService.insertMember(member);
		return new HashMap();
	}
}
