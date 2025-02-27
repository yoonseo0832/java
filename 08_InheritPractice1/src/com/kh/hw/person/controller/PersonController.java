package com.kh.hw.person.controller;
import com.kh.hw.person.model.vo.Student;
import com.kh.hw.person.model.vo.Employee;
public class PersonController {
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
	public int[] personCount() {
		int studentCount = 0;
		int employeeCount = 0;
		
		for(int i=0; i<s.length; i++) {
			if(s[i]!=null) {
				studentCount++;
			}
		}
		for(int i=0; i<e.length; i++) {
			if(e[i]!=null) {
				employeeCount++;
			}
		}
		return new int[]{studentCount, employeeCount};
	}
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		for(int i =0; i<s.length; i++) {
			if(s[i]==null) {
				s[i] = new Student(name, age, height, weight, grade, major);
				return;
			}
		}
	}
	public Student[] printStudnet() {
		return s;
	}
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		for(int i =0; i<e.length; i++) {
			if(e[i]==null) {
				e[i] = new Employee(name, age, height, weight, salary, dept);
				return;
			}
		}
	}
	public Employee[] printEmployee() {
		return e;
	}
}
