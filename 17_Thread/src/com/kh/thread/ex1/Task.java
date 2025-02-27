package com.kh.thread.ex1;

// Thread 쓰데드 클래스 상속
public class Task extends Thread{

	//메인 메소드처럼 독립적으로 실행될 수 있는 메소드 => run 메소드 Override(오버라이딩)
	@Override
	public void run() {
		int n1 = 20;
		int n2 = 50;
		// 현재 스레드 정보: Thread.currentThread()
		String name = Thread.currentThread().getName();
		System.out.println(name+": "+(n1+n2));
	}
	
	
}
