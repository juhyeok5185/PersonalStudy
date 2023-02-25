package com.example.demo.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
public class ContactReadDto {
	private Integer no;
	private String name;
	private String address;
	private String tel;
	private LocalDateTime regday;
	private String photo;
}
