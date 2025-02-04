package com.kh.loop;

public class While {

	public static void main(String[] args) {
		method1();
		method2();
		
	}
	public static void method2() {
		int random = (int)(Math.random() *10+1);
		int total=0;
		int i =1;
		while(i<=random) {
			total+= i; // total += i++;와 동일함 
			i++;
		}
		System.out.printf("random: %d , total: %d", random, total);
	}
	public static void method1() {
		/*
		 * while문
		 * [표현식]
		 * 		// [초기식]
		 * 		while(조건식){
		 * 			// 반복 수행할 코드
		 * 			// [증감식]
		 * 		}
		 * [] 생략 가능함을 의미
		 * 
		 * 실행 순서
		 * 조건식 검사->true이면 {} 안 코드 수행 -> 반복 -> false 되면 {} 탈출
		 */
		int i=10;
		while(i>5) {
			System.out.println("Happy");
			i--;
		}
	}
}
 