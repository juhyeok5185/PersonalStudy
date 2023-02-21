package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.TodoDao;
import com.example.demo.entity.Todo;

@Component
public class TodoService {
	@Autowired
	TodoDao todoDao;
	
	public void save(String job) {
		int no = todoDao.intGetNew();
		Todo todo = new Todo(no, job, LocalDate.now(), false);
		todoDao.save(todo);
	}
	
	public List<Todo> findAll() {
		return todoDao.findAll();
	}
}
