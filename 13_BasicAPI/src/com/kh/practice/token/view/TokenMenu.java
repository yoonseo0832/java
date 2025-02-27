package com.kh.practice.token.view;

import java.util.Scanner;
import com.kh.practice.token.controller.TokenController;

public class TokenMenu {
	private Scanner sc =new Scanner(System.in);
	private TokenController tc = new TokenController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("1. 지정 문자열");// ➔ tokenMenu()
			System.out.println("2. 입력 문자열");// ➔ inputMenu()
			System.out.println("3. 프로그램 끝내기");// ➔ “프로그램을 종료합니다” 출력 후 종료
			// 잘못 입력했을 시 “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 반복
			System.out.print("번호 입력: ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: tokenMenu(); break;
			case 2: inputMenu(); break;
			case 3: System.out.println("프로그램을 종료합니다"); return;
			default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	public void tokenMenu() {
		String str = "J a v a P r o g r a m ";
		// 토큰 처리 전 글자, 토큰 처리 전 개수를 출력
		System.out.println("토큰 처리 전 글자: "+str+"\n"+"토큰 처리 전 글자개수: "+str.length());
		//System.out.println(count);
		String after =tc.afterToken(str);
		// TokenController(tc)의 afterToken()의 반환 값을 가지고
		System.out.println("토큰 처리 후 글자: "+after+"\n"+"토큰 처리 전 글자개수: "+after.length());
		// 토큰 처리 후 글자, 토큰 처리 후 개수, 모두 대문자로 변환 한 것을 출력
		System.out.println("모두 대문자로 출력: "+after.toUpperCase());
	}
	public void inputMenu() {
		System.out.print("문자열을 입력하세요 :");
		String str = sc.nextLine();
		System.out.println("첫 글자 대문자 : " +tc.firstCap(str));
			// tc에 firstCap()로 입력 받은 문자열을 넘기고 반환 값 출력
		System.out.print("찾을 문자를 하나 입력하세요 :");
		char ch = sc.nextLine().charAt(0);
		System.out.println(ch+"가 들어간 개수: "+tc.findChar(str, ch));
			// tc에 findChar()로 위에 입력 받은 문자열과 방금 받은 문자를 인자로 넘겨
			// 반환 값 출력
	}
}
