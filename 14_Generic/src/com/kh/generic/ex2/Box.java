package com.kh.generic.ex2;

//제네릭 적용해보기!
// * 타입 매개변수를 가지고 데이터 타입부분을 사용 시점에 정하도록 하는 기능
// 타입 매개변수 선언
//		=> 클래스 전체적으로 사용할때 : 클래스명"<변수명>"
//		=> 메소드 내에서 사용할때: 접근제한자 [예약어] "<변수명>" 반환형 메소드명...
// * 타입매개변수명 규칙: 대문자사용 & 한글자로 정의
// <T> 선언 후 사용 가능
public class Box<T> {
	private T ob;
	// 선언한 타입 매개변수 T로 필드의 타입을 지정
	// => 클래스 생성 시 전달된 타입으로 객체가 생성될 것
	
	public T get() {
		return ob;
	}
	
	public void set(T ob) {
		this.ob=ob;
	}
}
class Apple{
	@Override
	public String toString() {
		return "i am apple.";
		
	}
}
class Orange{
	@Override
	public String toString() {
		return "i am orange.";
		
	}
}