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
	TodoService todoService;

	@GetMapping("/list")
	public ResponseEntity<List<Todo>> list() {
		List<Todo> list = todoService.findAll();
		return ResponseEntity.ok(list);
	}

	@PostMapping("/save")
	public ResponseEntity<Void> save(@RequestParam String job){
		todoService.save(job);
		return ResponseEntity.ok(null);
	}
}
