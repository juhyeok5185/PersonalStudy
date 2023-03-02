package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MemberDao {

	@Select("select count(*) from member where username=#{username} and rownum=1")
	public Boolean existsByUsername(String username);

}
