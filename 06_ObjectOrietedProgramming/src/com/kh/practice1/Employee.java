package com.kh.practice1;

public class Employee {
	private static int empNo;	// 사원 번호
	private String empName;	        // 사원명
	private String deptName;	// 부서명
	private int salary;		// 급여

	public Employee() {}
	public Employee(String empName, String deptName, int salary) {
		empNo++;
		this.empName = empName;
		this.deptName = deptName;
		this.salary = salary;
	}

	public Employee(String empName, int salary) {
		this.empName =empName;
		this.salary=salary;
		empNo++;
	}

	public int getEmpNo() {
		return empNo;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getSalary() {
		return this.salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	/**
		* 저장된 사원 정보를 출력하는 메소드
	*/
	public void printInfo() {
		String info = "[" + empNo + "] " + empName + ", " + deptName + ", " + salary;
		System.out.print(info); 
	}
}

