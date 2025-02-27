package com.kh.exception;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Run {
	/*
	 * 에러 종류
	 * - 시스템 에러: 컴퓨터의 오적동으로 발생된 에러
	 * 		=> 코드로 해결 불가(심각한 오류임)
	 * - 컴파일 에러: 문법 상의 오류
	 * 		=> 빨간 줄로 오류를 파악할 수 있음
	 * 		(개발자의 실수) => 발견 후 수정(해결 쉬운 오류)
	 * - 런타임 에러: 코드 상의 문제는 없으나 실행 중 발생할 수 있는 오류
	 * 		=> 사용자의 실수 또는 미처 처리하지 못한 기능에 의해 발생
	 * - 논리적 에러: 문법상, 실행 시 문제 없으나, 프로그램의 의도와 맞지 않은 동작이나 결과를 나타내는 오류
	 * 
	 * 컴파일 에러, 런타임 에러, 논리적 에러와 같은 개발자가 예측 가능하고 수정할 수 있는 에러들을 
	 * => "예외"(Exception)라고 표현
	 * 예외처리하는 이유이자 목적은, 예외처리하지 않은 경우 프로그램이 비정상적으로 종료될 수 있기 때문에
	 * 프로그램이 정상적으로 실행될 수 있게 하기 위함 
	 * 
	 *  *예외처리 방법
	 *  - 직접 처리 : try~catch문 이용 (=> 메소드 구현부)
	 *  - 위임(떠넘기기=throw): throws 이용 (=> 메소드 머리부) 
	 */
	public static void main(String[] args) {
		//method1(); //static 이여서 기울림으로 표현된 것임
		//method2();
		method3();
	}
	public static void method1() { //사용할려면 public static void로 선언해야함,
		// unchecked exception은 예외처리 필수 아니지만, 실행 중 발생 가능성이 있는 예외
		
		try {// 오류 범위가 넓어짐
			Scanner sc = new Scanner(System.in);
			//TODO 아래 내용이 정상적으로 실행될 수 있도록 예외처리 적용
			System.out.print("a/b...a?");
			int a = sc.nextInt();
			
			System.out.print("a/b...b?");
			int b = sc.nextInt();
			//예외가 발생할 가능성이 있는 코드를 try블록에 넣음
			System.out.printf("%d / %d = %d\n", a, b, a/b);
		}catch(ArithmeticException e){//예외클래스명을 입력 변수와 함께
			//System.out.println("입력 오류 발생!");
			System.out.println("오류 내용: "+ e.getMessage());
			e.printStackTrace();
		}catch(InputMismatchException e){
			System.out.println("오류 내용: "+ e.getMessage());
			e.printStackTrace();
		}
		System.out.println("==========method1 finish===========");
	}
	public static void method2() {
		/*
		 * checked exception : 반드시 예외처리를 해야하는 예외(오류)
		 * => 조건문 사용 불가: 예측이 불가능한 곳에서 문제 발생되기 때문에 예외처리를 해야함
		 * 					외부 매체와의 입출력 시 발생
		 * 
		 * BufferedReader: Scanner와 같이 키보드로부터 값을 입력받을수 있는 객체 => 문자열로 값을 읽어옴
		 */
		BufferedReader br = new BufferedReader(
						new InputStreamReader(System.in)
				);
		String str = null; // 입력된 값을 저장하기 위한 변수
		try {
			str = br.readLine();//IOException=> 예외처리가 필수적임
		}catch(IOException e){
			System.out.println("오류 내용: "+ e.getMessage());
			e.printStackTrace();
		}
		System.out.println("입력된 값: "+ str);
	}
	public static void method3() {
		// 나만의 예외만들기 => 예외 발생시키기		
		// [1] 예외클래스 정의하기 => MyException class add
		// [2] 예외 발생시키기 => throw new MyException();
		try{
			//throw new MyException();
			throw new MyException("내가 만든 예외 발생된다!@@@");
		}catch(MyException e) {
			System.out.println("내가 만든 예외 발생!!!!!");
			System.out.println(">>> "+ e.getMessage());
		}
		// => 예외가 발생됨 --> 예외처리를 해야함
	}
}
