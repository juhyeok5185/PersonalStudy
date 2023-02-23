package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dao.BoardDao;
import com.example.demo.entity.Board;

@Controller
public class BoardController {
	@Autowired
	BoardDao dao;
	
	@GetMapping("/findAll")
	public ResponseEntity<List<Board>> findAll(){
		List<Board> boards = dao.findAll();
		return ResponseEntity.ok(boards);
	}
	
	@PostMapping("/insert")
	public ResponseEntity<String> insert(@RequestParam String title , @RequestParam String content){
		dao.insert(title , content);
		return ResponseEntity.ok("작업 추가");
	}
	
	
	
}
