package com.kh.generic.ex2;

public class Run {

	public static void main(String[] args) {
		Box<Apple> aBox = new Box<Apple>();
		//Box<Apple> aBox = new Box<>(); 위의 코드는 동일
		aBox.set(new Apple());
		Apple apple = aBox.get();
		System.out.print(apple);
		
		// 문제가 있었던 코드를 다시 작성해보기
		Box<Orange> oBox = new Box<Orange>(); // = new Box<>(); 동일함
		//oBox.set("Orange");
		//The method set(Orange) in the type Box<Orange> 
		//is not applicable for the arguments (String)
		//컴파일 오류, Orange 타입의 데이터를 전달해야하는데 문자열로 전달해서 실행 아예 안됨
	}

}
