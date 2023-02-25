package com.example.demo.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Service.ContactService;
import com.example.demo.dto.ContactCreateDto;
import com.example.demo.dto.ContactReadDto;
import com.example.demo.entity.Contact;

@Controller
public class ContactController {
	@Autowired
	private ContactService service;
	
	@GetMapping("/join")
	public ModelAndView start() {
		return new ModelAndView("join");
	}
	
	@PostMapping("/join")
	public ModelAndView join(@ModelAttribute ContactCreateDto dto) {
		Contact contact = service.save(dto);
		return new ModelAndView("redirect:/read?no=" + contact.getNo());
	}
	
	@GetMapping("/read")
	public ModelAndView read(@RequestParam Integer no) {
		ContactReadDto dto = service.read(no);
		return new ModelAndView("read").addObject("contact", dto);
	}
	
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
