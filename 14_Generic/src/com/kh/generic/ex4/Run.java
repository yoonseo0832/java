package com.kh.generic.ex4;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBox<String, Integer> b1 = new DBox<>();
		b1.set("Test1", 100);
		//b1.set(100, "error"); => String Integer 순서가 아니라서 오류 발생
		System.out.println(b1); 
		// b1.toString(); 내부적으로 생략, Override해놔야됨, 아니면 문서위치,주소값
		
		
		DBox<Double, Boolean> b2 = new DBox<>();
		b2.set(12.34, false);
		System.out.println(b2);
	}

}
