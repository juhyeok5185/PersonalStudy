package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.entity.Todo;

@Component
public class TodoDao {
	private List<Todo> list = new ArrayList<>();
	private Integer no = 1;
	
	public int intGetNew() {
		return no++;
	}
	
	public int save(Todo todo) {
		list.add(todo);
		return 1;
	}
	
	public List<Todo> findAll(){
		return list;
	}
}
