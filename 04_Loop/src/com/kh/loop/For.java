package com.kh.loop;
import java.util.Scanner;
import java.lang.Math;
public class For {

	public static void main(String[] args) {
		/*
		 * 반복문: 프로그램 흐름을 제어하는 제어문 중 하나, 특징 코드를 반복적 수행 문법
		 * for문: 
		 * [표현식]
		 * for(초기식; 조건식; 증감식){
		 * 		// 반복적으로 수행할 코드
		 * }
		 * 초기식: 반복문 수행될때 한번만 실행되는 구문
		 * 조건식: 반복문이 수행될 조건을 작성하는 구문
		 * 		- 조건식 true 중괄호 안의 코드 수행
		 * 		- 조건식 false 반복문 종료
		 * 증감식: 반복문 제어하는 변수의 값을 증감시키는 구문
		 * ==> 보통 초기식, 조건식, 증감식 사용되는 변수가 동일함 ex) i로 통일
		 * [for 반복문 살행 순서]
		 * 초기식 -> 조건식-> 결과 참, 중괄호 안 코드 수행-> 증감식-> 조건식 true 인 경우 계속 반복, 결과 false 나오면 반복문 종료
		 * !초기식이나 조건식을 생략해도 ; 세미콜론은 필수적! ex) for(i=0; ; i++){} ex) for(; i<=10; i++){} 
		 */
		//mehtod1();
		//method2();
		//method3();
		//method4();
		//method5();
		//method6();
		//method7();
		//method8();
		method9();
	} 
	public static void mehtod1() {
		// "Happy" 5번 출력
		System.out.println("Happy");
		System.out.println("Happy");
		System.out.println("Happy");
		System.out.println("Happy");
		System.out.println("Happy");
		System.out.println("-----------------");
		for(int i=0; i<5; i++) {
			System.out.println("Fori=0_Happy");
		}
		System.out.println("-----------------");
		for(int j=1; j<6; j++) {
			System.out.println("Forj=1_Happy");
		}
		int k;
		for(k=0; k<5; k++) {
			System.out.println("Fork=0_Happy");
		}
		System.out.println(k);
		
	}
	public static void method2() {
		for(int i=10; i>=1; i--) {
			System.out.print(i);
			if(i>1) { // if(i>1){} 1일때는 출력하지 않고 
				System.out.print(" ");
			}
		}
	}
	public static void method3() {
		int total =0;
		for(int i=1; i<=10; i++) {
			total+= i;
			System.out.println("total: "+total+", i: "+i);
		}
		System.out.print(total);// 반복문이 끝나고 나서 프린트해야함
	}
	public static void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~10 사이의 정수를 입력하세요: ");
		int num = sc.nextInt();
		int total=0;
		if(1<=num&&num<=10) {
			for(int i=1; i<=num; i++) {
				total+=i;
			}
			System.out.printf("1부터 %d까지의 총 합은: %d", num, total);
		}else {
			System.out.print("범위를 벗어난 값을 입력하였습니다!");
		}
		sc.close();
	}
	public static void method5() {
		/*
		 * [랜덤값 구하는 방법]
		 * - Math : java.lang.Math  => random()
		 * Math.random() *10+1 // 1.0 ~ 10.9999
		 * (int)(Math.random() *10+1) => 1~10  사이의 숫자 랜덤으로 나옴
		 */
		int randomNum = (int)(Math.random() *10+1); // *100 1~100사이
		int total=0; // for문(반복문) 안에 넣지 말고 밖으로 빼라
		for(int i=1; i<randomNum; i++) {
			total+=i;
		}
		System.out.printf("%d까지의 총합: %d",randomNum, total);
	}
	public static void method6() {
		final String STR = "Stroy"; // 상수의 변수명은 대문자로 작성, 단어가 하나 이상인 경우 _ 언더바로 구분
		for(int i=0; i<STR.length(); i++) {// 문저열의 길이는 .length() , <= 넣으면 안됨 index는 0부터 시작
			System.out.println(STR.charAt(i));
				//위의 코드와 동일함
				//char ch = STR.charAt(i); 
				//System.out.println(ch);
		}
		int k;
		for(k=10; k>=3; k--) {}
		System.out.println("k: "+k);
		System.out.println("-------------");
		int j;
		for(j=0; j<10; j+=2) {
			System.out.println("j: "+j);
		}
	}
	public static void method7() {
		// 사용자에게 2~9 사이 정수 입력받아 해당 구구단 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("2~9 사이의 정수를 입력: ");
		int n1 = sc.nextInt();
		if(2<=n1 && n1<=9) {
				for(int j=1; j<=9; j++) {
					System.out.printf("%d x %d = %d\n", n1, j, n1*j);
				}
		}else {
			System.out.print("잘못된 숫자 입니다");
		}
		sc.close();
	}
	public static void method8() {
		// 세로로 출력
		/*for(int dan=2; dan<=9;dan++){
			
			for(int j=1; j<=9; j++) {
				System.out.printf("%d x %d = %d\n", dan, j, dan*j);
			}
		}
		*/
		// 가로로 출력
		for(int i=1; i<=9; i++) {
			for(int k=2; k<=9; k++) {
				System.out.printf("%d x %d = %d\t", k, i, i*k);
			}
			System.out.println();
		}
	}
	public static void method9() {
		
	}
}
