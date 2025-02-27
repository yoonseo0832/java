package com.kh.objext.ex4;
/*
 * 학생 정보: 이름, 나이, 수학점수, 영어 점수, 국어점수
 * private name:String
 * 데이터의 경우 직접 접근을 허용하지 않고 모두 간접적으로 접근(get/set) 필요
 * 모든 데이터를 매개변수로 받아 초기화하면서 객체 생성할 수 있는 생성자 정의
 */
public class Student {
	// 필드부----------------------------------------------------------
	private String name;
	private int age;
	private int math;
	private int eng;
	private int kor;
	
	// 생성자부---------------------------------------------------------
	public Student() {}
	
	public Student(String name, int age, int math, int eng, int kor) {
		this.name = name;
		this.age = age;
		this.math = math;
		this.eng = eng;
		this.kor = kor;
	}
	
	// 메소드부---------------------------------------------------------
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
	
	public String toString() {
		return "이름: "+ name+ " 나이: "+ age+ " 수학점수: "+ math+ " 영어점수: "+ eng+ " 국어점수: "+ kor;
	}
	
	// 모든 과목의 평균을 계산하는 메소드
	public int  getAvg() {
		return (math+eng+kor)/3;
	}
	public int getTotal() {
		return (math+eng+kor);
	}
	public String getGrade() {
		int total = getAvg();
		if(total>=90 && total<=100) {
			return "A";			
		}else if(total>=80 && total<90){
			return "B";	
		}else if(total>=70 && total<80){
			return "C";	
		}else if(total>=60 && total<70){
			return "D";	
		}else{
			return "F";	
		}
	}
}
