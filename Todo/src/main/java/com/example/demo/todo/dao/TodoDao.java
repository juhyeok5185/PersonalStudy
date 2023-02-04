package com.example.demo.todo.dao;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.todo.entity.Todo;

public class TodoDao {
	private static TodoDao todoDao = new TodoDao();
	private List<Todo> list = new ArrayList<>();
	private Integer no = 1;
	
	private TodoDao() {
	}
		
	public static TodoDao getInstance() {
		return todoDao;
	}

	public int addNo() {		
		return no++;
	}

	public void write(Todo todo) {
		list.add(todo);
	}

	public List<Todo> listAll() {
		return list;
	}

	public Todo read(Integer no) {
		for(Todo todo:list) {
			if(todo.getNo()==no) {
				return todo;
			}
		}
		return null;
	}

	public int toggleFinish(int no) {
		for(Todo todo:list) {
			if(todo.getNo()==no) {
				todo.toggleFinish();
				return 1;
			}
		}
		return 0;
	}

	public int delete(Integer no) {
		for(int i = 0; i < list.size(); i++ ) {
			if(list.get(i).getNo() == no) {
				list.remove(i);
				return 1;
			}
		}
		return 0;
	}

	
}
