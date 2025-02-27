package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;
public class StudentMenu {
	private StudentController ssm = new StudentController();
	private Student scr = new Student();
	public StudentMenu() {
			System.out.println("========== 학생 정보 출력 ==========");
			System.out.println(ssm.printStudent());
			System.out.println("========== 학생 성적 출력 ==========");
			System.out.println("학생 점수 합계: "+ ssm.sumScore());
			System.out.println("학생 점수 평균: "+ ssm.avgScore());
			System.out.println("========== 성적 결과 출력 ==========");
			
			if(scr.getScore()<60) {
				System.out.printf("%s학생은 재시험 대상입니다\n", scr.getName());
			}else {
				System.out.printf("%s학생은 통과입니다\n", scr.getName());
			}
			
	}
}
