package com.example.demo.dao;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.example.demo.entity.Todo;

//스프링이 객체를 생성하는 어노테이션
@Component
public class TodoDao {
	private List<Todo> todos = new ArrayList<>(); 
	private int no = 1;
	public int getNewNo() {
		return no++;
	}
	public int save(Todo todo) {
		todos.add(todo);
		return 1;
	}
	public List<Todo> findAll(){
		return todos;
	}
}