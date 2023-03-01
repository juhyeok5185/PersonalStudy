package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NameController {
	
	@GetMapping("/write")
	public ModelAndView start() {
		return new ModelAndView("write");
	}
	
	@PostMapping("/write")
	public ModelAndView MVCinsert(@RequestParam String mvcname) {
		System.out.println(mvcname);
		return new ModelAndView("read");
	}
	
	 @PostMapping("/restwrite")
	  public ResponseEntity<String> writeRest(@RequestParam String restname) {
	    System.out.println(restname);
	    return ResponseEntity.ok(restname);
	  }
}
