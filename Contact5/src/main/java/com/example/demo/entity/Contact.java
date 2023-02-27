package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicUpdate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//테이블에 해당하는 클래스
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DynamicUpdate //값을 update를 할때 다른값들은 원래 갖고있던 값을 넣어주는 식으로 비효율 적으로 생성된다(그거를 막아준다)
public class Contact {
	@Id //키를 걸어준다.
	@GeneratedValue(strategy = GenerationType.SEQUENCE) //생성 - 생성하는 값은 시퀀스 
	private Integer no;
	@Column(length=50) //글자수
	private String job;
	@Column(length=10)
	private String name;
	@Column(length=20)
	private String address;
	
	public void update(Contact param) {
		this.job = param.getJob();
		this.name = param.getName();
		this.address = param.getAddress();
	}
}
