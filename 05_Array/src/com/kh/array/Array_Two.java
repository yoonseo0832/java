package com.kh.array;

public class Array_Two {
	/*
	 * 2차원 배열
	 * : 같은 자료형의 "1차원 배열의 묶음"으로, 배열안에 배열이 존재
	 * : 2차원 배열은 할당된 공간마다 인덱스 번호를 두개 부여
	 * ( 앞의 번호[] 몇번째 1차원 배열인지(행), 뒤의 번호는 1차원 배열에서 몇번째 데이터인지(열))
	 * 
	 * [선언-표현식] 자료형[][] 변수명(배열명);
	 * [할당-표현식] 변수명(배열명) = new 자료형[행크기][열크기]; 
	 * - 행크기: 1차원 배열의 개수 
	 * - 열크기: 1차원 배열의 길이(생략 가능-> 가변길이의 1차원 배열 할당)
	 * 
	 * 1차원 배열의 참조변수 묶음을 먼저 생성
	 * 변수명 = new 자료형[n][];
	 * 변수명[0] = new 자료형[x];
	 * 변수명[1] = new 자료형[y];
	 * 변수명[2] = new 자료형[z];
	 * ==> 1차우너 배열의 크기는 같을수도/다를수도 있음, 내맘대로 작성!
	 * 
	 * -선언 및 할당 동시 진행
	 * 자료형[][] 변수명 = new 자료형[행크기][열크기]
	 * 
	 * -값 대입
	 * 변수명[배열순번][인덱스] = 값; ex) arr[1][1] = 10;
	 */
	public static void main(String[] args) {
		//practice1();
		practice2();
	}
	public static void practice2() {
		// 선언과 동시에 초기화된 상태
		String[][] arr = {  {"(0행 0열)", "(0행 1열)", "(0행 2열)"},
							{"(1행 0열)", "(1행 1열)", "(1행 2열)"},
							{"(2행 0열)", "(2행 1열)", "(2행 2열)"}
						 };
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("==========================");
		
		//선생님버전
		String[][] data = new String[3][3];
		
		for(int i=0; i<data[0].length; i++) {
			data[0][i] ="(0행 "+ i+"열)";
		}
		for(int i=0; i<data[1].length; i++) {
			data[1][i] ="(1행 "+ i+"열)";
		}
		for(int i=0; i<data[2].length; i++) {
			data[2][i] ="(2행 "+ i+"열)";
		}
		for(int i=0; i<data.length; i++) {
			for(int j=0; j<data[i].length; j++) {
				data[i][j] = "("+i+"행 "+ j+ "열)";
			}

		}
		for(int i =0; i<data.length; i++) {
			for(int j=0; j<data[i].length; j++) {
				System.out.print(data[i][j]+ " ");
			}
			System.out.println();
		}
	}
	public static void practice1() {
		// 배열 선언, 정수형 2차원 배열 선언 이름 arr
		int[][] arr;
		// 배열 할당, 크기 4인 1차원 배열 3개 묶음
		//arr= new int[3][4];
		arr= new int[3][];
		/*
		arr[0] = new int[4];
		arr[1] = new int[4];
		arr[2] = new int[4];
		 */
		for(int i =0; i<arr.length; i++) {
			arr[i] = new int[4];
		}
		// 첫번째 1차원 배열에 값을 대입
		/*
		 * arr = { {10, 20, 30, 40},
		 * 		   {0, 0, 0, 0},
		 *         {0, 0, 0, 0}
		 *       }
		 */
		/*
		arr[0][0] =10;
		arr[0][1] =20;
		arr[0][2] =30;
		arr[0][3] =40;
		 */
		for(int i=0; i<arr[0].length; i++) {
			arr[0][i] = (i+1)*10;
		}
		for(int i =0; i<arr[0].length; i++) {
			System.out.print(arr[0][i] + " ");
		}
		System.out.println();
	}

}
