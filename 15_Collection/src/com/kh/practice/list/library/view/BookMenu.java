package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner; //Ctrl+shift+o
import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();

	public void mainMenu() {
		System.out.println("== Welcome KH Library ==");
		while (true) {
			System.out.println("1. 새 도서 추가"); // insertBook () 실행
			System.out.println("2. 도서 전체 조회"); // selectList ()
			System.out.println("3. 도서 검색 조회"); // searchBook ()
			System.out.println("4. 도서 삭제"); // deleteBook ()
			System.out.println("5. 도서 명 오름차순 정렬"); // ascBook()
			System.out.println("9. 종료"); // “프로그램을 종료합니다.” 출력 후 main()으로 리턴
			System.out.print("메뉴 번호 선택 : ");
			int menu = sc.nextInt();

			sc.nextLine();

			switch (menu) {
			case 1:
				insertBook();
				break;
			case 2:
				selectList();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				deleteBook();
				break;
			case 5:
				ascBook();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
				break;
			}
		}

	}

	public void insertBook() {
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		System.out.print("장르(1.인문 / 2.자연과학 / 3.의료 / 4.기타) : ");
		int category = sc.nextInt();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		String str = "";

		switch (category) {
		case 1:
			str = "인문";
			break;
		case 2:
			str = "자연과학";
			break;
		case 3:
			str = "의료";
			break;
		case 4:
			str = "기타";
			break;
		}

		//Book b = new Book(title, author, str, price);
		String[] categories = { "인문", "자연과학", "의료", "기타" };
		Book b = new Book(title, author, categories[category - 1], price);

		bc.insertBook(b);
	}

	public void selectList() {
		ArrayList<Book> bookList = bc.selectList();
		if (bookList.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다");
		}
		for(int i=0; i < bookList.size(); i++) {	
			System.out.println(bookList.get(i)/*.toString()*/);
		}
	}

	public void searchBook() {
		System.out.print("도서명 키워드로 입력 받기: ");
		String keyword = sc.nextLine();
		
		ArrayList<Book> searchList = bc.searchBook(keyword);
		if (searchList.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다");
		}else {
			for (Book sl : searchList) {
				System.out.println(sl);
			}
		}
		
	}

	public void deleteBook() {
		System.out.print("도서명 입력 받기: ");
		String title = sc.nextLine();
		System.out.print("삭제할 저자명 입력 받기: ");
		String author = sc.nextLine();
		
		Book remove =bc.deleteBook(title, author);
		
		if(remove !=null) {
			System.out.println("성공적으로 삭제되었습니다.");
		}else {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		}
	}

	public void ascBook() {
		int result = bc.ascBook();
		if (result == 1) {
			System.out.println("정렬에 성공했습니다.");
		} else {
			System.out.println("정렬에 실패했습니다.");
		}
	}
}
