package com.kh.practice.file.view;
import java.util.Scanner;
import com.kh.practice.file.controller.*;
public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();
	
	public void mainMenu() {
		while(true) { //내용을 반복할것임 while문으로
			System.out.println("***** My Note *****");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호: ");
			int menu = sc.nextInt();
			
			sc.nextLine();
			switch(menu) {
			case 1: fileSave(); break;
			case 2: fileOpen(); break;
			case 3: fileEdit(); break;
			case 9: 
				System.out.println("프로그램을 종료합니다"); return; //return 으로 메소드 자체 종료
			default:
				System.out.println("잘못입력하였습니다. 다시 입력해주세요!"); break;
			}
		}
	}
	public void fileSave() {
		String data = "";
		
		while(true) {
			System.out.println("파일에 저장할 내용을 입력하세요.");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다");
			System.out.print("내용: ");
			String value = sc.nextLine();
			
			if(data.equals("exit")) {
				
				while(true) {
					System.out.print("저장할 파일 명을 입력해주세요(ex. myFile.txt) :");
					String fileName = sc.nextLine();
					if(fc.checkName(fileName)) {
						System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n)");
						char yn = sc.nextLine().charAt(0);
						
						if(yn =='y'|| yn=='Y') {
							fc.fileSave(fileName, data); 
							return; 
				//break; 가까운 반복문만 닫는 것인데 mainMenu()로 돌아가고 싶으면 메소드 종료 return()사용
						}
					}else {
						// 만일 저장할 파일 명이 존재하지 않는 파일 명이었다면
						// 파일 명과 내용을 fc에 fileSave 메소드로 넘김
						fc.fileSave(fileName, data); 
						return;
						}
					}
				}
			data += value + "\n";
		}
	}
	public void fileOpen() {
		System.out.println("열 파일 명: ");
		String fileName = sc.nextLine();
		
		if(fc.checkName(fileName)) {
			//String fileContents = fc.fileOpen(fileName);
			//System.out.println(fileContents);
			
			System.out.println(fc.fileOpen(fileName));
		}else {
			// 출력 후 mainMenu()로 돌아감
			System.out.println("없는 파일입니다");
		}
	}
	public void fileEdit() {
		System.out.println("수정할 파일 명 : ");
		String fileName = sc.nextLine();

		if(fc.checkName(fileName)) {
			String data = "";
			while(true) {
				System.out.println("파일에 저장할 내용을 입력하세요.");
				System.out.println("ex끝it 이라고 입력하면 종료됩니다");
				System.out.print("내용: ");
				String value = sc.nextLine();
				
				if(data.equals("exit")) {
					fc.fileSave(fileName, data); 
					return; 
				}
				data += value+ "\n";
			}
		}else {
			System.out.println("없는 파일입니다");
		}
		
	}
}

