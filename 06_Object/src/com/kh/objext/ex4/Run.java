package com.kh.objext.ex4;
import java.util.Scanner;
public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1 = new Student("이윤서", 23, 100, 90, 80);
		System.out.println(std1);
		
		Student std2 = new Student("장원일", 19, 70, 100, 90);
		System.out.println(std2);
		
		//System.out.println(std1.getName()+ "학생의 평균: "+ std1.getAvg());
		//System.out.println(std2.getName()+ "학생의 평균: "+ std2.getAvg());
		
		/*
		 * 사용자로 부터 이름, 나이, 수학, 영어, 국어 점수 입력받아 평균 구하고 출력하는 프로그램 만들어봐랴ㅏ.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("나이: ");
		int age = sc.nextInt();
		System.out.print("수학: ");
		int math = sc.nextInt();
		System.out.print("영어: ");
		int eng = sc.nextInt();
		System.out.print("국어: ");
		int kor = sc.nextInt();
		
		System.out.println("----------------------------------------------");
		Student std3 = new Student(name, age, math, eng, kor);
		System.out.println(std3.getName()+ "님의 평균: "+ std3.getAvg()+ ", 총점: "+std3.getTotal()+ ", 평균학점: "+ std3.getGrade());
	}

}
