package com.kh.set;

import java.util.Objects;

public class Student {
	private String name;
	private int age;
	private int score;
	
	public Student() {
		super();
	}
	public Student(String name, int age, int score) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.age=age;
		this.score=score;
	}
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
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	//--------------------------------------------------------
	@Override
	public int hashCode() {
		//[1] Objects.hash()
		return Objects.hash(name, age, score);
		//[2] String의 hashCode 이용
		//return (""+name+age+score ).hashCode();
		
	}
	/**
	 * 현재 객체와 전달받은 객체의 각 필드값을 모두 비교하여
	 * 같으면 true, 하나라도 일치하지 않으면 false 반환
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std =(Student)obj; //다운캐스팅 : 형변환 
			if(this.name.equals(std.getName())
					&& this.age==std.getAge() 
					&& this.score==std.getScore()){
				return true;
			}

		}
		return false;
	}
	
}
