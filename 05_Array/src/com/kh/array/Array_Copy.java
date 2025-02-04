package com.kh.array;

public class Array_Copy {

	public static void main(String[] args) {
		//lightCopy();
		deepCopy();
	}
	// 깊은 복사, 새로운 배열 할당해 값을 복사
	public static void deepCopy() {
		int[] origin = {1,2,3,4,5};
		//복사본 배열 선언 및 할당(원본 배열길이 만큼)
		int[] copy = new int[origin.length];
		
		/*
		 * for(int i=0; i<copy.length; i++) {
			copy[i]=origin[i];
		}
		*/
		//System.arraycopy(origin, 0, copy, 0, origin.length);
		copy = new int[10];
		System.arraycopy(origin, 2, copy, 4, 3);
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]+ " ");
		}
		copy[3] = 888;
		System.out.println("\norigin");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i]+ " ");
		}
		
		System.out.println("\ncopy");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]+ " ");
		}
		System.out.println();
		
	}
	
	//얕은 복사, 주소값 복사
	public static void lightCopy() {
		int[] origin = {1,2,3,4,5};
		System.out.println("원본 배열 출력");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i]+ " ");
		}
		System.out.println(origin);
		
		int[] copy = origin; 
		// 얕은 복사: 주소값을 복사하는 것
		System.out.println("복사본 배열 출력");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]+ " ");
		}
		System.out.println(copy);
		copy[2] = 999;
		
		System.out.println("원본 배열 출력");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i]+ " ");
		}
		System.out.println();
		System.out.println("복사본 배열 출력");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]+ " ");
		}
		System.out.println();
	}
}
