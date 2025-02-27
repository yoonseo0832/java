package com.kh.poly.ex1;

public class Run {

	public static void main(String[] args) {
		/*
		 * 클래스명 참조변수 = new 클래스 생성자;  => 클래스생성자: 클래스명();
		 * 부모클래스 클래스명 위치에 올수 있음! | 생성자는 자식클래스로 생성할 수 있다(상속이 적용된 상황에서)
		 * 실제로 어디까지 접근할 수 있는가 => 클래스명 의 멤버까지
		 * 실제로 메모리에 어떤 형태로 생성되었는따=>new 클래스 생성자 부분을 담당
		 */
		Cake c1 = new CheeseCake();
		//부모클래스 = 자식클래스 => 가능
		// Cake 클래스 멤버까지 접근 가능, 메모리 공간은 CheeseCake 형태로 형성
		c1.sweet();
		c1.yummy(); 
// 오버라이딩으로 메소드는 실제 메모리에 있는 재정의된 실제 메소드가 실행되서 부모 클래스의 yummy() 실행 안됨(동적바인딩)
		//CheeseCake c2 = new Cake(); //Type mismatch: cannot convert from Cake to CheeseCake
		// 실제 메모리 공간에 Cake 형태로 생성된다면 CheeseCake에 접근 불가
		/*
		 * CheeseCake
		 * -> sweet() yummy() milky()
		 * Cake
		 * -> sweet() yummy() // milky() 없어서 오류 발생  CheeseCake c2 = new Cake();
		 */
	}

}
