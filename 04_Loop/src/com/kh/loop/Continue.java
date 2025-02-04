package com.kh.loop;

public class Continue {
	
	public static void main(String[] args) {
		//method1();
		method2();
	}
	public static void method2() {
		int total=0;
		for(int i=1; i<=100; i++) {
			if(i%3==0 || i%5==0) {
				continue;
			}else{
				total+=i;
			}
		}
		System.out.print("총 합: "+ total);
	}
	public static void method1() {
		for(int i=1; i<=10; i++) {
			if(i%2!=0) {
				continue;
			}else {
				System.out.print(i+ " ");
			}
		}
	}
}
 