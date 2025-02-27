package com.kh.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetRun {
/*
 * Set 특징
 * - 순서 없음, 중복 허용 안함(불가)
 * 
 * 해쉬(Hash) 알고리즘
 * : 특정 기준에 따라 데이터를 분류하는 방식(알고리즘)
 * - 중복 데이터 판단: HashCode(), equals() 메소드
 * 		[1] HashCode : 기준이 되는 값(데이터)를 정의
 * 		[2] equals : HashCode 값이 같을 경우 동일 데이터를 판단하는 로직을 정의
 * - 메소드
 * 1. 데이터 추가: add(데이터)
 * 2. 데이터 제거: remove(데이터)
 * 3. 저장된 데이터 크기: size()
 * 4. 데이터 조회
 * 	[1] Iterator(반복자) 사용
 * 		- Iterator 객체 생성: Set변수명.iterator()
 * 		- 데이터 유/무 판단: Iterator변수명.hasNext()
 * 		- 데이터 조회: Iterator변수명.next()
 *  [2] 향상된 for문(for-each문)
 *  	for(Set에_지정한 타입 변수명: Set변수명){
 *  		//변수명을 통해 데이터 접근
 *  	}
 */
	public static void main(String[] args) {
		//순서는 상관없음
		// TODO Auto-generated method stub
		HashSet hSet1 = new HashSet();
		hSet1.add("오늘은 금요일");
		//System.out.println(hSet1);
		//생성자 통해서 데이터 추가하는 방법
		hSet1.add(new String("오늘은 금요일"));
		hSet1.add(new String("어제는 목요일"));
		hSet1.add(new String("아메리카노"));
		hSet1.add(new String("라떼"));
		System.out.println(hSet1);
		/*
		 * String
		 * 		-hashCode(): "실제 담긴 문자열"을 10진수 형태로 변환하여 리턴
		 * 		-equals(): hashCode 결과가 같으면, "실제 담긴 문자열" 가지고 동등비교하여 일치하면 true, 
		 * 				   그렇지 않으면 false 반환
		 */
		HashSet<Student> hSet2 = new HashSet<>();
		hSet2.add(new Student("아이유", 30, 70));
		hSet2.add(new Student("김우빈", 35, 100));
		hSet2.add(new Student("수지", 29, 56));
		hSet2.add(new Student("수지", 29, 56));
		hSet2.add(new Student("장기용", 33, 99));
		
		System.out.println(hSet2); //=> 인덱스라는 개념이 없기에 get() 메소드 사용 불가
		
		// for-each문 사용해 출력하는 방법
		for(Student s: hSet2) {
			System.out.println(s);
		}
		
		// Iterator 반복자를 사용
		Iterator<Student> it = hSet2.iterator(); // Iterator 객체 생성
		
		while(it.hasNext()) {  // 데이터 유무 확인
			Student s = it.next(); // 데이터 조회
			System.out.println(s.getName()+" "+ s.getAge()+" "+s.getScore());
		}
		// Set => List addAll
		ArrayList<Student> list = new ArrayList<>();
		list.addAll(hSet2); // List구조에 Set구조 데이터 추가
		
		for(int i=0;i<list.size();i++) {
			System.out.println("["+(i+1)+"] "+ list.get(i));
		}
	}

}
