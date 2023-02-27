package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.dao.ContactDao;

@SpringBootTest
class Contact5ApplicationTests {
	@Autowired
	private ContactDao dao;
	
	@Test
	void contextLoads() {
		dao.findAll();
		dao.findById(11);
	}

}
