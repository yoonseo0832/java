package com.kh.loop.practice;
import java.util.Scanner;
public class LoopPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//practice0();
		//practice1();
		//practice2();
		//practice3();
		//practice4();
		//practice5();
		//practice6();
		//practice7();
		//practice8();
		//practice9();
		//practice10();
		//practice11();
		//practice12();
		//method1();
		teacherversion(); 
	}
	public static void teacherversion() {
		Scanner sc = new Scanner(System.in);
		System.out.print("10 이상의 숫자를 입력 : ");
	    int num = sc.nextInt();
	    for(;num!=0;) {
	    	System.out.print(num%10);
		    num/=10;
	    }
	    while(num!=0) {
	    	System.out.print(num%10);
		    num/=10;

	    }
	}
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("10 이상의 숫자를 입력 : ");
	    int num = sc.nextInt();
	    int reverse = 0;
	   
	    while(num!=0) {
	    	int digit = num%10;
	    	reverse = reverse * 10 + digit;
	    	num/=10;
	    }
	    System.out.println("while문 num값: "+num);
	    System.out.println("while문 reverse값: "+reverse);
	    
	}
	public static void practice12() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("연산자(+, -, *, /, %): ");
			String calc = sc.next();
			System.out.print("정수1: ");
			int n1 = sc.nextInt();
			System.out.print("정수2: ");
			int n2 = sc.nextInt();
			final String exit = "exit";
			if(n1>1 && n2>1) {
				switch(calc) {
				case "+":
					System.out.printf("%d %s %d = %d", n1, calc, n2, n1+n2);
				case "-":
					System.out.printf("%d %s %d = %d", n1, calc, n2, n1-n2);
				case "*":
					System.out.printf("%d %s %d = %d", n1, calc, n2, n1*n2);
				case "/":
					System.out.printf("%d %s %d = %d", n1, calc, n2, n1/n2);
				case "%":
					System.out.printf("%d %s %d = %d", n1, calc, n2, n1%n2);
				}
			}else if(calc.equals(exit)){
				System.out.print("프로그램을 종료합니다.");
				break;
			}else{
				System.out.print("0으로 나눌 수 없습니다. 다시 입력해주세요.");
			}
		}while(true);
	}
	public static void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자: ");
		int n= sc.nextInt();
		System.out.print("공차: ");
		int gongcha = sc.nextInt();
	
		
	}
	public static void practice10() {
		int dan;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("숫자: ");
			dan = sc.nextInt();
			if(dan>=1 && dan<=9) {
				System.out.printf("======%d======\n", dan);
				for(int i=1; i<=9; i++) {
					System.out.printf("%d * %d = %d\n", dan, i, dan*i);
				}
			}else{
				System.out.println("1 이상의 숫자를 입력해주세요");
			}
		}while(1>dan||dan<11);
	}
	public static void practice9() {
		int dan;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("숫자: ");
			dan = sc.nextInt();
			if(dan>=1 && dan<=9) {
				System.out.printf("======%d======\n", dan);
				for(int i=1; i<=9; i++) {
					System.out.printf("%d * %d = %d\n", dan, i, dan*i);
				}
			}else{
				System.out.println("1 이상의 숫자를 입력해주세요");
				break;
			}
		}while(1>dan||dan<11);
	}
	public static void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자: ");
		int dan = sc.nextInt();
		System.out.printf("======%d======\n", dan);
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
	}
	public static void practice7() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("첫번째 정수: ");
			int n1 = sc.nextInt();
			System.out.print("두번째 정수: ");
			int n2 = sc.nextInt();
			
			if(n1<1 || n2<1){
				System.out.println("1 이상의 숫자를 입력해주세요");
			}else if(n1>n2) {
				for(int i=n2; i<=n1; i++) {
					System.out.print(i+ " ");
				}
			}else{
				for(int i=n1; i<=n2; i++) {
					System.out.print(i+ " ");
				}
			}
		}while(true);
	}
	public static void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수: ");
		int n1 = sc.nextInt();
		System.out.print("두번째 정수: ");
		int n2 = sc.nextInt();
		if(n1>n2) {
			for(int i=n2; i<=n1; i++) {
				System.out.print(i+ " ");
			}
		}else {
			for(int i=n1; i<=n2; i++) {
				System.out.print(i+ " ");
			}
		}
	}
	public static void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요: ");
		int n = sc.nextInt();
		
		int total=0;
		
		for(int i=1; i<=n; i++) {
			total+=i;
			if(i==1) {
				System.out.print(i);
			}else {
				System.out.print(" + "+i);
			}
		}System.out.print(" = "+ total);
	}
	public static void practice4() {
		Scanner sc = new Scanner(System.in);
		int num;
		do{
			System.out.print("1이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();
			if(num>=1) {
				for(int i=num; i>=1; i--) {
					System.out.print(i+" ");
				}
			}else {
				System.out.println("1 이상의 숫자를 입력해주세요");
			}
		}while(num<1);
	}
	public static void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		if(num>=1) {
			for(int i=num; i>=1; i--) {
				System.out.print(i+" ");
			}
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요");
		}
	}
	public static void practice2() {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			n = sc.nextInt();
		
			if(n>=1) {
				for(int i=1; i<=n; i++) {
					System.out.print(i+" ");
				}
			}else{
				System.out.print("1 이상의 숫자를 입력해주세요");
			}
		}while(n<1);
	}
	public static void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int n1 = sc.nextInt();
		if(n1<1) {
			System.out.print("1 이상의 숫자를 입력해주세요");
		}else{
			for(int i=1; i<=n1; i++) {
				System.out.print(i+" ");
			}
		}
	}
	public static void practice0() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int n = sc.nextInt();
		
		if(n>=1) {
			for(int i=1; i<=n; i++) {
				System.out.print(i+" ");
			}
		}else {
			System.out.print("1 이상의 숫자를 입력해주세요");
		}
	}
}
