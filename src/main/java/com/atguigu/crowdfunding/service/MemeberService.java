package com.atguigu.crowdfunding.service;

import com.atguigu.crowdfunding.bean.Member;
import com.atguigu.crowdfunding.bean.User;

public interface MemeberService {
	public User queryById(Integer id) ;

	
	public int insertMember(Member member) ;
}
