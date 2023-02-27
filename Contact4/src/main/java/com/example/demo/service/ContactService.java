package com.example.demo.service;

import java.io.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.multipart.*;

import com.example.demo.dao.*;
import com.example.demo.dto.*;
import com.example.demo.entity.*;

@Service
public class ContactService {
	@Autowired
	private ContactDao dao;

	// 사진을 포함한 주소록 저장하기
	public Contact join(ContactCreateDto dto) {
		// 1. 사진 이름을 기본 이미지로 지정
		String photoName = "default.jpg";
		
		// 2. 이미지를 업로드한 경우 업로드한 이미지를 저장하고 사진 이름을 변경
		MultipartFile photo = dto.getPhoto();
		if(photo!=null && photo.isEmpty()==false) {
			// <input type='file' name='photo'> 태그가 아예 없는 경우 : null
			// 태그는 있는데 선택을 안한 경우 : empty
			// File 객체 생성:new File(폴더명, 파일명)
			File file = new File("c:/upload/photo", photo.getOriginalFilename());
			try {
				photo.transferTo(file);
				photoName = photo.getOriginalFilename();
			} catch (IllegalStateException | IOException e) {
				e.printStackTrace();
			}
		}
		
		// 3. 사진을 볼 수 있는 주소를 포함해 dto를 연락처 객체로 변경
		//    http://localhost:8081/photo?photo=사진이름
		Contact contact = dto.toEntity("http://localhost:8081/photo?photo=" + photoName);
		dao.save(contact);
		return contact;
	}

	public ContactReadDto findByNo(Integer no) {
		Contact contact = dao.findByNo(no);
		ContactReadDto dto = contact.toReadDto();
		return dto;
	}
}










