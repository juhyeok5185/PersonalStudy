package com.example.demo.controller;

import java.util.List;

import javax.swing.text.View;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.TodoDao;
import com.example.demo.entity.Todo;

@Controller
public class TodoController {
	@Autowired
	private TodoDao todoDao;
	
	@GetMapping("/start")
	public ModelAndView start() {
		return new ModelAndView("index");
	}
	
	
}
