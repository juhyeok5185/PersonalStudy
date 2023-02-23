package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.TodoDao;
import com.example.demo.entity.Todo;

@SpringBootTest
class BExample221ApplicationTests {
	@Autowired
	private TodoDao dao;
	
	@Test
	public void test1() {
		System.out.println(dao!=null);
	}
	
	@Test
	public void insertAndSelectTest() {
		dao.insert("보바 대비 청소하기");
		System.out.println(dao.findAll());
		
	}
	
	@Test
	public void findById() {
		dao.findById(2);
		System.out.println();
	}
	
	@Transactional
	@Test
	public void updateTest() {
		//insert , update, delete를 수행하면 반드시 commit/rollback이 필요하다.
		dao.update(3);
		assertEquals(true , dao.findById(1).getIsFinish());
	}
	
	@Transactional
	@Test
	public void deleteTest() {
		dao.delete(1);
		assertNull(dao.findById(1));
	}
}
