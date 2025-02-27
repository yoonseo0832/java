package com.kh.practice.point.view;

import java.util.Scanner;
import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();

	public void mainMenu() {
		while (true) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 원");
			System.out.println("2. 사각형 ");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 :");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				circleMenu();
				break;
			case 2:
				rectangleMenu();
				break;
			case 9:
				System.out.println("종료!");
				return; // 메소드를 종료시키는 것
			}

		}
	}

	public void circleMenu() {
		System.out.println("===== 원 메뉴 =====");
		System.out.println("1. 원 둘레");
		System.out.println("2. 원 넓이 ");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 :");
		int menu = sc.nextInt();
		switch (menu) {
		case 1:
			calcCircum();
			break;
		case 2:
			calcCircleArea();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다");
			return;
		default:
			System.out.println("잘못된 입력입니다, 메인으로 돌아갑니다");
			break;
		}
	}

	public void rectangleMenu() {
		System.out.println("===== 직사각형 메뉴 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 넓이 ");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 :");
		int menu = sc.nextInt();
		switch (menu) {
		case 1:
			calcPerimeter();
			break;
		case 2:
			calcRectArea();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다");
			return;
		default:
			System.out.println("잘못된 입력입니다, 메인으로 돌아갑니다");
			return;
		}
	}

	public void calcCircum() {
		System.out.print("x좌표: ");
		int x = sc.nextInt();
		System.out.print("y좌표: ");
		int y = sc.nextInt();
		System.out.print("반지름: ");
		int r = sc.nextInt();
		String info = cc.calcCircum(x, y, r);
		System.out.println(info);
	}

	public void calcCircleArea() {
		System.out.print("x좌표: ");
		int x = sc.nextInt();
		System.out.print("y좌표: ");
		int y = sc.nextInt();
		System.out.print("반지름: ");
		int r = sc.nextInt();
		String info = cc.calcCircleArea(x, y, r);
		System.out.println(info);
	}

	public void calcPerimeter() {
		System.out.print("x좌표: ");
		int x = sc.nextInt();
		System.out.print("y좌표: ");
		int y = sc.nextInt();
		System.out.print("넓이: ");
		int w = sc.nextInt();
		System.out.print("높이: ");
		int h = sc.nextInt();
		String info = rc.calcPerimeter(x, y, w, h);
		System.out.println(info);
	}

	public void calcRectArea() {
		System.out.print("x좌표: ");
		int x = sc.nextInt();
		System.out.print("y좌표: ");
		int y = sc.nextInt();
		System.out.print("넓이: ");
		int w = sc.nextInt();
		System.out.print("높이: ");
		int h = sc.nextInt();
		String info = rc.calcArea(x, y, w, h);
		System.out.println(info);
	}
}
