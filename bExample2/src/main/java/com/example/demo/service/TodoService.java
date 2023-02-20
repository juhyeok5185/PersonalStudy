package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.TodoDao;
import com.example.demo.entity.Todo;

// todoService도 스프링으로 실행해야 autowired가 먹는다.
@Component
public class TodoService {
	@Autowired
	private TodoDao dao;
	
	public void save(String job) {
		int no = dao.getNewNo();
		Todo todo = new Todo(no,job,LocalDate.now(),false);
		dao.save(todo);
	}
	
	public List<Todo> findAll(){
		return dao.findAll();
	}
	
}