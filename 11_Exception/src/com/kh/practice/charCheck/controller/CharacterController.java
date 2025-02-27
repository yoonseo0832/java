package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {
	public CharacterController() {} 
	
	public int countAlpha(String s) throws CharCheckException{// 영문자 개수 
		if (s.contains(" ")) {
			// CharCheckException 예외 발생시키기!!
			// => throw 예외클래스객체생성;
			// => throw new 예외클래스생성자;
			throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
		}
		// 문자열에 공백이 없을 경우 아래 내용아 실행됨
		int count =0;
		
		s=s.toLowerCase(); //문자열를 모두 소문자롤 변환
		for(int i =0; i<s.length(); i++) {
			// 문자열.toUpperCase(): String 문자열를 모두 대문자로 변환 // 문자열.toLowerCase(): String
			char ch = s.charAt(i);
			if((ch>='a'&&ch<='z')/* || ch>='A'&& ch<='Z'*/) {
				count++;
			}
		}
		return count;
	}
}
