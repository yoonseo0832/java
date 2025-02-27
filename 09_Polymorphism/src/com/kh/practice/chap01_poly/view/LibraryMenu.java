package com.kh.practice.chap01_poly.view;
import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.*;
import java.util.Scanner;

public class LibraryMenu {
	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		System.out.print("이름: ");
		String name=sc.next();
		
		System.out.print("나이: ");
		int age= sc.nextInt();
		
		System.out.print("성별: ");
		char gender=sc.next().charAt(0);
		
		Member m = new Member(name, age, gender);
		lc.insertMember(m);
		
		while(true) {
			System.out.println("========메뉴===========");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 검색");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호: ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1: 
				Member memInfo = lc.myInfo();
				System.out.println(memInfo.toString());
				break;
			case 2: 
				selectAll();
				break;
			case 3: 
				searchBook();
				break;
			case 4: 
				rentBook();
				break;
			case 9: 
				System.out.println("프로그램을 종료합니다");
			return;
				default: 
					System.out.println("잘못입력되었습니다");
			}
		}
	}

	
	public void selectAll() {
		//결과 값 Book[] 자료형 bList에 담기
		Book[] bList=lc.selectAll();
		for(int i=0;i<bList.length;i++) {
			System.out.printf("%d번 도서: %s\n", i, bList[i]);
			// bList[] 배열의 책 리스트를 출력
		}
	}
	
	public void searchBook() {
		//LibraryController의 searchBook()에 전달
		//그 결과 값을 Book[] 
		System.out.println("검색할 제목 키워드: ");
		String keyword = sc.next();
		
		Book[] searchList =lc.searchBook(keyword);
		for(Book b:searchList) {
			if(b!=null) {
				System.out.println(b);
			}
		}
	}
	
	public void rentBook() {
		selectAll();
		System.out.print("대여할 도서 번호 입력: ");
		int idx = sc.nextInt();
		
		int result =lc.rentBook(idx);
		if(result==0) {
			System.out.println("성공적으로 대여되었습니다");
		}else if(result==1) {
			System.out.println("나이 제한으로 대여 불가합니다");
		}else if(result==2) {
			System.out.println("성공적으로 대여되었습니다, 요리학원 쿠폰이 발급되었으니 마이페이지를 확인하세요");
		}else {
			System.out.println("결과값 확인 불가@@");// 로그로 확인하는 용도
		}
	}
}
