package com.example.demo.util;

import java.time.*;

public class TodoUtils {
	public static LocalDate getLocalDate(String date) {
		String[] ar = date.split("-");
		int year = Integer.parseInt(ar[0]);
		int month = Integer.parseInt(ar[1]);
		int day = Integer.parseInt(ar[2]);
		return LocalDate.of(year, month, day);
	}
}
