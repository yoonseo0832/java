package com.kh.list;

import java.util.LinkedList;

public class MyStack {
	private LinkedList<String> arrStack = new LinkedList<>();
	/**
	 * 데이터를 리스트 끝에 추가ㅣ
	 * @param data 추가할 데이터
	 */
	public void push(String data) {
			arrStack.add(data);
	}
	/**
	 * 리스트 끝의 데이터를 제거
	 * @return 제거된 데이터
	 */
	public String pop() {
		//리스트가 비어있는 경우, "리스트가 비었습니다" 반환
		if(arrStack.isEmpty()) return "리스트가 비었습니다";
		
		//그렇지 않으면 리스트 끝의 데이터를제거 하여 반환(마지막 위치)
		return arrStack.remove(arrStack.size()-1);

	}
	
}
