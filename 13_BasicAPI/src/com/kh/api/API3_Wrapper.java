package com.kh.api;

public class API3_Wrapper {
/*
 * Wrapper 클래스
 * : 기본 자료형을 객체화 해주는 클래스(클래스라서 대문자로 시작함)
 * boolean --> Boolean
 * char    --> Character
 * byte    --> Byte
 * short   --> Short
 * int 	   --> Integer
 * float   --> Float
 * double  --> Double
 * 
 * - 기본 자료형을 객체로 표현하는 이유: 
 * 1. 다형성을 적용시키고 싶을때 
 * 2. 메소드 호출할때, 매개변수가 기본자료형이 아닌 객체타입만 요구될 때
 */
	public static void main(String[] args) {
		// Boxing  기본자료형-> Wrapper클래스로 객체화함
		int n1 = 100;
		int n2 = 200;
		
		// [1] 객체 생성 구문 사용 
		Integer i1 = new Integer(n1);
		Integer i2 = new Integer(n2);
		System.out.println("int n1: "+i1);
		System.out.println("int n2: "+i2);
		System.out.println("int n1과 n2가 같은지: "+ i1.equals(i2));
		System.out.println("int n1과 n2가 compareTo: "+ i1.compareTo(i2));
		// 두 값을 비교하여 앞쪽의 값이 크면 1 반환함, 
		//              뒷쪽의 값이 크면 -1 반환함,
		//				앞도뒤도 크지 않는==같으면 0 반환함
	
		// [2] 객체 생성 구문 없이 사용
		Integer i3 = n1; //Auto Boxing됨
		System.out.println("int n1: "+i3);
		
		// 객체 생성을 통해 반드시 변환해야 하는 경우 => 문자열
		// 문자열을 Integer타입으로 변환하고 싶은 경우 객체 생성을 반드시 해야함
		Integer i4 = new Integer("3030");
		Integer i5 = Integer.parseInt("404");
		//-------------------------------------------------------------
		
		// Unboxing : Wrapper클래스 -> 기본 자료형 (값만 추출하고 싶은 경우 사용)
		//[1] Wrapper class 제공하는 메소드 사용하는 방법 (XXXValue())
		int n3 = i3.intValue(); // i3 변수의 값을 intValue()메소드 사용
		int n4 = i4.intValue(); 
		
		// [2] 메소드 없이 바로 대입
		int n5 = i5; //Auto Unboxing됨 자동으로
		//-------------------------------------------------------------
		
		// String 과 변환
		
		// String ---> 기본 자료형
		String str1 = "10";
		String str2 = "33.5";
		System.out.println(str1+str2); //문자열+문자열==> 이어붙이기됨 1033.5 이될듯
		
		//Wrapper클래스.parseXXX()
		int num = Integer.parseInt(str1);
		double dNum = Double.parseDouble(str2);
		System.out.println(num+dNum); //정수형+실수형==> 43.5
		
		System.out.println(num+ "");
		System.out.println(String.valueOf(num));
		System.out.println(String.valueOf(dNum));
	}

}
