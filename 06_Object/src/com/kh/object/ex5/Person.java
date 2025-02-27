package com.kh.object.ex5;

public class Person {
/*
 * static: "고정적인, 정적인" 의미의 단어
 * 	static변수, static method는 정적메모리를 사용하여 프로그램 실행 시점에 객체 생성없이 메모리에 
 * 생성되며 모든 객체가 공유하며 사용 가능
 * 
 *  *클래스 변수(static 선언된 변수) => 한 클래스에서 공통적인 값을 유지할 때 사용
 *  클래스명.변수명 호출/사용 가능, 참조변수명.클래스변수명 사용 가능
 *  
 *   클래스 메소드(static 선언된 메소드)
 *   => 인스턴스 변수 사용 불가
 *   	따라서 인스턴스와 관련 없음, 단순한 기능, 클래스명.메소드명 으로 호출
 */
	
	// 필드부/변수부-----------------------
	String name; 		//이름
	int age; 			//나이 
	static int count=0; 	//인스턴스 생성 시 개수, 0으로 초기화
	// --------------------------------------
	
	// 생성자부-------------------------------
	//기본 생성자
	public Person() {
		count++;
	}
	
	//매개변수가 2인 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age  = age;
		
		count++;
	}
	//메소드부----------------------------------
	@Override
	public String toString() {
		return "이름: "+ name+ ", 나이: "+ age+ ", 번호: "+ count;
	}

}
