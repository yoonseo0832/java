package com.kh.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;
public class ListPractice {
	/*
	 * List 특징 : 순서가 있고, 중복이 가능한 컬렉션
	 * 
	 * * ArrayList 
	 *   : 배열 기반의 구조
	 *     데이터 조회가 빠름
	 *     데이터 추가/삭제 시 내부로직 복잡하여 오래 걸림
	 * 
	 * * LinkedList
	 *   : 리스트 기반의 구조
	 *     데이터 추가/삭제가 빠름
	 *     데이터 조회가 느림
	 *     
	 * * 메소드
	 * 	 - 데이터 추가 : add(데이터)
	 *   - 데이터 삭제 : remove(인덱스)
	 *   - 데이터 조회 : get(인덱스)
	 *   - 데이터 수정 : set(인덱스, 변경할데이터)
	 *   - 저장된 데이터 크기 : size()
	 */
	public static void main(String[] args) {
		//arrayListTest();
		//LinkedListTest();
		//LinkedListTest1();
		//stackTest();
		 queueTest();
	}
	// 제네릭을  적용핶음
	public static void queueTest() {
		/*
		 * 큐: Queue 
		 * - 데이터 추가 : enqueue 끝에 추가
		 * - 데이터 제거: dequeue 처음 위치부터 제거
		 */
		MyQueue queue = new MyQueue();
		queue.enQueue("엄마는 외계인");
		queue.enQueue("딸기 쥬블렛");
		queue.enQueue("아몬드봉봉");
		queue.enQueue("레인보우샤베트");
		
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		
		System.out.println(queue.deQueue());
	}
	public static void stackTest() {
		/*
		 * 스택: LIFO: Last In First Out
		 * 	- 가장 마지막에 저장된 데이터가 제일 처음에 꺼내올 수 있는 구조
		 *  - 데이터 추가(push()): 끝에 추가  	- 데이터 제거(pop()): 마지막 위치부터 제거
		 *  ----------------
		 *  	MyStack
		 *  ----------------
		 *  - arrStack : LinkedList<String> = new LinkedList<>();
		 *  + push(data:String):void  // 데이터 추가
		 *  + pop(data:String):void // 데이터 삭제
		 */
		MyStack stack = new MyStack();
		stack.push("망고주스"); //[망고]
		stack.push("커피"); //[망고주스, 커피]
		stack.push("콩나물국밥"); //[망고주스, 커피, 콩나물국밥]
		
		
		System.out.println(stack.pop()); //콩나물국밥
		System.out.println(stack.pop()); //커피
		System.out.println(stack.pop()); //망고주스
		System.out.println(stack.pop()); //남아있는게 없어서 리스트 비었음 출력
	} 
	public static <E> void printItem(List<E> list) {
		// List => ArrayList 또는 LinkedList  => 부모타입 List
		// ArrayList<String> 또는 LinkedList<INteger> ==> 제네릭 적용 필요
		//List<String> list = new ArrayList(new LinkedList<>();

		for(int i=0; i<list.size(); i++) {
			System.out.println(i+"번째: "+list.get(i));
		}
	}
	public static void LinkedListTest1() {

		List<Integer> list = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("랜덤 숫자 입력: ");
		int count = sc.nextInt();
		
		for(int i=0; i<count; i++) {
			int random = (int)(Math.random()*count+1);
			list.add(random);
		}
		/*
		for(int i=0; i<list.size(); i++) {
			System.out.println(i+"번째: "+list.get(i));
		}*/
		printItem(list);
	}
	public static void LinkedListTest() {
		Random ran = new Random();
		List<Integer> list = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("랜덤 숫자 입력: ");
		int num = sc.nextInt();
		int randomNum =ran.nextInt(num)+1;
		list.add(randomNum);//(Math.random()*num+1);
		for(int i=0; i<list.size(); i++) {
			System.out.println("1~"+num+"사이: "+list.get(i));
		}
	}
	public static void arrayListTest() {
		// 문자열 데이터를 관리하는 ArrayList 객체 생성
		// ArrayList<String> list = new ArrayList<>();
		List<String> list = new ArrayList<>();
		
		list.add("헤이즐넛");
		list.add("아메리카노");
		list.add("카모마일");
		
		// ["헤이즐넛", "아메리카노", "카모마일"]		
		System.out.println(list);
		
		// * "아메리카노"를 또 추가한다면?
		list.add("아메리카노");
		System.out.println(list);
		
		// * 첫번째 "아메리카노" 데이터를 삭제
		list.remove(1);
		System.out.println(list);
		
		list.set(1, "유자차");
		System.out.println(list);
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(i+"번째: "+ list.get(i)+" ");
		}
		
		printItem(list);
	}
	
}
