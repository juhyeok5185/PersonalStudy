package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.dao.BoardDao;

@SpringBootTest
class BoardApplicationTests {
	@Autowired
	BoardDao boardDao;
	
	//@Test
	public void insert() {
		boardDao.insert("바보" , "똥개야");
		System.out.println(boardDao.findAll());
	}
	
	//@Test
	public void findOne() {
		System.out.println(boardDao.findOne(1));
	}
	
	//@Test
	public void update() {
		boardDao.update("천잰대?","구웃", 1);
		System.out.println(boardDao.findAll());	
	}
	
	@Test
	public void delete() {
		boardDao.delete(1);
		System.out.println(boardDao.findAll());	
	}

}
