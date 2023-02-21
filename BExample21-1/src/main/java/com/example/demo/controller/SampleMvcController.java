package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

//@ComponentScan이 특정 Package주소를 지정하고 하위 Component들을 찾아준다.
@Controller
public class SampleMvcController {
	
	@GetMapping("/index")
	public String index() {
		//스프링 부트의 뷰 기술은 thymeleaf여서 html을 찾
		return "index";
	}
	
	@GetMapping("/insa")
	public String insa() {
		return "insa";
	}
	
	@GetMapping("/square")
	public ModelAndView square(@RequestParam Integer value) {
//		RequestDispatcher rd = req.getRequestDispatcher('/square.jsp');
//		req.setAttribute("result",result)
//		rd.forward(req, resp);
		int result = value * value;
		return new ModelAndView("square").addObject("result", result);
	}
}
//get으로 접근하면 write.jsp를 보여주고
//post로 접근하면 글쓰기 처리한 다음 다른 곳으로 이동한다.