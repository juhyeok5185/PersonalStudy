package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.service.MemberService;

import jakarta.servlet.http.HttpSession;

@Controller
public class MemberController {
	@Autowired
	private MemberService service;
	// 회원가입(아이디 중복 확인 , 이메일 중복 확인, 가입)
	// 찾기(아이디 찾기, 임시비밀번호 발급)
	// 로그인
	// 내정보보기 (비밀번호 확인 , 내정보보기 , 정보변경 , 회원탈퇴)
	@GetMapping("/member/join")
	public void join() {}
	
	@GetMapping("/member/check/username")
	public ResponseEntity<Void> checkUsername(String username){
		Boolean result = service.checkUsername(username);
		return result? ResponseEntity.ok(null) : ResponseEntity.status(HttpStatus.CONFLICT).body(null);
	}
	
	@GetMapping("/member/login")
	public void login() {
		
	}
	
	@PostMapping("/member/login")
	public String login(String username, String password, HttpSession session) {
		//아이디가 spring 비밀번호 1234면 로그인성공
		//HTTP는 메모리 기능이 없다.
		//사진을 10장포함하는 게시판글을 읽으면 -> 글 요청 + 사진요청으로 11개의 요청이 날라간다.
		//이때 서버는 11개의 요청이 같은 사용자로 부터 왔다는 사실을 모른다.
		//HTTP의 메모리 기능을 추가하는 객체가 HttpSession이다.
		//httpSession은 사용자 마다 주어지는 서버측 저장공간
		if(username.equals("spring") && password.equals("1234")) {
			session.setAttribute("username", username);
		}
		return "redirect:/";
	}
	
	@PostMapping("/member/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
}
