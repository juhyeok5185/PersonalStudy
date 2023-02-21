package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class bController {
	@GetMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	@GetMapping("/add")
	public ModelAndView add() {
		return new ModelAndView("/input");
	}
	@PostMapping("/add")
	public ModelAndView add(@RequestParam Integer value) {
		Integer result = value +value;
		return new ModelAndView("/result").addObject("result" , result);
	}
}
