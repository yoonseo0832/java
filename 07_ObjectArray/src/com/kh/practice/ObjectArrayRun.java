package com.kh.practice;
import java.util.Scanner;
public class ObjectArrayRun {
	
	// 객체 배열 :여러 개의 객체를 관리하는 구조
	// 클래스명[] 변수명 = new 클래스명[베열크기]; // 선언과 할당을 동시에
	
	// 인덱스 위치에 초기화   => 해당 인덱스 위치에 객체 생성하여 할당
	// 변수명[인덱스] = new 클래스명(); //기본 생성자 사용함
	public static void main(String[] args) {
		int[] arr = new int[3]; // 정수형 배열 선언 크기 3인 할당
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.println(arr[i]+" ");
		}
		System.out.println(arr);
		
		//학생 정보를 담을 객체 배열을 선언 및 할당
		// 1. 학생의 정보를 관리하기 위해 Student 클래스 추가 및 정의
		// 2. 정의한 Student 객체를 사용하여 배열 선언 및 할당
		Student[] stdArr = new Student[2]; // [null | null]
		//초기화중
		stdArr[0] = new Student("신지수", 24, 'F',2022274454);//[stdArr[0] | null]
		stdArr[1] = new Student("이윤서", 23, 'F',2022270543);//[stdArr[0] | stdArr[1]]
		
		stdArr[0].printInfo(); // 첫번째 학생 정보 출력
		//두번째 학생 정보 제거하고 싶은 경우 null 대입하면 됨
		stdArr[1]= null;  
		
		Student[] sArr = new Student[2];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<sArr.length; i++) {
			System.out.print("이름: ");
			String name = sc.next();
			
			System.out.print("나이: ");
			int age = sc.nextInt();
			
			System.out.print("성별: ");
			char gen = sc.next().charAt(0);
			
			System.out.print("학번: ");
			int id = sc.nextInt();
			// Student 타입 
			sArr[i] = new Student(name,age, gen, id);
			
			// for(자료형 변수명: 배열명){} => 자료형 위치 클래스명 작성
			// 객체 배열을 for-each으로 사용하면 
			for(Student s: sArr) {
				s.printInfo();
			}
		}
	}

}
