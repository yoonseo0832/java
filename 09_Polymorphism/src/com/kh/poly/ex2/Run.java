package com.kh.poly.ex2;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// [1] 부모 타입 참조변수(레퍼런스)로 부모 객체를 다루는 경우
		Car c1= new Car("Red", "가솔린", 2009);
		// Car ---> Car // 모두 접근 가능
		//color 
		//fuel
		//year
		//drive
		c1.drive(); 
		Sonata c2 = new Sonata("white", "가스", 2015);
		c2.drive();
		c2.moveSonata();
		
		//[3] 부모 타입의 참조변수로 자식 객체를 다루는 경우
		Car c3 = c2; // Car ------>Sonata drive() 재정의해서 오버라이딩
		c3.drive(); 
		// c3.moveSonata(); Car가 접근을 못함
		//다운캐스팅하는 방법
		((Sonata)c3).moveSonata();
		/*
		 * 다형성: 부모타입으로 부터 파생된 여러 타입의 자식 객체들을 
		 * 		  부모타입 하나로 다룰 수 있는 기술
		 * 장점: 하나의 부모 타입만으로 여러 자식 객체들을 다룰 수 있어 편리, 코드길이 축소
		 * 클래스간의 형변환
		 * 업캐스팅: 자식타입-> 부모타입으로 자동 형변환
		 * 다운캐스팅: 부모 타입-> 자식 타입(강제 형변환)
		 * ((Sonata)c1).moveTo(); 강제 형변환 방법
		 * 
		 * - 동적바인딩 
		 * 	: 프로그램이 실행되기 전 컴파일되면서 정적바인딩됨
		 * 	=> 참조변수타입의 메소드를 가르킴
		 * 오버라이딩
		 */
		Sonata[] sArr = new Sonata[3]; // sonata객체를 여러개 저장하는 배열
		sArr[0] = new Sonata("black", "디젤", 2018);
		
		Avante[] aArr = new Avante[4]; // avante객체를 여러개 저장하는 배열
		
		for(Sonata s: sArr) {
			if(s!=null) {
				s.drive();
			}
		}
		for(Avante a: aArr) {
			if(a!=null) {
				a.drive();
			}
		}
		System.out.println("********for-each문*********");
		//다향성을 사용한다면 
		Car[] cArr = new Car[10];
		cArr[0]=new Car();
		//오버라이딩함
		cArr[1]=new Sonata("블랙", "디젤", 2018);
		cArr[2]=new Avante("화이트", "가솔린", 2009);
		for(Car c : cArr) {
			if(c!=null) {
				c.drive();

				//해당 클래스의 타입으로 생성된 인스턴스 타입인가 확인
				//해당 클래스타입의 인스턴스를 참조하고 있는지 확인
				if(c instanceof Sonata) {
					((Sonata)c).moveSonata();
				}else if(c instanceof Avante) {
					((Avante)c).moveAvante();
				}
			}
		}
		System.out.println("********일반 for문**********");
		for(int i=0; i<cArr.length;i++) {
			if(cArr[i]!= null) {
				cArr[i].drive();
				if(cArr[i] instanceof Sonata) {
					((Sonata)cArr[i]).moveSonata();
				}else if(cArr[i] instanceof Avante) {
					((Avante)cArr[i]).moveAvante();
				}
			}
		}
		}

}
