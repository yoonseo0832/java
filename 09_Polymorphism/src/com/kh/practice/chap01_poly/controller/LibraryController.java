package com.kh.practice.chap01_poly.controller;
import com.kh.practice.chap01_poly.model.vo.*;
public class LibraryController {
	private Member mem =null;
	private Book[] bList = new Book[5];
	{
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}
	public void insertMember(Member mem) {
		//전달받은 mem (매개변수) 주소값을 통해
		// LibraryController의mem에 대입()인스턴스, 필드 ==> setter 역할과 동일
		this.mem=mem;
	}
	public Member myInfo() {
		//회원 레퍼런스(mem) 주소값을 리턴 ==> getter 역할
		return mem;
	}
	public Book[] selectAll() {
		/*
		for(int i=0; i<bList.length; i++) {
			bList[i];
		}
		*/
		//도서 전체 목록 bList 주소값 리턴 => bList 필드의 getter 메소드
		return bList;
	}
	public Book[] searchBook(String keyword) {
		int count=0; // 조회 결과를 담을 배열 searchList의 인덱스
		Book[] searchList = new Book[bList.length]; //저장되어있는 배열 만큼 생성
		// i변수는 bList 배열의 인덱스로 사용할것
		for(int i=0; i<bList.length;i++) {
			if(bList[i]!=null 
					&& bList[i].getTitle().contains(keyword)) {
				//&& bList[i].getTitle().contains(keyword) 두개의 조건문으로 코드를 길게 하는 것 보다 && 를 사용해서 줄수 있음
				// 만들어놓은 배열의 제목이 keyword를 포함하고 있음, 문자열.contain()
				searchList[count++]=bList[i];
				//후위연산자인++을 인덱스 뒤에 붙여도 따로 있을때랑 동일한 코드임
			}
		}
		return searchList;
	}
	
	public int rentBook(int index) {
		int result =0;
		//만약 음수/그 이상의 값 전달되면 오류 발생!
		if(index>=0 && index<bList.length) {
			Book b = bList[index];
			if(b instanceof AniBook) {
				if( mem!=null &&((AniBook)b).getAccessAge()> mem.getAge()) { //book에서 ainbook 강제 형변환
					result =1;
					
				}
			}else if(b instanceof CookBook){
				if(mem!=null&& ((CookBook)b).isCoupon()){
					mem.setCouponCount(mem.getCouponCount() +1);
					result=2;
				}
			}
		}
		return result;
	}
}
