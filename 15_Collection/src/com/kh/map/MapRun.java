package com.kh.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapRun {
/*
 * Map<K,V> 특징
 * - key-value 형식으로 데이터를 관리
 * 		key에 해당하는 데이터: 중복 허용하지 않음(Set 방식)
 * 		value에 해당하는 데이터: key값이 중복되지 경우, 중복 허용(List 방식)
 * 	- 메소드
 * 		데이터 추가: put(키에_해당하는_값, value에_해당하는_값)
 * 		데이터 삭제: remove(키에_해당하는_값)
 * 		데이터 조회: get(키에_해당하는_값)
 * 		키 목록 조회: keySet(): set()리턴타입
 * 		저장된 데이터 길이 조회: size()
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//System.out.println(); => sysout+ ctrl+space
		HashMap<Integer, String> hMap = new HashMap<>();
		hMap.put(1000, "HTML");
		hMap.put(1001, "CSS");
		hMap.put(1002, "JS");
		hMap.put(1003, "Java");
		
		// 키 목록 조회
		Set<Integer> keyList = hMap.keySet(); //키 값의 자료형=Integer
		System.out.println("------key List------");
		for(Integer key: keyList) {
			System.out.println(key);
		}
		//키를 이용하여 데이터=value 출력
		System.out.println("---------------");
		for(Integer key: keyList) {
			System.out.println(key+ ": "+hMap.get(key));
		}
		//js 데이터 제거
		System.out.println("---------------");
		hMap.remove(1002);
		Iterator<Integer> it = keyList.iterator();
		while(it.hasNext()) { //키 목록
			int k = it.next(); //키값
			System.out.println(k+": "+hMap.get(k));
		}
		/// ---------------------------------------
		// entrySet() : key-value 세트의 집합
		Set entrySet = hMap.entrySet();
		Iterator entryIt = entrySet.iterator();
		// 타입이 => Iterator<Entry<Integer,String>>
		while(entryIt.hasNext()) {
			Entry entry = (Entry) entryIt.next();// Entry타입으로 다운캐스팅해야함 Object에서 다운
			// 타입이 => Entry<Integer,String>
			Integer key = (Integer)entry.getKey();//다운캐스팅
			String value = (String)entry.getValue();//value값 조회 , 다운캐스팅 to String from Object
			
			System.out.println(key+":::"+value);
		}
	}

}
