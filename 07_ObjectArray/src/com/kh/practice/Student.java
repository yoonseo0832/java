package com.kh.practice;

public class Student {
	private String name; // 이름
	private int age;     // 나이
	private char gender; // 성별
	private int idNum;   // 학번
	
	//생성자를 통해 값을 전달받아 초기화
	public Student(String name, int age, char gender, int idNum) {
		this.name =name;
		this.age = age;
		this.gender=gender;
		this.idNum= idNum;
	}
	public void printInfo() {
		String data = String.format("학생정보: %s, 나이: %d, 성별: %c 학번: %d", name, age, gender,idNum);
		System.out.println(data);
	}
}
