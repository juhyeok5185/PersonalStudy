package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
}
