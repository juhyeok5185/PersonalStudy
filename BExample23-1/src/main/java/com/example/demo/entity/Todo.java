package com.example.demo.entity;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Todo {
	private Integer no;
	private String job;
	private LocalDate regday;
	private Boolean isFinish;
}
