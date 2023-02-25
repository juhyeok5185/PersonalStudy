package com.example.demo.dto;

import java.time.LocalDateTime;

import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entity.Contact;

import lombok.Data;

@Data
public class ContactCreateDto {
	private String name;
	private String adress;
	private String tel;
	private MultipartFile photo;
	public Contact toEntity(String photo) {
		return new Contact(null, name, adress, tel, LocalDateTime.now(), photo);
	}
}
