package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.BoardDao;

@SpringBootTest
class Board1ApplicationTests {

	@Autowired
	BoardDao boardDao;
	
	@Test
	public void findAll() {
		System.out.println(boardDao.findAll());
	}

	@Test
	public void insert() {
		boardDao.insert("안녕하세요", "등업부탁드려요");
		System.out.println(boardDao.findAll());
	}
	
	@Test
	public void findOne() {
		System.out.println(boardDao.findOne(3));
	}
	
	@Test
	public void update() {
		boardDao.update("누구십니까", "가십시오", 3);
		System.out.println(boardDao.findAll());
	}
	
	@Test
	public void delete() {
		boardDao.delete(3);
		System.out.println(boardDao.findAll());
	}
}
