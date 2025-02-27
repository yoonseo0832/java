package com.kh.io;

import java.io.File;
import java.io.IOException;

public class IO01_File {
	/*
	 * 파일 클래스 사용 (java.util.File)
	 */
	public static void main(String[] args) {
		//fileTest1();
		fileTest2();
	}
	public static void fileTest2() {
		// sample 폴더 생성 myDiary.txt 파일 만들기
		File folder = new File("sample");
		// smaple이라는 폴더가 존재하는지 확인: .exists()
		if(!folder.exists()) {
			// 존재하지 않을 경우 폴더 생성
			folder.mkdir();
		}
		File f1 = new File("sample//myDiary.txt");
		
		try {
			// myDiary.txt 파일이 존재하는지 확인
			if(!f1.exists()) {
				// 파일 존재하지 않으면 파일 생성, 
	//.createNewFile();=> IOException 오류 발생해 try-catch문으로 오류 해결해야함
				f1.createNewFile();
			}
			// 파일 객체로부터 파일 정보를 얻기
			System.out.println("파일명: "+ f1.getName());
			System.out.println("파일경로(절대경로): "+ f1.getAbsolutePath());
			System.out.println("파일용량: "+ f1.length());
			System.out.println("파일상위폴더: "+ f1.getParent());
			System.out.println("파일 실행 가능?: "+ f1.canExecute());
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static void fileTest1() {
		// File 객체 생성 -> new File("파일명");
		
		// [1] 파일명만 전달하여 생성
		File f1 = new File("test1.txt");
		//생성하면 import java.io.File; 패키지 아래 추가
		
		// [2] 실제로 존재하는 폴더경로+파일명 전달해 생성
		File f2 = new File("D:\\test2.txt");
		
		// [3] 존재하지 앟는 폴더 경로+ 파일명 전달하여 생성
		//File f3 = new File("D:\\tmp\\test3.txt");
		//=> 존재하지 않는 폴더에는 파일 생성 불가
		
		// 폴더를 먼저 생성하고 파일 추가하는 방법
		File f3_folder = new File("D:\\tmp");
		File f3 = new File("D:\\tmp\\test3.txt");
		
		// [4] 파일 존재 유무확인
		File f4 = new File("test4.txt");
		// File객체명.createNewFile(); => 실제 파일을 만들어주는 메소드
		try {
			f1.createNewFile();
			f2.createNewFile();
			f3_folder.mkdir();
			// 폴더 생성: File객체명.mkdir();
			f3.createNewFile();
			
			// 파일이 존재하는지 확인하는 메소드 => .exists() : boolean
			System.out.println("f1 파일은 존재하는가? "+ f1.exists());
			System.out.println("f4 파일은 존재하는가? "+ f4.exists());
			System.out.println();
			// 파일인지 확인하는 메소드 => .isFile() : boolean
			System.out.println("f1 파일인가? "+ f1.isFile());
			System.out.println("f3_folder 파일인가? "+ f3_folder.isFile());
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		// 디버깅하고 파일이 생성되는지 확인하는 방법은 해당 java project 클릭하고 F5로 
	}
}
