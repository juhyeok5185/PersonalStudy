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
	@Insert("insert into todo values(todo_seq.nextval, #{job} , sysdate, 0")
	public Integer save(String job);

	@Select("select no,job,regday,is_finish isFinish from todo")
	public List<Todo> findAll();

	@Select("select no,job,regday,is_finish isFinish from todo where no=#{no}")
	public Todo findByNo();

	@Update("update todo set is_finish=mod(is_finish+1,2) where no = #{no}")
	public Integer change(Integer no);

	@Delete("delete from todo where no=#{no}")
	public Integer delete(Integer no);
}
