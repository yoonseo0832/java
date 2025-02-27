package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	public TokenController() {}

	public String afterToken(String str) {
		StringTokenizer st = new StringTokenizer(str, " ");
		// 전달받은 문자열(str)과 구분자(" ")를 가지고 객체 생성
		StringBuilder sb = new StringBuilder("");
		//String after="";
		//[1] 토큰 처리 가능 여부 확인
		while (st.hasMoreTokens()) {
			//[2] 토큰 처리(=> 구분자 기준으로 문자열 분해하기)
			sb.append(st.nextToken());
			// => StringBuilder 클래스를 사용하여 토큰화된 문자열 합치기
		}
		return sb.toString(); //String after=""; 사용한 경우 => return after;

	}
	/**
	 * 첫글자만 대문자로 바꾼 문자열 반환
	 * @param input
	 * @return 첫글자만 대문자로 바꾼 문자열
	 */
	public String firstCap(String input) {
		if(input.length() <=1)return input;
		return input.substring(0, 1).toUpperCase()+ input.substring(1);
		//0번 인덱스부터1 1인덱스까지 => 0번 인덱스만 추출해서 대문자로 변경
		//1번인덱스부터 마지막 인덱스까지 추출
	}

	public int findChar(String input, char one) {
		//charAt() 사용 방법
		if(input.indexOf(one)==-1) {
			return 0;
		}
		int cnt=0;
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) ==one) {
				cnt++;
			}
		}
		return cnt;
		/*
		 * toCharArray(): char[] 메소드 사용
		int cnt = 0;
		char[] arr = input.toCharArray();
		for(char ch : arr){
			if(ch==one) cnt++;
		}
		return cnt;
		*/
	}
}
