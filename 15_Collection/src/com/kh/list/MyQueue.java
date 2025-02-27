package com.kh.list;

import java.util.ArrayList;

public class MyQueue {
	private ArrayList<String> queue = new ArrayList<>();
	/**
	 * 리스트 끝에 데이터 추가
	 * @param data
	 */
	public void enQueue(String data) {
		queue.add(data);
	}
	/**
	 * 리스트 맨 앞에 데이터를 제거 후 반환
	 * @return
	 */
	public String deQueue() {
		if(queue.isEmpty()) return "리스트(큐)가 비었습니다.";
		return queue.remove(0);
	}
}
