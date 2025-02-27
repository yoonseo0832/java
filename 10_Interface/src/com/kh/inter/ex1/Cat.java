package com.kh.inter.ex1;

public class Cat implements Animal{
	// Cat 클래스는 Animal 인터페이스를 구현
	// => 해당 인터페이스의 추상 메소드를 오버라이딩 해야함, 객체 생성 가능
	// 추상 메소드를 오버라이딩을 하지 않으면 추상 메소드는 미완성임
	public void move() {
		System.out.println("cat이 걸어옵니다");
	}
	public void eat() {
		System.out.println("cat이 츄르를 먹습니다");
	}
	public void makeSound() {
		System.out.println("냐옹 냐옹");
	}
	
}
