package com.kh.hw.member.controller;
import java.util.Scanner;
import com.kh.hw.member.model.vo.Member;

public class MemberController {
	private Member[] m = new Member[SIZE];
	public static final int SIZE = 10;
	/**
	 * 등록된 회원 정보 수를 반환 메소드
	 * 배열의 요소 중 null값이 아닌 요소의 개수
	 * @return
	 */
	public int existMemberNum() {
		int num=0;
		for(int i=0; i<m.length;i++) {
			if(m[i]!=null) {
				num++;
			}
		}
		return num;
	}
	public boolean checkId(String inputId) {
		return false;
	}
	/** 주석을 사용 가능 
	 * 멤버 객체를 객체배열에 저장하는 메소드
	 * @param id 아이디
	 * @param name 이름
	 * @param password 비밀번호
	 * @param email 이메일
	 * @param gender 성별
	 * @param age 나이
	 */
	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		// 객체 배열
		for(int i=0; i<m.length; i++) {
			if(m[i]==null) {
				//멤버 객체 생성 후 i번째 위치에 저장
				m[i] = new Member(id, name, password, email, gender, age);
				break; // 반복문 종료 
			}
		}
		
	}
	/**
	 * id로 회원을 조회하는 메소드
	 * @param id 아이디
	 * @return
	 */
	public String searchId(String id) {
		String info = null;
		for(int i=0; i<m.length; i++) {
			//i번째 위치의 객체가 생성되었는지 null값으로 비교 및 체크
			if(m[i]!=null) {
				// 해당 객체의 id값을 조회 매개변수로 받은 id값과 비교(문자열.equals()메서드 사용)
				if(id.equals(m[i].getId())) {
					// id값이 같은 경우, 해당 객체의 inform 메서드를 통해 회원정보를 반환
					info = m[i].inform();
					break; // 반복문 종료
				}
			}
		}
		return info;
	}
	public Member[] searchName(String name) {
		return null;
	}
	public Member[] searchEmail(String email) {
		return null;
	}
	/**
	 * 비밀번호 변경 메소드
	 * @param id 아이디
	 * @param password 비밀번호
	 * @return
	 */
	public boolean updatePassword(String id, String password) {
		// 배열의 인덱스로 접근 -> 반복문
		boolean result=false;
		for(int i=0; i<m.length; i++) {
			//객체 생성 여부 확인으로 null값으로 비교
			if(m[i]!=null) {
				if(m[i].getId().equals(id)) {
					m[i].setPass(password); //전달받은 비밀번호를 객체의 password 필드에 저장(변경)
					result= true;
					break;
				}
			}
		}
		return result;
	}
	public boolean updateName(String id, String name) {
		return true;
	}
	public boolean updateEmail(String id, String email) {
		return true;
	}
	/**
	 * 한 회원만 삭제하는 메소드
	 * @param id 아이디
	 * @return
	 */
	public boolean delete(String id) {
		boolean result = false;
		for(int i=0; i<m.length; i++) {
			if(m[i] !=null) {
				if(m[i].getId().equals(id)) {
					m[i].setId(null);
					result = true;
					break;
				}
			}
		}
		return result;
	}
	public void delete() {
		for(int i=0; i<m.length; i++) {
			m[i] = null;
		}
	}
	// 저장된 회원 목록을 출력
	public Member[] printAll() {
		return m;
	}
	public Member[] printAll_1() {
		// 저장된 회원 목록에 대한 배열을 만들어서 반환!
		//return m; => 회원 정보 출력 시 null 체크해야함
		Member[] mList = new Member[m.length];
		//새로운 배열에 null이 아닌 값으로 복사
		for(int i=0; i<m.length;i++) {
			if(m[i]!=null) {
				
				for(int j=0; j<mList.length;j++) {
					if(mList[j]==null) {
						//대입할때는 null일때 추가함
						mList[j]=m[i];
						break;
					}
				}
			}
		}
		//새로운 배열의 null 값을 가진 위치 전까지만 반환?
		int idx = -1;
		for(int i=0; i<mList.length; i++) {
			if(mList[i]==null) {
				idx = i;
				break;
			}
		}
		//idx가 -1보다 큰 경우, 새로운 배열을 할당
		if(idx>-1) {
			Member[] copy = new Member[idx];
			System.arraycopy(mList, 0, copy, 0, idx);
			mList = copy;
		}else {
			mList = new Member[0];
		}
		return mList;
	}
}
