package com.kh.api;
import java.util.Date;
import java.text.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class API4_Date {
/*
 * java.util.Date
 * 날짜, 시간 관련 클래스
 */
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		//=> 현재 날짜+시간
		
		//원하는 날짜 지정
		// -연도: 지정연도-1900
		// - 월: 지정월-1
		Date date2 = new Date(2024-1900, 12-1, 31); //개강일: 2024년12월31일
		System.out.println(date2);
		
		// java.text.SimpleDateFormat
		//: 형식을 지정하는 객체
		String format = "yyyy년 MM월 dd일 E요일 hh시 mm분 ss초";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		System.out.println(sdf.format(date));
		System.out.println(sdf.format(date2));
		
		//java.time.LocalDateTime
		LocalDateTime date3 = LocalDateTime.now();
		//LocalDateTime.now(): 현재 날짜 시간 기준으로 생성
		System.out.println(date3);
		
		//월만 원하면 변수명.getMonth(); 월정보 +> 영어로
		System.out.println(date3.getMonth());
		//변수명.getMonthValue(): 월 정보를 숫자로 반환
		System.out.println(date3.getMonthValue()+"월");
		//변수명.getDayOfMonth(): 월 기준으로 일에대한 정보 반환
		System.out.println(date3.getDayOfMonth()+"일");
		//변수명.getDayOfYear(): 년을 기준으로 일에대한 정보 반환
		System.out.println("올해를 기준으로 오늘은 "+date3.getDayOfYear()+"일째");
		System.out.println("올해를 남은 날수: "+(365-date3.getDayOfYear())+"일 남음");
		
		// 변수명.getHour():시 정보
		System.out.println(date3.getHour()-12+"시");
		
		// 퇴근까지 남은 시간
		System.out.println(18-date3.getHour()+"시간 남았음");
		System.out.println(6-(date3.getHour()-12)+"시간 남았습니다.");
		
		// 형식 지정하기
		// java.time.format.DateTimeFormatter 이용
		// 변수명.formet(DateTimeFormatter.ofPattern(형식));
		
		String format2 = date3.format(DateTimeFormatter.ofPattern("yyyy-MM-dd E요일 hh:mm:ss"));
		System.out.println(format2);
	}

}
