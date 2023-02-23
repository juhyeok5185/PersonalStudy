package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.entity.Board;

@Mapper
public interface BoardDao {
	@Select("select * from board")
	public List<Board> findAll();
	
	@Select("select * from board where no=${no}")
	public Board findOne(Integer no);
	
	@Insert("insert into board values(board_seq.nextval , #{title} , #{content}, sysdate)")
	public int insert(String title, String content);
	
	@Update("update board set title=#{title},content=#{content} where no=#{no}")
	public int update(String title, String content, Integer no);
	
	@Delete("delete from board where no=#{no}")
	public int delete(Integer no);
}
