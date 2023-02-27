package com.example.demo.controller;

import java.io.*;
import java.nio.file.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

import com.example.demo.dto.*;
import com.example.demo.entity.*;
import com.example.demo.service.*;

@Controller
public class ContactController {
	@Autowired
	private ContactService service;
	
	// 연락처 추가 화면 보여주기
	@GetMapping("/join")
	public ModelAndView join() {
		return new ModelAndView("join");
	}
	
	// photo을 포함한 연락처 추가
	@PostMapping("/join")
	public ModelAndView join(@ModelAttribute ContactCreateDto dto) {
		Contact contact = service.join(dto);
		return new ModelAndView("redirect:/read?no=" + contact.getNo());
	}
	
	// 추가한 연락처 읽기
	@GetMapping("/read")
	public ModelAndView read(@RequestParam Integer no) {
		ContactReadDto dto = service.findByNo(no);
		return new ModelAndView("read").addObject("contact", dto);
	}
	
	
	// 1. 사진을 읽는 주소 : http://localhost:8081/photo?photo=aaa.jpg
	
	// 2. ResponseEntity에는 produce 속성 지정이 필요하단
	//    produces는 출력하는 데이터의 contentType을 지정할 때 사용
	
	// 3. contentType은?
	//   파일 내용의 형식으로, 지정하는 표준은 MIME이라고 한다
	// 	 MIME의 예 : text/html, application/excel, image/jpeg, application/json
	//     application/excel mime 타입을 가지는 링크를 클릭하면 엑셀이 실행된다
	@GetMapping(value="/photo", produces=MediaType.APPLICATION_OCTET_STREAM_VALUE)
	public ResponseEntity<byte[]> viewPhoto(@RequestParam String photo) {
		// 1. 이미지 파일을 연다
		File file = new File("c:/upload/photo/", photo);
		
		// 2. 이미지 파일을 byte배열로 변경하고 이미지의 종류를 알아낸 다음 ResponseEntity로 응답
		try {
			// 파일을 byte배열로 바꾸는 코드
			byte[] bytes = Files.readAllBytes(file.toPath());
			// file의 contentType을 읽어오자(image/jpeg, image/png....)
			String contentType = Files.probeContentType(file.toPath());
			// 문자열 contentType을 MediaType enum으로 변환
			MediaType type = MediaType.parseMediaType(contentType);
			return ResponseEntity.ok().contentType(type).body(bytes);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}



















