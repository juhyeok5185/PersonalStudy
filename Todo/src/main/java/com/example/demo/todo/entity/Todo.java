package com.example.demo.todo.entity;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Todo {
	private Integer no;
	private String title;
	private String content;
	private LocalDate writeday;
	private LocalDate deadline;
	private boolean isFinish;
	
	public void toggleFinish() {
		this.isFinish = !this.isFinish;
	}
	
	public void init(int no) {
		this.no = no;
		this.writeday = LocalDate.now();
		this.isFinish = false;
	}
	
}
