package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	private Student[] sArr = new Student[5];
	public static final int CUT_LINE = 60;
	
	public StudentController() {
		//인덱스 위치를 사용하여 초기화
		sArr[0] = new Student("김길동", "자바", 100);
		sArr[1] = new Student("박길동", "디비", 50);
		sArr[2] = new Student("이길동", "화면", 85);
		sArr[3] = new Student("정길동", "서버", 60);
		sArr[4] = new Student("홍길동", "자바", 20);
		
		// 초기화 하여 할당하는 방법
		/*
		sArr = new Student[] {
				new Student("김길동", "자바", 100),
				new Student("박길동", "디비", 50),
				new Student("이길동", "화면", 85),
				new Student("정길동", "서버", 60),
				new Student("홍길동", "자바", 20)
		};
		*/
	}
	
	public Student[] printStudent() {
		// 객체 배열에 있는 데이터를 반환, 배열의 변수가 배열의 주소값을 가지고 있음
		return sArr;
	}
	public int sumScore() {
		int total=0; //Stack 영역인 지역변수인 total은 초기값을 지정해줘야함
		for(int i=0; i<sArr.length; i++) {
			 total += sArr[i].getScore();
		}
		return total;
	}
	public double[] avgScore() {
		double[] result = new double[2];
		int total = sumScore();
		result[0] = total;
		result[1] = total/sArr.length;
		
		return result; // 배열을 리턴하라~
	}
}
