package com.example.demo.dto;

import java.time.*;

import org.springframework.web.multipart.*;

import com.example.demo.entity.*;

import lombok.*;

@Getter
@Setter
@ToString
public class ContactCreateDto {
	private String name;
	private String address;
	private String tel;
	private MultipartFile photo;
	
	public Contact toEntity(String photo) {
		return new Contact(null, name, address, tel, LocalDateTime.now(), photo);
	}
}
