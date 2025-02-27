package com.kh.practice.list.library.model.vo;

import java.util.Objects;

import com.kh.set.Student;

public class Book implements Comparable<Book>{
	private String title;
	private String author;
	private String category;
	private int price;

	public Book() {}
	
	public Book(String title, String author, String category, int price) {
		this.title=title;
		this.author=author;
		this.category=category;
		this.price=price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(title, author, category, price);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book) {
			Book b =(Book)obj; //다운캐스팅 : 형변환 
			if(this.title.equals(b.getTitle())
					&& this.author==b.getAuthor() 
					&& this.category==b.getCategory()
					&& this.price ==b.getPrice()){
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+title+"/"+author+"/"+category+"/"+price+")";
	}
	/**
	 * Comparable인터페이스 메소드 재정의 하려면 
	 * @return
	 */
	@Override
	public int compareTo(Book o) {
		//정렬기준에 대하여 작성 || 반환값에 따라 정렬 순서가 정해짐
		//-> 책 이름 오름차순(String)
		
		// 반환 값에 따라 정렬 순서가 정해짐
		/*
		 * 0: 동일한 값
		 * 음수: A.CompareTo(B) => A B 순서로 정렬
		 * 양수: B.CompareTo(A) => B A 순서로 정렬
		 */
		/*
		 * String의 경우 CompareTo 메소드가 재정의되어 있음
		 */
		return this.title.compareTo(o.getTitle());
	}
	
}
