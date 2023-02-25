package com.example.demo.entity;

import java.time.LocalDateTime;

import com.example.demo.dto.ContactReadDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Contact {
	private Integer no;
	private String name;
	private String address;
	private String tel;
	private LocalDateTime regday;
	private String photo;
	public ContactReadDto toReadDto() {
		return new ContactReadDto(no, name, address, tel, regday, photo);
	}
}
