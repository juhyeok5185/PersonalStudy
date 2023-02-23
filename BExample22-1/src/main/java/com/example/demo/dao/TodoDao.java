package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.entity.Todo;

@Mapper
public interface TodoDao {
	@Select("select no, job, regday, is_finish as isFinish from todo")
	public List<Todo> findAll();
	
	@Insert("insert into todo values(todo_seq.nextval,#{job},sysdate,0)")
	public int insert(String job);
	
	//id를 기본키를 말함
	@Select("select no, job, regday, is_finish isFinish from todo where no=#{no}")
	public Todo findById(Integer no);

	//행이 몇개나 변경되었나 확인하는게 int
	@Update("update todo set is_finish=mod(is_finish+1,2) where no=#{no}")
	public int update(Integer no);
	
	@Delete("delete from todo where no=#{no}")
	public int delete(Integer no);
}
