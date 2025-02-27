package com.kh.object.ex3;

public class Book {
	/*
	 * 접근 제한자: 클래스 내 멤버(변수, 메소드)들에 접근할 수 있는 범위를 제한함
	 * 			클래스 정의에도 사용
	 * 	- 클래스에 사용 가능한 접근 제한자: 2가지
	 * 		: public, default
	 *  - 클래스 내 멤버(필드(변수), 메소드)에 사용할 수 있는 접근제한자: 4가지
	 *  	public: (같은 패키지 또는 다른 패키지에 있어도)어디서든 접근가능
	 *  	protected: 같은 패키지 또는 상속관계일때 접근 가능(상속: 다른 패키지도 가능)
	 *  	default: 같은 패키지에서만 접근 가능
	 *  	private: 해당 클래스에서만 접근 가능
	 */
	// 필드부(클래스 내에만 접근 가능하게 만듦)----------------------------------------
	// 표현식 - 접근제한자[예약어: 상수형final] 자료형 변수명; // 예약어 생략 가능 []
	private String title; //제목 title:String
	private String genre; // 장르 genre:String
	private String author; //저자 author:String
	private int maxPage; //페이지 수 maxPage:int
	// 필드부는 해당 객체가 가질 데이터를 정의하는 부분, 사용할 변수를 정의
	
	//생성자부-------------------------------------------------------------------
	// * 생성자 역할: 정의한 현재 클래스를 생성할 때 사용되는 메소드!
	// * 객체를 생성할 때 데이터를 초기화하기 위한 목적으로 생성자를 정의함
	
	// 규칙: 
	// 1. 생성자명 = 클래스명
	// 2. 반환형을 표시 안함, 반환되는 값도 없음!
	public Book() { }// 기본 생성자
	// => 생성자를 따로 정의하지 않으면 컴파일러를 통해 기본생성자를 만들어줌!
	
	// 매개변수 정보(개수, 종류, 순서)를 구분하여 정의하면 생성자도 오버로딩이 적용
	
	//매개변수 3개인 생성자(제목, 장르, 저자 정보 가짐)
	public Book(String title, String genre, String author) {
		this.title = title; 
		this.genre = genre;
		this.author = author;
		// 대입할 대상에게 this키워드를 줘서 this가 의미하는 것은
		// 	this  =>현재 클래스내에 있는 title변수에 전달받은 title값을 대입
		
		// 위의 3줄 코드와 동일함, 아래의 한줄과
		//this(title, genre, author, 0);
		// this() 를 사용하면 클래스내의 다른 생성자를 호출할 수 있음
	}
	// 매개변수가 4개인 생성자
	public Book(String title, String author, String genre,int maxPage) {
		this.maxPage = maxPage;
		this.title = title;
		this.genre = genre;
		this.author = author;
	}
	//-------------------------------------------------------------------------
	
	//메소드부-------------------------------------------------------------------
	//private 변수에 접근하기 위한 메소드(getter/setter)
	
	// 제목 저장하는 변수의 값 조회 메소드(getter)
	// => 제목에 대한 정보를 반환해줘야함 자료형에 맞춰서
	public String getTitle() {
		return title;
	}
	//제목에 대해 값을 저장하기 위한 메소드(setter)
	// => 저장할 값을 전달받아 변수에 저장
	public void setTitle(String title) {
		this.title = title;
	}
	
	//저장된 데이터(변수)들을 조회하는 메소드(toString)
	public String toString() {
		return "제목: "+title+"\n"+"장르: "+ genre+ "\n"+"저자: "+ author+ "\n"+"페이지수: "+ maxPage;
	}
	//-------------------------------------------------------------------------
	
}
