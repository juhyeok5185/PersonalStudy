package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {
	@GetMapping("/") 
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	@GetMapping("/square")
	public ModelAndView square() {
		return new ModelAndView("/square_input");
	}
	@PostMapping("/square")
	public ModelAndView square(@RequestParam Integer value) {
		Integer result = value * value;
		return new ModelAndView("/square_result").addObject("result", result);
	}
}
