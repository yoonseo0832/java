package com.kh.object.practice4.run;
import com.kh.object.practice4.model.vo.Student;
public class Run {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setGrade(60);
		s1.setClassroom(1);
		s1.setName("신지수");
		s1.setHeight(161);
		s1.setGender('여');
		s1.information();
	}

}
