package package3.controller;

import package3.model.vo.*;
public class AnimalManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] aArr = new Animal[5];
		// 자료형[] 변수형 = new 자료형[배열 크기];
		for(int i=0; i<aArr.length; i++) {
			// aArr[0] 변수명[] => 자료형 변수명와 같은 것
			/*
			 * Animal a1 = new Animal(); => X Animal 추상클래스라서 객체 생성 불가
			 * Animal a2 = new Dog();    => O 상속 관계에서 업캐스팅되 자식 객체를 부모타입의 참조변수에 할당 가능
			 */
			aArr[0] = new Cat("루피", "사피어스", "규영이집", "그레이");
			aArr[1] = new Dog("세바스찬", "웰시코기", 16);
			aArr[2] = new Dog("보리", "미니푸들", 5);
			aArr[3] = new Dog("초코", "닥스훈트", 8);
			aArr[4] = new Cat("쿠키", "샴", "민희집", "화이트");
			//aArr[i] = new Cat();
			//NullPointerException => 객체 배열 생성안됨
//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "package3.model.vo.Animal.speak()" because "aArr[i]" is null
// at package3.controller.AnimalManager.main(AnimalManager.java:23)
		}
		//배열 길이: 배열.length
		//문자열 길이: 문자열.length()
		System.out.println("==일반 for문==");
		for(int i =0; i<aArr.length; i++) {
			aArr[i].speak();
			//컴파일 단계에서는 참조변수타입의 메소드를 가르킴
			//실행 시 생성된 객체에서 재정의된 메소드가 실행됨(동적바인딩)
		}
		//for-each문 "for(자료형 변수명: 배열명)" 작성
		//ex Student[] arr = new Student[10];
		//=> for(Student[] std : arr)
		System.out.println();
		System.out.println("==for-each문==");
		//if(animal instanceof Dog){
		
		for(Animal animal: aArr) {
			//if(animal instanceof Dog){ 현재 Dog, Cat모두 speak() 오버라이딩 해서 타입 체크 생략
			animal.speak();
			//}
		}
	}

}
