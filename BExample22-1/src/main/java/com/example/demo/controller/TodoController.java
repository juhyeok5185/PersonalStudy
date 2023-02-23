package com.example.demo.controller;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.TodoDao;
import com.example.demo.entity.Todo;

@RestController
public class TodoController {
	@Autowired
	private TodoDao dao;
	
	@GetMapping("/find_all")
	public ResponseEntity<List<Todo>> findAll(){
		List<Todo> todos = dao.findAll();
		return ResponseEntity.ok(todos);
	}
	
	@PatchMapping("/update")
	public ResponseEntity<String> insert(@RequestParam Integer no){
		int result = dao.update(no);
		if(result == 1) {
			return ResponseEntity.status(HttpStatus.OK).body("병경 성공");
		}else {
			return ResponseEntity.status(HttpStatus.CONFLICT).body("변경 실패");
		}
	}
	
	@PostMapping("/insert")
	public ResponseEntity<String> insert (@RequestParam String job){
		dao.insert(job);
		return ResponseEntity.ok("작업추가");
	}
	
	@GetMapping("/find")
	public ResponseEntity<?> findById(@RequestParam Integer no){
		Todo todo = dao.findById(no);
		if(todo != null) {
			return ResponseEntity.ok(todo);
		} else {
			return ResponseEntity.status(HttpStatus.CONFLICT).body("검색 실패");
		}
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> delete(@RequestParam Integer no){
		int result = dao.delete(no);
		if(result == 1) {
			return ResponseEntity.status(HttpStatus.OK).body("변경 성공");
		}else {
			//상태코드(ENUM)이다.
			return ResponseEntity.status(HttpStatus.CONFLICT).body("삭제 실패");
		}
	}
}