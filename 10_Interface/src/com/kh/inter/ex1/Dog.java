package com.kh.inter.ex1;

public class Dog implements Animal{
	public void move() {
		System.out.println("dog이 달려옵니다");
	}
	public void eat() {
		System.out.println("dog이 사료를 먹습니다");
	}
	public void makeSound() {
		System.out.println("멍멍");
	}
}
