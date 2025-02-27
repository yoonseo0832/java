package com.kh.exception;
/*
 * 나만의 예외클래스 만들기
 * [1] 예외 클래스 상속(Exception, RunTimeException..)
 * [2] 예외 메세지 초기화(설정)
 * 	- 매개변수가 1개인 생성자 이용하는 방법
 *  - getMessage 메소드 오버라이딩하는 방법
 */
public class MyException extends Exception{
	
	public MyException() {}
	
	public MyException(String msg) {
		// 전달된 값을 부모생성자를 통해 초기화
		super(msg);
	}
}
