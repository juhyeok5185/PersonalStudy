package com.example.demo.Service;

import java.io.File;
import java.io.IOException;

import javax.imageio.IIOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.dao.ContactDao;
import com.example.demo.dto.ContactCreateDto;
import com.example.demo.dto.ContactReadDto;
import com.example.demo.entity.Contact;

@Service
public class ContactService {
	@Autowired
	private ContactDao dao;

	public Contact save(ContactCreateDto dto) {
		// 1. 사진 이름을 기본 이미지로 지정
		String photoName = "default.jpg";

		// 2. 이미지를 업로드한 경우 업로드한 이미지를 저장하고 사진 이름을 변경
		MultipartFile photo = dto.getPhoto();
		if (photo != null && photo.isEmpty() == false) {
			// <input type='file' name='photo'> 태그가 아예 없는 경우 : null
			// 태그는 있는데 선택을 안한 경우 : empty
			// File 객체 생성:new File(폴더명, 파일명)
			File file = new File("c:/upload/photo", photo.getOriginalFilename());
			try {
				photo.transferTo(file);
				photoName = photo.getOriginalFilename();
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Contact contact = dto.toEntity("http://localhost:8081/photo?photo=" + photoName);
		dao.save(contact);
		return contact;
	}

	public ContactReadDto read(Integer no) {
		Contact contact = dao.select(no);
		ContactReadDto dto = contact.toReadDto();
		return null;
	}

}
