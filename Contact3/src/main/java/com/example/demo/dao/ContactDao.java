package com.example.demo.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import com.example.demo.entity.Contact;

@Mapper
public interface ContactDao {
	@SelectKey(statement = "select contact_seq.nextval from dual", resultType = Integer.class ,keyProperty = "no", before=true)
	@Insert("insert into contact values(#{no},#{name},#{address},#{tel},#{regday},#{photo})")
	public void save(Contact contact);
	
	@Select("select * from contact where no=#{no}")
	public Contact select(Integer no);
}
