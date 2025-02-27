package com.kh.hw.person.view;

import java.util.Scanner;
import com.kh.hw.person.controller.PersonController;

public class PersonMenu {
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();

	public void mainMenu() {
		int[] count = pc.personCount();
		System.out.println("최대 3명까지 저장할 수 있습니다.");
		System.out.printf("현재 저장된 학생은 %d명입니다.\n", count[0]);
		System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
		System.out.printf("현재 저장된 사원은 %d명입니다.\n",count[1]);
		System.out.println("1. 학생 메뉴"); // ➔ studentMenu()
		System.out.println("2. 사원 메뉴"); // ➔ employeeMenu()
		System.out.println("9. 끝내기"); // ➔ “종료합니다.” 출력 후 종료
		System.out.print("메뉴 번호 :");
		int menu = sc.nextInt();
		while (true) {
			switch (menu) {
			case 1:
				studentMenu();
				break;
			case 2:
				employeeMenu();
				break;
			case 9:
				System.out.print("종료합니다.");
				return;
			}
		}
	}

	public void studentMenu() {
		while (true) {
			System.out.println("1. 학생 추가");// ➔ insertStudent()
			System.out.println("2. 학생 보기");// ➔ printStudent()
			System.out.println("9. 메인으로");// ➔ “메인으로 돌아갑니다.” 출력 후 메인으로
			System.out.println("메뉴 번호 :");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				insertStudent();
				break;
			case 2:
				printStudent();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				return;
			}
		}
	}

	public void employeeMenu() {
		while (true) {
			System.out.println("1. 사원 추가");// ➔ insertStudent()
			System.out.println("2. 사원 보기");// ➔ printStudent()
			System.out.println("9. 메인으로");// ➔ “메인으로 돌아갑니다.” 출력 후 메인으로
			System.out.print("메뉴 번호 :");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				insertEmployee();
				break;
			case 2:
				printEmployee();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				return;
			}
		}
	}

	public void insertStudent() {
		System.out.print("학생 이름 : ");
		String n = sc.next();
		System.out.print("학생 나이: ");
		int a = sc.nextInt();
		System.out.print("학생 키 : ");
		double h = sc.nextDouble();
		System.out.print("학생 몸무게 : ");
		double w = sc.nextDouble();
		System.out.print("학생 학년 : ");
		int g = sc.nextInt();
		System.out.print("학생 전공 : ");
		String m = sc.next();

		pc.insertStudent(n, a, h, w, g, m);
		System.out.print("그만하시려면 (N/n)을 입력하세요, 이어하시려면 아무키나 눌러주세요.");
		char num = sc.next().charAt(0);
		if (num != 'n' && num != 'N') {
			return;
		}
	}

	public void printStudent() {
		pc.printStudnet();
	}

	public void insertEmployee() {
		System.out.print("사원 이름 : ");
		String n = sc.next();
		System.out.print("사원 나이: ");
		int a = sc.nextInt();
		System.out.print("사원 키 : ");
		double h = sc.nextDouble();
		System.out.print("사원 몸무게 : ");
		double w = sc.nextDouble();
		System.out.print("사원 월급 : ");
		int s = sc.nextInt();
		System.out.print("사원 부서 : ");
		String d = sc.next();
		pc.insertEmployee(n, a, h, w, s, d);
		System.out.print("그만하시려면 (N/n)을 입력하세요, 이어하시려면 아무키나 눌러주세요.");
		char num = sc.next().charAt(0);
		if (num != 'n' && num != 'N') {
			return;
		}
		
	}

	public void printEmployee() {
		pc.printEmployee();
	}

}
