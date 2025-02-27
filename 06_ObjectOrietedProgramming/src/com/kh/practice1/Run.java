package com.kh.practice1;
import com.kh.practice1.Employee;
public class Run {

	public static void main(String[] args) {
		Employee emp1 = new Employee("홍길동", 3000);
		emp1.printInfo();
		// =>  예상 출력 결과 ?
		//[1] 홍길동, null, 3000
		System.out.println();
		Employee emp2 = new Employee();
		emp2.printInfo();
		// => 예상 출력 결과 ?
		//error 기본 생성자 없어서 컴파일 오류
	}

}
