package com.kh.practice.charCheck.exception;

public class CharCheckException extends Exception{
	// (1) 예외클래스 상속
	// (2) 예외 메세지(detail) 초기화
	//		- 생성자 -> 문자열 값을 전달받아 부모 생성자 호출
	//		- getMessage() 메소드 오버라이딩
	public CharCheckException() {}
	
	public CharCheckException(String msg) {
		super(msg);
	}
	
	/*
	@Override 
	public String getMessage() {
		return "예외 발생: 공백이 포함되어있습니다";
	}
	*/
}
