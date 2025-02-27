package com.kh.practice.list.library.controller;

import java.util.*;
import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	private List list = new ArrayList();
	ArrayList<Book> bookList = new ArrayList<>();
	
	public BookController() {

		
		bookList.add(new Book("자바의 정석", "남궁 성", "기타", 20000));
		bookList.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
		bookList.add(new Book("대화의 기술", "강보람", "인문", 17500));
		bookList.add(new Book("암 정복기", "박신우", "의료", 21000));
	}
	
	public void insertBook(Book bk) {
		bookList.add(bk);
	}
	
	public ArrayList selectList() {
		return bookList;
	}
	
	public ArrayList<Book> searchBook(String keyword) {
		ArrayList<Book> searchList = new ArrayList<>();
		for(Book b: bookList) {
			if(b.getTitle().contains(keyword)) {
				searchList.add(b);
			}
		}
		return searchList;
	}
	// 추가하고 반환하라는 말은 일단 반복문에서 리스트에 값을 추가하고 나서 반복문 끝나고 리턴하라는 말
	
	public Book deleteBook(String title, String author) {
		Book removeBook = null;
	
		for(Book b: bookList) {
			if(title.equals(b.getTitle()) && author.equals(b.getAuthor())) {
				bookList.remove(b.getPrice());
				bookList.remove(b.getTitle());
				bookList.remove(b.getAuthor());
				bookList.remove(b.getCategory());
				removeBook = b;
			}
		}
		return removeBook;
	}
	
	/**
	 * 책 명 오름차순 정렬 메소드
	 * @return1
	 */
	public int ascBook() {
		// 책 이름으로 오름차순 정렬

		//Collections.sort(컬렉션객체)
		//=> 대상(Book) 클래승스에 compareTo 메소드를 참고하여 정렬 
		// -> 재정의!! 정렬기준으로 재정의
		Collections.sort(bookList);
		return 1;
	}
}
