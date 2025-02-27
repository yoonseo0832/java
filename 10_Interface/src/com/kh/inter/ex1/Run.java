package com.kh.inter.ex1;
import java.util.Scanner;

import com.kh.inter.ex1.Animal;
public class Run {
	public static void main(String[] args) {
		Animal[] aniArr = new Animal[3];
		for(int i =0;i<aniArr.length; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1. 고양이");
			System.out.println("2. 강아지");
			System.out.println("3. 토끼");
			System.out.print("번호 선택: ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1: 
				aniArr[i] = new Cat();
				break;
			case 2: 
				aniArr[i] = new Dog();
				break;
			case 3: 
				aniArr[i] = new Rabbit();
				break;
			}
		}
		//배열에 각 위치에 접근하여 move() 호출(단, 아기는 움직일수 없습니다.) 출력
		/*
		 * for(int i=0; i<aniArr.length; i++) {
			if(aniArr[i] instanceof Baby) {
				System.out.println("아기는 움직일 수 없습니다");
			}else {
				aniArr[i].move();
			}
		}
		 */
		for(Animal animal:aniArr) {
			if(animal instanceof Baby) {
				System.out.println("아기는 움직일 수 없습니다");
			}else {
				animal.move();
			}
		}
	}
}
