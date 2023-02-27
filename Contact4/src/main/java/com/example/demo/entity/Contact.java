package com.example.demo.entity;

import java.time.*;
import java.time.format.*;

import com.example.demo.dto.*;

import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Contact {
	private Integer no;
	private String name;
	private String address;
	private String tel;
	private LocalDateTime regday;
	private String photo;
	
	public ContactReadDto toReadDto() {
		// LocalDate, LocalDateTime을 문자열로 변경하는 객체를 생성
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
		// dtf를 이용해 regday를 문자열로 변경
		String regday = dtf.format(this.regday);
		return new ContactReadDto(no, name, address, tel, regday, photo);
	}
	
}

// 입력 : name, address, tel, 파일형식으로 photo

// 출력 : no, name, address, tel, photo, 문자열 regday
