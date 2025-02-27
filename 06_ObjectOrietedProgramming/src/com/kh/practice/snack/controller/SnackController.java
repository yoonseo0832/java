package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	private Snack s = new Snack();
	
	//생성자부
	
	public SnackController() {}
	
	//메소드부
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		// 데이터를 setter 이용해 저장
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		
		// 저장완료 되었다는 결과 반환하는 메소드
		return "저장 완료되었습니다.";
	}
	public String comfirmData() {
		// 저장된 데이터 반환하는 메소드
		// 데이터 Snack 객체에 저장된 데이터 반환하면 됨
		String data = s.information();
		return data;
		// return s.information(); 위와 동일
	}
	
}
