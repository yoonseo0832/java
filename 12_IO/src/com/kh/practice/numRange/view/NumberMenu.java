package com.kh.practice.numRange.view;

import com.kh.practice.numRange.controller.NumberController;
import com.kh.practice.numRange.exception.NumRangeException;
import java.util.Scanner;
public class NumberMenu {
	public void menu() {
		Scanner sc = new Scanner(System.in);
		NumberController nc = new NumberController(); 
		try {
			System.out.print("정수: ");
			int num1 = sc.nextInt();
			
			System.out.print("정수: ");
			int num2 = sc.nextInt();
			
			boolean result = nc.checkDouble(num1, num2);
			System.out.println(num1 + "은 " + num2 + "의 배수인가? " + result);
		}catch(NumRangeException e) {
            System.out.println(e.getMessage());
		}
		sc.close();
	}
}
