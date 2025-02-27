package com.kh.inter.ex1;

public class Rabbit implements Animal, Baby{
	//Rabbit 클래스는 Animal, Baby 인터페이스를 상속받는다
	//shift + alt + s > v ==> 오버라이딩
	//shift + alt + s > r ==> getter/setter
	//shift + alt + s > c ==>  super
	//shift + alt + s > s ==> toString() 
	
	public void move() {
		System.out.println("rabbit이 점프합니다");
	}
	public void eat() {
		System.out.println("rabbit이 당근을 먹습니다");
	}
	public void makeSound() {
		System.out.println("깡춍깡춍");
	}
}
