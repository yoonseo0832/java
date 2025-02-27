package com.kh.objext.ex4;

public class StudentEasy {
	private String name;
	private int age;
	private int math;
	private int eng;
	private int kor;
	
	// 생성자 자동완성: Alt + Shift + s -> o누르고 generator 누르면 생성됨
	public StudentEasy(String name, int age, int math, int eng, int kor) {
		super();
		this.name = name;
		this.age = age;
		this.math = math;
		this.eng = eng;
		this.kor = kor;
	}
	// 생성자 자동완성: Alt + Shift + s -> o누르고 diselect generator 누르면 생성됨
	public StudentEasy() {
		super();
	}
	//메소드 getter/setter 자동완성 : Alt + Shift + s ->  r
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	// 메소드 toString() 자동완성 : Alt + Shift + s ->  generate toString() 클릭하면 생성
	@Override
	public String toString() {
		return "StudentEasy [name=" + name + ", age=" + age + ", math=" + math + ", eng=" + eng + ", kor=" + kor + "]";
	}
	
	
}
