package com.kh.inherit;

public class InheritMemo {
	/*
	 * 상속: 부모 클래스의 멤버(필드/메서드)를 자식 클래스에서 그대로 이어받아 사용하는 것(물려받는)
	 * 		실제로 상속된 클래스를 통해 객체 생성 시 부모 클래스의 멤버들도 생성됨
	 * 
	 * 장점: - 적은 양의 코드로 새로운 클래스 정의 및 사용 가능 => 생산성 좋음
	 * 		- 코드를 공통으로 관리해 코드 추가 및 수정 쉬움 => 유지보수에 유리함
	 * 
	 * 특징: - 부모 클래스의 생성자와 초기화블록은 상속 안됨
	 * 		- 부모 클래스의 private 멤버(필드/메서드)는 상속은 되나 직접 접근이 불가함
	 * 		  protected 멤버는 직접 접근 가능(같은 클래스 내나 상속)
	 * 		- 모든 클래스(자바에서 제공하는 클래스와 직접 만든 클래스..)는 Object 클래스(내장 객체)의 후손임
	 * 		- 클래스 간의 상속은 단일 상속만 가능(부모는 하나만 가능) C++의 다중 상속 불가
	 * 		- 부모 클래스에 정의되어 있는 메소드를 자식 클래스에서 재정의 할수 있음=> 오버라이딩!(다르게 구현하고 싶을때 사용)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Desktop 클래스 정의
		 * - brand:Stirng
		 * - code:String
		 * - name:String
		 * - price:int
		 * -allInOne:boolean
		 * ----------------
		 * +Desktop(brand:String, 나머지 3개모두);
		 * +information():String
		 * ----------------
		 */
		/*
		 * tv클래스
		 * ----------------
		 * - brand:Stirng
		 * - code:String
		 * - name:String
		 * - price:int
		 * - inch:int
		 * --------------
		 * +
		 */
	}

}
