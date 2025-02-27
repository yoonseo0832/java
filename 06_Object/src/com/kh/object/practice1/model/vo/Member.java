package com.kh.object.practice1.model.vo;

public class Member {
	//필드부------------------------
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	//필드부------------------------
	
	//생성자부-----------------------
	public Member() {}
	//생성자부-----------------------
	
	//메소드부-----------------------
	public void changeName(String name) {
		memberName = name;
	}
	public void printName() {
		System.out.println("이름: "+ memberName);
	}
	//메소드부-----------------------
}
