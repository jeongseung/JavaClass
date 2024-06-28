package oop27;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;



public class Date {

	String day() {
		LocalDate now = LocalDate.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		String formatedNow = now.format(format);
		return formatedNow;
	}
	
	String time() {
		LocalTime now = LocalTime.now();
		int hour = now.getHour();
		int minute = now.getMinute();
		int second = now.getSecond();
		String time = hour + "시 " + minute +"분 " +second+ "초";
		return time;
	}
	
}
