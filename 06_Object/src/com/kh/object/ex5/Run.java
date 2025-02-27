package com.kh.object.ex5;

public class Run {

	public static void main(String[] args) {
		System.out.println("count: "+ Person.count);
		
		Person p1 = new Person();
		p1.name="이지원";
		p1.age=28;
		System.out.println(p1.toString());
		
		Person p2 = new Person("신지수", 24);
		System.out.println(p2.toString());
		
		Person p3 = new Person("이윤서", 23);
		System.out.println(p3.toString());
		
		Person p4 = new Person();
		p4.name="묘이 미나";
		p4.age=27;
		System.out.println(p4.toString());
		
		System.out.printf("Math.PI: %.2f\n", Math.PI);
		System.out.println("Math.random(1~100사이): "+ (int)(Math.random()*100+1));
	}

}
