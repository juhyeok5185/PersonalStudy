package com.example.demo.controller;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.TodoDao;
import com.example.demo.entity.Todo;

@Controller
public class TodoController {
	@Autowired
	private TodoDao dao;
	
	@GetMapping("/find_all")
	public ModelAndView findAll() {
		List<Todo> todos = dao.findAll();
		return new ModelAndView("find_all").addObject("todos", todos);
	}
	
	@PutMapping("/api/todos")
	public ResponseEntity<List<Todo>> change(@RequestParam Integer no){
		dao.change(no);
		return ResponseEntity.ok(dao.findAll());
	}
	
	@PostMapping("/api/todos")
	public ResponseEntity<List<Todo>> add(@RequestParam String job){
		dao.save(job);
		return ResponseEntity.ok(dao.findAll());
	}
	
	@DeleteMapping("/api/todos")
	public ResponseEntity<List<Todo>> delete(@RequestParam Integer no){
		dao.delete(no);
		return ResponseEntity.ok(dao.findAll());
	}
}
