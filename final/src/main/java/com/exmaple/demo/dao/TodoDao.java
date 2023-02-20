package com.exmaple.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.example.demo.entity.Todo;

public class TodoDao {
	public static List<Todo> todos = new ArrayList<>();
	
	static {
		todos.add(new Todo(1,"1번 작업", new Date(), false));
		todos.add(new Todo(2,"2번 작업", new Date(), false));
	}
	
	public static List<Todo> findAll() {
		return todos;
	}
	
}
