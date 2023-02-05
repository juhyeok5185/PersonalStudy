package com.example.demo.service;

import com.example.demo.dao.TodoDao;
import com.example.demo.entity.Todo;

public class TodoService {
	private static TodoService service = new TodoService();

	private TodoService() {
	}

	public static TodoService getInstance() {
		return service;
	}

	private TodoDao todoDao = TodoDao.getInstance();

	public void write(Todo todo) {
		int no = todoDao.addNo();
		todo.init(no);
		todoDao.write(todo);
	}

	public Todo read(int no) {
		return todoDao.read(no);
	}

	public void delete(int no) {
		todoDao.delete(no);
	}
}
