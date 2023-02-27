package com.example.demo.dto;

import lombok.*;

// 타임리프에서 ${contact.name} -> getName() 호출
@Getter
@AllArgsConstructor
public class ContactReadDto {
	private Integer no;
	private String name;
	private String address;
	private String tel;
	private String regday;
	private String photo;
}
