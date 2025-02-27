package com.kh.object.ex2;
/*
 * 클래스 구고
 * 		접근제한자 class 클래스명{
 * 			// 변수부(사용할 데이터를 선언하는 영역) => 필드(필드)부라고도 표현!
 * 			
 * 			// 생성자부(데이터를 초기화하기 위한 특수한 목적으로 메소드르 정의하는 영역)
 * 
 * 			// 메소드부(기능을 정의하는 영역)
 * 		}
 */
public class Student {
	//필드부
	String name;
	int age;
	double height;
	
	// 메소드부: 저장된 데이터 출력하는 메소드
	public void print() {
		System.out.printf("이름: %s, 나이: %d, 키: %.1f\n",name, age, height);
	}
	
}
