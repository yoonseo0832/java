package com.kh.loop;
import java.util.Scanner;
public class DoWhile {
	/*
	 * do~while문
	 * : 처음 무조건 먼저 실행히고 조건식 검사
	 * do{
	 * }while(조건식); 
	 * 
	 * * 실행 순서: do {} 안의 코드 수행 -> 조건식 검사 -> true일 경우 중괄호 코드 수행 -> 반복 -> 조건식 결과 false 이면 반복문 종료
	 */
	public static void main(String[] args) {
		//method1();
		// 사용자에게 입력받은 정수를 계속 더함, 단 0 입력시 종료
		Scanner sc = new Scanner(System.in);
		int sum =0;
		int num;
		
		do {
			System.out.print("정수 입력: ");
			num = sc.nextInt();
			
			sum+=num;
		}while(num != 0);
		System.out.println("총 합: "+ sum);
		
		sc.close();
	}
}
 