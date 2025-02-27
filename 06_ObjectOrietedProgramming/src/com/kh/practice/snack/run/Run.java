package com.kh.practice.snack.run;
import java.util.Scanner;
import com.kh.practice.snack.model.vo.Snack;
import com.kh.practice.snack.view.SnackMenu;
import com.kh.practice.snack.controller.SnackController;
public class Run {
/*
 * MVC 
 * M(model) ; 데이터저장 용도 => Snack 클래스 담당
 * V(view) ; 화면 표시 용도 => SnackMenu 클래스  담당
 * C(controlller) ; 요청 받아 처리하는 용도 => SnackController 클래스 담당
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SnackMenu sm  = new SnackMenu();
		sm.menu();
	}

}
