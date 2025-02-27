package com.kh.practice2.score.view;
import java.io.DataInputStream;
import java.util.Scanner;
import com.kh.practice2.score.controller.*;
public class ScoreMenu {
	
	private Scanner sc = new Scanner(System.in);
	private ScoreController scr = new ScoreController();
	
	public void mainMenu() {
		System.out.println("1. 성적 저장");// ➔ saveScore()
		System.out.println("2. 성적 출력"); //➔ readScore()
		System.out.println("9. 끝내기"); //➔ “프로그램을 종료합니다.” 출력 후 종료
		// 잘못 입력했을 경우 “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 반복
		System.out.print("메뉴 번호: ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1: saveScore(); break;
		case 2: readScore(); break;
		case 9: System.out.println("프로그램을 종료합니다."); break;
		default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); return;
		}
	}
	public void saveScore() {
		int num = 0; // 학생 숫자를 나타낼 변수
		while(true) {
			
			System.out.printf("%d번 째 학생 정보 기록", num);
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("국어 점수 :");
			int kor = sc.nextInt();
			System.out.print("영어 점수 :");
			int eng = sc.nextInt();
			System.out.print("수학 점수 :");
			int math = sc.nextInt();
			
			int sum = kor+eng+math; 
			double avg = sum/3;
			
			scr.saveScore(name, kor, eng, math, sum, avg);
			System.out.print("그만 입력하시려면 N 또는 n 입력, 계속 하시려면 아무 키나 입력하세요 : ");
			char ch = sc.next().charAt(0);
			while(true) {
				if(ch=='n'|| ch=='N') {
					return;
				}else if(!(ch=='n'|| ch=='N')){
					break;
				}
			}
		}

	}
	public void readScore() {
		int count = 0; // 몇 명의 학생인지(반복문이 몇 번 실행됐는지) 담을 변수
		int sumAll = 0;
		double avgAll = 0.0; // 모든 학생들의 합과 평균을 담을 변수
		
		DataInputStream dis = new DataInputStream(null){
			// scr의 readScore()의 반환 값을 DataInputStream에 담고 반복문을 이용하여
			 
		}
		scr.readScore();
		// 안에 들어가있는 데이터를 가지고 와서 출력
		// 모든 파일이 읽어졌을 때 나오는 EOFException을 이용하여
		// EOFException가 일어났을 때 읽은 회수, 전체 합계, 전체 평균 출력
	}
}
