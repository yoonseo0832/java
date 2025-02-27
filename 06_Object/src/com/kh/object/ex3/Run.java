package com.kh.object.ex3;

public class Run {

	public static void main(String[] args) {
		Book b1 = new Book(); // 클래스명() -> 생성자
		// b1.title = "노인과 바다"; => title 변수에 접근 불가; 
		// -> 해당 변수는 private으로 선언됨, 해당 클래스내에서만 접근 가능
		b1.setTitle("자바의 정석");
		String b1Title = b1.getTitle();
		System.out.println("b1: "+b1Title);
		
		Book b2 = new Book("노인과 바다", "휴먼", "데미안 퓨리");
		b2.setTitle("데미안의 일기");
		String info = b2.toString();
		System.out.println(info);
		
		Book b3 = new Book("라라랜드", "휴 잭맨", "로맨스", 130);
		
		String info1 = b3.toString();
		System.out.println(info1);
	}

}
