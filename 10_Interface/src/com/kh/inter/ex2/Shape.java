package com.kh.inter.ex2;

public interface Shape {
	//필드부(변수) ==> 상수만 가능
	
	// 접근제한자 예약어 반환형 메소드명(매개변수정보) {} => 일반적인 메소드
	// public abstract 반환형 메소드명(매개변수정보); => interface에서의 추상메소드
	
	public abstract double calculateArea();
		// 추상메소드 : 미완성 메소드(기능)
		// 몸체({}), 구현부가 없는 형태 
		// 해당 인터페이스를 상속하는 경우 추상메서드를 오버라이딩하여 구현함

}
