package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class BExample012Application {

	public static void main(String[] args) {
		SpringApplication.run(BExample012Application.class, args);
	}
	
	@Bean
	public ObjectMapper objectMapper() {
		return new ObjectMapper(); //IOC , DI , BEAN
	}
	
	
}
