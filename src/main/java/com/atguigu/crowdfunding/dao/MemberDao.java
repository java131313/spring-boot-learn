package com.atguigu.crowdfunding.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.atguigu.crowdfunding.bean.Member;
import com.atguigu.crowdfunding.bean.User;

public interface MemberDao {
	@Select("select * from t_user where id = #{id}")
	public User queryById(Integer id);

	@Insert("insert into t_member (loginacct) values (#{loginacct})")
	public int insertMember(Member member);
}
