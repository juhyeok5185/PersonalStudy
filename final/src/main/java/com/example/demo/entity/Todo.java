package com.example.demo.entity;

import java.time.LocalDate;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

//Setter + Getter + ToString + EqualsAndHashCode
@AllArgsConstructor
@Data 
public class Todo {
	
	private Integer no;
	private String job;
	private Date regda;
	private Boolean isFinish;
}

/*
object 클래스의 메소드 : equals , toString, HashCode등...
		자바의 모든 클래스가 가져야하는 메소드를 정해준다.
		모두 추상 메소드여야 하지만 실제로는 기본 구현이 되어있다. -> 에러를 막기위해 구현되어있다.
		(추상 메소드는 부모가 자식이 가져야 할 메소드의 이름을 정해주는 문법 -> 표준)

equals : 객체를 비교하는 메소드(추상메소드여야 한다)
	추상 메소드 - 자식에서 만드어야 하는 메소드
				- 부모에서 이름만 정해준다. why? 어떻게 만들어야 할 지는 몰라
  */