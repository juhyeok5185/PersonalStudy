package com.example.demo.todo.service;

import java.time.LocalDate;
import java.util.List;

import com.example.demo.todo.dao.TodoDao;
import com.example.demo.todo.entity.Todo;

public class TodoService {
	private static TodoService service = new TodoService();
	TodoDao todoDao = TodoDao.getInstance();
	private TodoService() {
	}
	
	public static TodoService getInstance() {
		return service;
	}
	
	public void write(Todo todo) {
		int no = todoDao.addNo();
		todo.init(no);
		todoDao.write(todo);
	}
	
	public List<Todo> listAll() {
		return todoDao.listAll();
	}
	
	public Todo read(Integer no) {
		return todoDao.read(no);
	}

	public boolean toggleFinish(Integer no) {
		return todoDao.toggleFinish(no) == 1;
	}

	public boolean delete(Integer no) {
		return todoDao.delete(no) == 1;
	}
}
