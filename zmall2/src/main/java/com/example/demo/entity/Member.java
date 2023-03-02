package com.example.demo.entity;

import java.time.LocalDate;

import lombok.Getter;

@Getter
public class Member {
	private String username;
	private String password;
	private String email;
	private String irum;
	private String profile;
	private LocalDate birthday;
}
