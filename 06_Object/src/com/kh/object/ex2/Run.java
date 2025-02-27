package com.kh.object.ex2;
/*
 * *package 
 * : 클래스 간의 공간적 충돌이나 접근 방법의 충돌을 막기위해 저장 위치를 구분하여 명확히 접근할 수 있도록 하는 것
 * 
 * 보통 패키지명은 회사 도메인을 역으로 생성
 * ex) http://www.kh.com
 * 		=> com.kh.xxx(xxx=> 프로젝트명 또는 팀명)
 */

//Run 이라는 이름의 클래스는 객체를 생성하기 위한 목적아닌 main메소드를 통해 프로그램을 실행하기 위한 용도로 사용
public class Run {
/*
 * 객체지향언어: "객체"를 "지향"하는 언어로 "객체 중심으로" 돌아감
 * - 객체: 현실세계에서 독립적(목적이 있고, 가치가 있는)으로 존재하는 모든 것을 의미
 * 		  현실에서는 객체들 간의 상호작용으로 돌아감
 * - 객체지향 프로그램: 현실세계의 객체들간의 상호작용
 * 				-> 프로그래밍을 통해 가상세계로 효과적으로 구현한 것
 * 		=> 구현하고자하는 프로그램 상의 필요한 객체들을 만들기 위해(생성하기위해)
 * 			: 클래스라는 설계도가 필요 (클레스 => 객체들의 데이터를 담아낼 그릇같은 존재)
 * 		* 클래스 설계를 위한 작업 => 추상화 작업
 * 		[1] 내가 구현하고자 하는 프로그램에서 필요한 객체들을 생각해보기
 * 		[2] 객체들의 공통적인 속성(데이터), 기능(동작, 행위..)들을 추출하기
 * 		[3] 추출된 것들을 가지고 내가 구현할 프로그램에서 "실질적 목적"에 맞춰 불필요한 속성과 기능 제거
 * 		[4] 최종적으로 추려진 속성들과 어떤 자료형으로, 어떤 이름(변수명)으로 사용할 것인지 정의
 * 		
 * 		ex) 학생 관리 프로그램 
 * 		1) 학생 객체: 윤석준 학생, 김일현 학생, 이윤서 학생..
 * 		2) 공통적 속성, 기능(나열)
 *  		-> 이름, 나이, 키, 주소, 연락처, 학원을 다닌다, 밥을 먹는다, 공부한다, 등교한다,...
 *		3) 학생 인적사항 관리 프로그램: 이름, 나이, 주소, 연락처,...
 * 		   학생 성적관리 프로그램: 이름, 나이, 연락처, 과목별 점수,...
 * 		   학생 건강관리 프로그램: 이름, 나이, 연락처, 키, 몸무게, 먹는다, 휴식,...
 * 		- 목적에 따라 나열된 속성과 기능을 추린다
 * 		4) 이름, 나이, 키 정의
 * 		- 이름 => String name;
 * 		- 나이 => int age;
 * 		- 키  => double height;
 * 
 * 		*추상화 작업 후 프로그램에 적용
 * 		[1] "변수"만으로 프로그래밍을 한다면
 * 			- 변수: 하나의 자료형으로 하나의 값만 저장 가능
 * 			윤석준 학생 겍체 만들기-> String name1= "윤석준"; int age1= 20; double height1= 175;
 * 			김일현 학생 겍체 만들기-> String name2= "김일현"; int age2= 20; double height2= 174;
 * 
 * 		[2] "배열"을 사용해 프로그래밍한다면 
 * 			- 배열: 하나의 자료형으로 여러개의 값을 보관함
 * 			String[] name={"윤석준", "김일현"};
 * 			int[] age={"20", "19"};
 * 
 * 		[3] "구조체" 여러개의 자료형으로 여러개의 값들을 저장
 * 			Struct human{
 * 				String name;
 * 				int age;
 * 				double height;
 * 			}
 *  		// 문자열 값, 정수형 값, 동시에 실수형 값도 함께 보관 가능
 *  		자료형 직접 만든것 => 나만의 자료형
 *  
 *  		=> 자바에서는 구조체 개념을 좀 더 확장하여 클래스라는 개념을 만듬
 *  		class Student{
 *  			String name;
 * 				int age;
 * 				double height;
 * 				
 * 				// 기능..(메소드로 추가)
 *  		}
 */
	public static void main(String[] args) {
		// 정의한 Student 클래스 사용
		// 사용하려면 객체 생성!
		
		// 변수선언: 클래스명 변수명; // str1 => 참조변수 기본값 null값
		Student std1; // 선언만 하면 변수는 null값만 가짐
		 
		// 인스턴스 생성 및 할당: 변수명 = new 클래스명();  //클래스명()-> 생성자
		std1 = new Student();
		//인스턴스 변수에 접근: 참조변수명.인스턴스변수명
		std1.name = "이윤서";
		std1.age = 23;
		std1.height =158.4;

		// 선언과 할당 동시에
		Student std2 = new Student();
		std2.name = "최진용";
		std2.age = 20;
		std2.height =178.9;
		//인스턴스 메소드에 접근: 참조변수명.메소드명();
		std1.print();
		std2.print();
	}

}
