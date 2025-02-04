package com.kh.loop;
import java.lang.Math;
public class Break {
	/*
	 * 분기문 : break;
	 * : 반복문 안에서 사용, 반복문을 멈춤/종료시킴
	 * 
	 */
	public static void main(String[] args) {
	// 랜덤 값 (1~100) 추출하여 출력
	// 짝수 일때 종료
	while(true) { // 조건식 위치에 true이면 무한루프, break;를 이용하지 않으면 계속 수행
		int random = (int)(Math.random()*100+ 1);
		if(random%2==0) {
			System.out.println("종료: "+ random);
			break;
		}else {
			System.out.println("랜덤값: "+ random);
		}
	}
	}
}
