package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Todo;
import com.example.demo.service.TodoService;

@Controller
public class TodoController {
	@Autowired
	private TodoService service;
	
	//Rest로 응답하려면 ResponseEntity라는 포장 상자에 객체를 담으면 된다.
	@GetMapping("/list")
	public ResponseEntity<List<Todo>> list() {
		List<Todo> todos = service.findAll();
		return ResponseEntity.ok(todos);
	}
	
	@PostMapping("/save")
	public ResponseEntity<Void> save(@RequestParam String job){
		service.save(job);
		return ResponseEntity.ok(null);
	}
}
