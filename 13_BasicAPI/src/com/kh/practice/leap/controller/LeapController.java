package com.kh.practice.leap.controller;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class LeapController {
	public boolean isLeapYear(int year) {
		return (year%4==0 &&(year%100!=0||year%400==0)) ;
	}
	
	public long leapDate(Calendar c) {
		int year =c.get(Calendar.YEAR);
		int month =c.get(Calendar.MONTH)+1;
		int days =c.get(Calendar.DAY_OF_YEAR);
		
		long total=0;
		
		for(int i=1;i<year; i++) {
			total+= isLeapYear(i)?366:365;//윤년이 true: 평년이면 false
		}
		int[] daysMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if(isLeapYear(year)) {
			daysMonth[1]=29;
		}
		for(int i=1;i<month-1; i++) {
			total+=daysMonth[i];
		}
		total+=days;
		return total;
	}
}
