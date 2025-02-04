package com.kh.array;

public class Array02 {
	/*
	 * 변수 종류
	 * = 일반 변수 : 기본 자료형으로 선언된 변수, 값 자체를 담고 있는 변수 
	 * = 참조 변수(레퍼런스 변수) : 주소 값을 담고 있는 변수
	 * 	=> 그 외 자료형(int[] double[] char[] String[] Scanner, .. )으로 선언된 변수
	 * 배열 특징 
	 * - 선언하고 할당까지만 하고 초기화하지 않아도 기본적으로 값들 저장
	 * => heap 공간에는 빈 공간으로 존재 불가해 공간 만들어질때 JVM에 의해 자료형의 ex_)기본값 int [] 경우 0 으로 초기화됨
	 * - 단점 : 한번 지정한 배열의 크기 변경 불가 => 변경하고 싶다면 다시 만들어야함
	 */
	public static void main(String[] args) {
		// 정수형 배열 10크기 iArr 선언 및 할당
		int[] iArr = new int[10];
		// 실수형 배열 4크기 dArr 선언 및 할당
		double[] dArr = new double[4];
		
		for(int i=0; i<iArr.length; i++) {
			System.out.print(iArr[i]+ " ");
		}
		System.out.println("\n===================");
		
		for(int i=0; i<dArr.length; i++) {
			System.out.print(dArr[i]+ " ");
		}
		System.out.println("\n===================");
		
		System.out.println(iArr);
		System.out.println(iArr.hashCode());
		// 주소값의 10진수 형태
		
		int[] arr = null; // 아무것도 참조하지 않음
		// => 주소값을 가지는 참조변수의 기본값 null!
		System.out.println(arr);
		/*
		 * null값을 가지고 있는 참조변수에 접근, 다른 정보 얻을려고 하면 항상 오류 발생 
		 * => NullPointException
		 */
		// System.out.println(arr.hashCode());
		arr = new int[5];
		System.out.println(arr[4]);
		// System.out.println(arr[5]); Index 5 out of bounds for length 5 범위를 벗어나면 오류
		System.out.println(arr.hashCode());
		
		arr = new int[7];
		System.out.println(arr.hashCode());
		/*
		 * 연결이 끊어진 기존 배열은 heap 영역에서 둥둥 떠다님(참조되지 않아 필요없는 존재)
		 * => 일정 시간이 지나면 '가비지 콜렉터'가 알아서 제거
		 * --> 자바에서의 "자동 메모리 관리" 특징 -> 개발자 코드 작성에만 집중 가능
		 */
		//배열을 강제로 삭제시키고 한다면 연결을 끊어주면 됨(null대입)
		arr = null;
		System.out.println(arr);
		
		// 배열 선언, 할당, 초기화 전부 동시에 2가지 방법
		int[] arr2 = new int[] {1,2,3,4};
		int[] arr3 = {1,2,3,4};
		System.out.println(arr2 == arr3);
		// false 각각의 변수에 담겨있는 주소값을 비교함
	}

}
