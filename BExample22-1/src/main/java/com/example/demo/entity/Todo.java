package com.example.demo.entity;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Todo {
	private Integer no;
	private String job;
	private LocalDate regday;
	public Boolean isFinish;
}
