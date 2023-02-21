package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

//Slf4j는 로깅 표준 구현체로 스프링은 logback을 사용
//facade 패턴

@Slf4j
@Controller
public class LogBackController {
	
	@GetMapping("/log")
	public String loggerTest() {
		log.trace("trace....");
		log.debug("debug");
		log.info("info");
		log.warn("warning");
		log.error("error");
		return null;
	}
}
