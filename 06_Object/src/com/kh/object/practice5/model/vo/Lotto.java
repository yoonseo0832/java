package com.kh.object.practice5.model.vo;

public class Lotto {
	private int[] lotto;
	{
		// 중복하지 않는 1~45까지의 난수들로 배열 초기화(6)
		/*lotto = new int[6];
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45+1);
		}
		*/
	}
	public Lotto() {
		lotto = new int[6];
		// 난수 만들기(1~45)
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45+1);
			
			// 중복 제거 
			for(int j=0; j<i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}
	}
	//메소드부===================
	public void information() {
		//반복문을 이용하여 배열 출력
		
		// for-each 문: 배열의 첫 위치부터 마지막 위치까지 변수를 통해 접근
		for(int value:lotto) {
			System.out.print(value+ " ");
		}
		System.out.println();
	}
}
