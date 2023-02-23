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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dao.BoardDao;
import com.example.demo.entity.Board;

@Controller
public class BoardController {
	@Autowired
	BoardDao boardDao;

	@GetMapping("/findAll")
	public ResponseEntity<List<Board>> findAll() {
		List<Board> list = boardDao.findAll();
		return ResponseEntity.ok(list);
	}

	@GetMapping("/findOne")
	public ResponseEntity<?> findOne(@RequestParam Integer no) {
		Board board = boardDao.findOne(no);
		if (board != null)
			return ResponseEntity.ok(board);
		else
			return ResponseEntity.status(HttpStatus.CONFLICT).body("검색 실패");

	}

	@PostMapping("/insert")
	public ResponseEntity<?> insert(@RequestParam String title, @RequestParam String content) {
		boardDao.insert(title, content);
		return ResponseEntity.ok("작업추가");
	}

	@PatchMapping("/update")
	public ResponseEntity<?> update(@RequestParam String title, @RequestParam String content,
			@RequestParam Integer no) {
		boardDao.update(title, content, no);
		return ResponseEntity.ok("작업추가");
	}

	@DeleteMapping("/delete")
	public ResponseEntity<String> delete(@RequestParam Integer no) {
		int result = boardDao.delete(no);
		if (result == 1)
			return ResponseEntity.status(HttpStatus.OK).body("삭제 성공");
		else
			return ResponseEntity.status(HttpStatus.CONFLICT).body("삭제 실패");

	}
}
