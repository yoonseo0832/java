package com.kh.practice.student.model.vo;

public class Student {	
	private String name;
	private String subject;
	private int score;
	
	public Student() {}
	
	public Student(String name, String subject, int score) {
		this.name = name;
		this.subject = subject;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name= name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject= subject;
	}
	public int getScore() {
		return score;
	}
	public void setName(int score) {
		this.score= score;
	}
	public String inform() {
		String data = String.format("이름: %s / 과목: %s / 점수: %d\n", name, subject, score);
		return data;
	}
}
