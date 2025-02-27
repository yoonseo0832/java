package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;
import com.kh.practice.snack.model.vo.Snack;

public class SnackMenu {
	// ctrl + shift +o // import 부분 자동 생성
	Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();
	
	public void menu() {
		//기능/코드/로직은 클래스가 아니 메소드에 있어야함
		System.out.println("스낵류를 입력하세요");
		System.out.print("종류: ");
		String snackKind= sc.nextLine();
		System.out.print("이름: ");
		String snackName= sc.nextLine();
		System.out.print("맛: ");
		String snackFlavor= sc.nextLine();
		System.out.print("개수: ");
		int snackNum= sc.nextInt();
		System.out.print("가격: ");
		int snackPrice= sc.nextInt();
		
		//SnackController 객체를 통해 
		String result = scr.saveData(snackKind, snackName, snackFlavor, snackNum, snackPrice);
		System.out.println(result);
		
		//저장한 정보를 확인할 것인지 출력
		System.out.print("저장한 정보를 확인하시겠습니까(y/n): ");
		char o= sc.next().charAt(0);
		if(o=='y' || o=='Y') {
			//String data = scr.comfirmData();
			//System.out.print(data);
			System.out.print(scr.comfirmData());
		}else if(o!='n' || o!='N') {
			System.out.println("다시입력하세요");
			System.out.print("저장한 정보를 확인하시겠습니까(y/n): ");
		}
	}
	
}
