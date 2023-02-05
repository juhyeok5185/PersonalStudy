package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.entity.Todo;

public class TodoDao {
	private List<Todo> list = new ArrayList();
	Integer no = 1;
	private static TodoDao todoDao = new TodoDao();
	
	
	private TodoDao() {
	}
		
	public static TodoDao getInstance() {
		return todoDao;
	}

	public void write(Todo todo) {
		list.add(todo);
	}

	public int addNo() {
		return no++;
	}
	
	public List<Todo> getList(){
		return list;
	}

	public Todo read(int no) {
		for(Todo todo : list) {
			if(todo.getNo() == no) {
				return todo;
			}
		}
		return null;
	}

	public void delete(int no) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getNo()==no) {
				list.remove(i);
			}
		}
	}
}
