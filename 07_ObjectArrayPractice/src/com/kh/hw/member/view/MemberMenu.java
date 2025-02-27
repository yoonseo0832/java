package com.kh.hw.member.view;
import java.util.Scanner;
import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;
public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public MemberMenu() {}
	
	public void mainMenu() {
		while(true) {
			System.out.println("최대 등록 가능한 회원수는 "+mc.SIZE+"명입니다.");
			// MemberController.SIZE 로도 접근 가능
			int existNumber = mc.existMemberNum();
			System.out.println("현재 등록된 회원수는 "+existNumber+"명입니다.");
			if(existNumber<10) {
				System.out.println("1. 새 회원 등록");
			}
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호: ");
			
			int selMenu = sc.nextInt();
			switch(selMenu) {
			case 1: 
				insertMember();
				break;
			case 2: 
				searchMember();
				break;
			case 3: 
				updateMember();
				break;
			case 4: 
				deleteOne();
				break;
			case 5: 
				printAll();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다");
				return;
			default: 
				System.out.println("잘못된 입력입니다, 다시 입력해주세요");
			}
		}
		// 아래의 내용은 회원의 수 상관없이 모두 출력해야되서 조건문 밖에 위치해
	}
	
	public void insertMember() {
		// 아이디의 경우 중복 검사하고 중복되면 다시 입력받게 하고 중복 아니면 이름을 입력받도록
		/*
		 * do{
			System.out.print("아이디: ");
			id = sc.next();
			if(mc.checkId(id)) {
				System.out.println("중복된 아이디입니다, 다시 입력해주세요");
			}
		}while(mc.checkId(id));
		 */
		String id=null;
		System.out.println("회원을 등록합니다.");
		 while(true) {
			System.out.print("아이디: ");
			id = sc.next();
			if(mc.checkId(id)) {
				System.out.print("중복된 아이디입니다, 다시 입력해주세요");
				continue;
			}else {
				break;
			}
		}
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("비밀번호: ");
		String password = sc.next();
		System.out.print("이메일: ");
		String email = sc.next();
		char gender='\0';//기본값
		while(true) {
			System.out.print("성별(F/M): ");
			gender = sc.next().charAt(0);
			if(gender != 'm'&& gender!='M' && gender != 'f' && gender!='F') {
				System.out.println("성별을 다시 입력해주세요");
			}else {
				break; // M 또는 F입력시 종료(소문자도 포함)
			}
		}
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		mc.insertMember(id, name, password, email, gender, age);
		
	}
	
	public void searchMember() {
		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기"); 
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.println("번호: ");
		int selMenu = sc.nextInt();
		switch(selMenu) {
		case 1: 
			searchId();
			break;
		case 2: 
			searchName();
			break;
		case 3: 
			searchEmail();
			break;
		case 9: 
			System.out.println("메인으로 돌아갑니다");
			return; // 메소드 종료 => 호출된 위치로 돌아감(mainMenu()로 돌아감!) 메소드 종료는 return문으로 
		default:
			System.out.println("잘못 입력하였습니다");
			break; // 메소드 종료이자 switch문 종료 => return 과 동일하게 mainMenu()로 돌아감
		}
	}
	public void searchId() {
		System.out.print("검색할 아이디: ");
		String keyword = sc.next();
		String info = mc.searchId(keyword); // 매개변수로 넘기는 것
		if(info==null) {
			//검색 결과가 없으면 null값임
			System.out.println("검색 결과가 없습니다.");
		}else {
			//검색 결과가 있으면 출력
			System.out.println("찾으신 회원 조회 결과입니다.");
			// 회원 검색 결과 출력하는 방법
			System.out.println(info);
		}
	}
	
	public void searchName() {}
	
	public void searchEmail() {}
	
	public void updateMember() {
		System.out.println("1. 비밀번호 수정하기");
		System.out.println("2. 이름 수정하기"); 
		System.out.println("3. 이메일로 수정하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.println("번호: ");
		int selMenu = sc.nextInt();
		switch(selMenu) {
		case 1: 
			updatePassword();
			break;
		case 2: 
			updateName();
			break;
		case 3: 
			updateEmail();
			break;
		case 9: 
			System.out.println("메인으로 돌아갑니다");
			return; 
		default:
			System.out.println("잘못 입력하였습니다");
			break; 
		}
	}
	
	public void updatePassword() {
		// 결과 값이 false인 경우 존재하지 않는 아이디, true인 경우 수정이 성공적으로 완료되었습니다
		System.out.print("수정할 회원의 아이디: ");
		String id = sc.next();
		System.out.print("수정할 회원의 비밀번호: ");
		String pwd = sc.next();
		
		//입력받은 데이터를 mc의 updatePassword() 메소드의 매개변수로 넘김
		boolean isUpdate = mc.updatePassword(id, pwd);
		
		//결과 true인경우
		if(isUpdate) {
			System.out.println("수정이 성공적으로 완료되었습니다");
			return;
		}else {
			System.out.println("존재하지 않는 아이디입니다");
			return;
		}
	}
	
	public void updateName() {
	}
	
	public void updateEmail() {}
	
	public void deleteMember() {}
	
	public void deleteOne() {
		System.out.print("삭제할 회원의 아이디: ");
		String id = sc.next();
		System.out.print("정말 삭제를 원하십니까(y/n): ");
		char ans = sc.next().charAt(0);
		if(ans=='y'||ans=='Y') {
			boolean isDeleted = mc.delete(id);
			if(isDeleted) {
				System.out.println("성공적으로 삭제가 완료되었습니다");
			}else {
				System.out.println("존재하지 않는 아이디입니다.");
			}
		}
	}
	
	public void deleteAll() {}
	
	public void printAll()	{
		Member[] memberList = mc.printAll();
		if(mc.existMemberNum()==0) {
			System.out.println("저장된 회원이 없습니다");
		}else {
			for(Member m : memberList) {
				if(m!=null) {
					System.out.println(m.inform());
					// String info = m.inform();
					// System.out.println(info);  //변수에 대입해 출력하는 방식
				}
			}
		}
	}
	public void printAll_() {
		Member[] memberList = mc.printAll();
		if(mc.existMemberNum() ==0) {
			System.out.println("저장된 회원이 없습니다");
		}else {
			for(Member m : memberList) {
				System.out.println(m.inform());
			}
		}
	}
}
