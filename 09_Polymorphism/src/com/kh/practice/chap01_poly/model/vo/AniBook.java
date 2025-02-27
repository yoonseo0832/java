package com.kh.practice.chap01_poly.model.vo;

public class AniBook extends Book{
	private int accessAge;
	
	public AniBook() {}
	
	public AniBook(String title, String author, String publisher, int accessAge) {
		//부모클래스 생성자는 항상 첫줄에 작성(제일 먼저 실행)
		super(title, author, publisher);
		this.accessAge = accessAge;
	}
	
	public int getAccessAge() {
		return accessAge;
	}

	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}

	@Override
	public String toString() {
		return "AniBook ["+ super.toString()	// => 부모클래스(Book) toString() 실행
				+", accessAge=" + accessAge + "]";
	}
}
