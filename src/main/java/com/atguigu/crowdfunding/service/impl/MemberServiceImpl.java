package com.atguigu.crowdfunding.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.atguigu.crowdfunding.bean.Member;
import com.atguigu.crowdfunding.bean.User;
import com.atguigu.crowdfunding.dao.MemberDao;
import com.atguigu.crowdfunding.service.MemeberService;

@Service
@Transactional(readOnly=true)
public class MemberServiceImpl implements MemeberService {

	@Autowired
	private  MemberDao memberDao;
	
	public User queryById(Integer id) {
		return memberDao.queryById(id);
	}

	@Transactional
	public int insertMember(Member member) {
		return memberDao.insertMember(member);
	}
}
