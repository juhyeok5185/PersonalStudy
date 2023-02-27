package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Contact;
import com.example.demo.service.ContactService;

@Controller
public class ContactController {
	@Autowired
	private ContactService service;
	
	@GetMapping("/list")
	public ModelAndView findAll() {
		return new ModelAndView("list").addObject("list" , service.findAll());
	}
	
	@GetMapping("/read")
	public ModelAndView findById(@RequestParam Integer no) {
		return new ModelAndView("read").addObject("contact" , service.findById(no));
	}
	
	@GetMapping("/write")
	public void save() {
	}
	
	@PostMapping("/write")
	public ModelAndView save(@ModelAttribute Contact contact) {
		Contact result = service.save(contact);
		return new ModelAndView("redirect:/read?no=" + result.getNo());
	}
	@PostMapping("/update")
	public ModelAndView update(Contact contact) {
		service.update(contact);
		return new ModelAndView("redirect:/read?no=" + contact.getNo());

	}
	@PostMapping("/delete")
	public ModelAndView delete(@RequestParam Integer no) {
		service.delete(no);
		return new ModelAndView("redirect:/list");
	}
}
