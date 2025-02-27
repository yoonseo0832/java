package com.kh.api;

public class API1_Math {
/*
 * java.lang.Math; 클래스
 * => 모든 필드가 상수 필드 -> 변하지 않는 값 키워드 final
 * => 모든 메소드가 static 메소드 생성없이 클래스 접근 가능
 */
	public static void main(String[] args) {
		// 상수 필드 
		// - PI: 파이값 저장하고 있는 변수
		System.out.println("Math.PI: "+ Math.PI);
		
		//static 메소드 
		// - random() : 랜덤값을 반환하는 메소드
		System.out.println("Math.random(): "+ Math.random());
		
		// - abs(): 절대값을 반환하는 메소드
		int n = -124;
		System.out.println("Math.abs(): "+ Math.abs(n));
		
		// - pow(): 제곱값을 반환하는 메소드
		System.out.println("Math.pow(): "+ Math.pow(2, 10)); //double
		
		// - ceil(): 올림처리 해주는 메소드
		double d=12.49;
		System.out.println("Math.ceil(): "+ Math.ceil(d)); // double
		
		// - round(): (반올림)처리
		System.out.println("Math.round(): "+ Math.round(d)); //int?
		
		// - floor(): 내림(버림)처리
		System.out.println("Math.floor(): "+ Math.floor(d)); // double
	}

}
