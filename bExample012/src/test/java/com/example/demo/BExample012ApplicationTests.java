package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
class BExample012ApplicationTests {
	@Autowired
	ObjectMapper x;
	ObjectMapper y;
	@Autowired
	ObjectMapper z;
	@Autowired
	MyDao myDao;
	
	@Test
	public void test1() {
		System.out.println(x==null); 
		System.out.println(y==null);
		System.out.println(z==null);
	}
	
	@Test
	public void test2() {
		System.out.println(x==z);
	}
	
	@Test
	public void print() {
		myDao.hello();
	}
	
}
