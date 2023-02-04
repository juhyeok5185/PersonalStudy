package com.example.demo.todo.util;
import java.time.LocalDate;

public class TodoUtils {
	public static LocalDate getLocalDate(String date) {
		String[] ar = date.split("-");
		int year = Integer.parseInt(ar[0]);
		int month = Integer.parseInt(ar[1]);
		int day = Integer.parseInt(ar[2]);
		return LocalDate.of(year, month, day);
	}
}
